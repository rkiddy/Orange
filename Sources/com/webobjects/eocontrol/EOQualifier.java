package com.webobjects.eocontrol;
/**
 * EOQualifier is an abstract class for objects that hold information used to restrict selections on objects or database rows according to specified criteria. With the exception of EOSQLQualifier (EOAccess), qualifiers aren't based on SQL and they don't rely upon an EOModel (EOAccess). Thus, the same qualifier can be used both to perform in memory searches and to fetch from the database.
 * You never instantiate an instance of EOQualifier. Rather, you use one of its subclasses, your own custom EOQualifier subclasses, or one of the following classes:
 * Subclass Purpose EOKeyValueQualifier Compares the named property of an object to a supplied value, for example , weight 150. EOKeyComparisonQualifier Compares the named property of one object with the named property of another, for example name = wife.name. EOAndQualifier Contains multiple qualifiers, which it conjoins. For example, name = 'Fred' AND age 20. EOOrQualifier Contains multiple qualifiers, which it disjoins. For example, name = 'Fred' OR name = 'Ethel'. EONotQualifier Contains a single qualifier, which it negates. For example, NOT (name = 'Fred'). EOSQLQualifier Contains unstructured text that can be transformed into a SQL expression. EOSQLQualifier provides a way to create SQL expressions with any arbitrary SQL. Because EOSQLQualifiers can't be evaluated against objects in memory and because they contain database and SQL specific content, you should use EOQualifier wherever possible.
 * The interface EOQualifierEvaluation defines how qualifiers are evaluated in memory. To evaluate qualifiers in a database, methods in EOSQLExpression (EOAccess) and EOEntity (EOAccess) are used to generate SQL for qualifiers. Note that all of the SQL generation functionality is contained in the access layer.
 * As described above, there are several EOQualifier subclasses, each of which represents a different semantic. However, in most cases you simply create a qualifier using the EOQualifier static method qualifierWithQualifierFormat , as follows:
 * The qualifier or group of qualifiers that result from such a statement is based on the contents of the format string you provide. For example, giving the format string lastName = 'Smith' as an argument to qualifierWithQualifierFormat returns an EOKeyValueQualifier object. But you don't normally need to be concerned with this level of detail.
 * The format strings you use to create a qualifier can be compound logical expressions, such as firstName = 'Fred' AND age 20 . When you create a qualifier, compound logical expressions are translated into a tree of EOQualifier nodes. Logical operators such as AND and OR become EOAndQualifiers and EOOrQualifiers, respectively. These qualifiers conjoin (AND) or disjoin (OR) a group of sub qualifiers.
 * As described above, you typically create a qualifier from a format string by using qualifierWithQualifierFormat. This method takes as an argument a format string vaguely similar to the standard C printf() function. The format string can embed strings, numbers, and other objects using the conversion specification %@. The second argument to qualifierWithQualifierFormat is an array that contains the value or result to substitute for any %@ conversion specifications. This allows qualifiers to be built dynamically. The following table lists the conversion specifications you can use in a format string and their corresponding data types.
 * If you use an unrecognized character in a conversion specification (for example, %x), an exception is thrown.
 * For example, suppose you have an Employee entity with the properties empID, firstName, lastName, salary, and department (representing a to-one relationship to the employee's department), and a Department entity with properties deptID, and name. You could construct simple qualifier strings like the following:
 * The following examples build qualifiers similar to the qualifier strings described above, but take the specific values from already fetched enterprise objects:
 * The enterprise objects here implement methods for directly accessing the given attributes: lastName and salary for Employee objects, and name for Department objects. Note that unlike a string literal, the %@ conversion specification is never surrounded by single quotes:
 * Typically format strings include only two data types: strings and numbers. Single quoted or double quoted strings correspond to String objects in the argument array, non quoted numbers correspond to Numbers, and non quoted strings are keys. You can get around this limitation by performing explicit casting.
 * The operators you can use in constructing qualifiers are =, ==, !=, , , =, =, like, and caseInsensitiveLike. The like and caseInsensitiveLike operators can be used with wildcards to perform pattern matching,
 * To construct a qualifier that fetches rows matching NULL, you can use either of the approaches shown in the following example:
 * When you use the like or caseInsensitiveLike operator in a qualifier expression, you can use the wildcard characters and ? to perform pattern matching, for example:
 * matches Jones, Johnson, Jolsen, Josephs, and so on.
 * The ? character just matches a single character, for example:
 * matches Jones.
 * The asterisk character ( ) is only interpreted as a wildcard in expressions that use the like or caseInsensitiveLike operator. For example, in the following statement, the character * is treated as a literal value, not as a wildcard:
 * The format strings you use to initialize a qualifier can include methods. The parser recognizes an unquoted string followed by a colon (such as myMethod: ) as a method. For example:
 * The method signature of the embedded selector (isAnagramOfString in this example must be:
 * You can also pass an Object rather than a String. If you pass an Object, the invocation is wrapped in an exception handler and returns false unless you return a Boolean.
 * Methods specified in a qualifier are parsed and applied only in memory; that is, they can't be used in to qualify fetches in a database.
 * You rarely need to explicitly create an instance of EOAndQualifier, EOOrQualifier, or EONotQualifier. However, you may want to create instances of EOKeyValueQualifier and EOKeyComparisionQualifier. The primary advantage of this is that it lets you exercise more control over how the qualifier is constructed.
 * If you want to explicitly create a qualifier subclass, you can do it using code such as the following excerpt, which uses EOKeyValueQualifier to select all objects whose isOut key is equal to 1 (meaning true). In the excerpt, the qualifier is used to filter an in memory array.
 * filteredArrayWithQualifier is a method that returns an array containing objects from the provided array that match the provided qualifier.
 * A custom subclass of EOQualifier must implement the EOQualifierEvaluation interface if they are to be evaluated in memory.
 * See Also:Serialized Form
 */
public abstract class EOQualifier implements java.io.Serializable, com.webobjects.eocontrol.EOQualifierEvaluation{
    /**
     * One of the possible values of selector.
     */
    public static final com.webobjects.foundation.NSSelector QualifierOperatorCaseInsensitiveLike=null;

    /**
     * One of the possible values of selector.
     */
    public static final com.webobjects.foundation.NSSelector QualifierOperatorContains=null;

    /**
     * One of the possible values of selector.
     */
    public static final com.webobjects.foundation.NSSelector QualifierOperatorEqual=null;

    /**
     * One of the possible values of selector.
     */
    public static final com.webobjects.foundation.NSSelector QualifierOperatorGreaterThan=null;

    /**
     * One of the possible values of selector.
     */
    public static final com.webobjects.foundation.NSSelector QualifierOperatorGreaterThanOrEqualTo=null;

    /**
     * One of the possible values of selector.
     */
    public static final com.webobjects.foundation.NSSelector QualifierOperatorLessThan=null;

    /**
     * One of the possible values of selector.
     */
    public static final com.webobjects.foundation.NSSelector QualifierOperatorLessThanOrEqualTo=null;

    /**
     * One of the possible values of selector.
     */
    public static final com.webobjects.foundation.NSSelector QualifierOperatorLike=null;

    /**
     * One of the possible values of selector.
     */
    public static final com.webobjects.foundation.NSSelector QualifierOperatorNotEqual=null;

    public EOQualifier(){
         //TODO codavaj!!
    }

    /**
     * Adds the receiver's qualifier keys to qualifierKeys. The subclasses in the EOControl framework do this by traversing the tree of qualifiers. Node qualifiers (such as EOAndQualifier) recursively invoke this method until they reach a leaf qualifier (such as EOKeyValueQualifier) which adds its key to the set.
     * Subclasses of EOQualifier must implement this method.
     */
    public abstract void addQualifierKeysToSet(com.webobjects.foundation.NSMutableSet qualifierKeys);

    /**
     * Returns an NSSet of strings, which are the left hand sides of all the qualifiers in the receiver. For example, if you have a qualifier salary
     * 10000 AND manager.lastName = 'smith' allQualifierKeys returns an array containing the stringssalary andmanager.lastName. Subclasses should not override this method, instead they should override addQualifierKeysToSet.
     */
    public com.webobjects.foundation.NSSet allQualifierKeys(){
        return null; //TODO codavaj!!
    }

    /**
     * Returns an NSArray containing all of the operators supported by EOQualifier. These are: =, !=,
     * ,
     * =,
     * ,
     * =, like, and caseInsensitiveLike.
     */
    public static com.webobjects.foundation.NSArray allQualifierOperators(){
        return null; //TODO codavaj!!
    }

    /**
     * Returns an array of strings which are the names of the known variables. Multiple occurrences of the same variable will only appear once in this list.
     */
    public com.webobjects.foundation.NSArray bindingKeys(){
        return null; //TODO codavaj!!
    }

    /**
     * Returns an exact replica of the receiver.
     */
    public java.lang.Object clone(){
        return null; //TODO codavaj!!
    }

    /**
     * Implemented by subclasses to return true if object matches the criteria specified in the receiver, false otherwise. The argument, object, should be an enterprise object, a snapshot dictionary, or something that implements key-value coding.
     */
    public boolean evaluateWithObject(java.lang.Object object){
        return false; //TODO codavaj!!
    }

    /**
     * Filters array in place so that it contains only objects matching qualifier.
     */
    public static void filterArrayWithQualifier(com.webobjects.foundation.NSMutableArray array, com.webobjects.eocontrol.EOQualifier qualifier){
        return; //TODO codavaj!!
    }

    /**
     * Returns a new array that contains only the array from objects matching qualifier.
     */
    public static com.webobjects.foundation.NSArray filteredArrayWithQualifier(com.webobjects.foundation.NSArray array, com.webobjects.eocontrol.EOQualifier qualifier){
        return null; //TODO codavaj!!
    }

    /**
     * Returns a string which is the left hand side of the variable in the qualifier. If you have a qualifier salary
     * $amount and manager.lastName = $manager, then calling bindingKeys would return the array (amount,manager). Calling keyPathForBindingKey would return salary for amount, and manager.lastname for manager.
     */
    public java.lang.String keyPathForBindingKey(java.lang.String key){
        return null; //TODO codavaj!!
    }

    /**
     * Returns a named operator selector.
     */
    protected static com.webobjects.foundation.NSSelector operatorSelectorForSelectorNamed(java.lang.String string){
        return null; //TODO codavaj!!
    }

    /**
     * Returns an operator selector based on the string string. This method is used in parsing a qualifier. For example, the following statement returns the selector QualifierOperatorNotEqual.
     * blockquote
     * Selector selector = Qualifier.operatorSelectorForString(!=);
     * /blockquote
     * The possible values of aString are =, ==, !=,
     * ,
     * ,
     * =,
     * =,"like", and "caseInsensitiveLike". You would probably only use this method if you were writing the own qualifier parser.
     */
    public static com.webobjects.foundation.NSSelector operatorSelectorForString(java.lang.String string){
        return null; //TODO codavaj!!
    }

    /**
     * Takes a dictionary of search criteria, from which the method creates EOKeyValueQualifiers (one for each dictionary entry). The method ANDs these qualifiers together, and returns the resulting EOAndQualifier.
     */
    public static com.webobjects.eocontrol.EOQualifier qualifierToMatchAllValues(com.webobjects.foundation.NSDictionary values){
        return null; //TODO codavaj!!
    }

    /**
     * Takes a dictionary of search criteria, from which the method creates EOKeyValueQualifiers (one for each dictionary entry). The method ORs these qualifiers together, and returns the resulting EOOrQualifier.
     */
    public static com.webobjects.eocontrol.EOQualifier qualifierToMatchAnyValue(com.webobjects.foundation.NSDictionary values){
        return null; //TODO codavaj!!
    }

    /**
     * Returns a new qualifier substituting all variables with values found in bindings. If requiresAll is true, any variable not found in bindings throws an exception. If requiresAll is false, missing variable values cause the qualifier node to be pruned from the tree.
     */
    public abstract com.webobjects.eocontrol.EOQualifier qualifierWithBindings(com.webobjects.foundation.NSDictionary bindings, boolean requiresAll);

    /**
     * Parses the format string format and the specified arguments, uses them to create an EOQualifier, and returns the EOQualifier. Conversion specifications (occurrences of %@) in qualifierFormat are replaced using the value objects in arguments.
     * Based on the content of format, this method generates a tree of the basic qualifier types. For example, the format string firstName = 'Joe' AND department = 'Facilities' generates an EOAndQualifier that contains twosub EOKeyValueQualifiers. The following code excerpt shows a typical way to use the qualifierWithQualifierFormat method. The excerpt constructs an EOFetchSpecification, which includes an entity name and a qualifier. It then applies the EOFetchSpecification to the EODisplayGroup's data source and tells the EODisplayGroup to fetch. blockquote EODisplayGroup displayGroup; //Assume this exists. EOQualifier qualifier; EOFetchSpecification fetchSpec; EODatabaseDataSource dataSource; dataSource = (EODatabaseDataSource)displayGroup.dataSource(); qualifier = EOQualifier.qualifierWithQualifierFormat(cardType = 'Visa', null); fetchSpec = new EOFetchSpecification(Member, qualifier, null), null); dataSource.setFetchSpecification(fetchSpec); displayGroup.fetch(); /blockquote qualifierWithQualifierFormat performs no verification to ensure that keys referred to by the format string format exist. It throws an exception if format contains any syntax errors.
     */
    public static com.webobjects.eocontrol.EOQualifier qualifierWithQualifierFormat(java.lang.String format, com.webobjects.foundation.NSArray arguments){
        return null; //TODO codavaj!!
    }

    /**
     * Returns an NSArray containing all of the relational operators supported by EOQualifier. These are: =, !=,
     * ,
     * =,
     * , and
     * =. In other words, returns all of the EOQualifier operators except for the ones that work exclusively on strings: "like" and "caseInsensitiveLike".
     */
    public static com.webobjects.foundation.NSArray relationalQualifierOperators(){
        return null; //TODO codavaj!!
    }

    /**
     * Returns a string representation of the selector selector. For example, the following statement returns the string!=:
     * blockquote
     * String operator = EOQualifier.stringForOperatorSelector(EOQualifier.QualifierOperatorNotEqual);
     * /blockquote
     * The possible values for selector are as follows: QualifierOperatorEqual QualifierOperatorNotEqual QualifierOperatorLessThan QualifierOperatorGreaterThan QualifierOperatorLessThanOrEqualTo QualifierOperatorGreaterThanOrEqualTo QualifierOperatorContains QualifierOperatorLike QualifierOperatorCaseInsensitiveLike
     * You would probably use this method only if you were writing your own parser.
     */
    public static java.lang.String stringForOperatorSelector(com.webobjects.foundation.NSSelector selector){
        return null; //TODO codavaj!!
    }

    /**
     * Ensures that the receiver contains keys and key paths that belong to or originate from classDescription. This method raises an exception if an unknown key is found, otherwise it returns null to indicate that the keys contained by the qualifier are valid.
     */
    public abstract void validateKeysWithRootClassDescription(com.webobjects.eocontrol.EOClassDescription classDescription);

    /**
     * The EOQualifierComparison interface defines methods for comparing values. These methods are used for evaluating qualifiers in memory.
     * In Java Client, support for these methods is provided for String, Number, and Date using EOQualifier.ComparisonSupport. You should implement this interface for any value classes you write that you want to be evaluated in memory by EOQualifier instances.
     */
    public static interface Comparison{
        /**
         * Returns true if the receiver contains other, false if it doesn't.
         */
        abstract boolean doesContain(java.lang.Object other);

        /**
         * Returns true if the receiver is a case insensitive match for other, false if it isn't.
         * Using Wildcards and the like Operator When you use the like or caseInsensitiveLike operator in a qualifier expression, you can use the wildcard characters * and ? to perform pattern matching, for example:
         * lastName like 'Jo *'
         * matches Jones, Johnson, Jolsen, Josephs, and so on.
         * The ? character just matches a single character, for example:
         * lastName like 'Jone?'
         * matches Jones.
         * The asterisk character (*) is only interpreted as a wildcard in expressions that use the like or caseInsensitiveLike operator. For example, in the following statement, the asterisk is treated as a literal value, not as a wildcard:
         * quot;lastName = 'Jo *'
         */
        abstract boolean isCaseInsensitiveLike(java.lang.Object other);

        /**
         * Invokes equals and returns the result. This method is used in the framework only by EOQualifier for in-memory evaluation.
         */
        abstract boolean isEqualTo(java.lang.Object other);

        /**
         * Invokes compare and returns true if the result is NSComparator. OrderedDescending. This method is used in the Framework only by EOQualifier for in-memory evaluation.
         */
        abstract boolean isGreaterThan(java.lang.Object other);

        /**
         * Invokes compare and returns true if the result is NSComparator. OrderedDescending or NSComparator.OrderedSame. This method is used in the Framework only by EOQualifier for in-memory evaluation.
         */
        abstract boolean isGreaterThanOrEqualTo(java.lang.Object other);

        /**
         * Invokes compare and returns true if the result is NSComparator.OrderedAscending . This method is used in the Framework only by EOQualifier for in-memory evaluation.
         */
        abstract boolean isLessThan(java.lang.Object other);

        /**
         * Invokes compare and returns true if the result is NSComparator. OrderedAscending or NSComparator.OrderedSame. This method is used in the Framework only by EOQualifier for in-memory evaluation.
         */
        abstract boolean isLessThanOrEqualTo(java.lang.Object other);

        /**
         * Returns true if receiver matches other according to the semantics of the SQL like comparison operator, false if it doesn't. This method is used in the Framework only by EOQualifier for in-memory evaluation.
         */
        abstract boolean isLike(java.lang.Object other);

        /**
         * Invokes equals, inverts the result, and returns it. This method is used in the Framework only by EOQualifier for in-memory evaluation.
         */
        abstract boolean isNotEqualTo(java.lang.Object other);

    }
    /**
     * The Java Client EOQualifier.ComparisonSupport class provides default implementations of the EOQualifierComparison interface.
     * The Java Client EOCustomObject uses EOQualifier.ComparisonSupport's default implementations. Typically the custom enterprise object classes inherit from EOCustomObject and inherit the default implementations. If the custom enterprise object class doesn't inherit from EOCustomObject, you should implement the EOQualifierComparison interface directly.
     */
    public static class ComparisonSupport{
        public ComparisonSupport(){
             //TODO codavaj!!
        }

        /**
         * Compares the two objects using selector. You should use this method to compare value objects instead of calling selector directly. This method is the entry point for the comparison support, and calls methods in support classes if appropriate.
         */
        public static boolean compareValues(java.lang.Object left, java.lang.Object right, com.webobjects.foundation.NSSelector selector){
            return false; //TODO codavaj!!
        }

        /**
         * Returns true if receiver contains right, false if it doesn't. NSObject's implementation of this method returns true only if receiver is a kind of NSArray and contains right. In all other cases it returns false. This method is used in the Framework only by EOQualifier for in-memory evaluation.
         */
        public boolean doesContain(java.lang.Object left, java.lang.Object right){
            return false; //TODO codavaj!!
        }

        /**
         * Returns true if receiver is a case insensitive match for right, false if it isn't. This method is used in the Framework only by EOQualifier for in-memory evaluation.
         */
        public boolean isCaseInsensitiveLike(java.lang.Object left, java.lang.Object right){
            return false; //TODO codavaj!!
        }

        /**
         * Invokes equals and returns the result. This method is used in the Framework only by EOQualifier for in-memory evaluation.
         */
        public boolean isEqualTo(java.lang.Object left, java.lang.Object right){
            return false; //TODO codavaj!!
        }

        /**
         * Invokes compare and returns true if the result is NSComparator.OrderedDescending. This method is used in the Framework only by EOQualifier for in-memory evaluation.
         */
        public boolean isGreaterThan(java.lang.Object left, java.lang.Object right){
            return false; //TODO codavaj!!
        }

        /**
         * Invokes compare and returns true if the result is NSComparator.OrderedDescending or NSComparator.OrderedSame. This method is used in the Framework only by EOQualifier for in-memory evaluation.
         */
        public boolean isGreaterThanOrEqualTo(java.lang.Object left, java.lang.Object right){
            return false; //TODO codavaj!!
        }

        /**
         * Invokes compare and returns true if the result is NSComparator.OrderedAscending. This method is used in the Framework only by EOQualifier for in-memory evaluation.
         */
        public boolean isLessThan(java.lang.Object left, java.lang.Object right){
            return false; //TODO codavaj!!
        }

        /**
         * Invokes compare and returns true if the result is NSComparator.OrderedAscending or NSComparator.OrderedSame. This method is used in the Framework only by EOQualifier for in-memory evaluation.
         */
        public boolean isLessThanOrEqualTo(java.lang.Object left, java.lang.Object right){
            return false; //TODO codavaj!!
        }

        /**
         * Returns true if receiver matches right according to the semantics of the SQL like comparison operator, false if it doesn't. This method is used in the Framework only by EOQualifier for in-memory evaluation.
         */
        public boolean isLike(java.lang.Object left, java.lang.Object right){
            return false; //TODO codavaj!!
        }

        /**
         * Invokes equals, inverts the result, and returns it. This method is used in the Framework only by EOQualifier for in-memory evaluation.
         */
        public boolean isNotEqualTo(java.lang.Object left, java.lang.Object right){
            return false; //TODO codavaj!!
        }

        /**
         * Sets aClass as the support class to be used for comparing instances of aClass. When compareValues is called, the methods in supportClass are used to do the comparison for instances of aClass.
         */
        public static void setSupportForClass(com.webobjects.eocontrol.EOQualifier.ComparisonSupport supportClass, java.lang.Class aClass){
            return; //TODO codavaj!!
        }

        /**
         * Returns the support class used for doing sort ordering comparisons for instances of aClass.
         */
        public static com.webobjects.eocontrol.EOQualifier.ComparisonSupport supportForClass(java.lang.Class aClass){
            return null; //TODO codavaj!!
        }

    }
}

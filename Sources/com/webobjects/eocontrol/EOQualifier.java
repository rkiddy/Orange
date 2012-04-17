package com.webobjects.eocontrol;
/**
 * <p>
 * EOQualifier is an abstract class for objects that hold information used to restrict selections on objects or database rows
 * according to specified criteria. With the exception of EOSQLQualifier (EOAccess), qualifiers aren't based on SQL and they
 * don't rely upon an EOModel (EOAccess). Thus, the same qualifier can be used both to perform in memory searches and to fetch
 * from the database.
 * </p><p>
 * You never instantiate an instance of EOQualifier. Rather, you use one of its subclasses, your own custom EOQualifier subclasses,
 * or one of the following classes:
 * <table border="1">
 *   <tr><th>Subclass</th><th>Purpose</th></tr>
 *   <tr>
 *     <td>EOKeyValueQualifier</td>
 *     <td>Compares the named property of an object to a supplied value, for example , weight 150.</td>
 *   </tr><tr>
 *     <td>EOKeyComparisonQualifier</td>
 *     <td>Compares the named property of one object with the named property of another, for example name = wife.name.</td>
 *   </tr><tr>
 *     <td>EOAndQualifier</td>
 *     <td>Contains multiple qualifiers, which it conjoins. For example, name = 'Fred' AND age 20.</td>
 *   </tr><tr>
 *     <td>EOOrQualifier</td>
 *     <td>Contains multiple qualifiers, which it disjoins. For example, name = 'Fred' OR name = 'Ethel'.</td>
 *   </tr><tr>
 *     <td>EONotQualifier</td>
 *     <td>Contains a single qualifier, which it negates. For example, NOT (name = 'Fred').</td>
 *   </tr><tr>
 *     <td>EOSQLQualifier</td>
 *     <td>Contains unstructured text that can be transformed into a SQL expression. EOSQLQualifier provides a way to create SQL
 *         expressions with any arbitrary SQL. Because EOSQLQualifiers can't be evaluated against objects in memory and because
 *         they contain database and SQL specific content, you should use EOQualifier wherever possible.</td>
 *   </tr>
 * </table>
 * </p><p>
 * The interface EOQualifierEvaluation defines how qualifiers are evaluated in memory. To evaluate qualifiers in a database, methods
 * in EOSQLExpression (EOAccess) and EOEntity (EOAccess) are used to generate SQL for qualifiers. Note that all of the SQL generation
 * functionality is contained in the access layer.
 * </p>
 * <h2>Creating a Qualifier</h2>
 * <p>
 * As described above, there are several EOQualifier subclasses, each of which represents a different semantic. However, in most cases
 * you simply create a qualifier using the EOQualifier static method <strong>qualifierWithQualifierFormat</strong>, as follows:
 * <blockquote><pre> EOQualifier    qual    = EOQualifier.qualifierWithQualifierFormat("lastName = 'Smith'", null);</pre></blockquote>
 * The qualifier or group of qualifiers that result from such a statement is based on the contents of the format string you provide. For
 * example, giving the format string lastName = 'Smith' as an argument to qualifierWithQualifierFormat returns an EOKeyValueQualifier
 * object. But you don't normally need to be concerned with this level of detail.
 * </p><p>
 * The format strings you use to create a qualifier can be compound logical expressions, such as firstName = 'Fred' AND age 20 .
 * When you create a qualifier, compound logical expressions are translated into a tree of EOQualifier nodes. Logical operators
 * such as AND and OR become EOAndQualifiers and EOOrQualifiers, respectively. These qualifiers conjoin (AND) or disjoin (OR) a
 * group of sub qualifiers.
 * </p>
 * <h2>Constructing Format Strings</h2>
 * <p>
 * As described above, you typically create a qualifier from a format string by using <strong>qualifierWithQualifierFormat</strong>.
 * This method takes as an argument a format string vaguely similar to the standard C <em>printf()</em> function. The format string
 * can embed strings, numbers, and other objects using the conversion specification %@. The second argument to 
 * <strong>qualifierWithQualifierFormat</strong> is an array that contains the value or result to substitute for any %@ conversion
 * specifications. This allows qualifiers to be built dynamically. The following table lists the conversion specifications you can
 * use in a format string and their corresponding data types.
 * </p> 
 * <table border="1">
 * <tr><td>Conversion Specification</td><td>Expected Value or Result</td></tr>
 * <tr><td>%s</td><td>A String object, or the result of the toString method</td></tr>
 * <tr><td>%d</td><td>An Integer or something which can be converted into an Integer.</td></tr>
 * <tr><td>%f</td><td>A Double or something which can be converted into a Double</td></tr>
 * <tr><td>%@</td><td>An arbitrary Object argument. No conversions are performed.</td></tr>
 * <tr><td>%K</td>
 *     <td>Similar to %@ except the argument is coerced to a String with toString and treated as a key which can determine whether
 *         the resultant qualifier is an EOKeyValueQualifier or an EOKeyComparisonQualifer.
 *     </td></tr>
 * <tr><td>%%</td><td>Results in a literal % character.</td></tr>
 * </table>
 * <p>
 * If you use an unrecognized character in a conversion specification (for example, %x), an exception is thrown.
 * </p><p>
 * For example, suppose you have an Employee entity with the properties <strong>empID</strong>, <strong>firstName</strong>,
 * <strong>lastName</strong>, <strong>salary</strong>, and <strong>department</strong> (representing a to-one relationship to the
 * employee's department), and a Department entity with properties deptID, and name. You could construct simple qualifier strings
 * like the following:
 * <blockquote><pre>
 * lastName = 'Smith'
 * salary > 2500
 * department.name = 'Personnel'
 * </pre></blockquote>
 * </p><p>
 * The following examples build qualifiers similar to the qualifier strings described above, but take the specific values from already
 * fetched enterprise objects:
 * <blockquote><pre>
 * Employee anEmployee; // Assume this exists.
 * Department aDept; // Assume this exists.
 * EOQualifier myQualifier;
 * NSMutableArray args = new MutableVector();
 * args.addObject("lastName");
 * args.addObject(anEmployee.lastName());
 * myQualifier = EOQualifier.qualifierWithQualifierFormat("%@ = %@", args);
 * args.removeAllObjects();
 * args.addObject("salary");
 * args.addObject(anEmployee.salary());
 * myQualifier = EOQualifier.qualifierWithQualifierFormat("%@ > %f", args);
 * args.removeAllElements();
 * args.addElement("department.name");
 * args.addElement(aDept.name());
 * myQualifier = EOQualifier.qualifierWithQualifierFormat("%@ = %@", args);
 * </pre></blockquote>
 * </p><p>
 * The enterprise objects here implement methods for directly accessing the given attributes: <strong>lastName</strong> and
 * <strong>salary</strong> for Employee objects, and <strong>name</strong> for Department objects. Note that unlike a string literal,
 * the %@ conversion specification is never surrounded by single quotes:
 * <blockquote><pre>
 * </p><p>
 * For a literal string value such as Smith, you use single quotes.
 * EOQualifier.qualifierWithQualifierFormat("lastName = 'Smith'", null);
 * // For the conversion specification %@, you don't use quotes
 * args.removeAllElements();
 * args.addElement("Jones");
 * EOQualifier.qualifierWithQualifierFormat("lastName = %@", args);
 * </pre></blockquote>
 * </p><p>
 * Typically format strings include only two data types: strings and numbers. Single quoted or double quoted strings correspond to
 * String objects in the argument array, non quoted numbers correspond to Numbers, and non quoted strings are keys. You can get around
 * this limitation by performing explicit casting.
 * </p><p>
 * The operators you can use in constructing qualifiers are =, ==, !=, , , =, =, "like", and "caseInsensitiveLike". The <strong>like</strong>
 * and <strong>caseInsensitiveLike</strong> operators can be used with wildcards to perform pattern matching.
 * </p>
 * <h2>Checking for NULL Values</h2>
 * <p>
 * To construct a qualifier that fetches rows matching NULL, you can use either of the approaches shown in the following example:
 * <blockquote><pre>
 * NSMutableArray args = new NSMutableArray();
 * // Approach 1
 * EOQualifier.qualifierWithQualifierFormat("bonus = nil", null);
 * // Approach 2
 * args.addElement(NullValue.nullValue());
 * EOQualifier.qualifierWithQualifierFormat("bonus = %@", args);
 * </pre></blockquote>
 * </p>
 * <h2>Using Wildcards and the like Operator</h2>
 * <p>
 * When you use the like or caseInsensitiveLike operator in a qualifier expression, you can use the wildcard characters and ? to
 * perform pattern matching, for example:
 * <blockquote><pre>"lastName like 'Jo*'"</pre></blockquote>
 * matches Jones, Johnson, Jolsen, Josephs, and so on.
 * </p><p>
 * The ? character just matches a single character, for example:
 * <blockquote><pre>"lastName like 'Jone?'"</pre></blockquote>
 * matches Jones.
 * </p><p>
 * The asterisk character (*) is only interpreted as a wildcard in expressions that use the like or caseInsensitiveLike operator.
 * For example, in the following statement, the character * is treated as a literal value, not as a wildcard:
 * <blockquote><pre>lastName = 'Jo*'"</pre></blockquote>
 * </p>
 * <h2>Using Selectors in Qualifier Expressions</h2>
 * <p>
 * The format strings you use to initialize a qualifier can include methods. The parser recognizes an unquoted string followed by a
 * colon (such as myMethod&#58;) as a method. For example:
 * <blockquote><pre>
 * point1 isInside: area
 * firstName isAnagramOfString: "Computer"
 * </pre></blockquote>
 * <p>
 * The method signature of the embedded selector (<tt>isAnagramOfString</tt> in this example must be:
 * <blockquote><pre>public Boolean isAnagramOfString(String aString) {}</pre></blockquote>
 * </p><p>
 * You can also pass an Object rather than a String. If you pass an Object, the invocation is wrapped in an exception handler and
 * returns false unless you return a Boolean.
 * </p><p>
 * Methods specified in a qualifier are parsed and applied only in memory; that is, they can't be used in to qualify fetches in a database.
 * </p>
 * <h2>Using EOQualifier's Subclasses</h2>
 * <p>
 * You rarely need to explicitly create an instance of EOAndQualifier, EOOrQualifier, or EONotQualifier. However, you may want to
 * create instances of EOKeyValueQualifier and EOKeyComparisionQualifier. The primary advantage of this is that it lets you exercise
 * more control over how the qualifier is constructed.
 * </p><p>
 * If you want to explicitly create a qualifier subclass, you can do it using code such as the following excerpt, which uses
 * EOKeyValueQualifier to select all objects whose isOut key is equal to 1 (meaning true). In the excerpt, the qualifier is used
 * to filter an in memory array.
 * <blockquote><pre>
 * // Create the qualifier
 * EOQualifier qual = new EOKeyValueQualifier("isOut", EOQualifier.QualifierOperatorEqual, new Integer(1));
 * // Filter an array and return it
 * return Qualifier.filteredVectorWithQualifier(allRentals(), qual);
 * </pre></blockquote>
 * The <strong>filteredArrayWithQualifier</strong> method r eturns an array containing objects from the provided array that match
 * the provided qualifier.
 * </p>
 * <h2>Creating Subclasses</h2>
 * <p>
 * A custom subclass of EOQualifier must implement the EOQualifierEvaluation interface if they are to be evaluated in memory.
 * </p>
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
    }

    /**
     * Adds the receiver's qualifier keys to qualifierKeys. The subclasses in the EOControl framework do this by traversing the
     * tree of qualifiers. Node qualifiers (such as EOAndQualifier) recursively invoke this method until they reach a leaf qualifier
     * (such as EOKeyValueQualifier) which adds its key to the set.
     *
     * Subclasses of EOQualifier must implement this method.
     */
    public abstract void addQualifierKeysToSet(com.webobjects.foundation.NSMutableSet qualifierKeys);

    /**
     * Returns an NSSet of strings, which are the left hand sides of all the qualifiers in the receiver. For example, if you have a qualifier
     * <blockquote><pre>salary &gt; 10000 AND manager.lastName = 'smith'</pre></blockquote>
     * the <strong>allQualifierKeys</strong> would return an array <tt>("salary", "manager.lastName")</tt>. Subclasses should not override
     * this method, instead they should override <strong>addQualifierKeysToSet</strong>.
     */
    public com.webobjects.foundation.NSSet allQualifierKeys(){
        return null; 
    }

    /**
     * Returns an NSArray containing all of the operators supported by EOQualifier. These are: =, !=,
     * ,
     * =,
     * ,
     * =, like, and caseInsensitiveLike.
     */
    public static com.webobjects.foundation.NSArray allQualifierOperators(){
        return null;
    }

    /**
     * Returns an array of strings which are the names of the known variables. Multiple occurrences of the same variable will only appear once in this list.
     */
    public com.webobjects.foundation.NSArray bindingKeys(){
        return null;
    }

    /**
     * Returns an exact replica of the receiver.
     */
    public java.lang.Object clone(){
        return null;
    }

    /**
     * Implemented by subclasses to return true if object matches the criteria specified in the receiver, false otherwise.
     * The argument, object, should be an enterprise object, a snapshot dictionary, or something that implements key-value coding.
     */
    public boolean evaluateWithObject(java.lang.Object object){
        return false;
    }

    /**
     * Filters array in place so that it contains only objects matching qualifier.
     */
    public static void filterArrayWithQualifier(com.webobjects.foundation.NSMutableArray array, com.webobjects.eocontrol.EOQualifier qualifier){
        return;
    }

    /**
     * Returns a new array that contains only the array from objects matching qualifier.
     */
    public static com.webobjects.foundation.NSArray filteredArrayWithQualifier(com.webobjects.foundation.NSArray array, com.webobjects.eocontrol.EOQualifier qualifier){
        return null;
    }

    /**
     * Returns a string which is the left hand side of the variable in the qualifier. If you have a qualifier salary
     * $amount and manager.lastName = $manager, then calling bindingKeys would return the array (amount,manager). Calling keyPathForBindingKey would return salary for amount, and manager.lastname for manager.
     */
    public java.lang.String keyPathForBindingKey(java.lang.String key){
        return null;
    }

    /**
     * Returns a named operator selector.
     */
    protected static com.webobjects.foundation.NSSelector operatorSelectorForSelectorNamed(java.lang.String string){
        return null;
    }

    /**
     * Returns an operator selector based on the string string. This method is used in parsing a qualifier. For example, the
     * following statement returns the selector QualifierOperatorNotEqual.
     * <blockquote><pre>Selector selector = Qualifier.operatorSelectorForString("!=");</pre></blockquote>
     * The possible values of aString are =, ==, !=, &lt;, &gt;, &lt;=, &gt;=, "like", and "caseInsensitiveLike".
     * 
     * <p>You would probably only use this method if you were writing the own qualifier parser.</p>
     */
    public static com.webobjects.foundation.NSSelector operatorSelectorForString(java.lang.String string){
        return null;
    }

    /**
     * Takes a dictionary of search criteria, from which the method creates EOKeyValueQualifiers (one for each dictionary entry).
     * The method ANDs these qualifiers together, and returns the resulting EOAndQualifier.
     */
    public static com.webobjects.eocontrol.EOQualifier qualifierToMatchAllValues(com.webobjects.foundation.NSDictionary values){
        return null;
    }

    /**
     * Takes a dictionary of search criteria, from which the method creates EOKeyValueQualifiers (one for each dictionary entry).
     * The method ORs these qualifiers together, and returns the resulting EOOrQualifier.
     */
    public static com.webobjects.eocontrol.EOQualifier qualifierToMatchAnyValue(com.webobjects.foundation.NSDictionary values){
        return null;
    }

    /**
     * Returns a new qualifier substituting all variables with values found in bindings. If requiresAll is true, any variable not
     * found in bindings throws an exception. If requiresAll is false, missing variable values cause the qualifier node to be pruned from the tree.
     */
    public abstract com.webobjects.eocontrol.EOQualifier qualifierWithBindings(com.webobjects.foundation.NSDictionary bindings, boolean requiresAll);

    /**
     * <p>
     * Parses the format string <em>format</em> and the specified <em>arguments</em>, uses them to create an EOQualifier, and
     * returns the EOQualifier. Conversion specifications (occurrences of %@) in qualifierFormat are replaced using the value
     * objects in <em>arguments</em>.
     * </p><p>
     * Based on the content of <em>format</em>, this method generates a tree of the basic qualifier types. For example, the format
     * string firstName = 'Joe' AND department = 'Facilities' generates an EOAndQualifier that contains twosub EOKeyValueQualifiers.
     * The following code excerpt shows a typical way to use the <strong>qualifierWithQualifierFormat</strong> method. The excerpt constructs an
     * EOFetchSpecification, which includes an entity name and a qualifier. It then applies the EOFetchSpecification to the EODisplayGroup's
     * data source and tells the EODisplayGroup to fetch.
     * <blockquote><pre>
     * EODisplayGroup displayGroup; //Assume this exists.
     * EOQualifier qualifier;
     * EOFetchSpecification fetchSpec; 
     * EODatabaseDataSource dataSource;
     * dataSource = (EODatabaseDataSource)displayGroup.dataSource();
     * qualifier = EOQualifier.qualifierWithQualifierFormat(cardType = 'Visa', null);
     * fetchSpec = new EOFetchSpecification(Member, qualifier, null), null);
     * dataSource.setFetchSpecification(fetchSpec);
     * displayGroup.fetch();
     * </pre></blockquote>
     * </p><p>
     * The <strong>qualifierWithQualifierFormat</strong> method performs no verification to ensure that keys referred to by the format
     * string format exist. It throws an exception if format contains any syntax errors.
     */
    public static com.webobjects.eocontrol.EOQualifier qualifierWithQualifierFormat(java.lang.String format, com.webobjects.foundation.NSArray arguments){
        return null;
    }

    /**
     * Returns an NSArray containing all of the relational operators supported by EOQualifier. These are: =, !=,
     * ,
     * =,
     * , and
     * =. In other words, returns all of the EOQualifier operators except for the ones that work exclusively on strings: "like" and "caseInsensitiveLike".
     */
    public static com.webobjects.foundation.NSArray relationalQualifierOperators(){
        return null;
    }

    /**
     * Returns a string representation of the selector selector. For example, the following statement returns the string:
     * <blockquote><pre>String operator = EOQualifier.stringForOperatorSelector(EOQualifier.QualifierOperatorNotEqual);</pre></blockquote>
     * The possible values for selector are as follows:
     * <ul>
     *   <li>QualifierOperatorEqual</li>
     *   <li>QualifierOperatorNotEqual</li>
     *   <li>QualifierOperatorLessThan</li>
     *   <li>QualifierOperatorGreaterThan</li>
     *   <li>QualifierOperatorLessThanOrEqualTo</li>
     *   <li>QualifierOperatorGreaterThanOrEqualTo</li>
     *   <li>QualifierOperatorContains</li>
     *   <li>QualifierOperatorLike</li>
     *   </li>QualifierOperatorCaseInsensitiveLike</li>
     * </ul>
     * You would probably use this method only if you were writing your own parser.
     */
    public static java.lang.String stringForOperatorSelector(com.webobjects.foundation.NSSelector selector){
        return null;
    }

    /**
     * Ensures that the receiver contains keys and key paths that belong to or originate from classDescription. This method
     * raises an exception if an unknown key is found, otherwise it returns null to indicate that the keys contained by the qualifier are valid.
     */
    public abstract void validateKeysWithRootClassDescription(com.webobjects.eocontrol.EOClassDescription classDescription);

    /**
     * <p>
     * The EOQualifierComparison interface defines methods for comparing values. These methods are used for evaluating qualifiers in memory.
     * </p><p>
     * In Java Client, support for these methods is provided for String, Number, and Date using EOQualifier.ComparisonSupport. You should
     * implement this interface for any value classes you write that you want to be evaluated in memory by EOQualifier instances.
     * </p>
     */
    public static interface Comparison {
        /**
         * Returns true if the receiver contains other, false if it doesn't.
         */
        abstract boolean doesContain(java.lang.Object other);

        /**
         * <p>
         * Returns <tt>true</tt> if the receiver is a case insensitive match for other, <tt>false</tt> if it isn't.
         * </p><p>
         * <h4>Using Wildcards and the like Operator</h4>
         * <p>
         * When you use the like or caseInsensitiveLike operator in a qualifier expression, you can use the wildcard characters * and ? to 
         * perform pattern matching, for example:
         * <blockquote><pre>lastName like 'Jo *'</pre></blockquote>
         * matches Jones, Johnson, Jolsen, Josephs, and so on.
         * </p><p>
         * The ? character just matches a single character, for example:
         * <blockquote><pre>lastName like 'Jone?'</pre></blockquote>
         * matches Jones.
         * </p><p>
         * The asterisk character (*) is only interpreted as a wildcard in expressions that use the like or caseInsensitiveLike operator.
         * For example, in the following statement, the asterisk is treated as a literal value, not as a wildcard:
         * <blockquote><pre>quot;lastName = 'Jo *'</pre></blockquote>
         * </p>
         */
        abstract boolean isCaseInsensitiveLike(java.lang.Object other);

        /**
         * Invokes equals and returns the result. This method is used in the framework only by EOQualifier for in-memory evaluation.
         */
        abstract boolean isEqualTo(java.lang.Object other);

        /*
         * Invokes compare and returns true if the result is NSComparator. OrderedDescending. This method is used in the Framework only by
         * EOQualifier for in-memory evaluation.
         */
        abstract boolean isGreaterThan(java.lang.Object other);

        /**
         * Invokes compare and returns true if the result is NSComparator. OrderedDescending or NSComparator.OrderedSame. This method is
         * used in the Framework only by EOQualifier for in-memory evaluation.
         */
        abstract boolean isGreaterThanOrEqualTo(java.lang.Object other);

        /**
         * Invokes compare and returns true if the result is NSComparator.OrderedAscending . This method is used in the Framework only by
         * EOQualifier for in-memory evaluation.
         */
        abstract boolean isLessThan(java.lang.Object other);

        /**
         * Invokes compare and returns true if the result is NSComparator. OrderedAscending or NSComparator.OrderedSame. This method is
         * used in the Framework only by EOQualifier for in-memory evaluation.
         */
        abstract boolean isLessThanOrEqualTo(java.lang.Object other);

        /**
         * Returns true if receiver matches other according to the semantics of the SQL like comparison operator, false if it doesn't.
         * This method is used in the Framework only by EOQualifier for in-memory evaluation.
         */
        abstract boolean isLike(java.lang.Object other);

        /**
         * Invokes equals, inverts the result, and returns it. This method is used in the Framework only by EOQualifier for in-memory evaluation.
         */
        abstract boolean isNotEqualTo(java.lang.Object other);

    }
    /**
     * <p>
     * The Java Client EOQualifier.ComparisonSupport class provides default implementations of the EOQualifierComparison interface.
     * </p><p>
     * The Java Client EOCustomObject uses EOQualifier.ComparisonSupport's default implementations. Typically the custom enterprise
     * object classes inherit from EOCustomObject and inherit the default implementations. If the custom enterprise object class
     * doesn't inherit from EOCustomObject, you should implement the EOQualifierComparison interface directly.
     * </p>
     */
    public static class ComparisonSupport{
        public ComparisonSupport(){}

        /**
         * Compares the two objects using selector. You should use this method to compare value objects instead of calling selector directly.
         * This method is the entry point for the comparison support, and calls methods in support classes if appropriate.
         */
        public static boolean compareValues(java.lang.Object left, java.lang.Object right, com.webobjects.foundation.NSSelector selector){
            return false;
        }

        /**
         * Returns true if receiver contains right, false if it doesn't. NSObject's implementation of this method returns true only if
         * receiver is a kind of NSArray and contains right. In all other cases it returns false. This method is used in the Framework
         * only by EOQualifier for in-memory evaluation.
         */
        public boolean doesContain(java.lang.Object left, java.lang.Object right){
            return false;
        }

        /**
         * Returns true if receiver is a case insensitive match for right, false if it isn't. This method is used in the Framework only by
         * EOQualifier for in-memory evaluation.
         */
        public boolean isCaseInsensitiveLike(java.lang.Object left, java.lang.Object right){
            return false;
        }

        /**
         * Invokes equals and returns the result. This method is used in the Framework only by EOQualifier for in-memory evaluation.
         */
        public boolean isEqualTo(java.lang.Object left, java.lang.Object right){
            return false;
        }

        /**
         * Invokes compare and returns true if the result is NSComparator.OrderedDescending. This method is used in the Framework only by
         * EOQualifier for in-memory evaluation.
         */
        public boolean isGreaterThan(java.lang.Object left, java.lang.Object right){
            return false;
        }

        /**
         * Invokes compare and returns true if the result is NSComparator.OrderedDescending or NSComparator.OrderedSame. This method is
         * used in the Framework only by EOQualifier for in-memory evaluation.
         */
        public boolean isGreaterThanOrEqualTo(java.lang.Object left, java.lang.Object right){
            return false;
        }

        /**
         * Invokes compare and returns true if the result is NSComparator.OrderedAscending. This method is used in the Framework only by
         * EOQualifier for in-memory evaluation.
         */
        public boolean isLessThan(java.lang.Object left, java.lang.Object right){
            return false;
        }

        /**
         * Invokes compare and returns true if the result is NSComparator.OrderedAscending or NSComparator.OrderedSame. This method is
         * used in the Framework only by EOQualifier for in-memory evaluation.
         */
        public boolean isLessThanOrEqualTo(java.lang.Object left, java.lang.Object right){
            return false;
        }

        /**
         * Returns true if receiver matches right according to the semantics of the SQL like comparison operator, false if it doesn't.
         * This method is used in the Framework only by EOQualifier for in-memory evaluation.
         */
        public boolean isLike(java.lang.Object left, java.lang.Object right){
            return false;
        }

        /**
         * Invokes equals, inverts the result, and returns it. This method is used in the Framework only by EOQualifier for in-memory evaluation.
         */
        public boolean isNotEqualTo(java.lang.Object left, java.lang.Object right){
            return false;
        }

        /**
         * Sets aClass as the support class to be used for comparing instances of aClass. When compareValues is called, the methods in
         * supportClass are used to do the comparison for instances of aClass.
         */
        public static void setSupportForClass(com.webobjects.eocontrol.EOQualifier.ComparisonSupport supportClass, java.lang.Class aClass){
            return;
        }

        /**
         * Returns the support class used for doing sort ordering comparisons for instances of aClass.
         */
        public static com.webobjects.eocontrol.EOQualifier.ComparisonSupport supportForClass(java.lang.Class aClass){
            return null;
        }
    }
}

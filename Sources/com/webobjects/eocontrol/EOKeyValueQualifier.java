package com.webobjects.eocontrol;
/**
 * EOKeyValueQualifier is a subclass of EOQualifier that compares a named property of an object with a supplied value, for example, "salary > 1500". EOKeyValueQualifier implements the EOQualifierEvaluation interface, which defines the method evaluateWithObject for in-memory evaluation. When an EOKeyValueQualifier object receives an evaluateWithObject message, it evaluates the given object to determine if it satisfies the qualifier criteria.
 * In addition to performing in memory filtering, EOKeyValueQualifier can be used to generate SQL. When it's used for this purpose, the key should be a valid property name of the root entity for the qualifier (or a valid key path).
 * See Also:EOQualifierEvaluation.evaluateWithObject(Object), Serialized Form
 */
public class EOKeyValueQualifier extends com.webobjects.eocontrol.EOQualifier implements com.webobjects.foundation.NSCoding, com.webobjects.eocontrol.EOKeyValueArchiving{
    /**
     * Creates a new EOKeyValueQualifier. If key, selector, and value are provided, the EOKeyValueQualifier compares values for key to value using the operator method selector. The possible values for selector are as follows:
     * EOQualifier.QualifierOperatorEqual EOQualifier.QualifierOperatorNotEqual EOQualifier.QualifierOperatorLessThan EOQualifier.QualifierOperatorGreaterThan EOQualifier.QualifierOperatorLessThanOrEqualTo EOQualifier.QualifierOperatorGreaterThanOrEqualTo EOQualifier.QualifierOperatorContains EOQualifier.QualifierOperatorLike EOQualifier.QualifierOperatorCaseInsensitiveLike
     * Enterprise Objects Framework supports SQL generation for these methods only. You can generate SQL using the EOSQLExpression static method sqlStringForKeyValueQualifier.
     * For example, the following excerpt creates an EOKeyValueQualifier qualifier that has the key "name", the operator method QualifierOperatorEqual, and the value "Smith". Once constructed, the qualifier qualifier is used to filter an in-memory array.
     * NSArray employees; // assume this is populated with Employees EOKeyValueQualifier qualifier = new EOKeyValueQualifier("name", EOQualifier.QualifierOperatorEqual, "Smith"); return EOQualifier.filteredArrayWithQualifier(employees, qualifier);
     * Parameters:key - the key path to a property that will be evaluated against valueselector - operator used to compare key's value to valuevalue - the value compared against keySee Also:EOQualifier.filteredArrayWithQualifier(NSArray, EOQualifier), EOSQLExpression.sqlStringForKeyValueQualifier(EOKeyValueQualifier), EOQualifier.QualifierOperatorEqual, EOQualifier.QualifierOperatorNotEqual, EOQualifier.QualifierOperatorLessThan, EOQualifier.QualifierOperatorGreaterThan, EOQualifier.QualifierOperatorLessThanOrEqualTo, EOQualifier.QualifierOperatorGreaterThanOrEqualTo, EOQualifier.QualifierOperatorContains, EOQualifier.QualifierOperatorLike, EOQualifier.QualifierOperatorCaseInsensitiveLike
     */
    public EOKeyValueQualifier(java.lang.String key, com.webobjects.foundation.NSSelector selector, java.lang.Object value){
         //TODO codavaj!!
    }

    /**
     * Implements the abstract version of this method defined in EOQualfier. Adds the receiver's qualifier keys to qualKeys. EOKeyValueQualifier adds its key to the set.
     */
    public void addQualifierKeysToSet(com.webobjects.foundation.NSMutableSet qualKeys){
        return; //TODO codavaj!!
    }

    /**
     * Allows the receiver, before being encoded, to substitute a class other than its own in a coder.
     */
    public java.lang.Class classForCoder(){
        return null; //TODO codavaj!!
    }

    /**
     * (Re)creates an object based on type information and data stored in coder.
     */
    public static java.lang.Object decodeObject(com.webobjects.foundation.NSCoder coder){
        return null; //TODO codavaj!!
    }

    /**
     * (Re)creates an object based on information in unarchiver.
     */
    public static java.lang.Object decodeWithKeyValueUnarchiver(com.webobjects.eocontrol.EOKeyValueUnarchiver unarchiver){
        return null; //TODO codavaj!!
    }

    /**
     * Archives the receiver's type information and data into coder. The receiver can then be recreated using decodeObject. Custom type information can be used by overriding classForCoder.
     */
    public void encodeWithCoder(com.webobjects.foundation.NSCoder coder){
        return; //TODO codavaj!!
    }

    /**
     * Archives the receiver's into archiver. The receiver can then be recreated using decodeWithKeyValueUnarchiver.
     */
    public void encodeWithKeyValueArchiver(com.webobjects.eocontrol.EOKeyValueArchiver archiver){
        return; //TODO codavaj!!
    }

    /**
     * Compares the receiver to other. If other is an EOKeyValueQualifier and its key, value and selector are equal to the receiver's, this method returns true. If not, it returns false.
     */
    public boolean equals(java.lang.Object other){
        return false; //TODO codavaj!!
    }

    /**
     * Returns true if object satisfies the qualifier, false otherwise. When an EOKeyValueQualifier object receives the evaluateWithObject message, it evaluates object to determine if it meets the qualifier criteria. This method can throw one of several possible exceptions if an error occurs. If the application allows users to construct arbitrary qualifiers (such as through a user interface), you may want to write code to catch any exceptions and properly respond to errors (for example, by displaying a panel saying that the user typed a poorly formed qualifier).
     */
    public boolean evaluateWithObject(java.lang.Object object){
        return false; //TODO codavaj!!
    }

    /**
     * Returns the key (possibly a key path) that the receiver uses when qualifying (for instance, with evaluateWithObject).
     */
    public java.lang.String key(){
        return null; //TODO codavaj!!
    }

    /**
     * Implements the abstract version of this method defined in EOQualfier. Returns a new qualifier substituting all variables with values found in bindings. If requiresAll is true, any variable not found in bindings throws an exception. If requiresAll is false, missing variable values cause the qualifier node to be pruned from the tree (this method will return null).
     */
    public com.webobjects.eocontrol.EOQualifier qualifierWithBindings(com.webobjects.foundation.NSDictionary bindings, boolean requiresAll){
        return null; //TODO codavaj!!
    }

    /**
     * Returns the selector that the receiver uses when qualifying (for instance, with evaluateWithObject).
     */
    public com.webobjects.foundation.NSSelector selector(){
        return null; //TODO codavaj!!
    }

    /**
     * Returns a String representation of the receiver containing its key, selector, and value.
     */
    public java.lang.String toString(){
        return null; //TODO codavaj!!
    }

    /**
     * Ensures that the receiver contains keys and key paths that belong to or originate from classDesc. This method raises an exception if an unknown key is found (or key is null), otherwise it just returns cleanly to indicate that the keys contained by the qualifier are valid.
     */
    public void validateKeysWithRootClassDescription(com.webobjects.eocontrol.EOClassDescription classDesc){
        return; //TODO codavaj!!
    }

    /**
     * Returns the value that the receiver uses when qualifying (for instance, with evaluateWithObject).
     */
    public java.lang.Object value(){
        return null; //TODO codavaj!!
    }

}

package com.webobjects.eocontrol;
/**
 * EOKeyComparisonQualifier is a subclass of EOQualifier that compares a named property of an object with a named value of another object. For example, to return all of the employees whose salaries are greater than those of their managers, you might use an expression such as "salary > manager.salary", where "salary" is the left key and "manager.salary" is the right key. The "left key" is the property of the first object that's being compared to a property in a second object. The property in the second object is the "right key". Both the left key and the right key might be key paths. You can use EOKeyComparisonQualifier to compare properties of two different objects or to compare two properties of the same object.
 * EOKeyComparisonQualifier implements the EOQualifierEvaluation interface, which defines the method evaluateWithObject for in-memory evaluation. When an EOKeyComparisonQualifier object receives an evaluateWithObject message, it evaluates the given object to determine if it satisfies the qualifier criteria.
 * In addition to performing in-memory filtering, EOKeyComparisonQualifier can be used to generate SQL. When it's used for this purpose, the key should be a valid property name of the root entity for the qualifier (or a valid key path).
 * See Also:Serialized Form
 */
public class EOKeyComparisonQualifier extends com.webobjects.eocontrol.EOQualifier implements com.webobjects.foundation.NSCoding, com.webobjects.eocontrol.EOKeyValueArchiving{
    /**
     * Creates and returns a new EOKeyComparisonQualifier object that compares the properties named by leftKey and rightKey, using the operator method selector, one of the list below. EOQualifier.QualifierOperatorEqual EOQualifier.QualifierOperatorNotEqual EOQualifier.QualifierOperatorLessThan EOQualifier.QualifierOperatorGreaterThan EOQualifier.QualifierOperatorLessThanOrEqualTo EOQualifier.QualifierOperatorGreaterThanOrEqualTo EOQualifier.QualifierOperatorContains EOQualifier.QualifierOperatorLike EOQualifier.QualifierOperatorCaseInsensitiveLike
     * Enterprise Objects Framework supports SQL generation for these methods only. You can generate SQL using the EOSQLExpression static method sqlStringForKeyComparisonQualifier.
     * For example, the following excerpt creates an EOKeyComparisonQualifier qual that has the left key lastName, the operator method EOQualifierOperatorEqual, and the right key member.lastName. Once constructed, the qualifier qual is used to filter an in-memory array. The code excerpt returns an array of Guest objects whose lastName properties have the same value as the lastName property of the guest's sponsoring member (this example is based on the Rentals sample database). blockquote NSArray guests; EOKeyComparisonQualifier qual = new EOKeyComparisonQualifier(lastName, EOQualifier.QualifierOperatorEqual, member.lastName); return (EOQualifier.filteredArrayWithQualifier(guests, qual)); /blockquote
     * Parameters:leftKey - key path to first propertyselector - the operator method used to comparerightKey - key path to second property; compared against the leftKeySee Also:EOQualifier, NSSelector
     */
    public EOKeyComparisonQualifier(java.lang.String leftKey, com.webobjects.foundation.NSSelector selector, java.lang.String rightKey){
         //TODO codavaj!!
    }

    /**
     * Takes the receiver's leftKey and rightKey and inserts into qualKeys; null values are skipped.
     */
    public void addQualifierKeysToSet(com.webobjects.foundation.NSMutableSet qualKeys){
        return; //TODO codavaj!!
    }

    /**
     * Allows the receiver to substitute a class other than its own (for example, a public superclass) for use during archiving (encoding) by an NSCoder. Default is the value of the getClass method.
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
     * Unarchives and returns the newly-unarchived object; provides conformance to the EOKeyValueArchiving interface.
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
     * Archives the receiver; provides conformance to the EOKeyValueArchiving interface.
     */
    public void encodeWithKeyValueArchiver(com.webobjects.eocontrol.EOKeyValueArchiver archiver){
        return; //TODO codavaj!!
    }

    /**
     * The comparison made between the receiver and other is done by each one of the EOKeyComparisonQualifier components. The leftKey, rightKey and selctor of the receiver will be compared to the other object to find out if they are equal or not.
     */
    public boolean equals(java.lang.Object other){
        return false; //TODO codavaj!!
    }

    /**
     * Returns true if the object object satisfies the qualifier, false otherwise. When an EOKeyComparisonQualifier object receives an evaluateWithObject message, it evaluates object to determine if it meets the qualifier criteria. This method can throw one of several possible exceptions if an error occurs. If the application allows users to construct arbitrary qualifiers (such as through a user interface), you may want to write code to catch any exceptions and properly respond to errors (for example, by displaying a panel saying that the user typed a poorly-formed qualifier).
     */
    public boolean evaluateWithObject(java.lang.Object object){
        return false; //TODO codavaj!!
    }

    /**
     * The property of the object that's being compared to a property in a second object.
     */
    public java.lang.String leftKey(){
        return null; //TODO codavaj!!
    }

    /**
     * Overriding EOQualifier's behavior. qualifierWithBindings in EOKeyComparisonQualifier simply returns the receiver.
     */
    public com.webobjects.eocontrol.EOQualifier qualifierWithBindings(com.webobjects.foundation.NSDictionary bindings, boolean requiresAll){
        return null; //TODO codavaj!!
    }

    /**
     * The property in the second object to be compared.
     */
    public java.lang.String rightKey(){
        return null; //TODO codavaj!!
    }

    /**
     * The operator method used to do the comparison.
     */
    public com.webobjects.foundation.NSSelector selector(){
        return null; //TODO codavaj!!
    }

    public java.lang.String toString(){
        return null; //TODO codavaj!!
    }

    /**
     * Ensures that the receiver contains keys and key paths that belong to or originate from classDesc. This method raises an exception if an unknown key is found, otherwise the keys contained by the qualifier are valid.
     */
    public void validateKeysWithRootClassDescription(com.webobjects.eocontrol.EOClassDescription classDesc){
        return; //TODO codavaj!!
    }

}

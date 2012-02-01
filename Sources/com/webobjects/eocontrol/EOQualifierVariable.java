package com.webobjects.eocontrol;
/**
 * EOQualifierVariable defines objects that serve as placeholders in the qualifier. When you create a qualifier programmatically, you typically do something like this:
 * where aDate is a variable that contains the actual date you want to query upon. When you store the qualifier in an EOModel, there is no way to know the actual value to query upon or the variable that will contain that value. The EOQualifierVariable object acts as a placeholder for the actual variable that will represent the right side of the expression. An EOQualifierVariable is specified by using a dollar sign ($), as in the following:
 * Variable values must be substituted for using qualifierWithBindings.
 * See Also:EOQualifier.qualifierWithBindings(NSDictionary bindings, boolean requiresAll), Serialized Form
 */
public class EOQualifierVariable implements java.io.Serializable, com.webobjects.foundation.NSCoding, com.webobjects.eocontrol.EOKeyValueArchiving{
    /**
     * Creates and returns a new EOQualifierVariable object with the specified name. For example, if the qualifier "isdateReleased = $aDate", then this method would be invoked with the key "aDate".
     * Parameters:key - the specified name for the EOQualifierVariable object
     */
    public EOQualifierVariable(java.lang.String key){
         //TODO codavaj!!
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
     * Conforms to EOKeyValueArchiving.
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
     * Conforms to EOKeyValueArchiving.
     */
    public void encodeWithKeyValueArchiver(com.webobjects.eocontrol.EOKeyValueArchiver archiver){
        return; //TODO codavaj!!
    }

    /**
     * If the receiver and the other object have equals keys it returns true, false otherwise.
     */
    public boolean equals(java.lang.Object other){
        return false; //TODO codavaj!!
    }

    /**
     * Returns the specified name for the EOQualifierVariable object
     */
    public java.lang.String key(){
        return null; //TODO codavaj!!
    }

    /**
     * String representation of the name for the EOQualifierVariable object.
     */
    public java.lang.String toString(){
        return null; //TODO codavaj!!
    }

}

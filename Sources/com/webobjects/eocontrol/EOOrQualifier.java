package com.webobjects.eocontrol;
/**
 * EOOrQualifier is a subclass of EOQualifier that contains multiple qualifiers. EOOrQualifier implements the EOQualifierEvaluation interface, which defines the method evaluateWithObject for in-memory evaluation. When an EOOrQualifier object receives an evaluateWithObject message, it evaluates each of its qualifiers until one of them returns true. If one of its qualifiers returns true, the EOOrQualifier object returns true immediately.If all of its qualifiers return false, the EOOrQualifier object returns false.
 * See Also:EOOrQualifier.evaluateWithObject(Object object), Serialized Form
 */
public class EOOrQualifier extends com.webobjects.eocontrol.EOQualifier implements com.webobjects.foundation.NSCoding, com.webobjects.eocontrol.EOKeyValueArchiving{
    /**
     * Creates and returns a new EOOrQualifier. If qualifiers is provided, the EOOrQualifier is initialized with the qualifiers in qualifiers.
     * Parameters:qualifiers - specifies qualifier
     */
    public EOOrQualifier(com.webobjects.foundation.NSArray qualifiers){
         //TODO codavaj!!
    }

    /**
     * Adds the receiver's qualifier keys to qualKeys. EOOrQualifier does this by traversing the tree of qualifiers. Recursively it invokes this method until it reaches a leaf qualifier (such as EOKeyValueQualifier) which adds its key to the set.
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
     * If the receiver and the other object have equals qualifiers it returns true; false otherwise.
     */
    public boolean equals(java.lang.Object other){
        return false; //TODO codavaj!!
    }

    /**
     * Returns true if object satisfies the qualifier, false otherwise. When an EOOrQualifier object receives an evaluateWithObject message, it evaluates each of its qualifiers until one of them returns true. If any of its qualifiers returns true, the EOOrQualifier object returns true immediately. If all of its qualifiers return false, the EOOrQualifier object returns false. This method can throw one of several possible exceptions if an error occurs. If application allows users to construct arbitrary qualifiers (such as through a user interface), user may want to write code to catch any exceptions and respond to errors (for example, by displaying a panel saying that the user typed a poorly formed qualifier).
     */
    public boolean evaluateWithObject(java.lang.Object object){
        return false; //TODO codavaj!!
    }

    /**
     * The qualifiers contained in the receiver.
     */
    public com.webobjects.foundation.NSArray qualifiers(){
        return null; //TODO codavaj!!
    }

    /**
     * Returns a qualifier with the values associated by the bindings. If requiresAll is true, any variable not found in bindings throws an exception. If requiresAll is false, missing variable values cause the qualifier node to be pruned from the tree.
     */
    public com.webobjects.eocontrol.EOQualifier qualifierWithBindings(com.webobjects.foundation.NSDictionary bindings, boolean requiresAll){
        return null; //TODO codavaj!!
    }

    /**
     * String containing the description of all the qualifiers contained on receiver.
     */
    public java.lang.String toString(){
        return null; //TODO codavaj!!
    }

    /**
     * Ensures that the receiver contains keys and key paths that belong to or originate from classDesc. This method raises an exception if an unknown key is found, otherwise it returns null to indicate that the keys contained by the qualifier are valid.
     */
    public void validateKeysWithRootClassDescription(com.webobjects.eocontrol.EOClassDescription classDesc){
        return; //TODO codavaj!!
    }

}

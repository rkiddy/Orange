package com.webobjects.eocontrol;
/**
 * EOAndQualifier is a subclass of EOQualifier that contains multiple qualifiers. EOAndQualifier implements the EOQualifierEvaluation interface, which defines the method evaluateWithObject for in-memory evaluation. When an EOAndQualifier object receives an evaluateWithObject message, it evaluates each of its qualifiers until one of them returns false. If one of its qualifiers returns false, the EOAndQualifier object returns false immediately. If all of its qualifiers return true, the EOAndQualifier object returns true.
 * See Also:EOAndQualifier.evaluateWithObject(Object object), Serialized Form
 */
public class EOAndQualifier extends com.webobjects.eocontrol.EOQualifier implements com.webobjects.foundation.NSCoding, com.webobjects.eocontrol.EOKeyValueArchiving{
    /**
     * Creates a new EOAndQualifier. If qualifiers is provided, the new EOAndQualifier is initialized with the objects in qualifiers.
     * Parameters:qualifiers - immutable array of EOQualifier objects
     */
    public EOAndQualifier(com.webobjects.foundation.NSArray qualifiers){
         //TODO codavaj!!
    }

    /**
     * Adds the receiver's qualifier keys to qualKeys. The subclasses in the EOControl layer do this by traversing the tree of qualifiers. Node qualifiers (such as EOAndQualifier) recursively invoke this method until they reach a leaf qualifier (such as EOKeyValueQualifier) which adds its key to the set.
     * Subclasses of EOQualifier must implement this method.
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

    public boolean equals(java.lang.Object other){
        return false; //TODO codavaj!!
    }

    /**
     * When an EOAndQualifier object receives an evaluateWithObject message, it evaluates each of its qualifiers until one of them returns false. If any of its qualifiers returns false, the EOAndQualifier object returns false immediately. If all of its qualifiers return true, the object returns true. This method can throw several possible exceptions if an error occurs. If the application allows users to construct arbitrary qualifiers (such as through a user interface), you should write code to catch any exceptions and properly respond to errors (for example, by displaying a panel saying that the user typed a poorly formed qualifier).
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
     * If requiresAll is true, any variable not found in bindings throws an exception. If requiresAll is false, missing variable values cause the qualifier node to be pruned from the tree.
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
     * Ensures that the receiver contains keys and key paths that belong to or originate from classDesc. This method raises an exception if an unknown key is found. Otherwise, it returns null to indicate that the qualifier contains valid keys.
     */
    public void validateKeysWithRootClassDescription(com.webobjects.eocontrol.EOClassDescription classDesc){
        return; //TODO codavaj!!
    }

}

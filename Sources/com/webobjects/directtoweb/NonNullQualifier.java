package com.webobjects.directtoweb;
/**
 * See Also:Serialized Form
 */
public class NonNullQualifier extends com.webobjects.eocontrol.EOQualifier implements com.webobjects.eocontrol.EOKeyValueArchiving{
    public NonNullQualifier(java.lang.String key){
         //TODO codavaj!!
    }

    /**
     * Description copied from class:
     * Adds the receiver's qualifier keys to qualifierKeys. The subclasses in the EOControl framework do this by traversing the tree of qualifiers. Node qualifiers (such as EOAndQualifier) recursively invoke this method until they reach a leaf qualifier (such as EOKeyValueQualifier) which adds its key to the set.
     * Subclasses of EOQualifier must implement this method.
     */
    public void addQualifierKeysToSet(com.webobjects.foundation.NSMutableSet qualKeys){
        return; //TODO codavaj!!
    }

    public static java.lang.Object decodeWithKeyValueUnarchiver(com.webobjects.eocontrol.EOKeyValueUnarchiver unarchiver){
        return null; //TODO codavaj!!
    }

    public java.lang.String description(){
        return null; //TODO codavaj!!
    }

    /**
     * Description copied from interface:
     * Asks the receiver to archive its state into the EOKeyValueArchiver archiver.
     */
    public void encodeWithKeyValueArchiver(com.webobjects.eocontrol.EOKeyValueArchiver archiver){
        return; //TODO codavaj!!
    }

    public boolean evaluateWithObject(com.webobjects.eocontrol.EOKeyValueCodingAdditions o){
        return false; //TODO codavaj!!
    }

    /**
     * Description copied from class:
     * Returns a new qualifier substituting all variables with values found in bindings. If requiresAll is true, any variable not found in bindings throws an exception. If requiresAll is false, missing variable values cause the qualifier node to be pruned from the tree.
     */
    public com.webobjects.eocontrol.EOQualifier qualifierWithBindings(com.webobjects.foundation.NSDictionary bindings, boolean requiresAll){
        return null; //TODO codavaj!!
    }

    public java.lang.String toString(){
        return null; //TODO codavaj!!
    }

    /**
     * Description copied from class:
     * Ensures that the receiver contains keys and key paths that belong to or originate from classDescription. This method raises an exception if an unknown key is found, otherwise it returns null to indicate that the keys contained by the qualifier are valid.
     */
    public void validateKeysWithRootClassDescription(com.webobjects.eocontrol.EOClassDescription classDesc){
        return; //TODO codavaj!!
    }

}

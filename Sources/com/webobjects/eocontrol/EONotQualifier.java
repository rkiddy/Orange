package com.webobjects.eocontrol;
/**
 * EONotQualifier is a subclass of EOQualifier that contains a single qualifier. When an EONotQualifier object is evaluated, it returns the inverse of the result obtained by evaluating the qualifier it contains.
 * EONotQualifier implements the EOQualifierEvaluation interface, which defines the method evaluateWithObject for in-memory evaluation. When an EONotQualifier object receives an evaluateWithObject message, it evaluates the given object to determine if it satisfies the qualifier criteria.
 * You can generate SQL code for an EONotQualifier using the EOSQLExpression static method sqlStringForNegatedQualifier.
 * See Also:Serialized Form
 */
public class EONotQualifier extends com.webobjects.eocontrol.EOQualifier implements com.webobjects.foundation.NSCoding, com.webobjects.eocontrol.EOKeyValueArchiving{
    /**
     * Creates and returns a new EONotQualifier.
     * If qualifier is specified, it is used as the qualifier. For example, the following code excerpt constructs a qualifier, baseQual, and uses it to initialize an EONotQualifier, negQual. The EONotQualifier negQual is then used to filter an in-memory array. The code excerpt returns an array of Guest objects whose lastName properties do not have the same value as the lastName property of the guest's sponsoring member (this example is based on the Rentals sample database). In other words, the EONotQualifier negQual inverts the effects of baseQual.
     * NSArray guests EOQualifier baseQual; EONotQualifier negQual; baseQual = EOQualifier.qualifierWithQualifierFormat(lastName = member.lastName, null); negQual = new EONotQualifier(baseQual); return EOQualifier.filteredArrayWithQualifier(guests, negQual);
     * Parameters:qualifier - abstract class for objects that hold information used to restrict selections on objects or database rows according to specified criteria.
     */
    public EONotQualifier(com.webobjects.eocontrol.EOQualifier qualifier){
         //TODO codavaj!!
    }

    /**
     * Adds the receiver's qualifier keys to qualKeys. The subclasses in the EOControl framework do this by traversing the tree of qualifiers. Node qualifiers (such as EOAndQualifier) recursively invoke this method until they reach a leaf qualifier (such as EOKeyValueQualifier) which adds its key to the set.
     * Subclasses of EOQualifier must implement this method.
     */
    public void addQualifierKeysToSet(com.webobjects.foundation.NSMutableSet qualKeys){
        return; //TODO codavaj!!
    }

    /**
     * Description copied from interface:
     * Allows the receiver, before being encoded, to substitute a class other than its own in a coder. For example, private subclasses can substitute the name of a public superclass when being encoded.
     */
    public java.lang.Class classForCoder(){
        return null; //TODO codavaj!!
    }

    public static java.lang.Object decodeObject(com.webobjects.foundation.NSCoder coder){
        return null; //TODO codavaj!!
    }

    public static java.lang.Object decodeWithKeyValueUnarchiver(com.webobjects.eocontrol.EOKeyValueUnarchiver unarchiver){
        return null; //TODO codavaj!!
    }

    /**
     * Description copied from interface:
     * Encodes the receiver using coder. Object type information along with an object's data is stored.
     */
    public void encodeWithCoder(com.webobjects.foundation.NSCoder coder){
        return; //TODO codavaj!!
    }

    /**
     * Description copied from interface:
     * Asks the receiver to archive its state into the EOKeyValueArchiver archiver.
     */
    public void encodeWithKeyValueArchiver(com.webobjects.eocontrol.EOKeyValueArchiver archiver){
        return; //TODO codavaj!!
    }

    public boolean equals(java.lang.Object other){
        return false; //TODO codavaj!!
    }

    /**
     * Returns true if the object object satisfies the EONotQualifier, false otherwise. This method can throw one of several possible exceptions if an error occurs. If the application allows users to construct arbitrary qualifiers (such as through a user interface), you may want to write code to catch any exceptions and respond to errors (for example, by displaying a panel saying that the user typed a poorly formed qualifier).
     */
    public boolean evaluateWithObject(java.lang.Object object){
        return false; //TODO codavaj!!
    }

    public com.webobjects.eocontrol.EOQualifier qualifier(){
        return null; //TODO codavaj!!
    }

    /**
     * Returns a new qualifier substituting all variables with values found in bindings. If requiresAll is true, any variable not found in bindings throws an exception. If requiresAll is false, missing variable values cause the qualifier node to be pruned from the tree.
     */
    public com.webobjects.eocontrol.EOQualifier qualifierWithBindings(com.webobjects.foundation.NSDictionary bindings, boolean requiresAll){
        return null; //TODO codavaj!!
    }

    /**
     * Converts the receiver to a string.
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

package com.webobjects.webservices.generation;
/**
 * See Also:Serialized Form
 */
public class WOSearchOperation extends com.webobjects.webservices.generation.WOOperation{
    public WOSearchOperation(com.webobjects.appserver.WOContext context){
         //TODO codavaj!!
    }

    /**
     * Returns the maximum number of objects to fetch for this operation. Subclasses should override this method to provide a custom fetch limit based on operation attributes or D2WContext information. The default implementation returns the D2WContext value for the key fetchLimit.
     */
    public int fetchLimit(){
        return 0; //TODO codavaj!!
    }

    /**
     * Performs a search using an EOFetchSpecification based on the argument keys paths, and argument values.
     */
    public java.lang.Object invoke(){
        return null; //TODO codavaj!!
    }

    /**
     * Returns a qualifier for searching on an entity. Subclasses should override this method to provide custom qualifiers based on operation attributes or d2wContext() information. The default implementation invokes WOServiceUtilities.buildQualifier()
     */
    public com.webobjects.eocontrol.EOQualifier qualifier(com.webobjects.eoaccess.EOEntity entity, com.webobjects.foundation.NSArray inputPartKeyPaths, com.webobjects.foundation.NSArray values, com.webobjects.foundation.NSArray comparisonKeys, com.webobjects.foundation.NSArray attributeClassNames, java.lang.String unspecifiedArgumentKey){
        return null; //TODO codavaj!!
    }

}

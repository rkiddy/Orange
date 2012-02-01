package com.webobjects.appserver;
/**
 * Abstract implementation of WOAssociationFactory that implements creating constant and keyvalue associations. It does not handle Schemed associations. This class is meant to be subclassed to provide schemed associations in another way.
 * Since: 5.4
 */
public class WOConstantAssociationFactory implements com.webobjects.appserver.WOAssociationFactory{
    public WOConstantAssociationFactory(){
         //TODO codavaj!!
    }

    /**
     * Default implementation calls WOAssociation.associationWithValue() or, in the case of a boolean value, uses WOConstantValueAssociation.TRUE or WOConstantValueAssociation.FALSE.
     */
    public com.webobjects.appserver.WOAssociation createAssociation(java.lang.String name, java.lang.Object value) throws com.webobjects.appserver.WOSchemeNotSupportedException{
        return null; //TODO codavaj!!
    }

}

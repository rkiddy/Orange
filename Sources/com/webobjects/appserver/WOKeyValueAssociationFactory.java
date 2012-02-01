package com.webobjects.appserver;
/**
 * Abstract implementation of WOAssociationFactory that implements creating constant and keyvalue associations. It does not handle Schemed associations. This class is meant to be subclassed to provide schemed associations in another way.
 * Since: 5.4
 */
public class WOKeyValueAssociationFactory implements com.webobjects.appserver.WOAssociationFactory{
    public WOKeyValueAssociationFactory(){
         //TODO codavaj!!
    }

    /**
     * Calls WOAssociation.associationWithKeyPath(). The value parameter should be a string representing a Key-Value Coding expression.
     */
    public com.webobjects.appserver.WOAssociation createAssociation(java.lang.String scheme, java.lang.Object value){
        return null; //TODO codavaj!!
    }

}


package com.webobjects.appserver;



public interface WOAssociationFactory {

    public abstract WOAssociation createAssociation(String s, Object obj) throws WOSchemeNotSupportedException;
}

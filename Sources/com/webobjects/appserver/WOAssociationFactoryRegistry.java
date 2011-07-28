
package com.webobjects.appserver;

import com.webobjects.foundation.NSMutableDictionary;


public class WOAssociationFactoryRegistry
    implements WOAssociationFactory {


    public WOAssociationFactoryRegistry() { return null; }

    public void setAssociationFactory(String scheme, WOAssociationFactory associationFactory) {}

    public WOAssociationFactory getAssociationFactory(String scheme) { return null; }

    public WOAssociation createAssociation(String scheme, Object value) throws WOSchemeNotSupportedException { return null; }

    public static final String CONSTANT = "constant";
    public static final String KVC = "kvc";
    public static final String VAR = "var";
    private final NSMutableDictionary factories;

}

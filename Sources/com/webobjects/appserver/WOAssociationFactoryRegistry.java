package com.webobjects.appserver;
/**
 * Default implementation of WOAssociationFactory that implements a registry of WOAssociationFactory objects that handle the actual creation of WOAssociation subclasses.
 * Since: 5.4
 */
public class WOAssociationFactoryRegistry implements com.webobjects.appserver.WOAssociationFactory{
    /**
     * Built-in association scheme for a constant value association
     * See Also:Constant Field Values
     */
    public static final java.lang.String CONSTANT="constant";

    /**
     * Built-in association scheme for a Key-Value Coding association
     * See Also:Constant Field Values
     */
    public static final java.lang.String KVC="kvc";

    /**
     * Built-in association scheme for a temporary component variable association
     * See Also:Constant Field Values
     */
    public static final java.lang.String VAR="var";

    public WOAssociationFactoryRegistry(){
         //TODO codavaj!!
    }

    /**
     * Default implementation delegates through a registered association factory for the given scheme. If the scheme is not found this will throw WOSchemeNotSupportedException
     */
    public com.webobjects.appserver.WOAssociation createAssociation(java.lang.String scheme, java.lang.Object value) throws com.webobjects.appserver.WOSchemeNotSupportedException{
        return null; //TODO codavaj!!
    }

    public com.webobjects.appserver.WOAssociationFactory getAssociationFactory(java.lang.String scheme){
        return null; //TODO codavaj!!
    }

    public void setAssociationFactory(java.lang.String scheme, com.webobjects.appserver.WOAssociationFactory associationFactory){
        return; //TODO codavaj!!
    }

}

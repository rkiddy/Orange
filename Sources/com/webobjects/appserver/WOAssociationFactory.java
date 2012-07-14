package com.webobjects.appserver;
/**
 * @since 5.4
 */
public interface WOAssociationFactory{
    /**
     * Creates a WOAssociation with the given scheme name and content. The content is the unparsed contents of the scheme specifier and will have to be interpreted by the scheme handler.
     */
    abstract com.webobjects.appserver.WOAssociation createAssociation(java.lang.String scheme, java.lang.Object value) throws com.webobjects.appserver.WOSchemeNotSupportedException;

}

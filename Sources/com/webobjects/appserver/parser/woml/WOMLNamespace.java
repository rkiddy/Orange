package com.webobjects.appserver.parser.woml;
public interface WOMLNamespace{
    /**
     * Returns true if the receiver can generate a WOElement from the information contained in the given WOMLElement.
     */
    abstract boolean canGenerateElement(com.webobjects.appserver.parser.woml.WOMLElement element);

    /**
     * Contributes from the receiving namespace into the declaration given. Normally this means contributing binding values. This method is called when the target namespace appears in either the attributes or the tag name of the target WOMLElement.
     */
    abstract void contributeToDeclaration(com.webobjects.appserver.parser.woml.WOMLElement element, com.webobjects.appserver.WOElement template, com.webobjects.appserver._private.WOMutableDeclaration declaration, com.webobjects.foundation.NSArray languages, com.webobjects.appserver.WOAssociationFactory associationFactory) throws com.webobjects.appserver.parser.woml.WOMLElementGenerationException;

    /**
     * Returns the constructed WOElement from the given WOMLElement, template (child WOElement of the WOMLElement) and declaration. The declaration will have been set previously via contributeToDeclaration by all contributors. This method is called if the receiver returns true from canGenerateElement() for a particular element. There can be at most one element generator for a given WOMLElement, so this method has total control over the WOElement generated.
     */
    abstract com.webobjects.appserver.WOElement generateElement(com.webobjects.appserver.parser.woml.WOMLElement element, com.webobjects.appserver.WOElement template, com.webobjects.appserver._private.WOMutableDeclaration declaration, com.webobjects.foundation.NSArray languages, com.webobjects.appserver.WOAssociationFactory associationFactory) throws com.webobjects.appserver.parser.woml.WOMLElementGenerationException;

    /**
     * Returns the namespace identifier for this namespace.
     */
    abstract java.lang.String getNamespaceId();

}

package com.webobjects.appserver.parser.woml.namespaces;
/**
 * Namespace for the WebObjects qualifier namespace.
 * Since: 5.4
 */
public class WOMLWebObjectsQualifierNamespace implements com.webobjects.appserver.parser.woml.WOMLNamespace{
    public WOMLWebObjectsQualifierNamespace(java.lang.String namespace){
         //TODO codavaj!!
    }

    /**
     * Description copied from interface:
     * Returns true if the receiver can generate a WOElement from the information contained in the given WOMLElement.
     */
    public boolean canGenerateElement(com.webobjects.appserver.parser.woml.WOMLElement element){
        return false; //TODO codavaj!!
    }

    /**
     * Description copied from interface:
     * Contributes from the receiving namespace into the declaration given. Normally this means contributing binding values. This method is called when the target namespace appears in either the attributes or the tag name of the target WOMLElement.
     */
    public void contributeToDeclaration(com.webobjects.appserver.parser.woml.WOMLElement element, com.webobjects.appserver.WOElement template, com.webobjects.appserver._private.WOMutableDeclaration declaration, com.webobjects.foundation.NSArray languages, com.webobjects.appserver.WOAssociationFactory associationFactory){
        return; //TODO codavaj!!
    }

    /**
     * Description copied from interface:
     * Returns the constructed WOElement from the given WOMLElement, template (child WOElement of the WOMLElement) and declaration. The declaration will have been set previously via contributeToDeclaration by all contributors. This method is called if the receiver returns true from canGenerateElement() for a particular element. There can be at most one element generator for a given WOMLElement, so this method has total control over the WOElement generated.
     */
    public com.webobjects.appserver.WOElement generateElement(com.webobjects.appserver.parser.woml.WOMLElement element, com.webobjects.appserver.WOElement template, com.webobjects.appserver._private.WOMutableDeclaration declaration, com.webobjects.foundation.NSArray languages, com.webobjects.appserver.WOAssociationFactory associationFactory){
        return null; //TODO codavaj!!
    }

    /**
     * Description copied from interface:
     * Returns the namespace identifier for this namespace.
     */
    public java.lang.String getNamespaceId(){
        return null; //TODO codavaj!!
    }

}

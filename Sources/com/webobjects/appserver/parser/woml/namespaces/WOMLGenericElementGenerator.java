package com.webobjects.appserver.parser.woml.namespaces;
public class WOMLGenericElementGenerator implements com.webobjects.appserver.parser.woml.namespaces.WOMLAbstractNamespace.WOMLElementGenerator{
    public static final java.lang.String ELEMENT_NAME_ASSOCIATION="elementName";

    public WOMLGenericElementGenerator(){
         //TODO codavaj!!
    }

    /**
     * Default implementation copies all associations in the given namespace to the declaration.
     */
    public void contributeToDeclaration(com.webobjects.appserver.parser.woml.namespaces.WOMLAbstractNamespace namespace, com.webobjects.appserver.parser.woml.WOMLElement element, com.webobjects.appserver._private.WOMutableDeclaration declaration, com.webobjects.foundation.NSArray languages, com.webobjects.appserver.WOAssociationFactory associationFactory) throws com.webobjects.appserver.parser.woml.WOMLElementGenerationException{
        return; //TODO codavaj!!
    }

    /**
     * Default implementation generates a new dynamic element with the declaration's type and associations.
     */
    public com.webobjects.appserver.WOElement generateElement(com.webobjects.appserver.parser.woml.namespaces.WOMLAbstractNamespace namespace, com.webobjects.appserver.parser.woml.WOMLElement element, com.webobjects.appserver.WOElement template, com.webobjects.appserver._private.WOMutableDeclaration declaration, com.webobjects.foundation.NSArray languages, com.webobjects.appserver.WOAssociationFactory associationFactory) throws com.webobjects.appserver.parser.woml.WOMLElementGenerationException{
        return null; //TODO codavaj!!
    }

    /**
     * Returns the map of associations from the element to be used by the default contributeToDeclaration() method. The default implementation of this method returns a copy of the elements associations for only the namespace given. This returned map can then be manipulated without altering the associations in the element itself.
     */
    protected java.util.Map getElementAssociationsForContribution(com.webobjects.appserver.parser.woml.namespaces.WOMLAbstractNamespace namespace, com.webobjects.appserver.parser.woml.WOMLElement element, com.webobjects.appserver.WOAssociationFactory associationFactory){
        return null; //TODO codavaj!!
    }

    /**
     * Returns true if the given association with the given name should be contributed to the declaration. The default implementation calls the namespace's shouldContributeAssociation to determine includability.
     */
    protected boolean shouldContributeAssociation(com.webobjects.appserver.parser.woml.namespaces.WOMLAbstractNamespace namespace, com.webobjects.appserver.parser.woml.WOMLElement element, com.webobjects.appserver._private.WOMutableDeclaration declaration, com.webobjects.foundation.NSArray languages, java.lang.String name, com.webobjects.appserver.WOAssociation association){
        return false; //TODO codavaj!!
    }

}

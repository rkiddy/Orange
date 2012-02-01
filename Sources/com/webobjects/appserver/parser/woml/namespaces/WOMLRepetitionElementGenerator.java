package com.webobjects.appserver.parser.woml.namespaces;
public class WOMLRepetitionElementGenerator extends com.webobjects.appserver.parser.woml.namespaces.WOMLGenericElementGenerator{
    public static final java.lang.String ATTRIBUTE_REPEAT_TAG="repeatTag";

    public WOMLRepetitionElementGenerator(){
         //TODO codavaj!!
    }

    /**
     * Description copied from class:
     * Default implementation copies all associations in the given namespace to the declaration.
     */
    public void contributeToDeclaration(com.webobjects.appserver.parser.woml.namespaces.WOMLAbstractNamespace namespace, com.webobjects.appserver.parser.woml.WOMLElement element, com.webobjects.appserver._private.WOMutableDeclaration declaration, com.webobjects.foundation.NSArray languages, com.webobjects.appserver.WOAssociationFactory associationFactory) throws com.webobjects.appserver.parser.woml.WOMLElementGenerationException{
        return; //TODO codavaj!!
    }

    /**
     * Description copied from class:
     * Default implementation generates a new dynamic element with the declaration's type and associations.
     */
    public com.webobjects.appserver.WOElement generateElement(com.webobjects.appserver.parser.woml.namespaces.WOMLAbstractNamespace namespace, com.webobjects.appserver.parser.woml.WOMLElement element, com.webobjects.appserver.WOElement template, com.webobjects.appserver._private.WOMutableDeclaration declaration, com.webobjects.foundation.NSArray languages, com.webobjects.appserver.WOAssociationFactory associationFactory) throws com.webobjects.appserver.parser.woml.WOMLElementGenerationException{
        return null; //TODO codavaj!!
    }

    /**
     * Description copied from class:
     * Returns the map of associations from the element to be used by the default contributeToDeclaration() method. The default implementation of this method returns a copy of the elements associations for only the namespace given. This returned map can then be manipulated without altering the associations in the element itself.
     */
    protected java.util.Map getElementAssociationsForContribution(com.webobjects.appserver.parser.woml.namespaces.WOMLAbstractNamespace namespace, com.webobjects.appserver.parser.woml.WOMLElement element, com.webobjects.appserver.WOAssociationFactory associationFactory){
        return null; //TODO codavaj!!
    }

}

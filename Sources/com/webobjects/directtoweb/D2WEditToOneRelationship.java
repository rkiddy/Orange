package com.webobjects.directtoweb;
/**
 * D2WEditToOneRelationship is a property-level component that allows the user to choose the destination object of a to-one relationship. Since the component fetches all of the objects that can appear in the relationship, this component is slower than the D2WEditToOneFault component.
 * You can specify whether the user interface is a browser, pop-up list, or table of radio buttons. You can also specify the size of the browser or the number of columns of radio buttons to display.
 * Property-level components are not accessed programmatically. Instead, you use the Web Assistant or Rule Editor to choose the property-level component that Direct to Web uses to display a property on a particular entity and task page.
 * If you want to create a property-level component to edit a property, use D2WCustomComponent.
 * See Also:D2WEditToOneFault, D2WCustomComponent, D2WEditToManyRelationship, Serialized Form
 */
public class D2WEditToOneRelationship extends com.webobjects.directtoweb.EditRelationship{
    /**
     * Creates an instance of D2WEditToOneRelationship with the specified context.
     * Parameters:aContext - instance of WOContextSee Also:EditRelationship.EditRelationship(WOContext)
     */
    public D2WEditToOneRelationship(com.webobjects.appserver.WOContext aContext){
         //TODO codavaj!!
    }

    /**
     * Contributes to the template method that corresponds to the method toOneDescription.
     * The implementation is subject to change in future releases.
     */
    public java.lang.String generatedToOneDescription(){
        return null; //TODO codavaj!!
    }

    /**
     * Provides the name of the template method that corresponds to the method toOneDescription.
     * The current implementation concatenates "titleFor" and the property key.
     * The implementation is subject to change in future releases.
     */
    public java.lang.String methodNameToOneDescription(){
        return null; //TODO codavaj!!
    }

    /**
     * Replaces the binding toOneDescription.
     * The implementation is subject to change in future releases.
     */
    public com.webobjects.appserver.WOAssociation replacementAssociationForAssociation(com.webobjects.appserver.WOAssociation oldAssociation, java.lang.String oldBinding, com.webobjects.directtoweb.generation.DTWTemplate aTemplate, com.webobjects.appserver.WOContext aContext){
        return null; //TODO codavaj!!
    }

    /**
     * Provides the closed label for a collapsible component. Will be a presentable description if keyWhenRelationship equals the string userPresentableDescription.
     * The implementation is subject to change in future releases.
     */
    public java.lang.Object toOneDescription(){
        return null; //TODO codavaj!!
    }

}

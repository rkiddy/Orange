package com.webobjects.directtoweb;
/**
 * D2WEditToManyRelationship is a property-level component that allows the user to choose which objects are in a to-many relationship. Since the component fetches all of the objects in the relationship, it is slower than the D2WEditToManyFault component.
 * You can specify whether the list is collapsible or not and whether the user interface is a browser or a table of checkboxes. You can also specify the size of the browser or number of columns of checkboxes to display.
 * Property-level components are not accessed programmatically. Instead, you use the Web Assistant or Rule Editor to choose the property-level component that Direct to Web uses to display a property on a particular entity and task page.
 * If you want to create a property-level component to edit a property, use D2WCustomComponent.
 * See Also:D2WEditToManyFault, D2WCustomComponent, D2WEditToOneRelationship, Serialized Form
 */
public class D2WEditToManyRelationship extends com.webobjects.directtoweb.EditRelationship{
    /**
     * Creates an instance of D2WEditToManyRelationship with the specified context.
     * Parameters:aContext - instance of WOContextSee Also:EditRelationship.EditRelationship(WOContext)
     */
    public D2WEditToManyRelationship(com.webobjects.appserver.WOContext aContext){
         //TODO codavaj!!
    }

    /**
     * Gets the destination objects of the to-many relationship specified by the property key.
     */
    public com.webobjects.foundation.NSArray list(){
        return null; //TODO codavaj!!
    }

    /**
     * Provides the name of the template method that corresponds to the method toManyDescription.
     * The current implementation concatenates "titleFor" and the property key.
     * The implementation is subject to change in future releases.
     */
    public java.lang.String methodNameToManyDescription(){
        return null; //TODO codavaj!!
    }

    /**
     * Contributes to the template method that corresponds to the method toManyDescription.
     * The implementation is subject to change in future releases.
     */
    public java.lang.String plurifiedStrings(){
        return null; //TODO codavaj!!
    }

    /**
     * Replaces the binding toManyDescription.
     * The implementation is subject to change in future releases.
     */
    public com.webobjects.appserver.WOAssociation replacementAssociationForAssociation(com.webobjects.appserver.WOAssociation oldAssociation, java.lang.String oldBinding, com.webobjects.directtoweb.generation.DTWTemplate aTemplate, com.webobjects.appserver.WOContext aContext){
        return null; //TODO codavaj!!
    }

    /**
     * Provides the closed label for a collapsible component.
     * The current implementation returns the concatenation of the number of destination objects and the name of the destination entity, if there are any objects; the string "N/A", otherwise.
     * The implementation is subject to change in future releases.
     */
    public java.lang.String toManyDescription(){
        return null; //TODO codavaj!!
    }

}

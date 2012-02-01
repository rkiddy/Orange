package com.webobjects.directtoweb;
/**
 * D2WEditToManyFault is a property-level component that displays a hyperlink representing a to-many relationship. The hyperlink navigates to an edit-relationship page that allows the user to change which objects are in the relationship. This component does not traverse the relationship (unlike D2WEditToManyRelationship) making it appropriate for relationships that contain many objects.
 * Property-level components are not accessed programmatically. Instead, you use the Web Assistant or Rule Editor to choose the property-level component that Direct to Web uses to display a property on a particular entity and task page.
 * If you want to create a property-level component to edit a property, use D2WCustomComponent.
 * See Also:D2WEditToManyRelationship, D2WCustomComponent, D2WEditToOneFault, Serialized Form
 */
public class D2WEditToManyFault extends com.webobjects.directtoweb.D2WComponent{
    /**
     * The item for a WOBrowser.
     * The implementation is subject to change in future releases.
     * See Also:D2WEditToManyFault.browserList(), D2WEditToManyFault.browserStringForItem()
     */
    public com.webobjects.eocontrol.EOEnterpriseObject browserItem;

    /**
     * Creates an instance of D2WEditToManyFault with the specified context.
     * Parameters:aContext - instance of WOContextSee Also:D2WComponent.D2WComponent(WOContext)
     */
    public D2WEditToManyFault(com.webobjects.appserver.WOContext aContext){
         //TODO codavaj!!
    }

    /**
     * Provides the list for a WOBrowser.
     * The implementation is subject to change in future releases.
     */
    public com.webobjects.foundation.NSArray browserList(){
        return null; //TODO codavaj!!
    }

    /**
     * Provides the closed label for a D2WCollapsibleComponentContent.
     * The current implementation returns the concatenation of the number of destination objects and the name of the destination entity, if there are any objects; the string "N/A", otherwise.
     * The implementation is subject to change in future releases.
     */
    public java.lang.String browserListDescription(){
        return null; //TODO codavaj!!
    }

    /**
     * Provides the display string for a WOBrowser.
     * The implementation is subject to change in future releases.
     */
    public java.lang.String browserStringForItem(){
        return null; //TODO codavaj!!
    }

    /**
     * Provides the action for a WOImageButton. Returns an edit-relationship page for the target entity.
     * The implementation is subject to change in future releases.
     */
    public com.webobjects.appserver.WOComponent editValues(){
        return null; //TODO codavaj!!
    }

    /**
     * Provides the alt and name values for a WOImageButton. Returns a brief description of the action.
     * The implementation is subject to change in future releases.
     */
    public java.lang.String helpString(){
        return null; //TODO codavaj!!
    }

    /**
     * Provides the name of the template field that corresponds to the browserItem field.
     * The current implementation returns the concatenation of "itemFor" and the property key.
     * The implementation is subject to change in future releases.
     */
    public java.lang.String ivarNameForBrowserItem(){
        return null; //TODO codavaj!!
    }

    /**
     * Provides the name of the template method that corresponds to the method browserListDescription.
     * The current implementation returns the concatenation of "displayStringFor", the property key, and "Item".
     * The implementation is subject to change in future releases.
     */
    public java.lang.String methodNameBrowserListDescription(){
        return null; //TODO codavaj!!
    }

    /**
     * Provides the name of the template method that corresponds to the method editValues.
     * The current implementation returns the concatenation of "edit", the property key, and "Action".
     * The implementation is subject to change in future releases.
     */
    public java.lang.String methodNameForEditValues(){
        return null; //TODO codavaj!!
    }

    /**
     * Provides the name of the template method that corresponds to the method listDescription (if one exists).
     * The current implementation returns the concatenation of "listDescriptionFor", and the property key.
     * The implementation is subject to change in future releases.
     */
    public java.lang.String methodNameListDescription(){
        return null; //TODO codavaj!!
    }

    /**
     * Contributes to the template method that corresponds to the method browserListDescription.
     * The implementation is subject to change in future releases.
     */
    public java.lang.String plurifiedStrings(){
        return null; //TODO codavaj!!
    }

    /**
     * Replaces the associations that are pertinent to editing to-many relationships.
     * The bindings include browserList, browserListDescription, browserItem, browserStringForItem, and editValues.
     * The implementation is subject to change in future releases.
     */
    public com.webobjects.appserver.WOAssociation replacementAssociationForAssociation(com.webobjects.appserver.WOAssociation oldAssociation, java.lang.String oldBinding, com.webobjects.directtoweb.generation.DTWTemplate aTemplate, com.webobjects.appserver.WOContext aContext){
        return null; //TODO codavaj!!
    }

}

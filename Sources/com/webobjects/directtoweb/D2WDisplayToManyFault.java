package com.webobjects.directtoweb;
/**
 * This property-level component displays a hyperlink representing a to-many relationship. The hyperlink navigates to a list page that displays the objects in the relationship. This component does not traverse the relationship (unlike D2WDisplayToMany, D2WDisplayToMany2, D2WDisplayToManyBrowser, and D2WDisplayToManyTable) making it appropriate for relationships that contain many objects.
 * Property-level components are not accessed programmatically. Instead, you use the Web Assistant to choose the property-level component that Direct to Web uses to display a property on a particular entity and task page.
 * If you want to create property-level component to display a property, use D2WCustomComponent.
 * See Also:Serialized Form
 */
public class D2WDisplayToManyFault extends com.webobjects.directtoweb.D2WStatelessComponent implements com.webobjects.directtoweb.generation.DTWGeneration{
    /**
     * Creates a new D2WDisplayToManyFault with the specified aContext.
     * Parameters:aContext - a WOContext.
     */
    public D2WDisplayToManyFault(com.webobjects.appserver.WOContext aContext){
         //TODO codavaj!!
    }

    /**
     * This method is intentionally undocumented. You should never have to invoke or customize it.
     */
    public java.lang.String helpString(){
        return null; //TODO codavaj!!
    }

    /**
     * This method is intentionally undocumented. You should never have to invoke or customize it.
     */
    public com.webobjects.appserver.WOComponent inspectArrayAction(){
        return null; //TODO codavaj!!
    }

    /**
     * This method is intentionally undocumented. You should never have to invoke or customize it.
     */
    public java.lang.String methodNameInspectArrayAction(){
        return null; //TODO codavaj!!
    }

    /**
     * This method is intentionally undocumented. You should never have to invoke or customize it.
     */
    public com.webobjects.appserver.WOAssociation replacementAssociationForAssociation(com.webobjects.appserver.WOAssociation oldAssociation, java.lang.String oldBinding, com.webobjects.directtoweb.generation.DTWTemplate aTemplate, com.webobjects.appserver.WOContext aContext){
        return null; //TODO codavaj!!
    }

}

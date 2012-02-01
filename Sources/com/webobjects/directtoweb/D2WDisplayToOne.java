package com.webobjects.directtoweb;
/**
 * This property-level component displays a hyperlink representing a to-one relationship. The hyperlink navigates to an inspect page displaying the destination object of the relationship.
 * Property-level components are not accessed programmatically. Instead, you use the Web Assistant to choose the property-level component that Direct to Web uses to display a property on a particular entity and task page.
 * If you want to create property-level component to display a property, use D2WCustomComponent.
 * See Also:Serialized Form
 */
public class D2WDisplayToOne extends com.webobjects.directtoweb.D2WStatelessComponent implements com.webobjects.directtoweb.generation.DTWGeneration{
    /**
     * Creates a new D2WDisplayToOne with the specified aContext.
     * Parameters:aContext - a WOContext.
     */
    public D2WDisplayToOne(com.webobjects.appserver.WOContext aContext){
         //TODO codavaj!!
    }

    /**
     * This method is intentionally undocumented. You should never have to invoke or customize it.
     */
    public java.lang.String methodNameForToOneAction(){
        return null; //TODO codavaj!!
    }

    /**
     * This method is intentionally undocumented. You should never have to invoke or customize it.
     */
    public com.webobjects.appserver.WOAssociation replacementAssociationForAssociation(com.webobjects.appserver.WOAssociation oldAssociation, java.lang.String oldBinding, com.webobjects.directtoweb.generation.DTWTemplate aTemplate, com.webobjects.appserver.WOContext aContext){
        return null; //TODO codavaj!!
    }

    /**
     * This method is intentionally undocumented. You should never have to invoke or customize it.
     */
    public com.webobjects.appserver.WOComponent toOneAction(){
        return null; //TODO codavaj!!
    }

    /**
     * This method is intentionally undocumented. You should never have to invoke or customize it.
     */
    public java.lang.Object toOneDescription(){
        return null; //TODO codavaj!!
    }

}

package com.webobjects.directtoweb;
/**
 * This property-level component displays the first few objects of a to-many relationship in a list.
 * You can specify whether the list is collapsible or not. Since the component fetches all of the objects in the relationship, it is slower than the D2WDisplayToManyFault component, especially when the relationship has many objects.
 * Property-level components are not accessed programmatically. Instead, you use the Web Assistant to choose the property-level component that Direct to Web uses to display a property on a particular entity and task page.
 * If you want to create property-level component to display a property, use D2WCustomComponent.
 * See Also:Serialized Form
 */
public class D2WDisplayToMany extends com.webobjects.directtoweb.D2WComponent implements com.webobjects.directtoweb.generation.DTWGeneration{
    /**
     * This method is intentionally undocumented. You should never have to invoke or customize it.
     */
    public D2WDisplayToMany(com.webobjects.appserver.WOContext aContext){
         //TODO codavaj!!
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
    public java.lang.String inspectArrayActionString(){
        return null; //TODO codavaj!!
    }

    /**
     * This method is intentionally undocumented. You should never have to invoke or customize it.
     */
    public java.lang.String ivarNameForBrowserItem(){
        return null; //TODO codavaj!!
    }

    /**
     * This method is intentionally undocumented. You should never have to invoke or customize it.
     */
    public com.webobjects.foundation.NSArray list(){
        return null; //TODO codavaj!!
    }

    /**
     * This method is intentionally undocumented. You should never have to invoke or customize it.
     */
    public java.lang.String listDescription(){
        return null; //TODO codavaj!!
    }

    /**
     * This method is intentionally undocumented. You should never have to invoke or customize it.
     */
    public java.lang.String methodNameForShouldDisplay(){
        return null; //TODO codavaj!!
    }

    public java.lang.String methodNameInspectAction(){
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
    public java.lang.String methodNameListDescription(){
        return null; //TODO codavaj!!
    }

    /**
     * This method is intentionally undocumented. You should never have to invoke or customize it.
     */
    public java.lang.String plurifiedStrings(){
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
    public void setInspectArrayAction(java.lang.Object anObject){
        return; //TODO codavaj!!
    }

    /**
     * This method is intentionally undocumented. You should never have to invoke or customize it.
     */
    public void setList(java.lang.Object anObject){
        return; //TODO codavaj!!
    }

    /**
     * This method is intentionally undocumented. You should never have to invoke or customize it.
     */
    public boolean shouldDisplay(){
        return false; //TODO codavaj!!
    }

}

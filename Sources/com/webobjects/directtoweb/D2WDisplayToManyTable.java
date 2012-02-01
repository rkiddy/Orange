package com.webobjects.directtoweb;
/**
 * This property-level component displays the objects of a to-many relationship in a table. You can specify the number of columns in the table and whether the browser is collapsible or not. Since the component fetches all of the objects in the relationship, it is slower than the D2WDisplayToManyFault component, especially when the relationship has many objects.
 * Property-level components are not accessed programmatically. Instead, you use the Web Assistant to choose the property-level component that Direct to Web uses to display a property on a particular entity and task page.
 * If you want to create property-level component to display a property, use D2WCustomComponent.
 * See Also:Serialized Form
 */
public class D2WDisplayToManyTable extends com.webobjects.directtoweb.D2WDisplayToMany{
    /**
     * This constant is intentionally undocumented.
     */
    public com.webobjects.eocontrol.EOEnterpriseObject item;

    /**
     * Creates a new D2WDisplayToManyTable with the specified context.
     * Parameters:aContext - a WOContext.
     */
    public D2WDisplayToManyTable(com.webobjects.appserver.WOContext aContext){
         //TODO codavaj!!
    }

    /**
     * This method is intentionally undocumented. You should never have to invoke or customize it.
     */
    public com.webobjects.appserver.WOComponent inspectAction(){
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
    public java.lang.Object stringForItem(){
        return null; //TODO codavaj!!
    }

}

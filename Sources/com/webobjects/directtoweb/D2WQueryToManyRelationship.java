package com.webobjects.directtoweb;
/**
 * The D2WQueryToManyRelationship class is a property-level component that builds a query based on the value for a particular key of a destination object of a to-many relationship. Since the component fetches all of the objects that can appear in the relationship, it is slower than the D2WQueryToManyField component.
 * You can specify whether the list is collapsible and whether the user interface is a browser or table of checkboxes. You can also specify the size of the browser or number of columns of checkboxes to display.
 * Property-level components are not accessed programmatically. Instead, you use the Web Assistant or Rule Editor to choose the property-level component that Direct to Web uses to display a property on a particular entity and task page.
 * If you want to create a property-level component to query based on a property, use D2WCustomQueryComponent.
 * See Also:D2WQueryToManyField, D2WCustomQueryComponent, Serialized Form
 */
public class D2WQueryToManyRelationship extends com.webobjects.directtoweb.D2WQueryRelationship{
    /**
     * Creates an instance of D2WQueryToManyRelationship with the specified context.
     * Parameters:aContext - instance of WOContextSee Also:D2WQueryRelationship.D2WQueryRelationship(WOContext)
     */
    public D2WQueryToManyRelationship(com.webobjects.appserver.WOContext aContext){
         //TODO codavaj!!
    }

}

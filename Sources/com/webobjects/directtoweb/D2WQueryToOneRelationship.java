package com.webobjects.directtoweb;
/**
 * The D2WQueryToOneRelationship class is a property-level component that builds a query based on the value for a particular key of a destination object of a to-one relationship. Since the component fetches all of the objects that can appear in the relationship, it is slower than the D2WQueryToOneField component.
 * Property-level components are not accessed programmatically. Instead, you use the Web Assistant or Rule Editor to choose the property-level component that Direct to Web uses to display a property on a particular entity and task page.
 * If you want to create a property-level component to query based on a property, use D2WCustomQueryComponent.
 * See Also:D2WQueryToOneField, D2WCustomQueryComponent, Serialized Form
 */
public class D2WQueryToOneRelationship extends com.webobjects.directtoweb.D2WQueryRelationship{
    /**
     * Creates an instance of D2WQueryToOneRelationship with the specified context.
     * Parameters:aContext - instance of WOContextSee Also:D2WQueryRelationship.D2WQueryRelationship(WOContext)
     */
    public D2WQueryToOneRelationship(com.webobjects.appserver.WOContext aContext){
         //TODO codavaj!!
    }

}

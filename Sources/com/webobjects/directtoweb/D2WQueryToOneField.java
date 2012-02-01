package com.webobjects.directtoweb;
/**
 * The D2WQueryToOneField class is a property-level component that builds a query based on the value for a particular key of a destination object of a to-one relationship. It does not traverse the relationship.
 * Property-level components are not accessed programmatically. Instead, you use the Web Assistant or Rule Editor to choose the property-level component that Direct to Web uses to display a property on a particular entity and task page.
 * If you want to create a property-level component to query based on a property, use D2WCustomQueryComponent.
 * See Also:D2WQueryToOneRelationship, D2WCustomQueryComponent, Serialized Form
 */
public class D2WQueryToOneField extends com.webobjects.directtoweb.QueryComponent{
    /**
     * Creates an instance of D2WQueryToOneField with the specified context.
     * Parameters:aContext - instance of WOContextSee Also:QueryComponent.QueryComponent(WOContext)
     */
    public D2WQueryToOneField(com.webobjects.appserver.WOContext aContext){
         //TODO codavaj!!
    }

    /**
     * Replaces the binding value.
     * The implementation is subject to change in future releases.
     */
    public com.webobjects.appserver.WOAssociation replacementAssociationForAssociation(com.webobjects.appserver.WOAssociation oldAssociation, java.lang.String oldBinding, com.webobjects.directtoweb.generation.DTWTemplate aTemplate, com.webobjects.appserver.WOContext aContext){
        return null; //TODO codavaj!!
    }

    /**
     * Clears the local value.
     * Is needed because the current implementation uses lazy initialization to get the value in the value method.
     * The implementation is subject to change in future releases.
     */
    public void reset(){
        return; //TODO codavaj!!
    }

    /**
     * Sets the value to the specified new value.
     */
    public void setValue(java.lang.Object newValue){
        return; //TODO codavaj!!
    }

    /**
     * Gets the value.
     * Provides the value for a WOTextField. The current implementation invokes the valueForKey method on the query match of the display group.
     * The implementation is subject to change in future releases.
     */
    public java.lang.Object value(){
        return null; //TODO codavaj!!
    }

}

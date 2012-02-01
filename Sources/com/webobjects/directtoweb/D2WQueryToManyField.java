package com.webobjects.directtoweb;
/**
 * This property-level component builds a query based on the value for a particular key of a destination object of a to-many relationship.
 * Since this component does not traverse the relationship (unlike D2WQueryToManyRelationship), it is appropriate when the relationship has many objects.
 * Property-level components are not accessed programmatically. Instead, you use the Web Assistant to choose the property-level component that Direct to Web uses to display a property on a particular entity and task page.
 * If you want to create property-level component to display a property, use D2WCustomComponent.
 * See Also:Serialized Form
 */
public class D2WQueryToManyField extends com.webobjects.directtoweb.QueryComponent{
    /**
     * This method is intentionally undocumented. You should never have to invoke or customize it.
     */
    public D2WQueryToManyField(com.webobjects.appserver.WOContext aContext){
         //TODO codavaj!!
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
    public void reset(){
        return; //TODO codavaj!!
    }

    /**
     * This method is intentionally undocumented. You should never have to invoke or customize it.
     */
    public void setValue(java.lang.Object newValue){
        return; //TODO codavaj!!
    }

    /**
     * This method is intentionally undocumented. You should never have to invoke or customize it.
     */
    public java.lang.Object value(){
        return null; //TODO codavaj!!
    }

}

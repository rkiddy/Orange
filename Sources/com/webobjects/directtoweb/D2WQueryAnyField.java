package com.webobjects.directtoweb;
/**
 * This property-level component builds a query based on the destination objects of a relationship. The user can specify the key for an attribute of the destination object and a value the attribute must have. This object does not traverse the relationship, making it appropriate for relationships that contain many objects.
 * Property-level components are not accessed programmatically. Instead, you use the Web Assistant to choose the property-level component that Direct to Web uses to display a property on a particular entity and task page.
 * If you want to create property-level component to query based on a property, use D2WCustomQueryComponent.
 * See Also:Serialized Form
 */
public class D2WQueryAnyField extends com.webobjects.directtoweb.QueryComponent{
    /**
     * Creates a new D2WQueryAnyField with the specified aContext.
     * Parameters:aContext - a WOContext.
     */
    public D2WQueryAnyField(com.webobjects.appserver.WOContext aContext){
         //TODO codavaj!!
    }

    /**
     * This method is intentionally undocumented. You should never have to invoke or customize it.
     */
    public java.lang.String componentsForDisplayKeyList(){
        return null; //TODO codavaj!!
    }

    /**
     * This method is intentionally undocumented. You should never have to invoke or customize it.
     */
    public java.lang.String componentsForKeyList(){
        return null; //TODO codavaj!!
    }

    /**
     * This method is intentionally undocumented. You should never have to invoke or customize it.
     */
    public com.webobjects.directtoweb.D2WContext relationshipContext(){
        return null; //TODO codavaj!!
    }

    /**
     * This method is intentionally undocumented. You should never have to invoke or customize it.
     */
    public com.webobjects.foundation.NSArray relationshipContextDisplayAttributesKeys(){
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
    public void reset(){
        return; //TODO codavaj!!
    }

    /**
     * This method is intentionally undocumented. You should never have to invoke or customize it.
     */
    public java.lang.String selectedKey(){
        return null; //TODO codavaj!!
    }

    /**
     * This method is intentionally undocumented. You should never have to invoke or customize it.
     */
    public void setSelectedKey(java.lang.String newValue){
        return; //TODO codavaj!!
    }

    /**
     * This method is intentionally undocumented. You should never have to invoke or customize it.
     */
    public java.lang.String variableNameForKeyList(){
        return null; //TODO codavaj!!
    }

}

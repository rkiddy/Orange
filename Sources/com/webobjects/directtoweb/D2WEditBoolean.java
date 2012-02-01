package com.webobjects.directtoweb;
/**
 * This property-level component allows the user to edit a boolean stored as a number on the server. A Yes appears in the component as 1 and a No appears as 0.
 * Property-level components are not accessed programmatically. Instead, you use the Web Assistant to choose the property-level component that Direct to Web uses to display a property on a particular entity and task page.
 * If you want to create property-level component to edit a property, use D2WCustomComponent.
 * See Also:Serialized Form
 */
public class D2WEditBoolean extends com.webobjects.directtoweb.EditComponent{
    /**
     * Constructs a D2EditBoolean with the specified WOContext.
     * Parameters:aContext - a WOContext.
     */
    public D2WEditBoolean(com.webobjects.appserver.WOContext aContext){
         //TODO codavaj!!
    }

    /**
     * This method is intentionally undocumented. You should never have to invoke or customize it.
     */
    public java.lang.Object validateTakeValueForKeyPath(java.lang.Object anObject, java.lang.String aPath) throws com.webobjects.foundation.NSValidation.ValidationException{
        return null; //TODO codavaj!!
    }

    /**
     * This method is intentionally undocumented. You should never have to invoke or customize it.
     */
    public java.lang.Object value(){
        return null; //TODO codavaj!!
    }

}

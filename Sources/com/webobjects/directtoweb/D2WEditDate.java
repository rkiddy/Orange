package com.webobjects.directtoweb;
/**
 * This property-level component provides a text field for the user to enter a date. It also converts the entered text into a NSDate object with the help of a formatter that you can specify.
 * Property-level components are not accessed programmatically. Instead, you use the Web Assistant to choose the property-level component that Direct to Web uses to display a property on a particular entity and task page.
 * If you want to create property-level component to edit a property, use D2WCustomComponent.
 * See Also:Serialized Form
 */
public class D2WEditDate extends com.webobjects.directtoweb.EditComponent{
    /**
     * Creates a new D2WEditDate with the specified context.
     * Parameters:aContext - a WOContext.
     */
    public D2WEditDate(com.webobjects.appserver.WOContext aContext){
         //TODO codavaj!!
    }

    /**
     * This method is intentionally undocumented. You should never have to invoke or customize it.
     */
    public java.lang.String dateFormatDescription(){
        return null; //TODO codavaj!!
    }

}

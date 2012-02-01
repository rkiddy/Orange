package com.webobjects.directtoweb;
/**
 * The D2WQueryUnavailable class is a property-level component that displays a message stating that a query cannot be built based on this property.
 * One common usage is to indicate that queries have been disabled (for efficiency or correctness) on attributes represented by NSData.
 * Property-level components are not accessed programmatically. Instead, you use the Web Assistant or Rule Editor to choose the property-level component that Direct to Web uses to display a property on a particular entity and task page.
 * See Also:Serialized Form
 */
public class D2WQueryUnavailable extends com.webobjects.directtoweb.QueryComponent{
    /**
     * Creates an instance of D2WQueryUnavailable with the specified context.
     * Parameters:aContext - instance of WOContextSee Also:QueryComponent.QueryComponent(WOContext)
     */
    public D2WQueryUnavailable(com.webobjects.appserver.WOContext aContext){
         //TODO codavaj!!
    }

    /**
     * The current implementation does nothing.
     * The implementation is subject to change in future releases.
     */
    public void setValue(java.lang.Object newValue){
        return; //TODO codavaj!!
    }

    /**
     * The current implementation returns the empty string, i.e., "".
     * The implementation is subject to change in future releases.
     */
    public java.lang.Object value(){
        return null; //TODO codavaj!!
    }

}

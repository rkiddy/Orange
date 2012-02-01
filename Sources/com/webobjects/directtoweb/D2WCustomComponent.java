package com.webobjects.directtoweb;
/**
 * The D2WCustomComponent class is a component that allows you to use a WebObjects reusable component as a property-level component. You can use the Web Assistant to specify the name of the reusable component to embed.
 * D2WCustomComponent passes two bindings to the reusable component: object -- the object containing the property to modify or display key -- the key for the property to modify or display.
 * See Also:Serialized Form
 */
public class D2WCustomComponent extends com.webobjects.directtoweb.D2WComponent{
    /**
     * Creates an instance of D2WCustomComponent with the specified context.
     * Parameters:aContext - instance of WOContextSee Also:D2WComponent.D2WComponent(WOContext)
     */
    public D2WCustomComponent(com.webobjects.appserver.WOContext aContext){
         //TODO codavaj!!
    }

    /**
     * Invokes the validationFailedWithException method on the parent component.
     */
    public void validationFailedWithException(java.lang.Throwable theException, java.lang.Object theValue, java.lang.String theKeyPath){
        return; //TODO codavaj!!
    }

}

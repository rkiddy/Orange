package com.webobjects.directtoweb;
/**
 * The D2WDisplayImageFromPath class is a property-level component that displays an image whose name is stored in the attribute. The image must be a resource in your application or the framework that you specify in the Web Assistant.
 * Property-level components are not accessed programmatically. Instead, you use the Web Assistant to choose the property-level component that Direct to Web uses to display a property on a particular entity and task page.
 * If you want to create a property-level component to display a property, use D2WCustomComponent.
 * See Also:D2WCustomComponent, Serialized Form
 */
public class D2WDisplayImageFromPath extends com.webobjects.directtoweb.D2WStatelessComponent{
    /**
     * Creates an instance of D2WDisplayImageFromPath with the specified context.
     * Parameters:aContext - instance of WOContextSee Also:D2WStatelessComponent.D2WStatelessComponent(WOContext)
     */
    public D2WDisplayImageFromPath(com.webobjects.appserver.WOContext aContext){
         //TODO codavaj!!
    }

    /**
     * Provides the filename for a WOImage.
     * The implementation is subject to change in future releases.
     */
    public java.lang.String imageFileName(){
        return null; //TODO codavaj!!
    }

}

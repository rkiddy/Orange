package com.webobjects.directtoweb;
/**
 * D2WEditUneditable is a property-level component that displays a message stating that the property cannot be edited by the user.
 * In the current implementation, the default rules define a property to be uneditable unless the property is a relationship or an attribute that is represented by a boolean, number, or string.
 * The implementation is subject to change in future releases.
 * Property-level components are not accessed programmatically. Instead, you use the Web Assistant or Rule Editor to choose the property-level component that Direct to Web uses to display a property on a particular entity and task page.
 * See Also:Serialized Form
 */
public class D2WEditUneditable extends com.webobjects.directtoweb.D2WStatelessComponent{
    /**
     * An object that will not be edited.
     * The implementation is subject to change in future releases.
     */
    public java.lang.Object value;

    /**
     * Creates an instance of D2WEditUneditable with the specified context.
     * Parameters:aContext - instance of WOContextSee Also:D2WStatelessComponent.D2WStatelessComponent(WOContext)
     */
    public D2WEditUneditable(com.webobjects.appserver.WOContext aContext){
         //TODO codavaj!!
    }

}

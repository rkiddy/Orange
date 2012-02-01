package com.webobjects.directtoweb;
/**
 * The D2WDefaultCustomComponent class serves as the default WebObjects reusable component for D2WCustomComponent and D2WCustomQueryComponent.
 * The class is intended for internal use.
 * The implementation is subject to change in future releases.
 * See Also:D2WCustomComponent, D2WCustomQueryComponent, Serialized Form
 */
public class D2WDefaultCustomComponent extends com.webobjects.appserver.WOComponent{
    /**
     * The display group (for D2WCustomQueryComponent).
     * The implementation is subject to change in future releases.
     */
    public com.webobjects.appserver.WODisplayGroup displayGroup;

    /**
     * The key (for both D2WCustomComponent and D2WCustomQueryComponent).
     * The implementation is subject to change in future releases.
     */
    public java.lang.String key;

    /**
     * The Enterprise Object (for D2WCustomComponent).
     * The implementation is subject to change in future releases.
     */
    public com.webobjects.eocontrol.EOEnterpriseObject object;

    /**
     * Creates an instance of D2WDefaultCustomComponent with the specified context.
     * Parameters:aContext - instance of WOContextSee Also:WOComponent.WOComponent(WOContext)
     */
    public D2WDefaultCustomComponent(com.webobjects.appserver.WOContext aContext){
         //TODO codavaj!!
    }

}

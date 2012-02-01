package com.webobjects.directtoweb;
/**
 * The D2WCustomQueryComponent class is a component that allows you to use a WebObjects reusable component as a property-level component that performs queries.
 * D2WCustomQueryComponent passes two bindings to the reusable component: displayGroup - the display group that performs the query key - the key representing the objects in the display group.
 * The reusable component needs to set the query dictionaries of the display group: queryMatch, queryMax, queryMin, and queryOperator.
 * See the WODisplayGroup class specification for more information.
 * See Also:WODisplayGroup, Serialized Form
 */
public class D2WCustomQueryComponent extends com.webobjects.directtoweb.D2WComponent{
    /**
     * The display group for a WOSwitchComponent.
     * The implementation is subject to change in future releases.
     */
    public com.webobjects.appserver.WODisplayGroup displayGroup;

    /**
     * Creates an instance of D2WCustomQueryComponent with the specified context.
     * Parameters:aContext - instance of WOContextSee Also:D2WComponent.D2WComponent(WOContext)
     */
    public D2WCustomQueryComponent(com.webobjects.appserver.WOContext aContext){
         //TODO codavaj!!
    }

}

package com.webobjects.directtoweb;
/**
 * The D2WStatelessComponent class represents a stateless Direct to Web component. For a stateless component, a single instance is shared between multiple sessions. Many property-level components are stateless.
 * See Also:WOComponent.isStateless(), Serialized Form
 */
public class D2WStatelessComponent extends com.webobjects.directtoweb.D2WComponent{
    /**
     * Creates an instance of D2WStatelessComponent with the specified context.
     * Parameters:aContext - instance of WOContextSee Also:D2WComponent.D2WComponent(WOContext)
     */
    public D2WStatelessComponent(com.webobjects.appserver.WOContext aContext){
         //TODO codavaj!!
    }

    /**
     * Provides access to the local instance of D2WContext. In a stateless component, the local instance, once set, does not change until the component has been reset.
     */
    public com.webobjects.directtoweb.D2WContext d2wContext(){
        return null; //TODO codavaj!!
    }

    /**
     * Indicates that the component is stateless. Returns true for D2WStatelessComponent and its subclasses.
     */
    public boolean isStateless(){
        return false; //TODO codavaj!!
    }

    /**
     * Deprecated.
     * The method localContext has been deprecated. Use the method d2wContext instead.
     */
    public com.webobjects.directtoweb.D2WContext localContext(){
        return null; //TODO codavaj!!
    }

    /**
     * Provides access to the local instance of EOEnterpriseObject. In a stateless component, the local instance, once set, does not change until the component has been reset.
     */
    public com.webobjects.eocontrol.EOEnterpriseObject object(){
        return null; //TODO codavaj!!
    }

    /**
     * Resets the component.
     * The current implementation clears the local instance of D2WContext and the local instance of EOEnterpriseObject.
     * The implementation is subject to change in future releases.
     */
    public void reset(){
        return; //TODO codavaj!!
    }

}

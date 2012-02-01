package com.webobjects.appserver;
/**
 * The WOElement class is the abstract superclass of all objects that represent static and dynamic UI elements on a template page (for example, XML, HTML, WAP, PDF, etc elements). You cannot directly instantiate objects from WOElement; you must create a concrete subclass of WOElement and generate objects from it.
 * Note: For custom dynamic elements, you need to create a subclass of WODynamicElement.
 * WOElement declares the three methods corresponding to the phases of the request-response loop (invoked in the following order), but WOElement's implementations do nothing: takeValuesFromRequest(WORequest aRequest, WOContext aContext) invokeAction(WORequest aRequest, WOContext aContext) appendToResponse(WOResponse aResponse, WOContext aContext)
 * The first argument of these methods is an object that represents the HTTP request or response (WORequest or WOResponse). The second argument is a WOContext object that represents the context of the transaction.
 * Concrete subclasses of WOElement (or WODynamicElement) must, at minimum, implement appendToResponse. Subclasses of WODynamicElement must implement one or both of the remaining methods.
 * See Also:WOElement.takeValuesFromRequest(WORequest aRequest, WOContext aContext), WOElement.invokeAction( WORequest aRequest, WOContext aContext), WOElement.appendToResponse(WOResponse aResponse, WOContext aContext)
 */
public abstract class WOElement{
    /**
     * Return an initialized WOElement.
     */
    protected WOElement(){
         //TODO codavaj!!
    }

    /**
     * This method is invoked in WOElement objects in the request-handling phase when objects involved in the current transaction append their HTML content to the transaction's WOResponse object. If the WOElement has children WOElements, it should invoke this method on them in turn. WOElement's default implementation of this method does nothing.
     */
    public void appendToResponse(com.webobjects.appserver.WOResponse aResponse, com.webobjects.appserver.WOContext aContext){
        return; //TODO codavaj!!
    }

    /**
     * This method is invoked in WOElements in the phase of request handling that results in the triggering of an action method and the return of a response WOComponent. In this phase, the method is propagated through the element objects of the template until the dynamic element for the activated HTML control (for instance, a custom button) responds to the method by invoking the method in the request component that is bound to the action.
     * To see if it has been activated, the dynamic element should check the current element ID (obtained from the WOContext) against the sender ID in the request. Because each of the three phases of the request-response loop is traversing the same graph of objects in the same maner, the WOContext-incremented element IDs are assured to always match between phases. Therefore a dynamic element's ID generated in appendToResponse will be reached again for the same dynamic element in the two other phases.
     * Note: invokeAction is the only phase where it is safe to bypass children or subsequent elements. It is not necessary to call super.invokeAction. after invoking the action, the dynamic element should just return the value of the action.
     */
    public com.webobjects.appserver.WOActionResults invokeAction(com.webobjects.appserver.WORequest aRequest, com.webobjects.appserver.WOContext aContext){
        return null; //TODO codavaj!!
    }

    /**
     * This method is invoked on WOElement objects during the phase of request handling that extracts user-entered data. Non-WODynamicElement subclasses either do not implement this method, or forward it to their own subgraph of WOElement objects (WOComponents).
     * Any WODynamicElement implementing this method can acquire incoming data (such as HTML form data from the WORequest) or changed state (such as a check in a check box) associated with one of their attributes and assigns the value to the WOComponent variable bound to the attribute. The current WOComponent is always accessible through the passed WOContext. In this way, back-end business objects are updated. The default WOElement implementation of this method does nothing.
     */
    public void takeValuesFromRequest(com.webobjects.appserver.WORequest aRequest, com.webobjects.appserver.WOContext aContext){
        return; //TODO codavaj!!
    }

    public java.lang.String toString(){
        return null; //TODO codavaj!!
    }

}

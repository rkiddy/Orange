
package com.webobjects.appserver;



public abstract class WOElement {

    protected WOElement() { return null; }

    public void takeValuesFromRequest(WORequest worequest, WOContext wocontext) {}

    public WOActionResults invokeAction(WORequest aRequest, WOContext aContext) { return null; }

    public void appendToResponse(WOResponse woresponse, WOContext wocontext) {}

    public String toString() { return null; }
}

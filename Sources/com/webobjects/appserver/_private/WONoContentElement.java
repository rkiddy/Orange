
package com.webobjects.appserver._private;

import com.webobjects.appserver.*;

public class WONoContentElement extends WOElement
    implements WOActionResults {

    public WONoContentElement() { return null; }

    public void takeValuesFromRequest(WORequest worequest, WOContext wocontext) {}

    public WOActionResults invokeAction(WORequest aRequest, WOContext aContext) { return null; }

    public void appendToResponse(WOResponse aResponse, WOContext aContext) {}

    public WOResponse generateResponse() { return null; }
}

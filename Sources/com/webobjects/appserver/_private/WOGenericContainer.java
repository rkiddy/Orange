
package com.webobjects.appserver._private;

import com.webobjects.appserver.*;
import com.webobjects.foundation.NSDictionary;


public class WOGenericContainer extends WOGenericElement {

    public WOGenericContainer(String aName, NSDictionary someAssociations, WOElement template) { return null; }

    public void takeValuesFromRequest(WORequest aRequest, WOContext aContext) {}

    public WOActionResults invokeAction(WORequest aRequest, WOContext aContext) { return null; }

    protected boolean hasContent() { return true; }

    public void appendToResponse(WOResponse aResponse, WOContext aContext) {}
}

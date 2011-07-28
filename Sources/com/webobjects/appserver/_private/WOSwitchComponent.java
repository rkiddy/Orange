
package com.webobjects.appserver._private;

import com.webobjects.appserver.*;
import com.webobjects.foundation.NSDictionary;
import com.webobjects.foundation.NSMutableDictionary;


public class WOSwitchComponent extends WODynamicElement {


    public WOSwitchComponent(String aName, NSDictionary associations, WOElement aTemplate) { return null; }

    public String toString() { return null; }

    public String _elementNameInContext(WOContext aContext) { return null; }

    public WOElement _realComponentWithName(String aName, WOContext aContext) { return null; }

    public void takeValuesFromRequest(WORequest aRequest, WOContext aContext) {}

    public WOActionResults invokeAction(WORequest aRequest, WOContext aContext) { return null; }

    public void appendToResponse(WOResponse aResponse, WOContext aContext) {}

    WOAssociation componentName;
    public NSMutableDictionary componentAttributes;
    NSMutableDictionary componentCache;
    WOElement template;

}

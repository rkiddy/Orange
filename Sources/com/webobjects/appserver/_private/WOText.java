
package com.webobjects.appserver._private;

import com.webobjects.appserver.*;
import com.webobjects.foundation.NSDictionary;


public class WOText extends WOInput {


    public WOText(String aName, NSDictionary someAssociations, WOElement template) { return null; }

    private String _filterSoftReturnsFromString(String aString) { return null; }

    public void takeValuesFromRequest(WORequest aRequest, WOContext aContext) {}

    protected void _appendValueAttributeToResponse(WOResponse woresponse, WOContext wocontext) {}

    public void appendChildrenToResponse(WOResponse aResponse, WOContext aContext) {}

    protected boolean hasContent() { return true; }

    private static final String _softReturns = "\r\n";

}

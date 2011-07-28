
package com.webobjects.appserver._private;

import com.webobjects.appserver.*;
import com.webobjects.foundation.NSDictionary;


public class WOConditional extends WODynamicGroup {


    public WOConditional(String aName, NSDictionary associations, WOElement template) { return null; }

    protected void storeEvaluatedCondition(boolean condition, WOContext aContext) {}

    protected boolean evaluateCondition(WOContext aContext) { return true; }

    public String toString() { return null; }

    public void takeValuesFromRequest(WORequest aRequest, WOContext aContext) {}

    public WOActionResults invokeAction(WORequest aRequest, WOContext aContext) { return null; }

    public void appendToResponse(WOResponse aResponse, WOContext aContext) {}

    WOAssociation _condition;
    WOAssociation _negate;
    WOAssociation _result;

}

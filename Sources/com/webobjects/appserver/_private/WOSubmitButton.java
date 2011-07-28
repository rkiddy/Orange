
package com.webobjects.appserver._private;

import com.webobjects.appserver.*;
import com.webobjects.foundation.NSDictionary;
import com.webobjects.foundation.NSMutableDictionary;


public class WOSubmitButton extends WOInput {


    public WOSubmitButton(String aName, NSDictionary someAssociations, WOElement template) { return null; }

    protected String type() { return null; }

    public String toString() { return null; }

    public void takeValuesFromRequest(WORequest worequest, WOContext wocontext) {}

    public WOActionResults invokeAction(WORequest aRequest, WOContext aContext) { return null; }

    private String _actionClassAndName(WOContext aContext) { return null; }

    protected void _appendNameAttributeToResponse(WOResponse aResponse, WOContext aContext) {}

    public void appendToResponse(WOResponse aResponse, WOContext aContext) {}

    protected WOAssociation _action;
    protected WOAssociation _actionClass;
    protected WOAssociation _directActionName;

}

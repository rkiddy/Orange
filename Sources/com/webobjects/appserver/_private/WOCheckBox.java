
package com.webobjects.appserver._private;

import com.webobjects.appserver.*;
import com.webobjects.foundation.NSDictionary;
import com.webobjects.foundation.NSMutableDictionary;


public class WOCheckBox extends WOInput {


    public WOCheckBox(String aName, NSDictionary someAssociations, WOElement template) { return null; }

    protected String type() { return null; }

    public String toString() { return null; }

    public void takeValuesFromRequest(WORequest request, WOContext context) {}

    public void appendAttributesToResponse(WOResponse response, WOContext context) {}

    protected boolean checkedInContext(WOContext context) { return true; }

    WOAssociation _checked;
    WOAssociation _selection;

}

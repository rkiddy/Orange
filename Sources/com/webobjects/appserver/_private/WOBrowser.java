
package com.webobjects.appserver._private;

import com.webobjects.appserver.*;
import com.webobjects.foundation.*;
import java.util.ArrayList;
import java.util.List;


public class WOBrowser extends WOInputList {


    public WOBrowser(String aName, NSDictionary someAssociations, WOElement template) { return null; }

    protected boolean hasContent() { return true; }

    public String toString() { return null; }

    private void _slowTakeValuesFromRequest(WORequest request, WOContext context) {}

    private void _fastTakeValuesFromRequest(WORequest request, WOContext context) {}

    public void takeValuesFromRequest(WORequest request, WOContext context) {}

    public void appendChildrenToResponse(WOResponse response, WOContext context) {}

    protected void _appendValueAttributeToResponse(WOResponse woresponse, WOContext wocontext) {}

    public void appendAttributesToResponse(WOResponse response, WOContext context) {}

    protected Integer sizeInContext(WOContext context) { return null; }

    protected boolean multipleInContext(WOContext context) { return true; }

    protected WOAssociation _size;
    protected WOAssociation _multiple;

}

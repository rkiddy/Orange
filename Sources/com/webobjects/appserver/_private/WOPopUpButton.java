
package com.webobjects.appserver._private;

import com.webobjects.appserver.*;
import com.webobjects.foundation.*;
import java.util.List;


public class WOPopUpButton extends WOInputList {


    public WOPopUpButton(String aName, NSDictionary someAssociations, WOElement template) { return null; }

    protected boolean hasContent() { return true; }

    public String toString() { return null; }

    private void _slowTakeValuesFromRequest(WORequest request, WOContext context) {}

    private void _fastTakeValuesFromRequest(WORequest request, WOContext context) {}

    public void takeValuesFromRequest(WORequest request, WOContext context) {}

    public void appendChildrenToResponse(WOResponse response, WOContext context) {}

    protected Object selectedInContext(WOContext context) { return null; }

    protected String noSelectionStringInContext(WOContext context) { return null; }

    protected WOAssociation _selection;
    protected WOAssociation _selectedValue;
    protected WOAssociation _noSelectionString;
    public static final String WONoSelectionString = "WONoSelectionString";

}

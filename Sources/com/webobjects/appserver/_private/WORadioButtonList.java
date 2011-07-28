
package com.webobjects.appserver._private;

import com.webobjects.appserver.*;
import com.webobjects.foundation.*;
import java.util.List;


/**
 * @deprecated Class WORadioButtonList is deprecated
 */

public class WORadioButtonList extends WOInputList {


    public WORadioButtonList(String aName, NSDictionary someAssociations, WOElement template) { return null; }

    protected String type() { return null; }

    public String toString() { return null; }

    public void _slowTakeValuesFromRequest(WORequest request, WOContext context) {}

    public void _fastTakeValuesFromRequest(WORequest request, WOContext context) {}

    public void takeValuesFromRequest(WORequest request, WOContext context) {}

    public void appendToResponse(WOResponse response, WOContext context) {}

    protected Object selectedInContext(WOContext context) { return null; }

    public boolean appendStringAtLeftWithMapping(String aString, char aChar) { return true; }

    public boolean appendStringAtRightWithMapping(String aString, char aChar) { return true; }

    public boolean compactHTMLTags() { return true; }

    protected WOAssociation _selection;
    protected WOAssociation _selectedValue;

}

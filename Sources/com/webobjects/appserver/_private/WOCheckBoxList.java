
package com.webobjects.appserver._private;

import com.webobjects.appserver.*;
import com.webobjects.foundation.*;
import java.util.ArrayList;
import java.util.List;


/**
 * @deprecated Class WOCheckBoxList is deprecated
 */

public class WOCheckBoxList extends WOInputList {

    public WOCheckBoxList(String aName, NSDictionary associations, WOElement template) { return null; }

    protected String type() { return null; }

    private void _slowTakeValuesFromRequest(WORequest request, WOContext context) {}

    private void _fastTakeValuesFromRequest(WORequest request, WOContext context) {}

    public void takeValuesFromRequest(WORequest request, WOContext context) {}

    public void appendToResponse(WOResponse response, WOContext context) {}

    public boolean appendStringAtLeftWithMapping(String aString, char aChar) { return true; }

    public boolean appendStringAtRightWithMapping(String aString, char aChar) { return true; }

    public boolean compactHTMLTags() { return true; }
}

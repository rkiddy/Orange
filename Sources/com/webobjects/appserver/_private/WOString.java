
package com.webobjects.appserver._private;

import com.webobjects.appserver.*;
import com.webobjects.foundation.NSDictionary;
import com.webobjects.foundation.NSLog;
import java.text.Format;


public class WOString extends WODynamicElement {


    public WOString(String aName, NSDictionary associations, WOElement template) { return null; }

    public void appendToResponse(WOResponse aResponse, WOContext aContext) {}

    public String toString() { return null; }

    WOAssociation _dateFormat;
    WOAssociation _numberFormat;
    WOAssociation _formatter;
    WOAssociation _value;
    WOAssociation _escapeHTML;
    WOAssociation _valueWhenEmpty;
    boolean _shouldFormat;

}

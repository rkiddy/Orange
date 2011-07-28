
package com.webobjects.appserver._private;

import com.webobjects.appserver.*;
import com.webobjects.foundation.*;
import java.math.BigDecimal;
import java.text.Format;
import java.text.ParseException;


public class WOTextField extends WOInput {


    public WOTextField(String aName, NSDictionary someAssociations, WOElement template) { return null; }

    protected String type() { return null; }

    public void takeValuesFromRequest(WORequest aRequest, WOContext aContext) {}

    protected void _appendValueAttributeToResponse(WOResponse aResponse, WOContext aContext) {}

    public String toString() { return null; }

    WOAssociation _formatter;
    WOAssociation _dateFormat;
    WOAssociation _numberFormat;
    WOAssociation _useDecimalNumber;

}

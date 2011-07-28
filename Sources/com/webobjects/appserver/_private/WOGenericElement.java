
package com.webobjects.appserver._private;

import com.webobjects.appserver.*;
import com.webobjects.foundation.*;


public class WOGenericElement extends WOHTMLDynamicElement {


    public WOGenericElement(String aName, NSDictionary someAssociations, WOElement template) { return null; }

    public String toString() { return null; }

    public String _elementNameInContext(WOContext aContext) { return null; }

    public void takeValuesFromRequest(WORequest aRequest, WOContext aContext) {}

    public WOActionResults invokeAction(WORequest aRequest, WOContext aContext) { return null; }

    public void appendAttributesToResponse(WOResponse aResponse, WOContext aContext) {}

    protected boolean hasContent() { return true; }

    public void appendToResponse(WOResponse aResponse, WOContext aContext) {}

    WOAssociation _elementName;
    WOAssociation _name;
    WOAssociation _omitTags;
    WOAssociation _formValue;
    WOAssociation _formValues;
    WOAssociation _invokeAction;
    public WOAssociation _elementId;
    WOAssociation _otherTagString;
    boolean _hasFormValues;

}


package com.webobjects.appserver._private;

import com.webobjects.appserver.*;
import com.webobjects.foundation.NSDictionary;
import com.webobjects.foundation.NSMutableDictionary;
import java.util.List;


public abstract class WOInput extends WOHTMLDynamicElement {


    public WOInput(String aName, NSDictionary someAssociations, WOElement template) { return null; }

    protected String type() { return null; }

    protected boolean hasContent() { return true; }

    protected boolean defaultEscapeHTML() { return true; }

    protected boolean isValueInInputValues(Object input, Object formValues) { return true; }

    public String nameInContext(WOContext context) { return null; }

    protected String nameInContext(WOContext context, WOComponent component) { return null; }

    public void takeValuesFromRequest(WORequest request, WOContext context) {}

    protected String valueStringInContext(WOContext context) { return null; }

    protected boolean escapeHTMLInContext(WOContext context) { return true; }

    protected boolean hiddenInContext(WOContext context) { return true; }

    protected boolean isDisabledInContext(WOContext context) { return true; }

    protected void _appendTypeAttributeToResponse(WOResponse response, WOContext context) {}

    protected void _appendNameAttributeToResponse(WOResponse response, WOContext context) {}

    protected void _appendValueAttributeToResponse(WOResponse response, WOContext context) {}

    protected void _appendDisabledAttributeToResponse(WOResponse response, WOContext context) {}

    public void appendAttributesToResponse(WOResponse response, WOContext context) {}

    public String toString() { return null; }

    protected WOAssociation _disabled;
    protected WOAssociation _name;
    protected WOAssociation _value;
    protected WOAssociation _escapeHTML;
    protected WOAssociation _hidden;

}

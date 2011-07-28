
package com.webobjects.appserver._private;

import com.webobjects.appserver.*;
import com.webobjects.foundation.*;


public abstract class WOClientSideScript extends WOHTMLDynamicElement {


    public WOClientSideScript(String aName, NSDictionary someAssociations, WOElement template) { return null; }

    protected void setLanguage(String language) {}

    protected String language() { return null; }

    public void appendAttributesToResponse(WOResponse aResponse, WOContext aContext) {}

    public void appendChildrenToResponse(WOResponse aResponse, WOContext aContext) {}

    public String toString() { return null; }

    WOAssociation _scriptFile;
    WOAssociation _scriptString;
    WOAssociation _scriptSource;
    WOAssociation _hideInComment;
    WOAssociation _language;
    WOAssociation _protectInCDATA;
    WOAssociation _type;

}

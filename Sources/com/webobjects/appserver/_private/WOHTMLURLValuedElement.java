
package com.webobjects.appserver._private;

import com.webobjects.appserver.*;
import com.webobjects.foundation.*;


public abstract class WOHTMLURLValuedElement extends WOHTMLDynamicElement {


    protected String urlAttributeName() { return null; }

    protected String valueAttributeName() { return null; }

    protected WOHTMLURLValuedElement(String aName, NSDictionary someAssociations, WOElement template) { return null; }

    public String toString() { return null; }

    public WOActionResults invokeAction(WORequest aRequest, WOContext aContext) { return null; }

    protected String _imageURL(WOContext aContext) { return null; }

    protected void _appendFilenameToResponse(WOResponse aResponse, WOContext aContext) {}

    private String CGIActionURL(WOContext aContext) { return null; }

    public void appendAttributesToResponse(WOResponse aResponse, WOContext aContext) {}

    WOAssociation _src;
    WOAssociation _value;
    WOAssociation _pageName;
    WOAssociation _filename;
    WOAssociation _framework;
    WOAssociation _data;
    WOAssociation _mimeType;
    WOAssociation _key;
    WOAssociation _queryDictionary;
    WOAssociation _actionClass;
    WOAssociation _directActionName;
    NSDictionary _otherQueryAssociations;

}

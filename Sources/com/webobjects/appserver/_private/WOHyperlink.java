
package com.webobjects.appserver._private;

import com.webobjects.appserver.*;
import com.webobjects.foundation.*;


public class WOHyperlink extends WOHTMLDynamicElement {


    public WOHyperlink(String aName, NSDictionary someAssociations, WOElement template) { return null; }

    public String toString() { return null; }

    public WOActionResults invokeAction(WORequest aRequest, WOContext aContext) { return null; }

    protected void _appendOpenTagToResponse(WOResponse aResponse, WOContext aContext) {}

    protected void _appendCloseTagToResponse(WOResponse aResponse, WOContext aContext) {}

    protected void _appendQueryStringToResponse(WOResponse aResponse, WOContext aContext, String aRequestHandlerPath, boolean htmlEscapeURL, boolean defaultIncludeSessionID) {}

    protected void _appendFragmentToResponse(WOResponse aResponse, WOContext aContext) {}

    protected void _appendCGIActionURLToResponse(WOResponse aResponse, WOContext aContext, boolean htmlEscapeURL) {}

    protected void _appendComponentActionURLToResponse(WOResponse response, WOContext context, boolean escapeHTML) {}

    protected void _appendStaticURLToResponse(WOResponse response, WOContext context, boolean escapeHTML) {}

    public void appendAttributesToResponse(WOResponse aResponse, WOContext aContext) {}

    protected void _appendOpeningHrefToResponse(WOResponse response, WOContext context) {}

    protected void _appendClosingHrefToResponse(WOResponse response, WOContext context) {}

    public void appendContentStringToResponse(WOResponse aResponse, WOContext aContext) {}

    public void appendChildrenToResponse(WOResponse aResponse, WOContext aContext) {}

    protected String hrefInContext(WOContext context) { return null; }

    protected String fragmentIdentifierInContext(WOContext context) { return null; }

    protected boolean isDisabledInContext(WOContext context) { return true; }

    protected WOAssociation _action;
    protected WOAssociation _string;
    protected WOAssociation _pageName;
    protected WOAssociation _href;
    protected WOAssociation _disabled;
    protected WOAssociation _fragmentIdentifier;
    protected WOAssociation _escapeHTML;
    private final WOAssociation _queryDictionary;
    final WOAssociation _actionClass;
    final WOAssociation _directActionName;
    private NSDictionary _otherQueryAssociations;

}

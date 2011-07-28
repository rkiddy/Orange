
package com.webobjects.appserver._private;

import com.webobjects.appserver.*;
import com.webobjects.foundation.*;
import java.io.UnsupportedEncodingException;
import java.math.BigInteger;
import java.net.URLEncoder;
import java.util.*;


public abstract class WOHTMLDynamicElement extends WODynamicGroup {


    protected static boolean escapeHTML() { return null; }

    protected boolean hasContent() { return true; }

    private static boolean _needQuote(String value) { return null; }

    public WOHTMLDynamicElement(String aName, NSDictionary someAssociations, WOElement template) { return null; }

    private synchronized void _finishInitialization() { return null; }

    public String toString() { return null; }

    public String elementName() { return null; }

    public NSMutableDictionary urlAttributeAssociations() { return null; }

    public NSMutableDictionary nonUrlAttributeAssociations() { return null; }

    public NSMutableDictionary constantAttributeAssociations() { return null; }

    protected String constantAttributesRepresentation() { return null; }

    protected static String _frameworkNameInComponent(WOAssociation framework, WOComponent aComponent) { return null; }

    protected String computeActionStringInContext(WOAssociation actionClass, WOAssociation directActionName, WOContext aContext) { return null; }

    protected NSDictionary __queryDictionaryInContext(WOAssociation queryDictionary, WOContext aContext) { return null; }

    protected NSDictionary __otherQueryDictionaryInContext(NSDictionary otherQueryAssociations, WOContext aContext) { return null; }

    protected NSDictionary computeQueryDictionaryInContext(String aRequestHandlerPath, WOAssociation queryDictionary, NSDictionary otherQueryAssociations, boolean defaultIncludeSessionID, WOContext aContext) { return null; }

    protected void appendConstantAttributesToResponse(WOResponse aResponse, WOContext aContext) {}

    protected void _appendAttributesFromAssociationsToResponse(WOResponse aResponse, WOContext aContext, NSDictionary associations) {}

    protected void appendNonURLAttributesToResponse(WOResponse aResponse, WOContext aContext) {}

    protected void appendURLAttributesToResponse(WOResponse aResponse, WOContext aContext) {}

    public void appendAttributesToResponse(WOResponse aResponse, WOContext aContext) {}

    public void appendToResponse(WOResponse aResponse, WOContext aContext) {}

    public void _appendTagAttributeAndValueToResponse(WOResponse response, String tagName, String tagValue, boolean escapeHTML) {}

    protected void appendHiddenFieldToResponse(WOResponse response, String key, Object value) {}

    protected void _appendOpenTagToResponse(WOResponse response, WOContext context) {}

    protected void _appendCloseTagToResponse(WOResponse response, WOContext context) {}

    public void _appendClassAndIdToResponse(WOResponse response, WOContext context) {}

    protected String stringValueInContext(WOAssociation association, WOContext context) { return null; }

    public String classInContext(WOContext context) { return null; }

    public String idInContext(WOContext context) { return null; }

    public String styleInContext(WOContext context) { return null; }

    public String titleInContext(WOContext context) { return null; }

    protected boolean isRenderedInContext(WOContext context) { return true; }

    public boolean secureInContext(WOContext context) { return true; }

    protected String prefixInContext(WOContext context) { return null; }

    protected String suffixInContext(WOContext context) { return null; }

    protected String _dyneltName;
    protected WOAssociation _rendered;
    protected WOAssociation _class;
    protected WOAssociation _id;
    protected WOAssociation _style;
    protected WOAssociation _title;
    protected WOAssociation _secure;
    protected WOAssociation _prefix;
    protected WOAssociation _suffix;
    protected BigInteger _generatedId;
    public static final boolean EscapeHTML = true;
    public static final boolean DontEscapeHTML = false;
    private NSMutableDictionary _nonURLAttributeAssociations;
    private NSMutableDictionary _urlAttributeAssociations;
    protected NSMutableDictionary _constantAttributeAssociations;
    protected volatile String _constantAttributesRepresentation;
    protected NSMutableDictionary _associations;
    protected volatile boolean _finishedInitialization;

}

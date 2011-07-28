
package com.webobjects.appserver._private;

import com.webobjects.appserver.*;
import com.webobjects.foundation.*;
import java.util.Enumeration;


public class WOApplet extends WOHTMLDynamicElement {


    public WOApplet(String aName, NSDictionary someAssociations, WOElement template) { return null; }

    protected void setElementID(String anElementID) {}

    protected String elementID() { return null; }

    protected void setURL(String aURL) {}

    protected String url() { return null; }

    protected void setContextID(String aContextID) {}

    protected String contextID() { return null; }

    private WOParam paramWithName(WOAssociation nameAssociation, WOAssociation valueAssociation, Object target, String key, boolean treatNilValueAsWONull) { return null; }

    private NSMutableArray _archiveNamesListInContext(WOContext aContext) { return null; }

    private String _urlForArchiveNamed(String anArchiveName, WOContext aContext) { return null; }

    private NSMutableArray _archiveURLsListInContext(WOContext aContext) { return null; }

    public void appendAttributesToResponse(WOResponse aResponse, WOContext aContext) {}

    public void appendToResponse(WOResponse aResponse, WOContext aContext) {}

    public String toString() { return null; }

    private static final String WOActionURL = "WOActionURL";
    private static final String WOAssociationClass = "WOAssociationClass";
    private static final String WOKey = "WOKey";
    private static final String WOAssociationElementID = "WOAssociationElementID";
    private static final String WOAssociationContextID = "WOAssociationContextID";
    private String _elementID;
    private String _url;
    private String _contextID;
    private WOAssociation _archive;
    private WOAssociation _archiveNames;
    private WOAssociation _codeBase;

}

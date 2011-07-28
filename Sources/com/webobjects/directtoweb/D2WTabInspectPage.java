
package com.webobjects.directtoweb;

import com.webobjects.appserver.WOAssociation;
import com.webobjects.appserver.WOContext;
import com.webobjects.directtoweb.generation.DTWTemplate;
import com.webobjects.foundation.NSArray;
import com.webobjects.foundation.NSDictionary;
import java.util.Enumeration;


public class D2WTabInspectPage extends D2WInspectPage {


    public D2WTabInspectPage(WOContext aContext) { return null; }

    public NSDictionary tabContents() { return null; }

    public NSArray tabs() { return null; }

    public String tabsAsString() { return null; }

    public String displayedTabName() { return null; }

    public void setDisplayedTabName(String newValue) {}

    public boolean isPropertyInHeader() { return true; }

    public boolean tabNameIsInHeader(String tabName) { return true; }

    public WOAssociation replacementAssociationForAssociation(WOAssociation oldAssociation, String oldBinding, DTWTemplate aTemplate, WOContext aContext) { return null; }

    public String defaultRowspan() { return null; }

    private static final long serialVersionUID = 0xa83af117L;
    String _displayedTabName;
    private NSDictionary _tabContents;
    private NSArray _tabs;

}

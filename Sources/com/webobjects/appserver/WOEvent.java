
package com.webobjects.appserver;

import com.webobjects.eocontrol.EOEvent;

public class WOEvent extends EOEvent {


    public WOEvent() { return null; }

    public void setComponentName(String aComponentName) {}

    public void setPageName(String aPageName) {}

    public String title() { return null; }

    public String comment() { return null; }

    public String signatureOfType(int aType) { return null; }

    public String toString() { return null; }

    private static final long serialVersionUID = 0x23ca8fcfL;
    protected String _componentName;
    protected String _pageName;
    public static final int ComponentSignature = 1;
    public static final int PageSignature = 2;
    public static final int AssociationSignature = 3;

}

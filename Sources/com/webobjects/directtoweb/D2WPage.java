
package com.webobjects.directtoweb;

import com.webobjects.appserver.*;
import com.webobjects.directtoweb.generation.DTWTemplate;
import com.webobjects.eocontrol.EODataSource;
import com.webobjects.foundation.*;
import java.util.Enumeration;


public class D2WPage extends D2WComponent {


    public D2WPage(WOContext aContext) { return null; }

    public WOComponent nextPage() { return null; }

    public void setNextPage(WOComponent nextPage) {}

    public NextPageDelegate nextPageDelegate() { return null; }

    public void setNextPageDelegate(NextPageDelegate nextPageDelegate) {}

    public boolean showCancel() { return true; }

    public EODataSource dataSource() { return null; }

    public void setDataSource(EODataSource newValue) {}

    public boolean alternateRowColor() { return true; }

    public WOAssociation replacementAssociationForAssociation(WOAssociation oldAssociation, String oldBinding, DTWTemplate aTemplate, WOContext aContext) { return null; }

    public String descriptionForResponse(WOResponse r, WOContext c) { return null; }

    public NSMutableDictionary extraBindings() { return null; }

    public void setExtraBindings(NSMutableDictionary extraBindings) {}

    public String pageWrapperName() { return null; }

    public void finalize() throws Throwable {}

    static  {}

    private static final long serialVersionUID = 0xfee8d36eL;
    private static String _pageWrapperName;
    private Object _pageWrapperLock;
    private WOComponent _nextPage;
    private NextPageDelegate _nextPageDelegate;
    private EODataSource _dataSource;
    private NSMutableDictionary _extraBindings;

}

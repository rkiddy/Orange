
package com.webobjects.directtoweb;

import com.webobjects.appserver.WOContext;
import com.webobjects.appserver.WODisplayGroup;
import com.webobjects.eoaccess.EOEntity;
import com.webobjects.foundation.NSArray;
import com.webobjects.foundation.NSMutableArray;
import java.util.Enumeration;


public class D2WPlainListPage extends D2WListPage {


    public D2WPlainListPage(WOContext aContext) { return null; }

    public void setLocalContext(D2WContext newValue) {}

    public NSArray sortKeyList() { return null; }

    public String componentsForSortKeyList() { return null; }

    private static final long serialVersionUID = 0x99e7bedbL;
    private NSMutableArray _sortKeyList;

}

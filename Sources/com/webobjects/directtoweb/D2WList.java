
package com.webobjects.directtoweb;

import com.webobjects.appserver.WOContext;
import com.webobjects.eocontrol.*;
import com.webobjects.foundation.NSArray;


public class D2WList extends D2WEmbeddedComponent {


    public D2WList(WOContext aContext) { return null; }

    public EODataSource dataSource() { return null; }

    public void setDataSource(Object obj) {}

    private static final long serialVersionUID = 0x5cace422L;
    private EOArrayDataSource _dataSource;

}

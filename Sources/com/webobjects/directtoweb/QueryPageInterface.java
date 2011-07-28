
package com.webobjects.directtoweb;

import com.webobjects.eocontrol.EODataSource;


public interface QueryPageInterface {

    public abstract void setNextPageDelegate(NextPageDelegate nextpagedelegate);

    public abstract EODataSource queryDataSource();
}

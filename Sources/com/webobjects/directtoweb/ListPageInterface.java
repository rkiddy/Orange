
package com.webobjects.directtoweb;

import com.webobjects.appserver.WOComponent;
import com.webobjects.eocontrol.EODataSource;


public interface ListPageInterface {

    public abstract void setDataSource(EODataSource eodatasource);

    public abstract void setNextPage(WOComponent wocomponent);

    public abstract void setNextPageDelegate(NextPageDelegate nextpagedelegate);
}


package com.webobjects.directtoweb;

import com.webobjects.eocontrol.EODataSource;
import com.webobjects.eocontrol.EOEnterpriseObject;


public interface SelectPageInterface {

    public abstract void setDataSource(EODataSource eodatasource);

    public abstract EOEnterpriseObject selectedObject();

    public abstract void setSelectedObject(EOEnterpriseObject eoenterpriseobject);

    public abstract void setNextPageDelegate(NextPageDelegate nextpagedelegate);

    public abstract NextPageDelegate nextPageDelegate();
}


package com.webobjects.directtoweb;

import com.webobjects.appserver.WOComponent;
import com.webobjects.eocontrol.EOEnterpriseObject;


public interface InspectPageInterface {

    public abstract void setObject(EOEnterpriseObject eoenterpriseobject);

    public abstract void setNextPage(WOComponent wocomponent);

    public abstract void setNextPageDelegate(NextPageDelegate nextpagedelegate);
}

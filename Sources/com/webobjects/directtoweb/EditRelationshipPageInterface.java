
package com.webobjects.directtoweb;

import com.webobjects.appserver.WOComponent;
import com.webobjects.eocontrol.EOEnterpriseObject;


public interface EditRelationshipPageInterface {

    public abstract void setMasterObjectAndRelationshipKey(EOEnterpriseObject eoenterpriseobject, String s);

    public abstract void setNextPage(WOComponent wocomponent);

    public abstract void setNextPageDelegate(NextPageDelegate nextpagedelegate);
}

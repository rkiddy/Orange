
package com.webobjects.directtoweb;

import com.webobjects.appserver.WOContext;
import com.webobjects.eocontrol.EOEnterpriseObject;


public class D2WStatelessComponent extends D2WComponent {


    public D2WStatelessComponent(WOContext aContext) { return null; }

    public boolean isStateless() { return true; }

    /**
     * @deprecated Method localContext is deprecated
     */

    public D2WContext localContext() { return null; }

    public D2WContext d2wContext() { return null; }

    public EOEnterpriseObject object() { return null; }

    public void reset() {}

    private static final long serialVersionUID = 0xc489d6a3L;

}

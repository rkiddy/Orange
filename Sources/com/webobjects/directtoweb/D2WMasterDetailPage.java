
package com.webobjects.directtoweb;

import com.webobjects.appserver.*;
import com.webobjects.directtoweb.generation.DTWTemplate;
import com.webobjects.eocontrol.EOEditingContext;
import com.webobjects.eocontrol.EOEnterpriseObject;


public class D2WMasterDetailPage extends D2WPage
    implements ListPageInterface {
    class SelectPageDelegate
        implements NextPageDelegate, DelegateGeneration {


        SelectPageDelegate() { return null; }

        public WOComponent nextPage(WOComponent sender) { return null; }

        public String generationString() { return null; }

        final D2WMasterDetailPage this$0;

    }



    public D2WMasterDetailPage(WOContext aContext) { return null; }

    public NextPageDelegate selectPageDelegate() { return null; }

    public void setSelectPageDelegate(Object obj) {}

    public NextPageDelegate masterDetailPageDelegate() { return null; }

    public void setEditPageDelegate(Object obj) {}

    public boolean isObjectSelected() { return true; }

    /**
     * @deprecated Method backAction is deprecated
     */

    public WOComponent backAction() { return null; }

    public WOComponent listReturnAction() { return null; }

    public WOAssociation replacementAssociationForAssociation(WOAssociation oldAssociation, String oldBinding, DTWTemplate aTemplate, WOContext aContext) { return null; }

    private static final long serialVersionUID = 0xebdc4f78L;
    public EOEnterpriseObject selectedObject;
    private boolean _wasGenerated;


    // Unreferenced inner class com/webobjects/directtoweb/D2WMasterDetailPage$1

/* anonymous class */
    class _cls1
        implements NextPageDelegate {


        _cls1() { return null; }

        public WOComponent nextPage(WOComponent sender) { return null; }

        final D2WMasterDetailPage this$0;

    }

}


package com.webobjects.directtoweb;

import com.webobjects.appserver.WOComponent;
import com.webobjects.appserver.WOContext;


public class D2WEmbeddedComponent extends WOComponent {


    public D2WEmbeddedComponent(WOContext aContext) { return null; }

    public static WOComponent findTarget(WOComponent sender) { return null; }

    public void awake() {}

    public boolean synchronizesVariablesWithBindings() { return true; }

    public NextPageDelegate newPageDelegate() { return null; }

    public NextPageDelegate actionPageDelegate() { return null; }

    public void setActionPageDelegate(NextPageDelegate nextpagedelegate) {}

    private static final long serialVersionUID = 0x18822646L;
    protected NextPageDelegate _actionPageDelegate;

}

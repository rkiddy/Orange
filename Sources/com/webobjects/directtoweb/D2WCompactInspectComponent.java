
package com.webobjects.directtoweb;

import com.webobjects.appserver.WOComponent;
import com.webobjects.appserver.WOContext;
import com.webobjects.eoaccess.EOGeneralAdaptorException;
import com.webobjects.eocontrol.EOEditingContext;
import com.webobjects.eocontrol.EOEnterpriseObject;
import com.webobjects.foundation.NSForwardException;
import com.webobjects.foundation.NSValidation;


public class D2WCompactInspectComponent extends D2WComponent {


    public D2WCompactInspectComponent(WOContext aContext) { return null; }

    public WOComponent inspectObjectAction() { return null; }

    public String backgroundColorForRow() { return null; }

    WOComponent editObjectAction() { return null; }

    public WOComponent deleteObjectAction() throws Throwable { return null; }

    public WOComponent selectObjectAction() { return null; }

    public boolean isSelecting() { return true; }

    private static final long serialVersionUID = 0xcc7f1ee9L;
    private boolean _rowFlip;

}

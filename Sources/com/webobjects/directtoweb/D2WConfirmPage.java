
package com.webobjects.directtoweb;

import com.webobjects.appserver.*;
import com.webobjects.directtoweb.generation.DTWGeneration;
import com.webobjects.directtoweb.generation.DTWTemplate;


public class D2WConfirmPage extends D2WPage
    implements DTWGeneration, ConfirmPageInterface {


    public D2WConfirmPage(WOContext aContext) { return null; }

    public void setConfirmDelegate(NextPageDelegate nextPage) {}

    public void setCancelDelegate(NextPageDelegate nextPage) {}

    public String message() { return null; }

    public void setMessage(String aMessage) {}

    public WOComponent confirmAction() throws Throwable { return null; }

    public WOComponent cancelAction() throws Throwable { return null; }

    public WOAssociation replacementAssociationForAssociation(WOAssociation oldAssociation, String oldBinding, DTWTemplate aTemplate, WOContext aContext) { return null; }

    private static final long serialVersionUID = 0xa1a7ff86L;
    protected NextPageDelegate _confirmPageDelegate;
    protected NextPageDelegate _cancelDelegate;
    protected String _messageString;

}

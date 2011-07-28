
package com.webobjects.directtoweb;

import com.webobjects.appserver.*;
import com.webobjects.directtoweb.generation.DTWGeneration;
import com.webobjects.directtoweb.generation.DTWTemplate;


public class D2WErrorPage extends D2WPage
    implements ErrorPageInterface, DTWGeneration {


    public D2WErrorPage(WOContext aContext) { return null; }

    public String message() { return null; }

    public void setMessage(String newValue) {}

    public String formattedMessage() { return null; }

    public String firstLineOfMessage() { return null; }

    public boolean hasNextPage() { return true; }

    public WOComponent cancelAction() { return null; }

    public WOAssociation replacementAssociationForAssociation(WOAssociation oldAssociation, String oldBinding, DTWTemplate aTemplate, WOContext aContext) { return null; }

    private static final long serialVersionUID = 0x2f15c4b1L;
    private String _message;

}

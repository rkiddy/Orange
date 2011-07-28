
package com.webobjects.directtoweb;

import com.webobjects.appserver.WOAssociation;
import com.webobjects.appserver.WOContext;
import com.webobjects.directtoweb.generation.DTWTemplate;
import com.webobjects.eocontrol.EOEnterpriseObject;


public class D2WDisplayToManyBrowser extends D2WDisplayToMany {


    public D2WDisplayToManyBrowser(WOContext aContext) { return null; }

    public String browserStringForItem() { return null; }

    public String ivarNameForBrowserItem() { return null; }

    public String methodNameInspectArrayAction() { return null; }

    public String methodNameForBrowserStringForItem() { return null; }

    public WOAssociation replacementAssociationForAssociation(WOAssociation oldAssociation, String oldBinding, DTWTemplate aTemplate, WOContext aContext) { return null; }

    private static final long serialVersionUID = 0xdd8dd25aL;
    public EOEnterpriseObject browserItem;

}


package com.webobjects.directtoweb;

import com.webobjects.appserver.*;
import com.webobjects.directtoweb.generation.DTWTemplate;
import com.webobjects.eoaccess.EOEntity;
import com.webobjects.eoaccess.EORelationship;
import com.webobjects.eocontrol.EOEnterpriseObject;
import com.webobjects.foundation.NSArray;


public class D2WEditToManyFault extends D2WComponent {


    public D2WEditToManyFault(WOContext aContext) { return null; }

    public NSArray browserList() { return null; }

    public String browserListDescription() { return null; }

    public String plurifiedStrings() { return null; }

    public String browserStringForItem() { return null; }

    public WOComponent editValues() { return null; }

    public String ivarNameForBrowserItem() { return null; }

    public String helpString() { return null; }

    public String methodNameForEditValues() { return null; }

    public String methodNameListDescription() { return null; }

    public String methodNameBrowserListDescription() { return null; }

    public WOAssociation replacementAssociationForAssociation(WOAssociation oldAssociation, String oldBinding, DTWTemplate aTemplate, WOContext aContext) { return null; }

    private static final long serialVersionUID = 0x28a6f8a9L;
    public EOEnterpriseObject browserItem;

}

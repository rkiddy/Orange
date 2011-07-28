
package com.webobjects.directtoweb;

import com.webobjects.appserver.*;
import com.webobjects.directtoweb.generation.DTWGeneration;
import com.webobjects.directtoweb.generation.DTWTemplate;
import com.webobjects.eoaccess.EOEntity;
import com.webobjects.eoaccess.EORelationship;
import com.webobjects.eocontrol.*;
import com.webobjects.foundation.NSArray;


public class D2WDisplayToMany extends D2WComponent
    implements DTWGeneration {


    public D2WDisplayToMany(WOContext aContext) { return null; }

    public NSArray list() { return null; }

    public void setList(Object obj) {}

    public String listDescription() { return null; }

    public String plurifiedStrings() { return null; }

    public boolean shouldDisplay() { return true; }

    public String inspectArrayActionString() { return null; }

    public WOComponent inspectArrayAction() { return null; }

    public void setInspectArrayAction(Object obj) {}

    public String methodNameInspectAction() { return null; }

    public String ivarNameForBrowserItem() { return null; }

    public String methodNameInspectArrayAction() { return null; }

    public String methodNameListDescription() { return null; }

    public String methodNameForShouldDisplay() { return null; }

    public WOAssociation replacementAssociationForAssociation(WOAssociation oldAssociation, String oldBinding, DTWTemplate aTemplate, WOContext aContext) { return null; }

    private static final long serialVersionUID = 0x7800c69L;

}

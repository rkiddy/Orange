
package com.webobjects.directtoweb;

import com.webobjects.appserver.*;
import com.webobjects.directtoweb.generation.DTWTemplate;
import com.webobjects.eocontrol.EOEnterpriseObject;


public class D2WDisplayToManyTable extends D2WDisplayToMany {


    public D2WDisplayToManyTable(WOContext aContext) { return null; }

    public Object stringForItem() { return null; }

    public WOComponent inspectAction() { return null; }

    public WOAssociation replacementAssociationForAssociation(WOAssociation oldAssociation, String oldBinding, DTWTemplate aTemplate, WOContext aContext) { return null; }

    private static final long serialVersionUID = 1L;
    public EOEnterpriseObject item;

}

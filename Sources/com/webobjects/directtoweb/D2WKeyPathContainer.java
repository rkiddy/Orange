
package com.webobjects.directtoweb;

import com.webobjects.appserver.*;
import com.webobjects.directtoweb.generation.DTWGeneration;
import com.webobjects.directtoweb.generation.DTWTemplate;
import com.webobjects.eocontrol.EOEnterpriseObject;
import com.webobjects.foundation.NSArray;


public class D2WKeyPathContainer extends D2WComponent
    implements DTWGeneration {


    public D2WKeyPathContainer(WOContext aContext) { return null; }

    public NSArray list() { return null; }

    public String partialPropertyKeyPath() { return null; }

    public void setObject(EOEnterpriseObject eo) {}

    public String listDescription() { return null; }

    public D2WContext subContext() { return null; }

    public WOComponent inspectEO() { return null; }

    public String methodNameForList() { return null; }

    public String methodNameForInspect() { return null; }

    public String methodNameListDescription() { return null; }

    public String ivarNameForRepetition() { return null; }

    public String partialValueForKeyString() { return null; }

    public WOAssociation replacementAssociationForAssociation(WOAssociation oldAssociation, String oldBinding, DTWTemplate aTemplate, WOContext aContext) { return null; }

    private static final long serialVersionUID = 0xaa6021bcL;
    public EOEnterpriseObject listEo;
    private NSArray _list;
    private String _partialPropertyKeyPath;
    private D2WContext _subContext;

}


package com.webobjects.directtoweb;

import com.webobjects.appserver.*;
import com.webobjects.directtoweb.generation.DTWGeneration;
import com.webobjects.directtoweb.generation.DTWTemplate;
import com.webobjects.eoaccess.EOEntity;
import com.webobjects.eocontrol.EOEnterpriseObject;


public class D2WDisplayToOneFault extends D2WStatelessComponent
    implements DTWGeneration {


    public D2WDisplayToOneFault(WOContext aContext) { return null; }

    private EOEnterpriseObject _eo() { return null; }

    public WOComponent toOneAction() { return null; }

    public boolean shouldDisplay() { return true; }

    public String helpString() { return null; }

    public String methodNameForShouldDisplay() { return null; }

    public String methodNameForToOneAction() { return null; }

    public WOAssociation replacementAssociationForAssociation(WOAssociation oldAssociation, String oldBinding, DTWTemplate aTemplate, WOContext aContext) { return null; }

    private static final long serialVersionUID = 0x1b7a4c44L;
    private String _helpString;

}

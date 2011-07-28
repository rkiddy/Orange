
package com.webobjects.directtoweb;

import com.webobjects.appserver.*;
import com.webobjects.directtoweb.generation.DTWGeneration;
import com.webobjects.directtoweb.generation.DTWTemplate;
import com.webobjects.eoaccess.EOEntity;
import com.webobjects.eoaccess.EORelationship;


public class D2WEditToOneFault extends D2WDisplayToOne
    implements DTWGeneration {


    public D2WEditToOneFault(WOContext aContext) { return null; }

    public WOComponent editRelationship() { return null; }

    public String methodNameForEditRelationship() { return null; }

    public String helpString() { return null; }

    public WOAssociation replacementAssociationForAssociation(WOAssociation oldAssociation, String oldBinding, DTWTemplate aTemplate, WOContext aContext) { return null; }

    private static final long serialVersionUID = 0x3fe97b00L;

}

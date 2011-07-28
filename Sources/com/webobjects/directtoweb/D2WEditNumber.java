
package com.webobjects.directtoweb;

import com.webobjects.appserver.WOAssociation;
import com.webobjects.appserver.WOContext;
import com.webobjects.directtoweb.generation.DTWGeneration;
import com.webobjects.directtoweb.generation.DTWTemplate;
import com.webobjects.eoaccess.EOAttribute;


public class D2WEditNumber extends EditComponent
    implements DTWGeneration {


    public D2WEditNumber(WOContext aContext) { return null; }

    public boolean isDecimalNumber() { return true; }

    public WOAssociation replacementAssociationForAssociation(WOAssociation oldAssociation, String oldBinding, DTWTemplate aTemplate, WOContext aContext) { return null; }

    private static final long serialVersionUID = 0xbadb2b81L;

}

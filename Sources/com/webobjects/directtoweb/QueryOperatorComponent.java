
package com.webobjects.directtoweb;

import com.webobjects.appserver.*;
import com.webobjects.directtoweb.generation.DTWGeneration;
import com.webobjects.directtoweb.generation.DTWTemplate;
import com.webobjects.foundation.NSMutableDictionary;


public class QueryOperatorComponent extends QueryComponent
    implements DTWGeneration {


    public QueryOperatorComponent(WOContext aContext) { return null; }

    public String anOperator() { return null; }

    public void setAnOperator(String aString) {}

    public WOAssociation replacementAssociationForAssociation(WOAssociation oldAssociation, String oldBinding, DTWTemplate aTemplate, WOContext aContext) { return null; }

    private static final long serialVersionUID = 0x4d252d54L;

}

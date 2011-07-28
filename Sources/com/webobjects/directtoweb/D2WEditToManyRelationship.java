
package com.webobjects.directtoweb;

import com.webobjects.appserver.WOAssociation;
import com.webobjects.appserver.WOContext;
import com.webobjects.directtoweb.generation.DTWTemplate;
import com.webobjects.eoaccess.EOEntity;
import com.webobjects.eoaccess.EORelationship;
import com.webobjects.eocontrol.EOEnterpriseObject;
import com.webobjects.foundation.NSArray;


public class D2WEditToManyRelationship extends EditRelationship {


    public D2WEditToManyRelationship(WOContext aContext) { return null; }

    public NSArray list() { return null; }

    public String toManyDescription() { return null; }

    public String methodNameToManyDescription() { return null; }

    public String plurifiedStrings() { return null; }

    public WOAssociation replacementAssociationForAssociation(WOAssociation oldAssociation, String oldBinding, DTWTemplate aTemplate, WOContext aContext) { return null; }

    private static final long serialVersionUID = 0xa7d694aaL;

}


package com.webobjects.directtoweb;

import com.webobjects.appserver.*;
import com.webobjects.directtoweb.generation.DTWGeneration;
import com.webobjects.directtoweb.generation.DTWTemplate;
import com.webobjects.eoaccess.EODatabaseDataSource;
import com.webobjects.eoaccess.EOEntity;
import com.webobjects.eocontrol.*;


public class D2WQueryPage extends D2WPage
    implements QueryPageInterface, DTWGeneration {


    public D2WQueryPage(WOContext aContext) { return null; }

    public EOQualifier qualifier() { return null; }

    public int fetchLimit() { return 0; }

    public boolean isDeep() { return true; }

    public boolean usesDistinct() { return true; }

    public boolean refreshRefetchedObjects() { return true; }

    public EODataSource queryDataSource() { return null; }

    public String fetchSpecOptions() { return null; }

    public void setQueryDataSource(EODataSource newValue) {}

    public WOComponent queryAction() { return null; }

    public WOAssociation replacementAssociationForAssociation(WOAssociation oldAssociation, String oldBinding, DTWTemplate aTemplate, WOContext aContext) { return null; }

    private static final long serialVersionUID = 0x666ebb37L;
    public WODisplayGroup displayGroup;

}

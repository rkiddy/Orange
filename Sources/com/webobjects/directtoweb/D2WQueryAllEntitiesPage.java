
package com.webobjects.directtoweb;

import com.webobjects.appserver.*;
import com.webobjects.directtoweb.generation.DTWGeneration;
import com.webobjects.directtoweb.generation.DTWTemplate;
import com.webobjects.eoaccess.EODatabaseDataSource;
import com.webobjects.eoaccess.EOEntity;
import com.webobjects.eocontrol.EODataSource;
import com.webobjects.foundation.NSMutableDictionary;


public class D2WQueryAllEntitiesPage extends D2WPage
    implements QueryAllPageInterface, DTWGeneration {


    public D2WQueryAllEntitiesPage(WOContext aContext) { return null; }

    public EODataSource queryDataSource() { return null; }

    public WOComponent showRegularQueryAction() { return null; }

    public WOComponent queryAction() { return null; }

    public WOAssociation replacementAssociationForAssociation(WOAssociation oldAssociation, String oldBinding, DTWTemplate aTemplate, WOContext aContext) { return null; }

    private static final long serialVersionUID = 0x321d76a6L;
    public WODisplayGroup displayGroup;
    private EODatabaseDataSource _queryDataSource;

}

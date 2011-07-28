
package com.webobjects.directtoweb;

import com.webobjects.appserver.*;
import com.webobjects.directtoweb.generation.DTWGeneration;
import com.webobjects.directtoweb.generation.DTWTemplate;
import com.webobjects.eoaccess.EOEntity;
import com.webobjects.eoaccess.EOUtilities;
import com.webobjects.eocontrol.*;
import com.webobjects.foundation.NSArray;
import java.util.Enumeration;


public class D2WEditRelationshipPage extends D2WPage
    implements EditRelationshipPageInterface, DTWGeneration {


    public D2WEditRelationshipPage(WOContext aContext) { return null; }

    public boolean editingContextShouldValidateChanges(EOEditingContext editingContext) { return true; }

    public void setMasterObjectAndRelationshipKey(EOEnterpriseObject eo, String relationshipKey) {}

    public void awake() {}

    public void sleep() {}

    protected void setEditingContext(EOEditingContext newEditingContext) {}

    public String displayKey() { return null; }

    public boolean displayQuery() { return true; }

    public boolean displayList() { return true; }

    public boolean displayNew() { return true; }

    public String browserStringForItem() { return null; }

    public String toOneDescription() { return null; }

    public String displayNameForRelationshipKey() { return null; }

    public EOEnterpriseObject objectToAddToRelationship() { return null; }

    public void setObjectToAddToRelationship(EOEnterpriseObject newValue) {}

    public WOComponent queryAction() { return null; }

    public WOComponent selectAction() { return null; }

    public WOComponent removeFromToManyRelationshipAction() { return null; }

    public WOComponent removeFromToOneRelationshipAction() { return null; }

    public WOComponent displayQueryAction() { return null; }

    public WOComponent returnAction() { return null; }

    public WOComponent newObjectAction() { return null; }

    public EOEnterpriseObject newObjectInRelationship() { return null; }

    public void setNewObjectInRelationship(Object obj) {}

    public WOComponent saveAction() { return null; }

    public WOAssociation replacementAssociationForAssociation(WOAssociation oldAssociation, String oldBinding, DTWTemplate aTemplate, WOContext aContext) { return null; }

    private static final long serialVersionUID = 0x8d213fb6L;
    public static final int QUERY = 0;
    public static final int LIST = 1;
    public static final int NEW = 2;
    int _state;
    public EODataSource selectDataSource;
    protected EOEnterpriseObject _eoToAddToRelationship;
    protected EOEnterpriseObject _newEOInRelationship;
    protected EOEditingContext _editingContext;
    private String _relationshipKey;
    public WODisplayGroup relationshipDisplayGroup;
    public EOEnterpriseObject browserItem;
    public NSArray browserSelections;
    public boolean isRelationshipToMany;

}


package com.webobjects.eogeneration;

import com.webobjects.eoapplication.*;
import com.webobjects.eocontrol.*;
import com.webobjects.eointerface.*;
import com.webobjects.foundation.*;


public abstract class EOEditingController extends EODocumentController {


    public EOEditingController() { return null; }

    public EOEditingController(EOXMLUnarchiver unarchiver) { return null; }

    public NSMutableDictionary _xmlParameters() { return null; }

    public void dispose() {}

    protected boolean disposeIfTransient() { return true; }

    protected void connectionWasEstablished() {}

    protected void connectionWasBroken() {}

    public boolean fetchesOnConnect() { return true; }

    public void setRelationshipPath(String string) {}

    public String relationshipPath() { return null; }

    public void setMandatoryRelationshipPaths(NSArray relationshipPaths) {}

    protected NSArray mandatoryRelationshipPaths() { return null; }

    protected boolean _canSelectWithEntityName() { return true; }

    protected boolean _canInsertWithEntityName() { return true; }

    protected boolean _canOpenGlobalIDsWithEntityName() { return true; }

    protected boolean _canOpenWithEntityName() { return true; }

    protected boolean _canSelectByInsertingWithEntityName() { return true; }

    protected boolean _relationshipPathRepresentsToOneRelationship() { return true; }

    protected boolean _relationshipPathRepresentsToOneRelationshipWithAutomaticallyCreatedObject() { return true; }

    private boolean _canOpenWithRelationshipPath() { return true; }

    public void setEntityName(String string) {}

    public String entityName() { return null; }

    protected String _derivedLabel() { return null; }

    protected EODisplayGroup _defaultDisplayGroup() { return null; }

    public EODisplayGroup newDisplayGroup() { return null; }

    private EOEnterpriseObject _masterObject() { return null; }

    private String _masterEntityName() { return null; }

    private EODisplayGroup _masterDisplayGroup() { return null; }

    public void setMasterDetailAssociation(EOMasterDetailAssociation association) {}

    public EOMasterDetailAssociation masterDetailAssociation() { return null; }

    protected NSArray defaultActions() { return null; }

    public boolean canPerformActionNamed(String actionName) { return true; }

    private NSDictionary _filteredMandatoryRelationshipPathsForInsertionToEntityNamesMapTable(NSArray mandatoryRelationshipPaths, String ignoreEntityName, String ignoreRelationshipPath, NSDictionary prefilledRelationshipPathsToGlobalIDsMapTable) { return null; }

    protected boolean _insertWithFillingRelationships(String ignoreEntityName, NSDictionary prefilledRelationshipPathsToGlobalIDsMapTable, boolean canInsertMultipleObjects) { return true; }

    public boolean insert() { return true; }

    protected boolean _deleteIfNoRelationshipPath(boolean saveImmediately, boolean makeInvisibleAfterImmediateSave) { return true; }

    public boolean delete() { return true; }

    private NSDictionary _filteredMandatoryRelationshipPathsForOpeningToEntityNamesMapTable(NSArray mandatoryRelationshipPaths, String ignoreEntityName, String ignoreRelationshipPath) { return null; }

    protected boolean _openSelectedObjectsWithTask(String ignoreEntityName) { return true; }

    public boolean openWithTask() { return true; }

    protected void _finishModalAction() {}

    public String toString() { return null; }

    static  {}

    public static final Class _CLASS;
    private EOMasterDetailAssociation _masterDetailAssociation;
    private String _relationshipPath;
    private NSArray _mandatoryRelationshipPaths;
    private String _derivedEntityName;
    private int _canSelectWithEntityName;
    private int _canInsertWithEntityName;
    private int _canOpenGlobalIDsWithEntityName;
    private int _canOpenWithEntityName;
    private int _canSelectByInsertingWithEntityName;
    private int _relationshipPathRepresentsToOneRelationship;
    private int _relationshipPathRepresentsToOneRelationshipWithAutomaticallyCreatedObject;
    private int _canOpenWithRelationshipPath;

}

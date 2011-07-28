
package com.webobjects.eogeneration;

import com.webobjects.eoapplication.*;
import com.webobjects.eocontrol.EOGlobalID;
import com.webobjects.foundation.*;


public class EOFormController extends EOEditingController
    implements com.webobjects.eoapplication.EOModalDialogController.ModalActions, EOControllerFactory.Insert, EOControllerFactory.Open, EOControllerFactory.SelectByInserting {


    public EOFormController() { return null; }

    public EOFormController(EOXMLUnarchiver unarchiver) { return null; }

    protected NSArray defaultActions() { return null; }

    public boolean canPerformActionNamed(String actionName) { return true; }

    public boolean canRevert() { return true; }

    public boolean canSave() { return true; }

    protected boolean _saveIfUserConfirms(String operationTitle, String message, boolean allowChooseOperation) { return true; }

    public boolean save() { return true; }

    public boolean insert() { return true; }

    public boolean delete() { return true; }

    public boolean insertWithTask() { return true; }

    public boolean openWithTask() { return true; }

    public void cancel() {}

    public boolean ok() { return true; }

    public boolean modalDialogShouldClose() { return true; }

    public boolean insertNewObject() { return true; }

    public boolean insertNewObjectWithRelationshipPathsFilled(NSDictionary relationshipPathToGlobalIDsMapTable) { return true; }

    public void openObjectWithGlobalID(EOGlobalID globalID) {}

    public void prepareToSelectByInserting() {}

    public EOGlobalID provideSelectedObjectGlobalID() { return null; }

    public void finishSelecting() {}

    static  {}

    public static final Class _CLASS;
    private Class _currentTask;
    private Object _currentTaskReturnValue;

}

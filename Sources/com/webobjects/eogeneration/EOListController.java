
package com.webobjects.eogeneration;

import com.webobjects.eoapplication.*;
import com.webobjects.eocontrol.EOFetchSpecification;
import com.webobjects.eocontrol.EOGlobalID;
import com.webobjects.foundation.*;


public class EOListController extends EOEditingController
    implements com.webobjects.eoapplication.EOModalDialogController.ModalActions, EOWidgetController.DefaultAction, EOControllerFactory.Select, EOControllerFactory.List {


    public EOListController() { return null; }

    public EOListController(EOXMLUnarchiver unarchiver) { return null; }

    protected NSArray defaultActions() { return null; }

    public boolean canPerformActionNamed(String actionName) { return true; }

    public void defaultAction() {}

    public boolean save() { return true; }

    public boolean insert() { return true; }

    public boolean delete() { return true; }

    public boolean insertWithTask() { return true; }

    public boolean openWithTask() { return true; }

    public void cancel() {}

    public boolean ok() { return true; }

    public boolean modalDialogShouldClose() { return true; }

    public boolean isDocumentForGlobalID(EOGlobalID globalID, String entityName) { return true; }

    public void listObjectsWithFetchSpecification(EOFetchSpecification fetchSpecification) {}

    public void listObjectsWithGlobalIDs(NSArray globalIDs) {}

    private void _allowMultipleObjects(boolean flag) {}

    public void prepareToSelect(boolean allowMultipleObjects, boolean allowInsertingObject) {}

    public EOGlobalID provideSelectedObjectGlobalID() { return null; }

    public NSArray provideSelectedObjectsGlobalIDs() { return null; }

    public void finishSelecting() {}

    static  {}

    public static final Class _CLASS;
    private Class _currentTask;
    private boolean _currentTaskAllowsMultipleObjects;
    private boolean _currentTaskAllowsInsertingObject;
    private Object _currentTaskReturnValue;

}

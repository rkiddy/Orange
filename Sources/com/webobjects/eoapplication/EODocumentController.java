
package com.webobjects.eoapplication;

import com.webobjects.eocontrol.EOEditingContext;
import com.webobjects.eocontrol.EOGlobalID;
import com.webobjects.eointerface.EOAssociation;
import com.webobjects.eointerface.EODisplayGroup;
import com.webobjects.foundation.*;


public class EODocumentController extends EOEntityController
    implements EOObjectDisplayDocument, EOEditable {


    public static boolean _saveChangesIfEditedIfUserConfirms(EOController controller, String operationTitle) { return null; }

    public EODocumentController() { return null; }

    public EODocumentController(EOXMLUnarchiver unarchiver) { return null; }

    public void dispose() {}

    public NSMutableDictionary _xmlParameters() { return null; }

    public void prepareForNewTask(boolean prepareSubcontrollersForNewTask) {}

    protected void connectionWasEstablished() {}

    public boolean isRootDocumentController() { return true; }

    public boolean _isRootObjectDisplayDocumentController() { return true; }

    private void _updateEditability() {}

    public void setEditability(int editability) {}

    public int editability() { return 0; }

    public boolean isEditable() { return true; }

    public boolean _isOrIsSubcontrollerEditable() { return true; }

    public void supercontrollerEditabilityDidChange() {}

    public void takeResponsibilityForEditabilityOfAssociation(EOAssociation association) {}

    public void handleEditingContextNotification(NSNotification notification) {}

    protected NSUndoManager _editingContextUndoManager() { return null; }

    protected void saveFailed(Exception exception, boolean showErrorDialog, String saveOperationTitle) {}

    public boolean saveChanges(boolean showErrorDialog, String saveOperationTitle) { return true; }

    protected void revertFailed(Exception exception, boolean showErrorDialog) {}

    public boolean revertChanges(boolean showErrorDialog) { return true; }

    public boolean isDocumentForGlobalID(EOGlobalID globalID, String entityName) { return true; }

    protected void wasEdited() {}

    public void setEdited(boolean flag) {}

    public boolean isEdited() { return true; }

    public void insertObject() {}

    public void deleteSelectedObjects() {}

    protected NSArray defaultActions() { return null; }

    public boolean canPerformActionNamed(String actionName) { return true; }

    public boolean canUndo() { return true; }

    public void undo() {}

    public boolean canRedo() { return true; }

    public void redo() {}

    public boolean canSave() { return true; }

    public boolean save() { return true; }

    public boolean canRevert() { return true; }

    public boolean revert() { return true; }

    protected boolean _saveIfUserConfirms(String operationTitle, String message, boolean allowChooseOperation) { return true; }

    public boolean saveIfUserConfirms(String operationTitle, String message) { return true; }

    public boolean saveIfUserConfirms() { return true; }

    public boolean saveIfUserConfirmsAndMakeInvisible(String operationTitle, String message) { return true; }

    public boolean saveIfUserConfirmsAndMakeInvisible() { return true; }

    public boolean saveAndMakeInvisible() { return true; }

    public boolean revertAndMakeInvisible() { return true; }

    public String toString() { return null; }

    static  {}

    public static final Class _CLASS;
    private boolean _isEdited;
    private int _editability;
    private NSMutableArray _editabilityAssociations;

}

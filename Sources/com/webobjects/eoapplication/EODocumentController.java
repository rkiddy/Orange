package com.webobjects.eoapplication;
/**
 * The EODocumentController class provides behavior for displaying and editing enterprise objects in a user interface. EODocumentController's API is mostly specified by the interfaces EODocument and EOEditable. Additionally, much of the way that EODocumentController works is set up by its superclass, EOEntityController. Since EOEntityControllers use EOEditingContexts and EODisplayGroups to manage and display a set of enterprise objects, EODocumentControllers use them as well. However, in addition to displaying enterprise objects, document controllers also edit the displayed objects. You can insert, update, and delete enterprise objects; undo and redo unsaved changes; and save and revert.
 * EODocumentController provides several action methods to interact with a user. For example, the methods revert and saveIfUserConfirms open dialogs to confirm that a user wants to revert or save before performing the action. Also, many of the methods open dialogs when an error occurs, telling the user what happened.
 * EODocumentController defines the concept of a root document controller. A document controller is the root document controller if none of its supercontrollers conform to EODocument. A root document controller usually provides the editing context for all its descendent document controllers -- the subcontrollers typically don't create their own. Consequently, the root document controller has responsibilities that non-root document controllers don't have. For example, only the root document controller provides save and revert behavior.
 */
public class EODocumentController extends com.webobjects.eoapplication.EOEntityController implements com.webobjects.eoapplication.EOObjectDisplayDocument, com.webobjects.eoapplication.EOEditable{
    /**
     * Creates a new document controller.
     */
    public EODocumentController(){
         //TODO codavaj!!
    }

    /**
     * Creates a new document controller from an EOXMLUnarchiver.
     * Parameters:unarchiver - the unarchiver providing XML attributes
     */
    public EODocumentController(com.webobjects.eoapplication.EOXMLUnarchiver unarchiver){
         //TODO codavaj!!
    }

    /**
     * Overridden to handle editing-related action enabling and disabling.
     */
    public boolean canPerformActionNamed(java.lang.String actionName){
        return false; //TODO codavaj!!
    }

    /**
     * Returns whether the receiver can redo. A document controller can redo as long as its editing context's undo manager can redo and as long as it (or one of its subcontrollers) is editable.
     */
    public boolean canRedo(){
        return false; //TODO codavaj!!
    }

    /**
     * Returns whether the receiver can revert. A document controller can revert only if it's the root document controller and if it's edited.
     */
    public boolean canRevert(){
        return false; //TODO codavaj!!
    }

    /**
     * Returns whether the receiver can save. A document controller can save only if it's the root document controller and if it's edited.
     */
    public boolean canSave(){
        return false; //TODO codavaj!!
    }

    /**
     * Returns whether the receiver can undo. A document controller can undo as long as its editing context's undo manager can undo and as long as it (or one of its subcontrollers) is editable.
     */
    public boolean canUndo(){
        return false; //TODO codavaj!!
    }

    /**
     * Reacts to the connection for the receiver being established, taking care of editability issues in addition to the superclass implementation.
     */
    protected void connectionWasEstablished(){
        return; //TODO codavaj!!
    }

    /**
     * Adds actions for handling editing (like save, revert) the default actions defined by the superclass, EOEntityController (but only if the receiver is a root document controller and if it's not used in a modal dialog.
     */
    protected com.webobjects.foundation.NSArray defaultActions(){
        return null; //TODO codavaj!!
    }

    /**
     * Deletes the objects selected in the receiver's display group and updates the edited status to true.
     */
    public void deleteSelectedObjects(){
        return; //TODO codavaj!!
    }

    /**
     * Prepares the receiver so it is disposed when Java performs garbage collection.
     */
    public void dispose(){
        return; //TODO codavaj!!
    }

    /**
     * Description copied from interface:
     * Returns the editability of the receiver. The default behavior should be to return EOEditable.IfSupercontrollerEditable.
     */
    public int editability(){
        return 0; //TODO codavaj!!
    }

    /**
     * In addition to the superclass implementation, updates the edited state of the receiver based on changes that happened in the receiver's editing context.
     */
    public void handleEditingContextNotification(com.webobjects.foundation.NSNotification notification){
        return; //TODO codavaj!!
    }

    /**
     * Creates a new enterprise object, inserts it into the receiver's display group and updates the edited status to true.
     */
    public void insertObject(){
        return; //TODO codavaj!!
    }

    /**
     * Conformance to EODocument. Returns whether the receiver is a document for the enterprise object associated with globalID and entityName. See the method description of isDocumentForGlobalID in the interface specification for EODocument. EODocumentController's default implementation returns true if the receiver is a root document controller and receiver's display group displays only the specified object. Subclasses might have to override this method to return false, for example list controllers can't really be documents for a single object and should return false.
     */
    public boolean isDocumentForGlobalID(com.webobjects.eocontrol.EOGlobalID globalID, java.lang.String entityName){
        return false; //TODO codavaj!!
    }

    /**
     * Description copied from interface:
     * Returns whether the receiver is currently editable. A receiver is editable if its editability is EOEditable.AlwaysEditable or its editability is EOEditable.IfSupercontrollerEditable and sending EOEditable.isEditable to the first EOEditable supercontroller of the receiver returns true.
     */
    public boolean isEditable(){
        return false; //TODO codavaj!!
    }

    /**
     * Description copied from interface:
     * Returns the receiver's edited state.
     */
    public boolean isEdited(){
        return false; //TODO codavaj!!
    }

    /**
     * Returns whether the receiver is a root document controller (which is the case if none of the supercontrollers conform to EODocument).
     */
    public boolean isRootDocumentController(){
        return false; //TODO codavaj!!
    }

    /**
     * Prepares the receiver for performing a new task by resetting any data and resetting it's edited state.
     */
    public void prepareForNewTask(boolean prepareSubcontrollersForNewTask){
        return; //TODO codavaj!!
    }

    /**
     * Tells the receiver's editing context to redo the last editing state.
     */
    public void redo(){
        return; //TODO codavaj!!
    }

    /**
     * Reverts the receiver's editing context changes by invoking revertChanges, requesting an error dialog upon failure. Returns whether the revert succeeded.
     */
    public boolean revert(){
        return false; //TODO codavaj!!
    }

    /**
     * Attempts to revert the receiver's editing context changes and makes the receiver's user interface invisible if the revert succeeded (which usually results in a window closing). The user is not given the choice to cancel the operation.
     */
    public boolean revertAndMakeInvisible(){
        return false; //TODO codavaj!!
    }

    /**
     * Tells the receiver's editing context to revert changes and updates the receiver's editing state on success. If the revert fails, catches the exception and invokes revertFailed to show the reason for failure. Returns whether the revert succeeded.
     */
    public boolean revertChanges(boolean showErrorDialog){
        return false; //TODO codavaj!!
    }

    /**
     * Invoked from revertChanges if the revert failed. If showErrorDialog is true, brings the receiver's user interface to the front and opens a dialog displaying exception's class name and exception message. This method can be overridden by subclasses to handle revert errors in a special way.
     */
    protected void revertFailed(java.lang.Exception exception, boolean showErrorDialog){
        return; //TODO codavaj!!
    }

    /**
     * Saves the receiver's editing context changes by invoking saveChanges, requesting an error dialog upon failure. Returns whether the save succeeded.
     */
    public boolean save(){
        return false; //TODO codavaj!!
    }

    /**
     * Attempts to save the receiver's editing context changes and makes the receiver's user interface invisible if the save succeeded (which usually results in a window closing). The user is not given the choice to cancel the operation.
     */
    public boolean saveAndMakeInvisible(){
        return false; //TODO codavaj!!
    }

    /**
     * Tells the receiver's editing context to save changes and updates the receiver's editing state on success. If the save fails, catches the exception and invokes saveFailed to show the reason for failure. Returns whether the save succeeded.
     * Some applications need to disable undo operations after a save. You can override this method to do so, for example:
     * public boolean saveChanges(boolean showErrorDialog, String saveOperationTitle) { if (super.saveChanges(showErrorDialog, saveOperationTitle)) { editingContext().undoManager().removeAllActions(); } }
     */
    public boolean saveChanges(boolean showErrorDialog, java.lang.String saveOperationTitle){
        return false; //TODO codavaj!!
    }

    /**
     * Invoked from saveChanges if the save failed. If showErrorDialog is true, brings the receiver's user interface to the front and opens a dialog displaying exception's class name and exception message. This method can be overridden by subclasses to handle save errors in a special way.
     */
    protected void saveFailed(java.lang.Exception exception, boolean showErrorDialog, java.lang.String saveOperationTitle){
        return; //TODO codavaj!!
    }

    /**
     * Invokes saveIfUserConfirms(boolean, String) with default values for a normal save operation.
     */
    public boolean saveIfUserConfirms(){
        return false; //TODO codavaj!!
    }

    /**
     * Presents an alert panel asking the user whether the receiver's editing context changes should be saved or not (operationTitle is used as a description of the operation, message as the question displayed in the alert panel). The user can choose to save or not to save. Returns whether the changes were saved successfully.
     */
    public boolean saveIfUserConfirms(java.lang.String operationTitle, java.lang.String message){
        return false; //TODO codavaj!!
    }

    /**
     * Invokes saveIfUserConfirmsAndMakeInvisible(String, String) with default values for a normal save & close operation.
     */
    public boolean saveIfUserConfirmsAndMakeInvisible(){
        return false; //TODO codavaj!!
    }

    /**
     * Invokes saveIfUserConfirms(boolean, String) and makes the receiver's user interface invisible if the save succeeded (which usually results in a window closing).
     */
    public boolean saveIfUserConfirmsAndMakeInvisible(java.lang.String operationTitle, java.lang.String message){
        return false; //TODO codavaj!!
    }

    /**
     * Description copied from interface:
     * Sets the editability of the receiver to editability. See the method description of setEditability in the interface specification for EOEditable.
     */
    public void setEditability(int editability){
        return; //TODO codavaj!!
    }

    /**
     * Conformance to EODocument. Sets the receiver's edited state. See the method description of setEdited in the interface specification for EODocument. EODocumentController's default implementation only updates the edited state of the receiver if it's a root document controller, otherwise it asks the root document controller to handle the edited state.
     */
    public void setEdited(boolean flag){
        return; //TODO codavaj!!
    }

    /**
     * Description copied from interface:
     * Invoked to notify the receiver that the editability of its supercontroller changed, giving the receiver the opportunity to update its user interface to match the editability of the supercontroller. This method is only sent to connected subcontrollers whose editability is EOEditable.IfSupercontrollerEditable.
     */
    public void supercontrollerEditabilityDidChange(){
        return; //TODO codavaj!!
    }

    /**
     * Description copied from interface:
     * Invoked when one of the receiver's subcontrollers is disposed as a transient controller. This method instructs the receiver to assume responsibility for managing the editability of the subcontroller's EOAssociation, association.
     */
    public void takeResponsibilityForEditabilityOfAssociation(com.webobjects.eointerface.EOAssociation association){
        return; //TODO codavaj!!
    }

    /**
     * Returns the receiver as a String describing the state of the controller.
     */
    public java.lang.String toString(){
        return null; //TODO codavaj!!
    }

    /**
     * Tells the receiver's editing context to undo the last editing state.
     */
    public void undo(){
        return; //TODO codavaj!!
    }

    /**
     * Invoked from setEdited to notify the receiver that edited status has changed, giving the receiver the opportunity to react.
     */
    protected void wasEdited(){
        return; //TODO codavaj!!
    }

}

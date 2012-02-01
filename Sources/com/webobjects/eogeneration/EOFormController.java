package com.webobjects.eogeneration;
public class EOFormController extends com.webobjects.eogeneration.EOEditingController implements com.webobjects.eoapplication.EOModalDialogController.ModalActions, com.webobjects.eogeneration.EOControllerFactory.Insert, com.webobjects.eogeneration.EOControllerFactory.Open, com.webobjects.eogeneration.EOControllerFactory.SelectByInserting{
    public EOFormController(){
         //TODO codavaj!!
    }

    public EOFormController(com.webobjects.eoapplication.EOXMLUnarchiver unarchiver){
         //TODO codavaj!!
    }

    /**
     * Description copied from interface:
     * The action method invoked when the user cancels the modal dialog.
     */
    public void cancel(){
        return; //TODO codavaj!!
    }

    /**
     * Description copied from class:
     * Overridden to handle editing-related action enabling and disabling.
     */
    public boolean canPerformActionNamed(java.lang.String actionName){
        return false; //TODO codavaj!!
    }

    /**
     * Description copied from class:
     * Returns whether the receiver can revert. A document controller can revert only if it's the root document controller and if it's edited.
     */
    public boolean canRevert(){
        return false; //TODO codavaj!!
    }

    /**
     * Description copied from class:
     * Returns whether the receiver can save. A document controller can save only if it's the root document controller and if it's edited.
     */
    public boolean canSave(){
        return false; //TODO codavaj!!
    }

    /**
     * Description copied from class:
     * Adds actions for handling editing (like save, revert) the default actions defined by the superclass, EOEntityController (but only if the receiver is a root document controller and if it's not used in a modal dialog.
     */
    protected com.webobjects.foundation.NSArray defaultActions(){
        return null; //TODO codavaj!!
    }

    public boolean delete(){
        return false; //TODO codavaj!!
    }

    public void finishSelecting(){
        return; //TODO codavaj!!
    }

    public boolean insert(){
        return false; //TODO codavaj!!
    }

    public boolean insertNewObject(){
        return false; //TODO codavaj!!
    }

    public boolean insertNewObjectWithRelationshipPathsFilled(com.webobjects.foundation.NSDictionary relationshipPathToGlobalIDsMapTable){
        return false; //TODO codavaj!!
    }

    public boolean insertWithTask(){
        return false; //TODO codavaj!!
    }

    /**
     * Description copied from interface:
     * This method is invoked by the modal dialog controller on its subcontrollers when the user attempts to close the modal dialog with the dialog's close button (not the usual ok/cancel buttons). Subcontrollers return whether the dialog can be closed (which corresponds to a cancel operation) or not.
     */
    public boolean modalDialogShouldClose(){
        return false; //TODO codavaj!!
    }

    /**
     * Description copied from interface:
     * The action method invoked when the user wants to finish the modal dialog.
     */
    public boolean ok(){
        return false; //TODO codavaj!!
    }

    public void openObjectWithGlobalID(com.webobjects.eocontrol.EOGlobalID globalID){
        return; //TODO codavaj!!
    }

    public boolean openWithTask(){
        return false; //TODO codavaj!!
    }

    public void prepareToSelectByInserting(){
        return; //TODO codavaj!!
    }

    public com.webobjects.eocontrol.EOGlobalID provideSelectedObjectGlobalID(){
        return null; //TODO codavaj!!
    }

    /**
     * Description copied from class:
     * Saves the receiver's editing context changes by invoking saveChanges, requesting an error dialog upon failure. Returns whether the save succeeded.
     */
    public boolean save(){
        return false; //TODO codavaj!!
    }

}

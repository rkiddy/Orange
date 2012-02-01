package com.webobjects.eoapplication;
public class EOModalDialogController extends com.webobjects.eoapplication.EODialogController implements com.webobjects.eoapplication.EOComponentController.Modal{
    public EOModalDialogController(){
         //TODO codavaj!!
    }

    /**
     * Parameters:unarchiver -
     */
    public EOModalDialogController(com.webobjects.eoapplication.EOXMLUnarchiver unarchiver){
         //TODO codavaj!!
    }

    public void activateWindow(){
        return; //TODO codavaj!!
    }

    public boolean closeWindow(){
        return false; //TODO codavaj!!
    }

    public void finishModal(){
        return; //TODO codavaj!!
    }

    public boolean isModal(){
        return false; //TODO codavaj!!
    }

    protected java.awt.Window newWindow(javax.swing.JComponent component){
        return null; //TODO codavaj!!
    }

    public static void runControllerInNewModalDialog(com.webobjects.eoapplication.EOComponentController controller, java.lang.String windowTitle){
        return; //TODO codavaj!!
    }

    /**
     * The EOModalDialogController.ModalActions interface defines the methods subcontrollers of modal dialog controllers have to implement to handle closing of the dialog.
     */
    public static interface ModalActions{
        /**
         * The action method invoked when the user cancels the modal dialog.
         */
        abstract void cancel();

        /**
         * This method is invoked by the modal dialog controller on its subcontrollers when the user attempts to close the modal dialog with the dialog's close button (not the usual ok/cancel buttons). Subcontrollers return whether the dialog can be closed (which corresponds to a cancel operation) or not.
         */
        abstract boolean modalDialogShouldClose();

        /**
         * The action method invoked when the user wants to finish the modal dialog.
         */
        abstract boolean ok();

    }
}

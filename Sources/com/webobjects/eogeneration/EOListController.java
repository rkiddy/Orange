package com.webobjects.eogeneration;
public class EOListController extends com.webobjects.eogeneration.EOEditingController implements com.webobjects.eoapplication.EOModalDialogController.ModalActions, com.webobjects.eogeneration.EOWidgetController.DefaultAction, com.webobjects.eogeneration.EOControllerFactory.Select, com.webobjects.eogeneration.EOControllerFactory.List{
    public EOListController(){
         //TODO codavaj!!
    }

    public EOListController(com.webobjects.eoapplication.EOXMLUnarchiver unarchiver){
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

    public void defaultAction(){
        return; //TODO codavaj!!
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

    public boolean insertWithTask(){
        return false; //TODO codavaj!!
    }

    /**
     * Description copied from class:
     * Conformance to EODocument. Returns whether the receiver is a document for the enterprise object associated with globalID and entityName. See the method description of isDocumentForGlobalID in the interface specification for EODocument. EODocumentController's default implementation returns true if the receiver is a root document controller and receiver's display group displays only the specified object. Subclasses might have to override this method to return false, for example list controllers can't really be documents for a single object and should return false.
     */
    public boolean isDocumentForGlobalID(com.webobjects.eocontrol.EOGlobalID globalID, java.lang.String entityName){
        return false; //TODO codavaj!!
    }

    public void listObjectsWithFetchSpecification(com.webobjects.eocontrol.EOFetchSpecification fetchSpecification){
        return; //TODO codavaj!!
    }

    public void listObjectsWithGlobalIDs(com.webobjects.foundation.NSArray globalIDs){
        return; //TODO codavaj!!
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

    public boolean openWithTask(){
        return false; //TODO codavaj!!
    }

    public void prepareToSelect(boolean allowMultipleObjects, boolean allowInsertingObject){
        return; //TODO codavaj!!
    }

    public com.webobjects.eocontrol.EOGlobalID provideSelectedObjectGlobalID(){
        return null; //TODO codavaj!!
    }

    public com.webobjects.foundation.NSArray provideSelectedObjectsGlobalIDs(){
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

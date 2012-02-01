package com.webobjects.eogeneration;
public abstract class EOTitlesController extends com.webobjects.eogeneration.EOAssociationController implements com.webobjects.eoapplication.EOComponentController.EndEditing{
    public static final java.lang.String NewTitlesDisplayGroupProviderMethodName="newTitlesDisplayGroup";

    public EOTitlesController(){
         //TODO codavaj!!
    }

    public EOTitlesController(com.webobjects.eoapplication.EOXMLUnarchiver unarchiver){
         //TODO codavaj!!
    }

    public void addTitleKey(java.lang.String key){
        return; //TODO codavaj!!
    }

    public java.lang.String availableTitlesKey(){
        return null; //TODO codavaj!!
    }

    /**
     * Description copied from class:
     * Invoked from breakConnection to notify the receiver that its connection to its supercontroller has been broken, giving the receiver the opportunity to clean up after its become idle.
     */
    protected void connectionWasBroken(){
        return; //TODO codavaj!!
    }

    /**
     * Description copied from class:
     * Invoked from establishConnection to notify the receiver that its connection to the controller hierarchy has been established, giving the receiver the opportunity to prepare itself (for example, setting delegates).
     */
    protected void connectionWasEstablished(){
        return; //TODO codavaj!!
    }

    protected void disposeAssociations(){
        return; //TODO codavaj!!
    }

    /**
     * Description copied from interface:
     * Ensures that all current edits in the user interface are flushed to the underlying data objects.
     */
    public boolean endEditing(){
        return false; //TODO codavaj!!
    }

    protected com.webobjects.eointerface.EOAssociation newAssociation(javax.swing.JComponent widget, com.webobjects.eointerface.EODisplayGroup displayGroup, java.lang.String enabledKey, com.webobjects.eointerface.EODisplayGroup enabledDisplayGroup){
        return null; //TODO codavaj!!
    }

    protected com.webobjects.eocontrol.EODataSource newTitlesDataSource(){
        return null; //TODO codavaj!!
    }

    public com.webobjects.eointerface.EODisplayGroup newTitlesDisplayGroup(){
        return null; //TODO codavaj!!
    }

    /**
     * Description copied from class:
     * Prepares the receiver for performing a new task by resetting any data. If prepareSubcontrollersForNewTask is true, this method also sends prepareForNewTask to each of the receiver's subcontrollers. This method is usually invoked to prepare a branch of the controller for reuse. Subclasses should override this method to get rid of data and perform any additional clean up.
     */
    public void prepareForNewTask(boolean prepareSubcontrollersForNewTask){
        return; //TODO codavaj!!
    }

    public void removeTitleKey(java.lang.String key){
        return; //TODO codavaj!!
    }

    public boolean resetTitlesObjectsOnEveryConnect(){
        return false; //TODO codavaj!!
    }

    public boolean searchesTitlesObjectsInEditingContext(){
        return false; //TODO codavaj!!
    }

    public void setAvailableTitlesKey(java.lang.String string){
        return; //TODO codavaj!!
    }

    public void setResetTitlesObjectsOnEveryConnect(boolean flag){
        return; //TODO codavaj!!
    }

    public void setSearchesTitlesObjectsInEditingContext(boolean flag){
        return; //TODO codavaj!!
    }

    public void setSingleTitleKey(java.lang.String key){
        return; //TODO codavaj!!
    }

    public void setTitleKeys(com.webobjects.foundation.NSArray keys){
        return; //TODO codavaj!!
    }

    public void setTitlesDisplayGroup(com.webobjects.eointerface.EODisplayGroup displayGroup){
        return; //TODO codavaj!!
    }

    public void setTitlesDisplayGroupProviderMethodName(java.lang.String string){
        return; //TODO codavaj!!
    }

    public void setTitlesEntityName(java.lang.String string){
        return; //TODO codavaj!!
    }

    public com.webobjects.foundation.NSArray titleKeys(){
        return null; //TODO codavaj!!
    }

    public com.webobjects.eointerface.EODisplayGroup titlesDisplayGroup(){
        return null; //TODO codavaj!!
    }

    public java.lang.String titlesDisplayGroupProviderMethodName(){
        return null; //TODO codavaj!!
    }

    protected com.webobjects.foundation.NSArray titlesDisplayGroupSortOrderings(){
        return null; //TODO codavaj!!
    }

    public java.lang.String titlesEntityName(){
        return null; //TODO codavaj!!
    }

    /**
     * Description copied from class:
     * Returns the receiver as a string that states the receiver's class name and type name, whether the receiver is connected, the number of subcontrollers, whether or not the receiver has been prepared, whether or not the receiver is visible, information about widget sizing and alignment behavior, and so on.
     */
    public java.lang.String toString(){
        return null; //TODO codavaj!!
    }

}

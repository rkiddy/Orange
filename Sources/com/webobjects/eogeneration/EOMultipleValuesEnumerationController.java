package com.webobjects.eogeneration;
public class EOMultipleValuesEnumerationController extends com.webobjects.eogeneration.EOEnumerationController implements java.awt.event.ActionListener, java.awt.event.ComponentListener, java.awt.event.MouseListener, com.webobjects.eoapplication.EOComponentController.EndEditing{
    public EOMultipleValuesEnumerationController(){
         //TODO codavaj!!
    }

    public EOMultipleValuesEnumerationController(com.webobjects.eoapplication.EOXMLUnarchiver unarchiver){
         //TODO codavaj!!
    }

    public void actionPerformed(java.awt.event.ActionEvent event){
        return; //TODO codavaj!!
    }

    public void add(){
        return; //TODO codavaj!!
    }

    public void addDetailKey(java.lang.String key){
        return; //TODO codavaj!!
    }

    public boolean allowsDuplicates(){
        return false; //TODO codavaj!!
    }

    public boolean allowsRemoveAll(){
        return false; //TODO codavaj!!
    }

    public boolean canAdd(){
        return false; //TODO codavaj!!
    }

    public boolean canDown(){
        return false; //TODO codavaj!!
    }

    /**
     * Description copied from interface:
     * Returns true if the receiver can perform the action method (sent by an EOAction object) named actionName, false otherwise. An EOController's implementation of this method generally returns false if the receiver doesn't have an action named actionName or if the actionName action is explicitly disabled.
     */
    public boolean canPerformActionNamed(java.lang.String actionName){
        return false; //TODO codavaj!!
    }

    public boolean canRemove(){
        return false; //TODO codavaj!!
    }

    public boolean canUp(){
        return false; //TODO codavaj!!
    }

    /**
     * Description copied from class:
     * Invoked when the receiver's component becomes visible, giving the receiver a chance to react. EOComponentController's implementation invokes establishConnection to ensure the receiver is connected to the controller hierarchy.
     */
    protected void componentDidBecomeVisible(){
        return; //TODO codavaj!!
    }

    public void componentHidden(java.awt.event.ComponentEvent event){
        return; //TODO codavaj!!
    }

    public void componentMoved(java.awt.event.ComponentEvent event){
        return; //TODO codavaj!!
    }

    public void componentResized(java.awt.event.ComponentEvent event){
        return; //TODO codavaj!!
    }

    public void componentShown(java.awt.event.ComponentEvent event){
        return; //TODO codavaj!!
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

    public com.webobjects.eointerface.EODisplayGroup detailDisplayGroup(){
        return null; //TODO codavaj!!
    }

    protected com.webobjects.foundation.NSArray detailDisplayGroupSortOrderings(){
        return null; //TODO codavaj!!
    }

    public java.lang.String detailEntityName(){
        return null; //TODO codavaj!!
    }

    public com.webobjects.foundation.NSArray detailKeys(){
        return null; //TODO codavaj!!
    }

    public java.lang.String detailRelationshipPath(){
        return null; //TODO codavaj!!
    }

    protected void disposeAssociations(){
        return; //TODO codavaj!!
    }

    public void down(){
        return; //TODO codavaj!!
    }

    /**
     * Description copied from interface:
     * Ensures that all current edits in the user interface are flushed to the underlying data objects.
     */
    public boolean endEditing(){
        return false; //TODO codavaj!!
    }

    public java.lang.String indexKey(){
        return null; //TODO codavaj!!
    }

    public void mouseClicked(java.awt.event.MouseEvent event){
        return; //TODO codavaj!!
    }

    public void mouseEntered(java.awt.event.MouseEvent event){
        return; //TODO codavaj!!
    }

    public void mouseExited(java.awt.event.MouseEvent event){
        return; //TODO codavaj!!
    }

    public void mousePressed(java.awt.event.MouseEvent event){
        return; //TODO codavaj!!
    }

    public void mouseReleased(java.awt.event.MouseEvent event){
        return; //TODO codavaj!!
    }

    protected com.webobjects.eointerface.EOAssociation newAssociation(javax.swing.JComponent widget, com.webobjects.eointerface.EODisplayGroup displayGroup, java.lang.String enabledKey, com.webobjects.eointerface.EODisplayGroup enabledDisplayGroup){
        return null; //TODO codavaj!!
    }

    protected javax.swing.JComponent newWidget(){
        return null; //TODO codavaj!!
    }

    protected int preferredLabelComponentPosition(){
        return 0; //TODO codavaj!!
    }

    /**
     * Description copied from class:
     * Prepares the receiver for performing a new task by resetting any data. If prepareSubcontrollersForNewTask is true, this method also sends prepareForNewTask to each of the receiver's subcontrollers. This method is usually invoked to prepare a branch of the controller for reuse. Subclasses should override this method to get rid of data and perform any additional clean up.
     */
    public void prepareForNewTask(boolean prepareSubcontrollersForNewTask){
        return; //TODO codavaj!!
    }

    public void remove(){
        return; //TODO codavaj!!
    }

    public void removeDetailKey(java.lang.String key){
        return; //TODO codavaj!!
    }

    public void setAllowsDuplicates(boolean flag){
        return; //TODO codavaj!!
    }

    public void setAllowsRemoveAll(boolean flag){
        return; //TODO codavaj!!
    }

    public void setDetailKeys(com.webobjects.foundation.NSArray keys){
        return; //TODO codavaj!!
    }

    public void setDetailRelationshipPath(java.lang.String string){
        return; //TODO codavaj!!
    }

    public void setIndexKey(java.lang.String string){
        return; //TODO codavaj!!
    }

    public void setSingleDetailKey(java.lang.String key){
        return; //TODO codavaj!!
    }

    public void setUsesTableLabels(boolean flag){
        return; //TODO codavaj!!
    }

    protected void startListeningToWidget(){
        return; //TODO codavaj!!
    }

    protected void stopListeningToWidget(){
        return; //TODO codavaj!!
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

    public void up(){
        return; //TODO codavaj!!
    }

    public boolean usesTableLabels(){
        return false; //TODO codavaj!!
    }

}

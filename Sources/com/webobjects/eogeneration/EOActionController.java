package com.webobjects.eogeneration;
public class EOActionController extends com.webobjects.eogeneration.EOTitlesController implements java.awt.event.ComponentListener{
    public EOActionController(){
         //TODO codavaj!!
    }

    public EOActionController(com.webobjects.eoapplication.EOXMLUnarchiver unarchiver){
         //TODO codavaj!!
    }

    public java.lang.String actionKey(){
        return null; //TODO codavaj!!
    }

    public int buttonPosition(){
        return 0; //TODO codavaj!!
    }

    /**
     * Description copied from class:
     * Returns whether the controller can be transient. By default, a component controller is transient only if it's an instance of EOComponentController, not an instance of a subclass.
     */
    public boolean canBeTransient(){
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

    /**
     * Description copied from class:
     * Returns an array of the receiver's default actions (EOAction objects). A subclass of EOController should override this method to return the actions it defines merged with the actions of its superclass. Never invoke this method directly. Instead, invoke actions, which caches the results of defaultActions and is therefore more efficient.
     */
    protected com.webobjects.foundation.NSArray defaultActions(){
        return null; //TODO codavaj!!
    }

    protected void disposeAssociations(){
        return; //TODO codavaj!!
    }

    /**
     * Description copied from class:
     * Disposes the receiver if it's transient, first removing it from its supercontroller with removeTransientSubcontroller If the receiver's supercontroller is non-null, this method also attempts to dispose of the supercontroller if it's transient. Supercontrollers can prevent a controller from becoming transient, in which case this method returns false. Subclasses should first invoke the super implementation and only continue disposing if the super implementation returns true.
     */
    protected boolean disposeIfTransient(){
        return false; //TODO codavaj!!
    }

    protected com.webobjects.eointerface.EOAssociation newAssociation(javax.swing.JComponent widget, com.webobjects.eointerface.EODisplayGroup displayGroup, java.lang.String enabledKey, com.webobjects.eointerface.EODisplayGroup enabledDisplayGroup){
        return null; //TODO codavaj!!
    }

    public com.webobjects.eocontrol.EODataSource newTitlesDataSource(){
        return null; //TODO codavaj!!
    }

    protected javax.swing.JComponent newWidget(){
        return null; //TODO codavaj!!
    }

    protected int preferredWidgetAutosizingMask(){
        return 0; //TODO codavaj!!
    }

    public void setActionKey(java.lang.String string){
        return; //TODO codavaj!!
    }

    public void setButtonPosition(int position){
        return; //TODO codavaj!!
    }

    public void setUsesAction(boolean flag){
        return; //TODO codavaj!!
    }

    public void setUsesButton(boolean flag){
        return; //TODO codavaj!!
    }

    protected void startListeningToWidget(){
        return; //TODO codavaj!!
    }

    protected void stopListeningToWidget(){
        return; //TODO codavaj!!
    }

    /**
     * Description copied from class:
     * Returns the receiver as a string that states the receiver's class name and type name, whether the receiver is connected, the number of subcontrollers, whether or not the receiver has been prepared, whether or not the receiver is visible, information about widget sizing and alignment behavior, and so on.
     */
    public java.lang.String toString(){
        return null; //TODO codavaj!!
    }

    public boolean usesAction(){
        return false; //TODO codavaj!!
    }

    public boolean usesButton(){
        return false; //TODO codavaj!!
    }

}

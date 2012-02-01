package com.webobjects.eogeneration;
public abstract class EOAssociationController extends com.webobjects.eogeneration.EOWidgetController implements com.webobjects.eoapplication.EOEditable, com.webobjects.eoapplication.EOAssociationConnector{
    public static final java.lang.String ControllerDisplayGroupProviderMethodName="controllerDisplayGroup";

    public EOAssociationController(){
         //TODO codavaj!!
    }

    public EOAssociationController(com.webobjects.eoapplication.EOXMLUnarchiver unarchiver){
         //TODO codavaj!!
    }

    public com.webobjects.eointerface.EOAssociation association(){
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

    public com.webobjects.eointerface.EODisplayGroup controllerDisplayGroup(){
        return null; //TODO codavaj!!
    }

    public com.webobjects.eointerface.EODisplayGroup displayGroup(){
        return null; //TODO codavaj!!
    }

    public java.lang.String displayGroupProviderMethodName(){
        return null; //TODO codavaj!!
    }

    /**
     * Description copied from class:
     * Prepares the receiver so it is disposed when Java performs garbage collection.
     */
    public void dispose(){
        return; //TODO codavaj!!
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

    /**
     * Description copied from interface:
     * Returns the editability of the receiver. The default behavior should be to return EOEditable.IfSupercontrollerEditable.
     */
    public int editability(){
        return 0; //TODO codavaj!!
    }

    public com.webobjects.eointerface.EODisplayGroup enabledDisplayGroup(){
        return null; //TODO codavaj!!
    }

    public java.lang.String enabledDisplayGroupProviderMethodName(){
        return null; //TODO codavaj!!
    }

    public java.lang.String enabledKey(){
        return null; //TODO codavaj!!
    }

    /**
     * Description copied from interface:
     * Returns whether the receiver is currently editable. A receiver is editable if its editability is EOEditable.AlwaysEditable or its editability is EOEditable.IfSupercontrollerEditable and sending EOEditable.isEditable to the first EOEditable supercontroller of the receiver returns true.
     */
    public boolean isEditable(){
        return false; //TODO codavaj!!
    }

    protected abstract com.webobjects.eointerface.EOAssociation newAssociation(javax.swing.JComponent widget, com.webobjects.eointerface.EODisplayGroup displayGroup, java.lang.String enabledKey, com.webobjects.eointerface.EODisplayGroup enabledDisplayGroup);

    public boolean prefersContinuousChangeNotification(){
        return false; //TODO codavaj!!
    }

    public void setAssociation(com.webobjects.eointerface.EOAssociation association){
        return; //TODO codavaj!!
    }

    public void setDisplayGroup(com.webobjects.eointerface.EODisplayGroup displayGroup){
        return; //TODO codavaj!!
    }

    public void setDisplayGroupProviderMethodName(java.lang.String string){
        return; //TODO codavaj!!
    }

    /**
     * Description copied from interface:
     * Sets the editability of the receiver to editability. See the method description of setEditability in the interface specification for EOEditable.
     */
    public void setEditability(int editability){
        return; //TODO codavaj!!
    }

    public void setEnabledDisplayGroup(com.webobjects.eointerface.EODisplayGroup displayGroup){
        return; //TODO codavaj!!
    }

    public void setEnabledDisplayGroupProviderMethodName(java.lang.String string){
        return; //TODO codavaj!!
    }

    public void setEnabledKey(java.lang.String string){
        return; //TODO codavaj!!
    }

    public void setPrefersContinuousChangeNotification(boolean flag){
        return; //TODO codavaj!!
    }

    public void setSuppressesAssociation(boolean flag){
        return; //TODO codavaj!!
    }

    /**
     * Description copied from interface:
     * Invoked to notify the receiver that the editability of its supercontroller changed, giving the receiver the opportunity to update its user interface to match the editability of the supercontroller. This method is only sent to connected subcontrollers whose editability is EOEditable.IfSupercontrollerEditable.
     */
    public void supercontrollerEditabilityDidChange(){
        return; //TODO codavaj!!
    }

    public boolean suppressesAssociation(){
        return false; //TODO codavaj!!
    }

    /**
     * Description copied from interface:
     * Invoked when one of the receiver's subcontrollers is disposed as a transient controller. This method instructs the receiver to assume responsibility for managing the editability of the subcontroller's EOAssociation, association.
     */
    public void takeResponsibilityForEditabilityOfAssociation(com.webobjects.eointerface.EOAssociation association){
        return; //TODO codavaj!!
    }

    /**
     * Description copied from interface:
     * Invoked when one of the receiver's subcontrollers is disposed as a transient controller. Instructs the receiver to assume responsibility for managing the subcontroller's EOAssociation, association.
     */
    public void takeResposibilityForConnectionOfAssociation(com.webobjects.eointerface.EOAssociation association){
        return; //TODO codavaj!!
    }

    /**
     * Description copied from class:
     * Returns the receiver as a string that states the receiver's class name and type name, whether the receiver is connected, the number of subcontrollers, whether or not the receiver has been prepared, whether or not the receiver is visible, information about widget sizing and alignment behavior, and so on.
     */
    public java.lang.String toString(){
        return null; //TODO codavaj!!
    }

}

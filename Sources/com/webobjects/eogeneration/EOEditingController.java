package com.webobjects.eogeneration;
public abstract class EOEditingController extends com.webobjects.eoapplication.EODocumentController{
    public EOEditingController(){
         //TODO codavaj!!
    }

    public EOEditingController(com.webobjects.eoapplication.EOXMLUnarchiver unarchiver){
         //TODO codavaj!!
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
     * Reacts to the connection for the receiver being broken, taking care of association disconnecting.
     */
    protected void connectionWasBroken(){
        return; //TODO codavaj!!
    }

    /**
     * Description copied from class:
     * Reacts to the connection for the receiver being established, taking care of editability issues in addition to the superclass implementation.
     */
    protected void connectionWasEstablished(){
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

    /**
     * Description copied from class:
     * Prepares the receiver so it is disposed when Java performs garbage collection.
     */
    public void dispose(){
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
     * Returns the name of the entity of the enterprise objects displayed in the receiver's display group.
     */
    public java.lang.String entityName(){
        return null; //TODO codavaj!!
    }

    /**
     * Description copied from class:
     * Returns whether the receiver should fetch its display group content next time its connection is established. This value changes often: Whenever an entity controller prepares for a new task, it sets this flag to true. Once it retrieves objects explicitly (for example from a global ID) or actually performs the fetch while connecting, it sets this flag to false.
     */
    public boolean fetchesOnConnect(){
        return false; //TODO codavaj!!
    }

    public boolean insert(){
        return false; //TODO codavaj!!
    }

    protected com.webobjects.foundation.NSArray mandatoryRelationshipPaths(){
        return null; //TODO codavaj!!
    }

    public com.webobjects.eointerface.EOMasterDetailAssociation masterDetailAssociation(){
        return null; //TODO codavaj!!
    }

    /**
     * Description copied from class:
     * Creates a new display group using a data source provided by newDataSource. This method can be used as display group provider method.
     */
    public com.webobjects.eointerface.EODisplayGroup newDisplayGroup(){
        return null; //TODO codavaj!!
    }

    public boolean openWithTask(){
        return false; //TODO codavaj!!
    }

    public java.lang.String relationshipPath(){
        return null; //TODO codavaj!!
    }

    /**
     * Description copied from class:
     * Sets the entity name of the enterprise objects displayed by the receiver.
     */
    public void setEntityName(java.lang.String string){
        return; //TODO codavaj!!
    }

    public void setMandatoryRelationshipPaths(com.webobjects.foundation.NSArray relationshipPaths){
        return; //TODO codavaj!!
    }

    public void setMasterDetailAssociation(com.webobjects.eointerface.EOMasterDetailAssociation association){
        return; //TODO codavaj!!
    }

    public void setRelationshipPath(java.lang.String string){
        return; //TODO codavaj!!
    }

    /**
     * Returns the receiver as a string describing the state of the controller.
     */
    public java.lang.String toString(){
        return null; //TODO codavaj!!
    }

}

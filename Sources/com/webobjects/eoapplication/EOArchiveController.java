package com.webobjects.eoapplication;
/**
 * As a subclass of EOComponentController, EOArchiveController manages a user interface component (which be default is just an empty view to hold subcontroller components). However, whereas most component controllers dynamically generate their components, archive controllers have the ability to load their components from an archive (an interface file created in Interface Builder). An archive controller has an archive name, which specifies the archive from which to load the controller's component. If, however, a controller doesn't have an archive name, the controller simply uses its default interface.
 * An additional feature of EOArchiveController, which is very useful for interface files, is the support of so-called controller display groups. Controller display groups contain the controller itsself as displayed object, so you can bind associations to keys implemented on the controller (typically your own subclass), for example to control the enabled aspect of associations.
 */
public abstract class EOArchiveController extends com.webobjects.eoapplication.EOComponentController implements com.webobjects.eocontrol.EOObserving, com.webobjects.eoapplication.EOComponentController.EndEditing{
    /**
     * Creates a new archive controller.
     */
    public EOArchiveController(){
         //TODO codavaj!!
    }

    /**
     * Creates a new archive controller from an EOXMLUnarchiver.
     * Parameters:unarchiver - the unarchiver providing XML attributes
     */
    public EOArchiveController(com.webobjects.eoapplication.EOXMLUnarchiver unarchiver){
         //TODO codavaj!!
    }

    /**
     * Returns the name of the interface file archive to be loaded by the controller instead of generating its component dynamically.
     */
    public java.lang.String archiveName(){
        return null; //TODO codavaj!!
    }

    /**
     * Invoked from loadArchive to notify the receiver that its interface file has been loaded completely. You can override this method to perform additional initialization for the objects loaded from the interface file archive.
     */
    protected void controllerDidLoadArchive(com.webobjects.foundation.NSDictionary namedObjects){
        return; //TODO codavaj!!
    }

    /**
     * Conformance to EOObjectDisplay. Returns the controller display group - the display group that contains the receiver itsself. The controller display group can be used to connect methods of the controller to the user interface through associations. If the controller is edited through associations of the controller display group, it can receive objectWillChange methods. If the controller display group has not been set so far, creates a new one and returns it.
     */
    public com.webobjects.eointerface.EODisplayGroup controllerDisplayGroup(){
        return null; //TODO codavaj!!
    }

    /**
     * Invoked from loadArchive to notify the receiver that its interface file is about to be loaded. You can override this method to perform additional preparation for the archive loading process.
     */
    protected void controllerWillLoadArchive(){
        return; //TODO codavaj!!
    }

    /**
     * Ensures that all editors of the receiver's display groups end editing (flush current user edits to the enterprise object graph if necessary). This method is invoked automatically before saving or reverting changes in subclasses.
     */
    public boolean endEditing(){
        return false; //TODO codavaj!!
    }

    /**
     * Returns whether the controller already has a controller display group.
     */
    public boolean hasControllerDisplayGroup(){
        return false; //TODO codavaj!!
    }

    /**
     * If not already loaded, loads the interface file archive specified by the archiveName of the receiver. While loading, controllers can substitute objects in objectForOutletPath. Afterwards, controllers can perform additional initialization for the objects loaded from the archive in controllerDidLoadArchive. If no archiveName is specified, this method returns false.
     */
    protected boolean loadArchive(){
        return false; //TODO codavaj!!
    }

    /**
     * Change notification for the controller itsself if it's edited through an association of the controller display group.
     */
    public void objectWillChange(java.lang.Object object){
        return; //TODO codavaj!!
    }

    /**
     * Overridden from the superclass to ensure that - if an archive name is specified for the receiver - the interface file archive is loaded before the component is prepared.
     */
    protected void prepareComponent(){
        return; //TODO codavaj!!
    }

    /**
     * Sets the name of the interface file archive to be loaded by the controller instead of generating its component dynamically. Throws an IllegalStateException if the receiver's archive is already loaded. In other words, you can only set the archive name before the component is generated.
     */
    public void setArchiveName(java.lang.String string){
        return; //TODO codavaj!!
    }

    /**
     * Sets and prepares the controller display group - the display group that contains the receiver itsself. The controller display group can be used to connect methods of the controller to the user interface through associations. This method takes care of placing the receiver in the display group and registering the controller as observer for itsself in the EOObserverCenter, so that the controller can receive objectWillChange methods if its values are edited through associations of the controller display group.
     */
    public void setControllerDisplayGroup(com.webobjects.eointerface.EODisplayGroup displayGroup){
        return; //TODO codavaj!!
    }

    /**
     * Returns the receiver as a string describing the state of the controller.
     */
    public java.lang.String toString(){
        return null; //TODO codavaj!!
    }

    /**
     * Triggers EOObserverCenter change notifications for the controller itsself. Invoke this method if you want to receive objectWillChange methods for the controller if it's edited through an association of the controller display group.
     */
    public void willChange(){
        return; //TODO codavaj!!
    }

}

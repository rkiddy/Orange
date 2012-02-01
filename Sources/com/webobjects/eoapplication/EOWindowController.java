package com.webobjects.eoapplication;
/**
 * EOWindowController extends EOComponentController for windows and dialogs. It is a common superclass for more specific controllers, providing common behavior for controllers which handle different kinds of windows. There are methods to deal with the border size, the activation button, user defaults and others.
 */
public abstract class EOWindowController extends com.webobjects.eoapplication.EOComponentController implements java.awt.event.ActionListener, com.webobjects.eoapplication.EOComponentController.Activation{
    /**
     * The (plain) constructor for EOWindowController.
     */
    public EOWindowController(){
         //TODO codavaj!!
    }

    /**
     * A constructor for EOWindowController (re-)creating an EOWindowController from the definitions stored in an EOXMLUnarchiver.
     * Parameters:unarchiver - the unarchiver with the stored definitions
     */
    public EOWindowController(com.webobjects.eoapplication.EOXMLUnarchiver unarchiver){
         //TODO codavaj!!
    }

    /**
     * Called to notify this controller that the specified ActionEvent has been handled. It will activate the window and call EOSwingUtilities.eventEnded().
     */
    public void actionPerformed(java.awt.event.ActionEvent event){
        return; //TODO codavaj!!
    }

    /**
     * This implementation of activate calls activateWindow and returns true.
     */
    public boolean activate(){
        return false; //TODO codavaj!!
    }

    /**
     * Activates the controller's window.
     */
    public abstract void activateWindow();

    /**
     * Returns the total size including the border for a specific component size.
     */
    public java.awt.Dimension borderedSizeForComponentSize(java.awt.Dimension componentSize){
        return null; //TODO codavaj!!
    }

    public java.awt.Dimension borderSize(){
        return null; //TODO codavaj!!
    }

    /**
     * Notification method which is called when this controller's component bomes invisible. Usually called and handled internally.
     */
    protected void componentDidBecomeInvisible(){
        return; //TODO codavaj!!
    }

    /**
     * Returns whether the component should be configured as being resizable.
     */
    protected boolean componentShouldBeResizable(javax.swing.JComponent component){
        return false; //TODO codavaj!!
    }

    /**
     * Calculates the component size implied by the specified size including the border.
     */
    public java.awt.Dimension componentSizeForBorderedSize(java.awt.Dimension componentSize){
        return null; //TODO codavaj!!
    }

    /**
     * Returns the array of default actions.
     */
    protected com.webobjects.foundation.NSArray defaultActions(){
        return null; //TODO codavaj!!
    }

    /**
     * Called when this controller isn't needed anymore. Removes any listeners in static lists, for example.
     */
    public void dispose(){
        return; //TODO codavaj!!
    }

    /**
     * Returns the border size for a specific window class, which is the difference between the outer and inner size of the window.
     */
    protected static java.awt.Dimension generateBorderSizeForRootPaneContainerClass(java.lang.Class rootPaneContainerWindowClass, boolean useMenuBar){
        return null; //TODO codavaj!!
    }

    /**
     * Actually creates the component for this controller.
     */
    protected void generateComponent(){
        return; //TODO codavaj!!
    }

    /**
     * Returns the integeration component. Often the same as the component.
     */
    public javax.swing.JComponent integrationComponent(){
        return null; //TODO codavaj!!
    }

    /**
     * Returns the minimum size for the integration component.
     */
    public java.awt.Dimension minimumIntegrationComponentSize(){
        return null; //TODO codavaj!!
    }

    /**
     * See the method description in the superclass EOController specification. EOWindowController's implementation simply returns false since its subcontroller is not allowed to become transient.
     */
    protected boolean removeTransientSubcontroller(com.webobjects.eoapplication.EOController controller){
        return false; //TODO codavaj!!
    }

    /**
     * Sets whether the activation action is to be used The activation action usually appears within another window's toolbar or menu and will open a new window controlled by this controller.
     */
    public void setUsesActivationAction(boolean flag){
        return; //TODO codavaj!!
    }

    /**
     * Sets the flag whether an activation button is used for this window (controller). The activation button appears within another window and will open a new window controlled by this controller.
     */
    public void setUsesActivationButton(boolean flag){
        return; //TODO codavaj!!
    }

    /**
     * Sets the flag whether this window will use user-defaults for its window location.
     */
    public void setUsesUserDefaultsWindowLocation(boolean flag){
        return; //TODO codavaj!!
    }

    /**
     * Sets the flag whether this window will use user-defaults for its window size.
     */
    public void setUsesUserDefaultsWindowSize(boolean flag){
        return; //TODO codavaj!!
    }

    /**
     * Sets the window position, as defined by the constants in EOComponentController, for example Left or Center.
     */
    public void setWindowPosition(int position){
        return; //TODO codavaj!!
    }

    /**
     * Returns whether the activation action is used The activation action usually appears within another window's toolbar or menu and will open a new window controlled by this controller.
     */
    public boolean usesActivationAction(){
        return false; //TODO codavaj!!
    }

    /**
     * Returns whether an activation button is used for this window (controller). The activation button appears within another window and will open a new window controlled by this controller.
     */
    public boolean usesActivationButton(){
        return false; //TODO codavaj!!
    }

    /**
     * Returns whether this window uses user-defaults for its window location.
     */
    public boolean usesUserDefaultsWindowLocation(){
        return false; //TODO codavaj!!
    }

    /**
     * Returns whether this window uses user-defaults for its window size.
     */
    public boolean usesUserDefaultsWindowSize(){
        return false; //TODO codavaj!!
    }

    protected java.awt.Dimension windowBorderSize(){
        return null; //TODO codavaj!!
    }

    /**
     * Returns the window positionas defined by the constants in EOComponentController, for example Left or Center.
     */
    public int windowPosition(){
        return 0; //TODO codavaj!!
    }

}

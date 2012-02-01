package com.webobjects.eoapplication;
public class EOSplitController extends com.webobjects.eoapplication.EOComponentController implements com.webobjects.eoapplication.EOComponentController.ResetUserInterface{
    public EOSplitController(){
         //TODO codavaj!!
    }

    public EOSplitController(com.webobjects.eoapplication.EOXMLUnarchiver unarchiver){
         //TODO codavaj!!
    }

    /**
     * Description copied from class:
     * Adds the integration component for the receiver's subcontroller, controller, to the user interface for the receiver.
     */
    protected void addComponentOfSubcontroller(com.webobjects.eoapplication.EOComponentController controller){
        return; //TODO codavaj!!
    }

    public boolean allowsOneTouchExpandable(){
        return false; //TODO codavaj!!
    }

    public boolean allowsSnapToZero(){
        return false; //TODO codavaj!!
    }

    /**
     * Description copied from class:
     * Invoked when it's necessary to create the receiver's component, including setting up the subcontroller area. Subclass implementations of this method usually invoke setComponent and if necessary setSubcontrollerArea. EOComponentController's default implementation creates an empty EOView to hold subcontroller components.
     * The layout mechanisms used to integrate the components of controllers expect that the component is generated with the minimum size possible.
     */
    protected void generateComponent(){
        return; //TODO codavaj!!
    }

    /**
     * Description copied from class:
     * Returns the current minimum size required to display the receiver's component, including the size required for its subcontroller area.
     */
    public java.awt.Dimension minimumComponentSize(){
        return null; //TODO codavaj!!
    }

    /**
     * Description copied from class:
     * Removes the user interface for the receiver's subcontroller, controller, from the receiver's user interface and informs controller that its integration component became invisible.
     */
    protected void removeComponentOfSubcontroller(com.webobjects.eoapplication.EOComponentController controller){
        return; //TODO codavaj!!
    }

    /**
     * Description copied from class:
     * See the method description for removeTransientSubcontroller in the EOController class specification. EOComponentController's implementation performs additional user interface cleanup for controllers that become transient.
     */
    protected boolean removeTransientSubcontroller(com.webobjects.eoapplication.EOController controller){
        return false; //TODO codavaj!!
    }

    /**
     * Description copied from interface:
     * Invoked to explicitly reset a controller's user interface to an original state.
     */
    public void resetUserInterface(){
        return; //TODO codavaj!!
    }

    public double resizeWeight(){
        return 0.0d; //TODO codavaj!!
    }

    public void setAllowsOneTouchExpandable(boolean allowsOneTouchExpandable){
        return; //TODO codavaj!!
    }

    public void setAllowsSnapToZero(boolean allowsSnapToZero){
        return; //TODO codavaj!!
    }

    public void setResizeWeight(double resizeWeight){
        return; //TODO codavaj!!
    }

    public void setUsesContinuousLayout(boolean usesContinuousLayout){
        return; //TODO codavaj!!
    }

    /**
     * Description copied from class:
     * Updates the receiver's user interface to accommodate a change to a subcontroller's minimum size. This method is invoked by subcontrollers when they change in a way that might affect their component's minimum size. A subcontroller sends this method with itself, its integration component, and its new minimum size as the arguments. The expectation is that the supercontroller will make space for the subcontroller if it needs to.
     */
    public void subcontrollerMinimumSizeDidChange(com.webobjects.eoapplication.EOComponentController controller, javax.swing.JComponent component, java.awt.Dimension updateMinimumSize){
        return; //TODO codavaj!!
    }

    public boolean usesContinuousLayout(){
        return false; //TODO codavaj!!
    }

}

package com.webobjects.eogeneration;
public class EOStaticIconController extends com.webobjects.eoapplication.EOComponentController{
    public EOStaticIconController(){
         //TODO codavaj!!
    }

    public EOStaticIconController(com.webobjects.eoapplication.EOXMLUnarchiver unarchiver){
         //TODO codavaj!!
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
     * Invoked when it's necessary to create the receiver's component, including setting up the subcontroller area. Subclass implementations of this method usually invoke setComponent and if necessary setSubcontrollerArea. EOComponentController's default implementation creates an empty EOView to hold subcontroller components.
     * The layout mechanisms used to integrate the components of controllers expect that the component is generated with the minimum size possible.
     */
    protected void generateComponent(){
        return; //TODO codavaj!!
    }

    /**
     * Description copied from class:
     * Sets the receiver's icon.
     */
    public void setIcon(javax.swing.Icon icon){
        return; //TODO codavaj!!
    }

}

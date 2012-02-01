package com.webobjects.eogeneration;
public class EOStaticLabelController extends com.webobjects.eoapplication.EOComponentController{
    public EOStaticLabelController(){
         //TODO codavaj!!
    }

    public EOStaticLabelController(com.webobjects.eoapplication.EOXMLUnarchiver unarchiver){
         //TODO codavaj!!
    }

    public int alignment(){
        return 0; //TODO codavaj!!
    }

    /**
     * Description copied from class:
     * Returns whether the controller can be transient. By default, a component controller is transient only if it's an instance of EOComponentController, not an instance of a subclass.
     */
    public boolean canBeTransient(){
        return false; //TODO codavaj!!
    }

    public java.awt.Color color(){
        return null; //TODO codavaj!!
    }

    public java.awt.Font font(){
        return null; //TODO codavaj!!
    }

    /**
     * Description copied from class:
     * Invoked when it's necessary to create the receiver's component, including setting up the subcontroller area. Subclass implementations of this method usually invoke setComponent and if necessary setSubcontrollerArea. EOComponentController's default implementation creates an empty EOView to hold subcontroller components.
     * The layout mechanisms used to integrate the components of controllers expect that the component is generated with the minimum size possible.
     */
    protected void generateComponent(){
        return; //TODO codavaj!!
    }

    public void setAlignment(int alignment){
        return; //TODO codavaj!!
    }

    public void setColor(java.awt.Color color){
        return; //TODO codavaj!!
    }

    public void setFont(java.awt.Font font){
        return; //TODO codavaj!!
    }

    /**
     * Description copied from class:
     * Sets the receiver's label.
     */
    public void setLabel(java.lang.String string){
        return; //TODO codavaj!!
    }

}

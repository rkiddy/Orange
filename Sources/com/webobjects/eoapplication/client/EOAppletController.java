package com.webobjects.eoapplication.client;
/**
 * EOAppletControllers represent applets in the controller hierarchy.
 */
public class EOAppletController extends com.webobjects.eoapplication.EOComponentController{
    /**
     * Creates an applet controller for an EOApplet.
     * Parameters:applet - the applet
     */
    public EOAppletController(com.webobjects.eoapplication.client.EOApplet applet){
         //TODO codavaj!!
    }

    /**
     * Returns the receiver's applet.
     */
    public com.webobjects.eoapplication.client.EOApplet applet(){
        return null; //TODO codavaj!!
    }

    /**
     * Sets the receiver's applet.
     */
    protected void setApplet(com.webobjects.eoapplication.client.EOApplet applet){
        return; //TODO codavaj!!
    }

    /**
     * Sets the visibility of the applet according to flag. Since applets can not be made invisible, this method is overridden to do nothing if visible is false.
     */
    public void setVisible(boolean flag){
        return; //TODO codavaj!!
    }

    /**
     * Properly integrates the content of the applet (the components of its subcontrollers, which are usually EOInterfaceControllers).
     */
    public boolean showInSupercontroller(){
        return false; //TODO codavaj!!
    }

}

package com.webobjects.eointerface.swing;
/**
 * EOSwingImageViewPlugin is a concrete subclass of EOValueAssociation.ValuePlugin that displays NSData as an java.awt.Image in an EOImageView.
 * Associations classes: EOValueAssociation
 * Widgets classes: EOImageView
 */
public class EOSwingImageViewPlugin extends com.webobjects.eointerface.EOValueAssociation.ValuePlugin{
    /**
     * Creates a new EOSwingImageViewPlugin connected to an association and a UI widget.
     * Parameters:association - EOValueAssociation object for the plugin to usewidget - EOImageView that the plugin will manage
     */
    public EOSwingImageViewPlugin(com.webobjects.eointerface.EOWidgetAssociation association, java.lang.Object widget){
         //TODO codavaj!!
    }

    /**
     * Clean up (end) the plugin's connection to its widget. In this case, however, it just re-initializes the data.
     */
    public void breakConnection(){
        return; //TODO codavaj!!
    }

    /**
     * Establishes a connection between the plugin and its UI widget. In this case, however, it just re-initializes the data.
     */
    public void establishConnection(){
        return; //TODO codavaj!!
    }

    /**
     * Converts the NSData object into an java.awt.Image, using Toolkit.createImage.
     * Override this method for custom behaviour.
     */
    protected java.awt.Image imageFromData(com.webobjects.foundation.NSData data){
        return null; //TODO codavaj!!
    }

    /**
     * Set NSData object to be used for the image, and set the enabled state of the view.
     */
    public void setValue(java.lang.Object value, boolean isEnabled){
        return; //TODO codavaj!!
    }

    /**
     * Returns the data object used to create the plugin view's image.
     */
    public java.lang.Object value(){
        return null; //TODO codavaj!!
    }

}

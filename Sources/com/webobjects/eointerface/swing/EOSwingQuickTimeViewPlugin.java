package com.webobjects.eointerface.swing;
/**
 * EOSwingQuickTimeViewPlugin is a concrete subclass of EOValueAssociation.ValuePlugin that displays QuickTime content from a URL which is passed in as a value, using an EOQuickTimeView.
 * Associations classes: EOValueAssociation
 * Widgets classes: EOQuickTimeView
 */
public class EOSwingQuickTimeViewPlugin extends com.webobjects.eointerface.EOValueAssociation.ValuePlugin{
    /**
     * Creates a new EOSwingQuickTimeViewPlugin connected to an association and a UI widget.
     * Parameters:association - EOValueAssociation object for the plugin to usewidget - EOQuickTimeView that the plugin will manage
     */
    public EOSwingQuickTimeViewPlugin(com.webobjects.eointerface.EOWidgetAssociation association, java.lang.Object widget){
         //TODO codavaj!!
    }

    /**
     * Clean up (end) the plugin's connection to its widget. In this case, however, it just re-initializes the URL value.
     */
    public void breakConnection(){
        return; //TODO codavaj!!
    }

    /**
     * Establishes a connection between the plugin and its UI widget. In this case, however, it just re-initializes the URL value.
     */
    public void establishConnection(){
        return; //TODO codavaj!!
    }

    /**
     * Set the URL for the QuickTime movie to be diplayed, and set the enabled state of the view.
     */
    public void setValue(java.lang.Object value, boolean isEnabled){
        return; //TODO codavaj!!
    }

    /**
     * Returns the specific unacceptable aspects for this plugin.
     */
    public java.lang.String[] unacceptableAspects(){
        return null; //TODO codavaj!!
    }

    /**
     * Overrides useURLAsValue to indicate (mainly for internal purposes) that the value is not the data itself, but an URL for some data.
     */
    public boolean useURLAsValue(){
        return false; //TODO codavaj!!
    }

    /**
     * Returns the value set with setValue as URL for the QuickTime content.
     */
    public java.lang.Object value(){
        return null; //TODO codavaj!!
    }

}

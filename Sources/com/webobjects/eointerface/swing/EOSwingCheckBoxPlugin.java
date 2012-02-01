package com.webobjects.eointerface.swing;
/**
 * EOSwingCheckBoxPlugin is a concrete subclass of EOValueAssociation.ValuePlugin which is used with Swing's JCheckBox.
 * Associations classes: EOValueAssociation
 * Widgets classes: JCheckBox
 */
public class EOSwingCheckBoxPlugin extends com.webobjects.eointerface.EOValueAssociation.ValuePlugin implements java.awt.event.ItemListener{
    /**
     * Creates a new EOSwingCheckBoxPlugin connected to an association and a UI widget.
     * Parameters:association - association of class EOValueAssociation or subclass for the plugin to usewidget - widget of class JCheckBox or subclass that the plugin will manage
     */
    public EOSwingCheckBoxPlugin(com.webobjects.eointerface.EOWidgetAssociation association, java.lang.Object widget){
         //TODO codavaj!!
    }

    /**
     * Clean up (end) the plugin's connection to its JCheckBox widget. This makes sure that ItemEvent's from the JCheckBox are not sent anymore to this plugin.
     */
    public void breakConnection(){
        return; //TODO codavaj!!
    }

    /**
     * Establishes a connection between the plugin and its UI widget. This makes sure that ItemEvent's from the JCheckBox are sent to this plugin.
     */
    public void establishConnection(){
        return; //TODO codavaj!!
    }

    /**
     * Invokes widgetDidChange on the plugin's EOValueAssociation.
     */
    public void itemStateChanged(java.awt.event.ItemEvent event){
        return; //TODO codavaj!!
    }

    /**
     * Sets the checkbox to 'checked' or 'not-checked' and also sets the enabled state.
     */
    public void setValue(java.lang.Object value, boolean isEnabled){
        return; //TODO codavaj!!
    }

    /**
     * Return whether or not the checkbox is checked.
     */
    public java.lang.Object value(){
        return null; //TODO codavaj!!
    }

    /**
     * Returns an array of Strings which represent outlet names in Interface Builder. These outlets are disabled by Interface Builder once the button is connected to this plugins association.
     */
    public java.lang.String[] widgetKeysTaken(){
        return null; //TODO codavaj!!
    }

}

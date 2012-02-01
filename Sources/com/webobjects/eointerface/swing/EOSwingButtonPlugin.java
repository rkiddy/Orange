package com.webobjects.eointerface.swing;
/**
 * EOSwingButtonPlugin is a concrete subclass of EOActionWidgetAssociation.ActionPlugin which is used with Swing buttons.
 * Associations classes: EOActionWidgetAssociation
 * Widgets classes: AbstractButton (JButton)
 */
public class EOSwingButtonPlugin extends com.webobjects.eointerface.EOActionWidgetAssociation.ActionPlugin implements java.awt.event.ActionListener{
    /**
     * Creates a new EOSwingButtonPlugin connected to an association and a UI widget.
     * Parameters:association - association of class EOValueAssociation or subclass for the plugin to usewidget - widget of AbstractButton or subclass that the plugin will manage
     */
    public EOSwingButtonPlugin(com.webobjects.eointerface.EOWidgetAssociation association, java.lang.Object widget){
         //TODO codavaj!!
    }

    /**
     * Invokes invokeAction on the plugin's EOActionWidgetAssociation
     */
    public void actionPerformed(java.awt.event.ActionEvent event){
        return; //TODO codavaj!!
    }

    /**
     * Clean up (end) the plugin's connection to its AbstractButton widget. This makes sure that ActionEvent's from the AbstractButton are not sent anymore to this plugin.
     */
    public void breakConnection(){
        return; //TODO codavaj!!
    }

    /**
     * Establishes a connection between the plugin and its UI widget. This makes sure that ActionEvent's from the AbstractButton are sent to this plugin.
     */
    public void establishConnection(){
        return; //TODO codavaj!!
    }

    /**
     * Will pass on the enabled state to the AbstractButton widget.
     */
    public void setEnabled(boolean flag){
        return; //TODO codavaj!!
    }

    /**
     * Returns an array of Strings which represent outlet names in Interface Builder. These outlets are disabled by Interface Builder once the button is connected to this plugins association.
     */
    public java.lang.String[] widgetKeysTaken(){
        return null; //TODO codavaj!!
    }

}

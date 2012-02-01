package com.webobjects.eointerface.swing;
/**
 * EOSwingComboBoxPlugin is a concrete subclass of EOValueSelectionAssociation.ValueSelectionPlugin which is used with Swing's JComboBox.
 * Associations classes: EOValueSelectionAssociation
 * Widgets classes: JComboBox
 */
public class EOSwingComboBoxPlugin extends com.webobjects.eointerface.EOValueSelectionAssociation.ValueSelectionPlugin implements java.awt.event.ActionListener, com.webobjects.eointerface.EOWidgetAssociation.WidgetPlugin.Formatting{
    /**
     * Creates a new EOSwingComboBoxPlugin connected to an association and a UI widget.
     * Parameters:association - Association of class EOValueSelectionAssociation or subclass for the plugin to usewidget - Widget of class JComboBox or subclass that the plugin will manage
     */
    public EOSwingComboBoxPlugin(com.webobjects.eointerface.EOWidgetAssociation association, java.lang.Object widget){
         //TODO codavaj!!
    }

    /**
     * Invokes widgetSelectionDidChange on this plugin's EOValueSelectionAssociation.
     */
    public void actionPerformed(java.awt.event.ActionEvent event){
        return; //TODO codavaj!!
    }

    /**
     * Clean up (end) the plugin's connection to its JComboBox widget. This makes sure that action events from the JComboBox are not sent anymore to this plugin.
     */
    public void breakConnection(){
        return; //TODO codavaj!!
    }

    /**
     * Establishes a connection between the plugin and its UI widget. This makes sure that action events from the JComboBox are sent to this plugin.
     */
    public void establishConnection(){
        return; //TODO codavaj!!
    }

    /**
     * Returns the selected choice in the JComboBox.
     */
    public int selectionIndex(){
        return 0; //TODO codavaj!!
    }

    /**
     * Sets the selected choice and whether the JCombobox is enabled
     */
    public void setSelectionIndex(int selectionIndex, boolean isEnabled){
        return; //TODO codavaj!!
    }

    /**
     * Sets the titles in the plugin's JComboBox.
     * If objects is null, clear out titles -- (only invoked if EOAssociation.TitlesAspect is bound).
     */
    public void setTitlesFromObjects(java.lang.Object[] objects){
        return; //TODO codavaj!!
    }

    /**
     * Sets a formatter for the available choices (titles) in the JComboBox, which will format an array of objects coming from the EOValueSelectionAssociation into displayed strings.
     */
    public void setValueFormatter(java.lang.Object formatter){
        return; //TODO codavaj!!
    }

    /**
     * Returns an array of available titles in the plugin's combo box
     */
    public java.lang.String[] titles(){
        return null; //TODO codavaj!!
    }

    /**
     * Returns the format set with setValueFormatter.
     */
    public java.lang.Object valueFormatter(){
        return null; //TODO codavaj!!
    }

    /**
     * Returns an array of Strings which represent outlet names in Interface Builder These outlets are disabled by Interface Builder once the button is connected to this plugins association.
     */
    public java.lang.String[] widgetKeysTaken(){
        return null; //TODO codavaj!!
    }

}

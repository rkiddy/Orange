package com.webobjects.eointerface.swing;
/**
 * EOSwingTextPlugin is a concrete subclass of EOTextAssociation.TextPlugin which is used a Swing JTextComponent (or a EOTextComponentAccess, which includes a JTextComponent).
 * Associations classes: EOTextAssociation
 * Widgets classes: JTextComponent (EOTextField) or EOTextComponentAccess (EOTextField, EOTextArea, EOFormCell)
 * value classes: String or other classes with formatters (Numbers with NSNumberFormatter, NSTimestamp with NSTimestampFormatter)
 */
public class EOSwingTextPlugin extends com.webobjects.eointerface.EOTextAssociation.TextPlugin implements java.awt.event.FocusListener, javax.swing.event.DocumentListener, com.webobjects.eointerface.EOWidgetAssociation.WidgetPlugin.Formatting{
    /**
     * Creates a new EOSwingTextPlugin connected to an association and a UI widget.
     * Parameters:association - association of class EOTextAssociation or subclass for the plugin to usewidget - widget of class JTextComponent or subclass, or a subclass of EOTextComponentAccess (which includes a JTextComponent), that the plugin will manage.
     */
    public EOSwingTextPlugin(com.webobjects.eointerface.EOWidgetAssociation association, java.lang.Object widget){
         //TODO codavaj!!
    }

    /**
     * Cleans up (ends) the plugin's connection to its JTextComponent widget. This also makes sure that FocusEvent's from the JTextComponent are not sent anymore to this plugin.
     */
    public void breakConnection(){
        return; //TODO codavaj!!
    }

    /**
     * Conforming to DocumentListener. Invokes EOValueAssociation.widgetDidBeginEditing.
     */
    public void changedUpdate(javax.swing.event.DocumentEvent event){
        return; //TODO codavaj!!
    }

    /**
     * Called to halt editing of this plugin's widget.
     */
    public boolean endEditing(){
        return false; //TODO codavaj!!
    }

    /**
     * Establishes a connection between the plugin and its UI widget. This also makes sure that FocusEvent's from the JTextComponent are sent to this plugin.
     */
    public void establishConnection(){
        return; //TODO codavaj!!
    }

    /**
     * Conforming to FocusListener.
     */
    public void focusGained(java.awt.event.FocusEvent event){
        return; //TODO codavaj!!
    }

    /**
     * Conforming to FocusListener. Invokes EOValueAssociation.widgetDidEndEditing.
     */
    public void focusLost(java.awt.event.FocusEvent event){
        return; //TODO codavaj!!
    }

    /**
     * Conforming to DocumentListener. Invokes EOValueAssociation.widgetDidBeginEditing.
     */
    public void insertUpdate(javax.swing.event.DocumentEvent event){
        return; //TODO codavaj!!
    }

    /**
     * Conforming to DocumentListener. Invokes EOValueAssociation.widgetDidBeginEditing.
     */
    public void removeUpdate(javax.swing.event.DocumentEvent event){
        return; //TODO codavaj!!
    }

    /**
     * Sets the colors of the text widget.
     */
    public void setColors(java.lang.Object textColor, java.lang.Object bgColor){
        return; //TODO codavaj!!
    }

    /**
     * Sets the font properties of the text widget.
     */
    public void setFontProperties(int boldState, int italicState){
        return; //TODO codavaj!!
    }

    /**
     * Sets value as the object to display in the plugin's widget .
     */
    public void setValue(java.lang.Object value, boolean isEnabled){
        return; //TODO codavaj!!
    }

    /**
     * Set the formatter for this plugin's text component.
     */
    public void setValueFormatter(java.lang.Object formatter){
        return; //TODO codavaj!!
    }

    /**
     * Returns the value of the text widget.
     */
    public java.lang.Object value(){
        return null; //TODO codavaj!!
    }

    /**
     * Returns the Format for this plugin's text component.
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

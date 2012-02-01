package com.webobjects.eointerface;
/**
 * EOTextAssociation is used as an association for displaying text values, with widgets such as NSTextFieldCell or JTextField. See EOAssociation for a general description of associations.
 * Aspects:
 * EOAssociation.ValueAspect,
 * EOAssociation.URLAspect,
 * EOAssociation.BackgroundColorAspect,
 * EOAssociation.BoldAspect,
 * EOAssociation.ItalicAspect,
 * EOAssociation.TextColorAspect,
 * EOAssociation.EnabledAspect
 * See Also:EOAssociation
 */
public class EOTextAssociation extends com.webobjects.eointerface.EOValueAssociation{
    /**
     * Returns a new EOTextAssociation object that is not (yet) bound to any display group.
     * Parameters:widget - the UI widget that the association will use to display text values
     */
    public EOTextAssociation(java.lang.Object widget){
         //TODO codavaj!!
    }

    /**
     * This method returns the global defaults for the background colors of disabled text fields.
     */
    public static java.lang.Object defaultDisabledBackgroundColor(){
        return null; //TODO codavaj!!
    }

    /**
     * This method returns the global defaults for the background colors of enabled text fields.
     */
    public static java.lang.Object defaultEnabledBackgroundColor(){
        return null; //TODO codavaj!!
    }

    /**
     * This method returns a String value loaded from the URL specified. An exception might be thrown (NSForwardException) for unsupported encodings.
     */
    protected java.lang.Object displayValueFromURL(java.lang.String URLString){
        return null; //TODO codavaj!!
    }

    /**
     * Clears all references this association has to other objects especially its display object and EODisplayGroup. Call this method before nulling out a reference to this association to ensure it gets garbage collected properly. Subclasses should override this method to do any additional cleanup that may be needed and invoke super's implementation at the end.
     */
    public void dispose(){
        return; //TODO codavaj!!
    }

    /**
     * This method sets the global defaults for the background colors of text fields.
     */
    public static void setDefaultBackgroundColors(java.lang.Object enabledColor, java.lang.Object disabledColor){
        return; //TODO codavaj!!
    }

    /**
     * This method defines whether the text widget managed by this association will use the global defaults for background colors.
     */
    public void setUsesDefaultBackgroundColors(boolean flag){
        return; //TODO codavaj!!
    }

    /**
     * This method returns whether the text widget managed by this association will use the global defaults for background colors.
     */
    public boolean usesDefaultBackgroundColors(){
        return false; //TODO codavaj!!
    }

    /**
     * TextPlugin communicates with a UI widget (NSTextFieldCell or JTextField, for example) on behalf of an EOTextAssociation. The TextPlugin class defines some basic functionality concrete subclasses must implement for this communication to work.
     */
    public static abstract class TextPlugin extends com.webobjects.eointerface.EOValueAssociation.ValuePlugin{
        /**
         * Subclasses should override this constructor to do any initialization they need to, but should call the super(association, widget) constructor.
         * Parameters:association - EOTextAssociation object for which the plugin will handle setting and getting values on the UI widgetwidget - user interface object that the plugin will use for display
         */
        public TextPlugin(com.webobjects.eointerface.EOWidgetAssociation association, java.lang.Object widget){
             //TODO codavaj!!
        }

        /**
         * This method sets the foreground and background colors for the text widget.
         */
        public abstract void setColors(java.lang.Object textColor, java.lang.Object bgColor);

        /**
         * This method sets the font properties (bold and italic) of the text widget.
         */
        public abstract void setFontProperties(int boldState, int italicState);

    }
}

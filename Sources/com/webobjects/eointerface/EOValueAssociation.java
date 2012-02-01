package com.webobjects.eointerface;
/**
 * EOValueAssociation is used for associations that display a single value object in a widget, with the value usually being editable. See EOAssociation for a general description of associations.
 * Aspects:
 * EOAssociation.ValueAspect,
 * EOAssociation.URLAspect,
 * EOAssociation.EnabledAspect
 * See Also:EOAssociation
 */
public class EOValueAssociation extends com.webobjects.eointerface.EOWidgetAssociation{
    /**
     * Returns a new EOValueAssociation object that is not bound to any display group.
     * Parameters:widget - the UI widget object that the association expects to use to display values
     */
    public EOValueAssociation(java.lang.Object widget){
         //TODO codavaj!!
    }

    /**
     * Defines the receiver's link between its display object and displayGroup. aspect is the name of the aspect it observes in its display object, and key is the name of the property it observes in displayGroup. Invoke establishConnection after this method to finish setting up the binding.
     */
    public void bindAspect(java.lang.String aspect, com.webobjects.eointerface.EODisplayGroup displayGroup, java.lang.String key){
        return; //TODO codavaj!!
    }

    protected java.lang.String displayValueAspect(){
        return null; //TODO codavaj!!
    }

    /**
     * When the Association stores a URL rather than the data the URL references, this method is used to obtain (load) the data pointed to by the URL.
     */
    protected java.lang.Object displayValueFromURL(java.lang.String URLString){
        return null; //TODO codavaj!!
    }

    /**
     * This method will end editing for both the widget plugin and the Association.
     */
    public boolean endEditing(){
        return false; //TODO codavaj!!
    }

    /**
     * This method returns the primary aspect for this value association.
     */
    public java.lang.String primaryAspect(){
        return null; //TODO codavaj!!
    }

    /**
     * Overridden by subclasses to update state when an EODisplayGroup's selections or contents change. This method is invoked automatically anytime a display group that's bound to the receiver changes. The receiver can query its display group with selectionChanged and contentsChanged messages to determine how to update the display.
     */
    public void subjectChanged(){
        return; //TODO codavaj!!
    }

    /**
     * This method is called to notify the Association that the widget entered the editing state.
     */
    public boolean widgetDidBeginEditing(){
        return false; //TODO codavaj!!
    }

    /**
     * This method is called to notify the Association that the widget has changed data values for this association.
     */
    public boolean widgetDidChange(){
        return false; //TODO codavaj!!
    }

    /**
     * This method is called to notify the Association that the widget has no longer in an editing state.
     */
    public boolean widgetDidEndEditing(){
        return false; //TODO codavaj!!
    }

    /**
     * Description copied from class:
     * Returns the Class of widget plugin that this association requires for operation. Subclasses should override this method to return the Class of plugin they require in order to work. (For example EOActionWidgetAsssociation requires a plugin class of EOActionWidgetAssociation.ActionPlugin).
     */
    protected java.lang.Class widgetPluginClass(){
        return null; //TODO codavaj!!
    }

    /**
     * ValuePlugin communicates with a UI widget on behalf of an EOValueAssociation. The ValuePlugin class defines some basic functionality concrete subclasses must implement for this communication to work.
     */
    public static abstract class ValuePlugin extends com.webobjects.eointerface.EOWidgetAssociation.WidgetPlugin{
        /**
         * Subclasses should override this constructor to do any initialization they need to, but should call the super(association, widget) constructor.
         * Parameters:association - EOValueAssociation object for which the plugin will handle setting and getting values on the UI widgetwidget - the UI object that the plugin will use for display
         */
        public ValuePlugin(com.webobjects.eointerface.EOWidgetAssociation association, java.lang.Object widget){
             //TODO codavaj!!
        }

        /**
         * Tells the plugin to stop any editing occuring in the UI at the moment. The default implementation simply returns true.
         */
        public boolean endEditing(){
            return false; //TODO codavaj!!
        }

        /**
         * Sets the value of this plugin's widget to value.
         */
        public abstract void setValue(java.lang.Object value, boolean isEnabled);

        /**
         * Expresses whether or not the plugin will use a URL for its display value. Subclasses that want to handle the URL directly can override this method to return true. Otherwise EOValueAssociation wiill try to retrieve the data that the URL points to and use that as the value to set in the widget.
         */
        public boolean useURLAsValue(){
            return false; //TODO codavaj!!
        }

        public abstract java.lang.Object value();

    }
}

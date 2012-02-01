package com.webobjects.eointerface;
/**
 * The EOWidgetAssociation is the superclass for all associations that connect to user interface widgets. Because associations are meant to be widget-set independent, EOWidgetAssociations manage their UI widgets through the help of EOWidgetAssociation.WidgetPlugin concrete subclasses. Each EOWidgetAssociation has a related abstract plugin class. Concrete plugin implementations handle communicating with widgets in a platform specific way. For instance, the EOCocoaButtonPlugin reacts to actions on Cocoa NSButtons, while the EOSwingButtonPlugin reacts to events from javax.swing.JButtons. The abstraction the widget-plugins provide allows for an identical set of EOAssociations for both Cocoa/EOF and Java Client applications.
 * Widget plugins are automatically created for EOWidgetAssociations based on the widget the association is set up to work with. In order to know what kind of plugin to create, EOInterface keeps a registry of whcih plugins should be created for any pairing of an association and a widget. This registry is held in the EOWidgetPluginRegistry.
 * See Also:EOWidgetPluginRegistry
 */
public abstract class EOWidgetAssociation extends com.webobjects.eointerface.EOAssociation{
    /**
     * Used by subclasses of EOWidgetAssociation to initialize data structures and set aDisplayObject as the display object that the association manages.
     * Parameters:aDisplayObject - display object for this association to manage; subclasses should call their super class's constructor and pass in aDisplayObject
     */
    public EOWidgetAssociation(java.lang.Object aDisplayObject){
         //TODO codavaj!!
    }

    /**
     * Returns whether or not this association supports setting a value formatter on its plugin or display object.
     */
    public boolean canSupportValueFormatter(){
        return false; //TODO codavaj!!
    }

    /**
     * Returns the default value for the class preference for continuous change notification.
     */
    public static boolean defaultPrefersContinuousChangeNotification(){
        return false; //TODO codavaj!!
    }

    /**
     * Clears all references this association has to other objects especially its display object and EODisplayGroup. Call this method before nulling out a reference to this association to ensure it gets garbage collected properly. Subclasses should override this method to do any additional cleanup that may be needed and invoke super's implementation at the end.
     */
    public void dispose(){
        return; //TODO codavaj!!
    }

    /**
     * Returns true if aDisplayObject is usable with the association.
     */
    public boolean isUsableWithObject(java.lang.Object aDisplayObject){
        return false; //TODO codavaj!!
    }

    /**
     * Overridden by subclasses to return the names of display object outlets that instances assume control of. Interface Builder uses this information to disable connections from these outlets in its Connections Inspector.
     */
    public com.webobjects.foundation.NSArray objectKeysTaken(){
        return null; //TODO codavaj!!
    }

    /**
     * Returns whether or not the receiver should be notified of every change made to its display object. If the preference has not been changed using the setPrefersContinuousChangeNotification method, the result will be the same as the defaultPrefersContinuousChangeNotification result.
     */
    public boolean prefersContinuousChangeNotification(){
        return false; //TODO codavaj!!
    }

    /**
     * Sets the default preference for continuous change notification for all new instances of the association.
     */
    public static void setDefaultPrefersContinuousChangeNotification(boolean flag){
        return; //TODO codavaj!!
    }

    /**
     * See the setObject method description in the superclass EOAssociation.
     */
    public void setObject(java.lang.Object object){
        return; //TODO codavaj!!
    }

    /**
     * Sets whether or not the receiver should be notified of every change made to its display object.
     */
    public void setPrefersContinuousChangeNotification(boolean flag){
        return; //TODO codavaj!!
    }

    /**
     * Attempts to set format as the formatter object for this association's display object. If the association's widget plugin is null or it doesn't implement the EOWidgetAssociation.WidgetPlugin.Formatting interface, this method throws an IllegalStateException.
     */
    public void setValueFormatter(java.lang.Object format){
        return; //TODO codavaj!!
    }

    /**
     * Returns the object used to format values in the association's display object. If the association's widget plugin is null or it doesn't implement the EOWidgetAssociation.WidgetPlugin.Formatting interface, this method throws an IllegalStateException.
     */
    public java.lang.Object valueFormatter(){
        return null; //TODO codavaj!!
    }

    public com.webobjects.eointerface.EOWidgetAssociation.WidgetPlugin widgetPlugin(){
        return null; //TODO codavaj!!
    }

    /**
     * Returns the Class of widget plugin that this association requires for operation. Subclasses should override this method to return the Class of plugin they require in order to work. (For example EOActionWidgetAsssociation requires a plugin class of EOActionWidgetAssociation.ActionPlugin).
     */
    protected java.lang.Class widgetPluginClass(){
        return null; //TODO codavaj!!
    }

    /**
     * WidgetPlugin is an abstract superclass for plugins that provide a layer of abstraction between user interface widgets and EOWidgetAssociation subclasses. Concrete subclasses of WidgetPlugin communicate with specific UI widgets on behalf of its widget association. This way, EOWidgetAssociations don't have to know anything about the specific API used to communicate with an UI element. There are plugins that work with Swing/JFC widgets as well as Cocoa widgets, yet the WidgetAssociations contain no knowledge of either Swing or Cocoa.
     */
    public static abstract class WidgetPlugin implements com.webobjects.foundation.NSDisposable{
        /**
         * Subclasses should override this constructor to perform any additional setup and then invoke super's implementation.
         * Parameters:association - EOActionWidgetAssociation that the plugin will communicate withwidget - the UI widget that the plugin will communicate with
         */
        public WidgetPlugin(com.webobjects.eointerface.EOWidgetAssociation association, java.lang.Object widget){
             //TODO codavaj!!
        }

        /**
         * Returns this plugin's associated EOAssociation.
         */
        public com.webobjects.eointerface.EOWidgetAssociation association(){
            return null; //TODO codavaj!!
        }

        /**
         * Removes the receiver from its EOAssociation and display object. Subclasses should override this method to clear references to the display object and association and invoke super's implementation at the end.
         */
        public void breakConnection(){
            return; //TODO codavaj!!
        }

        /**
         * Clears all references this plugin has to other objects especially its display object and EOAssociation. Call this method before nulling out a reference to this plugin to ensure it gets garbage collected properly. Subclasses should override this method to do any additional cleanup that may be needed and invoke super's implementation at the end.
         */
        public void dispose(){
            return; //TODO codavaj!!
        }

        /**
         * Overridden by subclasses to attach the receiver to its display object, and to otherwise configure the display object. Subclasses should invoke super's implementation after establishing their own connections.
         */
        public void establishConnection(){
            return; //TODO codavaj!!
        }

        /**
         * Returns an array of Strings representing the aspect keys that must not be bound in this plugin.
         */
        public java.lang.String[] unacceptableAspects(){
            return null; //TODO codavaj!!
        }

        /**
         * Returns the user interface widget this plugin manages for its association.
         */
        public java.lang.Object widget(){
            return null; //TODO codavaj!!
        }

        /**
         * Returns an array of String "keys" the plugin will "take over" in its widget. For Swing widgets and plugins, the keys are the event listener methods for the widget. For Cocoa widgets and plugins, the keys are the widget outlets used for event notification and targets.
         */
        public java.lang.String[] widgetKeysTaken(){
            return null; //TODO codavaj!!
        }

        /**
         * The Formatting interface defines the basic methods needed to enable setting and getting formatting for a display object. In this way, some widget set specific formatting object can be applied to a display object without the plugin's association knowing anything about the formatting object.
         * Plugins that implement the Formatting interface only need to know how to get and set the formatting object of their display objects.
         */
        public static interface Formatting{
            /**
             * Sets valueFormatter to act on the receiver. The plugin should use the valueFormatter object to apply formatting to its display object.
             */
            abstract void setValueFormatter(java.lang.Object valueFormatter);

            /**
             * Returns the formatter object of the receiver.
             */
            abstract java.lang.Object valueFormatter();

        }
    }
}

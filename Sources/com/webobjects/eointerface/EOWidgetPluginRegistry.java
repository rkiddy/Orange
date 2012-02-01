package com.webobjects.eointerface;
/**
 * The EOWidgetPluginRegistry maintains a mapping from widget plugin classes to association and widget classes. The registry provides static methods for setting and getting which plugin should be used, given a widget and association. So, for any pair of association and widget classes, there can be only one widget plugin class registered. This allows for objects of any association class to be used with multiple widgets (regardless of widget set). Typically, when an application using the widget plugin registry starts up, the application first registers widget plugins with the registry, before the application's nib's are loaded.
 */
public class EOWidgetPluginRegistry{
    public EOWidgetPluginRegistry(){
         //TODO codavaj!!
    }

    /**
     * Searches the set of registered plugins, looking for a widget plugin class that is registered for use with EOAssociation's of class associationClass and objects of class widgetClass and returns the first one found. This method will attempt to find a widget plugin for widgetClass's superclass or associationClass's superclass if no widget plugin is registered for widgetClass and associationClass.
     */
    public static java.lang.Class findWidgetPluginClass(java.lang.Class associationClass, java.lang.Class widgetClass){
        return null; //TODO codavaj!!
    }

    /**
     * Creates a new instance of the widget plugin class that is usable with association and widget. This method looks for the widget plugin class that is registered for use with association and widget. This method throws an IllegalArgumentException if either association or widget are null or if the found widget plugin class is not a subclass of association.widgetPluginClass(). Throws an IllegalStateException if no widget plugin is registered for use with association and widget.
     */
    public static com.webobjects.eointerface.EOWidgetAssociation.WidgetPlugin newWidgetPluginForAssociation(com.webobjects.eointerface.EOWidgetAssociation association, java.lang.Object widget){
        return null; //TODO codavaj!!
    }

    /**
     * Registers widgetPluginClass with the application's EOWidgetPluginRegistry. widgetPluginClass is registered as the widget plugin class to use to connect associations of class associationClass to widgets of class widgetClass. Any widget plugin class that was previously registered for this associationClass/widgetClass combination is unregistered.
     */
    public static void registerWidgetPluginClass(java.lang.Class associationClass, java.lang.Class widgetClass, java.lang.Class widgetPluginClass){
        return; //TODO codavaj!!
    }

    /**
     * Sets widgetSetPlugin as the application's WidgetSetPlugin.
     */
    public static void setWidgetSetPlugin(com.webobjects.eointerface.EOWidgetPluginRegistry.WidgetSetPlugin widgetSetPlugin){
        return; //TODO codavaj!!
    }

    /**
     * Returns the application's WidgetSetPlugin.
     */
    public static com.webobjects.eointerface.EOWidgetPluginRegistry.WidgetSetPlugin widgetSetPlugin(){
        return null; //TODO codavaj!!
    }

    /**
     * Abstract super class for plugins that handle the widget set specific task of displaying alert panels.
     */
    public static abstract class WidgetSetPlugin{
        /**
         * Value retruned when the user selects cancel, no, or the alternate button in an alert panel.
         * See Also:Constant Field Values
         */
        public static final int AlertPanelAlternateAction=1;

        /**
         * Value retruned when the user selects ok, yes, or the default button in an alert panel.
         * See Also:Constant Field Values
         */
        public static final int AlertPanelDefaultAction=0;

        /**
         * Value retruned when the user selects the third or other button in an alert panel.
         * See Also:Constant Field Values
         */
        public static final int AlertPanelOtherAction=2;

        public WidgetSetPlugin(){
             //TODO codavaj!!
        }

        /**
         * Returns the ResourceBundle used to locate localized strings.
         */
        public java.util.ResourceBundle defaultStringLocalizationResourceBundle(){
            return null; //TODO codavaj!!
        }

        /**
         * Returns a localized string for string .
         */
        public java.lang.String localizedString(java.lang.String string){
            return null; //TODO codavaj!!
        }

        /**
         * Displays an alert panel to the user giving the user up to three option buttons.
         */
        public abstract int runAlertPanel(java.lang.String title, java.lang.String message, java.lang.String defaultButton, java.lang.String alternateButton, java.lang.String otherButton);

        /**
         * Displays an error panel to the user with one button.
         */
        public void runErrorPanel(java.lang.String title, java.lang.String message, java.lang.String okButton){
            return; //TODO codavaj!!
        }

        /**
         * Sets the ResourceBunde to search when looking for localized strings.
         */
        public void setDefaultStringLocalizationResourceBundle(java.util.ResourceBundle resourceBundle){
            return; //TODO codavaj!!
        }

    }
}

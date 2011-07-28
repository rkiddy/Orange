
package com.webobjects.eointerface;

import com.webobjects.foundation.*;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.util.MissingResourceException;
import java.util.ResourceBundle;


public class EOWidgetPluginRegistry {
    static class _RegistryInfo {


        public _RegistryInfo(Class associationClass, Class widgetClass) { return null; }

        public int hashCode() { return 0; }

        public boolean equals(Object object) { return true; }

        private Class _associationClass;
        private Class _widgetClass;
        private int _hashCode;

    }

    public static abstract class WidgetSetPlugin {


        public WidgetSetPlugin() { return null; }

        public void runErrorPanel(String title, String message, String okButton) {}

        public abstract int runAlertPanel(String s, String s1, String s2, String s3, String s4);

        public void setDefaultStringLocalizationResourceBundle(ResourceBundle resourceBundle) {}

        public ResourceBundle defaultStringLocalizationResourceBundle() { return null; }

        public String localizedString(String string) { return null; }

        static  {}

        public static final Class _CLASS;
        public static final int AlertPanelDefaultAction = 0;
        public static final int AlertPanelAlternateAction = 1;
        public static final int AlertPanelOtherAction = 2;
        private ResourceBundle _stringLocalizationResourceBundle;

    }



    public EOWidgetPluginRegistry() { return null; }

    public static void setWidgetSetPlugin(WidgetSetPlugin widgetSetPlugin) { return null; }

    public static WidgetSetPlugin widgetSetPlugin() { return null; }

    static void _runErrorPanel(String title, String message, String okButton) {}

    static int _runAlertPanel(String title, String message, String defaultButton, String alternateButton, String otherButton) { return 0; }

    static String _localizedString(String string) { return null; }

    public static void _registerWidgetPluginClassWithWidgetClassName(Class associationClass, String widgetClassName, String widgetPluginClassName) { return null; }

    public static void registerWidgetPluginClass(Class associationClass, Class widgetClass, Class widgetPluginClass) { return null; }

    public static Class findWidgetPluginClass(Class associationClass, Class widgetClass) { return null; }

    public static EOWidgetAssociation.WidgetPlugin newWidgetPluginForAssociation(EOWidgetAssociation association, Object widget) { return null; }

    static  {}

    public static final Class _CLASS;
    private static final String _DefaultAlertPanelTitle = "Alert";
    private static final String _DefaultAlertPanelDefaultButtonTitle = "Ok";
    private static _NSThreadsafeMutableDictionary _widgetPluginRegistry;
    private static WidgetSetPlugin _widgetSetPlugin;

}


package com.webobjects.eointerface;

import com.webobjects.foundation.*;


public abstract class EOWidgetAssociation extends EOAssociation {
    public static abstract class WidgetPlugin
        implements NSDisposable {


        public WidgetPlugin(EOWidgetAssociation association, Object widget) { return null; }

        public void dispose() {}

        public EOWidgetAssociation association() { return null; }

        public Object widget() { return null; }

        public void establishConnection() {}

        public void breakConnection() {}

        public String[] widgetKeysTaken() { return null; }

        public String[] unacceptableAspects() { return null; }

        static  {}

        public static final Class _CLASS;
        private static final String _NoStrings[];
        private EOWidgetAssociation _association;
        private Object _widget;

    }



    public static void setDefaultPrefersContinuousChangeNotification(boolean flag) { return null; }

    public static boolean defaultPrefersContinuousChangeNotification() { return null; }

    public EOWidgetAssociation(Object aDisplayObject) { return null; }

    public void dispose() {}

    public boolean isUsableWithObject(Object aDisplayObject) { return true; }

    public void setObject(Object object) {}

    protected Class widgetPluginClass() { return null; }

    public WidgetPlugin widgetPlugin() { return null; }

    String[][] _filteredAspectInfo() { return null; }

    protected void _connectionWasEstablished() {}

    protected void _connectionWasBroken() {}

    public void setPrefersContinuousChangeNotification(boolean flag) {}

    public boolean prefersContinuousChangeNotification() { return true; }

    public boolean canSupportValueFormatter() { return true; }

    public void setValueFormatter(Object format) {}

    public Object valueFormatter() { return null; }

    public NSArray objectKeysTaken() { return null; }

    static  {}

    public static final Class _CLASS;
    public static String _RefreshMarker;
    private static boolean _defaultPrefersContinuousChangeNotification;
    private WidgetPlugin _widgetPlugin;
    private boolean _prefersContinuousChangeNotification;

}

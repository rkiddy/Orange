
package com.webobjects.eointerface;

import com.webobjects.foundation._NSUtilities;


public abstract class EOActionWidgetAssociation extends EOWidgetAssociation {
    public static abstract class ActionPlugin extends EOWidgetAssociation.WidgetPlugin {


        public ActionPlugin(EOWidgetAssociation association, Object widget) { return null; }

        public abstract void setEnabled(boolean flag);

        static  {}

        public static final Class _CLASS;

    }



    public EOActionWidgetAssociation(Object aDisplayObject) { return null; }

    protected Class widgetPluginClass() { return null; }

    protected void _connectionWasEstablished() {}

    public abstract void invokeAction();

    public void subjectChanged() {}

    protected boolean displayGroupSelectionsAllowEnabled() { return true; }

    protected boolean isEnabledAtIndex(int index) { return true; }

    protected boolean isEnabled() { return true; }

    static  {}

    public static final Class _CLASS;
    protected int _lastEnabledValue;

}

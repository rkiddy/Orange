
package com.webobjects.eointerface;

import com.webobjects.foundation.*;
import java.io.IOException;
import java.io.InputStream;
import java.net.URL;
import java.net.URLConnection;


public class EOValueAssociation extends EOWidgetAssociation {
    public static abstract class ValuePlugin extends EOWidgetAssociation.WidgetPlugin {


        public ValuePlugin(EOWidgetAssociation association, Object widget) { return null; }

        public boolean useURLAsValue() { return true; }

        public abstract void setValue(Object obj, boolean flag);

        public abstract Object value();

        public boolean endEditing() { return true; }

        static  {}

        public static final Class _CLASS;

    }



    public EOValueAssociation(Object widget) { return null; }

    protected String[][] _aspectInfo() { return null; }

    public void bindAspect(String aspect, EODisplayGroup displayGroup, String key) {}

    protected Class widgetPluginClass() { return null; }

    protected void _connectionWasEstablished() {}

    protected void _connectionWasBroken() {}

    protected String _indexAspect() { return null; }

    protected String displayValueAspect() { return null; }

    protected Object displayValueFromURL(String URLString) { return null; }

    protected boolean _storeDisplayValue() { return true; }

    protected void _updateDisplayValue(boolean ignoreLastDisplayedValue) {}

    public int _lastUpdatedEnabledValue() { return 0; }

    public void subjectChanged() {}

    protected boolean _beginEditing() { return true; }

    public boolean widgetDidBeginEditing() { return true; }

    protected boolean _endEditing(boolean updateDisplayValue, boolean notifyDisplayGroupOnSuccess, boolean forceNotifyDisplayGroup) { return true; }

    public boolean widgetDidChange() { return true; }

    public boolean widgetDidEndEditing() { return true; }

    public boolean endEditing() { return true; }

    public String primaryAspect() { return null; }

    static  {}

    public static final Class _CLASS;
    private String _displayAspect;
    private Object _lastDisplayedValue;
    private String _lastDisplayedURL;
    private int _lastEnabledValue;

}

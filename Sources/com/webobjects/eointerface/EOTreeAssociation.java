
package com.webobjects.eointerface;

import com.webobjects.foundation.*;


public class EOTreeAssociation extends EOWidgetAssociation {
    public static abstract class TreePlugin extends EOWidgetAssociation.WidgetPlugin {


        public TreePlugin(EOWidgetAssociation association, Object widget) { return null; }

        public abstract void setRootObjectChildren(NSArray nsarray);

        public abstract void setRootObject(Object obj);

        static  {}

        public static final Class _CLASS;

    }



    public EOTreeAssociation(Object widget) { return null; }

    protected String[][] _aspectInfo() { return null; }

    public String primaryAspect() { return null; }

    protected Class widgetPluginClass() { return null; }

    protected void _connectionWasEstablished() {}

    public void subjectChanged() {}

    public Object valueForObject(Object identifier) { return null; }

    public Object iconForObject(Object identifier) { return null; }

    public Object expandedIconForObject(Object identifier) { return null; }

    public NSArray childrenOfObject(Object identifier) { return null; }

    public boolean isLeafObject(Object identifier) { return true; }

    static  {}

    public static final Class _CLASS;
    private String _isLeafKey;
    private String _iconKey;
    private String _expandedIconKey;
    private String _valueKey;
    private boolean _rootAspectBound;

}

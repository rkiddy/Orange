
package com.webobjects.eointerface;

import com.webobjects.eocontrol.EOClassDescription;
import com.webobjects.eocontrol.EODataSource;
import com.webobjects.foundation.*;


public class EOValueSelectionAssociation extends EOWidgetAssociation {
    public static abstract class ValueSelectionPlugin extends EOWidgetAssociation.WidgetPlugin {


        public ValueSelectionPlugin(EOWidgetAssociation association, Object widget) { return null; }

        public abstract void setTitlesFromObjects(Object aobj[]);

        public abstract String[] titles();

        public abstract void setSelectionIndex(int i, boolean flag);

        public abstract int selectionIndex();

        static  {}

        public static final Class _CLASS;
        public static int NoSelection;

    }



    public EOValueSelectionAssociation(Object object) { return null; }

    protected String[][] _aspectInfo() { return null; }

    public void bindAspect(String aspect, EODisplayGroup displayGroup, String key) {}

    protected Class widgetPluginClass() { return null; }

    protected void _connectionWasEstablished() {}

    protected void _connectionWasBroken() {}

    protected String _indexAspect() { return null; }

    protected void _updateTitles() {}

    public void subjectChanged() {}

    protected boolean _storeSelectionValue() { return true; }

    public boolean widgetSelectionDidChange() { return true; }

    public boolean endEditing() { return true; }

    public String primaryAspect() { return null; }

    static  {}

    public static final Class _CLASS;
    private static Object _NoTitleObjects[];
    private static Object _NoTitleValues[];
    private String _editingAspect;
    protected Object _currentTitleObjects[];
    protected int _lastSelectionIndex;
    protected int _lastEnabledValue;

}

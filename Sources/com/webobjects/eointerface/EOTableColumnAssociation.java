
package com.webobjects.eointerface;

import com.webobjects.eocontrol.EOSortOrdering;
import com.webobjects.foundation.*;


public class EOTableColumnAssociation extends EOWidgetAssociation {
    public static abstract class TableColumnPlugin extends EOWidgetAssociation.WidgetPlugin {


        public TableColumnPlugin(EOWidgetAssociation association, Object widget) { return null; }

        public abstract Object displayValueForValue(Object obj);

        public abstract Object valueForDisplayValue(Object obj);

        public abstract boolean isEditable();

        public boolean endEditing() { return true; }

        public abstract EOTableAssociation tableAssociation();

        public abstract Object table();

        public abstract int columnIndexInTable();

        static  {}

        public static final Class _CLASS;

    }



    public EOTableColumnAssociation(Object object) { return null; }

    public EOTableColumnAssociation(Object object, Object table) { return null; }

    public void setObject(Object object) {}

    protected String[][] _aspectInfo() { return null; }

    boolean _isBoldAspectBound() { return null; }

    boolean _isItalicAspectBound() { return null; }

    boolean _isTextColorAspectBound() { return null; }

    protected Class widgetPluginClass() { return null; }

    public void setTable(Object table) {}

    public Object table() { return null; }

    protected EOTableAssociation _tableAssociation() { return null; }

    protected void _connectionWasEstablished() {}

    protected void _connectionWasBroken() {}

    protected String _indexAspect() { return null; }

    public boolean widgetDidBeginEditing() { return true; }

    public boolean widgetDidEndEditing() { return true; }

    public boolean endEditing() { return true; }

    public void setSortingSelector(NSSelector selector) {}

    public NSSelector sortingSelector() { return null; }

    void _setHasBeenIncludedInSortOrderings(boolean flag) { return null; }

    boolean _hasBeenIncludedInSortOrderings() { return null; }

    public boolean _isWidgetEditableAtRow(int rowIndex) { return true; }

    public boolean isEditableAtRow(int rowIndex) { return true; }

    public int boldStateAtRow(int rowIndex) { return 0; }

    int _boldStateAtRow(int rowIndex) { return null; }

    public int italicStateAtRow(int rowIndex) { return 0; }

    int _italicStateAtRow(int rowIndex) { return null; }

    public Object textColorAtRow(int rowIndex) { return null; }

    Object _textColorAtRow(int rowIndex) { return null; }

    public Object valueAtRow(int rowIndex) { return null; }

    public boolean setValueAtRow(Object value, int rowIndex) { return true; }

    public String primaryAspect() { return null; }

    static  {}

    public static final Class _CLASS;
    private NSSelector _sortingSelector;
    private Object _table;
    private boolean _hasBeenIncludedInSortOrderings;
    private boolean _isBoldAspectBound;
    private boolean _useIndexForBoldAspect;
    private boolean _isItalicAspectBound;
    private boolean _useIndexForItalicAspect;
    private boolean _isTextColorAspectBound;
    private boolean _useIndexForTextColorAspect;

}


package com.webobjects.eointerface;

import com.webobjects.eocontrol.EOSortOrdering;
import com.webobjects.foundation.*;


public class EOTableAssociation extends EOWidgetAssociation {
    public static abstract class TablePlugin extends EOWidgetAssociation.WidgetPlugin {


        public TablePlugin(EOWidgetAssociation association, Object widget) { return null; }

        public abstract void updateTableContents(int i);

        public abstract void updateSelectionIndexes(int ai[]);

        public abstract int[] selectionIndexes();

        public abstract int editingColumnIndex();

        public abstract int editingRowIndex();

        public abstract int numberOfColumns();

        public abstract EOTableColumnAssociation tableColumnAssociationForColumnAtIndex(int i);

        public abstract EOTableAssociation existingTableAssociation();

        static  {}

        public static final Class _CLASS;

    }



    public EOTableAssociation(Object aDisplayObject) { return null; }

    public void dispose() {}

    protected String[][] _aspectInfo() { return null; }

    boolean _isBoldAspectBound() { return null; }

    boolean _isItalicAspectBound() { return null; }

    boolean _isTextColorAspectBound() { return null; }

    protected Class widgetPluginClass() { return null; }

    void _markAutoCreated() { return null; }

    private boolean _isAutoCreated() { return true; }

    void _disposeIfAutoCreatedAndNoTableColumnsAvailable() { return null; }

    protected void _connectionWasEstablished() {}

    protected String _indexAspect() { return null; }

    protected void _displayGroupSelectionChanged() {}

    protected void _displayGroupContentsChanged() {}

    public void subjectChanged() {}

    public void tableDidChangeSelection() {}

    public EOTableColumnAssociation editingTableColumnAssociation() { return null; }

    public void tableDidChangeColumns() {}

    public void setSortsByColumnOrder(boolean flag) {}

    public boolean sortsByColumnOrder() { return true; }

    public void setSortOrderingByTableColumnOrder() {}

    public int numberOfDisplayedObjects() { return 0; }

    public boolean isEditableAtColumnAndRow(int columnIndex, int rowIndex) { return true; }

    public int boldStateAtColumnAndRow(int columnIndex, int rowIndex) { return 0; }

    int _boldStateAtColumnAndRow(int columnIndex, int rowIndex) { return null; }

    public int italicAtColumnAndRow(int columnIndex, int rowIndex) { return 0; }

    int _italicStateAtColumnAndRow(int columnIndex, int rowIndex) { return null; }

    public Object textColorAtColumnAndRow(int columnIndex, int rowIndex) { return null; }

    Object _textColorAtColumnAndRow(int columnIndex, int rowIndex) { return null; }

    public Object valueAtColumnAndRow(int columnIndex, int rowIndex) { return null; }

    public boolean setValueAtColumnAndRow(Object value, int columnIndex, int rowIndex) { return true; }

    public String primaryAspect() { return null; }

    static  {}

    public static final Class _CLASS;
    private boolean _isAutoCreated;
    private boolean _sortsByColumnOrder;
    private boolean _sortOrderingsSet;
    private boolean _ignoreChanges;
    private boolean _isBoldAspectBound;
    private boolean _useIndexForBoldAspect;
    private boolean _isItalicAspectBound;
    private boolean _useIndexForItalicAspect;
    private boolean _isTextColorAspectBound;
    private boolean _useIndexForTextColorAspect;

}

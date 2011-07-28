
package com.webobjects.eointerface.swing;

import com.webobjects.eointerface.*;
import com.webobjects.foundation._NSUtilities;
import javax.swing.JTable;
import javax.swing.ListSelectionModel;
import javax.swing.event.*;
import javax.swing.table.*;


public class EOSwingTablePlugin extends com.webobjects.eointerface.EOTableAssociation.TablePlugin
    implements ListSelectionListener, TableColumnModelListener {
    private class _TableModel extends AbstractTableModel {


        public _TableModel() { return null; }

        public EOTableAssociation tableAssociation() { return null; }

        public void addTableModelListener(TableModelListener listener) {}

        public void fireTableChanged() {}

        public Class getColumnClass(int columnIndex) { return null; }

        public int getColumnCount() { return 0; }

        public String getColumnName(int columnIndex) { return null; }

        public int getRowCount() { return 0; }

        public Object getValueAt(int rowIndex, int columnIndex) { return null; }

        public boolean isCellEditable(int rowIndex, int columnIndex) { return true; }

        public void setValueAt(Object value, int rowIndex, int columnIndex) {}

        protected boolean _justBecameTableModel;
        final EOSwingTablePlugin this$0;

    }



    static JTable _tableForWidget(Object widget) { return null; }

    static EOTableAssociation _tableAssociationForWidget(Object widget) { return null; }

    static int _indexForTableColumnInTable(Object widget, TableColumn tableColumn) { return 0; }

    public EOSwingTablePlugin(EOWidgetAssociation association, Object widget) { return null; }

    public void establishConnection() {}

    public void breakConnection() {}

    public String[] widgetKeysTaken() { return null; }

    public void updateTableContents(int numberOfRows) {}

    public void updateSelectionIndexes(int selectedRowIndexes[]) {}

    public int[] selectionIndexes() { return null; }

    public void valueChanged(ListSelectionEvent event) {}

    public int editingColumnIndex() { return 0; }

    public int editingRowIndex() { return 0; }

    public int numberOfColumns() { return 0; }

    public EOTableColumnAssociation tableColumnAssociationForColumnAtIndex(int columnIndex) { return null; }

    public EOTableAssociation existingTableAssociation() { return null; }

    private void _columnsDidChange() {}

    public void columnAdded(TableColumnModelEvent event) {}

    public void columnRemoved(TableColumnModelEvent event) {}

    public void columnMoved(TableColumnModelEvent event) {}

    public void columnMarginChanged(ChangeEvent changeevent) {}

    public void columnSelectionChanged(ListSelectionEvent listselectionevent) {}

    static  {}

    public static final Class _CLASS;
    private JTable _table;
    private boolean _ignoreChanges;

}

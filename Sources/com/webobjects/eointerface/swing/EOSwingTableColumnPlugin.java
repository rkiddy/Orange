
package com.webobjects.eointerface.swing;

import com.webobjects.eointerface.*;
import com.webobjects.foundation.NSForwardException;
import com.webobjects.foundation._NSUtilities;
import java.text.Format;
import java.text.ParseException;
import javax.swing.JTable;
import javax.swing.event.*;
import javax.swing.table.*;


public class EOSwingTableColumnPlugin extends com.webobjects.eointerface.EOTableColumnAssociation.TableColumnPlugin
    implements TableColumnModelListener, com.webobjects.eointerface.EOWidgetAssociation.WidgetPlugin.Formatting {
    private static class _DefaultTableColumnCustomizer
        implements TableColumnCustomizer {


        private _DefaultTableColumnCustomizer() { return null; }

        public EOColumnEditor editorForAssociation(EOTableColumnAssociation association) { return null; }

        public TableCellRenderer rendererForAssociation(EOTableColumnAssociation association) { return null; }

        _DefaultTableColumnCustomizer(_cls1 x0) { return null; }

        static  {}

        private static final TableCellRenderer _tableCellRenderer;

    }

    public static interface TableColumnCustomizer {


        public abstract EOColumnEditor editorForAssociation(EOTableColumnAssociation eotablecolumnassociation);

        public abstract TableCellRenderer rendererForAssociation(EOTableColumnAssociation eotablecolumnassociation);



        public static final Class _CLASS = null;

    }



    static EOTableColumnAssociation _tableColumnAssociationForTableColumn(TableColumn widget) { return null; }

    public static void setTableColumnCustomizer(TableColumnCustomizer tableColumnCustomizer) { return null; }

    public static TableColumnCustomizer tableColumnCustomizer() { return null; }

    public EOSwingTableColumnPlugin(EOWidgetAssociation association, Object widget) { return null; }

    public void establishConnection() {}

    public void breakConnection() {}

    public String[] widgetKeysTaken() { return null; }

    private TableCellEditor _cellEditor() { return null; }

    public boolean isEditable() { return true; }

    public boolean endEditing() { return true; }

    public EOTableAssociation tableAssociation() { return null; }

    public Object table() { return null; }

    public int columnIndexInTable() { return 0; }

    public void setValueFormatter(Object formatter) {}

    public Object valueFormatter() { return null; }

    public Object displayValueForValue(Object value) { return null; }

    public Object valueForDisplayValue(Object displayValue) { return null; }

    public void _updateModelIndexes() {}

    public void columnAdded(TableColumnModelEvent event) {}

    public void columnRemoved(TableColumnModelEvent event) {}

    public void columnMoved(TableColumnModelEvent event) {}

    public void columnMarginChanged(ChangeEvent changeevent) {}

    public void columnSelectionChanged(ListSelectionEvent listselectionevent) {}

    static  {}

    public static final Class _CLASS = null;
    private static TableColumnCustomizer _tableColumnCustomizer;
    private Format _format;
    private EOColumnEditor _columnEditor;
    private TableCellRenderer _tableCellRenderer;

}

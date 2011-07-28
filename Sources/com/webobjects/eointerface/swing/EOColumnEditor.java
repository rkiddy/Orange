
package com.webobjects.eointerface.swing;

import com.webobjects.eointerface.EOTableColumnAssociation;
import com.webobjects.foundation._NSUtilities;
import java.awt.Component;
import java.util.EventObject;
import javax.swing.JTable;
import javax.swing.event.*;
import javax.swing.table.TableCellEditor;
import javax.swing.table.TableColumnModel;


public abstract class EOColumnEditor
    implements TableCellEditor {


    public EOColumnEditor() { return null; }

    protected abstract Component createEditorComponent();

    protected abstract void setCellEditorValue(Object obj);

    public void setEditorComponent(Component editorComponent) {}

    public Component editorComponent() { return null; }

    public Component getTableCellEditorComponent(JTable table, Object initialValue, boolean isSelected, int rowIndex, int columnIndex) { return null; }

    public Object getCellEditorValue() { return null; }

    public boolean shouldSelectCell(EventObject event) { return true; }

    public boolean isCellEditable(EventObject event) { return true; }

    public EOTableColumnAssociation editingTableColumnAssociation() { return null; }

    private void _beginEditing(JTable table, int columnIndex) {}

    private void _endEditing() {}

    protected void beginEditing() {}

    protected void endEditing() {}

    public void cancelCellEditing() {}

    public boolean stopCellEditing() { return true; }

    protected ChangeEvent _changeEvent() { return null; }

    public void addCellEditorListener(CellEditorListener listener) {}

    public void removeCellEditorListener(CellEditorListener listener) {}

    protected void fireEditingCanceled() {}

    protected void fireEditingStopped() {}

    static  {}

    public static final Class _CLASS;
    protected EOTableColumnAssociation _association;
    protected EventListenerList _listeners;
    protected Component _editorComponent;
    protected ChangeEvent _changeEvent;

}

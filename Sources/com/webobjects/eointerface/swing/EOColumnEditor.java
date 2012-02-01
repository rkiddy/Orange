package com.webobjects.eointerface.swing;
/**
 * EOColumnEditor is an abstract class that implements generalized cell editing management for javax.swing.JTables. Swing specifies that JTable cell editing is performed by an object implementing the javax.swing.table.TableCellEditor interface. EOColumnEditor implements this interface in a generalized way, and concrete subclasses such as EOTextColumnEditor perform component-specific instantiation and event communication.
 * EOColumnEditor is used together with EOTableColumnAssociation to allow editing of values displayed in tables. The most important function of an EOColumnEditor instance is mediating between its Component and the EOTableColumnAssociation that's bound to the edited column. This mediation enables the validation of edited values that associations are required to perform.
 * Create a subclass of EOColumnEditor if you want to use a Component for JTable editing for which no EOColumnEditor is implemented.
 * See Also:EOTextColumnEditor
 */
public abstract class EOColumnEditor implements javax.swing.table.TableCellEditor{
    /**
     * Constructs a new EOColumnEditor.
     */
    public EOColumnEditor(){
         //TODO codavaj!!
    }

    /**
     * EOColumnEditor's implementation of the javax.swing.table.TableCellEditor method to add a listener to the list that's notified when the editor starts, stops or cancels editing.
     */
    public void addCellEditorListener(javax.swing.event.CellEditorListener listener){
        return; //TODO codavaj!!
    }

    /**
     * Invoked from shouldSelectCell and getTableCellEditorComponent to inform the receiver that it should begin editing. EOColumnEditor's implementation sends widgetDidBeginEditing to the EOTableColumnAssociation that's bound to the receiver's TableColumn.
     * Subclasses should invoke super's implementation after activating their editor Component.
     */
    protected void beginEditing(){
        return; //TODO codavaj!!
    }

    /**
     * EOColumnEditor's implementation of the javax.swing.table.TableCellEditor method to cancel editing.
     */
    public void cancelCellEditing(){
        return; //TODO codavaj!!
    }

    /**
     * Creates and returns a Component to perform the editing -- a JTextField or JComboBox, for example. Invoked in EOColumnEditor's constructor, this method must be overridden by every subclass in order to create and return the Component it manages.
     */
    protected abstract java.awt.Component createEditorComponent();

    /**
     * Returns the EOTableColumnAssociation that's bound to the column being edited (the column is cached in EOColumnEditor's implementation of shouldSelectCell and getTableCellEditorComponent).
     */
    public com.webobjects.eointerface.EOTableColumnAssociation editingTableColumnAssociation(){
        return null; //TODO codavaj!!
    }

    /**
     * Returns the receiver's editor Component -- a user interface control that implements the editing mechanism. EOColumnEditor creates the component in the constructor (through createEditorComponent).
     */
    public java.awt.Component editorComponent(){
        return null; //TODO codavaj!!
    }

    /**
     * Invoked from cancelCellEditing and stopCellEditing to inform the receiver that it should end editing. EOColumnEditor's implementation sends widgetDidEndEditing to the EOTableColumnAssociation that's bound to the receiver's TableColumn. Subclasses should invoke super's implementation after deactivating their editor Component.
     */
    protected void endEditing(){
        return; //TODO codavaj!!
    }

    /**
     * Sends editingCanceled to all cell editor listeners registered with the column editor.
     */
    protected void fireEditingCanceled(){
        return; //TODO codavaj!!
    }

    /**
     * Sends editingStopped to all cell editor listeners registered with the column editor.
     */
    protected void fireEditingStopped(){
        return; //TODO codavaj!!
    }

    /**
     * EOColumnEditor's implementation of the javax.swing.table.TableCellEditor method to return the current value in the editor. Simply returns null, so subclasses should override this method.
     */
    public java.lang.Object getCellEditorValue(){
        return null; //TODO codavaj!!
    }

    /**
     * EOColumnEditor's implementation of the javax.swing.table.TableCellEditor method to set an inital value for the editor. Sets the initial editor value through setCellEditorValue and invokes beginEditing. EOColumnEditor creates the component in the constructor (through the method createEditorComponent).
     */
    public java.awt.Component getTableCellEditorComponent(javax.swing.JTable table, java.lang.Object initialValue, boolean isSelected, int rowIndex, int columnIndex){
        return null; //TODO codavaj!!
    }

    /**
     * EOColumnEditor's implementation of the javax.swing.table.TableCellEditor method to determine whether a cell can start editing. Returns false so that by default all EOColumnEditors do not start editing.
     */
    public boolean isCellEditable(java.util.EventObject event){
        return false; //TODO codavaj!!
    }

    /**
     * EOColumnEditor's implementation of the javax.swing.table.TableCellEditor method to remove a listener from the list that's notified when the editor starts, stops or cancels editing.
     */
    public void removeCellEditorListener(javax.swing.event.CellEditorListener listener){
        return; //TODO codavaj!!
    }

    /**
     * Invoked from getTableCellEditorComponent to assign value as the inital editor value. Subclasses must override this method.
     */
    protected abstract void setCellEditorValue(java.lang.Object value);

    /**
     * Sets the receiver's editor component to editorComponent. Invoked in EOColumnEditor's constructor.
     */
    public void setEditorComponent(java.awt.Component editorComponent){
        return; //TODO codavaj!!
    }

    /**
     * EOColumnEditor's implementation of the javax.swing.table.TableCellEditor method to determine whether a cell should be selected when edited or not. Invokes beginEditing and returns true so that by default all EOColumnEditors select the cell.
     */
    public boolean shouldSelectCell(java.util.EventObject event){
        return false; //TODO codavaj!!
    }

    /**
     * EOColumnEditor's implementation of the javax.swing.table.TableCellEditor method to finish and accept editing.
     */
    public boolean stopCellEditing(){
        return false; //TODO codavaj!!
    }

}

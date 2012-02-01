package com.webobjects.eointerface.swing;
/**
 * EOSwingTablePlugin is a concrete subclass of EOTableAssociation.TablePlugin which is used with Swing tables.
 * associations classes: EOTableAssociation
 * widgets classes: EOTable, JTable (an EOTable contains a JTable inside)
 */
public class EOSwingTablePlugin extends com.webobjects.eointerface.EOTableAssociation.TablePlugin implements javax.swing.event.ListSelectionListener, javax.swing.event.TableColumnModelListener{
    /**
     * Creates a new EOSwingTablePlugin connected to an association and a UI widget.
     * Parameters:association - association of class EOTableColumnAssociation or subclass for the plugin to usewidget - widget of class EOTable or JTable or subclass that the plugin will manage
     */
    public EOSwingTablePlugin(com.webobjects.eointerface.EOWidgetAssociation association, java.lang.Object widget){
         //TODO codavaj!!
    }

    /**
     * Cleans up (ends) the plugin's connection to its TableColumn widget, removing the listeners and resetting the TableModel to an instance of DefaultTableModel.
     */
    public void breakConnection(){
        return; //TODO codavaj!!
    }

    /**
     * Conformance to ColumnModelListener. Invokes tableDidChangeColumns on the plugin's EOTableAssociation.
     */
    public void columnAdded(javax.swing.event.TableColumnModelEvent event){
        return; //TODO codavaj!!
    }

    /**
     * Conformance to ColumnModelListener.
     */
    public void columnMarginChanged(javax.swing.event.ChangeEvent event){
        return; //TODO codavaj!!
    }

    /**
     * Conformance to ColumnModelListener. Invokes tableDidChangeColumns on the plugin's EOTableAssociation.
     */
    public void columnMoved(javax.swing.event.TableColumnModelEvent event){
        return; //TODO codavaj!!
    }

    /**
     * Conformance to ColumnModelListener. Invokes tableDidChangeColumns on the plugin's EOTableAssociation.
     */
    public void columnRemoved(javax.swing.event.TableColumnModelEvent event){
        return; //TODO codavaj!!
    }

    /**
     * Conformance to ListSelectionListener.
     */
    public void columnSelectionChanged(javax.swing.event.ListSelectionEvent event){
        return; //TODO codavaj!!
    }

    /**
     * Returns the column being edited.
     */
    public int editingColumnIndex(){
        return 0; //TODO codavaj!!
    }

    /**
     * Returns the index of the row being edited
     */
    public int editingRowIndex(){
        return 0; //TODO codavaj!!
    }

    /**
     * Establishes a connection between the plugin and its UI widget.
     */
    public void establishConnection(){
        return; //TODO codavaj!!
    }

    /**
     * Returns the EOTableAssociation for this plugin's table.
     */
    public com.webobjects.eointerface.EOTableAssociation existingTableAssociation(){
        return null; //TODO codavaj!!
    }

    /**
     * Returns the table's number of columns.
     */
    public int numberOfColumns(){
        return 0; //TODO codavaj!!
    }

    /**
     * Returns an array with the indexes of the selected rows.
     */
    public int[] selectionIndexes(){
        return null; //TODO codavaj!!
    }

    /**
     * Returns the EOTableColumnAssociation for the column at the specified index.
     */
    public com.webobjects.eointerface.EOTableColumnAssociation tableColumnAssociationForColumnAtIndex(int columnIndex){
        return null; //TODO codavaj!!
    }

    /**
     * This method notifies the table plugin that the table's selection has changed It is called internally by the EOTableAssociation.
     */
    public void updateSelectionIndexes(int[] selectedRowIndexes){
        return; //TODO codavaj!!
    }

    /**
     * This method notifies the table plugin that the table's data has changed. It is called internally by the EOTableAssociation.
     */
    public void updateTableContents(int numberOfRows){
        return; //TODO codavaj!!
    }

    /**
     * Conforming to ListSelectionListener API. Invokes EOTableAssociation's tableDidChangeSelection method.
     */
    public void valueChanged(javax.swing.event.ListSelectionEvent event){
        return; //TODO codavaj!!
    }

    /**
     * Returns an array of Strings which represent outlet names in Interface Builder These outlets are disabled by Interface Builder once the TableColumn is connected to this plugin's association.
     */
    public java.lang.String[] widgetKeysTaken(){
        return null; //TODO codavaj!!
    }

}

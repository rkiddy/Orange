package com.webobjects.eointerface.swing;
/**
 * EOSwingTableColumnPlugin is a concrete subclass of EOTableColumnAssociation.TableColumnPlugin which is used with Swing table columns.
 * associations classes: EOTableColumnAssociation
 * widgets classes: TableColumn
 */
public class EOSwingTableColumnPlugin extends com.webobjects.eointerface.EOTableColumnAssociation.TableColumnPlugin implements javax.swing.event.TableColumnModelListener, com.webobjects.eointerface.EOWidgetAssociation.WidgetPlugin.Formatting{
    /**
     * Creates a new EOSwingTableColumnPlugin connected to an association and a UI widget.
     * Parameters:association - association of class EOTableColumnAssociation or subclass for the plugin to usewidget - widget of class TableColumn or subclass that the plugin will manage
     */
    public EOSwingTableColumnPlugin(com.webobjects.eointerface.EOWidgetAssociation association, java.lang.Object widget){
         //TODO codavaj!!
    }

    /**
     * Clean up (end) the plugin's connection to its TableColumn widget. This also removes the specific CellEditor and CellRenderer being used.
     */
    public void breakConnection(){
        return; //TODO codavaj!!
    }

    /**
     * Conformance to TableColumnListener API.
     */
    public void columnAdded(javax.swing.event.TableColumnModelEvent event){
        return; //TODO codavaj!!
    }

    /**
     * Returns the index of this plugin's column in its table.
     */
    public int columnIndexInTable(){
        return 0; //TODO codavaj!!
    }

    /**
     * Conformance to ChangeListener API.
     */
    public void columnMarginChanged(javax.swing.event.ChangeEvent event){
        return; //TODO codavaj!!
    }

    /**
     * Conformance to TableColumnListener API.
     */
    public void columnMoved(javax.swing.event.TableColumnModelEvent event){
        return; //TODO codavaj!!
    }

    /**
     * Conformance to TableColumnListener API.
     */
    public void columnRemoved(javax.swing.event.TableColumnModelEvent event){
        return; //TODO codavaj!!
    }

    /**
     * Conformance to ListSelectionListener API.
     */
    public void columnSelectionChanged(javax.swing.event.ListSelectionEvent event){
        return; //TODO codavaj!!
    }

    /**
     * Formats a data value for display (using a Format object, if available).
     */
    public java.lang.Object displayValueForValue(java.lang.Object value){
        return null; //TODO codavaj!!
    }

    /**
     * Called to halt editing of this widget. (The call is forwarded to the cellEditor, if it exists.)
     */
    public boolean endEditing(){
        return false; //TODO codavaj!!
    }

    /**
     * Establishes a connection between the plugin and its UI widget. Sets up the CellRenderer and CellEditor. See the documentation for setTableColumnCustomizer, since it should be called before establishConnection in order to be effective.
     */
    public void establishConnection(){
        return; //TODO codavaj!!
    }

    /**
     * Whether the TableColumn is editable
     */
    public boolean isEditable(){
        return false; //TODO codavaj!!
    }

    /**
     * This method sets the TableColumnCustomizer which will be used to obtain the CellRenderer and CellEditor for this plugin's column. The TableColumnCustomizer should be set before establishConnection is called, otherwise the internal defaultTableColumnCustomizer is used which returns a EOTextColumnEditor and a DefaultTableCellRenderer. See also the documentation for the interface TableColumnCustomizer.
     */
    public static void setTableColumnCustomizer(com.webobjects.eointerface.swing.EOSwingTableColumnPlugin.TableColumnCustomizer tableColumnCustomizer){
        return; //TODO codavaj!!
    }

    /**
     * Set formatter as the Format for this plugin column's values
     */
    public void setValueFormatter(java.lang.Object formatter){
        return; //TODO codavaj!!
    }

    /**
     * Returns the table containing the plugin's table column. This method always returns null. You have to explicitly set table on the column association.
     */
    public java.lang.Object table(){
        return null; //TODO codavaj!!
    }

    /**
     * Returns the table association of the table containing this plugin's column.
     */
    public com.webobjects.eointerface.EOTableAssociation tableAssociation(){
        return null; //TODO codavaj!!
    }

    /**
     * Returns the TableColumnCustomizer which is used to obtain the CellRenderer and CellEditor for this plugin's column.
     */
    public static com.webobjects.eointerface.swing.EOSwingTableColumnPlugin.TableColumnCustomizer tableColumnCustomizer(){
        return null; //TODO codavaj!!
    }

    /**
     * This method performs the reverse operation of formatting, that is, it returns the data value for a displayed value by using the Format's parseObject method. Note that there maybe a loss of precision or detail depending on the display value.
     */
    public java.lang.Object valueForDisplayValue(java.lang.Object displayValue){
        return null; //TODO codavaj!!
    }

    /**
     * Returns the formatter for this plugin's column
     */
    public java.lang.Object valueFormatter(){
        return null; //TODO codavaj!!
    }

    /**
     * Returns an array of Strings which represent outlet names in Interface Builder These outlets are disabled by Interface Builder once the TableColumn is connected to this plugins association.
     */
    public java.lang.String[] widgetKeysTaken(){
        return null; //TODO codavaj!!
    }

    /**
     * Use this interface to implement your custom TableColumnCustomizer which will be used to obtain the CellRenderer and CellEditor for this plugin's column. (See Java Swing documentation.) The TableColumnCustomizer should be set before establishConnection is called, otherwise the internal defaultTableColumnCustomizer is used which returns a EOTextColumnEditor and a DefaultTableCellRenderer.
     */
    public static interface TableColumnCustomizer{
        /**
         * Returns an EOColumnEditor which will be used as a TableCellEditor for this column. Since the editor needs to communicate with other parts of this framework, it needs to be a subclass of EOColumnEditor See also EOColumnEditor and EOTextColumnEditor, as well as the Swing documentation for TableCellEditor.
         */
        abstract com.webobjects.eointerface.swing.EOColumnEditor editorForAssociation(com.webobjects.eointerface.EOTableColumnAssociation association);

        /**
         * Returns an TableCellRenderer to be used for this column. See the Swing documentation on the TableCellRenderer class.
         */
        abstract javax.swing.table.TableCellRenderer rendererForAssociation(com.webobjects.eointerface.EOTableColumnAssociation association);

    }
}

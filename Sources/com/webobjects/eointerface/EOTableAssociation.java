package com.webobjects.eointerface;
/**
 * EOTableAssociation associates the contents of its SourceAspect's display group with a NSTableView, JTable or an EOTable (an object that places a javax.swing.JTable in a scroll view), via the repective WidgetPlugin's. Typically, applications won't explicitly instantiate this class, as EOTableColumnAssociation's setTable method assures that an instance exists for its table.
 * Aspects:
 * EOAssociation.SourceAspect
 * EOAssociation.BoldAspect
 * EOAssociation.ItalicAspect
 * EOAssociation.TextColorAspect
 * EOAssociation.EnabledAspect
 */
public class EOTableAssociation extends com.webobjects.eointerface.EOWidgetAssociation{
    /**
     * Creates a new EOTableAssociation to monitor and update the value in aDisplayObject.
     * Parameters:aDisplayObject -
     */
    public EOTableAssociation(java.lang.Object aDisplayObject){
         //TODO codavaj!!
    }

    /**
     * This method returns whether the table cell at the specified row and column is (currently) using a bold font type. If the EOTableColumnAssociation for the specified cell has its bold aspect bound, this method returns the value bound there. If not, this method returns the value bound to the EOTableAssociation's bold aspect. If neither association's aspect is bound, this method returns EOAssociation.IgnoreValue.
     */
    public int boldStateAtColumnAndRow(int columnIndex, int rowIndex){
        return 0; //TODO codavaj!!
    }

    /**
     * Clears all references this association has to other objects especially its display object and EODisplayGroup. Call this method before nulling out a reference to this association to ensure it gets garbage collected properly. Subclasses should override this method to do any additional cleanup that may be needed and invoke super's implementation at the end.
     */
    public void dispose(){
        return; //TODO codavaj!!
    }

    /**
     * If a field in the table is being edited, this method will return the column assocaition for the table column of the edited field. If no field is being edited, returns null.
     */
    public com.webobjects.eointerface.EOTableColumnAssociation editingTableColumnAssociation(){
        return null; //TODO codavaj!!
    }

    /**
     * This method returns whether the table cell at the specified row and column is editable.
     */
    public boolean isEditableAtColumnAndRow(int columnIndex, int rowIndex){
        return false; //TODO codavaj!!
    }

    /**
     * This method returns whether the table cell at the specified row and column is (currently) using a italic font type. If the EOTableColumnAssociation for the specified cell has its italic aspect bound, this method returns the value bound there. If not, this method returns the value bound to the EOTableAssociation's italic aspect. If neither association's aspect is bound, this method returns EOAssociation.IgnoreValue.
     */
    public int italicAtColumnAndRow(int columnIndex, int rowIndex){
        return 0; //TODO codavaj!!
    }

    /**
     * Returns the number of diplayed objects (from the source display group).
     */
    public int numberOfDisplayedObjects(){
        return 0; //TODO codavaj!!
    }

    /**
     * This method returns the primary aspect for this table association.
     */
    public java.lang.String primaryAspect(){
        return null; //TODO codavaj!!
    }

    /**
     * This method is called internally by several other methods in order to perform sort ordering by column order. It will then also update the displayed objects for the source display group.
     */
    public void setSortOrderingByTableColumnOrder(){
        return; //TODO codavaj!!
    }

    /**
     * Enables or disables sorting by column order. This means the user can change the sort order by dragging different column headers to the front of the table.
     */
    public void setSortsByColumnOrder(boolean flag){
        return; //TODO codavaj!!
    }

    /**
     * This method sets value on the table cell at the specified row and column.
     */
    public boolean setValueAtColumnAndRow(java.lang.Object value, int columnIndex, int rowIndex){
        return false; //TODO codavaj!!
    }

    /**
     * Retruns whether sorting by column order is enabled. See the method description for setSortsByColumnOrder.
     */
    public boolean sortsByColumnOrder(){
        return false; //TODO codavaj!!
    }

    /**
     * See the subjectChanged method description in the superclass EOAssociation.
     */
    public void subjectChanged(){
        return; //TODO codavaj!!
    }

    /**
     * This method is called when column ordering is changed by the user, also if they are added or removed, etc. If sorting by column order is enabled, it will call setSortOrderingByTableColumnOrder.
     */
    public void tableDidChangeColumns(){
        return; //TODO codavaj!!
    }

    /**
     * Called to relay a selection change in the table widget to the display group. It is usually called by the table plugin.
     */
    public void tableDidChangeSelection(){
        return; //TODO codavaj!!
    }

    /**
     * This method returns whether the table cell at the specified row and column is (currently) using colored text. If the EOTableColumnAssociation for the specified cell has its color aspect bound, this method returns the value bound there. If not, this method returns the value bound to the EOTableAssociation's color aspect. If neither association's aspect is bound, this method returns null.
     */
    public java.lang.Object textColorAtColumnAndRow(int columnIndex, int rowIndex){
        return null; //TODO codavaj!!
    }

    /**
     * This method returns the data value for the table cell at the specified row and column.
     */
    public java.lang.Object valueAtColumnAndRow(int columnIndex, int rowIndex){
        return null; //TODO codavaj!!
    }

    /**
     * Returns the abstract base class for plugin's defined by this association (EOTableAssociation.TablePlugin).
     */
    protected java.lang.Class widgetPluginClass(){
        return null; //TODO codavaj!!
    }

    /**
     * TablePlugin communicates with a UI widget (NSTableView, JTable or EOTable, for example) on behalf of an EOTableAssociation. The TablePlugin class defines some basic functionality concrete subclasses must implement for this communication to work.
     */
    public static abstract class TablePlugin extends com.webobjects.eointerface.EOWidgetAssociation.WidgetPlugin{
        /**
         * Subclasses should override this constructor to do any initialization they need to, but should call the super(association, widget) constructor.
         * Parameters:association - EOTableAssociation object for which the plugin will handle setting and getting values on the UI widgetwidget - the UI object that the plugin will use for display
         */
        public TablePlugin(com.webobjects.eointerface.EOWidgetAssociation association, java.lang.Object widget){
             //TODO codavaj!!
        }

        /**
         * Asks the plugin of the table view for the column currently being edited.
         */
        public abstract int editingColumnIndex();

        /**
         * Asks the plugin of the table view for the row currently being edited.
         */
        public abstract int editingRowIndex();

        /**
         * Asks the plugin of the table view for an already existing table association.
         */
        public abstract com.webobjects.eointerface.EOTableAssociation existingTableAssociation();

        /**
         * Asks the plugin of the table view for the number of columns in the table.
         */
        public abstract int numberOfColumns();

        /**
         * Asks the plugin of the table view for the selected rows.
         */
        public abstract int[] selectionIndexes();

        /**
         * Asks the plugin of the table view for the column association at a specific index.
         */
        public abstract com.webobjects.eointerface.EOTableColumnAssociation tableColumnAssociationForColumnAtIndex(int columnIndex);

        /**
         * Calls the plugin to update the table view for a changed selection.
         */
        public abstract void updateSelectionIndexes(int[] selectedRowIndexes);

        /**
         * Calls the plugin to update the contents of its table view.
         */
        public abstract void updateTableContents(int numberOfRows);

    }
}

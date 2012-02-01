package com.webobjects.eointerface;
/**
 * EOTableColumnAssociation associates display group(s) with a table column, via the repective WidgetPlugin's (subclasses of TableColumnPlugin). It always works together with a EOTableAssociation.
 * Aspects:
 * EOAssociation.ValueAspect
 * EOAssociation.BoldAspect
 * EOAssociation.ItalicAspect
 * EOAssociation.TextColorAspect
 * EOAssociation.EnabledAspect
 */
public class EOTableColumnAssociation extends com.webobjects.eointerface.EOWidgetAssociation{
    /**
     * Creates a new EOTableColumnAssociation to monitor and update the row values of a display group according to the widget object, which supplies a text (String) value. You normally set up associations with Interface Builder, in which case you don't need to create them programmatically. However, if you do create them up programmatically, setting them up is a multi-step process. After creating an association, you must bind its aspects and establish its connections.
     * Parameters:object - a display object (table column widget) to be managed by this association
     */
    public EOTableColumnAssociation(java.lang.Object object){
         //TODO codavaj!!
    }

    /**
     * Creates a new EOTableColumnAssociation to monitor and update the row values of a display group according to the widget object, which supplies a text (String) value. You normally set up associations with Interface Builder, in which case you don't need to create them programmatically. However, if you do create them up programmatically, setting them up is a multi-step process. After creating an association, you must bind its aspects and establish its connections.
     * Parameters:object - a display object (table column widget) to be managed by this associationtable - the corresponding table display object (widget)
     */
    public EOTableColumnAssociation(java.lang.Object object, java.lang.Object table){
         //TODO codavaj!!
    }

    /**
     * This method returns the boldState value for the specified row in this column.
     */
    public int boldStateAtRow(int rowIndex){
        return 0; //TODO codavaj!!
    }

    /**
     * This method will end the editing state, for both the widget(-plugin) and the Association.
     */
    public boolean endEditing(){
        return false; //TODO codavaj!!
    }

    /**
     * This method returns a flag indicating whether the specified row is editable in this column.
     */
    public boolean isEditableAtRow(int rowIndex){
        return false; //TODO codavaj!!
    }

    /**
     * This method returns the italicState value for the specified row in this column.
     */
    public int italicStateAtRow(int rowIndex){
        return 0; //TODO codavaj!!
    }

    /**
     * This method returns this associations primary aspect, which is EOAssociation.ValueAspect.
     */
    public java.lang.String primaryAspect(){
        return null; //TODO codavaj!!
    }

    /**
     * This method assigns a display object (table column widget) to this association.
     */
    public void setObject(java.lang.Object object){
        return; //TODO codavaj!!
    }

    /**
     * This method will set the sorting selector. The default is EOSortOrdering.CompareAscending. This selector will be used with EOSortOrdering for sorting. See the documentation for EOSortOrdering.
     */
    public void setSortingSelector(com.webobjects.foundation.NSSelector selector){
        return; //TODO codavaj!!
    }

    /**
     * This method stores the corresponding table widget for the table column managed by this association.
     */
    public void setTable(java.lang.Object table){
        return; //TODO codavaj!!
    }

    /**
     * This method sets the value Object for the specified row in this column.
     */
    public boolean setValueAtRow(java.lang.Object value, int rowIndex){
        return false; //TODO codavaj!!
    }

    /**
     * This method returns the sorting selector. It's default is EOSortOrdering.CompareAscending. This selector is used with EOSortOrdering for sorting. See the documentation for EOSortOrdering.
     */
    public com.webobjects.foundation.NSSelector sortingSelector(){
        return null; //TODO codavaj!!
    }

    /**
     * This method returns the corresponding table widget for the table column managed by this association. If it hasn't been set, it will try to obtain it from the column widget, otherwise it returns null.
     */
    public java.lang.Object table(){
        return null; //TODO codavaj!!
    }

    /**
     * This method returns an Object indicating the color at the specified row in this column.
     */
    public java.lang.Object textColorAtRow(int rowIndex){
        return null; //TODO codavaj!!
    }

    /**
     * This method returns the value Object for the specified row in this column.
     */
    public java.lang.Object valueAtRow(int rowIndex){
        return null; //TODO codavaj!!
    }

    /**
     * This method is called to notify the Association that the widget entered the editing state.
     */
    public boolean widgetDidBeginEditing(){
        return false; //TODO codavaj!!
    }

    /**
     * This method is called to notify the Association that the widget has finished the editing state.
     */
    public boolean widgetDidEndEditing(){
        return false; //TODO codavaj!!
    }

    /**
     * This method returns the abstract base class for table column widget plugin's for this association class.
     */
    protected java.lang.Class widgetPluginClass(){
        return null; //TODO codavaj!!
    }

    /**
     * TableColumnPlugin communicates with a UI widget (Cocoa's NSTableColumn or JFC's TableColumn, for example) on behalf of an EOTableAssociation. The TableColumnPlugin class defines some basic functionality concrete subclasses must implement for this communication to work.
     */
    public static abstract class TableColumnPlugin extends com.webobjects.eointerface.EOWidgetAssociation.WidgetPlugin{
        /**
         * Creates a new TableColumnPlugin for use with association and widget.
         * Parameters:association - EOTableColumnAssociation for this plugin to communicate withwidget - the table column object for this plugin to manage
         */
        public TableColumnPlugin(com.webobjects.eointerface.EOWidgetAssociation association, java.lang.Object widget){
             //TODO codavaj!!
        }

        /**
         * Gets the positional index of the plugin's column.
         */
        public abstract int columnIndexInTable();

        /**
         * Formats a data value for display (potentially using a Formatter object as defined in subclasses).
         */
        public abstract java.lang.Object displayValueForValue(java.lang.Object value);

        /**
         * Asks the plugin to halt editing of its widget in the UI.
         */
        public boolean endEditing(){
            return false; //TODO codavaj!!
        }

        /**
         * This method returns a flag indicating whether the TableColumn is editable.
         */
        public abstract boolean isEditable();

        /**
         * This method is usually called internally and used to obtain the table widget from the column widget.
         */
        public abstract java.lang.Object table();

        /**
         * Returns an association for the table of this plugin's column.
         */
        public abstract com.webobjects.eointerface.EOTableAssociation tableAssociation();

        /**
         * This method performs the reverse operation of formatting, that is, it returns the data value for a displayed value, potentially using a Formatter object's "parse" method as defined in subclasses. Note that there may be a loss of precision or detail depending on the display value.
         */
        public abstract java.lang.Object valueForDisplayValue(java.lang.Object displayValue);

    }
}

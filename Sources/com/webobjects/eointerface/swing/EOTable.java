package com.webobjects.eointerface.swing;
/**
 * The EOTable class is used to represent tables of data. An EOTable is basically a JScrollPane with a JTable (and a JTableHeader) inside. If you want to configure or message an EOTable's JTable directly, you can access it with the table method.
 * See Also:EOTable.table(), Serialized Form
 */
public class EOTable extends javax.swing.JScrollPane implements com.webobjects.foundation.NSDisposable{
    /**
     * Constructs a new EOTable which is configured to always use a vertical scroll bar and a horizontal scrollbar if needed.
     */
    public EOTable(){
         //TODO codavaj!!
    }

    /**
     * Releases all resources used by this object and ensures that it becomes available for garbage collection. Note that you should not use the object any further after invoking dispose.
     */
    public void dispose(){
        return; //TODO codavaj!!
    }

    /**
     * Returns the JTable used by the EOTable.
     */
    public javax.swing.JTable table(){
        return null; //TODO codavaj!!
    }

}

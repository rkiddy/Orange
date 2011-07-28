
package com.webobjects.eointerface.swing;

import com.webobjects.foundation.NSDisposable;
import com.webobjects.foundation._NSUtilities;
import javax.swing.*;
import javax.swing.table.TableColumn;


public class EOTable extends JScrollPane
    implements NSDisposable {
    public static class _EOTableColumn extends TableColumn {

        public _EOTableColumn() { return null; }
    }



    public EOTable() { return null; }

    public void dispose() {}

    public JTable table() { return null; }

    public EOColumnEditor _defaultColumnEditor() { return null; }

    static  {}

    private static final long serialVersionUID = 0x9d3db065L;
    public static final Class _CLASS;
    private JTable _table;
    private EOColumnEditor _defaultColumnEditor;

}

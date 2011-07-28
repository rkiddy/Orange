
package com.webobjects.eogeneration;

import com.webobjects.eoapplication.EOXMLUnarchiver;
import com.webobjects.eoapplication._EOWidgetUtilities;
import com.webobjects.eointerface.*;
import com.webobjects.eointerface.swing.EOTable;
import com.webobjects.foundation._NSUtilities;
import java.awt.Dimension;
import javax.swing.JComponent;
import javax.swing.table.TableColumn;


public class EOTableColumnController extends EOFormatValueController {


    public EOTableColumnController() { return null; }

    public EOTableColumnController(EOXMLUnarchiver unarchiver) { return null; }

    public boolean canBeTransient() { return true; }

    protected void generateComponent() {}

    protected EOAssociation newAssociation(JComponent widget, EODisplayGroup displayGroup, String enabledKey, EODisplayGroup enabledDisplayGroup) { return null; }

    protected JComponent newWidget() { return null; }

    protected EOTable table() { return null; }

    public void setTableColumn(TableColumn tableColumn) {}

    public TableColumn tableColumn() { return null; }

    static  {}

    public static final Class _CLASS;
    private TableColumn _tableColumn;

}

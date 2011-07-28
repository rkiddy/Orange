
package com.webobjects.eogeneration;

import com.webobjects.eoapplication.EOXMLUnarchiver;
import com.webobjects.eoapplication._EOWidgetUtilities;
import com.webobjects.eointerface.*;
import com.webobjects.eointerface.swing.EOTable;
import com.webobjects.foundation.NSMutableDictionary;
import com.webobjects.foundation._NSUtilities;
import java.awt.event.ComponentEvent;
import java.awt.event.ComponentListener;
import javax.swing.JComponent;
import javax.swing.JTable;


public class EOTableController extends EODefaultActionTrigger
    implements ComponentListener, EOWidgetController.TableWidget {


    public EOTableController() { return null; }

    public EOTableController(EOXMLUnarchiver unarchiver) { return null; }

    public NSMutableDictionary _xmlParameters() { return null; }

    protected void componentDidBecomeVisible() {}

    public void setAllowsMultipleSelection(boolean flag) {}

    public boolean allowsMultipleSelection() { return true; }

    public void setSortsByColumnOrder(boolean flag) {}

    public boolean sortsByColumnOrder() { return true; }

    protected JComponent newWidget() { return null; }

    protected void startListeningToWidget() {}

    protected void stopListeningToWidget() {}

    public EOTable table() { return null; }

    protected JComponent mouseListenerViewInWidget() { return null; }

    protected EOAssociation newAssociation(JComponent widget, EODisplayGroup displayGroup, String enabledKey, EODisplayGroup enabledDisplayGroup) { return null; }

    public void componentHidden(ComponentEvent componentevent) {}

    public void componentMoved(ComponentEvent componentevent) {}

    public void componentResized(ComponentEvent event) {}

    public void componentShown(ComponentEvent componentevent) {}

    static  {}

    public static final Class _CLASS;
    private boolean _allowsMultipleSelection;
    private boolean _sortsByColumnOrder;

}

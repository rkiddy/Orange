
package com.webobjects.eogeneration;

import com.webobjects.eoapplication.*;
import com.webobjects.eointerface.*;
import com.webobjects.eointerface.swing.EOTable;
import com.webobjects.foundation.*;
import java.awt.event.ComponentEvent;
import java.awt.event.ComponentListener;
import javax.swing.JComponent;


public class EODetailSelectionController extends EOEnumerationController
    implements ComponentListener {


    public EODetailSelectionController() { return null; }

    public EODetailSelectionController(EOXMLUnarchiver unarchiver) { return null; }

    protected void disposeAssociations() {}

    protected void connectionWasEstablished() {}

    protected void connectionWasBroken() {}

    protected int preferredLabelComponentPosition() { return 0; }

    protected int _labelComponentVerticalOffset() { return 0; }

    protected void componentDidBecomeVisible() {}

    private EOTable _table() { return null; }

    protected JComponent newWidget() { return null; }

    protected void startListeningToWidget() {}

    protected void stopListeningToWidget() {}

    protected EOAssociation newAssociation(JComponent widget, EODisplayGroup displayGroup, String enabledKey, EODisplayGroup enabledDisplayGroup) { return null; }

    public void componentHidden(ComponentEvent componentevent) {}

    public void componentMoved(ComponentEvent componentevent) {}

    public void componentResized(ComponentEvent event) {}

    public void componentShown(ComponentEvent componentevent) {}

    static  {}

    public static final Class _CLASS;
    private NSMutableArray _associations;

}

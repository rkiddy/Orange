
package com.webobjects.eogeneration;

import com.webobjects.eoapplication.*;
import com.webobjects.eocontrol.*;
import com.webobjects.eointerface.*;
import com.webobjects.eointerface.swing.EOSwingUtilities;
import com.webobjects.eointerface.swing.EOViewLayout;
import com.webobjects.foundation.NSMutableDictionary;
import com.webobjects.foundation._NSUtilities;
import java.awt.Dimension;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;


public class EOOneValueEnumerationController extends EOEnumerationController
    implements ActionListener, EOWidgetController.QueryWidget {


    public EOOneValueEnumerationController() { return null; }

    public EOOneValueEnumerationController(EOXMLUnarchiver unarchiver) { return null; }

    public NSMutableDictionary _xmlParameters() { return null; }

    protected void _updateUserInterface() {}

    protected boolean _needsUserInterfaceUpdateNotifications() { return true; }

    public void setIsQueryWidget(boolean flag) {}

    public boolean isQueryWidget() { return true; }

    protected JComponent newWidget() { return null; }

    protected void startListeningToWidget() {}

    protected void stopListeningToWidget() {}

    protected EOEditingContext _defaultEditingContext() { return null; }

    protected EODisplayGroup _defaultDisplayGroup() { return null; }

    protected String _associationRelationshipPath() { return null; }

    protected EOAssociation newAssociation(JComponent widget, EODisplayGroup displayGroup, String enabledKey, EODisplayGroup enabledDisplayGroup) { return null; }

    public boolean canPerformActionNamed(String actionName) { return true; }

    public void deselect() {}

    public void actionPerformed(ActionEvent event) {}

    static  {}

    public static final Class _CLASS;
    private JComboBox _comboBox;
    private JButton _deselectButton;
    private boolean _isQueryWidget;

}

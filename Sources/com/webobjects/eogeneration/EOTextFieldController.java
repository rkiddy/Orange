
package com.webobjects.eogeneration;

import com.webobjects.eoapplication.*;
import com.webobjects.eointerface.*;
import com.webobjects.eointerface.swing.EOSwingUtilities;
import com.webobjects.foundation.NSMutableDictionary;
import com.webobjects.foundation._NSUtilities;
import java.awt.Dimension;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JComponent;
import javax.swing.JTextField;


public class EOTextFieldController extends EOFormatValueController
    implements ActionListener, EOWidgetController.QueryWidget {


    public EOTextFieldController() { return null; }

    public EOTextFieldController(EOXMLUnarchiver unarchiver) { return null; }

    public NSMutableDictionary _xmlParameters() { return null; }

    protected boolean disposeIfTransient() { return true; }

    protected boolean preferredUsesLabelComponent() { return true; }

    public void setIsQueryWidget(boolean flag) {}

    public boolean isQueryWidget() { return true; }

    public void setUsesPasswordField(boolean flag) {}

    public boolean usesPasswordField() { return true; }

    protected JComponent newWidget() { return null; }

    protected void setAlignmentForWidget(JComponent widget, int alignment) {}

    protected void startListeningToWidget() {}

    protected void stopListeningToWidget() {}

    protected EODisplayGroup _defaultDisplayGroup() { return null; }

    protected String _associationValueKey() { return null; }

    protected EOAssociation newAssociation(JComponent widget, EODisplayGroup displayGroup, String enabledKey, EODisplayGroup enabledDisplayGroup) { return null; }

    public void actionPerformed(ActionEvent event) {}

    static  {}

    public static final Class _CLASS;
    private boolean _isQueryWidget;
    private boolean _usesPasswordField;

}

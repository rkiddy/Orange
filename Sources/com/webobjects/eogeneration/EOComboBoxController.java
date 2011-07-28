
package com.webobjects.eogeneration;

import com.webobjects.eoapplication.*;
import com.webobjects.eointerface.*;
import com.webobjects.foundation.NSMutableDictionary;
import com.webobjects.foundation._NSUtilities;
import java.awt.Dimension;
import javax.swing.JComboBox;
import javax.swing.JComponent;


public class EOComboBoxController extends EOTitlesController
    implements EOWidgetController.QueryWidget {


    public EOComboBoxController() { return null; }

    public EOComboBoxController(EOXMLUnarchiver unarchiver) { return null; }

    public NSMutableDictionary _xmlParameters() { return null; }

    protected boolean preferredUsesLabelComponent() { return true; }

    public void setValueKey(String string) {}

    public String valueKey() { return null; }

    protected String _derivedLabel() { return null; }

    public void setIsQueryWidget(boolean flag) {}

    public boolean isQueryWidget() { return true; }

    protected JComponent newWidget() { return null; }

    protected EODisplayGroup _defaultDisplayGroup() { return null; }

    protected String _associationValueKey() { return null; }

    protected EOAssociation newAssociation(JComponent widget, EODisplayGroup displayGroup, String enabledKey, EODisplayGroup enabledDisplayGroup) { return null; }

    public String toString() { return null; }

    static  {}

    public static final Class _CLASS;
    private String _valueKey;
    private boolean _isQueryWidget;

}

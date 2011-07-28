
package com.webobjects.eogeneration;

import com.webobjects.eoapplication.EOXMLUnarchiver;
import com.webobjects.eoapplication._EOWidgetUtilities;
import com.webobjects.eointerface.*;
import com.webobjects.foundation.NSMutableDictionary;
import com.webobjects.foundation._NSUtilities;
import javax.swing.JComponent;


public class EOCheckBoxController extends EOValueController {


    public EOCheckBoxController() { return null; }

    public EOCheckBoxController(EOXMLUnarchiver unarchiver) { return null; }

    public NSMutableDictionary _xmlParameters() { return null; }

    protected boolean preferredUsesLabelComponent() { return true; }

    protected String _labelComponentString() { return null; }

    public void setDisplaysLabelInWidget(boolean flag) {}

    public boolean displaysLabelInWidget() { return true; }

    protected JComponent newWidget() { return null; }

    protected EOAssociation newAssociation(JComponent widget, EODisplayGroup displayGroup, String enabledKey, EODisplayGroup enabledDisplayGroup) { return null; }

    static  {}

    public static final Class _CLASS;
    private boolean _displaysLabelInWidget;

}


package com.webobjects.eogeneration;

import com.webobjects.eoapplication.EOXMLUnarchiver;
import com.webobjects.eoapplication._EOWidgetUtilities;
import com.webobjects.eointerface.*;
import com.webobjects.eointerface.swing.EOTextArea;
import com.webobjects.foundation._NSUtilities;
import javax.swing.JComponent;


public class EOTextAreaController extends EOValueAndURLController {


    public EOTextAreaController() { return null; }

    public EOTextAreaController(EOXMLUnarchiver unarchiver) { return null; }

    protected int _labelComponentVerticalOffset() { return 0; }

    protected int preferredLabelComponentPosition() { return 0; }

    protected boolean preferredUsesLabelComponent() { return true; }

    protected int preferredWidgetAutosizingMask() { return 0; }

    protected boolean _preferredCanResizeVertically() { return true; }

    protected JComponent newWidget() { return null; }

    protected EOAssociation newAssociation(JComponent widget, EODisplayGroup displayGroup, String enabledKey, EODisplayGroup enabledDisplayGroup) { return null; }

    static  {}

    public static final Class _CLASS;

}

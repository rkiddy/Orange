
package com.webobjects.eoapplication;

import com.webobjects.eointerface.swing.EOViewLayout;
import com.webobjects.foundation.*;
import java.awt.Dimension;
import java.awt.Insets;
import javax.swing.JComponent;


public class EOActionButtonsController extends EOActionWidgetController
    implements EOWindowController._Toobar {


    public EOActionButtonsController() { return null; }

    public EOActionButtonsController(EOXMLUnarchiver unarchiver) { return null; }

    public NSMutableDictionary _xmlParameters() { return null; }

    protected void disposeActionWidgets() {}

    public void setUsesLargeButtonRepresentation(boolean flag) {}

    public boolean usesLargeButtonRepresentation() { return true; }

    protected Insets _preferredInsets() { return null; }

    public boolean _isToolbar() { return true; }

    protected boolean _drawSeparator() { return true; }

    protected boolean supportsSecondaryActionWidget() { return true; }

    public NSArray actionWidgets() { return null; }

    protected void updateActionWidgetEnabling() {}

    protected void createWidgetsForActionsAndPlaceInContainers(NSArray actions, NSArray secondaryActions, JComponent container, JComponent secondaryContainer, int widgetPosition) {}

    static  {}

    public static final Class _CLASS;
    private JComponent _buttonRow;
    private JComponent _secondaryButtonRow;
    private boolean _usesLargeButtonRepresentation;

}

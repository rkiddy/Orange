
package com.webobjects.eoapplication;

import com.webobjects.eointerface.swing.EOViewLayout;
import com.webobjects.foundation.*;
import java.awt.*;
import javax.swing.JComponent;


public abstract class EOActionWidgetController extends EOComponentController
    implements EOComponentController.ActionCollector {


    public EOActionWidgetController() { return null; }

    public EOActionWidgetController(EOXMLUnarchiver unarchiver) { return null; }

    public NSMutableDictionary _xmlParameters() { return null; }

    public void dispose() {}

    protected abstract void disposeActionWidgets();

    public void setActionWidgetPosition(int position) {}

    public int actionWidgetPosition() { return 0; }

    public void setActionWidgetContainer(JComponent component) {}

    public JComponent actionWidgetContainer() { return null; }

    public void setSecondaryActionWidgetContainer(JComponent component) {}

    public JComponent secondaryActionWidgetContainer() { return null; }

    protected Insets _preferredInsets() { return null; }

    public boolean _canFillUpSpaceForIntegration(Component component) { return true; }

    protected boolean _drawSeparator() { return true; }

    protected void generateComponent() {}

    protected void _updateUserInterface() {}

    protected boolean _needsUserInterfaceUpdateNotifications() { return true; }

    protected boolean supportsSecondaryActionWidget() { return true; }

    public abstract NSArray actionWidgets();

    protected abstract void updateActionWidgetEnabling();

    protected abstract void createWidgetsForActionsAndPlaceInContainers(NSArray nsarray, NSArray nsarray1, JComponent jcomponent, JComponent jcomponent1, int i);

    protected void componentDidBecomeVisible() {}

    public void subcontrollerConnectionDidChange(EOController controller) {}

    public void subcontrollerActionsDidChange(EOController controller) {}

    protected void _fillActionsArrayWithController(EOController controller, NSMutableArray arrayOfActionArrays) {}

    public NSArray collectedActions() { return null; }

    public void resetActions() {}

    static  {}

    public static final Class _CLASS;
    private static NSArray _testActions;
    private int _actionWidgetPosition;
    private NSArray _collectedActions;
    private JComponent _actionWidgetContainer;
    private JComponent _secondaryActionWidgetContainer;

}

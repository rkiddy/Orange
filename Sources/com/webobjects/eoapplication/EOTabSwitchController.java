
package com.webobjects.eoapplication;

import com.webobjects.eointerface.swing.EOSwingUtilities;
import com.webobjects.eointerface.swing.EOViewLayout;
import com.webobjects.foundation.NSArray;
import com.webobjects.foundation._NSUtilities;
import java.awt.*;
import javax.swing.*;


public class EOTabSwitchController extends EOSwitchController {
    private class _TabbedPane extends JTabbedPane {


        public _TabbedPane() { return null; }

        public void addTabWithoutNotifications(String title, Icon icon, Component component) {}

        public void removeTabAtIndexWithoutNotifications(int index) {}

        public void setSelectedIndexWithoutNotifications(int index) {}

        public void setSelectedIndex(int index) {}

        protected void fireStateChanged() {}

        boolean _preventStateChangeNotification;
        final EOTabSwitchController this$0;

    }



    public EOTabSwitchController() { return null; }

    public EOTabSwitchController(EOXMLUnarchiver unarchiver) { return null; }

    protected Insets _preferredInsets() { return null; }

    private _TabbedPane _createTabbedPane() { return null; }

    protected JComponent newDisplayComponent() { return null; }

    public Dimension minimumComponentSize() { return null; }

    protected Dimension displayComponentBorderSize() { return null; }

    protected JComponent selectedBorderComponentInDisplayComponent(JComponent displayComponent) { return null; }

    protected void addBorderComponentForControllerToDisplayComponent(EOComponentController controller, JComponent borderComponent, JComponent displayComponent) {}

    protected void removeBorderComponentForControllerFromDisplayComponent(EOComponentController controller, JComponent borderComponent, JComponent displayComponent, int index) {}

    protected void showBorderComponentAtIndexInDisplayComponent(JComponent borderComponent, JComponent displayComponent, int index) {}

    static  {}

    public static final Class _CLASS;
    private int _tabbedPaneMinimumWidth;

}


package com.webobjects.eoapplication;

import com.webobjects.eointerface.swing.EOSwingUtilities;
import com.webobjects.eointerface.swing.EOViewLayout;
import com.webobjects.foundation.*;
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;


public class EOInspectorController extends EOWindowController
    implements EOComponentController.ResetUserInterface {
    public static class _InspectorWindowManager
        implements NSDisposable, WindowListener, ComponentListener {


        public _InspectorWindowManager(String inspectorIdentifier) { return null; }

        public void dispose() {}

        private void _disposeWindowIfInvisibleAndNoController() {}

        private String _defaultsKey(String key) { return null; }

        public void _setPersistentIntDefaultsValueForKey(int value, String key) {}

        public int _persistentIntDefaultsValueForKey(String key, int defaultValueIfNotAvailable) { return 0; }

        public void addController(EOInspectorController controller) {}

        public void removeController(EOInspectorController controller) {}

        private void _updateVisibleStates(EOInspectorController visibleController) {}

        private void _layoutInspectorWindowForController(EOInspectorController controller) {}

        public JDialog inspectorWindow() { return null; }

        public void showControllerInInspectorWindow(EOInspectorController controller) {}

        public void updateInspectorWindowSize() {}

        public void updateInspectorWindow() {}

        public boolean isControllerVisibleInInspectorWindow(EOController controller) { return true; }

        public void activeWindowDidChange(NSNotification notification) {}

        public void windowOpened(WindowEvent windowevent) {}

        public void windowClosing(WindowEvent event) {}

        public void windowClosed(WindowEvent windowevent) {}

        public void windowActivated(WindowEvent windowevent) {}

        public void windowDeactivated(WindowEvent windowevent) {}

        public void windowDeiconified(WindowEvent windowevent) {}

        public void windowIconified(WindowEvent windowevent) {}

        public void componentHidden(ComponentEvent componentevent) {}

        public void componentMoved(ComponentEvent event) {}

        public void componentResized(ComponentEvent event) {}

        public void componentShown(ComponentEvent componentevent) {}

        static  {}

        public static final Class _CLASS;
        private String _inspectorIdentifier;
        private NSMutableArray _controllers;
        private EOInspectorController _visibleController;
        private JDialog _inspectorWindow;
        private Dimension _minimumInspectorWindowSize;
        private int _inspectorWindowPosition;
        private boolean _inspectorWindowRegisteredInWindowObserver;

    }



    private static _InspectorWindowManager _inspectorWindowManagerForIdentifier(String inspectorIdentifier) { return null; }

    private static void _forgetInspectorWindowManager(_InspectorWindowManager manager) { return null; }

    public EOInspectorController() { return null; }

    public EOInspectorController(EOXMLUnarchiver unarchiver) { return null; }

    public NSMutableDictionary _xmlParameters() { return null; }

    public void dispose() {}

    protected void addComponentOfSubcontroller(EOComponentController controller) {}

    public void setInspectorIdentifier(String string) {}

    public String inspectorIdentifier() { return null; }

    protected String _derivedLabel() { return null; }

    protected void generateComponent() {}

    public void resetUserInterface() {}

    protected Dimension windowBorderSize() { return null; }

    public void activateWindow() {}

    public void subcontrollerMinimumSizeDidChange(EOComponentController controller, JComponent component, Dimension updateMinimumSize) {}

    protected void _integrationComponentWouldHaveBecomeVisibleIfAvailable() {}

    protected void _integrationComponentWouldHaveBecomeInvisibleIfAvailable() {}

    protected void integrationComponentDidBecomeVisible() {}

    protected void integrationComponentDidBecomeInvisible() {}

    static NSSelector access$000() { return null; }

    static  {}

    public static final Class _CLASS;
    private static NSMutableDictionary _inspectorWindowToIdentifierMapTable;
    private static final NSSelector _activeWindowDidChangeSelector;
    private _InspectorWindowManager _inspectorWindowManager;
    private String _inspectorIdentifier;


    static NSSelector access$000() { return null; }
}

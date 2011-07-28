
package com.webobjects.eoapplication;

import com.webobjects.eointerface.swing.EOSwingUtilities;
import com.webobjects.eointerface.swing.EOViewLayout;
import com.webobjects.foundation.*;
import java.awt.*;
import java.awt.event.*;
import javax.swing.JComponent;


public abstract class EOSimpleWindowController extends EOWindowController
    implements WindowListener, ComponentListener, EOComponentController.ResetUserInterface {


    public static void _runControllerInNewWindow(Class windowControllerClass, EOComponentController controller, boolean disposeIfDeactivated, String windowTitle) { return null; }

    public EOSimpleWindowController() { return null; }

    public EOSimpleWindowController(EOXMLUnarchiver unarchiver) { return null; }

    public NSMutableDictionary _xmlParameters() { return null; }

    public void dispose() {}

    protected void addComponentOfSubcontroller(EOComponentController controller) {}

    public boolean _shouldAddSubcontrollerComponents() { return true; }

    protected Window newWindow() { return null; }

    public void resetUserInterface() {}

    public void setLabel(String string) {}

    public void activateWindow() {}

    public void deactivateWindow() {}

    public void subcontrollerMinimumSizeDidChange(EOComponentController controller, JComponent component, Dimension updateMinimumSize) {}

    public void setDisposeIfDeactivated(boolean flag) {}

    public boolean disposeIfDeactivated() { return true; }

    private void _layoutWindow(Window window) {}

    protected void integrationComponentDidBecomeVisible() {}

    protected void integrationComponentDidBecomeInvisible() {}

    protected void _integrationComponentWouldHaveBecomeInvisibleIfAvailable() {}

    protected void componentDidBecomeVisible() {}

    protected void componentDidBecomeInvisible() {}

    public boolean makeVisible() { return true; }

    public void subcontrollerEditedDidChange(EOController controller) {}

    protected abstract Window newWindow(JComponent jcomponent);

    protected Dimension verifyContentMinimumSize(Window window, Dimension size) { return null; }

    protected abstract void setWindowResizable(Window window1, boolean flag);

    private void _updateResizing(Window window, JComponent component) {}

    protected abstract void setWindowTitle(Window window1, String s);

    private void _updateWindowEditedState(Window window) {}

    protected void startListeningToWindow() {}

    protected void stopListeningToWindow() {}

    public void setWindow(Window window) {}

    public Window window() { return null; }

    public boolean closeWindow() { return true; }

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
    public static final String _WindowEditedPrefix = "* ";
    private Window _window;
    private boolean _disposeOnWindowClose;
    private boolean _windowRegisteredInWindowObserver;
    private boolean _ignoreVisibilityNotifications;

}

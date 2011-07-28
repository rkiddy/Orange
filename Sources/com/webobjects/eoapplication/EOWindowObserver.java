
package com.webobjects.eoapplication;

import com.webobjects.eointerface.swing.EOSwingUtilities;
import com.webobjects.foundation.*;
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;


public class EOWindowObserver
    implements WindowListener, NSDisposable, EOAction.Enabling {
    private static class _ActivateWindowRunnable
        implements Runnable {


        public _ActivateWindowRunnable(Frame frame) { return null; }

        public void run() {}

        private Frame _frame;

    }

    private static class _MenuItem extends JMenuItem
        implements ActionListener, NSDisposable {


        public _MenuItem(Window window) { return null; }

        public void dispose() {}

        public void actionPerformed(ActionEvent event) {}

        static  {}

        private static boolean _menuItemsRetrieved;
        private static Icon _menuIconEdited;
        private static Icon _menuIconEditedHightlight;
        private Window _window;

    }



    protected EOWindowObserver() { return null; }

    public void dispose() {}

    public void registerWindow(Window window, EOController controller) {}

    public void registerWindow(Window window) {}

    public void unregisterWindow(Window window) {}

    public void unregisterWindowOfController(EOController controller) {}

    public EOController controllerForWindow(Window window) { return null; }

    public Window windowForController(EOController controller) { return null; }

    public Window activeWindow() { return null; }

    public EOController controllerForActiveWindow() { return null; }

    public Window latestDeactivatedWindow() { return null; }

    public EOController controllerForLatestDeactivatedWindow() { return null; }

    public void activateBestWindow() {}

    private NSMutableArray _visibleWindowsNewMutableArray() { return null; }

    public NSArray visibleWindows() { return null; }

    public NSArray registeredWindows() { return null; }

    private void _postLastWindowClosedNotification() {}

    private void _postActiveWindowChangedNotification() {}

    public void blockActiveWindowChangedNotification() {}

    public void unblockActiveWindowChangedNotification() {}

    protected void windowDidBecomeVisible(Window window) {}

    protected void windowDidBecomeInvisible(Window window) {}

    protected void windowDidBecomeActive(Window window) {}

    protected void windowDidBecomeInactive(Window window) {}

    public boolean canPerformActionNamed(String actionName) { return true; }

    public Window previousWindowToActivate() { return null; }

    public void activatePreviousWindow() {}

    public void minimizeActiveWindow() {}

    public void bringAllWindowsToFront() {}

    public void _instrumentMenuBar(JMenuBar menuBar) {}

    public void _deinstrumentMenuBar(JMenuBar menuBar) {}

    private NSArray _sortedWindowsForWindowsMenus() { return null; }

    private JMenu _updateWindowsMenu(JMenu menu, NSArray windows) { return null; }

    public void _updateWindowsMenus(Object unusedArgument) {}

    void _updateWindowsMenus(Window changedWindow) { return null; }

    public void windowOpened(WindowEvent event) {}

    public void windowClosed(WindowEvent event) {}

    public void windowActivated(WindowEvent event) {}

    public void windowDeactivated(WindowEvent event) {}

    public void windowDeiconified(WindowEvent event) {}

    public void windowIconified(WindowEvent event) {}

    public void windowClosing(WindowEvent windowevent) {}

    static  {}

    public static final Class _CLASS;
    public static final String ActiveWindowChangedNotification = "EOActiveWindowChanged";
    public static final String LastWindowClosedNotification = "EOLastWindowClosed";
    public static final int _WindowUpdateRunLoopOrdering = 0xaae60;
    private static final NSSelector _updateWindowsMenusNotificationSelector;
    private NSMutableDictionary _controllerWindowMapTable;
    private NSMutableArray _windowActivationQueue;
    private Window _activeWindow;
    private Window _latestDeactivatedWindow;
    private int _numberOfActiveWindowChangedNotificationBlocks;
    private NSMutableArray _windowsMenus;
    private NSMutableArray _sortedWindowsForWindowsMenus;
    private boolean _registeredForWindowsMenuUpdateNotification;


    // Unreferenced inner class com/webobjects/eoapplication/EOWindowObserver$1

/* anonymous class */
    class _cls1 extends NSComparator {


        _cls1() { return null; }

        public int compare(Object object1, Object object2) throws com.webobjects.foundation.NSComparator.ComparisonException { return 0; }

        final EOWindowObserver this$0;

    }

}

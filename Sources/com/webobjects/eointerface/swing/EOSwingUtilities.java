
package com.webobjects.eointerface.swing;

import com.webobjects.eointerface.*;
import com.webobjects.foundation.*;
import java.awt.Font;
import javax.swing.SwingUtilities;


public class EOSwingUtilities {
    public static class _EventHandler
        implements com.webobjects.foundation.NSDelayedCallbackCenter._Delegate {


        public _EventHandler() { return null; }

        public void _delayedCallbackCenterWillNeedEndOfEventNotification(NSDelayedCallbackCenter nsdelayedcallbackcenter) {}

        public boolean _delayedCallbackCenterShouldHandleEndOfEvent(NSDelayedCallbackCenter delayedCallbackCenter) { return true; }

        public void _delayedCallbackCenterWillHandleEndOfEvent(NSDelayedCallbackCenter delayedCallbackCenter) {}

        private boolean _runnableRegistered;


        // Unreferenced inner class com/webobjects/eointerface/swing/EOSwingUtilities$_EventHandler$1

/* anonymous class */
        class _cls1
            implements Runnable {


            _cls1() { return null; }

            public void run() {}

            final _EventHandler this$0;

        }

    }



    public static int _platform() { return null; }

    public static boolean _isRunningOnMacPlatform() { return null; }

    public static Font _font(String fontName, int size, int style) { return null; }

    public static void registerSwingSet() { return null; }

    public static void eventEnded() { return null; }

    EOSwingUtilities() { return null; }

    static  {}

    public static final Class _CLASS;
    public static final Class _ActionListenerClass;
    public static final Class _WindowClass;
    public static final Class _CellEditorListenerClass;
    public static final Class _AbstractButtonClass;
    public static final Class _TableColumnClass;
    public static final Class _JCheckBoxClass;
    public static final Class _JTableClass;
    public static final Class _JTreeClass;
    public static final Class _JDialogClass;
    public static final Class _JFrameClass;
    public static final Class _JButtonClass;
    public static final Class _JComboBoxClass;
    public static final Class _JTextComponentClass;
    public static final int _MacPlatform = 0;
    public static final int _WindowsPlatform = 1;
    public static final int _OtherPlatform = 2;
    private static volatile int _platform;
    private static NSDictionary _fontMap;

}

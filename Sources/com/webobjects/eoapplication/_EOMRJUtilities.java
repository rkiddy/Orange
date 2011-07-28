
package com.webobjects.eoapplication;

import com.apple.mrj.MRJApplicationUtils;
import com.apple.mrj.MRJQuitHandler;
import com.webobjects.foundation._NSUtilities;
import java.awt.Window;
import javax.swing.*;


public class _EOMRJUtilities {
    private static class _MRJCode
        implements MRJQuitHandler {

        private _MRJCode() { return null; }

        static boolean _registerQuitHandler() { return true; }

        public void handleQuit() {}

        // Unreferenced inner class com/webobjects/eoapplication/_EOMRJUtilities$_MRJCode$1

/* anonymous class */
        class _cls1
            implements Runnable {


            _cls1() { return null; }

            public void run() {}

            final _MRJCode this$0;

        }

    }



    public _EOMRJUtilities() { return null; }

    private static boolean _isMRJAvailable() { return null; }

    private static boolean _doesMRJSupportWindowDirtyState() { return null; }

    public static boolean _setWindowEdited(Window window, boolean isEdited) { return null; }

    public static boolean _isWindowEdited(Window window) { return null; }

    public static boolean _registerQuitHandler() { return null; }

    static  {}

    public static final Class _CLASS;
    private static int _mrjAvailable;
    private static int _mrjSupportsWindowDirtyState;

}

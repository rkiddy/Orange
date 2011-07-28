
package com.webobjects.eoapplication;

import com.webobjects.eocontrol.EOGlobalID;
import com.webobjects.eocontrol.EOObjectStore;
import com.webobjects.eointerface.swing.EOSwingUtilities;
import com.webobjects.foundation.*;
import java.awt.Container;
import java.awt.Window;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Locale;
import javax.swing.*;


public class EOApplication extends EOController {
    private static class _MenuItem extends JMenuItem
        implements ActionListener, NSDisposable {


        public _MenuItem(Object documentIdentifier, String title) { return null; }

        public _MenuItem(boolean clearMenuItemEnabled) { return null; }

        public void dispose() {}

        public void actionPerformed(ActionEvent event) {}

        private Object _documentIdentifier;

    }

    private static class _ControllerInitializationData {


        public _ControllerInitializationData(String className, EOComponentController controller) { return null; }

        public String controllerClassName;
        public EOComponentController componentController;

    }

    public static abstract class ApplicationSupport {


        public ApplicationSupport() { return null; }

        public void runStartupDialogs(NSDictionary nsdictionary) {}

        public void prepareClasses(NSDictionary nsdictionary) {}

        public void prepareGlobalObjects(NSDictionary nsdictionary) {}

        public void prepareApplication(EOApplication eoapplication, NSDictionary nsdictionary) {}

        public void finishStartup(NSDictionary nsdictionary) {}

        public void refreshData() {}

        public void acknowledgeQuit() {}

        static  {}

        public static final Class _CLASS = null;

    }

    public static interface _RecentDocumentsMenuHandler {


        public abstract String _stringForDocumentIdentifier(Object obj);

        public abstract void _activateWithDocumentIdentifier(Object obj);



        public static final Class _CLASS = null;

    }

    public static interface _QuitHandler {


        public abstract boolean _canApplicationQuit();



        public static final Class _CLASS = null;

    }



    public static NSDictionary _mergeArguments(NSDictionary parameters) { return null; }

    private static void _initializeSwingLookAndFeel() { return null; }

    private static void _initializeLogging() { return null; }

    private static void _addInformationForLocale(Locale locale, NSMutableArray languages, NSMutableArray locales, NSMutableArray localeIndicators) { return null; }

    private static Locale _localeForPreferredLanguage(String preferredLanguage, Locale locales[]) { return null; }

    public static void _initializeLocaleInformation(NSDictionary arguments, NSMutableArray languages, NSMutableArray locales, NSMutableArray localeIndicators) { return null; }

    public static void _initializePlatformInformation(NSDictionary arguments, NSMutableArray platformIndicators) { return null; }

    private static void _initializeSplash(NSDictionary arguments) { return null; }

    public static void _finishSplash() { return null; }

    public static EOApplication startApplication(NSDictionary parameters, EOComponentController initialTopComponentController, ApplicationSupport applicationSupport) { return null; }

    private static EOApplication _createSharedApplicationWithClass(String className) { return null; }

    public static EOApplication sharedApplication() { return null; }

    public EOApplication() { return null; }

    public void dispose() {}

    private void _disposeControllersHierarchically(EOController controller) {}

    protected NSArray defaultActions() { return null; }

    public boolean saveAll() { return true; }

    public void quit() {}

    public void quitWithMessage(String title, String message) {}

    public void refreshData() {}

    public static void setArguments(NSDictionary arguments) { return null; }

    public NSDictionary arguments() { return null; }

    public void setDefaults(EODefaults defaults) {}

    public EODefaults defaults() { return null; }

    public NSArray languages() { return null; }

    public NSArray locales() { return null; }

    public NSArray localeIndicators() { return null; }

    public NSArray platformIndicators() { return null; }

    public NSArray documents() { return null; }

    public NSArray editedDocuments() { return null; }

    public boolean hasEditedDocuments() { return true; }

    public NSArray documentsForGlobalID(EOGlobalID globalID, String entityName) { return null; }

    public void setApplicationName(String applicationName) {}

    public String applicationName() { return null; }

    public void _setRecentDocumentsMenuHandler(_RecentDocumentsMenuHandler recentDocumentsMenuHandler) {}

    public _RecentDocumentsMenuHandler _recentDocumentsMenuHandler() { return null; }

    private int _numberOfRecentDocumentItems() { return 0; }

    public NSArray _recentDocumentIdentifiers() { return null; }

    private JMenu _updateRecentDocumentsMenu(_RecentDocumentsMenuHandler documentMenuHandler, JMenu menu, JMenu parentMenu, NSArray documentIdentifiers) { return null; }

    public void _updateRecentDocumentsMenus(Object unusedArgument) {}

    private void _updateRecentDocumentsMenus() {}

    void _menuBarCreated(JMenuBar menuBar) { return null; }

    void _menuBarDisposed(JMenuBar menuBar) { return null; }

    void _openRecentDocumentWithIdentifier(Object documentIdentifier) { return null; }

    public void _clearRecentDocumentsMenus() {}

    public void _addIdentifierToRecentDocumentsMenus(Object documentIdentifier) {}

    public void setWindowObserver(EOWindowObserver windowObserver) {}

    public EOWindowObserver windowObserver() { return null; }

    private void _addPendingControllerInitialization(String controllerClassName, EOComponentController componentController) {}

    protected void finishInitialization() {}

    public void setCanQuit(boolean flag) {}

    public boolean canQuit() { return true; }

    public void setQuitsOnLastWindowClose(boolean flag) {}

    public boolean quitsOnLastWindowClose() { return true; }

    public void _addQuitHandler(_QuitHandler quitHandler) {}

    public void _removeQuitHandler(_QuitHandler quitHandler) {}

    public NSArray _quitHandlers() { return null; }

    public void activeWindowDidChange(NSNotification notification) {}

    protected void _quitSinceNoWindowsAvailable() {}

    public void _quitIfNoWindowsVisible() {}

    public void lastWindowDidClose(NSNotification notification) {}

    public String toString() { return null; }

    static  {}

    public static final Class _CLASS = null;
    public static final String ApplicationWillStartNotification = "EOApplicationWillStart";
    public static final String ApplicationWillFinishInitializationNotification = "EOApplicationWillFinishInitialization";
    public static final String ApplicationDidStartNotification = "EOApplicationDidStart";
    public static final String ApplicationWillQuitNotification = "EOApplicationWillQuit";
    private static final NSSelector _activeWindowDidChangeSelector;
    private static final NSSelector _lastWindowDidCloseSelector;
    private static final NSSelector _updateRecentDocumentsMenusNotificationSelector;
    public static final String _ApplicationClassNameArgument = "applicationClassName";
    public static final String _SpashIconNameArgument = "splashIconName";
    public static final String _SpashIconURLArgument = "splashIconURL";
    private static final String _InterfaceControllerClassNameArgument = "interfaceControllerClassName";
    private static final String _LanguageArgument = "language";
    private static final String _DeveloperModeArgument = "developerMode";
    private static final String _LazyExceptionsArgument = "lazyExceptions";
    private static final String _TimeMeasuringArgument = "timeMeasuring";
    private static final String _DebugLevelArgument = "debugLevel";
    private static final String _DebugGroupsArgument = "debugGroups";
    private static final String _NSDebugLevelArgument = "NSDebugLevel";
    private static final String _NSDebugGroupsArgument = "NSDebugGroups";
    private static final int _DefaultNumberOfRecentDocuments = 5;
    private static boolean _registeredForRecentDocumentsMenuUpdateNotification;
    private static NSMutableDictionary _recentDocumentsMenusMapTable;
    private static EOApplication _sharedInstance;
    private static NSMutableArray _languages;
    private static NSMutableArray _locales;
    private static NSMutableArray _localeIndicators;
    private static NSMutableArray _platformIndicators;
    private static NSMutableDictionary _arguments;
    private static ApplicationSupport _applicationSupport;
    private static JWindow _splash;
    private String _applicationName;
    private EOWindowObserver _windowObserver;
    private _RecentDocumentsMenuHandler _recentDocumentsMenuHandler;
    private boolean _canQuit;
    private boolean _quitsOnLastWindowClose;
    private NSMutableArray _quitHandlers;
    private EODefaults _defaults;
    private NSMutableArray _pendingControllerInitializations;


    // Unreferenced inner class com/webobjects/eoapplication/EOApplication$1

/* anonymous class */
    static class _cls1
        implements Runnable {

        _cls1() { return null; }

        public void run() {}
    }


    // Unreferenced inner class com/webobjects/eoapplication/EOApplication$2

/* anonymous class */
    class _cls2
        implements Runnable {


        _cls2() { return null; }

        public void run() {}

        final EOApplication this$0;


        // Unreferenced inner class com/webobjects/eoapplication/EOApplication$2$1

/* anonymous class */
        class _cls1
            implements Runnable {


            _cls1() { return null; }

            public void run() {}

            final _cls2 this$1;

        }

    }

}

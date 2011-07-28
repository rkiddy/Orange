
package com.webobjects.eoapplication;

import com.webobjects.eointerface.swing.EOSwingUtilities;
import com.webobjects.foundation.*;
import java.awt.Window;
import java.awt.event.ActionEvent;
import java.beans.PropertyChangeListener;
import javax.swing.*;


public abstract class EOAction extends AbstractAction {
    public static class _WindowObserver extends _Application
        implements EOXMLUnarchiver._SpecialInstance {

        public static Object _instanceWithXMLUnarchiver(EOXMLUnarchiver unarchiver) { return null; }

        public _WindowObserver(String actionName, String descriptionPath, String shortDescription, Icon icon, Icon smallIcon, KeyStroke menuAccelerator, int categoryPriority, 
                int actionPriority) { return null; }

        public _WindowObserver(EOXMLUnarchiver unarchiver) { return null; }

        protected Object _object() { return null; }
    }

    public static class _Application extends _Object
        implements EOXMLUnarchiver._SpecialInstance {

        public static Object _instanceWithXMLUnarchiver(EOXMLUnarchiver unarchiver) { return null; }

        public _Application(String actionName, String descriptionPath, String shortDescription, Icon icon, Icon smallIcon, KeyStroke menuAccelerator, int categoryPriority, 
                int actionPriority) { return null; }

        public _Application(EOXMLUnarchiver unarchiver) { return null; }

        public NSMutableDictionary _xmlParameters() { return null; }
    }

    static class _Object extends EOAction {


        public _Object(String actionName, String descriptionPath, String shortDescription, Icon icon, Icon smallIcon, KeyStroke menuAccelerator, int categoryPriority, 
                int actionPriority, Object object) { return null; }

        protected Object _object() { return null; }

        public boolean actionCanBePerformedInContextOfController(EOController controller) { return true; }

        public void actionPerformed(ActionEvent event) {}

        private Object _object;

    }

    static class _FocusComponent extends EOAction {


        public _FocusComponent(String actionName, String descriptionPath, String shortDescription, Icon icon, Icon smallIcon, KeyStroke menuAccelerator, int categoryPriority, 
                int actionPriority, String enabledKeyOnFocusComponent) { return null; }

        public boolean actionCanBePerformedInContextOfController(EOController controller) { return true; }

        public void actionPerformed(ActionEvent event) {}

        private String _enabledKeyOnFocusComponent;

    }

    static class _Supercontrollers extends _ControllerHierarchy {

        public static Object _instanceWithXMLUnarchiver(EOXMLUnarchiver unarchiver) { return null; }

        public _Supercontrollers(String actionName, String descriptionPath, String shortDescription, Icon icon, Icon smallIcon, KeyStroke menuAccelerator, int categoryPriority, 
                int actionPriority, boolean sendsActionToAllControllers) { return null; }

        public _Supercontrollers(EOXMLUnarchiver unarchiver) { return null; }

        protected void _fillTargetControllersArray(EOController controller, NSMutableArray targetControllers) {}
    }

    static class _ControllerHierarchy extends EOAction
        implements EOXMLUnarchiver._SpecialInstance {


        public static Object _instanceWithXMLUnarchiver(EOXMLUnarchiver unarchiver) { return null; }

        public _ControllerHierarchy(String actionName, String descriptionPath, String shortDescription, Icon icon, Icon smallIcon, KeyStroke menuAccelerator, int categoryPriority, 
                int actionPriority, boolean sendsActionToAllControllers) { return null; }

        public _ControllerHierarchy(EOXMLUnarchiver unarchiver) { return null; }

        public NSMutableDictionary _xmlParameters() { return null; }

        public boolean sendsActionToAllControllers() { return true; }

        public boolean equals(Object comparisionObject) { return true; }

        protected void _fillTargetControllersArray(EOController controller, NSMutableArray targetControllers) {}

        protected NSArray _targetControllersInContextOfController(EOController controller) { return null; }

        public boolean actionCanBePerformedInContextOfController(EOController controller) { return true; }

        public void actionPerformed(ActionEvent event) {}

        protected boolean _sendsActionToAllControllers;

    }

    static interface _ActionEventSource {

        public abstract EOAction action();

        public abstract EOController controller();
    }

    public static interface ActiveWindowDependentAction {

        public abstract void updateInContextOfActiveWindowController(EOController eocontroller);
    }

    public static interface Enabling {

        public abstract boolean canPerformActionNamed(String s);
    }



    public static EOAction actionForControllerHierarchy(String actionName, String descriptionPath, String shortDescription, Icon icon, Icon smallIcon, KeyStroke menuAccelerator, int categoryPriority, int actionPriority, 
            boolean sendsActionToAllControllers) { return null; }

    public static EOAction actionForSupercontrollers(String actionName, String descriptionPath, String shortDescription, Icon icon, Icon smallIcon, KeyStroke menuAccelerator, int categoryPriority, int actionPriority, 
            boolean sendsActionToAllControllers) { return null; }

    public static EOAction actionForObject(String actionName, String descriptionPath, String shortDescription, Icon icon, Icon smallIcon, KeyStroke menuAccelerator, int categoryPriority, int actionPriority, 
            Object object) { return null; }

    public static EOAction actionForFocusComponent(String actionName, String descriptionPath, String shortDescription, Icon icon, Icon smallIcon, KeyStroke menuAccelerator, int categoryPriority, int actionPriority, 
            String enabledKeyOnFocusComponent) { return null; }

    public static EOAction _standardActionForControllerHierarchy(String actionName, String descriptionPathPrefix, String baseTitle, boolean appendDots, String iconBaseName, KeyStroke menuAccelerator, int categoryPriority, int actionPriority) { return null; }

    public static EOAction standardDocumentActionForControllerHierarchy(String actionName, String baseTitle, KeyStroke menuAccelerator, int actionPriority) { return null; }

    public static EOAction standardDocumentActionForControllerHierarchy(String actionName, KeyStroke menuAccelerator, int actionPriority) { return null; }

    public static EOAction standardEditActionForControllerHierarchy(String actionName, KeyStroke menuAccelerator, int actionPriority) { return null; }

    public static EOAction _standardWindowActionForControllerHierarchy(String actionName, KeyStroke menuAccelerator, int actionPriority) { return null; }

    public static EOAction standardActionForFocusComponent(String actionName, KeyStroke menuAccelerator, int actionPriority, String enabledKeyOnFocusComponent) { return null; }

    public static EOAction _standardDocumentActionForApplication(String actionName, String baseTitle, String iconBaseName, KeyStroke menuAccelerator, int actionPriority) { return null; }

    public static EOAction standardDocumentActionForApplication(String actionName, KeyStroke menuAccelerator, int actionPriority) { return null; }

    public static EOAction _standardWindowActionForWindowObserver(String actionName, String baseTitle, KeyStroke menuAccelerator, int actionPriority) { return null; }

    public static EOAction _standardDeveloperAction(String actionName, Object object) { return null; }

    public static void _clearAllSharedActions() { return null; }

    public static EOAction standardSaveActionForControllerHierarchy() { return null; }

    public static EOAction standardSaveAsActionForControllerHierarchy() { return null; }

    public static EOAction standardRevertActionForControllerHierarchy() { return null; }

    public static EOAction standardDeleteActionForControllerHierarchy() { return null; }

    public static EOAction standardInsertActionForControllerHierarchy() { return null; }

    public static EOAction standardOpenWithTaskActionForControllerHierarchy() { return null; }

    public static EOAction standardInsertWithTaskActionForControllerHierarchy() { return null; }

    public static EOAction standardRemoveActionForControllerHierarchy() { return null; }

    public static EOAction standardDeselectActionForControllerHierarchy() { return null; }

    public static EOAction standardAddActionForControllerHierarchy() { return null; }

    public static EOAction standardSelectActionForControllerHierarchy() { return null; }

    public static EOAction standardUndoActionForControllerHierarchy() { return null; }

    public static EOAction standardRedoActionForControllerHierarchy() { return null; }

    public static EOAction standardFindActionForControllerHierarchy() { return null; }

    public static EOAction standardAppendActionForControllerHierarchy() { return null; }

    public static EOAction standardClearActionForControllerHierarchy() { return null; }

    public static EOAction standardCloseWindowActionForControllerHierarchy() { return null; }

    public static EOAction standardCancelActionForControllerHierarchy() { return null; }

    public static EOAction standardOkActionForControllerHierarchy() { return null; }

    public static EOAction standardOkAndSaveActionForControllerHierarchy() { return null; }

    public static EOAction standardMinimizeActiveWindowActionForWindowObserver() { return null; }

    public static EOAction standardActivatePreviousWindowActionForWindowObserver() { return null; }

    public static EOAction standardBringAllWindowsToFrontActionForWindowObserver() { return null; }

    public static EOAction standardSaveAllActionForApplication() { return null; }

    public static EOAction standardRefreshActionForApplication() { return null; }

    public static EOAction standardQuitActionForApplication() { return null; }

    public static NSArray standardEditActionsForFocusComponent() { return null; }

    public static boolean _areActionsIdentical(NSArray actions1, NSArray actions2) { return null; }

    public static NSArray _mergedActions(NSArray actionArrays) { return null; }

    public static NSArray mergedActions(NSArray actions1, NSArray actions2) { return null; }

    public static NSArray sortedActions(NSArray actions) { return null; }

    public static KeyStroke keyStrokeWithString(String keyStrokeDescription) { return null; }

    public static KeyStroke keyStrokeWithKeyCodeAndModifiers(int keyCode, int modifiers) { return null; }

    public static KeyStroke keyStrokeWithKeyCode(int keyCode) { return null; }

    public static KeyStroke keyStrokeWithKeyCodeAndShiftModifier(int keyCode) { return null; }

    public EOAction(String actionName, String descriptionPath, String shortDescription, Icon icon, Icon smallIcon, KeyStroke menuAccelerator, int categoryPriority, 
            int actionPriority) { return null; }

    public NSMutableDictionary _xmlParameters() { return null; }

    public void setActionName(String actionName) {}

    public String actionName() { return null; }

    public void setDescriptionPath(String descriptionPath) {}

    public String descriptionPath() { return null; }

    public NSArray descriptionPathComponents() { return null; }

    public String actionTitle() { return null; }

    public void setShortDescription(String string) {}

    public String shortDescription() { return null; }

    public void setIcon(Icon icon) {}

    public Icon icon() { return null; }

    public Icon _disabledIcon() { return null; }

    public Icon _pressedIcon() { return null; }

    public void setSmallIcon(Icon icon) {}

    public Icon smallIcon() { return null; }

    public Icon _smallDisabledIcon() { return null; }

    public Icon _smallPressedIcon() { return null; }

    public void setMenuAccelerator(KeyStroke menuAccelerator) {}

    public KeyStroke menuAccelerator() { return null; }

    public void setCategoryPriority(int priority) {}

    public int categoryPriority() { return 0; }

    public void setActionPriority(int priority) {}

    public int actionPriority() { return 0; }

    public void setToolTip(String toolTip) {}

    public String toolTip() { return null; }

    public void addPropertyChangeListener(PropertyChangeListener listener) {}

    public void removePropertyChangeListener(PropertyChangeListener listener) {}

    protected void firePropertyChange(String propertyName, Object oldValue, Object newValue) {}

    public boolean equals(Object comparisionObject) { return true; }

    public boolean actionCanBePerformedInContextOfController(EOController controller) { return true; }

    public void actionPerformed(ActionEvent event) {}

    public String toString() { return null; }

    static  {}

    public static final Class _CLASS;
    public static final int DocumentCategoryPriority = 100;
    public static final int EditCategoryPriority = 110;
    public static final int ToolsCategoryPriority = 120;
    public static final int WindowCategoryPriority = 130;
    public static final int HelpCategoryPriority = 140;
    public static final int ObjectActionsCategoryPriority = 300;
    public static final int NavigationActionsCategoryPriority = 310;
    public static final int ModalActionsCategoryPriority = 500;
    public static final int UndoActionPriority = 100;
    public static final int RedoActionPriority = 110;
    public static final int PasteboardCutActionPriority = 300;
    public static final int PasteboardCopyActionPriority = 310;
    public static final int PasteboardPasteActionPriority = 320;
    public static final int PasteboardDeleteActionPriority = 330;
    public static final int PasteboardSelectAllActionPriority = 340;
    public static final int FindActionPriority = 500;
    public static final int AppendActionPriority = 510;
    public static final int ClearActionPriority = 520;
    public static final int InsertActionPriority = 100;
    public static final int OpenActionPriority = 110;
    public static final int ListActionPriority = 120;
    public static final int SearchActionPriority = 130;
    public static final int DeleteActionPriority = 140;
    public static final int SaveActionPriority = 300;
    public static final int SaveAsActionPriority = 310;
    public static final int SaveAllActionPriority = 320;
    public static final int RevertActionPriority = 330;
    public static final int RefreshActionPriority = 340;
    public static final int QuitActionPriority = 500;
    public static final int NewMultipleWindowActionPriority = 100;
    public static final int NewSingleWindowActionPriority = 300;
    public static final int CloseWindowActionPriority = 100;
    public static final int MinimizeActiveWindowActionPriority = 110;
    public static final int ActivatePreviousWindowActionPriority = 120;
    public static final int BringAllWindowsToFrontActionPriority = 300;
    public static final int HelpActionPriority = 100;
    public static final int InfoActionPriority = 110;
    public static final int ObjectActionPriority = 100;
    public static final int NavigationActionPriority = 100;
    public static final int CancelActionPriority = 110;
    public static final int OkayActionPriority = 120;
    public static final String DescriptionPathSeparator = "/";
    static final int _CategoryPrioritySeparatorIndicatorGap = 10;
    static final int _ActionPrioritySeparatorIndicatorGap = 100;
    static final int _CategoryPrincipalSeparationPriority = 200;
    protected static final int _LowPriority = 999;
    private static EOAction _standardSaveActionForControllerHierarchy;
    private static EOAction _standardSaveAsActionForControllerHierarchy;
    private static EOAction _standardRevertActionForControllerHierarchy;
    private static EOAction _standardRefreshActionForControllerHierarchy;
    private static EOAction _standardDeleteActionForControllerHierarchy;
    private static EOAction _standardInsertActionForControllerHierarchy;
    private static EOAction _standardOpenWithTaskActionForControllerHierarchy;
    private static EOAction _standardInsertWithTaskActionForControllerHierarchy;
    private static EOAction _standardRemoveActionForControllerHierarchy;
    private static EOAction _standardDeselectActionForControllerHierarchy;
    private static EOAction _standardAddActionForControllerHierarchy;
    private static EOAction _standardSelectActionForControllerHierarchy;
    private static EOAction _standardUndoActionForControllerHierarchy;
    private static EOAction _standardRedoActionForControllerHierarchy;
    private static EOAction _standardFindActionForControllerHierarchy;
    private static EOAction _standardAppendActionForControllerHierarchy;
    private static EOAction _standardClearActionForControllerHierarchy;
    private static EOAction _standardCloseWindowActionForControllerHierarchy;
    private static EOAction _standardCancelActionForControllerHierarchy;
    private static EOAction _standardOkActionForControllerHierarchy;
    private static EOAction _standardOkAndSaveActionForControllerHierarchy;
    private static EOAction _standardMinimizeActiveWindowActionForWindowObserver;
    private static EOAction _standardActivatePreviousWindowActionForWindowObserver;
    private static EOAction _standardBringAllWindowsToFrontActionForWindowObserver;
    private static EOAction _standardSaveAllActionForApplication;
    private static EOAction _standardQuitActionForApplication;
    private static NSMutableArray _standardEditActionsForFocusComponent;
    private String _actionName;
    private String _descriptionPath;
    private NSArray _descriptionPathComponents;
    private String _shortDescription;
    private Icon _icon;
    private Icon _smallIcon;
    private KeyStroke _menuAccelerator;
    private int _categoryPriority;
    private int _actionPriority;
    private String _toolTip;
    private NSMutableArray _propertyChangeListeners;


    // Unreferenced inner class com/webobjects/eoapplication/EOAction$1

/* anonymous class */
    static class _cls1 extends NSComparator {

        _cls1() { return null; }

        public int compare(Object object1, Object object2) throws com.webobjects.foundation.NSComparator.ComparisonException { return 0; }
    }

}

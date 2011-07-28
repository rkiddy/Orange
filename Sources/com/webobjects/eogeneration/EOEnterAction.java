
package com.webobjects.eogeneration;

import com.webobjects.eoapplication.*;
import com.webobjects.foundation.NSMutableDictionary;
import com.webobjects.foundation._NSUtilities;
import java.awt.event.ActionEvent;
import javax.swing.Icon;
import javax.swing.KeyStroke;


public abstract class EOEnterAction extends EOAction {
    public static class _ActivateHelpWindow extends _ActivateWindow {

        public _ActivateHelpWindow(String descriptionPath, String shortDescription, Icon icon, Icon smallIcon, KeyStroke menuAccelerator, int categoryPriority, int actionPriority, 
                String taskName) { return null; }

        public _ActivateHelpWindow(String shortDescription, KeyStroke menuAccelerator, boolean multipleWindowsAvailable, String taskName) { return null; }

        public _ActivateHelpWindow(EOXMLUnarchiver unarchiver) { return null; }
    }

    public static class _ActivateToolWindow extends _ActivateWindow {

        public _ActivateToolWindow(String descriptionPath, String shortDescription, Icon icon, Icon smallIcon, KeyStroke menuAccelerator, int categoryPriority, int actionPriority, 
                String taskName) { return null; }

        public _ActivateToolWindow(String shortDescription, KeyStroke menuAccelerator, boolean multipleWindowsAvailable, String taskName) { return null; }

        public _ActivateToolWindow(EOXMLUnarchiver unarchiver) { return null; }
    }

    public static class _ActivateWindow extends EOEnterAction {

        public _ActivateWindow(String descriptionPath, String shortDescription, Icon icon, Icon smallIcon, KeyStroke menuAccelerator, int categoryPriority, int actionPriority, 
                String taskName) { return null; }

        public _ActivateWindow(EOXMLUnarchiver unarchiver) { return null; }

        public NSMutableDictionary _xmlParameters() { return null; }

        protected boolean canPerformAction(String name) { return true; }

        protected void performAction(String name) {}
    }

    public static class _List extends _Entity {

        public _List(String descriptionPath, String shortDescription, Icon icon, Icon smallIcon, KeyStroke preferredMenuAccelerator, int categoryPriority, int actionPriority, 
                String entityName) { return null; }

        public _List(String entityName) { return null; }

        public _List(EOXMLUnarchiver unarchiver) { return null; }

        protected boolean canPerformAction(String name) { return true; }

        protected void performAction(String name) {}
    }

    public static class _Insert extends _Entity {

        public _Insert(String descriptionPath, String shortDescription, Icon icon, Icon smallIcon, KeyStroke preferredMenuAccelerator, int categoryPriority, int actionPriority, 
                String entityName) { return null; }

        public _Insert(String entityName) { return null; }

        public _Insert(EOXMLUnarchiver unarchiver) { return null; }

        protected boolean canPerformAction(String name) { return true; }

        protected void performAction(String name) {}
    }

    public static class _Open extends _Entity {

        public _Open(String descriptionPath, String shortDescription, Icon icon, Icon smallIcon, KeyStroke preferredMenuAccelerator, int categoryPriority, int actionPriority, 
                String entityName) { return null; }

        public _Open(String entityName) { return null; }

        public _Open(EOXMLUnarchiver unarchiver) { return null; }

        protected boolean canPerformAction(String name) { return true; }

        protected void performAction(String name) {}
    }

    public static class _Query extends _Entity {

        public _Query(String descriptionPath, String shortDescription, Icon icon, Icon smallIcon, KeyStroke preferredMenuAccelerator, int categoryPriority, int actionPriority, 
                String entityName) { return null; }

        public _Query(String entityName) { return null; }

        public _Query(EOXMLUnarchiver unarchiver) { return null; }

        protected boolean canPerformAction(String name) { return true; }

        protected void performAction(String name) {}
    }

    static abstract class _Entity extends EOEnterAction
        implements com.webobjects.eoapplication.EOAction.ActiveWindowDependentAction {


        public _Entity(String descriptionPath, String shortDescription, Icon icon, Icon smallIcon, KeyStroke preferredMenuAccelerator, int categoryPriority, int actionPriority, 
                String entityName) { return null; }

        public NSMutableDictionary _xmlParameters() { return null; }

        public void updateInContextOfActiveWindowController(EOController controller) {}

        private KeyStroke _preferredMenuAccelerator;

    }



    public static EOAction standardActionForQueryWithEntityName(String entityName) { return null; }

    public static EOAction standardActionForOpenWithEntityName(String entityName) { return null; }

    public static EOAction standardActionForInsertWithEntityName(String entityName) { return null; }

    public static EOAction standardActionForListWithEntityName(String entityName) { return null; }

    public static EOAction standardActionForWindowActivation(String descriptionPath, String shortDescription, KeyStroke menuAccelerator, int categoryPriority, int actionPriority, String taskName) { return null; }

    public static EOAction standardActionForToolWindowActivation(KeyStroke menuAccelerator, boolean multipleWindowsAvailable, String taskName) { return null; }

    public static EOAction standardActionForHelpWindowActivation(KeyStroke menuAccelerator, boolean multipleWindowsAvailable, String taskName) { return null; }

    public EOEnterAction(String descriptionPath, String shortDescription, Icon icon, Icon smallIcon, KeyStroke menuAccelerator, int categoryPriority, int actionPriority, 
            String name) { return null; }

    protected String _name() { return null; }

    protected abstract boolean canPerformAction(String s);

    protected abstract void performAction(String s);

    public void actionPerformed(ActionEvent event) {}

    static  {}

    public static final Class _CLASS;
    protected String _name;

}

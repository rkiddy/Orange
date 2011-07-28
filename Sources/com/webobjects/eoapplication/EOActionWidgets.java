
package com.webobjects.eoapplication;

import com.webobjects.eointerface.swing.EOViewLayout;
import com.webobjects.foundation.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.beans.PropertyChangeEvent;
import java.beans.PropertyChangeListener;
import javax.swing.*;
import javax.swing.border.Border;


public class EOActionWidgets {
    static class _ActionMenuComboBoxModel extends AbstractListModel
        implements ComboBoxModel, NSDisposable {


        public _ActionMenuComboBoxModel(String menuTitle, boolean ignoresStateChange) { return null; }

        public void dispose() {}

        public int getSize() { return 0; }

        public Object getElementAt(int index) { return null; }

        public Object getSelectedItem() { return null; }

        public void setSelectedItem(Object item) {}

        public void addItem(_MenuItem item) {}

        public NSArray items() { return null; }

        public void setIgnoresStateChange(boolean ignoresStateChange) {}

        private String _menuTitle;
        private NSMutableArray _items;
        private boolean _ignoresStateChange;

    }

    static class _Button extends JButton
        implements PropertyChangeListener, NSDisposable, EOAction._ActionEventSource {


        public _Button(EOAction action, EOController controller, boolean usesLargeRepresentation) { return null; }

        public void dispose() {}

        public void propertyChange(PropertyChangeEvent e) {}

        public EOAction action() { return null; }

        public EOController controller() { return null; }

        public void updateEnabling() {}

        private EOController _controller;
        private EOAction _action;
        private boolean _usesLargeRepresentation;

    }

    static class _MenuItem extends JMenuItem
        implements PropertyChangeListener, NSDisposable, EOAction._ActionEventSource {


        public _MenuItem(EOAction action, EOController controller) { return null; }

        public void dispose() {}

        public void propertyChange(PropertyChangeEvent e) {}

        public EOAction action() { return null; }

        public EOController controller() { return null; }

        public void updateEnabling() {}

        private EOController _controller;
        private EOAction _action;

    }



    public EOActionWidgets() { return null; }

    public static JMenu _menuWithTitleInMenuBar(JMenuBar menuBar, String title) { return null; }

    private static JMenu _addActionComponentsToMenuBar(EOController controller, EOAction action, NSArray components, JMenuBar menuBar, NSMutableArray menusTouched) { return null; }

    public static JMenuBar menuBarWithActions(NSArray actions, EOController controller, boolean sort) { return null; }

    private static void _disposeMenuItemsOfMenuElement(Component menuElement) { return null; }

    public static void disposeMenuBar(JMenuBar menuBar) { return null; }

    private static void _updateEnablingOfMenuItemsOfMenuElement(Component menuElement) { return null; }

    public static void updateEnablingOfMenuBar(JMenuBar menuBar) { return null; }

    public static JComponent buttonRowWithActions(NSArray actions, EOController controller, boolean sort, boolean horizontalLayout, boolean usesLargeRepresentation) { return null; }

    public static void disposeButtonRow(JComponent buttonRow) { return null; }

    public static void updateEnablingOfButtonRow(JComponent buttonRow) { return null; }

    public static JButton buttonWithAction(EOAction action, EOController controller, boolean usesLargeRepresentation) { return null; }

    public static void disposeButton(JButton button) { return null; }

    public static void updateEnablingOfButton(JButton button) { return null; }

    public static JComboBox actionMenuWithActions(NSArray actions, EOController controller, boolean sort, String menuTitle) { return null; }

    public static void disposeActionMenu(JComboBox actionMenu) { return null; }

    public static void updateEnablingOfActionMenu(JComboBox actionMenu) { return null; }

    static  {}

    public static final Class _CLASS;

}


package com.webobjects.eogeneration.assistant;

import com.webobjects.eoapplication._EOWidgetUtilities;
import com.webobjects.eogeneration.EOWidgetController;
import com.webobjects.eointerface.swing.EOSwingUtilities;
import com.webobjects.foundation.*;
import javax.swing.*;

public class _EOEditorStringSelector extends EOWidgetController {
    private class _Model extends AbstractListModel
        implements ComboBoxModel {


        public _Model() { return null; }

        public int getSize() { return 0; }

        public Object getElementAt(int index) { return null; }

        public Object getSelectedItem() { return null; }

        public void setSelectedItem(Object item) {}

    }

    public static interface ChangeListener {


        public abstract void stringSelectionChanged(_EOEditorStringSelector _peoeditorstringselector, String s);



        public static final Class _CLASS = null;

    }



    public _EOEditorStringSelector(boolean keepStringsSorted, String label) { return null; }

    public void dispose() {}

    protected void connectionWasEstablished() {}

    protected JComponent newWidget() { return null; }

    public void setSelectionEnabled(boolean flag) {}

    public boolean isSelectionEnabled() { return true; }

    public void _update(String selection) {}

    public void setStringsWithSelection(NSArray strings, String selection) {}

    public void setStrings(NSArray strings) {}

    public NSArray strings() { return null; }

    protected void _setSelectedString(String string) {}

    public String selectedString() { return null; }

    public void tryToUpdateSelectionToString(String string) {}

    static  {}

    public static final Class _CLASS = null;
    private NSMutableArray _strings;
    private boolean _keepStringsSorted;
    private String _selectedString;
    private boolean _selectionEnabled;
    private boolean _ignoreSelectionChange;

}

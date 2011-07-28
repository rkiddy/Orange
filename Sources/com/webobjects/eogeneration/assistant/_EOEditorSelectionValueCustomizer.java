
package com.webobjects.eogeneration.assistant;

import com.webobjects.eoapplication.EOUserInterfaceParameters;
import com.webobjects.eoapplication._EOWidgetUtilities;
import com.webobjects.eointerface.swing.EOSwingUtilities;
import com.webobjects.eointerface.swing.EOViewLayout;
import com.webobjects.foundation.*;
import java.awt.Dimension;
import javax.swing.*;


public class _EOEditorSelectionValueCustomizer extends _EOEditorValueCustomizer {
    private class _Model extends AbstractListModel
        implements ComboBoxModel {


        public _Model() { return null; }

        public int getSize() { return 0; }

        public Object getElementAt(int index) { return null; }

        public Object getSelectedItem() { return null; }

        public void setSelectedItem(Object item) {}

        private Object _tweak(Object selectedValue) { return null; }

    }



    public _EOEditorSelectionValueCustomizer(String valueKey, String label, String explicitDefaultValue, NSArray explicitSelectionValues) { return null; }

    public _EOEditorSelectionValueCustomizer(String valueKey, String label, String explicitDefaultValue, NSArray explicitSelectionValues, _EOEditorValueCustomizer.DefaultValue defaultValueProvider) { return null; }

    protected JComponent newWidget() { return null; }

    protected void startListeningToWidget() {}

    protected void stopListeningToWidget() {}

    protected String _ruleValue() { return null; }

    public void refresh() {}

    protected void _applyEnabled(boolean flag) {}

    public NSArray selectionValues() { return null; }

    public void _setValue(String selectedValue) {}

    public void resetValueKey(String valueKey, NSArray explicitSelectionValues) {}

    static  {}

    public static final Class _CLASS;
    private NSArray _selectionValues;
    private boolean _ignoreSelectionChange;
    private JComboBox _comboBox;

}


package com.webobjects.eointerface.swing;

import com.webobjects.eointerface.EOValueSelectionAssociation;
import com.webobjects.eointerface.EOWidgetAssociation;
import com.webobjects.foundation._NSUtilities;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.text.Format;
import javax.swing.*;


public class EOSwingComboBoxPlugin extends com.webobjects.eointerface.EOValueSelectionAssociation.ValueSelectionPlugin
    implements ActionListener, com.webobjects.eointerface.EOWidgetAssociation.WidgetPlugin.Formatting {
    private class _ComboBoxModel extends AbstractListModel
        implements ComboBoxModel {


        public _ComboBoxModel() { return null; }

        public Object getElementAt(int index) { return null; }

        public Object getSelectedItem() { return null; }

        public int getSize() { return 0; }

        public void setSelectedItem(Object item) {}

        boolean _isSettingValue() { return null; }

        private int _itemIndexWhileSettingValue;
        final EOSwingComboBoxPlugin this$0;

    }



    public EOSwingComboBoxPlugin(EOWidgetAssociation association, Object widget) { return null; }

    public void establishConnection() {}

    public void breakConnection() {}

    public String[] widgetKeysTaken() { return null; }

    public void setTitlesFromObjects(Object objects[]) {}

    public String[] titles() { return null; }

    public void setSelectionIndex(int selectionIndex, boolean isEnabled) {}

    public int selectionIndex() { return 0; }

    public void setValueFormatter(Object formatter) {}

    public Object valueFormatter() { return null; }

    public void actionPerformed(ActionEvent event) {}

    static Object[] access$000(EOSwingComboBoxPlugin x0) { return null; }

    static int access$100(EOSwingComboBoxPlugin x0) { return 0; }

    static  {}

    public static final Class _CLASS;
    private static DefaultComboBoxModel _DefaultComboBoxModel;
    private Format _format;
    private Object _titleValues[];
    private String _titles[];
    private int _selectionIndex;
    private boolean _ignoreChanges;
    private _ComboBoxModel _model;


    static Object[] access$000(EOSwingComboBoxPlugin x0) { return null; }

    static int access$100(EOSwingComboBoxPlugin x0) { return 0; }
}

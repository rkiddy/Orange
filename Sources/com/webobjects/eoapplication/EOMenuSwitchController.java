
package com.webobjects.eoapplication;

import com.webobjects.eointerface.swing.EOSwingUtilities;
import com.webobjects.eointerface.swing.EOViewLayout;
import com.webobjects.foundation.NSArray;
import com.webobjects.foundation._NSUtilities;
import java.awt.Dimension;
import java.awt.Point;
import javax.swing.*;


public class EOMenuSwitchController extends EOSwitchController {
    private class _SwitchComboBoxModel extends AbstractListModel
        implements ComboBoxModel {


        public _SwitchComboBoxModel(boolean ignoresStateChange) { return null; }

        public int getSize() { return 0; }

        public Object getElementAt(int index) { return null; }

        public Object getSelectedItem() { return null; }

        public void setSelectedItem(Object item) {}

        public void setIgnoresStateChange(boolean ignoresStateChange) {}

        private boolean _ignoresStateChange;
        final EOMenuSwitchController this$0;

    }



    public EOMenuSwitchController() { return null; }

    public EOMenuSwitchController(EOXMLUnarchiver unarchiver) { return null; }

    public void dispose() {}

    protected JComponent newDisplayComponent() { return null; }

    private int _comboBoxHeight() { return 0; }

    protected Dimension displayComponentBorderSize() { return null; }

    protected JComponent selectedBorderComponentInDisplayComponent(JComponent displayComponent) { return null; }

    protected void addBorderComponentForControllerToDisplayComponent(EOComponentController controller, JComponent borderComponent, JComponent displayComponent) {}

    protected void removeBorderComponentForControllerFromDisplayComponent(EOComponentController controller, JComponent borderComponent, JComponent displayComponent, int index) {}

    protected void showBorderComponentAtIndexInDisplayComponent(JComponent borderComponent, JComponent displayComponent, int index) {}

    static int access$000(EOMenuSwitchController x0) { return 0; }

    static  {}

    public static final Class _CLASS;
    private JComboBox _comboBox;
    private int _comboBoxHeight;
    private int _visibleBorderComponentIndex;


    static int access$000(EOMenuSwitchController x0) { return 0; }
}

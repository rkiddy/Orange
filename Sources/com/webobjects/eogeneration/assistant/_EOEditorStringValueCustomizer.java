
package com.webobjects.eogeneration.assistant;

import com.webobjects.eoapplication.EOUserInterfaceParameters;
import com.webobjects.eoapplication._EOWidgetUtilities;
import com.webobjects.eointerface.swing.EOSwingUtilities;
import com.webobjects.eointerface.swing.EOViewLayout;
import com.webobjects.foundation._NSUtilities;
import java.awt.Dimension;
import java.awt.event.FocusEvent;
import java.awt.event.FocusListener;
import javax.swing.*;


public class _EOEditorStringValueCustomizer extends _EOEditorValueCustomizer
    implements FocusListener {


    public _EOEditorStringValueCustomizer(String valueKey, String label, String explicitDefaultValue) { return null; }

    public _EOEditorStringValueCustomizer(String valueKey, String label, String explicitDefaultValue, _EOEditorValueCustomizer.DefaultValue defaultValueProvider) { return null; }

    protected JComponent newWidget() { return null; }

    protected void startListeningToWidget() {}

    protected void stopListeningToWidget() {}

    public void refresh() {}

    protected void _applyEnabled(boolean flag) {}

    public void focusGained(FocusEvent focusevent) {}

    public void focusLost(FocusEvent event) {}

    static  {}

    public static final Class _CLASS;
    private JTextField _textField;

}

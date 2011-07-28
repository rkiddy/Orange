
package com.webobjects.eogeneration.assistant;

import com.webobjects.eoapplication.EOUserInterfaceParameters;
import com.webobjects.eogeneration.EOWidgetController;
import com.webobjects.eointerface.swing.EOSwingUtilities;
import com.webobjects.foundation.*;
import java.awt.Insets;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;


public abstract class _EOEditorValueCustomizer extends EOWidgetController
    implements ActionListener, EOWidgetParametersEditor.ValueCustomizer, EOWindowParametersEditor.ValueCustomizer {
    public static interface DefaultValue {


        public abstract String defaultValueForValueKeyAndSpecification(String s, NSDictionary nsdictionary);



        public static final Class _CLASS = null;

    }



    public _EOEditorValueCustomizer(String valueKey, String label, String explicitDefaultValue, DefaultValue defaultValueProvider) { return null; }

    protected JButton _defaultButton() { return null; }

    protected void startListeningToWidget() {}

    protected void stopListeningToWidget() {}

    protected void _updateUserInterface() {}

    protected boolean _needsUserInterfaceUpdateNotifications() { return true; }

    protected void _setValueKey(String valueKey) {}

    protected String _valueKey() { return null; }

    protected String _ruleValue() { return null; }

    public void refresh() {}

    public void setSpecialParameter(String value, String key) {}

    public void refreshWithTaskEntityPropertyKeyParameters(String taskName, String entityName, String propertyKey, boolean useTaskNameIndependentAlternateSpecification) {}

    public void refreshWithEntityTaskQuestionParameters(String entityName, String taskName, String question, boolean useEntityNameIndependentAlternateSpecification) {}

    public void _setValue(String selectedValue) {}

    public String _value() { return null; }

    protected abstract void _applyEnabled(boolean flag);

    public void setEnabled(boolean flag) {}

    public boolean isEnabled() { return true; }

    public void actionPerformed(ActionEvent event) {}

    static  {}

    public static final Class _CLASS = null;
    private String _valueKey;
    private String _explicitDefaultValue;
    private NSMutableDictionary _specification;
    private NSMutableDictionary _alternateSpecification;
    private boolean _canResetToDefault;
    private DefaultValue _defaultValueProvider;
    private boolean _enabled;
    private String _value;
    private JButton _defaultButton;

}

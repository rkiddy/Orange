
package com.webobjects.appserver;

import com.webobjects.appserver._private.WOBindingNameAssociation;
import com.webobjects.appserver._private.WOConstantValueAssociation;
import com.webobjects.appserver._private.WOKeyValueAssociation;
import com.webobjects.appserver._private.WOReadOnlyKeyValueAssociation;
import com.webobjects.eocontrol.EOEventCenter;
import com.webobjects.foundation.*;


public abstract class WOAssociation
    implements Cloneable {
    public static class _EventLoggingEnabler
        implements com.webobjects.eocontrol.EOEventCenter.EventRecordingHandler {

        public _EventLoggingEnabler() { return null; }

        public void setLoggingEnabled(boolean isLogging, Class aClass) {}
    }

    public static class Event extends WOEvent {


        public Event() { return null; }

        public String displayComponentName() { return null; }

        public String bindingName() { return null; }

        public void setBindingNameWithComponent(WOComponent component, WOAssociation assoc) {}

        public String declarationName() { return null; }

        public boolean isPush() { return true; }

        public String keyPath() { return null; }

        public void setKeyPath(String aKeyPath) {}

        public String comment() { return null; }

        static  {}

        private static final long serialVersionUID = 0x5df869a0L;
        private String _keyPath;
        private String _defaultBindingName;
        static String desc;

    }



    protected WOAssociation() { return null; }

    public Object valueInComponent(WOComponent aComponent) { return null; }

    public boolean booleanValueInComponent(WOComponent aComponent) { return true; }

    public void setValue(Object obj, WOComponent wocomponent) {}

    public void _setValueNoValidation(Object aValue, WOComponent aComponent) {}

    public boolean isValueSettable() { return true; }

    public boolean isValueConstant() { return true; }

    public boolean isValueSettableInComponent(WOComponent aComponent) { return true; }

    public boolean isValueConstantInComponent(WOComponent aComponent) { return true; }

    public void setDebugEnabledForBinding(String aBindingName, String aDeclarationName, String aDeclarationType) {}

    protected String _debugDescription() { return null; }

    protected void _logPullValue(Object aValue, WOComponent aComponent) {}

    protected void _logPushValue(Object aValue, WOComponent aComponent) {}

    public abstract String keyPath();

    public abstract String bindingInComponent(WOComponent wocomponent);

    public static WOAssociation associationWithValue(Object aValue) { return null; }

    private static boolean _keyPathIsReadOnly(String aKeyPath) { return null; }

    private static Class _associationClassForKeyPath(String aKeyPath) { return null; }

    public static WOAssociation associationWithKeyPath(String aKeyPath) { return null; }

    public boolean _isImplementedForComponent(WOComponent aComponent) { return true; }

    protected boolean _hasBindingInParent(WOComponent theParent) { return true; }

    public void _setDebuggingEnabled(boolean aFlag) {}

    public String _bindingName() { return null; }

    public String _declarationName() { return null; }

    public String _declarationType() { return null; }

    protected Event _markStartOfEventIfNeeded(String eventName, String aKeyPath, WOComponent aComponent) { return null; }

    public String toString() { return null; }

    static  {}

    protected boolean _debugEnabled;
    private String _bindingName;
    private String _declarationName;
    private String _declarationType;
    protected static char _BINDING_KEYPATH_PREFIX;
    protected static boolean _IsEventLoggingEnabled;
    public static final String ValueForKeyPathEvent = "valueForKeyPath";
    public static final String TakeValueForKeyPathEvent = "takeValueForKeyPath";
    private static Class parameterTypes[];

}

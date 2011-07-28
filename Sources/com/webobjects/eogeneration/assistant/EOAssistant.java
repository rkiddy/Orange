
package com.webobjects.eogeneration.assistant;

import com.webobjects.eoapplication.*;
import com.webobjects.eogeneration.EOControllerFactory;
import com.webobjects.foundation.*;


public class EOAssistant extends EOComponentController
    implements com.webobjects.eoapplication.EOApplication._QuitHandler {
    public static interface _RuleProvider {


        public abstract void revertRules();

        public abstract void saveRuleDescriptions(NSArray nsarray);

        public abstract void applyRuleDescriptions(NSArray nsarray);

        public abstract NSArray ruleDescriptions();

        public abstract Object defaultValue(String s, NSDictionary nsdictionary);

        public abstract NSArray allEntityNames();

        public abstract NSArray allPossibleValuesForKey(String s);



        public static final Class _CLASS = null;

    }

    public static interface Editor {


        public abstract int priority();

        public abstract void refresh();



        public static final Class _CLASS = null;

    }



    public static void startAssistant(NSArray assistantEditorClassNames) { return null; }

    public static EOAssistant sharedAssistant() { return null; }

    public static void _useRuleProviderIfNotSpecified(_RuleProvider ruleProvider) { return null; }

    public static void _setRuleProvider(_RuleProvider ruleProvider) { return null; }

    public static _RuleProvider _ruleProvider() { return null; }

    private static EOAction _standardApplyActionForControllerHierarchy() { return null; }

    private static EOAction _standardRestartActionForControllerHierarchy() { return null; }

    private EOAssistant() { return null; }

    public void dispose() {}

    protected void _updateUserInterface() {}

    protected boolean _needsUserInterfaceUpdateNotifications() { return true; }

    public void addEditor(Editor editor) {}

    public NSArray editors() { return null; }

    public void setEditorSpecificationValueForKey(String value, String key) {}

    public String editorSpecificationValueForKey(String key) { return null; }

    protected NSArray defaultActions() { return null; }

    public boolean canPerformActionNamed(String actionName) { return true; }

    private void _invalidateAllCachesAndData() {}

    private boolean _apply(boolean save) { return true; }

    public boolean apply() { return true; }

    public boolean save() { return true; }

    private void _revert() {}

    public void revert() {}

    public void restart() {}

    public boolean _canApplicationQuit() { return true; }

    private void _refresh() {}

    private void _ensureRulesLoaded() {}

    public NSArray rules() { return null; }

    private NSDictionary _uniqueIdentifierRuleMapTable() { return null; }

    private NSArray _ruleCandidates(String key, NSDictionary specification) { return null; }

    protected void addRule(EOAssistantRule rule) {}

    protected void removeRule(EOAssistantRule rule) {}

    public void _mergeStrings(NSMutableArray strings, NSArray mergeStrings) {}

    public void _filterOutStrings(NSMutableArray strings, NSArray filterOutStrings) {}

    public String _uniqueIdentifierForKeyAndSpecification(String key, NSDictionary specification) { return null; }

    public Object _defaultValue(String key, NSDictionary specification, String identifierForKeyAndSpecification) { return null; }

    public Object defaultValue(String key, NSDictionary specification) { return null; }

    public boolean hasRuleValueOtherThanDefault(String key, NSDictionary specification) { return true; }

    public Object _bestMatchingRuleValue(String key, NSDictionary specification, String uniqueKeyAndSpecificationIdentifier) { return null; }

    public Object ruleValue(String key, NSDictionary specification) { return null; }

    public Object ruleValue(String key, NSDictionary specification, NSDictionary alternateSpecification) { return null; }

    private void _markSavedAndApplied() {}

    private void _markEdited() {}

    public void setRuleValue(String key, NSDictionary specification, Object value) {}

    public void resetRuleValueToDefault(String key, NSDictionary specification) {}

    public NSArray allQuestionNames() { return null; }

    public NSArray allEntityNames() { return null; }

    public NSArray allPropertyKeyTaskNames() { return null; }

    public NSArray allPrimitivePropertyKeyTaskNames() { return null; }

    public NSArray _allQuestionTaskNames(String question, boolean entityTaskName) { return null; }

    public NSArray allValuesForValueKey(String key) { return null; }

    public NSArray allValuesForKey(String key) { return null; }

    private void _revertAllRules() {}

    private void _sendAllRules(NSArray rules, boolean save) {}

    private void _requestAllRules() {}

    private Object _requestDefaultValue(String key, NSDictionary specification) { return null; }

    private NSArray _requestAllEntityNames() { return null; }

    private NSArray _requestAllPossibleValuesForKey(String key) { return null; }

    private boolean _updateEditorSelectionValue(String value, String key) { return true; }

    public void activeWindowDidChange(NSNotification notification) {}

    public String toString() { return null; }

    static  {}

    public static final Class _CLASS = null;
    public static final String MainEntityNamesKey = "mainEntityNames";
    public static final String EnumerationEntityNamesKey = "enumerationEntityNames";
    public static final String KeysKey = "keys";
    public static final String PropertyKeyKey = "propertyKey";
    public static final String ControllerTypeKey = "controllerType";
    public static final String WidgetControllerKey = "widgetController";
    public static final String IsRootControllerKey = "isRootController";
    private static final NSSelector _activeWindowDidChangeSelector;
    static final String _AllIdentifier = "<ALL>";
    static final String _DefaultIdentifier = "<DEFAULT>";
    static final int _DefaultTableWidth = 160;
    static final int _DefaultTableHeight = 240;
    private static EOSimpleWindowController _sharedInstanceRootController;
    private static EOAssistant _sharedInstance;
    private static _RuleProvider _ruleProvider;
    private static EOAction _standardApplyActionForControllerHierarchy;
    private static EOAction _standardRestartActionForControllerHierarchy;
    private static final Object _noValuePlaceholder;
    private EOSwitchController _switchController;
    private boolean _rulesLoaded;
    private NSMutableArray _rules;
    private NSMutableDictionary _uniqueIdentifierRuleMapTable;
    private NSMutableDictionary _keyRulesMapTable;
    private NSMutableDictionary _defaultValuesMapTable;
    private NSMutableDictionary _allValuesMapTable;
    private NSArray _allEntityNames;
    private boolean _hasUnsavedChanges;
    private boolean _hasUnappliedChanges;
    private NSMutableDictionary _editorSpecificationValues;


    // Unreferenced inner class com/webobjects/eogeneration/assistant/EOAssistant$1

/* anonymous class */
    static class _cls1 extends NSComparator {

        _cls1() { return null; }

        public int compare(Object object1, Object object2) throws com.webobjects.foundation.NSComparator.ComparisonException { return 0; }
    }

}


package com.webobjects.eointerface;

import com.webobjects.eocontrol.*;
import com.webobjects.foundation.*;
import java.util.Enumeration;


public class EODisplayGroup
    implements NSDisposable {
    public static interface Delegate {


        public abstract boolean displayGroupShouldRedisplay(EODisplayGroup eodisplaygroup, NSNotification nsnotification);

        public abstract boolean displayGroupShouldRefetch(EODisplayGroup eodisplaygroup, NSNotification nsnotification);

        public abstract boolean displayGroupShouldChangeSelection(EODisplayGroup eodisplaygroup, NSArray nsarray);

        public abstract void displayGroupDidChangeSelectedObjects(EODisplayGroup eodisplaygroup);

        public abstract void displayGroupDidChangeSelection(EODisplayGroup eodisplaygroup);

        public abstract boolean displayGroupShouldFetch(EODisplayGroup eodisplaygroup);

        public abstract void displayGroupDidFetchObjects(EODisplayGroup eodisplaygroup, NSArray nsarray);

        public abstract NSArray displayGroupDisplayArrayForObjects(EODisplayGroup eodisplaygroup, NSArray nsarray);

        public abstract void displayGroupDidSetValueForObject(EODisplayGroup eodisplaygroup, Object obj, Object obj1, String s);

        public abstract void displayGroupCreateObjectFailed(EODisplayGroup eodisplaygroup, EODataSource eodatasource);

        public abstract boolean displayGroupShouldInsertObject(EODisplayGroup eodisplaygroup, Object obj, int i);

        public abstract void displayGroupDidInsertObject(EODisplayGroup eodisplaygroup, Object obj);

        public abstract boolean displayGroupShouldDeleteObject(EODisplayGroup eodisplaygroup, Object obj);

        public abstract void displayGroupDidDeleteObject(EODisplayGroup eodisplaygroup, Object obj);

        public abstract void displayGroupDidChangeDataSource(EODisplayGroup eodisplaygroup);

        public abstract boolean displayGroupShouldDisplayAlert(EODisplayGroup eodisplaygroup, String s, String s1);



        public static final Class _CLASS = null;

    }



    public static void _suppressAlertPanels(boolean flag) { return null; }

    public static String globalDefaultStringMatchOperator() { return null; }

    public static void setGlobalDefaultStringMatchOperator(String op) { return null; }

    public static String globalDefaultStringMatchFormat() { return null; }

    public static void setGlobalDefaultStringMatchFormat(String format) { return null; }

    public static boolean globalDefaultForValidatesChangesImmediately() { return null; }

    public static void setGlobalDefaultForValidatesChangesImmediately(boolean yn) { return null; }

    private void _init() {}

    private void _setUpDataSource() {}

    private void _finishInitialization() {}

    public EODisplayGroup() { return null; }

    public void awakeFromNib() {}

    public void dispose() {}

    public boolean selectsFirstObjectAfterFetch() { return true; }

    public void setSelectsFirstObjectAfterFetch(boolean yn) {}

    public void setValidatesChangesImmediately(boolean yn) {}

    public boolean validatesChangesImmediately() { return true; }

    public void setFetchesOnLoad(boolean yn) {}

    public boolean fetchesOnLoad() { return true; }

    public void setUsesOptimisticRefresh(boolean yn) {}

    public boolean usesOptimisticRefresh() { return true; }

    public NSArray allObjects() { return null; }

    public NSArray displayedObjects() { return null; }

    public void setQualifier(EOQualifier qualifier) {}

    public EOQualifier qualifier() { return null; }

    public void setSortOrderings(NSArray keySortOrderArray) {}

    public NSArray sortOrderings() { return null; }

    public void updateDisplayedObjects() {}

    public void setObjectArray(NSArray array) {}

    public void setDataSource(EODataSource ds) {}

    public EODataSource dataSource() { return null; }

    public void setDelegate(Object anObject) {}

    public Object _mthdelegate() { return null; }

    public NSArray localKeys() { return null; }

    public void setLocalKeys(NSArray newKeySet) {}

    public void objectsChangedInEditingContext(NSNotification notification) {}

    public void objectsInvalidatedInEditingContext(NSNotification notification) {}

    public NSUndoManager undoManager() { return null; }

    private Object _notifyWith(String sel, Object arg) { return null; }

    private Object _notifyWithWith(String sel, Object arg1, Object arg2) { return null; }

    private void _notifyRowChanged(int index) {}

    private void _notifySelectionChanged() {}

    public void _beginObserverNotification(Object sender) {}

    public void _lastObserverNotified(Object sender) {}

    private int _selectionIndex() { return 0; }

    public NSArray selectionIndexes() { return null; }

    public NSArray selectedObjects() { return null; }

    public void setSelectedObjects(NSArray objects) {}

    public Object selectedObject() { return null; }

    public void setSelectedObject(Object anObject) {}

    public boolean endEditing() { return true; }

    public boolean setSelectionIndexes(NSArray s) { return true; }

    public boolean selectObject(Object object) { return true; }

    public boolean selectObjectsIdenticalTo(NSArray objectSelection) { return true; }

    public boolean selectObjectsIdenticalToSelectFirstOnNoMatch(NSArray objectSelection, boolean selectFirstOnNoMatch) { return true; }

    public boolean selectNext() { return true; }

    public boolean selectPrevious() { return true; }

    public boolean clearSelection() { return true; }

    public void redisplay() {}

    public boolean _deleteObject(Object anObject) { return true; }

    private boolean _deleteObjectsAtIndexes(NSArray indexes) { return true; }

    /**
     * @deprecated Method delete is deprecated
     */

    public void delete() {}

    public boolean deleteSelection() { return true; }

    public boolean deleteObjectAtIndex(int index) { return true; }

    public void setInsertedObjectDefaultValues(NSDictionary defaultValues) {}

    public NSDictionary insertedObjectDefaultValues() { return null; }

    public void _insertObjectAtIndex(Object args) {}

    public boolean insertObjectAtIndex(Object createObject, int newIndex) { return true; }

    public Object insertNewObjectAtIndex(int newIndex) { return null; }

    public boolean fetch() { return true; }

    private EOQualifier _qualifierForKeyValueOperator(String key, Object value, NSSelector op) { return null; }

    private void _addQualifiersToArrayForValuesOperator(NSMutableArray qualifiers, NSDictionary values, NSSelector op) {}

    public String defaultStringMatchOperator() { return null; }

    public void setDefaultStringMatchOperator(String op) {}

    public String defaultStringMatchFormat() { return null; }

    public void setDefaultStringMatchFormat(String format) {}

    public EOQualifier qualifierFromQueryValues() { return null; }

    public void qualifyDisplayGroup() {}

    public void qualifyDataSource() {}

    public void setInQueryMode(boolean yn) {}

    public boolean inQueryMode() { return true; }

    private void _presentLocalizedAlert(String unlocalizedTitle, String unlocalizedMessage) {}

    public void _updateQueryDictionaryWithValues(NSMutableDictionary queryDict, NSDictionary values) {}

    public NSDictionary greaterThanQueryValues() { return null; }

    public void setGreaterThanQueryValues(NSDictionary values) {}

    public NSDictionary lessThanQueryValues() { return null; }

    public void setLessThanQueryValues(NSDictionary values) {}

    public NSDictionary equalToQueryValues() { return null; }

    public void setEqualToQueryValues(NSDictionary values) {}

    public NSDictionary queryOperatorValues() { return null; }

    public void setQueryOperatorValues(NSDictionary values) {}

    public NSDictionary queryBindingValues() { return null; }

    public void setQueryBindingValues(NSDictionary values) {}

    public NSArray observingAssociations() { return null; }

    public EOAssociation editingAssociation() { return null; }

    public NSMutableDictionary _queryDictForKeyKeySuffix(String key, StringBuffer suffixP) { return null; }

    public void editingContextPresentErrorMessage(EOEditingContext editingContext, String message) {}

    public boolean editingContextShouldContinueFetching(EOEditingContext editingContext, int count, int limit, EOObjectStore objectStore) { return true; }

    public boolean editorHasChangesForEditingContext(EOEditingContext editingContext) { return true; }

    public void editingContextWillSaveChanges(EOEditingContext editingContext) {}

    private void _notifyEditingContextOfEditorStateChange() {}

    public void associationDidBeginEditing(EOAssociation association) {}

    public void associationDidEndEditing(EOAssociation association) {}

    public boolean _validationResponseForFailureSettingObjectValueKeyValidationException(Object eo, Object value, String key, Throwable exception) { return true; }

    public boolean setValueForObject(Object value, Object eo, String key) { return true; }

    public boolean setSelectedObjectValue(Object value, String key) { return true; }

    private boolean _manipulateRelationship(int index, String key, Object value, boolean trueForAddAndFalseForRemove) { return true; }

    public boolean _addObjectToBothSidesOfSelectedObjectRelationshipWithKey(Object value, String key) { return true; }

    public boolean _addObjectToBothSidesOfRelationshipWithKeyAtIndex(Object value, String key, int index) { return true; }

    public boolean _removeObjectFromBothSidesOfSelectedObjectRelationshipWithKey(Object value, String key) { return true; }

    public boolean _removeObjectFromBothSidesOfRelationshipWithKeyAtIndex(Object value, String key, int index) { return true; }

    public boolean setValueForObjectAtIndex(Object value, int index, String key) { return true; }

    public boolean enabledToSetSelectedObjectValueForKey(String key) { return true; }

    public boolean associationFailedToValidateValue(EOAssociation association, String value, String key, Object eo, String errorDescription) { return true; }

    public Object valueForObject(Object object, String key) { return null; }

    public Object selectedObjectValueForKey(String key) { return null; }

    public Object valueForObjectAtIndex(int index, String key) { return null; }

    public boolean selectionChanged() { return true; }

    public boolean contentsChanged() { return true; }

    public int updatedObjectIndex() { return 0; }

    public void insert() {}

    public void enterQueryMode() {}

    public void willChange() {}

    private boolean deleteSelection(Object sender) { return true; }

    private void enterQueryMode(Object sender) {}

    private boolean fetch(Object sender) { return true; }

    private void insert(Object sender) {}

    private void qualifyDataSource(Object sender) {}

    private void qualifyDisplayGroup(Object sender) {}

    private boolean selectNext(Object sender) { return true; }

    private boolean selectPrevious(Object sender) { return true; }

    static  {}

    public static final Class _CLASS = null;
    private static final NSSelector _setQualifierSelector;
    private static final NSSelector _setAuxiliaryQualifierSelector;
    private static final NSSelector _setQualifierBindingsSelector;
    private static final NSSelector _selectObjectsIdenticalToSelector;
    private static final NSSelector _insertObjectAtIndexSelector;
    private static final NSSelector _deleteObjectSelector;
    private static final NSSelector _objectsChangedInEditingContextSelector;
    private static final NSSelector _objectsInvalidatedInEditingContextSelector;
    private static final NSSelector _beginObserverNotificationSelector;
    private static final NSSelector _lastObserverNotifiedSelector;
    private static final String setQualifer = "setQualifier";
    private static final String setAuxiliaryQualifier = "setAuxiliaryQualifier";
    private static final String shouldRedisplay = "displayGroupShouldRedisplay";
    private static final String shouldRefetch = "displayGroupShouldRefetch";
    private static final String shouldChangeSelection = "displayGroupShouldChangeSelection";
    private static final String didChangeSelectedObjects = "displayGroupDidChangeSelectedObjects";
    private static final String didChangeSelection = "displayGroupDidChangeSelection";
    private static final String shouldFetch = "displayGroupShouldFetch";
    private static final String didFetch = "displayGroupDidFetchObjects";
    private static final String displayArray = "displayGroupDisplayArrayForObjects";
    private static final String didSetValue = "displayGroupDidSetValueForObject";
    private static final String createObjectFailed = "displayGroupCreateObjectFailed";
    private static final String shouldInsertObject = "displayGroupShouldInsertObject";
    private static final String didInsertObject = "displayGroupDidInsertObject";
    private static final String shouldDeleteObject = "displayGroupShouldDeleteObject";
    private static final String didDeleteObject = "displayGroupDidDeleteObject";
    private static final String didChangeDataSource = "displayGroupDidChangeDataSource";
    private static final String shouldDisplayAlert = "displayGroupShouldDisplayAlert";
    private static boolean _suppressAlertPanels;
    private EODataSource _dataSource;
    private NSMutableArray _allObjects;
    private NSMutableArray _displayedObjects;
    private _NSDelegate _delegate;
    private NSArray _selection;
    private NSArray _sortOrdering;
    private EOQualifier _qualifier;
    private NSArray _localKeys;
    private NSArray _selectedObjects;
    private EOObserverProxy _observerNotificationBeginProxy;
    private EOObserverProxy _observerNotificationEndProxy;
    private int _updatedObjectIndex;
    private NSDictionary _insertedObjectDefaultValues;
    private NSMutableArray _savedAllObjects;
    private _EOFlatMutableDictionary _queryMatch;
    private _EOFlatMutableDictionary _queryMin;
    private _EOFlatMutableDictionary _queryMax;
    private _EOMutableDefaultValueDictionary _queryOperator;
    private String _defaultStringMatchOperator;
    private char _defaultStringMatchFormat[];
    private int _DSMFindexOfObject;
    private NSMutableDictionary _queryBindings;
    private boolean _flags_selectsFirstObjectAfterFetch;
    private boolean _flags_didChangeContents;
    private boolean _flags_didChangeSelection;
    private boolean _flags_autoFetch;
    private boolean _flags_haveFetched;
    private boolean _flags_validateImmediately;
    private boolean _flags_queryMode;
    private boolean _flags_optimisticRefresh;
    private boolean _flags_fetchAll;
    private boolean _flags_initialized;
    private boolean _flags_editingContextNotificationsInitialized;
    private EOAssociation _editingAssociation;
    private static final int WODISPLAYGROUP_VERSION = 29;
    private static final String QUERYOPERATOR_DEFAULTSTRING = "";
    private static final char QUERYOPERATOR_WILDCARD = 42;
    private static final String QUERYMATCH_DEFAULTSTRING = "%@*";
    private static String _globalDefaultStringMatchFormat;
    private static String _globalDefaultStringMatchOperator;
    private static boolean _globalDefaultForValidatesChangesImmediately;
    public static final String DisplayGroupWillFetchNotification = "EODisplayGroupWillFetch";
    public static final String _DisplayGroupAssociationHasChangesNotification = "_EODisplayGroupAssociationHasChangesNotification";

}

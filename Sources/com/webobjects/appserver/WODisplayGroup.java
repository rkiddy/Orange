
package com.webobjects.appserver;

import com.webobjects.eocontrol.*;
import com.webobjects.foundation.*;
import java.io.*;
import java.lang.reflect.Array;
import java.util.Enumeration;

public class WODisplayGroup
    implements NSKeyValueCoding, com.webobjects.foundation.NSKeyValueCoding.ErrorHandling, NSDisposable, EOKeyValueArchiving, com.webobjects.eocontrol.EOKeyValueArchiving.Awaking, Serializable {
    public static interface Delegate {

        public abstract boolean displayGroupShouldRefetchForInvalidatedAllObjects(WODisplayGroup wodisplaygroup, NSNotification nsnotification);

        public abstract boolean displayGroupShouldChangeSelectionToIndexes(WODisplayGroup wodisplaygroup, NSArray nsarray);

        public abstract void displayGroupDidChangeSelectedObjects(WODisplayGroup wodisplaygroup);

        public abstract void displayGroupDidChangeSelection(WODisplayGroup wodisplaygroup);

        public abstract boolean displayGroupShouldFetch(WODisplayGroup wodisplaygroup);

        public abstract void displayGroupDidFetchObjects(WODisplayGroup wodisplaygroup, NSArray nsarray);

        public abstract NSArray displayGroupDisplayArrayForObjects(WODisplayGroup wodisplaygroup, NSArray nsarray);

        public abstract void displayGroupCreateObjectFailedForDataSource(WODisplayGroup wodisplaygroup, EODataSource eodatasource);

        public abstract boolean displayGroupShouldInsertObject(WODisplayGroup wodisplaygroup, Object obj, int i);

        public abstract void displayGroupDidInsertObject(WODisplayGroup wodisplaygroup, Object obj);

        public abstract boolean displayGroupShouldDeleteObject(WODisplayGroup wodisplaygroup, Object obj);

        public abstract void displayGroupDidDeleteObject(WODisplayGroup wodisplaygroup, Object obj);

        public abstract void displayGroupDidChangeDataSource(WODisplayGroup wodisplaygroup);

        /**
         * @deprecated Method displayGroupShouldDisplayAlert is deprecated
         */

        public abstract boolean displayGroupShouldDisplayAlert(WODisplayGroup wodisplaygroup, String s, String s1);
    }



    public static String globalDefaultStringMatchOperator() { return null; }

    public static void setGlobalDefaultStringMatchOperator(String op) { return null; }

    public static String globalDefaultStringMatchFormat() { return null; }

    public static void setGlobalDefaultStringMatchFormat(String format) { return null; }

    public static boolean globalDefaultForValidatesChangesImmediately() { return null; }

    public static void setGlobalDefaultForValidatesChangesImmediately(boolean yn) { return null; }

    private void _init(boolean forSerialization) {}

    private boolean _isCustomDataSourceClass(Class c) { return true; }

    private void _setUpForNewDataSource() {}

    protected void finishInitialization() {}

    public WODisplayGroup() { return null; }

    public void dispose() {}

    public Object initWithCoder(NSCoder coder) { return null; }

    private void writeObject(ObjectOutputStream out) throws IOException {}

    private void readObject(ObjectInputStream in) throws IOException, ClassNotFoundException {}

    public void encodeWithCoder(NSCoder coder) {}

    public boolean selectsFirstObjectAfterFetch() { return true; }

    public void setSelectsFirstObjectAfterFetch(boolean yn) {}

    public void setValidatesChangesImmediately(boolean yn) {}

    public boolean validatesChangesImmediately() { return true; }

    public void setFetchesOnLoad(boolean yn) {}

    public boolean fetchesOnLoad() { return true; }

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

    /**
     * @deprecated Method endEditing is deprecated
     */

    public boolean endEditing() { return true; }

    public boolean setSelectionIndexes(NSArray s) { return true; }

    public boolean selectObject(Object object) { return true; }

    public boolean selectObjectsIdenticalTo(NSArray objectSelection) { return true; }

    public boolean selectObjectsIdenticalToSelectFirstOnNoMatch(NSArray objectSelection, boolean selectFirstOnNoMatch) { return true; }

    public Object selectNext() { return null; }

    public Object selectPrevious() { return null; }

    public boolean clearSelection() { return true; }

    /**
     * @deprecated Method redisplay is deprecated
     */

    public void redisplay() {}

    public boolean _deleteObject(Object anObject) { return true; }

    private boolean _deleteObjectsAtIndexes(NSArray indexes) { return true; }

    public boolean deleteSelection() { return true; }

    public boolean deleteObjectAtIndex(int anIndex) { return true; }

    public void setInsertedObjectDefaultValues(NSDictionary defaultValues) {}

    public NSDictionary insertedObjectDefaultValues() { return null; }

    public void _insertObjectAtIndex(Object args) {}

    public void insertObjectAtIndex(Object createObject, int newIndex) {}

    public Object insertNewObjectAtIndex(int newIndex) { return null; }

    public Object fetch() { return null; }

    private EOQualifier _qualifierForKeyValueOperator(String key, Object value, NSSelector op) { return null; }

    private void _addQualifiersToArrayForValuesOperator(NSMutableArray qualifiers, NSDictionary values, NSSelector op) {}

    public String defaultStringMatchOperator() { return null; }

    public void setDefaultStringMatchOperator(String op) {}

    public String defaultStringMatchFormat() { return null; }

    public void setDefaultStringMatchFormat(String format) {}

    public EOQualifier qualifierFromQueryValues() { return null; }

    public void qualifyDisplayGroup() {}

    public void qualifyDataSource() {}

    /**
     * @deprecated Method setInQueryMode is deprecated
     */

    public void setInQueryMode(boolean yn) {}

    /**
     * @deprecated Method inQueryMode is deprecated
     */

    public boolean inQueryMode() { return true; }

    private void _presentAlertWithTitleMessage(String title, String message) {}

    public void encodeWithKeyValueArchiver(EOKeyValueArchiver archiver) {}

    public static Object decodeWithKeyValueUnarchiver(EOKeyValueUnarchiver unarchiver) { return null; }

    private WODisplayGroup(EOKeyValueUnarchiver unarchiver) { return null; }

    public void awakeFromKeyValueUnarchiver(EOKeyValueUnarchiver unarchiver) {}

    public NSArray relationalQualifierOperators() { return null; }

    public NSArray allQualifierOperators() { return null; }

    public NSArray stringQualifierOperators() { return null; }

    public void setNumberOfObjectsPerBatch(int count) {}

    public int numberOfObjectsPerBatch() { return 0; }

    public Object displayNextBatch() { return null; }

    public Object displayPreviousBatch() { return null; }

    public int batchCount() { return 0; }

    public boolean hasMultipleBatches() { return true; }

    public int currentBatchIndex() { return 0; }

    public void setCurrentBatchIndex(int batchIndex) {}

    public int indexOfFirstDisplayedObject() { return 0; }

    public int indexOfLastDisplayedObject() { return 0; }

    public Object displayBatchContainingSelectedObject() { return null; }

    public NSMutableDictionary queryMatch() { return null; }

    public NSMutableDictionary queryOperator() { return null; }

    public NSMutableDictionary queryMax() { return null; }

    public NSMutableDictionary queryMin() { return null; }

    public NSMutableDictionary queryBindings() { return null; }

    /**
     * @deprecated Method editingContextPresentErrorMessage is deprecated
     */

    public void editingContextPresentErrorMessage(EOEditingContext editingContext, String message) {}

    public Object insert() { return null; }

    public Object delete() { return null; }

    public String detailKey() { return null; }

    public void setDetailKey(String detailKey) {}

    public Object masterObject() { return null; }

    public void setMasterObject(Object masterObject) {}

    public boolean hasDetailDataSource() { return true; }

    public void willChange() {}

    public Object valueForKey(String key) { return null; }

    public void takeValueForKey(Object value, String key) {}

    public Object handleQueryWithUnboundKey(String key) { return null; }

    public void handleTakeValueForUnboundKey(Object value, String key) {}

    public void unableToSetNullForKey(String key) {}

    public String toString() { return null; }

    static  {}

    static final long serialVersionUID = 0x9cf28f81L;
    private static final NSSelector SetQualifier;
    private static final NSSelector SetAuxiliaryQualifier;
    private static final NSSelector SetQualifierBindings;
    private static NSSelector _selectObjects;
    private static NSSelector _insertObject;
    private static NSSelector _deleteObject;
    private static final String shouldRefetch = "displayGroupShouldRefetchForInvalidatedAllObjects";
    private static final String shouldChangeSelection = "displayGroupShouldChangeSelectionToIndexes";
    private static final String didChangeSelectedObjects = "displayGroupDidChangeSelectedObjects";
    private static final String didChangeSelection = "displayGroupDidChangeSelection";
    private static final String shouldFetch = "displayGroupShouldFetch";
    private static final String didFetch = "displayGroupDidFetchObjects";
    private static final String displayArray = "displayGroupDisplayArrayForObjects";
    private static final String createObjectFailed = "displayGroupCreateObjectFailedForDataSource";
    private static final String shouldInsertObject = "displayGroupShouldInsertObject";
    private static final String didInsertObject = "displayGroupDidInsertObject";
    private static final String shouldDeleteObject = "displayGroupShouldDeleteObject";
    private static final String didDeleteObject = "displayGroupDidDeleteObject";
    private static final String didChangeDataSource = "displayGroupDidChangeDataSource";
    private static final String DataSourceFieldKey = "dataSource";
    private static final String DelegateFieldKey = "delegate";
    private static final String SortOrderingFieldKey = "sortOrdering";
    private static final String QualifierFieldKey = "qualifier";
    private static final String FlagsFieldKey = "flags";
    private static final String NumberObjectsPerBatchFieldKey = "numObjectsPerBatch";
    private static final String BatchIndexFieldKey = "batchIndex";
    private static final String LocalKeysFieldKey = "localKeys";
    private static final String AllObjectsFieldKey = "allObjects";
    private static final String DisplayedObjectsFieldKey = "displayedObjects";
    private static final String SelectionFieldKey = "selection";
    private static final ObjectStreamField serialPersistentFields[];
    private EODataSource _dataSource;
    private transient boolean _customDataSourceClass;
    private NSMutableArray _allObjects;
    private NSMutableArray _displayedObjects;
    private _NSDelegate _delegate;
    private NSArray _selection;
    private NSArray _sortOrdering;
    private EOQualifier _qualifier;
    private NSArray _localKeys;
    private transient NSMutableArray _selectedObjects;
    private transient EOObserverProxy _observerNotificationBeginProxy;
    private transient EOObserverProxy _observerNotificationEndProxy;
    private transient int _updatedObjectIndex;
    private transient NSDictionary _insertedObjectDefaultValues;
    private transient NSMutableArray _savedAllObjects;
    private transient _EOFlatMutableDictionary _queryMatch;
    private transient _EOFlatMutableDictionary _queryMin;
    private transient _EOFlatMutableDictionary _queryMax;
    private transient _EOMutableDefaultValueDictionary _queryOperator;
    private transient String _defaultStringMatchOperator;
    private transient char _defaultStringMatchFormat[];
    private transient int _DSMFindexOfObject;
    private transient NSMutableDictionary _queryBindings;
    private boolean _flags_selectsFirstObjectAfterFetch;
    private boolean _flags_autoFetch;
    private transient boolean _flags_haveFetched;
    private boolean _flags_validateImmediately;
    private boolean _flags_queryMode;
    private transient boolean _flags_initialized;
    private transient boolean _wasDisposed;
    int _numberOfObjectsPerBatch;
    int _batchIndex;
    private static NSArray _stringQualifierOperators;
    private static NSArray _allQualifierOperators;
    private static final String QUERYOPERATOR_DEFAULTSTRING = "";
    private static final char QUERYOPERATOR_WILDCARD = 42;
    private static final String QUERYMATCH_DEFAULTSTRING = "%@*";
    private static String _globalDefaultStringMatchFormat;
    private static String _globalDefaultStringMatchOperator;
    private static boolean _globalDefaultForValidatesChangesImmediately;
    public static final String DisplayGroupWillFetchNotification = "WODisplayGroupWillFetch";

}

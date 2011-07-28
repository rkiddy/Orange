
package com.webobjects.eocontrol;

import com.webobjects.foundation.*;
import java.io.*;
import java.lang.ref.Reference;
import java.lang.ref.ReferenceQueue;
import java.lang.reflect.Array;
import java.util.Enumeration;
import java.util.Iterator;
import java.util.concurrent.locks.ReentrantLock;


public class EOEditingContext extends EOObjectStore
    implements EOObserving, NSLocking, EOKeyValueArchiving, Serializable {
    static class _EOThreadSafeQueue {


        _EOThreadSafeQueue() { return null; }

        public synchronized void addItem(Object item) { return null; }

        public synchronized Object removeItem() { return null; }

        public synchronized void stopAcceptingNotifications() { return null; }

        private final NSMutableArray _elements;
        private boolean _stopAcceptingNotifications;

    }

    public static class _EventLoggingEnabler
        implements EOEventCenter.EventRecordingHandler {

        public _EventLoggingEnabler() { return null; }

        public void setLoggingEnabled(boolean isLogging, Class aClass) {}
    }

    public static class EditingContextEvent extends EOEvent {


        public EditingContextEvent() { return null; }

        public EditingContextEvent(String type) { return null; }

        static  {}

        private static final long serialVersionUID = 0x1856f471L;
        public static final Class _CLASS = null;
        protected static final String ObjectsWithFetchSpecification = "objectsWithFetchSpecification";
        protected static final String SaveChangesInEditingContext = "saveChangesInEditingContext";

    }

    static class _EOInvalidFaultHandler extends EOFaultHandler {


        public _EOInvalidFaultHandler(String message) { return null; }

        public void completeInitializationOfObject(Object object) {}

        public void faultWillFire(Object obj1) {}

        static final String _disposedMessage = "Attempt to send message to an object after its editing context was disposed.  EOGlobalID was: ";
        static final String _defaultMessage = "Attempt to send message to an invalid EO.  It may have been deleted or forgotten by its editing context.  EOGlobalID was: ";
        String _message;

    }

    public static interface MessageHandler {


        public abstract void editingContextPresentErrorMessage(EOEditingContext eoeditingcontext, String s);

        public abstract boolean editingContextShouldContinueFetching(EOEditingContext eoeditingcontext, int i, int j, EOObjectStore eoobjectstore);



        public static final Class _CLASS = null;

    }

    public static interface Editor {


        public abstract boolean editorHasChangesForEditingContext(EOEditingContext eoeditingcontext);

        public abstract void editingContextWillSaveChanges(EOEditingContext eoeditingcontext);



        public static final Class _CLASS = null;

    }

    public static interface Delegate {


        public abstract boolean editingContextShouldPresentException(EOEditingContext eoeditingcontext, Throwable throwable);

        public abstract boolean editingContextShouldValidateChanges(EOEditingContext eoeditingcontext);

        public abstract void editingContextWillSaveChanges(EOEditingContext eoeditingcontext);

        public abstract boolean editingContextShouldInvalidateObject(EOEditingContext eoeditingcontext, EOEnterpriseObject eoenterpriseobject, EOGlobalID eoglobalid);

        public abstract boolean editingContextShouldUndoUserActionsAfterFailure(EOEditingContext eoeditingcontext);

        public abstract NSArray editingContextShouldFetchObjects(EOEditingContext eoeditingcontext, EOFetchSpecification eofetchspecification);

        public abstract boolean editingContextShouldMergeChangesForObject(EOEditingContext eoeditingcontext, EOEnterpriseObject eoenterpriseobject);

        public abstract void editingContextDidMergeChanges(EOEditingContext eoeditingcontext);



        public static final Class _CLASS = null;

    }



    static void _mergeValueForKey(EOEnterpriseObject object, Object value, String key) {}

    public static void setInstancesRetainRegisteredObjects(boolean flag) { return null; }

    public static boolean instancesRetainRegisteredObjects() { return null; }

    public void setRetainsRegisteredObjects(boolean flag) {}

    public boolean retainsRegisteredObjects() { return true; }

    ReferenceQueue _referenceQueue() { return null; }

    public static long defaultFetchTimestampLag() { return null; }

    public static void setDefaultFetchTimestampLag(long lag) { return null; }

    public static void setUsesContextRelativeEncoding(boolean flag) { return null; }

    public static boolean usesContextRelativeEncoding() { return null; }

    static NSArray _valuesForObject(EOEnterpriseObject object) { return null; }

    static void _applyValuesToObject(NSArray values, EOEnterpriseObject object) {}

    public static void encodeObjectWithCoder(EOEnterpriseObject object, NSCoder coder) { return null; }

    public static Object initObjectWithCoder(EOEnterpriseObject object, NSCoder coder) { return null; }

    /**
     * @deprecated Method encodeWithKeyValueArchiver is deprecated
     */

    public void encodeWithKeyValueArchiver(EOKeyValueArchiver eokeyvaluearchiver) {}

    public static Object decodeWithKeyValueUnarchiver(EOKeyValueUnarchiver unarchiver) { return null; }

    protected void _initWithParentObjectStore(EOObjectStore parent) {}

    public EOEditingContext(EOObjectStore parent) { return null; }

    public EOEditingContext() { return null; }

    public void setInvalidatesObjectsWhenFinalized(boolean yn) {}

    public boolean invalidatesObjectsWhenFinalized() { return true; }

    public void reset() {}

    public void dispose() {}

    private void _dispose(boolean duringFinalize) {}

    protected void finalize() throws Throwable {}

    public long fetchTimestamp() { return 0L; }

    public void setFetchTimestamp(long timestamp) {}

    public EOObjectStore parentObjectStore() { return null; }

    public EOObjectStore rootObjectStore() { return null; }

    private void _observeUndoManagerNotifications() {}

    private void _ignoreUndoManagerNotifications() {}

    public void setUndoManager(NSUndoManager undoManager) {}

    public NSUndoManager undoManager() { return null; }

    public void setDelegate(Object delegate) {}

    public Object _mthdelegate() { return null; }

    public void addEditor(Object editor) {}

    public void removeEditor(Object editor) {}

    public NSArray editors() { return null; }

    public void setMessageHandler(Object handler) {}

    public Object messageHandler() { return null; }

    public void recordObject(EOEnterpriseObject object, EOGlobalID gid) {}

    private void _addRecordForgottenButRetainedByChildren(_EOPrivateMemento rec, EOGlobalID gid) {}

    private _EOPrivateMemento _recordForgottenButRetainedByChildren(EOGlobalID gid) { return null; }

    private _EOPrivateMemento _removeRecordForgottenButRetainedByChildren(EOGlobalID gid) { return null; }

    private void _forgetObject(EOEnterpriseObject object, boolean propagateToObjectStore) {}

    public void forgetObject(EOEnterpriseObject object) {}

    public void _undoUpdate(Object args) {}

    private void registerUndoForModifiedObject(EOEnterpriseObject eo) {}

    private void incrementUndoTransactionID() {}

    public void _clearChangedThisTransaction(Number undoTransactionID) {}

    private void _registerClearStateWithUndoManager() {}

    private void _updateUnprocessedOwnDestinations(NSMutableSet inserts) {}

    protected boolean _processRecentChanges() { return true; }

    public void processRecentChanges() {}

    public void _undoManagerCheckpoint(NSNotification notification) {}

    public void _noop(Object obj) {}

    private void _enqueueEndOfEventNotification() {}

    protected boolean _invalidateObjectsDuringSave() { return true; }

    public void _processGlobalIDChanges(NSDictionary userInfo) {}

    public void _globalIDChanged(NSNotification notification) {}

    private void _processOwnedObjects(NSSet changeTable, NSSet deleteTable, boolean isInspectingChangedObjects) {}

    private void _processDeletedObjects() {}

    public void _processEndOfEventNotification(Object arg) {}

    private void propagateDeletesUsingTable(NSSet table) {}

    private boolean validateTable(NSSet table, int operation, NSMutableArray exceptionArrayP[], boolean cont) { return true; }

    public NSArray updatedObjects() { return null; }

    private NSArray _registeredObjects() { return null; }

    NSArray _globalIDsForRegisteredObjects() { return null; }

    public NSArray registeredObjects() { return null; }

    boolean isInserted(EOEnterpriseObject eo) { return null; }

    boolean isDeleted(EOEnterpriseObject eo) { return null; }

    boolean isUpdated(EOEnterpriseObject eo) { return null; }

    public NSArray insertedObjects() { return null; }

    public NSArray deletedObjects() { return null; }

    public boolean propagatesDeletesAtEndOfEvent() { return true; }

    public void setPropagatesDeletesAtEndOfEvent(boolean propagatesDeletesAtEndOfEvent) {}

    public boolean stopsValidationAfterFirstError() { return true; }

    public void setStopsValidationAfterFirstError(boolean yn) {}

    public boolean locksObjectsBeforeFirstModification() { return true; }

    public void setLocksObjectsBeforeFirstModification(boolean yn) {}

    public EOSharedEditingContext sharedEditingContext() { return null; }

    public void setSharedEditingContext(EOSharedEditingContext sharedEC) {}

    public void _objectsInitializedInSharedContext(NSNotification event) {}

    public void _processInitializedObjectsInSharedContext(NSDictionary info) {}

    public void _defaultSharedEditingContextWasInitialized(NSNotification event) {}

    public void _defaultEditingContextNowInitialized(NSDictionary info) {}

    private _EOPrivateMemento _recordForObject(EOEnterpriseObject object) { return null; }

    EOEnterpriseObject _eoForGID(EOGlobalID gid) { return null; }

    protected void _clearOriginalSnapshotForObject(EOEnterpriseObject object) {}

    protected void _clearOriginalSnapshotAndInitializeRec(EOEnterpriseObject object) {}

    private void _setRecordIsInitialized(EOGlobalID gid, boolean value) {}

    public EOEnterpriseObject objectForGlobalID(EOGlobalID gid) { return null; }

    EOEnterpriseObject _localObjectForGlobalID(EOGlobalID gid) { return null; }

    public int _retainCountForObjectWithGlobalID(EOGlobalID gid) { return 0; }

    public EOGlobalID globalIDForObject(EOEnterpriseObject object) { return null; }

    private EOGlobalID _globalIDForLocalObject(EOEnterpriseObject object) { return null; }

    public NSDictionary committedSnapshotForObject(EOEnterpriseObject object) { return null; }

    public NSDictionary currentEventSnapshotForObject(EOEnterpriseObject object) { return null; }

    public void objectWillChange(Object object) {}

    protected void _insertObjectWithGlobalID(EOEnterpriseObject object, EOGlobalID gid) {}

    public void insertObjectWithGlobalID(EOEnterpriseObject object, EOGlobalID gid) {}

    public void insertObject(EOEnterpriseObject object) {}

    public void _undoDelete(Object args) {}

    public void deleteObject(EOEnterpriseObject object) {}

    public boolean hasChanges() { return true; }

    public boolean editorsHaveChanges() { return true; }

    public void _editorHasChanges(Object editor) {}

    private boolean handleError(Throwable exception) { return true; }

    private boolean handleErrors(NSArray exceptions) { return true; }

    private void validateDeletesUsingTable(NSSet table) {}

    private void validateChangesForSave() {}

    private void didSaveChanges() {}

    private void _clearInsertions() {}

    private void _clearUnprocessedInsertions() {}

    private void _clearDeletions() {}

    private void _clearUnprocessedDeletions() {}

    private void _clearUpdates() {}

    private void _clearUnprocessedUpdates() {}

    /**
     * @deprecated Method tryToSaveChanges is deprecated
     */

    public Throwable tryToSaveChanges() { return null; }

    private void _flushCurrentEdits() {}

    public void saveChanges() {}

    private boolean _prepareForPushChanges() { return true; }

    private void _refaultObjectWithGlobalID(EOEnterpriseObject object, EOGlobalID gid) {}

    private void _refaultLocalObjectWithGlobalID(EOGlobalID gid) {}

    private void _forgetObjectWithGlobalID(EOGlobalID gid, boolean propagateToObjectStore) {}

    private void _refaultObjectsWithGlobalIDs(NSArray gids) {}

    protected NSDictionary _objectBasedChangeInfoForGIDInfo(NSDictionary dictionary) { return null; }

    private NSMutableSet _copyMutableSetFromToManyArray(NSArray toManyArray) { return null; }

    NSArray _newUncommittedChangesForObject(EOEnterpriseObject object, NSDictionary snapshot) { return null; }

    private NSArray _newUncommittedChangesForObject(EOEnterpriseObject object) { return null; }

    void _mergeObjectWithChanges(EOEnterpriseObject object, NSArray changes) { return null; }

    private NSArray _newChangesFromInvalidatingObjectsWithGlobalIDs(NSArray updatedGIDs) { return null; }

    public void _processObjectStoreChanges(NSDictionary info) {}

    public void _objectsChangedInStore(NSNotification notification) {}

    public EOEnterpriseObject faultForGlobalID(EOGlobalID gid, EOEditingContext context) { return null; }

    public EOEnterpriseObject faultForRawRow(NSDictionary row, String entityName, EOEditingContext context) { return null; }

    public EOEnterpriseObject faultForRawRow(NSDictionary row, String entityName) { return null; }

    public NSArray arrayFaultWithSourceGlobalID(EOGlobalID gid, String name, EOEditingContext context) { return null; }

    public void initializeObject(EOEnterpriseObject object, EOGlobalID gid, EOEditingContext context) {}

    public void editingContextDidForgetObjectWithGlobalID(EOEditingContext context, EOGlobalID gid) {}

    public NSArray objectsForSourceGlobalID(EOGlobalID gid, String name, EOEditingContext context) { return null; }

    public void refaultObject(EOEnterpriseObject object) {}

    public void refaultObject(EOEnterpriseObject object, EOGlobalID gid, EOEditingContext ctx) {}

    public NSArray objectsWithFetchSpecification(EOFetchSpecification fetchSpec, EOEditingContext context) { return null; }

    public void saveChangesInEditingContext(EOEditingContext context) {}

    public boolean isObjectLockedWithGlobalID(EOGlobalID gid, EOEditingContext context) { return true; }

    public void lockObjectWithGlobalID(EOGlobalID gid, EOEditingContext context) {}

    public void refaultAllObjects() {}

    public void invalidateObjectsWithGlobalIDs(NSArray gids) {}

    public void _resetAllChanges() {}

    public void _resetAllChanges(NSDictionary info) {}

    public void _invalidatedAllObjectsInStore(NSNotification notification) {}

    public void invalidateAllObjects() {}

    public NSArray objectsWithFetchSpecification(EOFetchSpecification fetchSpecification) { return null; }

    public void lockObject(EOEnterpriseObject object) {}

    public void revert() {}

    public void lock() {}

    public boolean tryLock() { return true; }

    public void unlock() {}

    public void lockObjectStore() {}

    public void unlockObjectStore() {}

    private void _sendOrEnqueueNotification(NSNotification notification, NSSelector selector) {}

    protected void _processNotificationQueue() {}

    private void _processReferenceQueue() {}

    /**
     * @deprecated Method saveChanges is deprecated
     */

    public void saveChanges(Object sender) {}

    public void refreshObject(EOEnterpriseObject eo) {}

    public void refreshAllObjects() {}

    /**
     * @deprecated Method refetch is deprecated
     */

    public void refetch() {}

    /**
     * @deprecated Method refaultObjects is deprecated
     */

    public void refaultObjects() {}

    public void undo() {}

    public void redo() {}

    public static void setSubstitutionEditingContext(EOEditingContext ec) { return null; }

    public static EOEditingContext substitutionEditingContext() { return null; }

    public static void setDefaultParentObjectStore(EOObjectStore store) { return null; }

    public static EOObjectStore defaultParentObjectStore() { return null; }

    public Object invokeRemoteMethod(EOEditingContext context, EOGlobalID gid, String methodName, Class argumentTypes[], Object arguments[]) { return null; }

    public NSArray _globalIDsForObjects(NSArray objects) { return null; }

    public void _EOAssertSafeMultiThreadedAccess() {}

    public void _EOAssertSafeMultiThreadedReadAccess(String info) {}

    public void _EOAssertSafeMultiThreadedAccess(String info) {}

    private void redo(Object sender) {}

    private void refetch(Object sender) {}

    private void revert(Object sender) {}

    private void undo(Object sender) {}

    boolean _willObjectBeForgottenNextPRC(EOEnterpriseObject eo) { return null; }

    private void writeObject(ObjectOutputStream s) throws IOException {}

    private void readObject(ObjectInputStream s) throws IOException, ClassNotFoundException {}

    protected Object readResolve() throws ObjectStreamException { return null; }

    static  {}

    public static final Class _CLASS = null;
    static final long serialVersionUID = 0x62d0a6a1L;
    transient EOObjectStore _objectStore;
    transient NSUndoManager _undoManager;
    private transient NSMutableSet _unprocessedChanges;
    private transient NSMutableSet _unprocessedDeletes;
    private transient NSMutableSet _unprocessedInserts;
    private NSMutableSet _insertedObjects;
    private NSMutableSet _deletedObjects;
    private NSMutableSet _changedObjects;
    private transient NSMutableDictionary _insertedObjectsOwnedDestinationSnapshots;
    private transient NSArray _updatedObjectsCache;
    private transient NSArray _insertedObjectsCache;
    private transient NSArray _deletedObjectsCache;
    private transient NSMutableDictionary _infoByGID;
    private transient NSMutableDictionary _infoForgottenButRetainedByChildren;
    private transient NSArray _registeredObjectsCache;
    private _NSDelegate _delegate;
    private transient NSMutableArray _editors;
    private transient _NSDelegate _messageHandler;
    private transient short _undoTransactionID;
    private transient boolean _registeredForCallback;
    private transient boolean _propagatesDeletesAtEndOfEvent;
    private transient boolean _ignoreChangeNotification;
    private transient boolean _exhaustiveValidation;
    private transient boolean _autoDBRowLocking;
    private transient boolean _processingChanges;
    private transient boolean _skipInvalidateOnFinalize;
    private transient boolean _useCommittedSnapshot;
    private transient boolean _registeredUndoTransactionID;
    private static boolean _DefaultRetainAllRegisteredObjects;
    transient boolean _retainsAllRegisteredObjects;
    private transient ReferenceQueue _eoReferenceCleanupPool;
    private transient boolean _lockUsingParent;
    private transient boolean _ignoreSharedContextNotifications;
    private transient boolean _savingInProgress;
    private transient boolean _pushedChanges;
    static final _EOInvalidFaultHandler _DisposedHandler;
    static final _EOInvalidFaultHandler _InvalidEOHandler;
    transient ReentrantLock _lock;
    volatile transient int _lockCount;
    volatile transient int _objectStoreLockCount;
    transient EOSharedEditingContext _sharedContext;
    private transient _EOThreadSafeQueue _notificationQueue;
    private transient long _fetchTimestamp;
    public static final int EditingContextFlushChangesRunLoopOrdering = 0x493e0;
    protected static volatile boolean _IsEventLoggingEnabled;
    private static volatile long _defaultFetchTimestampLag;
    private static volatile EOEditingContext _substitutionContext;
    private static volatile EOObjectStore _defaultParent;
    private static volatile boolean _usesContextRelativeEncoding;
    public static final String ObjectsChangedInEditingContextNotification = "EOObjectsChangedInEditingContextNotification";
    public static final String EditingContextDidSaveChangesNotification = "EOEditingContextDidSaveChangesNotification";
    public static final String _EditingContextDidChangeSharedEditingContextNotification = "_EOEditingContextDidChangeSharedEditingContextNotification";
    public static final String _EditingContextEditorHasChangesNotification = "_EOEditingContextEditorHasChangesNotification";
    private static final NSSelector _objectsChangedInStoreSelector;
    private static final NSSelector _invalidatedAllObjectsInStoreSelector;
    private static final NSSelector _globalIDChangedSelector;
    private static final NSSelector _objectsInitializedInSharedContextSelector;
    private static final NSSelector _defaultSharedEditingContextWasInitializedSelector;
    private static final NSSelector _undoCheckpointSelector;
    private static final NSSelector _undoUpdateSelector;
    private static final NSSelector _clearChangedSelector;
    private static final NSSelector _noopSelector;
    private static final NSSelector _processEndOfEventSelector;
    private static final NSSelector _processGlobalIDSelector;
    private static final NSSelector _processInitializedObjectsInSharedContextSelector;
    private static final NSSelector _defaultEditingContextNowInitializedSelector;
    private static final NSSelector _deleteObjectSelector;
    private static final NSSelector _undoDeleteSelector;
    private static final NSSelector _processObjectStoreSelector;
    private static final NSSelector _resetSelector;
    private static final int _DefaultRegistrationCollectionSize = 512;
    private static final int _DefaultChangeCollectionSize = 64;
    private static final int _DefaultEventChangeCollectionSize = 32;
    private static final String editingContextShouldPresentException = "editingContextShouldPresentException";
    private static final String editingContextShouldValidateChanges = "editingContextShouldValidateChanges";
    private static final String editingContextWillSaveChanges = "editingContextWillSaveChanges";
    private static final String editingContextShouldInvalidateObject = "editingContextShouldInvalidateObject";
    private static final String editingContextShouldFetchObjects = "editingContextShouldFetchObjects";
    private static final String editingContextShouldMergeChangesForObject = "editingContextShouldMergeChangesForObject";
    private static final String editingContextDidMergeChanges = "editingContextDidMergeChanges";
    private static final String editorHasChangesForEditingContext = "editorHasChangesForEditingContext";
    private static final String editingContextPresentErrorMessage = "editingContextPresentErrorMessage";
    private static final int _ValidateForInsert = 0;
    private static final int _ValidateForUpdate = 1;
    private static final int _ValidateForDelete = 2;
    private static final String keys[];
    private static final long SerializationVersion = 5000L;
    private static final String SerializationVersionFieldKey = "version";
    private static final String SerializationParentObjectStoreFieldKey = "parentObjectStore";
    private static final String SerializationInsertedObjectsFieldKey = "insertedObjects";
    private static final String SerializationInsertedDeltasFieldKey = "insertedObjectsProperties";
    private static final String SerializationChangedObjectsFieldKey = "updatedObjects";
    private static final String SerializationChangedDeltasFieldKey = "updatedObjectsDeltas";
    private static final String SerializationDeletedObjectsFieldKey = "deletedObjects";
    private static final String SerializationDeletedDeltasFieldKey = "deletedObjectsDeltas";
    private static final String SerializationDelegateFieldKey = "delegate";
    private static final ObjectStreamField serialPersistentFields[];

}

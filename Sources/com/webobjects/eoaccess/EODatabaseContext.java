
package com.webobjects.eoaccess;

import com.webobjects.eocontrol.*;
import com.webobjects.foundation.*;
import java.lang.ref.ReferenceQueue;
import java.util.*;
import java.util.concurrent.locks.ReentrantLock;


public class EODatabaseContext extends EOCooperatingObjectStore
    implements NSLocking {
    public static interface Delegate {

        public abstract boolean databaseContextWillRunLoginPanelToOpenDatabaseChannel(EODatabaseContext eodatabasecontext, EODatabaseChannel eodatabasechannel);

        public abstract NSDictionary databaseContextNewPrimaryKey(EODatabaseContext eodatabasecontext, Object obj, EOEntity eoentity);

        public abstract boolean databaseContextFailedToFetchObject(EODatabaseContext eodatabasecontext, Object obj, EOGlobalID eoglobalid);

        public abstract NSArray databaseContextWillOrderAdaptorOperations(EODatabaseContext eodatabasecontext, NSArray nsarray);

        public abstract NSArray databaseContextWillPerformAdaptorOperations(EODatabaseContext eodatabasecontext, NSArray nsarray, EOAdaptorChannel eoadaptorchannel);

        public abstract boolean databaseContextShouldInvalidateObjectWithGlobalID(EODatabaseContext eodatabasecontext, EOGlobalID eoglobalid, NSDictionary nsdictionary);

        public abstract NSArray databaseContextShouldFetchObjects(EODatabaseContext eodatabasecontext, EOFetchSpecification eofetchspecification, EOEditingContext eoeditingcontext);

        public abstract void databaseContextDidFetchObjects(EODatabaseContext eodatabasecontext, NSArray nsarray, EOFetchSpecification eofetchspecification, EOEditingContext eoeditingcontext);

        public abstract boolean databaseContextShouldSelectObjects(EODatabaseContext eodatabasecontext, EOFetchSpecification eofetchspecification, EODatabaseChannel eodatabasechannel);

        public abstract boolean databaseContextShouldUsePessimisticLock(EODatabaseContext eodatabasecontext, EOFetchSpecification eofetchspecification, EODatabaseChannel eodatabasechannel);

        public abstract void databaseContextDidSelectObjects(EODatabaseContext eodatabasecontext, EOFetchSpecification eofetchspecification, EODatabaseChannel eodatabasechannel);

        public abstract NSDictionary databaseContextShouldUpdateCurrentSnapshot(EODatabaseContext eodatabasecontext, NSDictionary nsdictionary, NSDictionary nsdictionary1, EOGlobalID eoglobalid, EODatabaseChannel eodatabasechannel);

        public abstract boolean databaseContextShouldLockObjectWithGlobalID(EODatabaseContext eodatabasecontext, EOGlobalID eoglobalid, NSDictionary nsdictionary);

        public abstract boolean databaseContextShouldRaiseExceptionForLockFailure(EODatabaseContext eodatabasecontext, Throwable throwable);

        public abstract boolean databaseContextShouldFetchObjectFault(EODatabaseContext eodatabasecontext, Object obj);

        public abstract boolean databaseContextShouldFetchArrayFault(EODatabaseContext eodatabasecontext, Object obj);

        public abstract void databaseContextWillFireObjectFaultForGlobalID(EODatabaseContext eodatabasecontext, EOGlobalID eoglobalid, EOFetchSpecification eofetchspecification, EOEditingContext eoeditingcontext);

        public abstract void databaseContextWillFireArrayFaultForGlobalID(EODatabaseContext eodatabasecontext, EOGlobalID eoglobalid, EORelationship eorelationship, EOFetchSpecification eofetchspecification, EOEditingContext eoeditingcontext);

        public abstract boolean databaseContextShouldHandleDatabaseException(EODatabaseContext eodatabasecontext, Throwable throwable);
    }

    public static class DatabaseContextEvent extends EOEvent {


        public DatabaseContextEvent() { return null; }

        public DatabaseContextEvent(String type) { return null; }

        static  {}

        private static final long serialVersionUID = 0xe1ad990fL;
        public static String ObjectsWithFetchSpecification;
        public static String SaveChangesInEditingContext;

    }

    public static class _EventLoggingEnabler
        implements com.webobjects.eocontrol.EOEventCenter.EventRecordingHandler {

        public _EventLoggingEnabler() { return null; }

        public void setLoggingEnabled(boolean isLogging, Class aClass) {}
    }



    public static void setDefaultDelegate(Object defaultDelegate) { return null; }

    public static Object defaultDelegate() { return null; }

    public static void setSharedObjectLoadingEnabled(boolean bool) { return null; }

    public static boolean isSharedObjectLoadingEnabled() { return null; }

    public static void _setUseToManyCaching(boolean bool) { return null; }

    public void _registerForAdaptorContextNotifications(EOAdaptorContext adaptorContext) {}

    public void _unregisterForAdaptorContextNotifications(EOAdaptorContext adaptorContext) {}

    public EODatabaseContext(EODatabase database) { return null; }

    public void dispose() {}

    public static void _setSuppressRedundantEODatabaseChangeNotification(boolean bool) { return null; }

    public static Class contextClassToRegister() { return null; }

    public static void setContextClassToRegister(Class contextClass) { return null; }

    ReferenceQueue _referenceQueueForHandlers() { return null; }

    public static EODatabaseContext registeredDatabaseContextForModel(EOModel model, EOObjectStoreCoordinator coordinator) { return null; }

    public static EODatabaseContext registeredDatabaseContextForModel(EOModel model, EOEditingContext editingContext) { return null; }

    public static EODatabaseContext forceConnectionWithModel(EOModel model, NSDictionary overrides, EOEditingContext editingContext) { return null; }

    public static void _cooperatingObjectStoreNeeded(NSNotification notification) { return null; }

    private static void _preloadSharedObjectsWithModel(EOModel model) { return null; }

    public void setCoordinator(EOObjectStoreCoordinator coord) {}

    public NSArray registeredChannels() { return null; }

    public void registerChannel(EODatabaseChannel channel) {}

    public void unregisterChannel(EODatabaseChannel channel) {}

    public EODatabaseChannel availableChannel() { return null; }

    public boolean hasBusyChannels() { return true; }

    public EODatabase database() { return null; }

    public EOAdaptorContext adaptorContext() { return null; }

    private void beginTransaction() {}

    private void commitTransaction() {}

    private void rollbackTransaction() {}

    public int updateStrategy() { return 0; }

    public void setUpdateStrategy(int strategy) {}

    public void recordSnapshotForGlobalID(NSDictionary snapshot, EOGlobalID gid) {}

    public void recordSnapshotForSourceGlobalID(NSArray gids, EOGlobalID gid, String name) {}

    public void recordSnapshots(NSDictionary snapshots) {}

    public void recordToManySnapshots(NSDictionary snapshots) {}

    public void forgetSnapshotForGlobalID(EOGlobalID gid) {}

    public NSDictionary snapshotForGlobalID(EOGlobalID gid) { return null; }

    public NSDictionary snapshotForGlobalID(EOGlobalID gid, long timestamp) { return null; }

    public NSArray snapshotForSourceGlobalID(EOGlobalID gid, String name) { return null; }

    public NSArray snapshotForSourceGlobalID(EOGlobalID gid, String name, long timestamp) { return null; }

    public NSArray missingObjectGlobalIDs() { return null; }

    public Object _mthdelegate() { return null; }

    public void setDelegate(Object delegate) {}

    private void _setDelegate(Object delegate) {}

    boolean _respondsTo_shouldUpdateCurrentSnapshot() { return null; }

    NSDictionary _shouldUpdateCurrentSnapshot(NSDictionary snapshot, NSDictionary row, EOKeyGlobalID gid, EODatabaseChannel databaseChannel) { return null; }

    boolean _performShouldSelectObjects(EOFetchSpecification fetchSpec, EODatabaseChannel databaseChannel) { return null; }

    void _performDidSelectObjects(EOFetchSpecification fetchSpec, EODatabaseChannel databaseChannel) { return null; }

    public void lock() {}

    public synchronized void unlock() { return null; }

    synchronized boolean _verifyLock() { return true; }

    public void handleDroppedConnection() {}

    public void _forceDisconnect() {}

    protected boolean _openChannelWithLoginPanel(EODatabaseChannel channel) { return true; }

    public EODatabaseChannel _availableChannelFromRegisteredChannels() { return null; }

    protected EODatabaseChannel _availableChannel() { return null; }

    protected EODatabaseChannel _obtainOpenChannel() { return null; }

    public void _beginTransaction(NSNotification notification) {}

    public void _cleanUpAfterTransaction() {}

    public void _commitTransaction(NSNotification notification) {}

    public void _rollbackTransaction(NSNotification notification) {}

    private EOEntity entityForGlobalID(EOGlobalID globalID) { return null; }

    public NSDictionary localSnapshotForGlobalID(EOGlobalID gid) { return null; }

    public NSArray localSnapshotForSourceGlobalID(EOGlobalID gid, String name) { return null; }

    public void registerLockedObjectWithGlobalID(EOGlobalID gid) {}

    public boolean isObjectLockedWithGlobalID(EOGlobalID gid) { return true; }

    public void forgetLocksForObjectsWithGlobalIDs(NSArray gids) {}

    public void forgetAllLocks() {}

    public void forgetSnapshotsForGlobalIDs(NSArray gids) {}

    private void initializeObjectRowEntityEditingContext(EOEnterpriseObject object, NSDictionary row, EOEntity entity, EOEditingContext editContext) {}

    public NSArray _objectsFromEntityCacheWithFetchSpecEditingContext(EOFetchSpecification fetchSpec, EOEditingContext context) { return null; }

    public void _populateCacheForFetchSpecificationEditingContext(EOFetchSpecification fetchSpec, EOEditingContext context) {}

    protected Object _objectFaultWithSnapshotRelationshipEditingContext(NSDictionary row, EORelationship relationship, EOEditingContext editContext) { return null; }

    protected Object _fireDeferredFaultWithSourceObject(EOEnterpriseObject eo, EORelationship relationship) { return null; }

    protected boolean _delegateHandledDatabaseException(Exception exception) { return true; }

    public boolean _isDroppedConnectionException(Exception exception) { return true; }

    public NSArray _filterArrayWithQualifierEditingContext(NSArray array, EOQualifier qualifier, EOEditingContext ec) { return null; }

    public static void _setUseFastBatchAlgorithm(boolean flag1) { return null; }

    public void _followToManyRelationshipWithFetchSpecification(EORelationship relationship, EOFetchSpecification newFetchSpec, NSArray sourceObjects, EOEditingContext context) {}

    public void _followFetchSpecification(EOFetchSpecification fetchSpec, String relationshipName, NSArray sourceObjects, EOEditingContext context) {}

    public void _performPrefetchForFetchSpecification(EOFetchSpecification fetchSpec, EOEditingContext context, NSArray array, NSArray prefetchingHints) {}

    public EOEnterpriseObject faultForRawRow(NSDictionary row, String entityName, EOEditingContext editingContext) { return null; }

    public NSArray _fetchRawRowKeyPaths(NSArray rawKeyPaths, EOFetchSpecification fetchSpecification, EOEntity entity, EOEditingContext context) { return null; }

    public NSArray _objectsWithFetchSpecificationEditingContext(EOFetchSpecification fetchSpec, EOEditingContext context) { return null; }

    public boolean _validateKeyForEvaluationInMemory(String key, EOEntity entity) { return true; }

    public boolean _validateQualifierForEvaluationInMemory(EOQualifier qual, EOEntity entity) { return true; }

    public NSArray objectsWithFetchSpecification(EOFetchSpecification fetchSpec, EOEditingContext context) { return null; }

    public boolean isObjectLockedWithGlobalID(EOGlobalID gid, EOEditingContext ec) { return true; }

    public void lockObjectWithGlobalID(EOGlobalID gid, EOEditingContext ec) {}

    public void saveChangesInEditingContext(EOEditingContext context) {}

    public void _turnToFaultGidEditingContextIsComplete(Object obj, EOKeyGlobalID gid, EOEditingContext context, boolean complete) {}

    public EOEnterpriseObject faultForGlobalID(EOGlobalID globalID, EOEditingContext context) { return null; }

    EOEnterpriseObject _fetchSingleObject(EOEntity entity, EOGlobalID gid, EOEditingContext context) { return null; }

    public void refaultObject(EOEnterpriseObject object, EOGlobalID globalID, EOEditingContext context) {}

    public NSArray arrayFaultWithSourceGlobalID(EOGlobalID globalID, String name, EOEditingContext context) { return null; }

    public void initializeObject(EOEnterpriseObject object, EOGlobalID gid, EOEditingContext context) {}

    public void editingContextDidForgetObjectWithGlobalID(EOEditingContext context, EOGlobalID gid) {}

    public void invalidateObjectsWithGlobalIDs(NSArray gids) {}

    public void invalidateAllObjects() {}

    public void _snapshotsChangedInDatabase(NSNotification notification) {}

    public void _objectsChanged(NSNotification notification) {}

    public void _batchFetchRelationshipForSourceObjectsEditingContext(EORelationship relationship, NSArray objects, EOEditingContext editingContext) {}

    boolean _usesPessimisticLocking(EOFetchSpecification fetchSpecification, EODatabaseChannel databaseChannel) { return null; }

    public void batchFetchRelationship(EORelationship relationship, NSArray objects, EOEditingContext editingContext) {}

    public void _registersnapshotForSourceGlobalIDEditingContext(NSArray results, EOGlobalID gid, String name, EOEditingContext context) {}

    public NSArray objectsForSourceGlobalID(EOGlobalID gid, String name, EOEditingContext context) { return null; }

    public void _fireFault(EOEnterpriseObject fault) {}

    public void _fireArrayFault(Object fault) {}

    public static void _EOAssertSafeMultiThreadedAccess(EODatabaseContext dbc) { return null; }

    private void _buildPrimaryKeyGeneratorListForEditingContext(EOEditingContext ec) {}

    private EOEntity _entityForObject(EOEnterpriseObject enterpriseObject) { return null; }

    public boolean _shouldGeneratePrimaryKeyForEntityName(String entityName) { return true; }

    public void _assertValidStateWithSelector(NSSelector sel) {}

    public void _cleanUpAfterSave() {}

    public NSDictionary _databaseContextState() { return null; }

    public RuntimeException _exceptionWithDatabaseContextInformationAdded(Exception exception) { return null; }

    public NSDictionary _currentCommittedSnapshotForObject(EOEnterpriseObject object) { return null; }

    private NSDictionary _primaryKeyForObject(EOEnterpriseObject object) { return null; }

    public EOGlobalID _globalIDForObject(EOEnterpriseObject object) { return null; }

    public void _verifyNoChangesToReadonlyEntity(EODatabaseOperation dbOp) {}

    private void recordInsertForObject(EOEnterpriseObject object) {}

    private void recordDeleteForObject(EOEnterpriseObject object) {}

    private void recordDatabaseOperation(EODatabaseOperation dbOp) {}

    private EODatabaseOperation databaseOperationForGlobalID(EOGlobalID gid) { return null; }

    private EODatabaseOperation databaseOperationForObject(EOEnterpriseObject object) { return null; }

    private NSDictionary primaryKeyForIntermediateRowFromSourceObject(EOEnterpriseObject sourceObject, EORelationship rel, EOEnterpriseObject destObject) { return null; }

    private EODatabaseOperation databaseOperationForIntermediateRowFromSourceObject(EOEnterpriseObject sourceObject, EORelationship rel, EOEnterpriseObject destObject) { return null; }

    private void recordInsertForIntermediateRowFromSourceObject(EOEnterpriseObject sourceObject, EORelationship rel, EOEnterpriseObject destObject) {}

    private void recordDeleteForIntermediateRowFromSourceObjectRelationshipDestinationObject(EOEnterpriseObject sourceObject, EORelationship rel, EOEnterpriseObject destObject) {}

    private NSDictionary relayAttributesInRelationshipSourceObjectDestinationObject(EORelationship rel, EOEnterpriseObject sourceObject, EOEnterpriseObject destObject) { return null; }

    private void nullifyAttributesInRelationshipSourceObjectDestinationObject(EORelationship rel, EOEnterpriseObject sourceObject, EOEnterpriseObject destObject) {}

    private void relayAttributesInRelationshipSourceObjectDestinationObjects(EORelationship rel, EOEnterpriseObject sourceObject, NSArray destObjects) {}

    private void nullifyAttributesInRelationshipSourceObjectDestinationObjects(EORelationship rel, EOEnterpriseObject sourceObject, NSArray destObjects) {}

    private boolean isValidQualifierTypeForAttribute(EOAttribute att) { return true; }

    private NSArray lockingNonQualifiableAttributes(NSArray atts) { return null; }

    private NSArray lockingAttributesForAttributesEntity(NSArray atts, EOEntity entity) { return null; }

    private NSArray primaryKeyAttributesForAttributesEntity(NSArray atts, EOEntity entity) { return null; }

    private EOQualifier qualifierForLockingAttributesPrimaryKeyAttributesEntitySnapshot(NSArray lockingAtts, NSArray pkAtts, EOEntity entity, NSDictionary snapshot) { return null; }

    private NSDictionary valuesToWriteForAttributesEntityChangedValues(NSArray atts, EOEntity entity, NSDictionary changedValues) { return null; }

    private void processSnapshotForDatabaseOperation(EODatabaseOperation dbOp) {}

    private void createAdaptorOperationsForDatabaseOperationAttributes(EODatabaseOperation dbOp, NSArray atts) {}

    private void createAdaptorOperationsForDatabaseOperation(EODatabaseOperation dbOp) {}

    private void insertEntityIntoOrderingArray(EOEntity entity, NSMutableArray entityNames, NSDictionary dependencies, NSMutableSet processingSet) {}

    private NSArray entitiesOnWhichThisEntityDepends(EOEntity entity) { return null; }

    private NSArray entityNameOrderingArrayForEntities(NSArray entitiesInOperations) { return null; }

    private NSArray orderAdaptorOperations() { return null; }

    public boolean ownsGlobalID(EOGlobalID globalID) { return true; }

    public boolean ownsObject(EOEnterpriseObject object) { return true; }

    public boolean handlesFetchSpecification(EOFetchSpecification fetchSpecification) { return true; }

    protected void _willPrepareForSave() {}

    public void prepareForSaveWithCoordinator(EOObjectStoreCoordinator coordinator, EOEditingContext editingContext) {}

    private NSArray _batchNewPrimaryKeysWithEntity(int cnt, EOEntity rootEntity) { return null; }

    private void relayPrimaryKeySourceObjectDestObjectRelationship(NSDictionary pkDict, EOEnterpriseObject sourceObject, EOEnterpriseObject destObject, EORelationship rel) {}

    private void relayPrimaryKeyObjectEntity(NSDictionary pkDict, EOEnterpriseObject sourceObject, EOEntity entity) {}

    public void recordChangesInEditingContext() {}

    public void recordUpdateForObject(EOEnterpriseObject object, NSDictionary changes) {}

    protected void _performChangesWithAdaptorOps(NSArray adaptorOps) {}

    protected void _patchUpPK(EODatabaseOperation op) {}

    public void performChanges() {}

    public void cleanupSnapshots() {}

    public void commitChanges() {}

    public void rollbackChanges() {}

    private boolean isObjectStoreForObject(EOEnterpriseObject object) { return true; }

    private NSMutableDictionary _mutableValuesForKeys(NSArray keys, EOEnterpriseObject object) { return null; }

    public NSDictionary valuesForKeys(NSArray keys, EOEnterpriseObject object) { return null; }

    static  {}

    protected EODatabase _database;
    protected EOAdaptorContext _adaptorContext;
    protected int _updateStrategy;
    protected NSMutableDictionary _uniqueTable;
    protected NSMutableSet _deleteTable;
    protected NSMutableArray _registeredChannels;
    protected NSMutableDictionary _dbOperationsByGlobalID;
    private ReentrantLock _dbcLock;
    protected EOEditingContext _editingContext;
    protected NSMutableSet _lockedObjects;
    protected int _currentGeneration;
    protected int _concurrentFetches;
    protected _NSWeakValueMutableDictionary _batchFaultBuffer;
    protected _NSWeakValueMutableDictionary _batchToManyFaultBuffer;
    protected EOEntity _lastEntity;
    protected EOGlobalID _currentGlobalID;
    protected NSDictionary _currentSnapshot;
    protected Object _currentBatch;
    protected NSMutableDictionary _uniqueArrayTable;
    protected NSMutableSet _nonPrimaryKeyGenerators;
    protected NSMutableSet _missingObjectGIDs;
    protected NSMutableArray _checkPropagatedPKs;
    protected boolean _flags_willPrepareForSave;
    protected boolean _flags_preparingForSave;
    protected boolean _flags_beganTransaction;
    protected boolean _flags_ignoreEntityCaching;
    protected boolean _flags_hasPreloadedShared;
    protected _NSDelegate _delegate;
    private static final String _databaseContextNewPrimaryKey = "databaseContextNewPrimaryKey";
    private static final String _databaseContextWillPerformAdaptorOperations = "databaseContextWillPerformAdaptorOperations";
    private static final String _databaseContextShouldInvalidateObjectWithGlobalID = "databaseContextShouldInvalidateObjectWithGlobalID";
    private static final String _databaseContextWillOrderAdaptorOperations = "databaseContextWillOrderAdaptorOperations";
    private static final String _databaseContextShouldLockObjectWithGlobalID = "databaseContextShouldLockObjectWithGlobalID";
    private static final String _databaseContextShouldRaiseExceptionForLockFailure = "databaseContextShouldRaiseExceptionForLockFailure";
    private static final String _databaseContextShouldFetchObjects = "databaseContextShouldFetchObjects";
    private static final String _databaseContextDidFetchObjects = "databaseContextDidFetchObjects";
    private static final String _databaseContextShouldFetchObjectFault = "databaseContextShouldFetchObjectFault";
    private static final String _databaseContextShouldFetchArrayFault = "databaseContextShouldFetchArrayFault";
    private static final String _databaseContextWillFireObjectFaultForGlobalID = "databaseContextWillFireObjectFaultForGlobalID";
    private static final String _databaseContextWillFireArrayFaultForGlobalID = "databaseContextWillFireArrayFaultForGlobalID";
    private static final String _databaseContextShouldHandleDatabaseException = "databaseContextShouldHandleDatabaseException";
    private static final String _databaseContextShouldUsePessimisticLock = "databaseContextShouldUsePessimisticLock";
    private static final String _databaseContextShouldSelectObjects = "databaseContextShouldSelectObjects";
    private static final String _databaseContextDidSelectObjects = "databaseContextDidSelectObjects";
    private static final String _databaseContextShouldUpdateCurrentSnapshot = "databaseContextShouldUpdateCurrentSnapshot";
    private static final String _databaseContextFailedToFetchObject = "databaseContextFailedToFetchObject";
    protected boolean _delegateRespondsTo_shouldUpdateCurrentSnapshot;
    public static final int UpdateWithOptimisticLocking = 0;
    public static final int UpdateWithPessimisticLocking = 1;
    public static final int UpdateWithNoLocking = 2;
    private static final int DefaultIntermediateRowCount = 64;
    private static volatile boolean _useToManyCaching;
    protected static volatile int _lazyFaultDebugLevel;
    private static volatile boolean _autoLoadSharedObjects;
    private static final NSMutableArray _sharedObjectsLoadedInModels;
    private final ReferenceQueue _refQueueForHandlers;
    public static final String DatabaseChannelNeededNotification = "EODatabaseChannelNeededNotification";
    public static final String CustomQueryExpressionHintKey = "EOCustomQueryExpressionHintKey";
    public static final String StoredProcedureNameHintKey = "EOStoredProcedureNameHintKey";
    private static final NSSelector _beginTransactionSelector;
    private static final NSSelector _commitTransactionSelector;
    private static final NSSelector _rollbackTransactionSelector;
    private static final NSSelector _defaultDelegateSelector;
    private static final NSSelector _snapshotsChangedInDatabaseSelector;
    private static final NSSelector _objectsChangedSelector;
    private static final NSSelector _cooperatingObjectStoreNeededSelector;
    private static final NSSelector _registeredDatabaseContextForModelSelector;
    private static final NSSelector _editingContextShouldContinueFetchingSelector;
    private static final NSSelector _entityNamedSelector;
    private static final NSSelector _recordChangesInEditingContextSelector;
    private static final NSSelector _recordUpdateForObjectChangesSelector;
    private static final NSSelector _performChangesSelector;
    private static final NSSelector _commitChangesSelector;
    private static volatile Object _defaultDatabaseContextDelegate;
    protected static volatile boolean _IsEventLoggingEnabled;
    protected static Class _contextClassToRegister;
    protected static boolean _suppressRedundantEODatabaseChangeNotification;
    private static boolean warnedOnce;
    public static final String DatabaseContextKey = "EODatabaseContextKey";
    public static final String DatabaseOperationsKey = "EODatabaseOperationsKey";
    public static final String FailedDatabaseOperationKey = "EOFailedDatabaseOperationKey";
    private static final String _EOFRootEntityString_ = "__EOF_root__";
    private static final String entityOrderingKey = "EOEntityOrdering";

}

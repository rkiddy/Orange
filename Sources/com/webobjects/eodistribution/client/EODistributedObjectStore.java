
package com.webobjects.eodistribution.client;

import com.webobjects.eocontrol.*;
import com.webobjects.eodistribution.common.*;
import com.webobjects.foundation.*;
import java.util.Enumeration;
import java.util.Iterator;
import java.util.concurrent.locks.ReentrantLock;


public class EODistributedObjectStore extends EOObjectStore
    implements com.webobjects.eodistribution.common._EODistributionCallbacks.ObjectStore {
    private static class _ClientDatabaseRecord {


        _ClientDatabaseRecord() { return null; }

        NSArray properties;
        NSMutableDictionary toManyMap;
        int retainCount;
        EOGlobalID gid;

    }



    public void lock() {}

    public void unlock() {}

    public EODistributedObjectStore(EODistributionChannel channel) { return null; }

    public synchronized EOClassDescription classDescriptionForGlobalID(EOGlobalID globalID) { return null; }

    public synchronized NSArray snapshotForSourceGlobalID(EOGlobalID globalID, String relationshipName) { return null; }

    public EOEnterpriseObject faultForGlobalID(EOGlobalID globalID, EOEditingContext editingContext) { return null; }

    public EOEnterpriseObject faultForRawRow(NSDictionary row, String entityName, EOEditingContext editingContext) { return null; }

    public NSArray arrayFaultWithSourceGlobalID(EOGlobalID globalID, String relationshipName, EOEditingContext editingContext) { return null; }

    public synchronized void initializeObject(EOEnterpriseObject object, EOGlobalID globalID, EOEditingContext editingContext) { return null; }

    public synchronized NSArray objectsForSourceGlobalID(EOGlobalID globalID, String relationshipName, EOEditingContext editingContext) { return null; }

    public void refaultObject(EOEnterpriseObject object, EOGlobalID globalID, EOEditingContext editingContext) {}

    private NSArray _provideAndCleanReleasedSnapshotGIDs() { return null; }

    private _EOServerInvocation _buildPushInvocation() { return null; }

    public synchronized void saveChangesInEditingContext(EOEditingContext editingContext) { return null; }

    private void _processArray(String keyPath, NSArray anchor, NSArray feedData) {}

    private void _processObject(String keyPath, EOEnterpriseObject anchor, Object feedData) {}

    public synchronized NSArray objectsWithFetchSpecification(EOFetchSpecification fetchSpecification, EOEditingContext editingContext) { return null; }

    public EODistributionChannel distributionChannel() { return null; }

    private boolean _checkReturnValuesForExceptions(NSArray returnValues) { return true; }

    private synchronized NSArray _send(NSArray invocations) { return null; }

    private Object _send(_EOServerInvocation invocation) { return null; }

    public Object _replacementObjectForEncodedObject(Object object) { return null; }

    public Object _replacementObjectForDecodedObject(Object object) { return null; }

    private EOEnterpriseObject initializeReplacementObject(EOGlobalID globalID, EOClassDescription cd) { return null; }

    public boolean isObjectLockedWithGlobalID(EOGlobalID globalID, EOEditingContext editingContext) { return true; }

    public void lockObjectWithGlobalID(EOGlobalID globalID, EOEditingContext editingContext) {}

    public synchronized void invalidateAllObjects() { return null; }

    private synchronized void invalidateObjectsWithGlobalIDs(NSArray globalIDs, boolean notify) { return null; }

    public void invalidateObjectsWithGlobalIDs(NSArray globalIDs) {}

    public Object invokeRemoteMethod(EOEditingContext editingContext, EOGlobalID globalID, String methodName, Class argumentTypes[], Object arguments[]) { return null; }

    public synchronized Object invokeRemoteMethod(EOEditingContext editingContext, EOGlobalID globalID, String methodName, Class argumentTypes[], Object arguments[], boolean shouldPush) { return null; }

    public synchronized Object invokeRemoteMethodWithKeyPath(EOEditingContext editingContext, String keyPath, String methodName, Class argumentTypes[], Object arguments[], boolean shouldPush) { return null; }

    public synchronized Object invokeStatelessRemoteMethodWithKeyPath(String keyPath, String methodName, Class argumentTypes[], Object arguments[]) { return null; }

    protected boolean _invalidateObjectsDuringSave() { return true; }

    synchronized void _fireFault(EOEnterpriseObject eo, EODistributedFaultHandler faultHandler) {}

    synchronized void _fireArrayFault(_EOCheapCopyMutableArray array, EODistributedArrayFaultHandler faultHandler) {}

    synchronized Object _fireDeferredFault(EOEnterpriseObject eo, EORelationship relationship) { return null; }

    public synchronized void _classDescriptionNeededForEntityName(NSNotification notification) { return null; }

    public synchronized EOFetchSpecification _fetchSpecificationByName(String entityName, String fetchSpecName) { return null; }

    public void _classDescriptionNeededForClass(NSNotification notification) {}

    public void _collectChangesFromServer() {}

    public void _serverUpdate(NSNotification notification) {}

    public synchronized void _globalIDChanged(NSNotification notification) { return null; }

    public void editingContextDidForgetObjectWithGlobalID(EOEditingContext editingContext, EOGlobalID globalID) {}

    public synchronized int _snapshotCountForGlobalID(EOGlobalID gid) { return null; }

    synchronized void incrementSnapshotCountForGlobalID(EOGlobalID gid) {}

    private void _deleteSnapshotForGlobalID(EOGlobalID gid) {}

    synchronized void decrementSnapshotCountForGlobalID(EOGlobalID gid) {}

    private void _clearSnapshotForGlobalID(EOGlobalID gid) {}

    private void clearSnapshotsForGlobalIDs(NSArray array) {}

    synchronized void clearAllSnapshots() {}

    static  {}

    public static final Class _CLASS;
    private static final NSSelector _classDescriptionNeededForEntityNameSelector;
    private static final NSSelector _classDescriptionNeededForClassSelector;
    private static final NSSelector _globalIDChangedSelector;
    private static final NSSelector _serverUpdateSelector;
    private EODistributionChannel _channel;
    private _EOReferenceRecordingCoder _coder;
    private NSMutableDictionary _cache;
    private NSMutableArray _releasedSnapshots;
    private NSMutableDictionary _classDescriptionByGlobalID;
    private EOEditingContext _currentEditingContext;
    private ReentrantLock _lock;


    // Unreferenced inner class com/webobjects/eodistribution/client/EODistributedObjectStore$1

/* anonymous class */
    class _cls1 extends NSComparator {


        _cls1() { return null; }

        public int compare(Object object1, Object object2) throws com.webobjects.foundation.NSComparator.ComparisonException { return 0; }

        final EODistributedObjectStore this$0;

    }

}

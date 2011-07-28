
package com.webobjects.eoaccess;

import com.webobjects.eocontrol.EOEnterpriseObject;
import com.webobjects.eocontrol.EOGlobalID;
import com.webobjects.foundation.*;
import java.util.Enumeration;
import java.util.Iterator;


public class EODatabase
    implements NSDisposable {
    private static class _ToManyRecord {


        _ToManyRecord() { return null; }

        long timestamp;
        Object gids;

    }

    protected static class _DatabaseRecord {


        _DatabaseRecord() { return null; }

        public String toString() { return null; }

        NSDictionary snapshot;
        NSMutableDictionary toManyMap;
        long timestamp;
        int retainCount;
        EOGlobalID recordedGID;

    }

    public static interface ClassDelegate {

        public abstract EODatabase newDatabaseForModel(EOModel eomodel);
    }



    public EODatabase(EOAdaptor adaptor) { return null; }

    public EODatabase(EOModel model) { return null; }

    public static void setClassDelegate(Object delegate) { return null; }

    public static Object classDelegate() { return null; }

    public static EODatabase newDatabase(EOModel model) { return null; }

    public void dispose() {}

    public EOAdaptor adaptor() { return null; }

    protected void _clearLastRecords() {}

    protected _DatabaseRecord _fastHashGet(EOGlobalID gid) { return null; }

    protected void _fastHashInsert(_DatabaseRecord rec, EOGlobalID gid) {}

    protected void _fastHashRemove(EOGlobalID gid) {}

    protected EOGlobalID _recordedGIDForSnapshotWithGid(EOGlobalID gid) { return null; }

    public void setTimestampToNow() {}

    public NSArray resultCacheForEntityNamed(String name) { return null; }

    protected NSSet _cachedFetchAttributesForEntityNamed(String name) { return null; }

    protected void _setTimestampForCachedGlobalID(EOGlobalID gid) {}

    public void setResultCache(NSArray cache, String name) {}

    public void invalidateResultCacheForEntityNamed(String name) {}

    public void invalidateResultCache() {}

    public int _indexOfRegisteredContext(EODatabaseContext context) { return 0; }

    public NSArray registeredContexts() { return null; }

    public void registerContext(EODatabaseContext context) {}

    public void unregisterContext(EODatabaseContext context) {}

    public void addModel(EOModel model) {}

    public boolean addModelIfCompatible(EOModel model) { return true; }

    public void removeModel(EOModel model) {}

    public NSArray models() { return null; }

    public EOEntity entityNamed(String entityName) { return null; }

    public EOEntity entityForObject(EOEnterpriseObject object) { return null; }

    public void handleDroppedConnection() {}

    public void recordSnapshotForGlobalID(NSDictionary snapshot, EOGlobalID gid) {}

    public void recordSnapshots(NSDictionary snapshots) {}

    public void recordToManySnapshots(NSDictionary snapshots) {}

    public void recordSnapshotForSourceGlobalID(NSArray gids, EOGlobalID gid, String name) {}

    public NSArray snapshotForSourceGlobalID(EOGlobalID gid, String name) { return null; }

    public NSArray snapshotForSourceGlobalID(EOGlobalID gid, String name, long timestamp) { return null; }

    public long timestampForSourceGlobalID(EOGlobalID gid, String name) { return 0L; }

    public void _forgetSnapshotForGlobalID(EOGlobalID gid) {}

    public void forgetSnapshotForGlobalID(EOGlobalID gid) {}

    public void forgetSnapshotsForGlobalIDs(NSArray array) {}

    public void forgetAllSnapshots() {}

    public long timestampForGlobalID(EOGlobalID gid) { return 0L; }

    public NSDictionary snapshotForGlobalID(EOGlobalID gid) { return null; }

    public NSDictionary snapshotForGlobalID(EOGlobalID gid, long timestamp) { return null; }

    public void _globalIDChanged(NSNotification notification) {}

    public NSDictionary snapshots() { return null; }

    public int _snapshotCountForGlobalID(EOGlobalID gid) { return 0; }

    public void incrementSnapshotCountForGlobalID(EOGlobalID gid) {}

    public void decrementSnapshotCountForGlobalID(EOGlobalID gid) {}

    public static void disableSnapshotRefCounting() { return null; }

    protected void _freeToManyMap(_DatabaseRecord rec) {}

    static  {}

    protected NSMutableArray _registeredContexts;
    protected NSMutableDictionary _snapshots;
    protected NSMutableArray _models;
    protected NSMutableDictionary _entityCache;
    protected NSMutableDictionary _entityFetchAttributesCache;
    protected EOAdaptor _adaptor;
    protected long _timestamp;
    protected _DatabaseRecord _lastRec;
    protected EOGlobalID _lastGID;
    protected EOEntity _lastEntity;
    static final long DistantPastTimeInterval;
    static final long DistantFutureTimeInterval;
    static final int DefaultSnapshotCacheSize = 1024;
    private static final NSSelector _globalIDChangedSelector;
    private static final _NSDelegate _databaseClassDelegate;
    protected static boolean _doesReleaseUnreferencedSnapshots;

}

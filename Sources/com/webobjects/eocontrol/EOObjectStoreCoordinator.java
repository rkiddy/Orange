
package com.webobjects.eocontrol;

import com.webobjects.foundation.*;
import java.util.Iterator;
import java.util.concurrent.locks.ReentrantLock;


public class EOObjectStoreCoordinator extends EOObjectStore {


    public static synchronized EOObjectStoreCoordinator defaultCoordinator() { return null; }

    public static synchronized void setDefaultCoordinator(EOObjectStoreCoordinator coordinator) { return null; }

    public EOObjectStoreCoordinator() { return null; }

    public void dispose() {}

    private NSArray _sources() { return null; }

    public NSArray cooperatingObjectStores() { return null; }

    public void addCooperatingObjectStore(EOCooperatingObjectStore objectStore) {}

    public void removeCooperatingObjectStore(EOCooperatingObjectStore objectStore) {}

    private void requestStore(EOGlobalID gid, EOFetchSpecification fetchSpecification, EOEnterpriseObject object) {}

    public EOCooperatingObjectStore objectStoreForGlobalID(EOGlobalID gid) { return null; }

    public EOCooperatingObjectStore objectStoreForObject(EOEnterpriseObject object) { return null; }

    public EOCooperatingObjectStore objectStoreForFetchSpecification(EOFetchSpecification fetchSpecification) { return null; }

    EOCooperatingObjectStore objectStoreForEntityNamed(String entityName) { return null; }

    public void forwardUpdateForObject(EOEnterpriseObject object, NSDictionary changes) {}

    public NSDictionary valuesForKeys(NSArray keys, EOEnterpriseObject object) { return null; }

    public void saveChangesInEditingContext(EOEditingContext context) {}

    public void lock() {}

    public ReentrantLock _lock() { return null; }

    public void unlock() {}

    public NSArray objectsWithFetchSpecification(EOFetchSpecification fetchSpecification, EOEditingContext editingContext) { return null; }

    public boolean isObjectLockedWithGlobalID(EOGlobalID gid, EOEditingContext editingContext) { return true; }

    public void lockObjectWithGlobalID(EOGlobalID gid, EOEditingContext editingContext) {}

    public EOEnterpriseObject faultForGlobalID(EOGlobalID gid, EOEditingContext editingContext) { return null; }

    public EOEnterpriseObject faultForRawRow(NSDictionary row, String entityName, EOEditingContext editingContext) { return null; }

    public NSArray arrayFaultWithSourceGlobalID(EOGlobalID gid, String relationshipName, EOEditingContext editingContext) { return null; }

    public void initializeObject(EOEnterpriseObject object, EOGlobalID gid, EOEditingContext editingContext) {}

    public void editingContextDidForgetObjectWithGlobalID(EOEditingContext editingContext, EOGlobalID gid) {}

    public NSArray objectsForSourceGlobalID(EOGlobalID gid, String relationshipName, EOEditingContext editingContext) { return null; }

    public void refaultObject(EOEnterpriseObject object, EOGlobalID gid, EOEditingContext editingContext) {}

    public void invalidateObjectsWithGlobalIDs(NSArray gids) {}

    public void invalidateAllObjects() {}

    public void _objectsChangedInSubStore(NSNotification notification) {}

    public void _globalIDsChangedInSubStore(NSNotification notification) {}

    public void _invalidatedAllObjectsInSubStore(NSNotification notification) {}

    static  {}

    public static final Class _CLASS;
    public static final String CooperatingObjectStoreWasAddedNotification = "EOCooperatingObjectStoreWasAddedNotification";
    public static final String CooperatingObjectStoreWasRemovedNotification = "EOCooperatingObjectStoreWasRemovedNotification";
    public static final String CooperatingObjectStoreNeededNotification = "EOCooperatingObjectStoreNeededNotification";
    public static final String GlobalIDKey = "globalID";
    public static final String FetchSpecificationKey = "fetchSpecification";
    public static final String ObjectKey = "object";
    private static final NSSelector _objectsChangedInSubStoreSelector;
    private static final NSSelector _invalidatedAllObjectsInSubStoreSelector;
    private static final NSSelector _globalIDsChangedInSubStoreSelector;
    private static EOObjectStoreCoordinator _defaultCoordinator;
    private NSMutableArray _sources;
    private transient NSArray _sourcesImmutableClone;
    private transient int _lockCount;
    private transient ReentrantLock _lock;

}

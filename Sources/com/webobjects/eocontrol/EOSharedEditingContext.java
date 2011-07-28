
package com.webobjects.eocontrol;

import com.webobjects.foundation.*;
import java.io.*;
import java.util.Enumeration;
import java.util.concurrent.locks.ReentrantReadWriteLock;


public class EOSharedEditingContext extends EOEditingContext {


    public static synchronized EOSharedEditingContext defaultSharedEditingContext() { return null; }

    public static synchronized EOSharedEditingContext _defaultSharedEditingContext() { return null; }

    public static synchronized void setDefaultSharedEditingContext(EOSharedEditingContext context) { return null; }

    public EOSharedEditingContext(EOObjectStore parent) { return null; }

    public EOSharedEditingContext() { return null; }

    protected void _initWithParentObjectStore(EOObjectStore parent) {}

    public NSDictionary objectsByEntityName() { return null; }

    public NSDictionary objectsByEntityNameAndFetchSpecificationName() { return null; }

    public void reset() {}

    public void dispose() {}

    public EOSharedEditingContext sharedEditingContext() { return null; }

    public void setSharedEditingContext(EOSharedEditingContext sharedEditingContext) {}

    public void setUndoManager(NSUndoManager undoManager) {}

    public EOGlobalID globalIDForObject(EOEnterpriseObject object) { return null; }

    public EOEnterpriseObject objectForGlobalID(EOGlobalID gid) { return null; }

    public EOEnterpriseObject faultForGlobalID(EOGlobalID gid, EOEditingContext editingContext) { return null; }

    private void _registerObjectsOfEntityName(NSArray objects, String entityName, String fetchSpecificationName) {}

    public NSArray objectsWithFetchSpecification(EOFetchSpecification fetchSpecification, EOEditingContext editingContext) { return null; }

    public void bindObjectsWithFetchSpecification(EOFetchSpecification fetchSpecification, String fetchSpecificationName) {}

    public void _processGlobalIDChanges(NSDictionary nsdictionary) {}

    public void initializeObject(EOEnterpriseObject object, EOGlobalID gid, EOEditingContext editingContext) {}

    public void _resetAllChanges() {}

    public void _processObjectStoreChanges(NSDictionary info) {}

    public void forgetObject(EOEnterpriseObject object) {}

    public void _completeRefaultingOfGID(EOGlobalID gid, EOEnterpriseObject object) {}

    public void refaultObject(EOEnterpriseObject object, EOGlobalID gid, EOEditingContext editingContext) {}

    public void refaultAllObjects() {}

    public void invalidateObjectsWithGlobalIDs(NSArray gids) {}

    public void invalidateAllObjects() {}

    public boolean _processRecentChanges() { return true; }

    public NSArray updatedObjects() { return null; }

    public NSArray insertedObjects() { return null; }

    public NSArray deletedObjects() { return null; }

    public boolean hasChanges() { return true; }

    public void validateChangesForSave() {}

    public NSArray registeredObjects() { return null; }

    public void objectWillChange(Object object) {}

    protected void _insertObjectWithGlobalID(EOEnterpriseObject object, EOGlobalID gid) {}

    public void insertObjectWithGlobalID(EOEnterpriseObject object, EOGlobalID gid) {}

    public void insertObject(EOEnterpriseObject object) {}

    public void deleteObject(EOEnterpriseObject object) {}

    public void saveChanges() {}

    public void lockObjectStore() {}

    public void unlockObjectStore() {}

    public void lock() {}

    public boolean tryLock() { return true; }

    public void unlock() {}

    public void lockForReading() {}

    public boolean tryLockForReading() { return true; }

    public void unlockForReading() {}

    public void suspendReaderLocks() {}

    public void retrieveReaderLocks() {}

    public void _EOAssertSafeMultiThreadedAccess(String info) {}

    public void _EOAssertSafeMultiThreadedReadAccess(String info) {}

    private void writeObject(ObjectOutputStream s) throws IOException {}

    private void readObject(ObjectInputStream s) throws IOException, ClassNotFoundException {}

    static  {}

    static final long serialVersionUID = 0x4ba9ca2L;
    private static final String SerializationGIDArrayFieldKey = "initedGIDs";
    private static final String SerializationObjectsByEntityFieldKey = "objectsByEntity";
    private static final String SerializationObjectsByEntityFetchSpecFieldKey = "objectsByEntityFS";
    private static final Class _NSMutableDictionaryClass;
    public static final Class _CLASS;
    private static boolean _hasInitializedDefaultEditingContext;
    private static EOSharedEditingContext _defaultSharedEditingContext;
    public static final String DefaultSharedEditingContextWasInitializedNotification = "EODefaultSharedEditingContextWasInitializedNotification";
    public static final String SharedEditingContextInitializedObjectsNotification = "EOSharedEditingContextInitializedObjectsNotification";
    private transient ReentrantReadWriteLock _sharedLock;
    private NSMutableArray _initializedGlobalIDs;
    private NSMutableDictionary _objectsByEntity;
    private NSMutableDictionary _objectsByEntityFetchSpecification;
    private static final ObjectStreamField serialPersistentFields[];

}

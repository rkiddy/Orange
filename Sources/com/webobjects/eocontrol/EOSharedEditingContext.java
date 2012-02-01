package com.webobjects.eocontrol;
/**
 * The EOSharedEditingContext class defines a mechanism that allows EOEditingContexts to share enterprise objects for reading. This mechanism can reduce redundant data and the number of fetches an application requires.
 * Shared enterprise objects are read-only and persist for the life of the application; they can't be modified or deleted. They must be unique in the shared context and across all other editing contexts that share objects from the shared context.
 * Objects can be fetched into a shared context using objectsWithFetchSpecification and bindObjectsWithFetchSpecification. The latter method makes it easier to access result sets, using objectsByEntityNameAndFetchSpecificationName.
 * In multithreaded applications, shared objects can be used safely by many threads at once. Shared editing contexts use NSMultiReaderLocks to maintain thread safety. The methods objectsWithFetchSpecification bindObjectsWithFetchSpecification, faultForGlobalID, and objectForGlobalID are thread safe, but the context must be locked before using any other shared context API.
 * It is possible to modify shared objects while an application is running, but only indirectly. A regular editing context can be created that doesn't share objects by setting it's sharedEditingContext to null. Fetch the object that is to be changed into the regular context, modify or delete it, and save. Since shared editing contexts listen for ObjectsChangedInStoreNotifications, the shared editing context updates when it learns that an object was modified. The shared context removes from its objectsByEntityName and objectsByEntityNameAndFetchSpecificationName dictionaries any objects that have been deleted, and it refaults any objects that have been updated. However, to register newly inserted objects in the shared editing context, it should be refetched.
 * See Also:EOSharedEditingContext.objectsByEntityName(), EOSharedEditingContext.objectsByEntityNameAndFetchSpecificationName(), EOSharedEditingContext.bindObjectsWithFetchSpecification(com.webobjects.eocontrol.EOFetchSpecification, java.lang.String), EOSharedEditingContext.objectsWithFetchSpecification(com.webobjects.eocontrol.EOFetchSpecification, com.webobjects.eocontrol.EOEditingContext), EOSharedEditingContext.DefaultSharedEditingContextWasInitializedNotification, EOSharedEditingContext.SharedEditingContextInitializedObjectsNotification, Serialized Form
 */
public class EOSharedEditingContext extends com.webobjects.eocontrol.EOEditingContext{
    /**
     * Posted when an EOSharedEditingContext is created and assigned as the default shared editing context.
     * Notification Object None userInfo Dictionary None
     * See Also:EOSharedEditingContext.defaultSharedEditingContext(), Constant Field Values
     */
    public static final java.lang.String DefaultSharedEditingContextWasInitializedNotification="EODefaultSharedEditingContextWasInitializedNotification";

    /**
     * Posted when new objects are added to a shared editing context (by fetching or fault firing).
     * Notification Object The shared editing context userInfo Dictionary NSArray of global IDs of the initialized objects
     * See Also:Constant Field Values
     */
    public static final java.lang.String SharedEditingContextInitializedObjectsNotification="EOSharedEditingContextInitializedObjectsNotification";

    /**
     * Creates a new EOSharedEditingContext object with the default parent object store as its parent object store.
     * See Also:EOEditingContext.defaultParentObjectStore()
     */
    public EOSharedEditingContext(){
         //TODO codavaj!!
    }

    /**
     * Creates a new EOSharedEditingContext with a specified EOObjectStoreCoordinator as the parent EOObjectStore.
     * Parameters:parent - must be an EOObjectStoreCoordinator Throws: IllegalArgumentException - if parent is not an object store coordinatorSee Also:EOSharedEditingContext.EOSharedEditingContext()
     */
    public EOSharedEditingContext(com.webobjects.eocontrol.EOObjectStore parent){
         //TODO codavaj!!
    }

    /**
     * Fetches objects with fetchSpecification and binds the results to fetchSpecification's entity and fetchSpecification's name, which is provided with the fetchSpecificationName argument. The resulting shared objects can later be retrieved using the methods objectsByEntityName and objectsByEntityNameAndFetchSpecificationName.
     */
    public void bindObjectsWithFetchSpecification(com.webobjects.eocontrol.EOFetchSpecification fetchSpecification, java.lang.String fetchSpecificationName){
        return; //TODO codavaj!!
    }

    /**
     * If a shared context hasn't yet been created, this method creates one and posts a DefaultSharedEditingContextWasInitializedNotification.
     */
    public static com.webobjects.eocontrol.EOSharedEditingContext defaultSharedEditingContext(){
        return null; //TODO codavaj!!
    }

    /**
     * The shared objects in a shared editing context can't be deleted.
     */
    public com.webobjects.foundation.NSArray deletedObjects(){
        return null; //TODO codavaj!!
    }

    /**
     * Raises an exception. Objects in a shared editing context cannot be modified or be deleted.
     */
    public void deleteObject(com.webobjects.eocontrol.EOEnterpriseObject object){
        return; //TODO codavaj!!
    }

    /**
     * Description copied from interface:
     * Invoked when the receiver should prepare itself for destruction. Implementations of this method should break connections that other objects have to the receiver, including unregistering for notifications, resigning as other objects' delegates, release locks and system resources, close files, and any other clean up operations.
     */
    public void dispose(){
        return; //TODO codavaj!!
    }

    /**
     * Description copied from class:
     * Overrides the implementation inherited from EOObjectStore. If the object associated with globalID is already registered in this EOEditingContext (or its shared context), this method returns that object. Otherwise, the method propagates the message up the object store hierarchy, through the parent object store, ultimately to the associated EODatabaseContext. The EODatabaseContext creates and returns a to-one fault. For example, suppose you want the department object whose deptID has a particular value. The most efficient way to get it is to look it up by its globalID using faultForGlobalID. If the department object is already registered in the EOEditingContext, faultForGlobalID returns that object (without going to the database). If not, a fault for this object is created, and the object is fetched from the database only when you trigger the fault. In a nested editing context configuration, where a parent EOEditingContext is sent faultForGlobalID on behalf of a child EOEditingContext and globalID identifies a newly inserted object in the parent, the parent registers a copy of the object in the child.
     * For more information refer to: "Working with Objects Across Multiple EOEditingContexts"
     */
    public com.webobjects.eocontrol.EOEnterpriseObject faultForGlobalID(com.webobjects.eocontrol.EOGlobalID gid, com.webobjects.eocontrol.EOEditingContext editingContext){
        return null; //TODO codavaj!!
    }

    /**
     * Description copied from class:
     * Removes object from the uniquing tables and causes this EOEditingContext to remove itself from the object's list of observers. You should never invoke this method directly. The correct way to remove an object from its editing context is to remove every reference to the object by refaulting any object that references it (using refaultAllObjects or invalidateAllObjects). Also note that this method does not have the effect of deleting an object. In order to delete an object, you should either use the deleteObject method or remove the object from an owning relationship.
     */
    public void forgetObject(com.webobjects.eocontrol.EOEnterpriseObject object){
        return; //TODO codavaj!!
    }

    /**
     * Description copied from class:
     * Returns the EOGlobalID associated with object in this EOEditingContext or its shared context. All objects fetched from an external store are registered in an EOEditingContext along with a global identifier (EOGlobalID) that's used to uniquely identify each object to the external store. If object has not been registered in the EOEditingContext or in its shared editing context (that is, if no match is found), this method returns null. Objects are registered in an EOEditingContext using the insertObject method, or when fetching, with recordObject.
     */
    public com.webobjects.eocontrol.EOGlobalID globalIDForObject(com.webobjects.eocontrol.EOEnterpriseObject object){
        return null; //TODO codavaj!!
    }

    /**
     * Shared objects in a shared editing context cannot be modified or be deleted.
     */
    public boolean hasChanges(){
        return false; //TODO codavaj!!
    }

    /**
     * Description copied from class:
     * Overrides the implementation inherited from EOObjectStore to build the properties for the object identified by gid. When a parent EOEditingContext receives this on behalf of a child EOEditingContext (as represented by context), and the gid identifies an object instantiated in the parent, the parent returns properties extracted from its object and translated into the child's context. This ensures that a nested context "inherits" modified values from its parent EOEditingContext. If this EOEditingContext does not have object, the request is forwarded its parent EOObjectStore.
     */
    public void initializeObject(com.webobjects.eocontrol.EOEnterpriseObject object, com.webobjects.eocontrol.EOGlobalID gid, com.webobjects.eocontrol.EOEditingContext editingContext){
        return; //TODO codavaj!!
    }

    /**
     * You can't insert objects into a shared editing context.
     */
    public com.webobjects.foundation.NSArray insertedObjects(){
        return null; //TODO codavaj!!
    }

    /**
     * Throws an exception. You cannot insert objects into an EOSharedEditingContext. You should fetch or fault objects into the shared context.
     */
    public void insertObject(com.webobjects.eocontrol.EOEnterpriseObject object){
        return; //TODO codavaj!!
    }

    /**
     * Throws an exception. You cannot insert objects into an EOSharedEditingContext. You should fetch or fault objects into the shared context.
     */
    public void insertObjectWithGlobalID(com.webobjects.eocontrol.EOEnterpriseObject object, com.webobjects.eocontrol.EOGlobalID gid){
        return; //TODO codavaj!!
    }

    /**
     * Description copied from class:
     * Overrides the implementation inherited from EOObjectStore to discard the values of objects cached in memory and refault them, which causes them to be refetched from the external store the next time they're accessed. This method sends the message invalidateObjectsWithGlobalIDs to the parent object store with the globalIDs of all of the objects cached in the receiver. When an EOEditingContext receives this message, it propagates the message down the object store hierarchy. EODatabaseContexts discard their snapshots for invalidated objects and broadcast an ObjectsChangedInStoreNotification. (EODatabaseContext is defined in EOAccess.)
     * The final effect of this method is to refault all objects currently in memory. The next time you access one of these objects, it's refetched from the database. To flush the entire application's cache of all values fetched from an external store, you have to use a statement such as the following:
     * EOEditingContext.rootObjectStore().invalidateAllObjects(); If you just want to discard uncommitted changes but do not want to sacrifice the values cached in memory, the EOEditingContext revert method is to be used, which reverses all changes and clears the undo stack.
     * For more information, see the sections:
     */
    public void invalidateAllObjects(){
        return; //TODO codavaj!!
    }

    /**
     * Description copied from class:
     * Overrides the implementation inherited from EOObjectStore to signal to the parent object store that the cached values for the objects identified by globalIDs should no longer be considered valid and that they should be refaulted. Invokes processRecentChanges before refaulting the objects. This message is propagated to any underlying object store, resulting in a refetch the next time the objects are accessed. Any related (child or peer) object stores are notified that the objects are no longer valid. All uncommitted changed to the objects are lost.
     * For more information, see the sections:
     */
    public void invalidateObjectsWithGlobalIDs(com.webobjects.foundation.NSArray gids){
        return; //TODO codavaj!!
    }

    /**
     * Acquires a writer lock to this EOSharedEditingContext to prevent other threads from accessing it.
     */
    public void lock(){
        return; //TODO codavaj!!
    }

    /**
     * Locks the receiver for reading. If the lock is unavailable, it waits.
     */
    public void lockForReading(){
        return; //TODO codavaj!!
    }

    public void lockObjectStore(){
        return; //TODO codavaj!!
    }

    /**
     * Description copied from class:
     * Returns the EOEnterpriseObject associated with gid in this EOEditingContext or its shared context, or null if no such object exists.
     */
    public com.webobjects.eocontrol.EOEnterpriseObject objectForGlobalID(com.webobjects.eocontrol.EOGlobalID gid){
        return null; //TODO codavaj!!
    }

    /**
     * The dictionary keys are entity names and the corresponding values are NSArrays of enterprise objects for that entity.
     */
    public com.webobjects.foundation.NSDictionary objectsByEntityName(){
        return null; //TODO codavaj!!
    }

    /**
     * Returns the objects fetched into the receiver with bindObjectsWithFetchSpecification. The return value is a dictionary whose keys are entity names and whose values are subdictionaries. The keys of the subdictionaries are fetch specification names, and the values are NSArrays of the enterprise objects fetched with the corresponding fetch specification. The fetch specification names are the names specified in bindObjectsWithFetchSpecification. Generally these names are the same names used to identify stored fetch specifications in EOModeler.
     */
    public com.webobjects.foundation.NSDictionary objectsByEntityNameAndFetchSpecificationName(){
        return null; //TODO codavaj!!
    }

    /**
     * A thread-safe version of the superclass implementation that binds the results to fetchSpecification's entity. The resulting shared objects can be retrieved later using the method objectsByEntityName.
     */
    public com.webobjects.foundation.NSArray objectsWithFetchSpecification(com.webobjects.eocontrol.EOFetchSpecification fetchSpecification, com.webobjects.eocontrol.EOEditingContext editingContext){
        return null; //TODO codavaj!!
    }

    /**
     * Raises an exception. You can't modify the shared objects in a shared editing context.
     */
    public void objectWillChange(java.lang.Object object){
        return; //TODO codavaj!!
    }

    /**
     * Description copied from class:
     * Refaults all objects cached in this EOEditingContext that have not been inserted, deleted, or updated. Invokes processRecentChanges, then invokes refaultObject for all objects that haven't been inserted, deleted, or updated.
     */
    public void refaultAllObjects(){
        return; //TODO codavaj!!
    }

    /**
     * Description copied from class:
     * Overrides the implementation inherited from EOObjectStore to refault the enterprise object object identified by gid in ctx. This method should be used with caution since refaulting an object does not remove the object snapshot from the undo stack. Objects that have been newly inserted or deleted should not be refaulted.
     * The main purpose of this method is to break reference cycles between enterprise objects. For example, suppose you have an Employee object that has a to-one relationship to its Department, and the Department object in turn has an array of Employee objects. You can use this method to break the reference cycle. Note that reference cycles are automatically broken if the EOEditingContext is finalized.
     * For more information, see the sections:
     */
    public void refaultObject(com.webobjects.eocontrol.EOEnterpriseObject object, com.webobjects.eocontrol.EOGlobalID gid, com.webobjects.eocontrol.EOEditingContext editingContext){
        return; //TODO codavaj!!
    }

    public com.webobjects.foundation.NSArray registeredObjects(){
        return null; //TODO codavaj!!
    }

    /**
     * Overrides the superclass implementation to do nothing.
     */
    public void reset(){
        return; //TODO codavaj!!
    }

    /**
     * Reinstates the current thread's reader locks that have been suspended using suspendReaderLocks.
     */
    public void retrieveReaderLocks(){
        return; //TODO codavaj!!
    }

    /**
     * Raises an exception. You can't modify the shared objects in a shared editing context.
     */
    public void saveChanges(){
        return; //TODO codavaj!!
    }

    /**
     * Sets the default shared editing context. If context is null, object sharing is disabled in subsequently created EOEditingContexts.
     * This has no effect on previously created EOEditingContexts.
     */
    public static void setDefaultSharedEditingContext(com.webobjects.eocontrol.EOSharedEditingContext context){
        return; //TODO codavaj!!
    }

    /**
     * Raises an exception unless sharedEditingContext is null.
     */
    public void setSharedEditingContext(com.webobjects.eocontrol.EOSharedEditingContext sharedEditingContext){
        return; //TODO codavaj!!
    }

    /**
     * Raises an exception unless undoManager is null.
     */
    public void setUndoManager(com.webobjects.foundation.NSUndoManager undoManager){
        return; //TODO codavaj!!
    }

    /**
     * Always returns null
     */
    public com.webobjects.eocontrol.EOSharedEditingContext sharedEditingContext(){
        return null; //TODO codavaj!!
    }

    /**
     * Temporarily relinquishes all of the current thread's reader locks, releasing the lock if all reader locks are unlocked. To reinstate the current thread's suspended reader locks, use the retrieveReaderLocks method.
     */
    public void suspendReaderLocks(){
        return; //TODO codavaj!!
    }

    /**
     * Attempts to take the lock on this EOSharedEditingContext for writing. However, instead of waiting until the lock is available, it returns immediately with false if it fails.
     */
    public boolean tryLock(){
        return false; //TODO codavaj!!
    }

    /**
     * Attempts to take the lock on this EOSharedEditingContext for reading. However, instead of waiting until the lock is available, it returns immediately with false if it fails.
     */
    public boolean tryLockForReading(){
        return false; //TODO codavaj!!
    }

    /**
     * Releases a previously acquired lock for writing on this EOSharedEditingContext.
     */
    public void unlock(){
        return; //TODO codavaj!!
    }

    /**
     * Releases a previously acquired lock for reading on this EOSharedEditingContext.
     */
    public void unlockForReading(){
        return; //TODO codavaj!!
    }

    public void unlockObjectStore(){
        return; //TODO codavaj!!
    }

    /**
     * Returns an empty array. You can't modify objects that are in a shared editing context.
     */
    public com.webobjects.foundation.NSArray updatedObjects(){
        return null; //TODO codavaj!!
    }

    /**
     * Overrides the superclass implementation to do nothing.
     */
    public void validateChangesForSave(){
        return; //TODO codavaj!!
    }

}

package com.webobjects.eocontrol;
/**
 * EOObjectStore is the abstract class that defines the API for an intelligent repository of objects, the control layer's object storage abstraction. An object store is responsible for constructing and registering objects, servicing object faults, and saving changes made to objects. For more information on the object storage abstraction, see Object Storage Abstraction in the introduction to the EOControl Framework.
 * EOEditingContext is the principal EOObjectStore subclass and is used for managing objects in memory. In fact, the primary purpose of the EOObjectStore class is to define an API for servicing editing contexts, not to define a completely general API. Other subclasses of EOObjectStore are:
 * A subclass of EOObjectStore must implement all of its methods. The default implementations simply throw exceptions.
 * See Also:EOCooperatingObjectStore, EOObjectStoreCoordinator, EODatabaseContext
 */
public abstract class EOObjectStore implements com.webobjects.foundation.NSDisposable, com.webobjects.foundation.NSLocking{
    public static final java.lang.String DeletedKey="deleted";

    public static final java.lang.String InsertedKey="inserted";

    public static final java.lang.String InvalidatedAllObjectsInStoreNotification="EOInvalidatedAllObjectsInStoreNotification";

    public static final java.lang.String InvalidatedKey="invalidated";

    public static final java.lang.String ObjectsChangedInStoreNotification="EOObjectsChangedInStoreNotification";

    public static final java.lang.String UpdatedKey="updated";

    public EOObjectStore(){
         //TODO codavaj!!
    }

    /**
     * Implemented by subclasses to return the destination objects for a to-many relationship, whether as real instances or as faults (empty enterprise objects). globalID identifies the source object for the relationship (which doesn't necessarily exist in memory yet), and relationshipName is the name of the relationship. The object identified by globalID and the destination objects for the relationship all belong to context. If you implement this method to return a fault, you must define an EOFaultHandler subclass that stores globalID and relationshipName, using them to fetch the objects in a later objectsForSourceGlobalID message and that turns the fault into an array containing those objects. See the EOFaultHandler class specification for more information on faults. See the EOEditingContext and EODatabaseContext (EOAccess) class specifications for more information on how this method works in concrete subclasses.
     */
    public abstract com.webobjects.foundation.NSArray arrayFaultWithSourceGlobalID(com.webobjects.eocontrol.EOGlobalID globalID, java.lang.String relationshipName, com.webobjects.eocontrol.EOEditingContext context);

    /**
     * Description copied from interface:
     * Invoked when the receiver should prepare itself for destruction. Implementations of this method should break connections that other objects have to the receiver, including unregistering for notifications, resigning as other objects' delegates, release locks and system resources, close files, and any other clean up operations.
     */
    public void dispose(){
        return; //TODO codavaj!!
    }

    /**
     * Invoked to inform the object store that it can stop keeping data about an object it passed to a child. Don't invoke this method; it is invoked automatically by the Framework.
     */
    public abstract void editingContextDidForgetObjectWithGlobalID(com.webobjects.eocontrol.EOEditingContext context, com.webobjects.eocontrol.EOGlobalID gid);

    /**
     * If the receiver is context and the object associated with globalID is already registered in context, this method returns that object. Otherwise it creates a to-one fault, registers it in context, and returns the fault. This method is always directed first at context, which forwards the message to its parent object store if needed to create a fault. If you implement this method to return a fault (an empty enterprise object), you must define an EOFaultHandler subclass that stores globalID, uses it to fetch the object's data, and initializes the object with EOObjectStore's initializeObject method. See the EOFaultHandler class specification for more information on faults. See the EOEditingContext and EODatabaseContext (EOAccess) class specifications for more information on how this method works in concrete subclasses.
     */
    public abstract com.webobjects.eocontrol.EOEnterpriseObject faultForGlobalID(com.webobjects.eocontrol.EOGlobalID globalID, com.webobjects.eocontrol.EOEditingContext context);

    /**
     * Returns a fault for the enterprise object corresponding to row, which is a dictionary of values containing at least the primary key of the corresponding enterprise object. This is especially useful if you have fetched raw rows and now want a unique enterprise object.
     */
    public abstract com.webobjects.eocontrol.EOEnterpriseObject faultForRawRow(com.webobjects.foundation.NSDictionary row, java.lang.String entityName, com.webobjects.eocontrol.EOEditingContext context);

    /**
     * Implemented by subclasses to set object's properties, as obtained for globalID. This method is typically invoked after object has been created using EOClassDescription's createInstanceWithEditingContext or using EOGenericRecord's or EOCustomObject's constructors. This method is also invoked after a fault has been fired.
     */
    public abstract void initializeObject(com.webobjects.eocontrol.EOEnterpriseObject object, com.webobjects.eocontrol.EOGlobalID globalID, com.webobjects.eocontrol.EOEditingContext context);

    /**
     * Discards the values of all objects held by the receiver and turns them into faults (empty enterprise objects). This causes all locks to be dropped and any transaction to be rolled back. The next time any object is accessed, its data is fetched anew. Any child object stores are also notified that the objects are no longer valid. See the EOEditingContext class specification for more information on how this method works in concrete subclasses. This method should also post an InvalidatedAllObjectsInStoreNotification.
     */
    public abstract void invalidateAllObjects();

    /**
     * Signals that the objects identified by globalIDs should no longer be considered valid and that they should be turned into faults (empty enterprise objects). This causes data for each object to be refetched the next time it's accessed. Any child object stores are also notified that the objects are no longer valid.
     */
    public abstract void invalidateObjectsWithGlobalIDs(com.webobjects.foundation.NSArray globalIDs);

    /**
     * Invokes methodName on the enterprise object identified by gid in context, using arguments. To pass an enterprise object as an argument, use its global ID. This method has the side effect of saving all the changes from the editing context all the way down to the editing context in the server session.
     */
    public java.lang.Object invokeRemoteMethod(com.webobjects.eocontrol.EOEditingContext context, com.webobjects.eocontrol.EOGlobalID gid, java.lang.String methodName, java.lang.Class[] argumentTypes, java.lang.Object[] arguments){
        return null; //TODO codavaj!!
    }

    /**
     * Returns true if the object identified by globalID is locked, false if it isn't. See the EODatabaseContext (EOAccess) class specification for more information on how this method works in concrete subclasses.
     */
    public abstract boolean isObjectLockedWithGlobalID(com.webobjects.eocontrol.EOGlobalID globalID, com.webobjects.eocontrol.EOEditingContext editingContext);

    /**
     * This method is used to protect access to the receiver from concurrent operations by multiple threads. Most EOObjectStores can only service one thread at a time (i.e. they are not reentreant) so properly locking them ensures correct concurrent behavior (i.e. threads take turns) Applications which make direct use of an EOObjectStore should lock and unlock it as appropriate. EOObjectStores are expected to lock and unlock any additional resources they need as appropriate. Specifically, so long as an object store is properly locked and unlocked by its clients, any indirect locks or resoruces the EOObjectStore requires to fulfill its client's requests are expected to be managed by the EOObjectStore, not its client. Do not confuse this with any methods which work with the database locking mechanism.
     */
    public abstract void lock();

    /**
     * Locks the object identified by globalID. See the EODatabaseContext (EOAccess) class specification for more information on how this method works in concrete subclasses.
     */
    public abstract void lockObjectWithGlobalID(com.webobjects.eocontrol.EOGlobalID globalID, com.webobjects.eocontrol.EOEditingContext context);

    /**
     * Returns the destination objects for a to-many relationship. This method is used by an array fault previously constructed using arrayFaultWithSourceGlobalID. globalID identifies the source object for the relationship (which doesn't necessarily exist in memory yet), and relationshipName is the name of the relationship. The object identified by globalID and the destination objects for the relationship all belong to context. See the EOEditingContext and EODatabaseContext (EOAccess) class specifications for more information on how this method works in concrete subclasses.
     */
    public abstract com.webobjects.foundation.NSArray objectsForSourceGlobalID(com.webobjects.eocontrol.EOGlobalID globalID, java.lang.String relationshipName, com.webobjects.eocontrol.EOEditingContext context);

    /**
     * Fetches objects from an external store according to the criteria specified by fetchSpecification and returns them in an array for inclusion in context. If one of these objects is already present in memory, this method doesn't overwrite its values with the new values from the database. Throws an exception if an error occurs. See the EOEditingContext and EODatabaseContext (EOAccess) class specifications for more information on how this method works in concrete subclasses.
     */
    public abstract com.webobjects.foundation.NSArray objectsWithFetchSpecification(com.webobjects.eocontrol.EOFetchSpecification fetchSpecification, com.webobjects.eocontrol.EOEditingContext context);

    /**
     * Turns object into a fault (an empty enterprise object), identified by globalID in context. Objects that have been inserted but not saved, or that have been deleted, shouldn't be refaulted. When using com.webobjects.eocontrol, use this method with caution since refaulting an object doesn't remove the object snapshot from the undo stack.
     */
    public abstract void refaultObject(com.webobjects.eocontrol.EOEnterpriseObject object, com.webobjects.eocontrol.EOGlobalID globalID, com.webobjects.eocontrol.EOEditingContext context);

    /**
     * Saves any changes in context to the receiver's repository. Sends insertedObjects, deletedObjects, and updatedObjects messages to context and applies the changes to the receiver's data repository as appropriate. For example, EODatabaseContext (EOAccess) implements this method to send operations to an EOAdaptor (EOAccess) for making the changes in a database.
     */
    public abstract void saveChangesInEditingContext(com.webobjects.eocontrol.EOEditingContext context);

    /**
     * Sets a dictionary in the WOMessage object that can contain, as a convenience, any kind of information related to the current response. Objects further down the appendToResponse method chain can retrieve this information by invoking userInfo.
     * This method unconditionally makes an immutable copy of aDictionary. This can be a problem if changes made elsewhere to the dictionary's contents need to be reflected in the userInfo dictionary.
     * If you need to pass in a mutable dictionary that can be changed by other objects down the chain, wrap the mutable dictionary in a read-only (immutable) dictionary and pass the immutable dictionary as the argument to this method. Be extremely careful doing this if your application is multi-threaded and the userInfo data may be accessed by multiple threads.
     */
    public void setUserInfo(java.util.Map aDictionary){
        return; //TODO codavaj!!
    }

    /**
     * Setes the value for key in the infor user dictionary
     */
    public void setUserInfoForKey(java.lang.Object value, java.lang.String key){
        return; //TODO codavaj!!
    }

    /**
     * This method is used to protect access to the receiver from concurrent operations by multiple threads. Most EOObjectStores can only service one thread at a time (i.e. they are not reentreant) so properly unlocking them ensures another thread can utilize the object store (i.e. prevent deadlock) Applications which make direct use of an EOObjectStore should lock and unlock it as appropriate. EOObjectStores are expected to lock and unlock any additional resources they need as appropriate. Specifically, so long as an object store is properly locked and unlocked by its clients, any indirect locks or resoruces the EOObjectStore requires to fulfill its client's requests are expected to be managed by the EOObjectStore, not its client. Do not confuse this with any methods which work with the database locking mechanism.
     */
    public abstract void unlock();

    /**
     * Return the userInfo dictionary. An object further upstream in the appendToResponse method chain can set this dictionary in the WOMessage object as a way to pass information to other objects.
     */
    public com.webobjects.foundation.NSDictionary userInfo(){
        return null; //TODO codavaj!!
    }

    /**
     * Return the value of the key in the userInfo dictionary
     */
    public java.lang.Object userInfoForKey(java.lang.String key){
        return null; //TODO codavaj!!
    }

}

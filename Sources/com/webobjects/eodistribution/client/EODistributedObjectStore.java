package com.webobjects.eodistribution.client;
/**
 * An EODistributedObjectStore functions as the parent object store on the client side of Java Client applications. It handles interaction with the distribution layer's channel (an EODistributionChannel object), incorporating knowledge of that channel so it can forward messages it receives from the server to its editing contexts and forward messages from its editing contexts to the server. With the channel, it represents a single connection to the server, fetching and saving objects on behalf of one or more client-side editing contexts. In this regard, an EODistributedObjectStore acts like an EODatabaseContext on the server side. It differs from EODatabaseContext in that its editing contexts interact directly with it without the intervention of an object store coordinator.
 * EODistributedObjectStore provides several methods in addition to those defined by EOObjectStore. The invocation methods invokeRemoteMethod (two overloaded versions), invokeRemoteMethodWithKeyPath, and invokeStatelessRemoteMethodWithKeyPath allow you to send messages to any object on the server and receive responses from them. The methods classDescriptionForGlobalID and snapshotForSourceGlobalID return information related to enterprise objects in the distributed object store given an object's global ID.
 */
public class EODistributedObjectStore extends com.webobjects.eocontrol.EOObjectStore{
    /**
     * Creates an EODistributedObjectStore instance initialized with a distribution channel.
     * Parameters:channel - the distribution channel used to communicate with the server
     */
    public EODistributedObjectStore(com.webobjects.eodistribution.client.EODistributionChannel channel){
         //TODO codavaj!!
    }

    /**
     * Creates a to-many fault in the editing context editingContext and returns an array of the destination objects for the to-many relationship identified by relationshipName. The globalID parameter identifies the source object for the relationship (which doesn't necessarily exist in memory yet).
     */
    public com.webobjects.foundation.NSArray arrayFaultWithSourceGlobalID(com.webobjects.eocontrol.EOGlobalID globalID, java.lang.String relationshipName, com.webobjects.eocontrol.EOEditingContext editingContext){
        return null; //TODO codavaj!!
    }

    /**
     * Returns the class description for the enterprise object identified by globalID.
     */
    public com.webobjects.eocontrol.EOClassDescription classDescriptionForGlobalID(com.webobjects.eocontrol.EOGlobalID globalID){
        return null; //TODO codavaj!!
    }

    /**
     * Returns the distribution channel used by the distributed object store.
     */
    public com.webobjects.eodistribution.client.EODistributionChannel distributionChannel(){
        return null; //TODO codavaj!!
    }

    /**
     * Invoked if a child editing context forgot an object to clear out the snapshots.
     */
    public void editingContextDidForgetObjectWithGlobalID(com.webobjects.eocontrol.EOEditingContext editingContext, com.webobjects.eocontrol.EOGlobalID globalID){
        return; //TODO codavaj!!
    }

    /**
     * Creates a to-one fault for the enterprise object identified by the global ID globalID, registers it in the editing context editingContext, and returns the fault. This method could return an already existing object.
     */
    public com.webobjects.eocontrol.EOEnterpriseObject faultForGlobalID(com.webobjects.eocontrol.EOGlobalID globalID, com.webobjects.eocontrol.EOEditingContext editingContext){
        return null; //TODO codavaj!!
    }

    /**
     * Creates a to-one fault for an enterprise object identified by the raw row row and the entity name entityName, registers it in the editing context editingContext, and returns the fault. This method may return an already existing object.
     */
    public com.webobjects.eocontrol.EOEnterpriseObject faultForRawRow(com.webobjects.foundation.NSDictionary row, java.lang.String entityName, com.webobjects.eocontrol.EOEditingContext editingContext){
        return null; //TODO codavaj!!
    }

    /**
     * Initializes the enterprise object object with its attributes and relationships using key-value coding. The properties of object are identified and accessed using the global ID globalID. For properties with NSKeyValueCoding.NullValue, null is substituted.
     */
    public void initializeObject(com.webobjects.eocontrol.EOEnterpriseObject object, com.webobjects.eocontrol.EOGlobalID globalID, com.webobjects.eocontrol.EOEditingContext editingContext){
        return; //TODO codavaj!!
    }

    /**
     * Invoked to notify the receiver that all the properties and objects it caches are no longer valid and that they should be refaulted. Any child object stores are also notified that the objects are no longer valid. Posts an InvalidatedAllObjectsInStoreNotification after removing snapshots from the object store.
     */
    public void invalidateAllObjects(){
        return; //TODO codavaj!!
    }

    /**
     * Invoked to notify the receiver that the objects in the object store with the global IDs globalIDs should no longer be considered valid and that they should be refaulted. This message is propagated to any underlying object store resulting in a refetch the next time the objects are accessed. Any child object stores are notified that the objects are no longer valid.
     */
    public void invalidateObjectsWithGlobalIDs(com.webobjects.foundation.NSArray globalIDs){
        return; //TODO codavaj!!
    }

    /**
     * Pushes the changes of the object graph in editingContext to the server-side editing context (but does not save the changes to the database) and invokes the method named methodName with the arguments passed remotely on the enterprise object identified by the global ID globalID. Note that if editingContext is a nested editing context, the changes have to be pushed through the parent editing context.
     */
    public java.lang.Object invokeRemoteMethod(com.webobjects.eocontrol.EOEditingContext editingContext, com.webobjects.eocontrol.EOGlobalID globalID, java.lang.String methodName, java.lang.Class[] argumentTypes, java.lang.Object[] arguments){
        return null; //TODO codavaj!!
    }

    /**
     * Invokes the method named methodName with the arguments passed remotely on the enterprise object identified by the global ID globalID. If shouldPush is true, the changes of the object graph in editingContext are pushed to the server side editing context (but not saved to the database). Note that if editingContext is a nested editing context, the changes have to be pushed through to the parent editing context.
     */
    public java.lang.Object invokeRemoteMethod(com.webobjects.eocontrol.EOEditingContext editingContext, com.webobjects.eocontrol.EOGlobalID globalID, java.lang.String methodName, java.lang.Class[] argumentTypes, java.lang.Object[] arguments, boolean shouldPush){
        return null; //TODO codavaj!!
    }

    /**
     * This method invokes a remote method on an object on the server side that can be specified with a key path (not just an enterprise object) relative to the invocation target of the server side EODistributionContext (for example "session").
     * The keyPath argument has special semantics:
     * If keyPath is a fully qualified key path (for example, "session"), the key path is followed starting from the invocation target of the EODistributionContext. If keyPath is an empty string, the method is invoked on the invocation target of the EODistributionContext directly (typically a subclass of WOJavaClientComponent). If keyPath is null, the method is invoked on one of the remote method receivers of the server side EODistributionContext.
     * If an actual key path is specified, the EODistributionContext on the server blocks all invocations sent with this method unless methodName is prefixed with "clientSideRequest" or unless the EODistributionContext's delegate (on the server) implements the right delegate methods to explicitly allow the invocation. "clientSideRequest" methods can be invoked without special delegate methods on the server-side distribution context, on a remote method receiver registered with the distribution context or on the session of the distribution context's invocation target.
     * If enterprise objects are involved in the remote method invocation (either as argument or as return value), you need to specify an editing context. In that case you also have the choice to push the changes of the editing context's enterprise object graph to the server-side editing context.
     */
    public java.lang.Object invokeRemoteMethodWithKeyPath(com.webobjects.eocontrol.EOEditingContext editingContext, java.lang.String keyPath, java.lang.String methodName, java.lang.Class[] argumentTypes, java.lang.Object[] arguments, boolean shouldPush){
        return null; //TODO codavaj!!
    }

    /**
     * This method invokes a remote method on an object on the server side that can be specified with a key path (no enterprise object) relative to the invocation target of the server side EODistributionContext (for example "session"). The arguments and return values of remote methods invoked through this method cannot be enterprise objects (but global IDs are okay). You can use this method, for example, to load resources from the server or to perform checks in background threads (as long as no enterprise objects are involved).
     * The keyPath argument has special semantics:
     * If keyPath is a fully qualified key path (for example, "session"), the key path is followed starting from the invocation target of the EODistributionContext. If keyPath is an empty string, the method is invoked on the invocation target of the EODistributionContext directly (typically a subclass of WOJavaClientComponent). If keyPath is null, the method is invoked on one of the remote method receivers of the server side EODistributionContext.
     * If an actual key path is specified, the EODistributionContext on the server blocks all invocations sent with this method unless methodName is prefixed with "clientSideRequest" or unless the EODistributionContext's delegate (on the server) implements the right delegate methods to explicitly allow the invocation. "clientSideRequest" methods can be invoked without special delegate methods on the server-side distribution context, on a remote method receiver registered with the distribution context or on the session of the distribution context's invocation target.
     */
    public java.lang.Object invokeStatelessRemoteMethodWithKeyPath(java.lang.String keyPath, java.lang.String methodName, java.lang.Class[] argumentTypes, java.lang.Object[] arguments){
        return null; //TODO codavaj!!
    }

    /**
     * Returns whether an object has been locked by the underlying data store. Since EODistributedObjectStore does not support locking on the server, this method always returns false.
     */
    public boolean isObjectLockedWithGlobalID(com.webobjects.eocontrol.EOGlobalID globalID, com.webobjects.eocontrol.EOEditingContext editingContext){
        return false; //TODO codavaj!!
    }

    /**
     * Description copied from class:
     * This method is used to protect access to the receiver from concurrent operations by multiple threads. Most EOObjectStores can only service one thread at a time (i.e. they are not reentreant) so properly locking them ensures correct concurrent behavior (i.e. threads take turns) Applications which make direct use of an EOObjectStore should lock and unlock it as appropriate. EOObjectStores are expected to lock and unlock any additional resources they need as appropriate. Specifically, so long as an object store is properly locked and unlocked by its clients, any indirect locks or resoruces the EOObjectStore requires to fulfill its client's requests are expected to be managed by the EOObjectStore, not its client. Do not confuse this with any methods which work with the database locking mechanism.
     */
    public void lock(){
        return; //TODO codavaj!!
    }

    /**
     * Places a persistent lock on the object in it's underlying data store. Since EODistributedObjectStore does not support locking objects on the server, this method always raises an IllegalStateException.
     */
    public void lockObjectWithGlobalID(com.webobjects.eocontrol.EOGlobalID globalID, com.webobjects.eocontrol.EOEditingContext editingContext){
        return; //TODO codavaj!!
    }

    /**
     * Returns the destination objects for the to-many relationship identified by relationshipName. The source object for the relationship is identified by its global ID globalID. The source object and all destination objects for the relationship belong to the editing context editingContext. This method first looks to find the destination objects for the relationship in a client-side cache. If that cache is empty, it requests those objects from the server and updates the client-side cache with them.
     */
    public com.webobjects.foundation.NSArray objectsForSourceGlobalID(com.webobjects.eocontrol.EOGlobalID globalID, java.lang.String relationshipName, com.webobjects.eocontrol.EOEditingContext editingContext){
        return null; //TODO codavaj!!
    }

    /**
     * Fetches objects from the server according to the criteria specified by the fetch specification fetchSpecification and returns them in an array for inclusion in the editing context editingContext. Updates the client-side caches with the fetched enterprise objects. Throws an exception if an error occurs.
     */
    public com.webobjects.foundation.NSArray objectsWithFetchSpecification(com.webobjects.eocontrol.EOFetchSpecification fetchSpecification, com.webobjects.eocontrol.EOEditingContext editingContext){
        return null; //TODO codavaj!!
    }

    /**
     * Turns the enterprise object object back into a fault (an empty enterprise object, identified by the global ID globalID) in the editing context editingContext. Objects that have been inserted but not saved, or that have been deleted, shouldn't be refaulted.
     */
    public void refaultObject(com.webobjects.eocontrol.EOEnterpriseObject object, com.webobjects.eocontrol.EOGlobalID globalID, com.webobjects.eocontrol.EOEditingContext editingContext){
        return; //TODO codavaj!!
    }

    /**
     * Requests the server to commit changes to the enterprise objects in the editing context editingContext. This message is invoked by the editing context. The receiver calls back to the editing context to get the updated, deleted, and inserted objects to save and commits these changes in a single transaction. Raises an exception if any error occurs.
     */
    public void saveChangesInEditingContext(com.webobjects.eocontrol.EOEditingContext editingContext){
        return; //TODO codavaj!!
    }

    /**
     * Returns an array of global IDs identifying the destination objects for the to-many relationship relationshipName having the source global ID globalID. Returns null if the object identified by the source global ID does not currently exist in the object store or if there is no relationship with the given name.
     */
    public com.webobjects.foundation.NSArray snapshotForSourceGlobalID(com.webobjects.eocontrol.EOGlobalID globalID, java.lang.String relationshipName){
        return null; //TODO codavaj!!
    }

    /**
     * Description copied from class:
     * This method is used to protect access to the receiver from concurrent operations by multiple threads. Most EOObjectStores can only service one thread at a time (i.e. they are not reentreant) so properly unlocking them ensures another thread can utilize the object store (i.e. prevent deadlock) Applications which make direct use of an EOObjectStore should lock and unlock it as appropriate. EOObjectStores are expected to lock and unlock any additional resources they need as appropriate. Specifically, so long as an object store is properly locked and unlocked by its clients, any indirect locks or resoruces the EOObjectStore requires to fulfill its client's requests are expected to be managed by the EOObjectStore, not its client. Do not confuse this with any methods which work with the database locking mechanism.
     */
    public void unlock(){
        return; //TODO codavaj!!
    }

}

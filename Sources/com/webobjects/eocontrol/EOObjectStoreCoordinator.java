package com.webobjects.eocontrol;
/**
 * EOObjectStoreCoordinator provides the abstraction of a single object store by coordinating one or more EOCooperatingObjectStores. For the basic object store methods, such as objectsWithFetchSpecification(EOFetchSpecification, EOEditingContext), the coordinator forwards the message to the appropriate coorperating object store based on entity name. For saveChangesInEditingContext(EOEditingContext), the coordinator guides its cooperating object stores through a multi-pass save protocol in which each cooperating object store saves its own changes and forwards other changes on to other object stores. For example, if in its recordChangesInEditingContext method, one store notices the removal of an object from an "owning" relationship, but that object comes from another store, it should inform the other store by passing the coordinator a forwardUpdateForObject(EOEnterpriseObject, NSDictionary) message.
 * For more information on EOObjectStoreCoordinator, refer to:
 */
public class EOObjectStoreCoordinator extends com.webobjects.eocontrol.EOObjectStore{
    public static final java.lang.String CooperatingObjectStoreNeededNotification="EOCooperatingObjectStoreNeededNotification";

    public static final java.lang.String CooperatingObjectStoreWasAddedNotification="EOCooperatingObjectStoreWasAddedNotification";

    public static final java.lang.String CooperatingObjectStoreWasRemovedNotification="EOCooperatingObjectStoreWasRemovedNotification";

    public static final java.lang.String FetchSpecificationKey="fetchSpecification";

    public static final java.lang.String GlobalIDKey="globalID";

    public static final java.lang.String ObjectKey="object";

    /**
     * Creates and returns an EOObjectStoreCoordinator.
     */
    public EOObjectStoreCoordinator(){
         //TODO codavaj!!
    }

    /**
     * Adds objectStore to the list of EOCooperatingObjectStores that need to be queried and notified about changes to enterprise objects. The receiver reuses its stores: they don't go away until the EOObjectStoreCoordinator is destroyed or until the stores are explicitly removed. Posts the notification CooperatingObjectStoreWasAdded.
     */
    public void addCooperatingObjectStore(com.webobjects.eocontrol.EOCooperatingObjectStore objectStore){
        return; //TODO codavaj!!
    }

    /**
     * Implementation for arrayFaultWithSourceGlobalID inherited from EOObjectStore. EOObjectStoreCoordinator's implementation forwards this message to the EOCooperatingObjectStore returned by objectStoreForGlobalID for gid.
     */
    public com.webobjects.foundation.NSArray arrayFaultWithSourceGlobalID(com.webobjects.eocontrol.EOGlobalID gid, java.lang.String relationshipName, com.webobjects.eocontrol.EOEditingContext editingContext){
        return null; //TODO codavaj!!
    }

    /**
     * Returns the receiver's EOCooperatingObjectStores.
     */
    public com.webobjects.foundation.NSArray cooperatingObjectStores(){
        return null; //TODO codavaj!!
    }

    /**
     * Returns a shared instance of EOObjectStoreCoordinator.
     */
    public static com.webobjects.eocontrol.EOObjectStoreCoordinator defaultCoordinator(){
        return null; //TODO codavaj!!
    }

    /**
     * Description copied from interface:
     * Invoked when the receiver should prepare itself for destruction. Implementations of this method should break connections that other objects have to the receiver, including unregistering for notifications, resigning as other objects' delegates, release locks and system resources, close files, and any other clean up operations.
     */
    public void dispose(){
        return; //TODO codavaj!!
    }

    /**
     * Invoked to inform the object store that it can stop keeping data about an object it passed to a child. Don't invoke this method; it is invoked automatically by the Framework.EOObjectStoreCoordinator's implementation forwards this message to the EOCooperatingObjectStore returned by objectStoreForGlobalID for gid.
     */
    public void editingContextDidForgetObjectWithGlobalID(com.webobjects.eocontrol.EOEditingContext editingContext, com.webobjects.eocontrol.EOGlobalID gid){
        return; //TODO codavaj!!
    }

    /**
     * Implementation for faultForGlobalID inherited from EOObjectStore. EOObjectStoreCoordinator's implementation forwards this message to the EOCooperatingObjectStore of the object identified by gid.
     */
    public com.webobjects.eocontrol.EOEnterpriseObject faultForGlobalID(com.webobjects.eocontrol.EOGlobalID gid, com.webobjects.eocontrol.EOEditingContext editingContext){
        return null; //TODO codavaj!!
    }

    /**
     * Implementation for faultForRawRow inherited from EOObjectStore. EOObjectStoreCoordinator's implementation forwards this message to the EOCooperatingObjectStore returned by objectStoreForEntityNamed for entityName.
     */
    public com.webobjects.eocontrol.EOEnterpriseObject faultForRawRow(com.webobjects.foundation.NSDictionary row, java.lang.String entityName, com.webobjects.eocontrol.EOEditingContext editingContext){
        return null; //TODO codavaj!!
    }

    /**
     * Tells the receiver to forward a message from an EOCooperatingObjectStore to another store, informing it that changes need to be made to object. For example, inserting an object in a relationship property of one EOCooperatingObjectStore might require changing a foreign key property in an object owned by another EOCooperatingObjectStore. This method first locates the EOCooperatingObjectStore that's responsible for applying changes, and then it sends the store the message recordUpdateForObject.
     */
    public void forwardUpdateForObject(com.webobjects.eocontrol.EOEnterpriseObject object, com.webobjects.foundation.NSDictionary changes){
        return; //TODO codavaj!!
    }

    /**
     * Implementation for initializeObject inherited from EOObjectStore to set object's properties, as obtained for gid. EOObjectStoreCoordinator's implementation forwards this message to the EOCooperatingObjectStore returned by objectStoreForGlobalID for gid.
     */
    public void initializeObject(com.webobjects.eocontrol.EOEnterpriseObject object, com.webobjects.eocontrol.EOGlobalID gid, com.webobjects.eocontrol.EOEditingContext editingContext){
        return; //TODO codavaj!!
    }

    /**
     * Tells the receiver's coopertating object stores to discard the values of all objects they hold and turn them into faults (empty enterprise objects). This method also posts an InvalidatedAllObjectsInStoreNotification.
     */
    public void invalidateAllObjects(){
        return; //TODO codavaj!!
    }

    /**
     * Signals that the objects identified by the EOGlobalIDs in gids should no longer be considered valid and that they should be turned into faults (empty enterprise objects). EOObjectStoreCoordinator's implementation forwards this message to the EOCooperatingObjectStore for each object identified by the EOGlobalIDs in gids.
     */
    public void invalidateObjectsWithGlobalIDs(com.webobjects.foundation.NSArray gids){
        return; //TODO codavaj!!
    }

    /**
     * Returns true if the object identified by gid in editingContext is locked, false otherwise. This method works by forwarding the message isObjectLockedWithGlobalID to its parent object store.
     */
    public boolean isObjectLockedWithGlobalID(com.webobjects.eocontrol.EOGlobalID gid, com.webobjects.eocontrol.EOEditingContext editingContext){
        return false; //TODO codavaj!!
    }

    /**
     * This method is used to protect access to the receiver from concurrent operations by multiple threads. EOEditingContexts will indirectly lock their EOObjectStoreCoordinators when necessary. Locking an EOObjectStoreCoordinator will cause the coordinator to lock each registered EOCooperatingObjectStore managed by that coordinator. Applications which make direct use of an EOObjectStoreCoordinator should lock and unlock it as appropriate. Do not confuse this with any methods which work with the database locking mechanism.
     */
    public void lock(){
        return; //TODO codavaj!!
    }

    /**
     * Overrides the implementation inherited from EOObjectStore to attempt to lock the object identified by gid in editingContext in the external store. Throws an exception if unable to obtain the lock. This method works by forwarding the message lockObjectWithGlobalID to its parent object store.
     */
    public void lockObjectWithGlobalID(com.webobjects.eocontrol.EOGlobalID gid, com.webobjects.eocontrol.EOEditingContext editingContext){
        return; //TODO codavaj!!
    }

    /**
     * Returns the destination objects for a to-many relationship. EOObjectStoreCoordinator's implementation forwards this message to the EOCooperatingObjectStore returned by objectStoreForGlobalID for gid.
     */
    public com.webobjects.foundation.NSArray objectsForSourceGlobalID(com.webobjects.eocontrol.EOGlobalID gid, java.lang.String relationshipName, com.webobjects.eocontrol.EOEditingContext editingContext){
        return null; //TODO codavaj!!
    }

    /**
     * Returns the EOCooperatingObjectStore responsible for fetching objects with fetchSpecification. Returns null if no EOCooperatingObjectStore can be found that responds true to handlesFetchSpecification.
     */
    public com.webobjects.eocontrol.EOCooperatingObjectStore objectStoreForFetchSpecification(com.webobjects.eocontrol.EOFetchSpecification fetchSpecification){
        return null; //TODO codavaj!!
    }

    /**
     * Returns the EOCooperatingObjectStore for the object identified by gid. Returns null if no EOCooperatingObjectStore can be found that responds true to ownsGlobalID.
     */
    public com.webobjects.eocontrol.EOCooperatingObjectStore objectStoreForGlobalID(com.webobjects.eocontrol.EOGlobalID gid){
        return null; //TODO codavaj!!
    }

    /**
     * Returns the EOCooperatingObjectStore that owns object. Returns null if no EOCooperatingObjectStore can be found that responds true to ownsObject.
     */
    public com.webobjects.eocontrol.EOCooperatingObjectStore objectStoreForObject(com.webobjects.eocontrol.EOEnterpriseObject object){
        return null; //TODO codavaj!!
    }

    /**
     * Overrides the EOObjectStore implementation to fetch objects from the receiver's cooperating object stores.
     */
    public com.webobjects.foundation.NSArray objectsWithFetchSpecification(com.webobjects.eocontrol.EOFetchSpecification fetchSpecification, com.webobjects.eocontrol.EOEditingContext editingContext){
        return null; //TODO codavaj!!
    }

    /**
     * Turns object into a fault (an empty enterprise object), identified by globalID in editingContext. EOObjectStoreCoordinator's implementation forwards this message to the EOCooperatingObjectStore returned by objectStoreForGlobalID for gid.
     */
    public void refaultObject(com.webobjects.eocontrol.EOEnterpriseObject object, com.webobjects.eocontrol.EOGlobalID gid, com.webobjects.eocontrol.EOEditingContext editingContext){
        return; //TODO codavaj!!
    }

    /**
     * Removes objectStore from the list of EOCooperatingObjectStores that need to be queried and notified about changes to enterprise objects. Posts the notification CooperatingObjectStoreWasRemoved.
     */
    public void removeCooperatingObjectStore(com.webobjects.eocontrol.EOCooperatingObjectStore objectStore){
        return; //TODO codavaj!!
    }

    /**
     * Overrides the EOObjectStore implementation to save the changes made in context. This message is sent by an EOEditingContext to an EOObjectStoreCoordinator to commit changes. When an EOObjectStoreCoordinator receives this message, it guides its EOCooperatingObjectStores through a multi-pass save protocol in which each EOCooperatingObjectStore saves its own changes and forwards remaining changes to other EOCooperatingObjectStores. When this method is invoked, the following sequence of events occurs: The receiver sends each of its EOCooperatingObjectStores the message prepareForSaveWithCoordinator, which informs them that a multi-pass save operation is beginning. When the EOCooperatingObjectStore is an EODatabaseContext (EOAccess), it takes this opportunity to generate primary keys for any new objects in the EOEditingContext. The receiver sends each of its EOCooperatingObjectStores the message recordChangesInEditingContext, which prompts them to examine the changed objects in the editing context, record operations that need to be performed, and notify the receiver of any changes that need to be forwarded to other stores. For example, if in its recordChangesInEditingContext method one EOCooperatingObjectStore notices the removal of an object from an owning relationship but that object belongs to another EOCooperatingObjectStore, it informs the other store by sending the coordinator a forwardUpdateForObject message. The receiver sends each of its EOCooperatingObjectStores the message ownsGlobalID. This tells the stores to transmit their changes to their underlying databases. When the EOCooperatingObjectStore is an EODatabaseContext, it responds to this message by taking the EODatabaseOperations (EOAccess) that were constructed in the previous step, constructing EOAdaptorOperations (EOAccess) from them, and giving the EOAdaptorOperations to an available EOAdaptorChannel (EOAccess) for execution. If ownsGlobalID fails for any of the EOCooperatingObjectStores, all stores are sent the message rollbackChanges. If ownsGlobalID succeeds for all EOCooperatingObjectStores, the receiver sends them the message commitChanges, which has the effect of telling the adaptor to commit the changes. If commitChanges fails for a particular EOCooperatingObjectStore, that store and all subsequent ones are sent the message rollbackChanges. However, the stores that have already committed their changes do not roll back. In other words, the coordinator doesn't perform the two-phase commit protocol necessary to guarantee consistent distributed update. This method raises an exception if an error occurs.
     */
    public void saveChangesInEditingContext(com.webobjects.eocontrol.EOEditingContext context){
        return; //TODO codavaj!!
    }

    /**
     * Sets a shared instance EOObjectStoreCoordinator.
     */
    public static void setDefaultCoordinator(com.webobjects.eocontrol.EOObjectStoreCoordinator coordinator){
        return; //TODO codavaj!!
    }

    /**
     * This method is used to protect access to the receiver from concurrent operations by multiple threads. EOEditingContexts will indirectly unlock their EOObjectStoreCoordinators when necessary. Unlocking an EOObjectStoreCoordinator will cause the coordinator to unlock each registered EOCooperatingObjectStore managed by that coordinator. Applications which make direct use of an EOObjectStoreCoordinator should lock and unlock it as appropriate. Do not confuse this with any methods which work with the database locking mechanism.
     */
    public void unlock(){
        return; //TODO codavaj!!
    }

    /**
     * Communicates with the appropriate EOCooperatingObjectStore to get the values identified by keys for object, so that it can then forward them on to another EOCooperatingObjectStore. EOCooperatingObjectStores can hold values for an object that augment the properties in the object. For instance, an EODatabaseContext (EOAccess) stores foreign key information for the objects it owns. These foreign keys may well not be defined as properties of the object. Other EODatabaseContexts can find out the object's foreign keys by sending the EODatabaseContext that owns the object a valuesForKeys message (through the coordinator).
     */
    public com.webobjects.foundation.NSDictionary valuesForKeys(com.webobjects.foundation.NSArray keys, com.webobjects.eocontrol.EOEnterpriseObject object){
        return null; //TODO codavaj!!
    }

}

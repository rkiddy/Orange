package com.webobjects.eoaccess;
/**
 * EODatabaseContext is the basic EOObjectStore for the EOAccess Framework. It acts as one of possibly several EOCooperatingObjectStores for an EOObjectStoreCoordinator. It acts as a store for any entities in the model list of its EODatabase. When saving editing context changes, the EODatabaseContext searches the object graph using the editing context's list of inserted, deleted, and updated objects and determines exactly which changes need to be made in the database. It then creates an array of adaptorOperations which it hands to an adaptor channel for execution.
 * The EODatabaseContext knows how to interact with other EOCooperatingObjectStores to save changes made to an object graph in more than one database server.
 * When the EODatabaseContext is asked to fetch or write information to the database, it tries to use one of its EODatabaseChannels. If all of its channels are busy, it broadcasts a DatabaseChannelNeededNotification in the hopes that some observer can provide a new channel for the context or that an existing channel can be freed up.
 * An EODatabaseContext represents a single transaction scope on the database server, and determines the updating and locking stragegy used by the database layer. It is managed by an EODatabase object, which represents the main connection to the server. If the server supports multiple concurrent transaction sessions, the EODatabase may have several EODatabaseContexts. If the adaptor allows multiple channels per context, then an EODatabaseContext may in turn have several EODatabaseChannels, which handle actual access to the data on the server. Not all adaptors support multiple contexts per database object. See EODatabase and EODatabaseChannel documentation for more information.
 * As a subclass of EOCooperatingObjectStore, EODatabaseContext acts as one of possibly several EOCooperatingObjectStores for an EOObjectStoreCoordinator, which mediates between EOEditingContexts and EOCooperatingObjectStores. (EOObjectStore, EOCooperatingObjectStore, and EOObjectStoreCoordinator are provided by the control layer.)
 * An EODatabaseContext creates an EOAdaptorContext when initialized, and uses this object to communicate with the database server.
 * Though you can create an EODatabaseContext explicitly by using the static method registeredDatabaseContextForModel, you should rarely need to do so. If you are using the higher-level objects EOEditingContexts (EOControl) and EODatabaseDataSources, the database contexts those objects need are created automatically, on demand. When you create database data source (typically for use with the interface layer's EODisplayGroup or WebObject's WODisplayGroup), it registers a database context that is capable of fetching objects for the data source's entities. If objects fetched into an editing context (described more in the following section) have references to objects from EOModels that are based on another database, an EODatabaseContext is created and registered for each of the additional databases.
 * EODatabaseContexts are created on demand when an EOObjectStoreCoordinator (EOControl) posts a CooperatingObjectStoreNeeded notification. The EODatabaseContext class registers for the notification, and it provides the coordinator with a new EODatabaseContext instance that can handle the request.
 * For the most part, you don't need to programmatically interact with an EODatabaseContext. Some cases in which this might be necessary are:
 * Conceptually, an EODatabaseContext fetches and saves objects on behalf of an EOEditingContext (EOControl). However, the two objects don't interact with each other directly. An EOObjectStoreCoordinator (EOControl) acts as a mediator between them. When an editing context fetches objects, the request is passed through the coordinator, which forwards it to the appropriate database context based on the fetch specification or global ID. EODatabaseContext knows how to interact with other EOCooperatingObjectStores to save changes made to an object graph in more than one database server.
 * When the database context receives a request to fetch or write information to the database, it tries to use one of its EODatabaseChannels. If all of its channels are busy, it broadcasts an DatabaseChannelNeededNotification in the hopes that an observer can provide a new channel or that an existing channel can be freed up. This observer could be a manager object that decides how many database cursors can be opened by a particular client.
 * EODatabaseContext defines a hint for use with an EOFetchSpecification (EOControl) in the method objectsWithFetchSpecification. Named by the key CustomQueryExpressionHintKey, the hint's value is an SQL string for performing the fetch. The expression must query the same attributes in the same order that Enterprise Objects Framework would if it were generating the SELECT expression dynamically. If this key is supplied, other characteristics of the EOFetchSpecification such as isDeep, qualifier, and sortOrderings are ignored. In that sense, this key is more of a directive than a hint.
 * When an EODatabaseContext fetches an object, it examines the relationships defined in the model and creates objects representing the destinations of the fetched object's relationships. For example, if you fetch an employee object, you can ask for its manager and immediately receive the object. You don't have to obtain the manager's employee ID from the employee object and then use it fetch the manager.
 * However, EODatabaseContext doesn't immediately fetch data for the destination objects of relationships since fetching is fairly expensive. To avoid this waste of time and resources, the destination objects aren't initially filled with fetched data. Instead, they exist without any of their values until those values are actually needed. When the empty destination object (called a fault) is accessed for the first time, it fires the fault, that is, it triggers its EODatabaseContext to fetch its data.
 * There are two types of faults: single object faults for to-one relationships and array faults for to-many relationships. When an array fault is accessed, it fetches all of the destination objects and replaces itself with an array of those objects. You can fine-tune faulting behavior for additional performance gains by using two different mechanisms: batch faulting, and prefetching relationships.
 * Triggering one fault has no effect on other faults. The destination object or objects for that one fault are fetched from the database, incurring the overhead of a roundtrip to the database server. You can take advantage of this expensive round trip to the database server by batching faults together ith the method batchFetchRelationship. For example, given an array of Employee objects, this method can fetch all of their departments with a single round trip to the server, rather than asking the server for each of the employees' departments individually. The delegate methods databaseContextShouldFetchArrayFault and databaseContextShouldFetchObjectFault can be used to to fine-tune batch faulting behavior.
 * Batch faulting can also be set in an EOModel. In that approach, you specify the number of faults that should be triggered along with the first fault. In this case, you don't actually control which faults are batch fetched the ay you would by using batchFetchRelationship.
 * An EODatabaseContext shares its delegate with its EODatabaseChannels. These delegate methods are actually sent from EODatabaseChannel, but they're defined in EODatabaseContext for ease of access:
 * You can use the EODatabaseContext delegate methods to intervene when objects are created and when they're fetched from the database. This gives you more fine-grained control over such issues as how an object's primary key is generated (databaseContextNewPrimaryKey), how and if objects are locked (databaseContextShouldLockObjectWithGlobalID), the fetch specification that is used to fetch objects (databaseContextShouldSelectObjects), how batch faulting is performed (databaseContextShouldFetchArrayFault and databaseContextShouldFetchObjectFault), and so on.
 * An EODatabase records snapshots for its EODatabaseContexts. These snapshots form the application's view of the current state of the database server. This global view is overridden locally by database contexts, which form their own snapshots as they make changes during a transaction. When a database context commits its top-level transaction, it reconciles all changed snapshots with the global view of the database object, so that other database contexts (except those with open transactions) immediately use the new snapshots as well.
 * EODatabaseContext supports three updating strategies defined in the EODatabaseContext class as integer values:
 * EODatabaseContext also supports on-demand locking, in which specific optimistic locks can be promoted to database locks during the course of program execution. You can either use lockObjectWithGlobalID to lock a database row for a particular object, or objectsWithFetchSpecification to fetch objects with a fetch specification that includes locking.
 * See Also:EODatabaseContext.registeredDatabaseContextForModel(EOModel aModel, EOEditingContext anEditingContext), EODatabaseContext.lockObjectWithGlobalID(EOGlobalID gid, EOEditingContext ec), EODatabaseContext.objectsWithFetchSpecification( EOFetchSpecification fetchSpecification, EOEditingContext anEditingContext), EODatabaseContext.Delegate.databaseContextDidFetchObjects( EODatabaseContext dbCtxt, NSArray array , EOFetchSpecification fetchSpec, EOEditingContext ec), EODatabaseContext.Delegate.databaseContextShouldSelectObjects( EODatabaseContext dbCtxt , EOFetchSpecification fetchSpec, EODatabaseChannel dbChannel), EODatabaseContext.Delegate.databaseContextShouldUpdateCurrentSnapshot( EODatabaseContext dbCtxt , NSDictionary dic, NSDictionary dic2, EOGlobalID gid , EODatabaseChannel dbChannel), EODatabaseContext.Delegate.databaseContextShouldUsePessimisticLock( EODatabaseContext dbCtxt , EOFetchSpecification fetchSpec, EODatabaseChannel dbChannel), EODatabaseContext.Delegate.databaseContextNewPrimaryKey( EODatabaseContext dbCtxt , Object object, EOEntity entity), EODatabaseContext.Delegate.databaseContextShouldLockObjectWithGlobalID( EODatabaseContext dbCtxt , EOGlobalID gid, NSDictionary dic), EODatabaseContext.Delegate.databaseContextShouldFetchArrayFault( EODatabaseContext dbCtxt , Object object), EODatabaseContext.Delegate.databaseContextShouldFetchObjectFault( EODatabaseContext dbCtxt , Object object), EODatabaseContext.batchFetchRelationship( EORelationship relationship, NSArray objects, EOEditingContext anEditingContext), EODatabaseContext.Delegate
 */
public class EODatabaseContext extends com.webobjects.eocontrol.EOCooperatingObjectStore implements com.webobjects.foundation.NSLocking{
    public static final java.lang.String CustomQueryExpressionHintKey="EOCustomQueryExpressionHintKey";

    /**
     * This nofification is broadcast whenever an EODatabaseContext is asked to perform an object store operation, and it does not have an available databaseChannel. Subscribers can create a new channel and add it to the databaseContext at this time.
     * See Also:Constant Field Values
     */
    public static final java.lang.String DatabaseChannelNeededNotification="EODatabaseChannelNeededNotification";

    /**
     * A key in an GenericAdaptorException's userInfo dictionary.
     * See Also:Constant Field Values
     */
    public static final java.lang.String DatabaseContextKey="EODatabaseContextKey";

    /**
     * A key in an GenericAdaptorException's userInfo dictionary.
     * See Also:Constant Field Values
     */
    public static final java.lang.String DatabaseOperationsKey="EODatabaseOperationsKey";

    /**
     * A key in an GenericAdaptorException's userInfo dictionary.
     * See Also:Constant Field Values
     */
    public static final java.lang.String FailedDatabaseOperationKey="EOFailedDatabaseOperationKey";

    public static final java.lang.String StoredProcedureNameHintKey="EOStoredProcedureNameHintKey";

    /**
     * Integer constant that identifies the locking strategy as no locking.
     * See Also:Constant Field Values
     */
    public static final int UpdateWithNoLocking=2;

    /**
     * Integer constant that identifies the locking strategy as optimistic.
     * See Also:Constant Field Values
     */
    public static final int UpdateWithOptimisticLocking=0;

    /**
     * Integer constant that identifies the locking strategy as pessimistic.
     * See Also:Constant Field Values
     */
    public static final int UpdateWithPessimisticLocking=1;

    /**
     * Creates and returns a new EODatabaseContext with database assigned as the EODatabase object that the new context works. Throws an exception if unable to obtain a new EOAdaptorContext from the underlying adaptor.
     * Parameters:database - The EODatabase object that the new EODatabaseContext uses. Throws: IllegalStateException - if the underlying adaptor context can't create a corresponding adaptor channel.See Also:EODatabaseContext.database(), EODatabaseContext
     */
    public EODatabaseContext(com.webobjects.eoaccess.EODatabase database){
         //TODO codavaj!!
    }

    /**
     * Returns the EOAdaptorContext used by the EODatabaseContext for communication with the database server.
     */
    public com.webobjects.eoaccess.EOAdaptorContext adaptorContext(){
        return null; //TODO codavaj!!
    }

    /**
     * Creates and returns a to-many fault for the relationship name whose source entity must be the entity identified by globalID in the editing context context. Throws an exception if globalID is not an instance of EOKeyGlobalID.
     */
    public com.webobjects.foundation.NSArray arrayFaultWithSourceGlobalID(com.webobjects.eocontrol.EOGlobalID globalID, java.lang.String name, com.webobjects.eocontrol.EOEditingContext context){
        return null; //TODO codavaj!!
    }

    /**
     * Returns the first database channel that isn't busy from the the list of EODatabaseChannels registered with the receiver. If all registered channels are busy, posts a DatabaseChannelNeededNotification, then checks the list of available channels again to see if one has been added. If there are still no available channels, the receiver creates and opens a new EODatabaseChannel if possible, otherwise the method returns null.
     */
    public com.webobjects.eoaccess.EODatabaseChannel availableChannel(){
        return null; //TODO codavaj!!
    }

    /**
     * Clears all the faults for relationship pointed by the source objects in objects and performs a single, efficient fetch or, at most, two fetches if the relationship is many-to-many. Throws an exception if any of the objects in objects doesn't originate from the same entity as relationship.
     * This method provides a way to fetch the same relationship for multiple objects. For example, given an array of Employee objects, this method can fetch all of their departments with one round trip to the server, rather than asking the server for each of the employees' departments individually.
     */
    public void batchFetchRelationship(com.webobjects.eoaccess.EORelationship relationship, com.webobjects.foundation.NSArray objects, com.webobjects.eocontrol.EOEditingContext editingContext){
        return; //TODO codavaj!!
    }

    /**
     * Force the weak references hold by this context to be freed. This is normally done automatically when fetching an object or saving changes. Most application do not need to call this method.
     */
    public void cleanupSnapshots(){
        return; //TODO codavaj!!
    }

    /**
     * Instructs the adaptor to commit the transaction. If the commit is successful, any primary and foreign key changes are written back to the saved objects, database locks are released, and an ObjectsChangedInStoreNotification is posted describing the committed changes. Throws an exception if the adaptor is unable to commit the transaction; the error message indicates the nature of the problem.
     * You should never need to invoke this method directly.
     */
    public void commitChanges(){
        return; //TODO codavaj!!
    }

    /**
     * Returns the class that is created when a CooperatingObjectStoreNeeded notification is posted by an EOObjectStoreCoordinator. The default is EODatabaseContext. Use setContextClassToRegister to specify a subclass of EODatabaseContext instead.
     * When an EOObjectStoreCoordinator sends a CooperatingObjectStoreNeeded notification for an entity in the default model group, an instance of the context class is created, the EOModel for the entity is registered, and the context class is registered with the requesting EOObjectStoreCoordinator.
     */
    public static java.lang.Class contextClassToRegister(){
        return null; //TODO codavaj!!
    }

    /**
     * Returns the receiver's EODatabase.
     */
    public com.webobjects.eoaccess.EODatabase database(){
        return null; //TODO codavaj!!
    }

    /**
     * Returns the default delegate that will be used when initializing new EODatabaseContext instances. Returns null unless the default delegate has been set with setDefaultDelegate.
     */
    public static java.lang.Object defaultDelegate(){
        return null; //TODO codavaj!!
    }

    /**
     * Returns the receiver's delegate.
     */
    public java.lang.Object delegate(){
        return null; //TODO codavaj!!
    }

    /**
     * Conformance to NSDisposable.
     */
    public void dispose(){
        return; //TODO codavaj!!
    }

    /**
     * Invoked when the editing context context is no longer using the object corresponding to gid. The receiver destroys related data, such as snapshots, for gid if no other objects are using them.
     * Do not invoke this method yourself; it is invoked automatically by the Framework.
     */
    public void editingContextDidForgetObjectWithGlobalID(com.webobjects.eocontrol.EOEditingContext context, com.webobjects.eocontrol.EOGlobalID gid){
        return; //TODO codavaj!!
    }

    /**
     * Creates a to-one fault for the object identified by globalID and registers it in the editing context context. Throws an exception if globalID is not an instance of EOKeyGlobalID.
     */
    public com.webobjects.eocontrol.EOEnterpriseObject faultForGlobalID(com.webobjects.eocontrol.EOGlobalID globalID, com.webobjects.eocontrol.EOEditingContext context){
        return null; //TODO codavaj!!
    }

    /**
     * Returns a fault for a raw row. row is the raw data, in the form of an NSDictionary. entityName is the name of the appropriate entity for the Enterprise Object you want to create as a fault. editingContext is the EOEditingContext in which to create the fault. Throws an exception if row does not contain primary key information for entityName.
     */
    public com.webobjects.eocontrol.EOEnterpriseObject faultForRawRow(com.webobjects.foundation.NSDictionary row, java.lang.String entityName, com.webobjects.eocontrol.EOEditingContext editingContext){
        return null; //TODO codavaj!!
    }

    /**
     * Forces the stack of objects in the EOAccess layer to be instantiated, if necessary, and then makes a connection to the database. If there is an existing connection for model, it is first closed and then reconnected with a new connection dictionary made up of the original connection dictionary overlaid with the alternate values for keys specified in overrides. All compatible models in the model group also are associated with the new connection so that they share the same adaptor. Returns the EODatabaseContext associated with the model for the given editingContext.
     */
    public static com.webobjects.eoaccess.EODatabaseContext forceConnectionWithModel(com.webobjects.eoaccess.EOModel model, com.webobjects.foundation.NSDictionary overrides, com.webobjects.eocontrol.EOEditingContext editingContext){
        return null; //TODO codavaj!!
    }

    /**
     * Clears all of the locks made for Enterprise Objects by the receiver. Does not unlock the corresponding rows in the database server. This method is useful when something has happened to cause the database server to forget the locks, and the receiver needs to be synchronized with it.
     * This method is invoked whenever a transaction is committed or rolled back.
     */
    public void forgetAllLocks(){
        return; //TODO codavaj!!
    }

    /**
     * Clears the locks made for the Enterprise Objects identified by each of the EOGlobalIDs in gids. Does not unlock the corresponding rows in the database server.
     */
    public void forgetLocksForObjectsWithGlobalIDs(com.webobjects.foundation.NSArray gids){
        return; //TODO codavaj!!
    }

    /**
     * Deletes the snapshot recorded for the Enterprise Object identified by gid. Throws an exception if invoked when no transaction is in progress, or if gid is null.
     * This method only applies to snapshots locally (in the transaction scope). If you want to forget snapshots globally, use the corresponding EODatabase method.
     */
    public void forgetSnapshotForGlobalID(com.webobjects.eocontrol.EOGlobalID gid){
        return; //TODO codavaj!!
    }

    /**
     * Deletes the snapshots recorded for the Enterprise Objects identified by gids, both in the receiver and in the EODatabase.
     */
    public void forgetSnapshotsForGlobalIDs(com.webobjects.foundation.NSArray gids){
        return; //TODO codavaj!!
    }

    /**
     * Cleans up after a database connection is dropped by unregistering the receiver's adaptor context and database channels, and then creating a new adaptor context. Throws an exception if unable to obtain a new EOAdaptorContext from the underlying adaptor.
     * Do not invoke this method yourself. It is invoked automatically by the Framework.
     */
    public void handleDroppedConnection(){
        return; //TODO codavaj!!
    }

    /**
     * Returns true if the entity identified by the entity name in fetchSpecification can be found in one of the models owned by the EODatabase of the receiver, falsetrue, the receiver is responsible for fetching the objects specified in fetchSpecification.
     */
    public boolean handlesFetchSpecification(com.webobjects.eocontrol.EOFetchSpecification fetchSpecification){
        return false; //TODO codavaj!!
    }

    /**
     * Returns true if the receiver's EOAdaptorContext has channels that have outstanding operations (that is, have a fetch in progress), false otherwise.
     */
    public boolean hasBusyChannels(){
        return false; //TODO codavaj!!
    }

    /**
     * Initializes the enteprise object object in the editing context context based on the snapshot for gid. Throws an exception if gid does not identify a valid object in the specified editing context.
     * Attributes in the snapshot that are marked as class properties in the EOEntity are assigned to object. For relationship class properties, faults are constructed and assigned to the object.
     */
    public void initializeObject(com.webobjects.eocontrol.EOEnterpriseObject object, com.webobjects.eocontrol.EOGlobalID gid, com.webobjects.eocontrol.EOEditingContext context){
        return; //TODO codavaj!!
    }

    /**
     * Discards all snapshots in the receiver's EODatabase, forgets all object locks, and posts an InvalidatedAllObjectsInStoreNotification, as well as an ObjectsChangedInStoreNotification with the globalIDs for the invalidated objects in the userInfo dictionary. Both of these notifications are defined in EOObjectStore. This method works by invoking invalidateObjectsWithGlobalIDs for all of the snapshots in the receiver's EODatabase.
     */
    public void invalidateAllObjects(){
        return; //TODO codavaj!!
    }

    /**
     * Discards the snapshots for the objects identified by the EOGlobalIDs in gids and broadcasts an ObjectsChangedInStoreNotification, which causes any EOEditingContext containing objects fetched from the receiver to refault those objects. The result is that these objects will be refetched from the database the next time they're accessed.
     */
    public void invalidateObjectsWithGlobalIDs(com.webobjects.foundation.NSArray gids){
        return; //TODO codavaj!!
    }

    /**
     * Returns true if the Enterprise Object identified by gid is locked, false otherwise.
     */
    public boolean isObjectLockedWithGlobalID(com.webobjects.eocontrol.EOGlobalID gid){
        return false; //TODO codavaj!!
    }

    /**
     * Returns true if the row corresponding to the globalID gid has been locked in an open transaction held by this database context.
     */
    public boolean isObjectLockedWithGlobalID(com.webobjects.eocontrol.EOGlobalID gid, com.webobjects.eocontrol.EOEditingContext ec){
        return false; //TODO codavaj!!
    }

    /**
     * Returns true if the database contexts automatically load enterprise objects into the default shared editing context when they load a model which contains shared object fetch specifications, false if automatic loading is disabled.
     */
    public static boolean isSharedObjectLoadingEnabled(){
        return false; //TODO codavaj!!
    }

    /**
     * Returns the snapshot for the object identified by gid, if there is one, otherwise returns null. Only searches locally (in the transaction scope), not in the EODatabase.
     */
    public com.webobjects.foundation.NSDictionary localSnapshotForGlobalID(com.webobjects.eocontrol.EOGlobalID gid){
        return null; //TODO codavaj!!
    }

    /**
     * Returns the to-many snapshot for the relationship named name belonging to the Enterprise Object identified by the globalID gid, or null if there is no to-many snapshot. A to-many snapshot is an array of globalIDs which identify the objects at the destination of a to-many relationship. Only searches locally (in the transaction scope), not in the EODatabase.
     */
    public com.webobjects.foundation.NSArray localSnapshotForSourceGlobalID(com.webobjects.eocontrol.EOGlobalID gid, java.lang.String name){
        return null; //TODO codavaj!!
    }

    /**
     * This method is used to protect access to the receiver from concurrent operations by multiple threads. Typically, this method is invoked by the Frameworks as most EODatabaseContexts are acting as cooperating EOObjectStores managed by an EOObjectStoreCoordinator. The coordinator locks its object stores when necessary. However, applications which make direct use of an EODatabaseContext should lock and unlock it as appropriate. Do not confuse this with any methods which work with the database locking mechanism.
     */
    public void lock(){
        return; //TODO codavaj!!
    }

    /**
     * Attempts to lock the database row corresponding to gid in the underlying database server on behalf of the editing context ec. If a transaction is not already open at the time of the lock request, the transaction is begun and is held open until either commitChanges or invalidateAllObjects is invoked. At that point all locks are released. Throws an exception if unable to obtain the lock.
     */
    public void lockObjectWithGlobalID(com.webobjects.eocontrol.EOGlobalID gid, com.webobjects.eocontrol.EOEditingContext ec){
        return; //TODO codavaj!!
    }

    /**
     * Returns an array of the globalIDs of any missing Enterprise Objects, or an empty array if no missing objects are known to the receiver. An object is missing when a fault fires and the corresponding row for the fault isn't found in the database.
     * If an application tries to save a missing object, an exception is thrown. To be notified when a missing object is discovered, implement the delegate method databaseContextFailedToFetchObject.
     */
    public com.webobjects.foundation.NSArray missingObjectGlobalIDs(){
        return null; //TODO codavaj!!
    }

    /**
     * Services a to-many fault. The snapshot for the source object identified by gid is located and the EORelationship named name is used to construct a qualifier from that snapshot. This qualifier is then used to fetch the requested objects into the editing context context using the method objectsWithFetchSpecification.
     * Throws an exception in the following conditions:
     * gid does not specify a valid source object in context. name is not a valid relationship in the model. There is no database snapshot available for gid.
     */
    public com.webobjects.foundation.NSArray objectsForSourceGlobalID(com.webobjects.eocontrol.EOGlobalID gid, java.lang.String name, com.webobjects.eocontrol.EOEditingContext context){
        return null; //TODO codavaj!!
    }

    /**
     * Fetches objects from an external store into context. The receiver obtains an available EODatabaseChannel and performs a fetch with fetchSpec. Returns an array containing the fetched objects. If one of the fetched objects is already present in memory, by default this method doesn't overwrite its values with the new values from the database.
     * You can fine-tune the fetching behavior by adding hints to fetchSpec's hints dictionary. The class description for EOFetchSpecification contains additional information on using hints. You can also use this method to implement on-demand locking by using a fetch specification that includes locking.
     * Throws an exception if an error occurs; the error message indicates the nature of the problem.
     */
    public com.webobjects.foundation.NSArray objectsWithFetchSpecification(com.webobjects.eocontrol.EOFetchSpecification fetchSpec, com.webobjects.eocontrol.EOEditingContext context){
        return null; //TODO codavaj!!
    }

    /**
     * Returns true if the receiver is responsible for fetching and saving the object identified by globalID, false otherwise. The receiver is responsible if globalID is a subclass of EOKeyGlobalID and if globalID has an entity from a model belonging to one of the receiver's EODatabases.
     */
    public boolean ownsGlobalID(com.webobjects.eocontrol.EOGlobalID globalID){
        return false; //TODO codavaj!!
    }

    /**
     * Returns true if the receiver is responsible for fetching and saving object, false otherwise. The receiver is responsible if the entity corresponding to object can be found in a model belonging to one of the receiver's EODatabases.
     */
    public boolean ownsObject(com.webobjects.eocontrol.EOEnterpriseObject object){
        return false; //TODO codavaj!!
    }

    /**
     * Constructs EOAdaptorOperations for all the EODatabaseOperations produced during recordChangesInEditingContext and recordUpdateForObject. Invokes the delegate method databaseContextWillOrderAdaptorOperations to give the delegate an opportunity to construct alternative adaptor operations from the database operations. Then invokes the delegate method databaseContextWillPerformAdaptorOperations to let the delegate substitute its own array of EOAdaptorOperations. Performs the EOAdaptorOperations on an available EOAdaptorChannel.
     * If the save succeeds, updates the snapshots in the receiver to reflect the new state of the server. Throws an exception if the adaptor is unable to perform the operations. The exception's userInfo dictionary contains these keys:
     * The userInfo dictionary may also contain some of the keys listed in the method description for the EOAdaptorChannel method performAdaptorOperation.
     * You should never need to invoke this method directly.
     */
    public void performChanges(){
        return; //TODO codavaj!!
    }

    /**
     * Prepares to save changes. If needed, generates primary keys for any new objects in editingContext that are owned by the receiver. This method is invoked before the object graph is analyzed and foreign key assignments are performed. Throws an exception in the following conditions: The receiver is currently saving for a different editing context. The underlying adaptor failed to get new primary keys for one of the entities associated with the objects in editingContext. The row corresponding to one of editingContext's objects could not be found in the database.
     * You should never need to invoke this method directly; it is invoked by the Framework.
     */
    public void prepareForSaveWithCoordinator(com.webobjects.eocontrol.EOObjectStoreCoordinator coordinator, com.webobjects.eocontrol.EOEditingContext editingContext){
        return; //TODO codavaj!!
    }

    /**
     * Constructs a list of EODatabaseOperations for all changes to objects in the EOEditingContext that are owned by the receiver. Forwards any relationship changes discovered but not owned by the receiver to the EOObjectStoreCoordinator.
     * This method is typically invoked in the course of an EOObjectStoreCoordinator saving changes through its saveChangesInEditingContext method. It is invoked after prepareForSaveWithCoordinator and before ownsGlobalID.
     * You should never need to invoke this method directly.
     */
    public void recordChangesInEditingContext(){
        return; //TODO codavaj!!
    }

    /**
     * Records snapshot under the globalID gid. Throws an exception in the following conditions: There is no transaction in progress. gid is null. snapshot is null
     * This method only records snapshots locally (in the transaction scope). If you want to record snapshots globally, use the corresponding EODatabase method.
     */
    public void recordSnapshotForGlobalID(com.webobjects.foundation.NSDictionary snapshot, com.webobjects.eocontrol.EOGlobalID gid){
        return; //TODO codavaj!!
    }

    /**
     * For the object identified by gidgids, which is the array of globalIDs identifying the destination objects for the to-many relationship named name. Throws an exception in the following conditions: There is no transaction in progress. gid is null. gids is null
     * This method only records snapshots locally (in the transaction scope). If you want to record snapshots globally, use the corresponding EODatabase method.
     */
    public void recordSnapshotForSourceGlobalID(com.webobjects.foundation.NSArray gids, com.webobjects.eocontrol.EOGlobalID gid, java.lang.String name){
        return; //TODO codavaj!!
    }

    /**
     * Records the snapshots in snapshots, which is a dictionary whose keys are globalIDs and whose values are the snapshots for the enterprise objects identified by those globalIDs. Throws an exception if invoked when no transaction is in progress.
     * This method only records snapshots locally (in the transaction scope). If you want to record snapshots globally, use the corresponding EODatabase method.
     */
    public void recordSnapshots(com.webobjects.foundation.NSDictionary snapshots){
        return; //TODO codavaj!!
    }

    /**
     * Records a collection of to-many snapshots from a dictionary keyed by globalID. The snapshots parameter should be a dictionary of NSDictionaries. The top-level dictionary has as its key the globalID of the Enterprise Object for which to-many relationship snapshots are being recorded. That key's value is a dictionary whose keys are the names of the Enterprise Object's to-many relationships, and whose values are arrays of globalIDs that identify the objects at the destination of each relationship. Throws an exception if invoked when no transaction is in progress
     * This method only records snapshots locally (in the transaction scope). If you want to record snapshots globally, use the corresponding EODatabase method.
     */
    public void recordToManySnapshots(com.webobjects.foundation.NSDictionary snapshots){
        return; //TODO codavaj!!
    }

    /**
     * Applies changes supplied from another EOCooperatingObjectStore (through the EOObjectStoreCoordinator) to the database operation for object in the receiver. For example, an insert of an object in a relationship property might require changing a foreign key property in an object owned by another cooperating object store. This method can be invoked any time after prepareForSaveWithCoordinator and before ownsGlobalID.
     */
    public void recordUpdateForObject(com.webobjects.eocontrol.EOEnterpriseObject object, com.webobjects.foundation.NSDictionary changes){
        return; //TODO codavaj!!
    }

    /**
     * Refault the Enterprise Object identified by globalID in the editing context context. Throws an exception if globalID is not an instance of EOKeyGlobalID.
     * Newly-inserted objects should not be refaulted. Since they are not in the external store, they can not be refetched; attempting this will cause an exception to be thrown. Don't refault to-many relationship arrays, just recreate them.
     * This method should be used with caution since refaulting an object doesn't remove the object's snapshot from the undo stack, with the result that object snapshot may no longer refer to the proper object.
     */
    public void refaultObject(com.webobjects.eocontrol.EOEnterpriseObject object, com.webobjects.eocontrol.EOGlobalID globalID, com.webobjects.eocontrol.EOEditingContext context){
        return; //TODO codavaj!!
    }

    /**
     * Registers the EODatabaseChannel channel with the receiver, adding it from the pool of available channels used to service fetch and fault requests. Throws an exception if the receiver is not the parent object for channel or if channel is already registered with the receiver.
     * Use this method if you need to perform more than one fetch simultaneously.
     */
    public void registerChannel(com.webobjects.eoaccess.EODatabaseChannel channel){
        return; //TODO codavaj!!
    }

    /**
     * Returns an array containing all of the EODatabaseChannels that have been registered for use with the receiver.
     */
    public com.webobjects.foundation.NSArray registeredChannels(){
        return null; //TODO codavaj!!
    }

    /**
     * Finds the EOObjectStoreCoordinator for editingContext and checks whether it already contains an EODatabaseContext cooperating store for model. If it does, it returns that EODatabaseContext. Otherwise it instantiates a new EODatabaseContext, adds it to the coordinator, and returns it.
     */
    public static com.webobjects.eoaccess.EODatabaseContext registeredDatabaseContextForModel(com.webobjects.eoaccess.EOModel model, com.webobjects.eocontrol.EOEditingContext editingContext){
        return null; //TODO codavaj!!
    }

    /**
     * Returns the cooperating object store that is registered with the EOObjectStoreCoordinator coordinator for the EOModel model. If no cooperating object store is registered for model, this method instantiates a new EODatabaseContext, adds it to the coordinator, and returns it.
     */
    public static com.webobjects.eoaccess.EODatabaseContext registeredDatabaseContextForModel(com.webobjects.eoaccess.EOModel model, com.webobjects.eocontrol.EOObjectStoreCoordinator coordinator){
        return null; //TODO codavaj!!
    }

    /**
     * Registers as a locked object the Enterprise Object identified by gid. This method is used internally by the Framework to keep track of objects corresponding to rows that are locked in the database.
     */
    public void registerLockedObjectWithGlobalID(com.webobjects.eocontrol.EOGlobalID gid){
        return; //TODO codavaj!!
    }

    /**
     * Instructs the adaptor to roll back the transaction. Rolls back any changed snapshots and releases all locks. Throws an exception if the adaptor is unable to roll back the transaction cleanly; the error message indicates the nature of the problem.
     */
    public void rollbackChanges(){
        return; //TODO codavaj!!
    }

    /**
     * Sent by an EOEditingContext context to its EOObjectStore to commit changes. Normally, the EODatabaseContext is not called directly by this method but is instead called by an EOObjectStoreCoordinator. Throws an exception if an error occurs; the error message indicates the nature of the problem.
     */
    public void saveChangesInEditingContext(com.webobjects.eocontrol.EOEditingContext context){
        return; //TODO codavaj!!
    }

    /**
     * Sets the class that is created and registered when a CooperatingObjectStoreNeeded notification is posted by an EOObjectStoreCoordinator to contextclass.
     */
    public static void setContextClassToRegister(java.lang.Class contextClass){
        return; //TODO codavaj!!
    }

    public void setCoordinator(com.webobjects.eocontrol.EOObjectStoreCoordinator coord){
        return; //TODO codavaj!!
    }

    /**
     * Sets the default delegate for new instances of EODatabaseContext to defaultDelegate.
     */
    public static void setDefaultDelegate(java.lang.Object defaultDelegate){
        return; //TODO codavaj!!
    }

    /**
     * Sets delegate as the delegate for the receiver and all the receiver's EODatabaseChannels.
     */
    public void setDelegate(java.lang.Object delegate){
        return; //TODO codavaj!!
    }

    /**
     * Based on the value of the Boolean parameter bool, enables or disables automatic loading of Enterprise Objects into the default shared editing context when a database context loads a model which contains shared object fetch specifications. Automatic loading is enabled by default.
     */
    public static void setSharedObjectLoadingEnabled(boolean bool){
        return; //TODO codavaj!!
    }

    /**
     * Sets the update strategy used by the receiver to strategy, which must be one of the following constants: UpdateWithOptimisticLocking UpdateWithPessimisticLocking UpdateWithNoLocking Throws an exception if the receiver has any transactions in progress, or if you try to set strategy to UpdateWithPessimisticLocking and the receiver's EODatabase already has snapshots.
     */
    public void setUpdateStrategy(int strategy){
        return; //TODO codavaj!!
    }

    /**
     * Returns the snapshot associated with gid or null if there isn't one. Searches first locally (in the transaction scope) and then in the EODatabase.
     */
    public com.webobjects.foundation.NSDictionary snapshotForGlobalID(com.webobjects.eocontrol.EOGlobalID gid){
        return null; //TODO codavaj!!
    }

    /**
     * Returns the snapshot for the Enterprise Object identified by the globalID gid, provided the snapshot's timestamp is greater than or equal to timestamp. Returns null if there isn't a snapshot for gid or if the snapshot's timestamp is earlier (less) than the reference timestamp. Searches first locally (in the transaction scope) and then in the EODatabase.
     */
    public com.webobjects.foundation.NSDictionary snapshotForGlobalID(com.webobjects.eocontrol.EOGlobalID gid, long timestamp){
        return null; //TODO codavaj!!
    }

    /**
     * Returns the to-many snapshot for the relationship named name belonging to the Enterprise Object identified by the globalID gid, or null if there is no to-many snapshot. Searches first locally (in the transaction scope) and then in the EODatabase.
     * A to-many snapshot is an array of globalIDs which identify the objects at the destination of a to-many relationship.
     */
    public com.webobjects.foundation.NSArray snapshotForSourceGlobalID(com.webobjects.eocontrol.EOGlobalID gid, java.lang.String name){
        return null; //TODO codavaj!!
    }

    /**
     * Returns the to-many snapshot for the globalID gid and relationship name, provided that the timestamp of the snapshot is greater than or equal to timestamp. Returns null if there isn't a to-many snapshot for gid and name, or if the snapshot's timestamp is earlier (less) than the reference timestamp. Searches first locally (in the transaction scope) and then in the EODatabase.
     */
    public com.webobjects.foundation.NSArray snapshotForSourceGlobalID(com.webobjects.eocontrol.EOGlobalID gid, java.lang.String name, long timestamp){
        return null; //TODO codavaj!!
    }

    /**
     * This method is used to protect access to the receiver from concurrent operations by multiple threads. Typically, this method is invoked by the Frameworks as most EODatabaseContexts are acting as cooperating EOObjectStores managed by an EOObjectStoreCoordinator. The coordinator unlocks its stores when necessary. However, applications which make direct use of an EODatabaseContext should lock and unlock it as appropriate. Do not confuse this with any methods which work with the database locking mechanism.
     */
    public void unlock(){
        return; //TODO codavaj!!
    }

    /**
     * Unregisters the EODatabaseChannel channel with the receiver, removing it from the pool of available channels used to service fetch and fault requests. Throws an exception if channel is not registered with the receiver.
     */
    public void unregisterChannel(com.webobjects.eoaccess.EODatabaseChannel channel){
        return; //TODO codavaj!!
    }

    /**
     * Returns the update strategy used by the receiver, one of the following constants: UpdateWithOptimisticLocking UpdateWithPessimisticLocking UpdateWithNoLocking The default strategy is UpdateWithOptimisticLocking.
     */
    public int updateStrategy(){
        return 0; //TODO codavaj!!
    }

    /**
     * Returns values for the specified keys from the snapshot of object. The returned values are used primarily by another EODatabaseContext to extract foreign key properties for objects owned by the receiver.
     */
    public com.webobjects.foundation.NSDictionary valuesForKeys(com.webobjects.foundation.NSArray keys, com.webobjects.eocontrol.EOEnterpriseObject object){
        return null; //TODO codavaj!!
    }

    /**
     * This interface defines a delegate to EODatabaseContext to to handle specific requests that are ordinarily handled by EODatabaseContext. The delegate can use these methods to preempt the operations, modify results, or simply track activity.
     * An EODatabaseContext shares its delegate with its EODatabaseChannels. These delegate methods are actually sent from EODatabaseChannel, but they're defined in EODatabaseContext for ease of access:
     * The EODatabaseContext delegate methods can be used to intervene when objects are created and when they're fetched from the database. This gives one more fine-grained control over such issues as how an object's primary key is generated (databaseContextNewPrimaryKey), how and if objects are locked (databaseContextShouldLockObjectWithGlobalID), what fetch specification is used to fetch objects (databaseContextShouldSelectObjects), how batch faulting is performed (databaseContextShouldFetchArrayFault and databaseContextShouldFetchObjectFault), and so on.
     */
    public static interface Delegate{
        /**
         * Invoked from objectsWithFetchSpecification after fetching objects into the editing context ec using fetchSpec. The array parameter contains the fetched objects. The delegate may take whatever action is needed.
         */
        abstract void databaseContextDidFetchObjects(com.webobjects.eoaccess.EODatabaseContext dbCtxt, com.webobjects.foundation.NSArray array, com.webobjects.eocontrol.EOFetchSpecification fetchSpec, com.webobjects.eocontrol.EOEditingContext ec);

        /**
         * Invoked from the EODatabaseChannel method selectObjectsWithFetchSpecification to tell the delegate that dbChannel has selected the objects on behalf of dbCtxt as specified by fetchSpec. The delegate may take whatever action is needed.
         */
        abstract void databaseContextDidSelectObjects(com.webobjects.eoaccess.EODatabaseContext dbCtxt, com.webobjects.eocontrol.EOFetchSpecification fetchSpec, com.webobjects.eoaccess.EODatabaseChannel dbChannel);

        /**
         * Invoked when a to-one fault cannot find its data in the database. object is a cleared fault identified by the globalID gid. If this method returns true, dbCtxt assumes that the delegate set the information into the object, and created a snapshot of it, correcting the problem.
         * If the delegate returns false or if the delegate method is not implemented, dbCtxt tracks the gid of the offending object. If the tracked gid is in the list of updated objects when changes to the editing context are saved, the database context throws an exception. The method missingObjectGlobalIDs can be used to get a list of objects that failed to fetch.
         */
        abstract boolean databaseContextFailedToFetchObject(com.webobjects.eoaccess.EODatabaseContext dbCtxt, java.lang.Object object, com.webobjects.eocontrol.EOGlobalID gid);

        /**
         * Invoked if the newly inserted Enterprise Object object doesn't have a primary key set. The delegate can implement custom primary key generation, or return null, in which case the database context dbCtxt will send a primaryKeyForNewRowWithEntity message to an EOAdaptorChannel to generate the key.
         * Should return a dictionary containing the attribute or attributes (if object has a compound primary key) that make up object's primary key, or null to have the database context generate the primary key.
         */
        abstract com.webobjects.foundation.NSDictionary databaseContextNewPrimaryKey(com.webobjects.eoaccess.EODatabaseContext dbCtxt, java.lang.Object object, com.webobjects.eoaccess.EOEntity entity);

        /**
         * Invoked when a fault is fired, this delegate method lets you fine-tune the behavior of batch faulting. Delegates can fetch the array fault themselves (for example, by using the EODatabaseContext method batchFetchRelationship) and return false, or return true to allow the database context to do the fetch itself. If dbCtxt performs the fetch, it will batch fault according to the batch count on the relationship being fetched.
         */
        abstract boolean databaseContextShouldFetchArrayFault(com.webobjects.eoaccess.EODatabaseContext dbCtxt, java.lang.Object object);

        /**
         * Invoked when a fault is fired, this delegate method lets you fine-tune the behavior of batch faulting. Delegates can fetch the fault themselves (for example, by using the EODatabaseContext method objectsWithFetchSpecification ) and return false, or return true to allow dbCtxt to fetch the fault. If the database context performs the fetch, it will batch fault according to the batch count on the entity being fetched.
         */
        abstract boolean databaseContextShouldFetchObjectFault(com.webobjects.eoaccess.EODatabaseContext dbCtxt, java.lang.Object object);

        /**
         * Invoked from objectsWithFetchSpecification to give the delegate the opportunity to satisfy ec's fetch request (using the criteria specified in fetchSpec) from a local cache. If the delegate returns null, dbCtxt performs the fetch. Otherwise, the returned array is returned as the fetch result.
         */
        abstract com.webobjects.foundation.NSArray databaseContextShouldFetchObjects(com.webobjects.eoaccess.EODatabaseContext dbCtxt, com.webobjects.eocontrol.EOFetchSpecification fetchSpec, com.webobjects.eocontrol.EOEditingContext ec);

        /**
         * Invoked when an exception is thrown that might be handled by reconnecting to the database. The delegate should return true to permit the database context to handle the exception by automatically trying to reconnect to the database, for example, if the delegate determines that the exception was due to a dropped connection.
         * The delegate should return false to handle the exception itself with a reconnection strategy appropriate to the exception and application. In this case, the database context assumes that all reconnection and associated clean-up have been performed by the delegate and it immediately retries the operation that generated the original exception.
         * If exception is not one that can be handled by reconnecting to the database, the delegate should simply re-throw it. If this method is not implemented, reconnection will be handled by the response of the adaptor to isDroppedConnectionException.
         */
        abstract boolean databaseContextShouldHandleDatabaseException(com.webobjects.eoaccess.EODatabaseContext dbCtxt, java.lang.Throwable exception);

        /**
         * Invoked from invalidateObjectsWithGlobalIDs . The delegate should return false to prevent the object as identified by gid from being invalidated, and its snapshot from being cleared.
         */
        abstract boolean databaseContextShouldInvalidateObjectWithGlobalID(com.webobjects.eoaccess.EODatabaseContext dbCtxt, com.webobjects.eocontrol.EOGlobalID gid, com.webobjects.foundation.NSDictionary dic);

        /**
         * Invoked from lockObjectWithGlobalID. The delegate should return true to proceed to lock the object identified by gid, false to cause lockObjectWithGlobalID to return without locking.
         * Delegates can override the locking mechanism by implementing their own locking procedure and returning false. Values from dic can be used to create a qualifier from the attributes used for locking specified for the object's entity. If custom locking is implemented, the delegate should throw an exception if it fails to lock exactly one object.
         */
        abstract boolean databaseContextShouldLockObjectWithGlobalID(com.webobjects.eoaccess.EODatabaseContext dbCtxt, com.webobjects.eocontrol.EOGlobalID gid, com.webobjects.foundation.NSDictionary dic);

        /**
         * Invoked from lockObjectWithGlobalID. This method allows the delegate to suppress exception that was thrown during dbCtxt's attempt to lock the object.
         */
        abstract boolean databaseContextShouldRaiseExceptionForLockFailure(com.webobjects.eoaccess.EODatabaseContext dbCtxt, java.lang.Throwable exception);

        /**
         * Invoked from the EODatabaseChannel method selectObjectsWithFetchSpecification to tell the delegate that the database channel dbChannel will select objects on behalf of the database context dbCtxt as specified by fetchSpec. If the delegate returns true, the channel will proceed to select the object. If the delegate returns false (possibly after issuing custom SQL against the adaptor) the channel will skip the select and return immediately.
         * The delegate should not modify fetchSpec's qualifier or fetch order.
         */
        abstract boolean databaseContextShouldSelectObjects(com.webobjects.eoaccess.EODatabaseContext dbCtxt, com.webobjects.eocontrol.EOFetchSpecification fetchSpec, com.webobjects.eoaccess.EODatabaseChannel dbChannel);

        /**
         * Invoked from the EODatabaseChannel method fetchObject when the database context already has a snapshot for a row fetched from the database. This method is invoked without first checking whether the current snapshot dic and new snapshot dic2 are equivalent.
         * The default behavior is not to update the current snapshot with the new snapshot. The delegate can override this behavior by returning dic2, or some other snapshot, to be recorded as the updated snapshot for the object, which is identified by the globalID gid. In this case, dbCtxt broadcasts an ObjectsChangedInStoreNotification, indicating that all objects corresponding to this globalID are now invalid.
         * Returning either dic or null prevents the current snapshot from being replaced.
         */
        abstract com.webobjects.foundation.NSDictionary databaseContextShouldUpdateCurrentSnapshot(com.webobjects.eoaccess.EODatabaseContext dbCtxt, com.webobjects.foundation.NSDictionary dic, com.webobjects.foundation.NSDictionary dic2, com.webobjects.eocontrol.EOGlobalID gid, com.webobjects.eoaccess.EODatabaseChannel dbChannel);

        /**
         * Invoked from the EODatabaseChannel method selectObjectsWithFetchSpecification. If the delegate returns true, the channel locks the rows being selected. If the delegate returns false, the channel selects the rows without locking.
         * The delegate should not modify fetchSpec's qualifier or fetch order.
         */
        abstract boolean databaseContextShouldUsePessimisticLock(com.webobjects.eoaccess.EODatabaseContext dbCtxt, com.webobjects.eocontrol.EOFetchSpecification fetchSpec, com.webobjects.eoaccess.EODatabaseChannel dbChannel);

        /**
         * Invoked just before the Framework-generated fetch specification, fetchSpec, is used to clear the fault for the specified globalID (gid) and relationship(rel). The delegate can take whatever action is needed.
         * Note: It is very dangerous to modify the fetch specification.
         */
        abstract void databaseContextWillFireArrayFaultForGlobalID(com.webobjects.eoaccess.EODatabaseContext dbCtxt, com.webobjects.eocontrol.EOGlobalID gid, com.webobjects.eoaccess.EORelationship rel, com.webobjects.eocontrol.EOFetchSpecification fetchSpec, com.webobjects.eocontrol.EOEditingContext ec);

        /**
         * Invoked just before the Framework-generated fetch specification, fetchSpec, is used to clear the fault for the specified globalID, gid. The delegate can take whatever action is needed.
         * Note: It is very dangerous to modify the fetch specification.
         */
        abstract void databaseContextWillFireObjectFaultForGlobalID(com.webobjects.eoaccess.EODatabaseContext dbCtxt, com.webobjects.eocontrol.EOGlobalID gid, com.webobjects.eocontrol.EOFetchSpecification fetchSpec, com.webobjects.eocontrol.EOEditingContext ec);

        /**
         * Invoked from performChanges. If the delegate responds to this message, it must return an array of EOAdaptorOperations that the database context can submit to an EOAdaptorChannel for execution. The delegate can fabricate its own array by asking each of the EODatabaseOperation objects in databaseOps for its list of EOAdaptorOperations, and adding them to the array which will eventually be returned by this method.
         * The delegate may optimize, order, or transform the list in any way it deems necessary. This is useful for applications that need a special ordering of the EOAdaptorOperations so as not to violate any database referential integrity constraints.
         */
        abstract com.webobjects.foundation.NSArray databaseContextWillOrderAdaptorOperations(com.webobjects.eoaccess.EODatabaseContext dbCtxt, com.webobjects.foundation.NSArray databaseOps);

        /**
         * Invoked from performChanges to allow the delegate to send a different array of EOAdaptorOperations to be executed by dbCtx. The delegate may return adaptorOps unchanged.
         * This method is useful for applications that need a special ordering of the EOAdaptorOperations so as not to violate any database referential integrity constraints.
         */
        abstract com.webobjects.foundation.NSArray databaseContextWillPerformAdaptorOperations(com.webobjects.eoaccess.EODatabaseContext dbCtxt, com.webobjects.foundation.NSArray adaptorOps, com.webobjects.eoaccess.EOAdaptorChannel adChannel);

        /**
         * Allows the delegate to determine whether the database context dbCtx should run the adaptor login panel and open the adaptor channel associated with the database channel dbChannel, if the adaptor channel is not already open. The delegate should return true to permit the database context to run the login panel, false to prevent it. If the delegate returns false, it is responsible for opening the adaptor channel itself.
         */
        abstract boolean databaseContextWillRunLoginPanelToOpenDatabaseChannel(com.webobjects.eoaccess.EODatabaseContext dbCtx, com.webobjects.eoaccess.EODatabaseChannel dbChannel);

    }
    /**
     * DatabaseContextEvent is a subclass of EOEvent, the parent class for objects that gather information, such as duration or order of execution, about various operations in WebObjects. DatabaseContextEvent adds knowledge of interaction with an external database to the EOEvent class.
     * DatabaseContextEvent logs two types of events:
     * objectsWithFetchSpecification saveChangesInEditingContext
     * See Also:Serialized Form
     */
    public static class DatabaseContextEvent extends com.webobjects.eocontrol.EOEvent{
        /**
         * The type of DatabaseContextEvent that is logged whenever the method objectsWithFetchSpecification is invoked.
         */
        public static java.lang.String ObjectsWithFetchSpecification;

        /**
         * The type of DatabaseContextEvent that is logged whenever the method saveChangesInEditingContext is invoked.
         */
        public static java.lang.String SaveChangesInEditingContext;

        /**
         * Creates and returns a new DatabaseContextEvent.
         */
        public DatabaseContextEvent(){
             //TODO codavaj!!
        }

        /**
         * Creates and returns a new DatabaseContextEvent and sets its type to type. The two types of DatabaseContextEvent are:
         * objectsWithFetchSpecification saveChangesInEditingContext
         * Parameters:type - The event type to set for the new DatabaseContextEvent object.
         */
        public DatabaseContextEvent(java.lang.String type){
             //TODO codavaj!!
        }

    }
}

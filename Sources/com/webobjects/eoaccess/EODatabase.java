package com.webobjects.eoaccess;
/**
 * An EODatabase object represents a single database server. It contains an EOAdaptor that is capable of communicating with the database server, a list of EOModels that describe the server's schema, a list of EODatabaseContexts that are connected to the server, and a set of snapshots representing the state of all objects stored in the server.
 * Each of an EODatabase's EODatabaseContexts forms a separate transaction scope, and is in effect a separate logical user to the server. An EODatabaseContext uses one or more pairs of EODatabaseChannel and EOAdaptorChannel objects to manage data operations (insert, update, delete, and fetch). Adaptors may support a limited number of contexts per database or channels per context, but an application is guaranteed at least one of each.
 * The EODatabase, EODatabaseContext, and EODatabaseChannel classes form the database level of the Enterprise Objects Framework. The database level is a client of the adaptor level, which is defined by the adaptor classes: EOAdaptor, EOAdaptorContext, and EOAdaptorChannel. Together, the database and adaptor levels make up the access layer of the Enterprise Objects Framework.
 * The database level acts as an intermediary between the adaptor level and the control layer, which includes an EOObjectStoreCoordinator and an EOEditingContext . The control layer operates in terms of Enterprise Objects, while the adaptor level operates in terms of database rows packaged as NSDictionaries. It is the job of the database level to perform the necessary object-to-relational translation between the two.
 * There's little need for an application's code to interact directly with an EODatabase object. An EOEditingContext creates its own database level objects, which create their own corresponding adaptor level objects. Once the network of objects is in place, the application might interact with an EODatabase to access its corresponding EOAdaptor object, but additional programmatic interaction is usually unnecessary.
 * EODatabase's most significant responsibility is to record snapshots for its EODatabaseContexts. A snapshot is a dictionary whose keys are attribute names and whose values are the corresponding, last-known database values. Enterprise Objects Framework records snapshots as it successfully fetches, inserts and updates enterprise objects. Snapshot information is used when changes to Enterprise Objects are saved back out to the database to ensure that row data has not been changed by someone else since it was last recorded by the application.
 * A snapshot contains entries for a row's primary key, class properties, foreign keys for class property relationships, and attributes used for locking. They are recorded under the globalIDs of their Enterprise Objects.
 * EODatabase also records snapshots for to-many relationships. These snapshots consist of an NSDictionary of NSDictionaries, in which the top-level dictionary has as its key the globalID of the enterprise object for which to-many relationships are being recorded. The key's value is a dictionary whose keys are the names of the enterprise object's to-many relationships. Each of these keys in turn has as its value an array of globalIDs that identify the objects at the destination of the relationship.
 * The snapshots made by an EODatabase form the global view of data for nearly every other part of the application, representing the current view of data in the server as far as the application is concerned (though other applications may have made changes). This global view is temporarily overridden locally by EODatabaseContexts, which form their own snapshots as they make changes during a transaction. When an EODatabaseContext commits its top-level transaction, it reconciles all changed snapshots with the global view of the database object, so that other database contexts (except those with open transactions) immediately use the new snapshots as well. EODatabaseContexts automatically use their EODatabase to record snapshots, so there's no need for the application to intervene in an EODatabase's snapshotting mechanism.
 * An EODatabase object also performs the function of caching enterprise objects for entities that cache their objects. An EODatabase's entity cache stores the globalIDs of Enterprise Objects for entities that cache their objects. The first time you perform a fetch against such an entity, all of its objects are fetched, regardless of the fetch specification used. The globalIDs of the resulting objects are stored in the EODatabase's entity cache by entity name. Whenever possible, subsequent fetches are performed against the cache (in memory) rather than against the database. With a globalID, Enterprise Objects Framework can look up the values for the corresponding object in its snapshot using EODatabase's or EODatabaseContext's snapshotForGlobalID method.
 * As an example, suppose that you have an entity named Rating that contains all the valid ratings for Movies (G, PG, R, and so on). Rather than store a Movie's rating directly in the Movie as an attribute, Movie maintains a relationship to a Rating. To specify a rating for a movie, users select the rating from a pop-up list of the possible values. Since the ratings in the Rating entity never change, the Rating entity should cache its objects. The values that populate the rating pop-up list are only fetched once, and there's no need to fetch them again; the relationships between Movies and Ratings can be maintained without subsequent fetches.
 * The entity cache is managed automatically; you shouldn't have to manipulate it explicitly. However, if you need to access or alter the cache, EODatabase provides several methods for interacting with it.
 * See Also:EODatabaseContext, EOGlobalID, EOEntity
 */
public class EODatabase implements com.webobjects.foundation.NSDisposable{
    /**
     * Creates and returns a new EODatabase object, specifying adaptor as the new EODatabase's adaptor. Throws an exception if adaptor is null.
     * Typically, you don't need to programmatically create EODatabase objects. Rather, they are created automatically by the control layer. If you do need to create an EODatabase programmatically, never associate more than one EODatabase with a given EOAdaptor. In general, create an EODatabase with an EOModel instead of an EOAdaptor.
     * Parameters:adaptor - The adaptor for the new EODatabase instance. Throws: IllegalArgumentException - if adaptor is null.See Also:EODatabase.addModel(EOModel aModel), EOModel.adaptorName()
     */
    public EODatabase(com.webobjects.eoaccess.EOAdaptor adaptor){
         //TODO codavaj!!
    }

    /**
     * Creates and returns a new EODatabase object, also creating an instance of the EOAdaptor named in model and assigning it as the new EODatabase's adaptor.
     * Typically, you don't need to programmatically create EODatabase objects. Rather, they are created automatically by the control layer.
     * Parameters:model - An EOModel which specifies the adaptor to create and associate with the new EODatabase object.See Also:EODatabase.addModel(EOModel aModel), EODatabase.adaptor(), EOModel.adaptorName()
     */
    public EODatabase(com.webobjects.eoaccess.EOModel model){
         //TODO codavaj!!
    }

    /**
     * Returns the EOAdaptor used by the receiver for communication with the database server. The application can interact directly with the EOAdaptor, but should avoid altering its state (for example, by starting a transaction with one of its adaptor contexts).
     */
    public com.webobjects.eoaccess.EOAdaptor adaptor(){
        return null; //TODO codavaj!!
    }

    /**
     * Adds model to the receiver's list of EOModels. This allows EODatabases to load entities and their properties only as they are needed, by dividing them among separate EOModels. model must use the same EOAdaptor as the receiver and use the same connection dictionary as the receiver's other EOModels.
     */
    public void addModel(com.webobjects.eoaccess.EOModel model){
        return; //TODO codavaj!!
    }

    /**
     * Returns true if model is already in the receiver's list of EOModels, or if model can be added to the list. To be added to the list of models, the following conditions must be met: model is not in the receiver's model list, and model specifies the same adaptor name as the receiver, and the adaptor responds true to canServiceModel
     * Otherwise, returns false.
     */
    public boolean addModelIfCompatible(com.webobjects.eoaccess.EOModel model){
        return false; //TODO codavaj!!
    }

    /**
     * Returns EODatabase's class delegate.
     */
    public static java.lang.Object classDelegate(){
        return null; //TODO codavaj!!
    }

    /**
     * Decrements the reference count for the shared snapshot associated with gid, if the receiver releases unreferenced snapshots. If no more objects refer to the snapshot, removes it from the snapshot table. Throws an exception if the snapshot reference count is already zero or if there is no snapshot recorded for gid.
     * If snapshot releasing is turned off, this method does nothing.
     */
    public void decrementSnapshotCountForGlobalID(com.webobjects.eocontrol.EOGlobalID gid){
        return; //TODO codavaj!!
    }

    /**
     * Configures EODatabase instances not to release unreferenced snapshots.
     */
    public static void disableSnapshotRefCounting(){
        return; //TODO codavaj!!
    }

    /**
     * Conformance to NSDisposable.
     */
    public void dispose(){
        return; //TODO codavaj!!
    }

    /**
     * Searches the receiver's list of registered EOModels and returns the first EOEntity found whose name matches the entity name of object. Returns null if no entity can be found that corresponds to object.
     */
    public com.webobjects.eoaccess.EOEntity entityForObject(com.webobjects.eocontrol.EOEnterpriseObject object){
        return null; //TODO codavaj!!
    }

    /**
     * Searches the receiver's list of registered EOModels and returns the first EOEntity found with the name entityName. Returns null if no entity can be found that corresponds to entityName.
     */
    public com.webobjects.eoaccess.EOEntity entityNamed(java.lang.String entityName){
        return null; //TODO codavaj!!
    }

    /**
     * Removes all of the receiver's snapshots and posts an ObjectsChangedInStoreNotification describing the invalidated objects.
     */
    public void forgetAllSnapshots(){
        return; //TODO codavaj!!
    }

    /**
     * Removes the snapshot recorded for the Enterprise Object identified by gid and posts an ObjectsChangedInStoreNotification describing the invalidated object.
     */
    public void forgetSnapshotForGlobalID(com.webobjects.eocontrol.EOGlobalID gid){
        return; //TODO codavaj!!
    }

    /**
     * Removes the snapshots recorded for the Enterprise Objects identified by the globalIDs in array and posts an ObjectsChangedInStoreNotification describing the invalidated objects.
     */
    public void forgetSnapshotsForGlobalIDs(com.webobjects.foundation.NSArray array){
        return; //TODO codavaj!!
    }

    /**
     * Invoked to initiate clean up when the Framework detects a dropped database connection. EODatabase cleans up by sending handleDroppedConnection first to its adaptor, and then to each of its registered database contexts. When the cleanup procedure is complete, the Framework can automatically reconnect to the database.
     * Never invoke this method yourself; it is invoked automatically by the Framework.
     */
    public void handleDroppedConnection(){
        return; //TODO codavaj!!
    }

    /**
     * Increments the reference count for the shared snapshot associated with gid, if the receiver releases unreferenced snapshots. Throws an exception if there is no snapshot recorded for gid.
     * If snapshot releasing is turned off, this method does nothing.
     */
    public void incrementSnapshotCountForGlobalID(com.webobjects.eocontrol.EOGlobalID gid){
        return; //TODO codavaj!!
    }

    /**
     * Invalidates the receiver's result cache.
     */
    public void invalidateResultCache(){
        return; //TODO codavaj!!
    }

    /**
     * Invalidates the result cache containing the globalIDs for the objects associated with the EOEntity identified by name.
     */
    public void invalidateResultCacheForEntityNamed(java.lang.String name){
        return; //TODO codavaj!!
    }

    /**
     * Returns the array of EOModels registered for the receiver.
     */
    public com.webobjects.foundation.NSArray models(){
        return null; //TODO codavaj!!
    }

    /**
     * Returns a new instance of EODatabase using the class delegate if it exists.
     */
    public static com.webobjects.eoaccess.EODatabase newDatabase(com.webobjects.eoaccess.EOModel model){
        return null; //TODO codavaj!!
    }

    /**
     * Records snapshot for the Enterprise Object identified by the globalID gid.
     */
    public void recordSnapshotForGlobalID(com.webobjects.foundation.NSDictionary snapshot, com.webobjects.eocontrol.EOGlobalID gid){
        return; //TODO codavaj!!
    }

    /**
     * For the object identified by gidgids, which is the array of globalIDs identifying the destination objects for the to-many relationship named name.
     */
    public void recordSnapshotForSourceGlobalID(com.webobjects.foundation.NSArray gids, com.webobjects.eocontrol.EOGlobalID gid, java.lang.String name){
        return; //TODO codavaj!!
    }

    /**
     * Records the snapshots in snapshots, which is a dictionary whose keys are globalIDs and whose values are the snapshots for the Enterprise Objects identified by those globalIDs.
     */
    public void recordSnapshots(com.webobjects.foundation.NSDictionary snapshots){
        return; //TODO codavaj!!
    }

    /**
     * Records a collection of to-many snapshots from a dictionary keyed by globalID. The snapshots parameter should be a dictionary of NSDictionaries. The top-level dictionary has as its key the globalID of the Enterprise Object for which to-many relationship snapshots are being recorded. That key's value is a dictionary whose keys are the names of the Enterprise Object's to- many relationships, and whose values are arrays of globalIDs that identify the objects at the destination of each relationship.
     */
    public void recordToManySnapshots(com.webobjects.foundation.NSDictionary snapshots){
        return; //TODO codavaj!!
    }

    /**
     * Registers context as one of the receiver's database contexts. Throws an exception if context was not constructed with the receiver as its EODatabase, or if context is already registered with the receiver.
     * You should never invoke this method directly; it is invoked automatically by the EODatabaseContext constructor.
     */
    public void registerContext(com.webobjects.eoaccess.EODatabaseContext context){
        return; //TODO codavaj!!
    }

    /**
     * Returns all the EODatabaseContexts that have been registered with the receiver, generally all the database contexts that were created with the receiver as their EODatabase object.
     */
    public com.webobjects.foundation.NSArray registeredContexts(){
        return null; //TODO codavaj!!
    }

    /**
     * Removes model from the receiver's list of EOModels. Throws an exception if model isn't registered as one of the receiver's models.
     */
    public void removeModel(com.webobjects.eoaccess.EOModel model){
        return; //TODO codavaj!!
    }

    /**
     * Returns an array containing the globalIDs of all the objects associated with the EOEntity identified by name.
     */
    public com.webobjects.foundation.NSArray resultCacheForEntityNamed(java.lang.String name){
        return null; //TODO codavaj!!
    }

    /**
     * Assigns delegate as EODatabase's class delegate. The class delegate is optional; it allows modification of the creation of theEODatabase for a model.
     */
    public static void setClassDelegate(java.lang.Object delegate){
        return; //TODO codavaj!!
    }

    /**
     * Updates the receiver's result cache for name with cache. cache is an array of the globalIDs for all the Enterprise Objects associated with the EOEntity identified by name.
     * This method is invoked automatically; you should never invoke it directly.
     */
    public void setResultCache(com.webobjects.foundation.NSArray cache, java.lang.String name){
        return; //TODO codavaj!!
    }

    /**
     * Sets the internal timestamp to the current system time. Used for recording subsequent snapshots.
     */
    public void setTimestampToNow(){
        return; //TODO codavaj!!
    }

    /**
     * Returns the snapshot for the Enterprise Object identified by the globalID gid, or null if there isn't a snapshot.
     */
    public com.webobjects.foundation.NSDictionary snapshotForGlobalID(com.webobjects.eocontrol.EOGlobalID gid){
        return null; //TODO codavaj!!
    }

    /**
     * Returns the snapshot for the Enterprise Object identified by the globalID gid, provided the snapshot's timestamp is greater than or equal to timestamp. Returns null if there isn't a snapshot for gid or if the snapshot's timestamp is earlier (less) than the reference timestamp.
     */
    public com.webobjects.foundation.NSDictionary snapshotForGlobalID(com.webobjects.eocontrol.EOGlobalID gid, long timestamp){
        return null; //TODO codavaj!!
    }

    /**
     * Returns the to-many snapshot for the relationship named name belonging to the Enterprise Object identified by the globalID gid, or null if there is no to-many snapshot. A to-many snapshot is an array of globalIDs which identify the objects at the destination of a to-many relationship.
     */
    public com.webobjects.foundation.NSArray snapshotForSourceGlobalID(com.webobjects.eocontrol.EOGlobalID gid, java.lang.String name){
        return null; //TODO codavaj!!
    }

    /**
     * Returns the to-many snapshot for the globalID gid and relationship name, provided that the timestamp of the snapshot is greater than or equal to timestamp. Returns null if there isn't a to-many snapshot for gid and name, or if the snapshot's timestamp is earlier (less) than the reference timestamp.
     */
    public com.webobjects.foundation.NSArray snapshotForSourceGlobalID(com.webobjects.eocontrol.EOGlobalID gid, java.lang.String name, long timestamp){
        return null; //TODO codavaj!!
    }

    /**
     * Returns a dictionary of all of the receiver's snapshots, keyed by globalID.
     */
    public com.webobjects.foundation.NSDictionary snapshots(){
        return null; //TODO codavaj!!
    }

    /**
     * Returns the timestamp of the snapshot for the object identified by the globalID gid, or DistantPastTimeInterval if there isn't a snapshot.
     */
    public long timestampForGlobalID(com.webobjects.eocontrol.EOGlobalID gid){
        return 0l; //TODO codavaj!!
    }

    /**
     * Returns the timestamp of the to-many snapshot for the relationship specified by name and the object identified by gid. Returns DistantPastTimeInterval if there isn't a snapshot.
     */
    public long timestampForSourceGlobalID(com.webobjects.eocontrol.EOGlobalID gid, java.lang.String name){
        return 0l; //TODO codavaj!!
    }

    /**
     * Removes context as one of the receiver's database contexts. Throws an exception if context is not registered with the receiver.
     * An EODatabaseContext automatically invokes this method when it is finalized. You should never invoke this method directly.
     */
    public void unregisterContext(com.webobjects.eoaccess.EODatabaseContext context){
        return; //TODO codavaj!!
    }

    /**
     * This interface defines a delegate to the EODatabase class to allow easy subclassing on eth EODatabase.
     */
    public static interface ClassDelegate{
        /**
         * Allows the delegate the opportunity to construct and return a different EODatabase object for teh model.
         */
        abstract com.webobjects.eoaccess.EODatabase newDatabaseForModel(com.webobjects.eoaccess.EOModel model);

    }
}

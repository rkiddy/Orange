package com.webobjects.eocontrol;
/**
 * An EOEditingContext object manages a graph of enterprise objects in an application; this object graph represents an internally consistent view of one or more external stores (most often a database).
 */
public class EOEditingContext extends com.webobjects.eocontrol.EOObjectStore implements com.webobjects.eocontrol.EOObserving, com.webobjects.foundation.NSLocking, com.webobjects.eocontrol.EOKeyValueArchiving, java.io.Serializable{
    /**
     * This notification is broadcast after changes are saved to the EOEditingContext's parent EOObjectStore. The notification contains: a notification object; an EOEditingContext; a userInfo dictionary with the following keys (constants) and values:
     * See Also:Constant Field Values
     */
    public static final java.lang.String EditingContextDidSaveChangesNotification="EOEditingContextDidSaveChangesNotification";

    /**
     * Messages with lower order numbers are processed before messages with higher order numbers. In an application built with the Application Kit, the constant order value schedules the editing context to perform its processing before the undo stack group is closed or window display is updated.
     * EOEditingContext also defines String constants for the names of the notifications it posts.
     * See Also:EOEditingContext.EditingContextDidSaveChangesNotification, EOEditingContext.ObjectsChangedInEditingContextNotification, Constant Field Values
     */
    public static final int EditingContextFlushChangesRunLoopOrdering=300000;

    /**
     * This notification is broadcast whenever changes are made in an EOEditingContext. It's similar to ObjectsChangedInStoreNotification, except that it contains objects rather than globalIDs. The notification contains: a notification object; an EOEditingContext; a userInfo dictionary with the following keys (constants) and values:
     * Interface layer EODisplayGroups (not WebObjects WODisplayGroups) listen for this notification to redisplay their contents.
     * See Also:Constant Field Values
     */
    public static final java.lang.String ObjectsChangedInEditingContextNotification="EOObjectsChangedInEditingContextNotification";

    /**
     * Creates a new EOEditingContext object with the default parent object store as its parent object store. Shares objects with the default shared editing context (if any) unless you change its shared editing context with setSharedEditingContext.
     * See Also:EOEditingContext.parentObjectStore(), EOEditingContext.defaultParentObjectStore(), EOEditingContext.setSharedEditingContext(com.webobjects.eocontrol.EOSharedEditingContext), EOObjectStore
     */
    public EOEditingContext(){
         //TODO codavaj!!
    }

    /**
     * Creates a new EOEditingContext object with parent as its parent object store. Shares objects with the default shared editing context (if any) unless you change its shared editing context with setSharedEditingContext.
     * Parameters:parent - the parent object store of new EOEditingContext object createdSee Also:EOEditingContext.parentObjectStore(), EOEditingContext.defaultParentObjectStore(), EOEditingContext.setSharedEditingContext(com.webobjects.eocontrol.EOSharedEditingContext), EOObjectStore
     */
    public EOEditingContext(com.webobjects.eocontrol.EOObjectStore parent){
         //TODO codavaj!!
    }

    /**
     * Adds editor to this EOEditingContext's set of EOEditingContext.Editors.
     */
    public void addEditor(java.lang.Object editor){
        return; //TODO codavaj!!
    }

    /**
     * Overrides the implementation inherited from EOObjectStore. If the objects associated with gid are already registered in this EOEditingContext, it returns an array of those objects. Otherwise, this method propagates the message up the object store hierarchy, through the parent object store, ultimately to the associated EODatabaseContext. The EODatabaseContext creates and returns a to-many fault.
     * When a parent EOEditingContext receives this on behalf of a child EOEditingContext and the EOGlobalID gid identifies a newly inserted object in the parent, the parent returns a copy of its object's relationship array with the member objects translated into objects in the child EOEditingContext.
     */
    public com.webobjects.foundation.NSArray arrayFaultWithSourceGlobalID(com.webobjects.eocontrol.EOGlobalID gid, java.lang.String name, com.webobjects.eocontrol.EOEditingContext context){
        return null; //TODO codavaj!!
    }

    /**
     * Returns a dictionary containing a snapshot of object that reflects its committed values (that is, its values as they were last committed to the database). This snapshot represents the state of the object before any modifications were made to it. The snapshot is updated to the newest object state after a save.
     */
    public com.webobjects.foundation.NSDictionary committedSnapshotForObject(com.webobjects.eocontrol.EOEnterpriseObject object){
        return null; //TODO codavaj!!
    }

    /**
     * Returns a dictionary containing a snapshot of object that reflects its state as it was at the beginning of the current event loop. After the end of the current event, upon invocation of processRecentChanges, this snapshot is updated to hold the modified state of the object.
     */
    public com.webobjects.foundation.NSDictionary currentEventSnapshotForObject(com.webobjects.eocontrol.EOEnterpriseObject object){
        return null; //TODO codavaj!!
    }

    public static java.lang.Object decodeWithKeyValueUnarchiver(com.webobjects.eocontrol.EOKeyValueUnarchiver unarchiver){
        return null; //TODO codavaj!!
    }

    public static long defaultFetchTimestampLag(){
        return 0l; //TODO codavaj!!
    }

    /**
     * Returns the EOObjectStore that is the default parent object store for new editing contexts. Normally this is the EOObjectStoreCoordinator returned from the EOObjectStoreCoordinator static method defaultCoordinator.
     */
    public static com.webobjects.eocontrol.EOObjectStore defaultParentObjectStore(){
        return null; //TODO codavaj!!
    }

    public java.lang.Object delegate(){
        return null; //TODO codavaj!!
    }

    public com.webobjects.foundation.NSArray deletedObjects(){
        return null; //TODO codavaj!!
    }

    /**
     * Specifies that object should be removed from this EOEditingContext's parent EOObjectStore when changes are committed. At that time, the object will be removed from the uniquing tables.
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
     * Invoked to inform the EOObjectStore that it can stop keeping data about an object it passed to a child. This method should not be invoked directly. It is invoked automatically by the Framework.
     */
    public void editingContextDidForgetObjectWithGlobalID(com.webobjects.eocontrol.EOEditingContext context, com.webobjects.eocontrol.EOGlobalID gid){
        return; //TODO codavaj!!
    }

    /**
     * Returns this EOEditingContext's list of editors. Editors are special purpose delegate objects that may contain uncommitted changes that need to be validated and applied to enterprise objects before the EOEditingContext saves changes. For example, EODisplayGroups (EOInterface) register themselves as editors with the EOEditingContext of their data sources so that they can save any changes in the key text field.
     */
    public com.webobjects.foundation.NSArray editors(){
        return null; //TODO codavaj!!
    }

    public boolean editorsHaveChanges(){
        return false; //TODO codavaj!!
    }

    /**
     * Invoked by an EOEnterpriseObject object to ask the EOEditingContext to encode object using encoder.
     */
    public static void encodeObjectWithCoder(com.webobjects.eocontrol.EOEnterpriseObject object, com.webobjects.foundation.NSCoder coder){
        return; //TODO codavaj!!
    }

    /**
     * Deprecated.
     * On an EOEditingContext, this method does nothing.
     */
    public void encodeWithKeyValueArchiver(com.webobjects.eocontrol.EOKeyValueArchiver archiver){
        return; //TODO codavaj!!
    }

    /**
     * Overrides the implementation inherited from EOObjectStore. If the object associated with globalID is already registered in this EOEditingContext (or its shared context), this method returns that object. Otherwise, the method propagates the message up the object store hierarchy, through the parent object store, ultimately to the associated EODatabaseContext. The EODatabaseContext creates and returns a to-one fault. For example, suppose you want the department object whose deptID has a particular value. The most efficient way to get it is to look it up by its globalID using faultForGlobalID. If the department object is already registered in the EOEditingContext, faultForGlobalID returns that object (without going to the database). If not, a fault for this object is created, and the object is fetched from the database only when you trigger the fault. In a nested editing context configuration, where a parent EOEditingContext is sent faultForGlobalID on behalf of a child EOEditingContext and globalID identifies a newly inserted object in the parent, the parent registers a copy of the object in the child.
     * For more information refer to: "Working with Objects Across Multiple EOEditingContexts"
     */
    public com.webobjects.eocontrol.EOEnterpriseObject faultForGlobalID(com.webobjects.eocontrol.EOGlobalID gid, com.webobjects.eocontrol.EOEditingContext context){
        return null; //TODO codavaj!!
    }

    /**
     * Returns a fault for the raw row row. It is equivalent to invoking faultForRawRow(row, entityName, this );
     */
    public com.webobjects.eocontrol.EOEnterpriseObject faultForRawRow(com.webobjects.foundation.NSDictionary row, java.lang.String entityName){
        return null; //TODO codavaj!!
    }

    /**
     * Returns a fault for the raw row row by invoking faultForRawRow on this EOEditingContext's parent EOObjectStore with context as the editing context.
     */
    public com.webobjects.eocontrol.EOEnterpriseObject faultForRawRow(com.webobjects.foundation.NSDictionary row, java.lang.String entityName, com.webobjects.eocontrol.EOEditingContext context){
        return null; //TODO codavaj!!
    }

    /**
     * The fetch timestamp is a hint to refresh stale data on a subsequent fetch.
     */
    public long fetchTimestamp(){
        return 0l; //TODO codavaj!!
    }

    protected void finalize() throws java.lang.Throwable{
        return; //TODO codavaj!!
    }

    /**
     * Removes object from the uniquing tables and causes this EOEditingContext to remove itself from the object's list of observers. You should never invoke this method directly. The correct way to remove an object from its editing context is to remove every reference to the object by refaulting any object that references it (using refaultAllObjects or invalidateAllObjects). Also note that this method does not have the effect of deleting an object. In order to delete an object, you should either use the deleteObject method or remove the object from an owning relationship.
     */
    public void forgetObject(com.webobjects.eocontrol.EOEnterpriseObject object){
        return; //TODO codavaj!!
    }

    /**
     * Returns the EOGlobalID associated with object in this EOEditingContext or its shared context. All objects fetched from an external store are registered in an EOEditingContext along with a global identifier (EOGlobalID) that's used to uniquely identify each object to the external store. If object has not been registered in the EOEditingContext or in its shared editing context (that is, if no match is found), this method returns null. Objects are registered in an EOEditingContext using the insertObject method, or when fetching, with recordObject.
     */
    public com.webobjects.eocontrol.EOGlobalID globalIDForObject(com.webobjects.eocontrol.EOEnterpriseObject object){
        return null; //TODO codavaj!!
    }

    public boolean hasChanges(){
        return false; //TODO codavaj!!
    }

    /**
     * Overrides the implementation inherited from EOObjectStore to build the properties for the object identified by gid. When a parent EOEditingContext receives this on behalf of a child EOEditingContext (as represented by context), and the gid identifies an object instantiated in the parent, the parent returns properties extracted from its object and translated into the child's context. This ensures that a nested context "inherits" modified values from its parent EOEditingContext. If this EOEditingContext does not have object, the request is forwarded its parent EOObjectStore.
     */
    public void initializeObject(com.webobjects.eocontrol.EOEnterpriseObject object, com.webobjects.eocontrol.EOGlobalID gid, com.webobjects.eocontrol.EOEditingContext context){
        return; //TODO codavaj!!
    }

    /**
     * Invoked by an EOEnterpriseObject object to ask the EOEditingContext to initialize object from data in decoder.
     */
    public static java.lang.Object initObjectWithCoder(com.webobjects.eocontrol.EOEnterpriseObject object, com.webobjects.foundation.NSCoder coder){
        return null; //TODO codavaj!!
    }

    public com.webobjects.foundation.NSArray insertedObjects(){
        return null; //TODO codavaj!!
    }

    /**
     * Registers (by invoking insertObjectWithGlobalID) object to be inserted in this EOEditingContext's parent EOObjectStore the next time changes are saved. In the meantime, object is registered in the receiver with a temporary globalID.
     */
    public void insertObject(com.webobjects.eocontrol.EOEnterpriseObject object){
        return; //TODO codavaj!!
    }

    /**
     * Registers a new object identified by globalID that should be inserted in the parent EOObjectStore when changes are saved. Works by invoking recordObject, unless this EOEditingContext already contains the object. Sends object the message awakeFromInsertion. globalID must respond true to isTemporary. When the external store commits object, it re-records it with the appropriate permanent EOGlobalID.
     * It is an error to insert an object that's already registered in an editing context unless you are effectively undeleting the object by reinserting it.
     */
    public void insertObjectWithGlobalID(com.webobjects.eocontrol.EOEnterpriseObject object, com.webobjects.eocontrol.EOGlobalID gid){
        return; //TODO codavaj!!
    }

    /**
     * Report whether EOEditingContext objects created by this application instance will strongly retain all EOEnterpriseObject instances registered with them. By default, an EOEditingContext will retain weak references to all EOEnterpriseObjects instances registered with it. It will only keep strong references for EOEnterpriseObjects instances that have been inserted, deleted, or modified, when this change has not yet been saved to the persistent data store. So, EOs that have not been modified may be garbage-collected by the Java VM, if it decides to do so. If this method returns true, then the application will use more memory.
     */
    public static boolean instancesRetainRegisteredObjects(){
        return false; //TODO codavaj!!
    }

    /**
     * Overrides the implementation inherited from EOObjectStore to discard the values of objects cached in memory and refault them, which causes them to be refetched from the external store the next time they're accessed. This method sends the message invalidateObjectsWithGlobalIDs to the parent object store with the globalIDs of all of the objects cached in the receiver. When an EOEditingContext receives this message, it propagates the message down the object store hierarchy. EODatabaseContexts discard their snapshots for invalidated objects and broadcast an ObjectsChangedInStoreNotification. (EODatabaseContext is defined in EOAccess.)
     * The final effect of this method is to refault all objects currently in memory. The next time you access one of these objects, it's refetched from the database. To flush the entire application's cache of all values fetched from an external store, you have to use a statement such as the following:
     * EOEditingContext.rootObjectStore().invalidateAllObjects(); If you just want to discard uncommitted changes but do not want to sacrifice the values cached in memory, the EOEditingContext revert method is to be used, which reverses all changes and clears the undo stack.
     * For more information, see the sections:
     */
    public void invalidateAllObjects(){
        return; //TODO codavaj!!
    }

    /**
     * Overrides the implementation inherited from EOObjectStore to signal to the parent object store that the cached values for the objects identified by globalIDs should no longer be considered valid and that they should be refaulted. Invokes processRecentChanges before refaulting the objects. This message is propagated to any underlying object store, resulting in a refetch the next time the objects are accessed. Any related (child or peer) object stores are notified that the objects are no longer valid. All uncommitted changed to the objects are lost.
     * For more information, see the sections:
     */
    public void invalidateObjectsWithGlobalIDs(com.webobjects.foundation.NSArray gids){
        return; //TODO codavaj!!
    }

    /**
     * This method should not be used.
     */
    public boolean invalidatesObjectsWhenFinalized(){
        return false; //TODO codavaj!!
    }

    /**
     * Executes a remote method on the server. This method has the side-effect of saving the changes in the receiver to the editing context in the server session. You should note that none of the arguments or the result should be enterprise objects. Instead, EOGlobalIDs are used to specify enterprise objects. The argumentTypes argument holds the types of the remote method's (specified by methodName) arguments.
     */
    public java.lang.Object invokeRemoteMethod(com.webobjects.eocontrol.EOEditingContext context, com.webobjects.eocontrol.EOGlobalID gid, java.lang.String methodName, java.lang.Class[] argumentTypes, java.lang.Object[] arguments){
        return null; //TODO codavaj!!
    }

    /**
     * Returns true if the object identified by gid in context is locked, false otherwise. This method works by forwarding the message isObjectLockedWithGlobalID to its parent object store.
     */
    public boolean isObjectLockedWithGlobalID(com.webobjects.eocontrol.EOGlobalID gid, com.webobjects.eocontrol.EOEditingContext context){
        return false; //TODO codavaj!!
    }

    /**
     * Locks access to this EOEditingContext to prevent other threads from accessing it. If it has a shared editing context, this EOEditingContext takes a reader lock on it as well. You should lock an editing context when you are accessing or modifying objects managed by the editing context. The thread safety provided by Enterprise Objects Framework allows you to have one thread to be active in each EOEditingContext and one thread to be active in each EODatabaseContext (EOAccess). In other words, multiple threads can access and modify objects concurrently in different editing contexts, but only one thread can access the database at a time (to save, fetch, or fault).
     */
    public void lock(){
        return; //TODO codavaj!!
    }

    /**
     * Attempts to lock object in the external store. This method works by invoking lockObjectWithGlobalID. Throws an RuntimeException if it cannot find the globalID for object to pass to lockObjectWithGlobalID.
     */
    public void lockObject(com.webobjects.eocontrol.EOEnterpriseObject object){
        return; //TODO codavaj!!
    }

    public void lockObjectStore(){
        return; //TODO codavaj!!
    }

    /**
     * Overrides the implementation inherited from EOObjectStore to attempt to lock the object identified by gid in context in the external store. Throws a RuntimeException if unable to obtain the lock. This method works by forwarding the message lockObjectWithGlobalID to its parent object store.
     */
    public void lockObjectWithGlobalID(com.webobjects.eocontrol.EOGlobalID gid, com.webobjects.eocontrol.EOEditingContext context){
        return; //TODO codavaj!!
    }

    /**
     * Returns true if this EOEditingContext locks object in the external store with lockObject the first time object is modified.
     */
    public boolean locksObjectsBeforeFirstModification(){
        return false; //TODO codavaj!!
    }

    /**
     * Returns the EOEditingContext's message handler. A message handler is a special purpose delegate responsible for presenting errors to the user. Typically, an EODisplayGroup (EOInterface) registers itself as the message handler for its EOEditingContext.
     */
    public java.lang.Object messageHandler(){
        return null; //TODO codavaj!!
    }

    /**
     * Returns the EOEnterpriseObject associated with gid in this EOEditingContext or its shared context, or null if no such object exists.
     */
    public com.webobjects.eocontrol.EOEnterpriseObject objectForGlobalID(com.webobjects.eocontrol.EOGlobalID gid){
        return null; //TODO codavaj!!
    }

    /**
     * Overrides the implementation inherited from EOObjectStore to service a to-many fault for a relationship named name. When a parent EOEditingContext receives a objectsForSourceGlobalID message on behalf of a child editing context and gid matches an object instantiated in the parent, the parent returns a copy of its relationship array and translates its objects into the child editing context. This ensures that a child editing context "inherits" modified values from its parent. If the receiving editing context does not have the specified object or if the parent's relationship property is still a fault, the request is fowarded to its parent object store.
     */
    public com.webobjects.foundation.NSArray objectsForSourceGlobalID(com.webobjects.eocontrol.EOGlobalID gid, java.lang.String name, com.webobjects.eocontrol.EOEditingContext context){
        return null; //TODO codavaj!!
    }

    /**
     * Equivalent to : objectsWithFetchSpecification(fetchSpecification, this);.
     */
    public com.webobjects.foundation.NSArray objectsWithFetchSpecification(com.webobjects.eocontrol.EOFetchSpecification fetchSpecification){
        return null; //TODO codavaj!!
    }

    /**
     * Overrides the implementation inherited from EOObjectStore to fetch objects from an external store according to the criteria specified by fetchSpec and return them in an array. If one of these objects is already present in memory, this method doesn't overwrite its values with the new values from the database. This method throws a RuntimeException if an error occurs; the error message indicates the nature of the problem.
     * When an EOEditingContext receives this message, it forwards the message to its root object store. Typically the root object store is an EOObjectStoreCoordinator with underlying EODatabaseContexts. In this case, the object store coordinator forwards the request to the appropriate database context based on the entity name in fetchSpec. The database context then obtains an EODatabaseChannel and performs the fetch, registering all fetched objects in context or in the receiver if context isn't provided. (You should note that EODatabaseContext and EODatabaseChannel are defined in EOAccess.)
     * For more information refer to: "Fetching Objects"
     */
    public com.webobjects.foundation.NSArray objectsWithFetchSpecification(com.webobjects.eocontrol.EOFetchSpecification fetchSpec, com.webobjects.eocontrol.EOEditingContext context){
        return null; //TODO codavaj!!
    }

    /**
     * This method is automatically invoked when any of the objects registered in this EOEditingContext invokes its willChange method. This method is EOEditingContext's implementation of the EOObserving interface.
     */
    public void objectWillChange(java.lang.Object object){
        return; //TODO codavaj!!
    }

    public com.webobjects.eocontrol.EOObjectStore parentObjectStore(){
        return null; //TODO codavaj!!
    }

    /**
     * Forces this EOEditingContext to process pending insertions, deletions, and updates. Normally, when objects are changed, the processing of the changes is deferred until the end of the current event. At that point, an EOEditingContext moves objects to the inserted, updated, and deleted lists, delete propagation is performed, undos are registered, and ObjectsChangedInStoreNotification and ObjectsChangedInEditingContextNotification are posted. You can use this method to explicitly force changes to be processed. An EOEditingContext automatically invokes this method on itself before performing certain operations such as saveChanges. This method does nothing in Java Client applications.
     */
    public void processRecentChanges(){
        return; //TODO codavaj!!
    }

    /**
     * Returns true if this EOEditingContext propagates deletes at the end of the event in which a change was made, false if it propagates deletes only right before saving changes. The default is true.
     */
    public boolean propagatesDeletesAtEndOfEvent(){
        return false; //TODO codavaj!!
    }

    protected java.lang.Object readResolve() throws java.io.ObjectStreamException{
        return null; //TODO codavaj!!
    }

    /**
     * Makes this EOEditingContext aware of an object identified by gid existing in its parent object store. EOObjectStores (such as the access layer's EODatabaseContext) usually invoke this method for each object fetched. When it receives this message, the EOEditingContext enters the object in its uniquing table and registers itself as an observer of the object.
     */
    public void recordObject(com.webobjects.eocontrol.EOEnterpriseObject object, com.webobjects.eocontrol.EOGlobalID gid){
        return; //TODO codavaj!!
    }

    /**
     * Sends editingContextWillSaveChanges messages to this EOEditingContext's editors, and sends a redo message to its NSUndoManager, asking it to reverse the latest undo operation applied to objects in the object graph.
     */
    public void redo(){
        return; //TODO codavaj!!
    }

    /**
     * Refaults all objects cached in this EOEditingContext that have not been inserted, deleted, or updated. Invokes processRecentChanges, then invokes refaultObject for all objects that haven't been inserted, deleted, or updated.
     */
    public void refaultAllObjects(){
        return; //TODO codavaj!!
    }

    public void refaultObject(com.webobjects.eocontrol.EOEnterpriseObject object){
        return; //TODO codavaj!!
    }

    /**
     * Overrides the implementation inherited from EOObjectStore to refault the enterprise object object identified by gid in ctx. This method should be used with caution since refaulting an object does not remove the object snapshot from the undo stack. Objects that have been newly inserted or deleted should not be refaulted.
     * The main purpose of this method is to break reference cycles between enterprise objects. For example, suppose you have an Employee object that has a to-one relationship to its Department, and the Department object in turn has an array of Employee objects. You can use this method to break the reference cycle. Note that reference cycles are automatically broken if the EOEditingContext is finalized.
     * For more information, see the sections:
     */
    public void refaultObject(com.webobjects.eocontrol.EOEnterpriseObject object, com.webobjects.eocontrol.EOGlobalID gid, com.webobjects.eocontrol.EOEditingContext ctx){
        return; //TODO codavaj!!
    }

    /**
     * Deprecated.
     */
    public void refaultObjects(){
        return; //TODO codavaj!!
    }

    /**
     * Deprecated.
     */
    public void refetch(){
        return; //TODO codavaj!!
    }

    /**
     * This method invokes refreshObject on each registered EOEnterpriseObject in this context.
     */
    public void refreshAllObjects(){
        return; //TODO codavaj!!
    }

    /**
     * This method invokes refaultObject on an EOEnterpriseObject which is not inserted, updated, or deleted. Updated objects have their currently outstanding changes set aside, then are refaulted, and finally have their changes merged. This method ignores pending inserts or deletes. This method does not affect the acceptable level of staleness for the parent object store's cache. Use
     * to fine tune the refetching.
     */
    public void refreshObject(com.webobjects.eocontrol.EOEnterpriseObject eo){
        return; //TODO codavaj!!
    }

    public com.webobjects.foundation.NSArray registeredObjects(){
        return null; //TODO codavaj!!
    }

    /**
     * Unregisters editor from this EOEditingContext.
     */
    public void removeEditor(java.lang.Object editor){
        return; //TODO codavaj!!
    }

    /**
     * Forgets all objects and makes them unusable. Generally revert is preferrable. This method also resets the fetchTimestamp as if the editing context were just initialized.
     * This method should not be invoked on an EOEditingContext which has newly inserted objects.
     */
    public void reset(){
        return; //TODO codavaj!!
    }

    /**
     * Report whether this EOEditingContext will retain strong references to all EOEnterpriseObject instances registered with it.
     */
    public boolean retainsRegisteredObjects(){
        return false; //TODO codavaj!!
    }

    /**
     * Sends editingContextWillSaveChanges messages to the EOEditingContext's editors, and removes everything from the undo stack, discards all insertions and deletions, and restores updated objects to their last committed values. Does not refetch from the database. You should note that revert does not automatically cause higher level display groups (WebObject's WODisplayGroups or the interface layer's EODisplayGroups) to refetch. Display groups that allow insertion and deletion of objects need to be explicitly synchronized whenever this method is invoked on their EOEditingContext.
     */
    public void revert(){
        return; //TODO codavaj!!
    }

    /**
     * Returns the EOObjectStore at the base of the object store hierarchy (usually an EOObjectStoreCoordinator).
     */
    public com.webobjects.eocontrol.EOObjectStore rootObjectStore(){
        return null; //TODO codavaj!!
    }

    /**
     * Sends editingContextWillSaveChanges messages to this EOEditingContext's editors, and commits changes made to its parent EOObjectStore by sending it the message saveChangesInEditingContext If the parent is an EOObjectStoreCoordinator, it guides its EOCooperatingObjectStores, typically EODatabaseContexts, through a multi-pass save operation If a database error occurs, a RuntimeException is thrown. The error message indicates the nature of the problem.
     */
    public void saveChanges(){
        return; //TODO codavaj!!
    }

    /**
     * Deprecated.
     * Invokes the no-argument version, handling an exception using the message handler. For example, if a validation error occurs, the message handler (usually an EODisplayGroup) presents an alert panel with the text of the validation exception.
     */
    public void saveChanges(java.lang.Object sender){
        return; //TODO codavaj!!
    }

    /**
     * Overrides the implementation inherited from EOObjectStore to tell this EOEditingContext's EOObjectStore to accept changes from a child EOEditingContext. This method shouldn't be invoked directly. It's invoked by a nested EOEditingContext when it's committing changes to a parent EOEditingContext. The receiving parent EOEditingContext incorporates all changes from the nested EOEditingContext into its own copies of the objects, but it doesn't immediately save those changes to the database. If the parent itself is later sent saveChanges, it propagates any changes received from the child along with any other changes to its parent EOObjectStore. Throws an exception if an error occurs; the error message indicates the nature of the problem.
     */
    public void saveChangesInEditingContext(com.webobjects.eocontrol.EOEditingContext context){
        return; //TODO codavaj!!
    }

    /**
     * Sets the default timestamp lag for newly instantiated editing contexts to lag. The default lag is 3,600,000 milliseconds (one hour).
     * When a new editing context is initialized, it is assigned a fetch timestamp equal to the current time less the default timestamp lag. Setting the lag to a large number might cause every new editing context to accept very old cached data. Setting the lag to too low a value might degrade performance due to excessive fetching. A negative lag value is treated as 0.
     */
    public static void setDefaultFetchTimestampLag(long lag){
        return; //TODO codavaj!!
    }

    /**
     * Sets the default parent EOObjectStore to store. You can use this method before de-serializing to set the default parent EOObjectStores of the EOEditingContexts in the serialized stream. The object you supply for store can be a different EOObjectStoreCoordinator or another EOEditingContext (if you are using a nested EOEditingContext). After de-serialization, you should restore the default behavior by setting the default parent EOObjectStore to null
     * A default parent object store is global until it is changed again.
     */
    public static void setDefaultParentObjectStore(com.webobjects.eocontrol.EOObjectStore store){
        return; //TODO codavaj!!
    }

    /**
     * Set this EOEditingContext's delegate to be delegate.
     */
    public void setDelegate(java.lang.Object delegate){
        return; //TODO codavaj!!
    }

    /**
     * Sets the receiver's fetch timestamp. When an editing context fetches objects from its parent object store, the parent object store can use the timestamp to determine whether to use cached data or to refetch the most current values. An editing context prefers that fetched values are at least as recent as its fetch timestamp. Note that the parent object store is free to ignore the timestamp; so this value should be considered a hint or request and not a guarantee.
     * Note: Changing the fetch timestamp has no effect on existing objects in the editing context; it can affect only subsequent fetches. To refresh existing objects, invoke refaultAllObjects before you invoke setFetchTimestamp:.
     * The initial value for the fetch timestamp of a new nonnested editing context is the current time less the defaultFetchTimestampLag. A nested editing context always uses its parent's fetch timestamp. setFetchTimestamp raises if it's invoked on a nested editing context.
     */
    public void setFetchTimestamp(long timestamp){
        return; //TODO codavaj!!
    }

    /**
     * Set the retain policy for EOEditingContext objects created by this application instance.
     */
    public static void setInstancesRetainRegisteredObjects(boolean flag){
        return; //TODO codavaj!!
    }

    /**
     * This method should not be used.
     */
    public void setInvalidatesObjectsWhenFinalized(boolean yn){
        return; //TODO codavaj!!
    }

    /**
     * Sets according to yn whether this EOEditingContext locks object in the external store (with lockObject) the first time object is modified. The default is false. If yn is true, an exception will be thrown if a lock cannot be obtained when object invokes willChange. There are two reasons a lock might fail: because the row is already locked in the server, or because the snapshot is out of date. If the snapshot is out of date, you can explicitly refetch the object using an EOFetchSpecification with setRefreshesRefetchedObjects set to true. To handle the exception, you can implement the EODatabaseContext delegate method databaseContextShouldRaiseExceptionForLockFailure.
     * You should avoid using this method or pessimistic locking in an interactive end-user application. For example, a user might make a change in a text field and neglect to save it, thereby leaving the data locked in the server indefinitely. Consider using optimistic locking or application level explicit check in/check out instead.
     */
    public void setLocksObjectsBeforeFirstModification(boolean yn){
        return; //TODO codavaj!!
    }

    /**
     * Set this EOEditingContext's message handler to be handler.
     */
    public void setMessageHandler(java.lang.Object handler){
        return; //TODO codavaj!!
    }

    /**
     * Sets according to propagatesDeletesAtEndOfEvent whether this EOEditingContext propagates deletes at the end of the event in which a change was made, or only just before saving changes.
     * If propagatesDeletesAtEndOfEvent is true, deleting an enterprise object triggers delete propagation at the end of the event in which the deletion occurred (this is the default behavior). If propagatesDeletesAtEndOfEvent is false, delete propagation isn't performed until saveChanges is invoked.
     * You can delete enterprise objects explicitly by using the deleteObject method or implicitly by removing the enterprise object from an owning relationship. Delete propagation uses the delete rules in the EOClassDescription to determine whether objects related to the deleted object should also be deleted. If delete propagation fails (that is, if an enterprise object refuses to be deleted possibly due to a deny rule), all changes made during the event are rolled back.
     */
    public void setPropagatesDeletesAtEndOfEvent(boolean propagatesDeletesAtEndOfEvent){
        return; //TODO codavaj!!
    }

    /**
     * Set the retain policy for this EOEditingContext. If there are objects registered with this EOEditingContext, calling this method will result in an IllegalStateException.
     */
    public void setRetainsRegisteredObjects(boolean flag){
        return; //TODO codavaj!!
    }

    /**
     * Sets this EOEditingContext shared editing context. Raises if this EOEditingContext and sharedEC both contain the same object (otherwise object uniquing would be violated) or if sharedEC is not an instance of the EOSharedEditingContext class.
     * By default, an editing context that has no shared editing context listens for DefaultSharedEditingContextWasInitializedNotifications. If a notification is posted while the context has no registered objects, the editing context sets its shared editing context to the newly initialized default shared editing context.
     * Invoke this method with null to remove this EOEditingContext as an observer of this notification and to prevent the context from accessing any objects in the default shared editing context.
     */
    public void setSharedEditingContext(com.webobjects.eocontrol.EOSharedEditingContext sharedEC){
        return; //TODO codavaj!!
    }

    /**
     * Sets according to yn whether this EOEditingContext stops validating after the first error is encountered, or continues for all objects (validation typically occurs during a save operation). The default is true. Setting it to false is useful if the delegate implements editingContextShouldPresentException to handle the presentation of aggregate exceptions.
     */
    public void setStopsValidationAfterFirstError(boolean yn){
        return; //TODO codavaj!!
    }

    /**
     * Assigns ec as the global replacement EOEditingContext to substitute for one in the process of being de-serialized. Using this method causes all of the serialized references to the serialized EOEditingContext to be redirected to ec. This can be extremely useful when you want to de-serialize the contents of an EOEditingContext into an existing one, instead of a transitory EC within the serialized stream.
     * After de-serializing with a substitution EOEditingContext, you should restore the default behavior by setting the substitution EOEditingContext to null.
     * A substitution editing context is global until it is changed again. The Enterprise Objects Frameworks do not ensure thread safe access to the substitution EC. If you expect several threads to deserialize EOEditingContexts concurrently, you should provide your own lock object to manage it.
     * For more information, see: "Using EOEditingContext to Archive Custom Objects in WebObjects Framework"
     */
    public static void setSubstitutionEditingContext(com.webobjects.eocontrol.EOEditingContext ec){
        return; //TODO codavaj!!
    }

    /**
     * Sets the receiver's NSUndoManager to undoManager.
     * EOEditingContext includes the undo, redo, and revert methods for managing changes to objects in the object graph. undo asks the EOEditingContext's NSUndoManager to reverse the latest changes to objects in the object graph. redo asks the NSUndoManager to reverse the latest undo operation. revert clears the undo stack, discards all insertions and deletions, and restores updated objects to their last committed (saved) values.
     * EOEditingContext's undo support is arbitrarily deep; you can undo an object repeatedly until you restore it to the state it was in when it was first created or fetched into its editing context. Even after saving, you can undo a change. To support this feature, the NSUndoManager can keep a lot of data in memory.
     * For example, whenever an object is removed from a relationship, the corresponding editing context creates a snapshot of the modified, source object. The snapshot, which has a reference to the removed object, is referenced by the editing context and by the undo manager. The editing context releases the reference to the snapshot when the change is saved, but the undo manager doesn't. It continues holding the snapshot, so it can undo the deletion if requested.
     * If the typical usage patterns for your application generate a lot of change processing, you might want to limit the undo feature to keep its memory usage in check. For example, you could clear an undo manager whenever its editing context saves. To do so, simply send the undo manager a removeAllActions message (or a removeAllActionsWithTarget message with the editing context as the argument).
     */
    public void setUndoManager(com.webobjects.foundation.NSUndoManager undoManager){
        return; //TODO codavaj!!
    }

    /**
     * Sets according to flag whether Serialization or use context relative encoding.
     * For more information, see: "Using EOEditingContext to Archive Custom Objects in WebObjects Framework"
     */
    public static void setUsesContextRelativeEncoding(boolean flag){
        return; //TODO codavaj!!
    }

    public com.webobjects.eocontrol.EOSharedEditingContext sharedEditingContext(){
        return null; //TODO codavaj!!
    }

    public boolean stopsValidationAfterFirstError(){
        return false; //TODO codavaj!!
    }

    /**
     * Returns the global substitution EOEditingContext if you have been specified. Otherwise returns null.
     * For more information, see: "Using EOEditingContext to Archive Custom Objects in WebObjects Framework"
     */
    public static com.webobjects.eocontrol.EOEditingContext substitutionEditingContext(){
        return null; //TODO codavaj!!
    }

    public boolean tryLock(){
        return false; //TODO codavaj!!
    }

    /**
     * Deprecated.
     */
    public java.lang.Throwable tryToSaveChanges(){
        return null; //TODO codavaj!!
    }

    /**
     * Sends editingContextWillSaveChanges messages to this EOEditingContext's editors, and sends an undo message to its NSUndoManager, asking it to reverse the latest uncommitted changes applied to objects in the object graph.
     * EOEditingContext includes the undo, redo, and revert methods for managing changes to objects in the object graph. undo asks the EOEditingContext's NSUndoManager to reverse the latest changes to objects in the object graph. redo asks the NSUndoManager to reverse the latest undo operation. revert clears the undo stack, discards all insertions and deletions, and restores updated objects to their last committed (saved) values.
     * EOEditingContext's undo support is arbitrarily deep; you can undo an object repeatedly until you restore it to the state it was in when it was first created or fetched into its editing context. Even after saving, you can undo a change. To support this feature, the NSUndoManager can keep a lot of data in memory.
     * For example, whenever an object is removed from a relationship, the corresponding editing context creates a snapshot of the modified, source object. The snapshot, which has a reference to the removed object, is referenced by the editing context and by the undo manager. The editing context releases the reference to the snapshot when the change is saved, but the undo manager doesn't. It continues holding the snapshot, so it can undo the deletion if requested.
     * If the typical usage patterns for your application generate a lot of change processing, you might want to limit the undo feature to keep its memory usage in check. For example, you could clear an undo manager whenever its editing context saves. To do so, simply send the undo manager a removeAllActions message (or a removeAllActionsWithTarget message with the editing context as the argument). If your application doesn't need undo at all, you can avoid any undo overhead by setting the editing context's undo manager to null with setUndoManager.
     */
    public void undo(){
        return; //TODO codavaj!!
    }

    public com.webobjects.foundation.NSUndoManager undoManager(){
        return null; //TODO codavaj!!
    }

    /**
     * Unlocks access to this EOEditingContext so that other threads may access it. If it has a shared editing context, this EOEditingContext unlocks a reader lock on the shared context as well.
     */
    public void unlock(){
        return; //TODO codavaj!!
    }

    public void unlockObjectStore(){
        return; //TODO codavaj!!
    }

    /**
     * Returns an array of objects in this EOEditingContext's object graph that have been updated.
     */
    public com.webobjects.foundation.NSArray updatedObjects(){
        return null; //TODO codavaj!!
    }

    /**
     * Returns true to indicate whether Serialization and use context relative encoding, false otherwise.
     * For more information, see: "Using EOEditingContext to Archive Custom Objects in WebObjects Framework"
     */
    public static boolean usesContextRelativeEncoding(){
        return false; //TODO codavaj!!
    }

    /**
     * The EOEditingContext.Delegate interface defines methods that an EOEditingContext can invoke in its delegate. Delegates are not required to provide implementations for all of the methods in the interface, and you do not have to use the implements keyword to specify that the object implements the Delegate interface. Instead, declare and implement any subset of the methods declared in the interface that you need, and use the EOEditingContext method setDelegate method to assign the object as the delegate. An editing context can determine if the delegate doesn't implement a delegate method and only attempts to invoke the methods the delegate actually implements.
     */
    public static interface Delegate{
        /**
         * Invoked once after a batch of objects has been updated in anEditingContext's parent object store (in response to an ObjectsChangedInStoreNotification). A delegate might implement this method to define custom merging behavior, most likely in conjunction with EOEditingContext.editingContextShouldMergeChangesForObject. It is safe for this method to make changes to the objects in the editing context.
         */
        abstract void editingContextDidMergeChanges(com.webobjects.eocontrol.EOEditingContext context);

        /**
         * Invoked from objectsWithFetchSpecification, if the delegate has appropriate results cached it can return them and the fetch will be bypassed. Returning null causes the fetch to be propagated to the parent object store.
         */
        abstract com.webobjects.foundation.NSArray editingContextShouldFetchObjects(com.webobjects.eocontrol.EOEditingContext context, com.webobjects.eocontrol.EOFetchSpecification fetchSpec);

        /**
         * Sent when an object identified by globalID has been explicitly invalidated. If the delegate returns false, the invalidation is refused. This allows the delegate to selectively override object invalidations.
         */
        abstract boolean editingContextShouldInvalidateObject(com.webobjects.eocontrol.EOEditingContext context, com.webobjects.eocontrol.EOEnterpriseObject object, com.webobjects.eocontrol.EOGlobalID globalID);

        /**
         * When an ObjectsChangedInStoreNotification is received, anEditingContext invokes this method in its delegate once for each of the objects that has both uncommitted changes and an update from the EOObjectStore. This method is invoked before any updates actually occur.
         * If this method returns true, all of the uncommitted changes should be merged into the object after the update is applied, in effect preserving the uncommitted changes (the default behavior). The delegate method editingContextShouldInvalidateObject will not be sent for the object in question.
         * If this method returns false, no uncommitted changes are applied. Thus, the object is updated to reflect the values from the database exactly. This method should not make any changes to the object since it is about to be invalidated.
         * If you want to provide custom merging behavior, you need to implement both this method and editingContextDidMergeChanges. You use editingContextShouldMergeChangesForObject to save information about each changed object and return true to allow merging to continue. After the default merging behavior occurs, editingContextDidMergeChanges is invoked, at which point you implement the custom behavior.
         */
        abstract boolean editingContextShouldMergeChangesForObject(com.webobjects.eocontrol.EOEditingContext context, com.webobjects.eocontrol.EOEnterpriseObject object);

        /**
         * Sent whenever an exception is caught by an EOEditingContext. If the delegate returns false, exception is ignored. Otherwise (if the delegate returns true, if the editing context doesn't have a delegate, or if the delegate doesn't implement this method) exception is passed to the message handler for further processing.
         */
        abstract boolean editingContextShouldPresentException(com.webobjects.eocontrol.EOEditingContext context, java.lang.Throwable exception);

        /**
         * Sent when a validation error occurs while processing a processRecentChanges message. If the delegate returns false, it disables the automatic undoing of user actions after validation has resulted in an error.
         * By default, if a user attempts to perform an action that results in a validation failure (such as deleting a department object that has a delete rule stating that the department can't be deleted if it contains employees), the user's action is immediately rolled back. However, if this delegate method returns false, the user action is allowed to stand (though attempting to save the changes to the database without solving the validation error will still result in a failure). Returning false gives the user an opportunity to correct the validation problem so that the operation can proceed (for example, the user might delete all of the department's employees so that the department itself can be deleted).
         */
        abstract boolean editingContextShouldUndoUserActionsAfterFailure(com.webobjects.eocontrol.EOEditingContext context);

        /**
         * Sent when an EOEditingContext receives a saveChanges message. If the delegate returns false, changes are saved without first performing validation. This method can be useful if the delegate wants to provide its own validation mechanism.
         */
        abstract boolean editingContextShouldValidateChanges(com.webobjects.eocontrol.EOEditingContext context);

        /**
         * Sent when an EOEditingContext receives a saveChanges message. The delegate can throw an exception to abort the save operation.
         */
        abstract void editingContextWillSaveChanges(com.webobjects.eocontrol.EOEditingContext context);

    }
    /**
     * An interface for objects that act as higher-level editors of the objects an EOEditingContext contains. An editing context sends messages to its editors to determine whether they have any changes that need to be saved, and to allow them to flush pending changes before a save (possibly throwing an exception to abort the save). See the EOEditingContext and EODisplayGroup (EOInterface) class specifications for more information.
     * Editors are not required to provide implementations for all of the methods in the interface. When you write an editor, you don't have to use the implements keyword to specify that the object implements the Editors interface. Instead, simply use the EOEditingContext method addEditor method to assign your object as one of the EOEditingContext's editors and then declare and implement any subset of the methods declared in the Editors interface. An EOEditingContext can determine if the editor doesn't implement a method and only attempts to invoke the methods the editor actually implements.
     */
    public static interface Editor{
        /**
         * Invoked by context in its saveChanges method, this method allows the editor to flush any pending edits and, if necessary, prohibit a save operation. The editor should validate and flush any unprocessed edits it has, throwing an exception if it cannot.
         */
        abstract void editingContextWillSaveChanges(com.webobjects.eocontrol.EOEditingContext context);

        /**
         * Invoked by context, this method should return true if the editor has any unapplied edits that need to be saved and false if it does not.
         */
        abstract boolean editorHasChangesForEditingContext(com.webobjects.eocontrol.EOEditingContext context);

    }
    /**
     * This interface is used for error reporting and determining fetch limits. See the EOEditingContext, EODatabaseContext (EOAccess), and EODisplayGroup (EOInterface) class specifications for more information.
     * Message handlers are primarily used to implement exception handling in the interface layer's EODisplayGroup, and would not ordinarily be used in a command line tool or WebObjects application.
     * Message handlers are not required to provide implementations for all of the methods in the interface. When you write a handler, you don't have to use the implements keyword to specify that the object implements the EOEditingContext.MessageHandler interface. Instead, simply use the EOEditingContext method setMessageHandler method to assign your object as the EOEditingContext's handler and then declare and implement any subset of the methods declared in the EOEditingContext.MessageHandler interface. An EOEditingContext can determine if the handler does not implement a method and only attempts to invoke the methods the handler actually implements.
     */
    public static interface MessageHandler{
        /**
         * Invoked by context, this method should present message to the user in whatever way is appropriate (whether by opening an attention panel or printing the message in a terminal window, for example). This message is sent only if the method is implemented.
         */
        abstract void editingContextPresentErrorMessage(com.webobjects.eocontrol.EOEditingContext context, java.lang.String message);

        /**
         * Invoked by objectStore (such as an EOAccess layer EODatabaseContext) to allow the message handler for context (often an interface layer EODisplayGroup) to prompt the user about whether or not to continue fetching the current result set. The count argument is the number of objects fetched so far. limit is the original limit specified an EOFetchSpecification. This message is sent only if the method is implemented.
         */
        abstract boolean editingContextShouldContinueFetching(com.webobjects.eocontrol.EOEditingContext context, int count, int originalLimit, com.webobjects.eocontrol.EOObjectStore objectStore);

    }
    /**
     * A subclass provided to track events triggered by EOEditingContexts.
     * See Also:EOEvent, EOEventCenter, Serialized Form
     */
    public static class EditingContextEvent extends com.webobjects.eocontrol.EOEvent{
        /**
         * A constant for ObjectsWithFetchSpecification events.
         * See Also:Constant Field Values
         */
        protected static final java.lang.String ObjectsWithFetchSpecification="objectsWithFetchSpecification";

        /**
         * A constant for SaveChangesInEditingContext events.
         * See Also:Constant Field Values
         */
        protected static final java.lang.String SaveChangesInEditingContext="saveChangesInEditingContext";

        public EditingContextEvent(){
             //TODO codavaj!!
        }

        public EditingContextEvent(java.lang.String type){
             //TODO codavaj!!
        }

    }
}

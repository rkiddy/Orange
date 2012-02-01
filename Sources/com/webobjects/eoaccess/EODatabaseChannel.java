package com.webobjects.eoaccess;
/**
 * An EODatabaseChannel represents an independent communication channel to the database server. It is associated with an EODatabaseContext and an EODatabase. These three classes form the database level of Enterprise Objects Framework's access layer.
 * An EODatabaseChannel has an EOAdaptorChannel that it uses to connect to the database server represented by its EODatabase object. An EODatabaseChannel fetches database records as instances of Enterprise Object classes that are specified in its EODatabase's EOModel objects.
 * An EODatabaseChannel also has an EODatabaseContext, which uses the channel to perform fetches and to lock rows in the database.
 * All of the database level objects are used automatically by EOEditingContexts and other components of Enterprise Objects Framework. You rarely need to interact with them directly. In particular, you wouldn't ordinarily use an EODatabaseChannel directly. Rather, you'd use an EOEditingContext to select and fetch Enterprise Objects.
 * See Also:EOAdaptorChannel, EODatabase, EODatabaseContext
 */
public class EODatabaseChannel{
    /**
     * Constructs a new EODatabaseChannel with databaseContext as its parent. Throws an exception if no more adaptor channels can be associated with databaseContext.
     * Typically, you don't need to programmatically create EODatabaseChannel objects. They are created automatically by the control layer. If you do programmatically create an EODatabaseChannel object, note that the new channel is not automatically registered in the channel pool for its parent database context. Call the EODatabaseContext method registerChannel to add it.
     * Parameters:databaseContext - The EODatabaseContext in which the channel works. Throws: IllegalStateException - if the underlying adaptor context can't create a corresponding adaptor channel.See Also:EOAdaptorChannel, EODatabase, EODatabaseContext, EODatabaseChannel.databaseContext(), EODatabaseChannel.adaptorChannel()
     */
    public EODatabaseChannel(com.webobjects.eoaccess.EODatabaseContext databaseContext){
         //TODO codavaj!!
    }

    /**
     * Returns the EOAdaptorChannel used by the receiver for communication with the database server.
     */
    public com.webobjects.eoaccess.EOAdaptorChannel adaptorChannel(){
        return null; //TODO codavaj!!
    }

    /**
     * Cancels any fetch currently in progress.
     */
    public void cancelFetch(){
        return; //TODO codavaj!!
    }

    /**
     * Returns the EODatabaseContext that controls transactions for the receiver.
     */
    public com.webobjects.eoaccess.EODatabaseContext databaseContext(){
        return null; //TODO codavaj!!
    }

    /**
     * Fetches and returns the next object in the result set produced by a selectObjectsWithFetchSpecification message, or null if there are no more objects in the current result set or if an error occurs.
     * This method uses the receiver's EOAdaptorChannel to fetch a row, records a snapshot with the EODatabaseContext if necessary, and creates an Enterprise Object from the row if a corresponding object doesn't already exist. The new object is sent an awakeFromFetch message to allow it to finish setting up its state.
     * If no snapshot exists for the fetched object, the receiver sends its EODatabase a recordSnapshotForGlobalID message to record one. If a snapshot already exists (because the object was previously fetched), the receiver checks whether it should overwrite the old snapshot with the new one by asking the delegate with a databaseContextShouldUpdateCurrentSnapshot message. If the delegate doesn't respond to this method, the EODatabaseChannel overwrites the snapshot if it is locking or refreshing fetched objects.
     * Further, if the EODatabaseChannel is refreshing fetched objects, it posts an ObjectsChangedInStoreNotification on behalf of its EODatabaseContext, which causes any EOEditingContext using that EODatabaseContext to update its Enterprise Object with the values recorded in the new snapshot.
     * Ordinarily, you don't directly use an EODatabaseChannel to fetch objects. Rather, you use an EOEditingContext, which uses an underlying EODatabaseChannel to do its work.
     */
    public java.lang.Object fetchObject(){
        return null; //TODO codavaj!!
    }

    /**
     * Returns true if the receiver is fetching, false otherwise. An EODatabaseChannel is fetching if it has been sent a successful selectObjectsWithFetchSpecification message. An EODatabaseChannel stops fetching when there are no more objects to fetch or when it is sent a cancelFetch message.
     */
    public boolean isFetchInProgress(){
        return false; //TODO codavaj!!
    }

    /**
     * Returns true if the receiver is locking the database rows for the selected objects, as determined by its EODatabaseContext's update strategy or the EOFetchSpecification used to perform the select. Returns false otherwise. This method always returns false when no fetch is in progress.
     * Useful when fetching objects that result from a direct call to the EOAdaptorChannels evaluateExpression method, or when fetching multiple result sets. Note that the isLocking state is reset to false after each result set, so when multiple result sets are being fetched with locks it must be explicitly reset to true using setIsLocking before each result set is retrieved.
     */
    public boolean isLocking(){
        return false; //TODO codavaj!!
    }

    /**
     * Returns true if the receiver overwrites existing snapshots with fetched values and causes the current EOEditingContext to overwrite existing Enterprise Objects with those values as well. Returns false otherwise. This behavior is controlled by the EOFetchSpecification used in a call to selectObjectsWithFetchSpecification].
     */
    public boolean isRefreshingObjects(){
        return false; //TODO codavaj!!
    }

    /**
     * Selects objects described by fetchSpecification to be fetched into context. The selected objects compose one or more result sets, each object of which will be returned by subsequent fetchObject messages in the order prescribed by fetchSpecification's EOSortOrderings.
     * Throws an exception if an error occurs. The particular exception depends on the specific error, and is indicated in the exception's description. Some possible reasons for failure are:
     * fetchSpecification is invalid. The receiver's EODatabaseContext has no transaction in progress. The delegate disallows the select operation. The receiver's EOAdaptorChannel fails to perform the select operation.
     * This method invokes the delegate methods databaseContextShouldSelectObjects, databaseContextShouldUsePessimisticLock, and databaseContextDidSelectObjects.
     * You wouldn't ordinarily invoke this method directly; rather, you should use an EOEditingContext to select and fetch Enterprise Objects.
     */
    public void selectObjectsWithFetchSpecification(com.webobjects.eocontrol.EOFetchSpecification fetchSpecification, com.webobjects.eocontrol.EOEditingContext context){
        return; //TODO codavaj!!
    }

    /**
     * Sets the EOEditingContext into which objects are fetched to context.
     * This method is automatically invoked by selectObjectsWithFetchSpecification. You should never invoke it directly.
     */
    public void setCurrentEditingContext(com.webobjects.eocontrol.EOEditingContext context){
        return; //TODO codavaj!!
    }

    /**
     * Sets the EOEntity used when fetching Enterprise Objects to entity. The fetchObject method uses entity to determine the class of object to fetch.
     * This method is invoked automatically by selectObjectsWithFetchSpecification. You should never need to invoke it directly.
     */
    public void setCurrentEntity(com.webobjects.eoaccess.EOEntity entity){
        return; //TODO codavaj!!
    }

    /**
     * Sets whether the receiver locks the database records it selects. A EODatabaseChannel modifies its interaction with the database server and its snapshotting behavior based on this setting. If isLocking is true, the EODatabaseChannel modifies its fetching behavior to lock objects. If isLocking is false it simply fetches them.
     * An EODatabaseChannel automatically sets this flag according to the fetch specification used in a call to selectObjectsWithFetchSpecification.. You might invoke this method directly if evaluating SQL directly with EOAdaptorChannel's evaluateExpression method.
     */
    public void setIsLocking(boolean isLocking){
        return; //TODO codavaj!!
    }

    /**
     * Sets whether the receiver causes existing snapshots and enterprise objects to be overwritten with fetched values. If isRefreshingObjects is true, the receiver overwrites existing snapshots with fetched values and posts an ObjectsChangedInStoreNotification on behalf of its EODatabaseContext (which typically causes the an existing object's EOEditingContext to replace its values with the new ones). If isRefreshingObjects is false, the receiver relies on the delegate to determine whether snapshots should be overwritten, and doesn't cause Enterprise Objects to be overwritten.
     * An EODatabaseChannel automatically sets this flag according to the fetch specification used in a selectObjectsWithFetchSpecification message. You might invoke this method directly if evaluating SQL directly with EOAdaptorChannel's evaluateExpression method.
     */
    public void setIsRefreshingObjects(boolean isRefreshingObjects){
        return; //TODO codavaj!!
    }

}

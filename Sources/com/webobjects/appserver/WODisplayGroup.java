package com.webobjects.appserver;
/**
 * A WODisplayGroup is the basic user interface manager for a WebObjects application that accesses a database. It collects objects from an EODataSource, filters and sorts them, and maintains a selection in the filtered subset. WebObjects dynamic elements are bound to WODisplayGroup attributes and methods to display information from the database on the web page.
 * A WODisplayGroup manipulates its EODataSource by invoking fetchObjects, insertObject and other methods, and registers itself as an editor and message handler of the EODataSource's EOEditingContext. The EOEditingContext then monitors the WODisplayGroup for changes to objects.
 * WODisplayGroup interacts mostly with its EODataSource and its EOEditingContext.
 * The WODisplayGroup delegate offers a number of methods, and WODisplayGroup invokes them as appropriate. Besides displayGroupDisplayArrayForObjects, there are methods that inform the delegate that the WODisplayGroup has fetched, created -- or failed to create -- an object, inserted or deleted an object, changed the selection, or set a value for a property. There are also methods that request permission from the delegate to perform most of these same actions. The delegate can return true to permit the action or false to deny it.
 * See Also:EODataSource, EOEditingContext, WODisplayGroup.Delegate, WODisplayGroup.Delegate.displayGroupDisplayArrayForObjects(com.webobjects.appserver.WODisplayGroup, com.webobjects.foundation.NSArray), Serialized Form
 */
public class WODisplayGroup implements com.webobjects.foundation.NSKeyValueCoding, com.webobjects.foundation.NSKeyValueCoding.ErrorHandling, com.webobjects.foundation.NSDisposable, com.webobjects.eocontrol.EOKeyValueArchiving, com.webobjects.eocontrol.EOKeyValueArchiving.Awaking, java.io.Serializable{
    /**
     * The name for the notification posted during any invocation of WODisplayGroup's fetch method.
     * See Also:WODisplayGroup.fetch(), NSNotification, Constant Field Values
     */
    public static final java.lang.String DisplayGroupWillFetchNotification="WODisplayGroupWillFetch";

    /**
     * Creates and returns a new WODisplayGroup. The WODisplayGroup needs to have an EODataSource. If you invoke this method explicitly, you must invoke setDataSource.
     * See Also:WODisplayGroup.setDataSource(com.webobjects.eocontrol.EODataSource)
     */
    public WODisplayGroup(){
         //TODO codavaj!!
    }

    /**
     * Provides all of the objects collected by the WODisplayGroup. This collection differs from that provided by displayedObjects. Typically this collection will comprise the results of the last fetch from the WODisplayGroup's dataSource.
     * However, this collection may be modified via several methods: deleteObjectAtIndex insertObjectAtIndex objectsChangedInEditingContext setInQueryMode setObjectArray updateDisplayedObjects
     */
    public com.webobjects.foundation.NSArray allObjects(){
        return null; //TODO codavaj!!
    }

    /**
     * Provides all of the EOQualifier operators plus those that work exclusively on Strings (such as like and contains).
     */
    public com.webobjects.foundation.NSArray allQualifierOperators(){
        return null; //TODO codavaj!!
    }

    /**
     * Description copied from interface:
     * Notifies the receiver that the EOKeyValueUnarchiver unarchiver has unarchived all objects from an archive. Objects receive this method at the end of an unarchiving process of an EOKeyValueUnarchiver, when all objects have been unarchived, but before they are asked to finish initialization through the EOKeyValueArchiving.FinishInitialization interface method finishInitializationWithKeyValueUnarchiver.
     */
    public void awakeFromKeyValueUnarchiver(com.webobjects.eocontrol.EOKeyValueUnarchiver unarchiver){
        return; //TODO codavaj!!
    }

    /**
     * Provides the number of batches to display. For example, if displayedObjects().count() == 200 and numberOfObjectsPerBatch() == 10, batchCount() == 20 (twenty batches of ten objects each).
     */
    public int batchCount(){
        return 0; //TODO codavaj!!
    }

    /**
     * Clears the selection of any objects from allObjects.
     * Invokes setSelectionIndexes (passing NSArray.EmptyArray) to do so.
     */
    public boolean clearSelection(){
        return false; //TODO codavaj!!
    }

    /**
     * Provides the index of the batch currently being displayed. The batchCount equals the number of displayedObjects divided by the numberOfObjectsPerBatch. For example, if the WODisplayGroup has one hundred objects to display and the numberOfObjectsPerBatch is twenty, there are five batches. The first batch has a batch index of 1.
     */
    public int currentBatchIndex(){
        return 0; //TODO codavaj!!
    }

    /**
     * Provides the last EODataSource given to the WODisplayGroup via setDataSource. The WODisplayGroup will use this EODataSource to fetch and commit objects.
     * The EODataSource may represent a detail in a master-detail relationship.
     */
    public com.webobjects.eocontrol.EODataSource dataSource(){
        return null; //TODO codavaj!!
    }

    /**
     * Intentionally Undocumented
     */
    public static java.lang.Object decodeWithKeyValueUnarchiver(com.webobjects.eocontrol.EOKeyValueUnarchiver unarchiver){
        return null; //TODO codavaj!!
    }

    /**
     * If a key in the queryMatch dictionary does not have an associated value in the queryOperator dictionary, then its value is matched using operator pattern matching, and the format string returned by this method specifies how it will be matched.
     */
    public java.lang.String defaultStringMatchFormat(){
        return null; //TODO codavaj!!
    }

    /**
     * Provides a default operator for matching strings against string values in the queryMatch dictionary for the objects in the WODisplayGroup. If a key in the queryMatch dictionary does not have an associated operator in the queryOperator dictionary, then the operator is used. Unless this behavior is changed using setDefaultStringMatchOperator, this method returns caseInsensitiveLike.
     */
    public java.lang.String defaultStringMatchOperator(){
        return null; //TODO codavaj!!
    }

    /**
     * Provides the last delegate object given to the WODisplayGroup via setDelegate.
     * The delegate object may not implement WODisplayGroup.Delegate, because such implementation would require that all delegate methods be implemented. Those methods that might communicate with the delegate will take the appropriate steps to ensure that the delegate implements any method in question before attempting to invoke it.
     */
    public java.lang.Object delegate(){
        return null; //TODO codavaj!!
    }

    /**
     * Invokes deleteSelection and displayBatchContainingSelectedObject. This method is a convenience to be invoked directly from a WOElement's (such as a WOComponent's) action.
     */
    public java.lang.Object delete(){
        return null; //TODO codavaj!!
    }

    /**
     * Deletes the object at anIndex in allObjects.
     * Deletion may be prevented by WODisplayGroup.Delegate.displayGroupShouldDeleteObject.
     * If the deletion is not prevented and succeeds, this method also invokes: selectObjectsIdenticalToSelectFirstOnNoMatch willChange WODisplayGroup.Delegate.displayGroupDidDeleteObject
     */
    public boolean deleteObjectAtIndex(int anIndex){
        return false; //TODO codavaj!!
    }

    /**
     * Deletes the selectedObjects from the WODisplayGroup's dataSource.
     * Deletion may be prevented by WODisplayGroup.Delegate.displayGroupShouldDeleteObject.
     * If the deletion is not prevented and succeeds, this method also invokes: selectObjectsIdenticalToSelectFirstOnNoMatch willChange WODisplayGroup.Delegate.displayGroupDidDeleteObject
     */
    public boolean deleteSelection(){
        return false; //TODO codavaj!!
    }

    /**
     * For detail display groups, returns the key to the master object that specifies what this detail display group represents. That is, if you invoke valueForKey on the object returned by the masterObject method with this key, the objects controlled by this display group are obtained.
     * This method returns null if the WODisplayGroup is not a detail display group or if the detail key has not yet been set. A detail display group is typically created by dragging a to-many relationship from EOModeler to an open component in WebObjects Builder.
     */
    public java.lang.String detailKey(){
        return null; //TODO codavaj!!
    }

    /**
     * Displays the batch containing the selection and sets the currentBatchIndex to that batch's index.
     */
    public java.lang.Object displayBatchContainingSelectedObject(){
        return null; //TODO codavaj!!
    }

    /**
     * Provides the objects to be displayed or otherwise made available to the client (web browser). Typically this collection represents a filtered version of allObjects.
     * If the WODisplayGroup has a delegate that responds to displayGroupDisplayArrayForObjects, the WODisplayGroup uses this method to filter allObjects. Otherwise, the WODisplayGroup filters via a combination of its qualifier and its sortOrderings.
     * displayedObjects changes each time allObjects changes, as well whenever updateDisplayedObjects is invoked. If display batching is enabled (numberOfObjectsPerBatch() > 0), displayedObjects provides the current batch of objects. Consequently, displayedObjects may be also changed whenever any of the following methods are invoked: setNumberOfObjectsPerBatch displayNextBatch displayPreviousBatch displayBatchContainingSelectedObject
     */
    public com.webobjects.foundation.NSArray displayedObjects(){
        return null; //TODO codavaj!!
    }

    /**
     * Increments the current batch index, displays that batch of objects, and clears the selection. If the batch currently being displayed is the last batch, this method displays the first batch of objects.
     */
    public java.lang.Object displayNextBatch(){
        return null; //TODO codavaj!!
    }

    /**
     * Decrements the current batch index, displays that batch of objects, and clears the selection. If the batch currently being displayed is the first batch, this method displays the last batch of objects.
     */
    public java.lang.Object displayPreviousBatch(){
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
     * Deprecated.
     * Invoked by the supplied EOEditingContext as part of the EOEditingContext.MessageHandler interface, this method uses NSLog to display the supplied String.
     */
    public void editingContextPresentErrorMessage(com.webobjects.eocontrol.EOEditingContext editingContext, java.lang.String message){
        return; //TODO codavaj!!
    }

    public void encodeWithCoder(com.webobjects.foundation.NSCoder coder){
        return; //TODO codavaj!!
    }

    /**
     * Description copied from interface:
     * Asks the receiver to archive its state into the EOKeyValueArchiver archiver.
     */
    public void encodeWithKeyValueArchiver(com.webobjects.eocontrol.EOKeyValueArchiver archiver){
        return; //TODO codavaj!!
    }

    /**
     * Deprecated.
     * Indicates whether any further editing should take place.
     */
    public boolean endEditing(){
        return false; //TODO codavaj!!
    }

    /**
     * Invokes the fetchObjects method of the dataSource and passes the result to setObjectArray.
     * Fetching may be prevented by WODisplayGroup.Delegate.displayGroupShouldFetch. If not prevented, this method also: Posts a WODisplayGroup.DisplayGroupWillFetchNotification just before invoking fetchObjects Resets all of the changes memorized by the undoManager (using its removeAllActionsWithTarget method) Invokes the delegate method WODisplayGroup.Delegate.displayGroupDidFetchObjects
     * Invoked by: awakeFromKeyValueUnarchiver (if fetchesOnLoad returns true) objectsInvalidatedInEditingContext qualifyDataSource setMasterObject (if fetchesOnLoad returns true)
     */
    public java.lang.Object fetch(){
        return null; //TODO codavaj!!
    }

    /**
     * Indicates whether the WODisplayGroup, whenever it is loaded, should fetch from its dataSource. A fetch on load typically occurs each time the WOComponent containing the WODisplayGroup is loaded by the client (web browser).
     * This method is invoked by: awakeFromKeyValueUnarchiver setMasterObject the default WODisplayGroup constructor Unless explicitly changed via setFetchesOnLoad, returns false.
     */
    public boolean fetchesOnLoad(){
        return false; //TODO codavaj!!
    }

    /**
     * Invoked from the WODisplayGroup constructor to finish initializing a newly created instance. This includes: Setting the new instances's EOEditingContext to its dataSource's editing context (if available) Registering the new display group for NSNotifications named EOEditingContext.ObjectsChangedInEditingContextNotification and EOObjectStore.InvalidatedAllObjectsInStoreNotification Establishing the new instance as an editor for the its editing context Establishing the new instance as its editing context's message handler (unless the editing context already has a message handler)
     * None of your other methods should ever invoke finishInitialization. If you override finishInitialization in a subclass, ensure that you invoke super.finishInitialization().
     */
    protected void finishInitialization(){
        return; //TODO codavaj!!
    }

    /**
     * Indicates the class default behavior controlling whether submitted changes are immediately validated. This class default behavior acts as the default behavior for new instances of WODisplayGroup.
     * This behavior can be overridden for each WODisplayGroup instance using setValidatesChangesImmediately.
     * Unless this behavior is changed using setGlobalDefaultForValidatesChangesImmediately, this method returns false.
     */
    public static boolean globalDefaultForValidatesChangesImmediately(){
        return false; //TODO codavaj!!
    }

    /**
     * Provides the default string match format for the class.
     */
    public static java.lang.String globalDefaultStringMatchFormat(){
        return null; //TODO codavaj!!
    }

    /**
     * Provides the default string match operator for the class.
     */
    public static java.lang.String globalDefaultStringMatchOperator(){
        return null; //TODO codavaj!!
    }

    /**
     * Description copied from interface:
     * Invoked from valueForKey when it finds no property binding for key. The default implementation throws an NSKeyValueCoding.UnknownKeyException, with the target object(TargetObjectUserInfoKey) and key(UnknownUserInfokey) in the user info. An NSKeyValueCoding.ErrorHandling class can override this method to handle the query in some other way. The method can return a value, in which case that value is returned by the corresponding valueForKey invocation.
     */
    public java.lang.Object handleQueryWithUnboundKey(java.lang.String key){
        return null; //TODO codavaj!!
    }

    /**
     * Description copied from interface:
     * Invoked from takeValueForKey when it finds no property binding for key. The default implementation throws an NSKeyValueCoding.UnknownKeyException, with the target object(TargetObjectUserInfoKey) and key(UnknownUserInfoKey) in the user info dictionary of the exception. An NSKeyValueCoding.ErrorHandling class can override this method to handle the error in some other way.
     */
    public void handleTakeValueForUnboundKey(java.lang.Object value, java.lang.String key){
        return; //TODO codavaj!!
    }

    /**
     * If a to-many relationship is dragged from EOModeler to an open component in WebObjects Builder, a display group is created that has an EODetailDataSource. This behavior may also be set in WebObjects Builder using the Display Group Options panel.
     */
    public boolean hasDetailDataSource(){
        return false; //TODO codavaj!!
    }

    /**
     * Indicates whether the WODisplayGroup paginates display, using batchCount.
     */
    public boolean hasMultipleBatches(){
        return false; //TODO codavaj!!
    }

    /**
     * Provides the index into displayedObjects of the first object in the current batch. As an example, if the current batch is displaying items 11 through 20, this method returns 11.
     */
    public int indexOfFirstDisplayedObject(){
        return 0; //TODO codavaj!!
    }

    /**
     * Provides the index into displayedObjects of the last object in the current batch. As an example, if the current batch is displaying items 11 through 20, this method returns 20.
     */
    public int indexOfLastDisplayedObject(){
        return 0; //TODO codavaj!!
    }

    public java.lang.Object initWithCoder(com.webobjects.foundation.NSCoder coder){
        return null; //TODO codavaj!!
    }

    /**
     * Deprecated.
     */
    public boolean inQueryMode(){
        return false; //TODO codavaj!!
    }

    /**
     * Invokes insertNewObjectAtIndex with an index just past the first index in the selection, or at the end if there's no selection.
     */
    public java.lang.Object insert(){
        return null; //TODO codavaj!!
    }

    /**
     * Provides the dictionary of default values added to empty objects that are inserted into the WODisplayGroup's dataSource. This dictionary's keys represent the properties of the EOEntity that this WODisplayGroup manages.
     * If this dictionary is empty, insert and insertNewObjectAtIndex add an object that is initially empty. Because the inserted object is empty, the WODisplayGroup has no value to display for that object. This means that the inserted object may not be selected or modified by the client (web browser). Consequently, the dictionary should contain at least a default value for the property or properties displayed by the WODisplayGroup.
     */
    public com.webobjects.foundation.NSDictionary insertedObjectDefaultValues(){
        return null; //TODO codavaj!!
    }

    /**
     * Invokes the createObject method of the dataSource and inserts the new object into the dataSource (and into allObjects at newIndex) using insertObjectAtIndex. If a new object can't be created, this method invokes WODisplayGroup.Delegate.displayGroupCreateObjectFailedForDataSource.
     * If the object is successfully created, this method then sets the default values specified by insertedObjectDefaultValues.
     */
    public java.lang.Object insertNewObjectAtIndex(int newIndex){
        return null; //TODO codavaj!!
    }

    /**
     * Inserts createObject into the WODisplayGroup's dataSource and into allObjects and displayedObjects at newIndex, if possible.
     * Insertion may be prevented by WODisplayGroup.Delegate.displayGroupShouldInsertObject.
     * If the deletion is not prevented and succeeds, this method also invokes: selectObjectsIdenticalTo with createObject willChange WODisplayGroup.Delegate.displayGroupDidInsertObject
     */
    public void insertObjectAtIndex(java.lang.Object createObject, int newIndex){
        return; //TODO codavaj!!
    }

    /**
     * Provides the additional keys to which WOAssociations may be bound for this WODisplayGroup.
     * Typically a WODisplayGroup's basic keys are the attributes and relationships of its objects, allObjects. These keys are defined by the EOClassDescription for the objects (derived from an EOEntity in the EOModel associated with the WODisplayGroup's dataSource).
     * Local keys are used by WebObjects Builder to extend manually the interface of a WODisplayGroup's objects or to provide interface conveniences. Such keys may form associations with key paths, with arbitrary methods of objects or with properties of objects not associated with an EOEntity.
     */
    public com.webobjects.foundation.NSArray localKeys(){
        return null; //TODO codavaj!!
    }

    /**
     * Provides the master object for a detail display group (a display group that represents a detail in a master-detail relationship). A detail display group is one that uses an EODetailDataSource (defined in the EOControl framework). A detail display group is created by dragging a to-many relationship from EOModeler to an open component in WebObjects Builder. If the display group is not a detail display group or does not have a master object set, this method returns null.
     */
    public java.lang.Object masterObject(){
        return null; //TODO codavaj!!
    }

    /**
     * You can set the batch size using setNumberOfObjectsPerBatch or using WebObjects Builder's Display Group Options panel.
     */
    public int numberOfObjectsPerBatch(){
        return 0; //TODO codavaj!!
    }

    /**
     * Redisplays the changed objects in the WODisplayGroup. The userInfo of notification may indicate that some objects have been deleted.
     */
    public void objectsChangedInEditingContext(com.webobjects.foundation.NSNotification notification){
        return; //TODO codavaj!!
    }

    /**
     * Refetches all objects from the dataSource of the WODisplayGroup after some or all of them have been invalidated. Refetching may be prevented by the WODisplayGroup's delegate method, displayGroupShouldRefetchForInvalidatedAllObjects.
     */
    public void objectsInvalidatedInEditingContext(com.webobjects.foundation.NSNotification notification){
        return; //TODO codavaj!!
    }

    /**
     * Provides the last qualifier given to the WODisplayGroup via setQualifier or qualifyDisplayGroup. The WODisplayGroup uses this qualifier, in conjunction with its sortOrderings, to filter allObjects into displayedObjects.
     * If the WODisplayGroup has a delegate that responds to displayGroupDisplayArrayForObjects, the WODisplayGroup uses this method to filter allObjects instead of using its qualifier and sortOrderings.
     */
    public com.webobjects.eocontrol.EOQualifier qualifier(){
        return null; //TODO codavaj!!
    }

    /**
     * Builds a qualifier constructed from entries in these query dictionaries: queryMatch, queryMax, queryMin, and queryOperator.
     */
    public com.webobjects.eocontrol.EOQualifier qualifierFromQueryValues(){
        return null; //TODO codavaj!!
    }

    /**
     * Takes the result of qualifierFromQueryValues and applies to the WODisplayGroup's data source. The WODisplayGroup then invokes fetch on itself. If the WODisplayGroup is in query mode, query mode is exited. This method differs from qualifyDisplayGroup as follows: whereas qualifyDisplayGroup performs in-memory filtering of already fetched objects, qualifyDataSource triggers a new qualified fetch against the database.
     */
    public void qualifyDataSource(){
        return; //TODO codavaj!!
    }

    /**
     * Takes the result of the qualifierFromQueryValues and applies it to the WODisplayGroup using setQualifier. The method updateDisplayedObjects is invoked to refresh the display. If the WODisplayGroup is in query mode, query mode is exited.
     */
    public void qualifyDisplayGroup(){
        return; //TODO codavaj!!
    }

    /**
     * You use this method to perform a query stored in the EOModel file. Bind keys in this dictionary to elements on your WOComponent that specify query values, then pass this dictionary to the fetch specification that performs the fetch.
     */
    public com.webobjects.foundation.NSMutableDictionary queryBindings(){
        return null; //TODO codavaj!!
    }

    /**
     * The qualifierFromQueryValues method uses this dictionary along with the queryMax and queryMin dictionaries to construct qualifiers.
     * Use the queryOperator dictionary to specify the type of matching (=, , , like, and so on) for each key in the queryMatch dictionary.
     * If the queryOperator dictionary does not contain a key contained in the queryMatch dictionary, the default is to match the value exactly (=) if the value is a number or a date and to perform pattern matching if the value is a String. In the case of string values, the defaultStringMatchFormat and defaultStringMatchOperator specify exactly how the pattern matching will be performed.
     */
    public com.webobjects.foundation.NSMutableDictionary queryMatch(){
        return null; //TODO codavaj!!
    }

    /**
     * Provides a dictionary of "less than" query values. The qualifierFromQueryValues method uses this dictionary along with the queryMatch and queryMin dictionaries to construct qualifiers.
     */
    public com.webobjects.foundation.NSMutableDictionary queryMax(){
        return null; //TODO codavaj!!
    }

    /**
     * Provides a dictionary of "greater than" query values. The qualifierFromQueryValues method uses this dictionary along with the queryMatch and queryMin dictionaries to construct qualifiers.
     */
    public com.webobjects.foundation.NSMutableDictionary queryMin(){
        return null; //TODO codavaj!!
    }

    /**
     * If a key in the queryMatch dictionary also exists in queryOperator, that operator for that key is used. The allQualifierOperators method returns the operator strings you can use as values in this dictionary.
     */
    public com.webobjects.foundation.NSMutableDictionary queryOperator(){
        return null; //TODO codavaj!!
    }

    /**
     * Deprecated.
     * Invokes willChange.
     */
    public void redisplay(){
        return; //TODO codavaj!!
    }

    /**
     * Provides all of the EOQualifier operators excepts that work exclusively on strings (such as like and contains).
     */
    public com.webobjects.foundation.NSArray relationalQualifierOperators(){
        return null; //TODO codavaj!!
    }

    /**
     * Provides the first object from selectedObjects.
     */
    public java.lang.Object selectedObject(){
        return null; //TODO codavaj!!
    }

    /**
     * Provides the last selection given to the WODisplayGroup via setSelectedObjects. This selection is represented by an array of objects culled from the WODisplayGroup's displayedObjects.
     */
    public com.webobjects.foundation.NSArray selectedObjects(){
        return null; //TODO codavaj!!
    }

    /**
     * Provides the last selection given to the WODisplayGroup via setSelectionIndexes. This selection is represented by an array of Integers that indicates the indexes of the selected objects in allObjects.
     */
    public com.webobjects.foundation.NSArray selectionIndexes(){
        return null; //TODO codavaj!!
    }

    /**
     * Attempts to select the object just after the currently selected one. The selection is altered in this way: If there are no objects, does nothing. If there's no selection, selects the object at index zero. If the first selected object is the last object in the displayed objects array, selects the first object. Otherwise selects the object after the first selected object.
     */
    public java.lang.Object selectNext(){
        return null; //TODO codavaj!!
    }

    /**
     * Attempts to select the object equal to object in the WODisplayGroup's displayedObjects, returning true if successful and false otherwise. object is equal to an object in the displayedObjects array if its address is the same as the object in the array.
     */
    public boolean selectObject(java.lang.Object object){
        return false; //TODO codavaj!!
    }

    /**
     * Attempts to select the objects in the WODisplayGroup's displayedObjects array whose addresses are equal to those of objects, returning true if successful and false otherwise.
     */
    public boolean selectObjectsIdenticalTo(com.webobjects.foundation.NSArray objectSelection){
        return false; //TODO codavaj!!
    }

    /**
     * Selects the objects in the WODisplayGroup's displayed objectSelection array whose addresses are equal to those of objectSelection, returning true if successful and false otherwise. If no objects in the displayedObjects array match objects and selectFirstOnNoMatch is true, attempts to select the first object in the displayedObjects array.
     */
    public boolean selectObjectsIdenticalToSelectFirstOnNoMatch(com.webobjects.foundation.NSArray objectSelection, boolean selectFirstOnNoMatch){
        return false; //TODO codavaj!!
    }

    /**
     * Attempts to select the object just before the presently selected one. The selection is altered in this way: If there are no objects, does nothing. If there's no selection, selects the object at index zero. If the first selected object is at index zero, selects the last object. Otherwise selects the object before the first selected object.
     */
    public java.lang.Object selectPrevious(){
        return null; //TODO codavaj!!
    }

    /**
     * Indicates whether the WODisplayGroup should select the first object from its displayedObjects after a fetch when there were no selections before the fetch.
     */
    public boolean selectsFirstObjectAfterFetch(){
        return false; //TODO codavaj!!
    }

    /**
     * Displays the batchIndex batch of objects. The total batchCount equals the number of displayedObjects divided by the numberOfObjectsPerBatch. For example, if the WODisplayGroup has one hundred objects to display and the numberOfObjectsPerBatch is twenty, there are five batches. The first batch has a batch index of 1. setCurrentBatchIndex(3) would display the third batch of objects (objects 41 to 60 in this example).
     * If batchIndex is greater than the number of batches, this method displays the first batch.
     */
    public void setCurrentBatchIndex(int batchIndex){
        return; //TODO codavaj!!
    }

    /**
     * Changes the WODisplayGroup's EODataSource to ds. This also causes the WODisplayGroup to: Unregister itself, if necessary, as an editor and message handler for the previous EODataSource's EOEditingContext Register itself with ds's EOEditingContext, unless that EOEditingContext already has a message handler Clear its array of objects, allObjects Invoke WODisplayGroup.Delegate.displayGroupDidChangeDataSource
     */
    public void setDataSource(com.webobjects.eocontrol.EODataSource ds){
        return; //TODO codavaj!!
    }

    /**
     * Changes how pattern matching will be performed on String values in the queryMatch dictionary. This format is used for properties listed in the queryMatch dictionary that have String values and that do not have an associated entry in the queryOperator dictionary. In these cases, the value is matched using pattern matching and format specifies how it will be matched.
     * The default format string for pattern matching is "%@" which means that the string value in the queryMatch dictionary is used as a prefix (this default can be overridden on a class basis using setGlobalDefaultStringMatchFormat). For example, if the queryMatch dictionary contains a value "Jo" for the key "Name", the query returns all records whose name values begin with "Jo".
     */
    public void setDefaultStringMatchFormat(java.lang.String format){
        return; //TODO codavaj!!
    }

    /**
     * Changes the operator used to perform pattern matching for String values in the queryMatch dictionary. This operator is used for properties listed in the queryMatch dictionary that have String values and that do not have an associated entry in the queryOperator dictionary. In these cases, the operator is used to perform pattern matching.
     * The default value for the query match operator is caseInsensitiveLike, which means that the query does not consider case when matching letters (this default can be overridden on a class basis using setGlobalDefaultStringMatchOperator). The other possible value for this operator is like, which matches the case of the letters exactly.
     */
    public void setDefaultStringMatchOperator(java.lang.String op){
        return; //TODO codavaj!!
    }

    /**
     * Changes the WODisplayGroup's delegate to anObject.
     * The new delegate object may not implement WODisplayGroup.Delegate, because such implementation would require that all delegate methods be implemented. Those methods that might communicate with the delegate will take the appropriate steps to ensure that the delegate implements any method in question before attempting to invoke it.
     */
    public void setDelegate(java.lang.Object anObject){
        return; //TODO codavaj!!
    }

    /**
     * Changes the detail key to detailKey for a detail display group. The detail key is the key that retrieves from the master object the objects that this display group manages. You must set a detail key before you set a master object.
     * If the WODisplayGroup is not a detail display group, this method has no effect. A display group is a detail display group if its data source is an EODetailDataSource. A detail display group is typically created by dragging a to-many relationship from EOModeler to an open component in WebObjects Builder. Doing so sets the detail key and master object, so you rarely need to use this method.
     */
    public void setDetailKey(java.lang.String detailKey){
        return; //TODO codavaj!!
    }

    /**
     * Changes whether the WODisplayGroup automatically fetches its objects after being loaded. This behavior may also be set in WebObjects Builder using the Display Group Options panel.
     */
    public void setFetchesOnLoad(boolean yn){
        return; //TODO codavaj!!
    }

    /**
     * Changes the class default behavior controlling whether submitted changes are immediately validated. This class default behavior acts as the default behavior for new instances of WODisplayGroup.
     * This behavior can be overridden for each WODisplayGroup instance using setValidatesChangesImmediately.
     */
    public static void setGlobalDefaultForValidatesChangesImmediately(boolean yn){
        return; //TODO codavaj!!
    }

    /**
     * Changes the default string match format for the class.
     */
    public static void setGlobalDefaultStringMatchFormat(java.lang.String format){
        return; //TODO codavaj!!
    }

    /**
     * Changes the default string match operator for the class.
     */
    public static void setGlobalDefaultStringMatchOperator(java.lang.String op){
        return; //TODO codavaj!!
    }

    /**
     * Deprecated.
     */
    public void setInQueryMode(boolean yn){
        return; //TODO codavaj!!
    }

    /**
     * Changes the dictionary of default values added to empty objects that are inserted into the WODisplayGroup. By default, this dictionary is empty.
     */
    public void setInsertedObjectDefaultValues(com.webobjects.foundation.NSDictionary defaultValues){
        return; //TODO codavaj!!
    }

    /**
     * Changes the additional keys to which WOAssociations for the objects in this WODisplayGroup may be bound to the Strings in newKeySet.
     */
    public void setLocalKeys(com.webobjects.foundation.NSArray newKeySet){
        return; //TODO codavaj!!
    }

    /**
     * Changes the master object to masterObject for detail display groups and then performs a fetch if the display group is set to fetch on load. The master object owns the objects controlled by this display group.
     * Before this method is used, you should use the setDetailKey to set the key to this relationship. A detail display group is typically created by dragging a to-Many relationship from EOModeler to an open component in WebObjects Builder. Doing so sets the master object and detail key, so typically you don't have to use this method.
     * If the WODisplayGroup is not a detail display group, this method has no effect.
     */
    public void setMasterObject(java.lang.Object masterObject){
        return; //TODO codavaj!!
    }

    /**
     * Changes the number of objects the WODisplayGroup displays at a time. For example, suppose you are displaying one hundred records. Instead of displaying all of these at once, you can set the batch size so that the page displays a more manageable number (for example, 10). WebObjects Builder allows to set the number of objects per batch on the Display Group Options panel.
     */
    public void setNumberOfObjectsPerBatch(int count){
        return; //TODO codavaj!!
    }

    /**
     * Changes the WODisplayGroup's array of allObjects to array, regardless of what its dataSource provides. Invoked from fetch to set the array of fetched objects; should almost never need to be invoked explicitly.
     * Doesn't affect the dataSource's objects at all; specifically, this method results neither in inserts nor deletes of objects in the dataSource. array should contain objects with the same property names or methods as those used by the WODisplayGroup.
     * After changing to array, this method restores as much of any previous object selection as possible. If unable to restore any previous selection, then the first object is selected if the WODisplayGroup selectsFirstObjectAfterFetch.
     */
    public void setObjectArray(com.webobjects.foundation.NSArray array){
        return; //TODO codavaj!!
    }

    /**
     * Changes the EOQualifier used by the WODisplayGroup to filter its displayedObjects. Typically invoked in conjunction with setSortOrderings.
     * Use updateDisplayedObjects to apply a new qualifier to the WODisplayGroup (filter allObjects into displayedObjects).
     * The WODisplayGroup's qualifier may also be changed via qualifyDisplayGroup or from WebObjects Builder using the Display Group Options panel.
     */
    public void setQualifier(com.webobjects.eocontrol.EOQualifier qualifier){
        return; //TODO codavaj!!
    }

    /**
     * Changes the WODisplayGroup's selectedObjects to an array containing only anObject. Invokes setSelectedObjects to do so.
     * If anObject is null, invokes clearSelection.
     */
    public void setSelectedObject(java.lang.Object anObject){
        return; //TODO codavaj!!
    }

    /**
     * Changes the WODisplayGroup's selection from displayedObjects to objects. Invokes setSelectionIndexes to do so.
     * Invoked by setSelectedObject.
     */
    public void setSelectedObjects(com.webobjects.foundation.NSArray objects){
        return; //TODO codavaj!!
    }

    /**
     * Changes the selection from allObjects. s contains the indexes (Integers) of some or all of the objects from allObjects.
     * Invoked by setSelectedObjects.
     * The selection change may be prevented by the WODisplayGroup's delegate method, displayGroupShouldChangeSelectionToIndexes.
     * If the selection change is not prevented and succeeds, the WODisplayGroup invokes the delegate method, displayGroupDidChangeSelectedObjects.
     * NOTE: The selection made here does not necessarily result in a display change in the client (web browser).
     */
    public boolean setSelectionIndexes(com.webobjects.foundation.NSArray s){
        return false; //TODO codavaj!!
    }

    /**
     * Changes whether the WODisplayGroup should select the first object from its displayedObjects after a fetch when there were no selections before the fetch.
     * By default, a WODisplayGroup will select the first object after a fetch when there was no previous selection.
     */
    public void setSelectsFirstObjectAfterFetch(boolean yn){
        return; //TODO codavaj!!
    }

    /**
     * Changes the EOQualifier used by the WODisplayGroup to filter its objects. Typically invoked in conjunction with setQualifier.
     * Use updateDisplayedObjects to apply the new sort orderings to the WODisplayGroup (filter allObjects into displayedObjects).
     * The WODisplayGroup's sortOrderings may also be changed from WebObjects Builder using the Display Group Options panel.
     */
    public void setSortOrderings(com.webobjects.foundation.NSArray keySortOrderArray){
        return; //TODO codavaj!!
    }

    /**
     * Changes whether the WODisplayGroup immediately validates submitted changes.
     * This behavior can be overridden class-wide (affecting WODisplayGroup instances created after the class change) using setGlobalDefaultForValidatesChangesImmediately.
     */
    public void setValidatesChangesImmediately(boolean yn){
        return; //TODO codavaj!!
    }

    /**
     * Provides the last array of EOSortOrdering objects given to the WODisplayGroup via setSortOrderings. The WODisplayGroup uses these sort orderings, in conjunction with its qualifier, to filter allObjects into displayedObjects.
     * If the WODisplayGroup has a delegate that responds to displayGroupDisplayArrayForObjects, the WODisplayGroup uses this method to filter allObjects instead of using its qualifier and sortOrderings.
     */
    public com.webobjects.foundation.NSArray sortOrderings(){
        return null; //TODO codavaj!!
    }

    /**
     * Provides an array containing all of the relational operators supported by EOQualifier that work exclusively on Strings: "starts with", "contains", "ends with", "is", and "like".
     */
    public com.webobjects.foundation.NSArray stringQualifierOperators(){
        return null; //TODO codavaj!!
    }

    /**
     * Description copied from interface:
     * Sets the value for the property identified by key to value.
     * The default implementation provided by NSKeyValueCoding.DefaultImplementation works as follows:
     * Searches for a public accessor method of the form setKey, and invokes it if there is one. If a public accessor method is not found, searches for a private accessor method of the form _setKey, and invokes it if there is one. If an accessor method is not found and the static method canAccessFieldsDirectly returns true, searches for a field based on key and sets its value directly. For the key "lastName", this would be _lastName, _isLastName, lastName, or isLastName. If the type of the value argument is not compatible with the underlying field or method parameter, the default implementation will make an effort to convert between different Java numeric types (Integer, Double, BigDecimal, etc) as well as between Boolean and Number (true = 1, false = 0). If any other conversion would be necessary, an exception is thrown. If neither an accessor method nor a field is found, it is an error condition. It invokes handleTakeValueForUnboundKey if the object implements NSKeyValueCoding.ErrorHandling or throws NSKeyValueCoding.UnknownKeyException if the object does not.
     * Note: : The default implementations have significant performance optimizations. To benefit from them, implement NSKeyValueCoding on a custom class as shown above by using the methods in NSKeyValueCoding. DefaultImplementation, or if your class inherits from an WebObjects class that implements NSKeyValueCoding, do not override the inherited implementation. Using a custom implementation incurs significant performance penalties.
     */
    public void takeValueForKey(java.lang.Object value, java.lang.String key){
        return; //TODO codavaj!!
    }

    public java.lang.String toString(){
        return null; //TODO codavaj!!
    }

    /**
     * Description copied from interface:
     * Invoked from takeValueForKey when it is given a null value for a scalar property (such as an int or a float). The default implementation throws an IllegalArgumentException. You might want to implement the method (or override the inherited implementation) to handle the request in some other way, such as by substituting new Integer(0) or a sentinel value and invoking takeValueForKey again.
     */
    public void unableToSetNullForKey(java.lang.String key){
        return; //TODO codavaj!!
    }

    /**
     * Provides the NSUndoManager used by the WODisplayGroup's dataSource's EOEditingContext.
     */
    public com.webobjects.foundation.NSUndoManager undoManager(){
        return null; //TODO codavaj!!
    }

    /**
     * Recalculates the WODisplayGroup's displayedObjects from allObjects and redisplays them. Invoked by qualifyDisplayGroup and setObjectArray.
     * If the WODisplayGroup has a delegate that responds to displayGroupDisplayArrayForObjects, the WODisplayGroup uses this method to filter allObjects into displayedObjects. Otherwise, the WODisplayGroup uses its qualifier and sortOrderings to do so. In either case, any objects that were previously selected remain selected in the new array of displayedObjects.
     */
    public void updateDisplayedObjects(){
        return; //TODO codavaj!!
    }

    /**
     * Indicates whether the WODisplayGroup immediately validates submitted changes.
     * Unless this behavior is overridden for this WODisplayGroup instance using setValidatesChangesImmediately, the value returned is the same as that currently returned by globalDefaultForValidatesChangesImmediately.
     */
    public boolean validatesChangesImmediately(){
        return false; //TODO codavaj!!
    }

    /**
     * Description copied from interface:
     * Retrieves the value of the property named by key.
     * The default implementation provided by NSKeyValueCoding.DefaultImplementation works as follows:
     * Searches for a public accessor method based on key. For example, with a key of "lastName", the method looks for a method named getLastName, lastName, or isLastName. If a public accessor method is not found, searches for a private accessor method based on key (a method preceded by an underbar). For example, with a key of "lastName", the method looks for a method named _getLastName, _lastName, or _isLastName If an accessor method is not found and the static method canAccessFieldsDirectly returns true, the method searches for a field based on key and returns its value directly. For the key "lastName", this would be _lastName, _isLastName, lastName, or isLastName. If neither an accessor method nor a field is found, the method invokes handleQueryWithUnboundKey (defined in NSKeyValueCoding.ErrorHandling).
     * Note: The default implementations have significant performance optimizations. To benefit from them, implement NSKeyValueCoding on a custom class as shown above by using the methods in NSKeyValueCoding.DefaultImplementation, or if your class inherits from an WebObjects class that implements NSKeyValueCoding, do not override the inherited implementation. Using a custom implementation incurs significant performance penalties.
     */
    public java.lang.Object valueForKey(java.lang.String key){
        return null; //TODO codavaj!!
    }

    /**
     * Notifies observers that the WODisplayGroup will change.
     */
    public void willChange(){
        return; //TODO codavaj!!
    }

    /**
     * The WODisplayGroup delegate offers a number of methods, and WODisplayGroup invokes them as appropriate.
     * Besides displayGroupDisplayArrayForObjects, there are methods that inform the delegate that the WODisplayGroup has fetched objects from its dataSource, created an object (or failed to create one), inserted or deleted an object within its EOEditingContext, changed the selection, or set a value for a property of one of its objects.
     * There are also methods that request permission from the delegate to perform most of these same actions. Such methods can return true to permit the action or false to deny it.
     * If the WODisplayGroup has a delegate object, the delegate object may not implement this interface (in order to avoid the need to implement all of the delegate methods). The WODisplayGroup will only invoke delegate methods if it has a delegate and the methods in question are implemented by the delegate.
     * See Also:EODataSource, EOEditingContext, WODisplayGroup.delegate(), WODisplayGroup.setDelegate(java.lang.Object), WODisplayGroup.Delegate.displayGroupDisplayArrayForObjects(com.webobjects.appserver.WODisplayGroup, com.webobjects.foundation.NSArray)
     */
    public static interface Delegate{
        /**
         * Informs the delegate that group has failed to create a new object for dataSource. Invoked from insertNewObjectAtIndex.
         * If the delegate doesn't implement this method, WODisplayGroup fails silently.
         */
        abstract void displayGroupCreateObjectFailedForDataSource(com.webobjects.appserver.WODisplayGroup group, com.webobjects.eocontrol.EODataSource dataSource);

        /**
         * Informs the delegate that group's dataSource has changed.
         */
        abstract void displayGroupDidChangeDataSource(com.webobjects.appserver.WODisplayGroup group);

        /**
         * Informs the delegate that group's selected objects have changed, regardless of whether the selection indexes have changed.
         */
        abstract void displayGroupDidChangeSelectedObjects(com.webobjects.appserver.WODisplayGroup group);

        /**
         * Informs the delegate that group's selection has changed.
         */
        abstract void displayGroupDidChangeSelection(com.webobjects.appserver.WODisplayGroup group);

        /**
         * Informs the delegate that group has deleted eo.
         */
        abstract void displayGroupDidDeleteObject(com.webobjects.appserver.WODisplayGroup group, java.lang.Object eo);

        /**
         * Informs the delegate that group has fetched objects from its dataSource.
         */
        abstract void displayGroupDidFetchObjects(com.webobjects.appserver.WODisplayGroup group, com.webobjects.foundation.NSArray objects);

        /**
         * Informs the delegate that group has inserted eo.
         */
        abstract void displayGroupDidInsertObject(com.webobjects.appserver.WODisplayGroup group, java.lang.Object eo);

        /**
         * Allows the delegate to filter and sort group's array of objects to limit which ones get displayed. Invoked from updateDisplayedObjects. The delegate should filter any objects that shouldn't be shown and sort the remainder, returning a new array containing this grouping of objects.
         * You can use EOQualifier's filteredArrayWithQualifier and EOSortOrdering's sortedArrayUsingKeyOrderArray methods to create the new array.
         * If the delegate doesn't implement this method, WODisplayGroup uses its own qualifier and sort ordering to update the displayedObjects array.
         */
        abstract com.webobjects.foundation.NSArray displayGroupDisplayArrayForObjects(com.webobjects.appserver.WODisplayGroup group, com.webobjects.foundation.NSArray objects);

        /**
         * Allows the delegate to prevent a change in selection by group.
         */
        abstract boolean displayGroupShouldChangeSelectionToIndexes(com.webobjects.appserver.WODisplayGroup group, com.webobjects.foundation.NSArray newIndexes);

        /**
         * Allows the delegate to prevent group from deleting eo.
         */
        abstract boolean displayGroupShouldDeleteObject(com.webobjects.appserver.WODisplayGroup group, java.lang.Object eo);

        /**
         * Deprecated.
         * Allows the delegate to control the display of alert messages when an error is encountered in group or its EOEditingContext.
         * If this delegate method returns true, an alert is displayed; if the delegate returns false, no alert is displayed. The two String parameters specify the alert title and alert description, respectively.
         * Such alerts are displayed using Foundation's NSLog class.
         */
        abstract boolean displayGroupShouldDisplayAlert(com.webobjects.appserver.WODisplayGroup group, java.lang.String title, java.lang.String message);

        /**
         * Allows the delegate to prevent group from fetching.
         */
        abstract boolean displayGroupShouldFetch(com.webobjects.appserver.WODisplayGroup group);

        /**
         * Allows the delegate to prevent group from inserting eo at index.
         */
        abstract boolean displayGroupShouldInsertObject(com.webobjects.appserver.WODisplayGroup group, java.lang.Object eo, int index);

        /**
         * Allows the delegate to suppress immediate refetching when the WODisplayGroup's objects have been invalidated. Invoked whenever group receives an EOObjectStore.InvalidatedAllObjectsInStoreNotification.
         */
        abstract boolean displayGroupShouldRefetchForInvalidatedAllObjects(com.webobjects.appserver.WODisplayGroup group, com.webobjects.foundation.NSNotification notification);

    }
}

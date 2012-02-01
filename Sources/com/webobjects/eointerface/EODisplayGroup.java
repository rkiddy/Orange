package com.webobjects.eointerface;
/**
 * An EODisplayGroup is the basic user interface manager for an Enterprise Objects Framework or Java Client application. It collects objects from an EODataSource, filters and sorts them, and maintains a selection in the filtered subset. It interacts with user interface objects and other display objects through EOAssociations, which bind the values of objects to various aspects of the display objects.
 * An EODisplayGroup manipulates its EODataSource by sending it fetchObjects, insertObject, and other messages, and registers itself as an editor and message handler of the EODataSource's EOEditingContext. The EOEditingContext allows the EODisplayGroup to intercede in certain operations, as described in the EOEditingContext.Editor and EOEditingContext. MessageHandler interface specifications (both interfaces are defined in EOControl). EODisplayGroup implements all the methods of these informal protocols; see their specifications for more information.
 * Most of an EODisplayGroup's interactions are with its associations, its EODataSource, and its EOEditingContext. See the EOAssociation, EODataSource, and EOEditingContext class specifications for more information on these interactions.
 * Creating an EODisplayGroup:
 * You create most EODisplayGroups in Interface Builder, by dragging an entity icon from the EOModeler application, which creates an EODisplayGroup with an EODatabaseDataSource (EODistributedDataSource for Java Client applications), or by dragging an EODisplayGroup with no EODataSource from the EOPalette. EODisplayGroups with EODataSources operate independent of other EODisplayGroups, while those without EODataSources must be set up in a master-detail association with another EODisplayGroup.
 * To create an EODisplayGroup programmatically, simply initialize it and set its EODataSource: EODistributedDataSource dataSource; /* Assume this exists. *\/ EODisplayGroup displayGroup; displayGroup = new EODisplayGroup(); displayGroup.setDataSource(dataSource);
 * After creating the EODisplayGroup, you can add associations as described in the EOAssociation class specification.
 * Getting Objects Since an EODisplayGroup isn't much use without objects to manage, the first thing you do with an EODisplayGroup is send it a fetch message. You can use the basic fetch method or you can configure the EODisplayGroup in Interface Builder to fetch automatically when its .nib file is loaded. These methods all ask the EODisplayGroup's EODataSource to fetch from its persistent store with a fetchObjects message.
 * Filtering and Sorting An EODisplayGroup's fetched objects are available through its allObjects method. These objects are treated only as candidates for display, however. The array of objects actually displayed is filtered and sorted by the EODisplayGroup's delegate, or by a qualifier and sort ordering array. You set the qualifier and sort orderings using the setQualifier and setSortOrderings methods. The displayedObjects method returns this filtered and sorted array; index arguments to other EODisplayGroup methods are defined in terms of this array. If the EODisplayGroup has a delegate that responds to displayGroupDisplayArrayForObjects, it invokes this method rather than using its own qualifier and sort ordering array. The delegate is then responsible for filtering the objects and returning a sorted array. If the delegate only needs to perform one of these steps, it can get the qualifier or sort orderings from the EODisplayGroup and apply either itself using EOQualifier's filteredArrayUsingQualifier and EOSortOrdering's sortedArrayUsingKeyOrderArray methods, which are added by the control layer. If you change the qualifier or sort ordering, or alter the delegate in a way that changes how it filters and sorts the EODisplayGroup's objects, you can send updateDisplayedObjects to the EODisplayGroup to get it to refilter and resort its objects. Note that this doesn't cause the EODisplayGroup to refetch.
 * Changing and Examining the Selection An EODisplayGroup keeps a selection in terms of indexes into the array of displayed objects. EOAssociations that display values for multiple objects are responsible for updating the selection in their EODisplayGroups according to user actions on their display objects. This is typically done with the setSelectionIndexes method. Other methods available for indirect manipulation of the selection are the action methods selectNext and selectPrevious, as well as selectObjectsIdenticalTo and selectObjectsIdenticalToSelectFirstOnNoMatch. To get the selection, you can use the selectionIndexes method, which returns an array of Numbers, or selectedObjects, which returns an array containing the selected objects themselves. Another method, selectedObject, returns the first selected object if there is one.
 * The Delegate EODisplayGroup offers a number of methods for its delegate to implement; if the delegate does, it invokes them as appropriate. Besides the aforementioned displayGroupDisplayArrayForObjects, there are methods that inform the delegate that the EODisplayGroup has fetched, created an object (or failed to create one), inserted or deleted an object, changed the selection, or set a value for a property. There are also methods that request permission from the delegate to perform most of these same actions. The delegate can return true to permit the action or false to deny it. For more information, see each method's description in the EODisplayGroup.Delegate interface specification.
 * Methods for Use by EOAssociations While most of your application code interacts with objects directly, EODisplayGroup also defines methods for its associations to access properties of individual objects without having to know anything about which methods they implement. Accessing properties through the EODisplayGroup offers associations the benefit of automatic validation, as well. Associations access objects by index into the displayed objects array, or by object identifier. valueForObjectAtIndex returns the value of a named property for the object at a given index, and setValueForObjectAtIndex sets it. Similarly, valueForObject and setValueForObject access the objects by object identifier. EOAssociations can also get and set values for the first object in the selection using selectedObjectValueForKey and setSelectedObjectValue.
 * See Also:EOAssociation, EODataSource, EOEditingContext
 */
public class EODisplayGroup implements com.webobjects.foundation.NSDisposable{
    /**
     * An NSNotification with this name is posted whenever an EODisplayGroup receives a fetch message. The notification contains: Notification Object - The EODisplayGroup that received the fetch message. Userinfo - None
     * See Also:Constant Field Values
     */
    public static final java.lang.String DisplayGroupWillFetchNotification="EODisplayGroupWillFetch";

    /**
     * Creates a new EODisplayGroup. The new display group needs to have an EODataSource set with setDataSource.
     * See Also:EOAssociation.bindAspect(java.lang.String, com.webobjects.eointerface.EODisplayGroup, java.lang.String)
     */
    public EODisplayGroup(){
         //TODO codavaj!!
    }

    public com.webobjects.foundation.NSArray allObjects(){
        return null; //TODO codavaj!!
    }

    /**
     * Invoked by association when its display object begins editing to record that EOAssociation as the editing association.
     */
    public void associationDidBeginEditing(com.webobjects.eointerface.EOAssociation association){
        return; //TODO codavaj!!
    }

    /**
     * Invoked by association to clear the editing association. If association is the receiver's editing association, clears the editing association. Otherwise does nothing.
     */
    public void associationDidEndEditing(com.webobjects.eointerface.EOAssociation association){
        return; //TODO codavaj!!
    }

    /**
     * Invoked by association from its shouldEndEditingAtIndex method to let the receiver handle a validation error. This method opens an attention panel with errorDescription as the message and returns false.
     */
    public boolean associationFailedToValidateValue(com.webobjects.eointerface.EOAssociation association, java.lang.String value, java.lang.String key, java.lang.Object eo, java.lang.String errorDescription){
        return false; //TODO codavaj!!
    }

    /**
     * Invoked when the receiver is unarchived from a nib file to prepare it for use in an application. You should never invoke this method directly. Finishes initializing the receiver and updates the display.
     */
    public void awakeFromNib(){
        return; //TODO codavaj!!
    }

    /**
     * Invokes setSelectionIndexes to clear the selection.
     */
    public boolean clearSelection(){
        return false; //TODO codavaj!!
    }

    /**
     * Returns whether or not there are changes in any of this EODisplayGroup's objects and not all observers have been notified. EOAssociations use this in their subjectChanged methods to determine what they need to update.
     */
    public boolean contentsChanged(){
        return false; //TODO codavaj!!
    }

    public com.webobjects.eocontrol.EODataSource dataSource(){
        return null; //TODO codavaj!!
    }

    public java.lang.String defaultStringMatchFormat(){
        return null; //TODO codavaj!!
    }

    public java.lang.String defaultStringMatchOperator(){
        return null; //TODO codavaj!!
    }

    public java.lang.Object delegate(){
        return null; //TODO codavaj!!
    }

    /**
     * Deprecated.
     */
    public void delete(){
        return; //TODO codavaj!!
    }

    /**
     * Attempts to delete the object at index. Checks with the delegate using displayGroupShouldDeleteObject. If the delegate returns false, this method fails and returns false. If successful, sends the delegate a displayGroupDidDeleteObject message. This method performs the delete by sending deleteObject to the EODataSource. If that message throws an exception, this method fails and returns false.
     */
    public boolean deleteObjectAtIndex(int index){
        return false; //TODO codavaj!!
    }

    /**
     * Attempts to delete the selected objects
     */
    public boolean deleteSelection(){
        return false; //TODO codavaj!!
    }

    public com.webobjects.foundation.NSArray displayedObjects(){
        return null; //TODO codavaj!!
    }

    /**
     * Clears all references this association has to other objects especially its display object and EODisplayGroup. Call this method before nulling out a reference to this association to ensure it gets garbage collected properly. Subclasses should override this method to do any additional cleanup that may be needed and invoke super's implementation at the end.
     */
    public void dispose(){
        return; //TODO codavaj!!
    }

    /**
     * Returns the editing association
     */
    public com.webobjects.eointerface.EOAssociation editingAssociation(){
        return null; //TODO codavaj!!
    }

    /**
     * Invoked by editingContext as part of the EOEditingContext.MessageHandlers interface, this method presents an attention panel with message as the message to display.
     */
    public void editingContextPresentErrorMessage(com.webobjects.eocontrol.EOEditingContext editingContext, java.lang.String message){
        return; //TODO codavaj!!
    }

    /**
     * Invoked by editingContext as part of the EOEditingContext.MessageHandlers interface, this method presents an attention panel prompting the user about whether or not to continue fetching the current result set.
     */
    public boolean editingContextShouldContinueFetching(com.webobjects.eocontrol.EOEditingContext editingContext, int count, int limit, com.webobjects.eocontrol.EOObjectStore objectStore){
        return false; //TODO codavaj!!
    }

    /**
     * Invoked by editingContext in its saveChanges method as part of the EOEditors informal protocol, this method allows the EODisplayGroup to prohibit a save operation. EODisplayGroup's implementation of this method invokes endEditing, and throws an exception if endEditing returns false. Thus, if there's an association that refuses to end editing, editingContext doesn't save changes.
     */
    public void editingContextWillSaveChanges(com.webobjects.eocontrol.EOEditingContext editingContext){
        return; //TODO codavaj!!
    }

    /**
     * Invoked by anEditingContext as part of the EOEditors interface, this method returns false if any association is editing, true otherwise.
     */
    public boolean editorHasChangesForEditingContext(com.webobjects.eocontrol.EOEditingContext editingContext){
        return false; //TODO codavaj!!
    }

    /**
     * Returns true to indicate that a single value association (such as an EOTextFieldAssociation for a JTextField) should be enabled for setting key, false otherwise. Normally this is the case if the receiver has a selected object. However, if key is a special query key (for example, "@query=.name"), then the control should be enabled even without a selected object.
     */
    public boolean enabledToSetSelectedObjectValueForKey(java.lang.String key){
        return false; //TODO codavaj!!
    }

    /**
     * Attempts to end any editing taking place.
     */
    public boolean endEditing(){
        return false; //TODO codavaj!!
    }

    /**
     * This action method invokes setInQueryMode with an argument of true.
     */
    public void enterQueryMode(){
        return; //TODO codavaj!!
    }

    /**
     * Returns the receiver's dictionary of equalTo query values. This dictionary is typically manipulated by associations bound to keys of the form @query=.propertyName. The qualifierFromQueryValues method uses this dictionary along with the lessThan and greaterThan dictionaries to construct qualifiers.
     */
    public com.webobjects.foundation.NSDictionary equalToQueryValues(){
        return null; //TODO codavaj!!
    }

    /**
     * Attempts to fetch objects from the EODataSource. Before fetching, invokes endEditing and sends displayGroupShouldFetch to the delegate, returning false if either of these methods does. If both return true, sends a fetchObjects message to the receiver's EODataSource to replace the object array, and if successful sends the delegate a displayGroupDidFetchObjects message.
     */
    public boolean fetch(){
        return false; //TODO codavaj!!
    }

    /**
     * Returns true if the receiver fetches automatically after being loaded from a nib file, false if it must be told explicitly to fetch. The default is false. You can set this behavior in Interface Builder using the Inspector panel.
     */
    public boolean fetchesOnLoad(){
        return false; //TODO codavaj!!
    }

    /**
     * Returns whether or not new instances should handle validation errors.
     */
    public static boolean globalDefaultForValidatesChangesImmediately(){
        return false; //TODO codavaj!!
    }

    /**
     * Returns the default string match format string used by display group instances.
     */
    public static java.lang.String globalDefaultStringMatchFormat(){
        return null; //TODO codavaj!!
    }

    /**
     * Returns the default string match operator used by display group instances.
     */
    public static java.lang.String globalDefaultStringMatchOperator(){
        return null; //TODO codavaj!!
    }

    /**
     * Returns the receiver's dictionary of greaterThan query values. This dictionary is typically manipulated by associations bound to keys of the form @query
     * .propertyName. The qualifierFromQueryValues method uses this dictionary along with the lessThan and equalTo dictionaries to construct qualifiers.
     */
    public com.webobjects.foundation.NSDictionary greaterThanQueryValues(){
        return null; //TODO codavaj!!
    }

    /**
     * Returns whether or not this display group is in query mode. In query mode, user interface controls that normally display values become empty, allowing users to type queries directly into them (this is also known as a "Query By Example" interface). In effect, the receiver's displayedObjects are replaced with an empty equalTo query values dictionary. When qualifyDisplayGroup or qualifyDataSource is subsequently invoked, the query is performed and the display reverts to displaying values, this time, the objects returned by the query.
     */
    public boolean inQueryMode(){
        return false; //TODO codavaj!!
    }

    /**
     * Invokes insertNewObjectAtIndex with an index just past the first index in the selection, or 0 if there is no selection.
     */
    public void insert(){
        return; //TODO codavaj!!
    }

    /**
     * Returns the default values to be used for newly inserted objects. The keys into the dictionary are the properties of the entity that the display group manages. If the dictionary returned by this method is empty, the insert... method adds an object that is initially empty. Use the setInsertedObjectDefaultValues method to set up a default value for newly inserted objects
     */
    public com.webobjects.foundation.NSDictionary insertedObjectDefaultValues(){
        return null; //TODO codavaj!!
    }

    /**
     * Asks the receiver's EODataSource to create a new object by sending it a createObject message, then inserts the new object using insertObjectAtIndex. The EODataSource createObject method has the effect of inserting the object into the EOEditingContext. If a new object can't be created, this method sends the delegate a displayGroupCreateObjectFailed message or, if the delegate doesn't respond, opens an attention panel to inform the user of the error.
     */
    public java.lang.Object insertNewObjectAtIndex(int newIndex){
        return null; //TODO codavaj!!
    }

    /**
     * Inserts createObject into the receiver's EODataSource and displayedObjects array at newIndex, if possible. This method checks with the delegate before actually inserting, using displayGroupShouldInsertObject. If the delegate refuses, createObject isn't inserted. After successfully inserting the object, this method informs the delegate with a displayGroupDidInsertObject message, and selects the newly inserted object. Throws an exception if newIndex is out of bounds. Unlike the insertNewObjectAtIndex method, this method does not insert the object into the EOEditingContext. If you use this method, you are responsible for inserting the object into the EOEditingContext yourself.
     */
    public boolean insertObjectAtIndex(java.lang.Object createObject, int newIndex){
        return false; //TODO codavaj!!
    }

    /**
     * Returns the receiver's dictionary of lessThan query values. This dictionary is typically manipulated by associations bound to keys of the form @query
     * .propertyName. The qualifierFromQueryValues method uses this dictionary along with the greaterThan and equalTo dictionaries to construct qualifiers.
     */
    public com.webobjects.foundation.NSDictionary lessThanQueryValues(){
        return null; //TODO codavaj!!
    }

    /**
     * Returns the additional keys that EOAssociations can be bound to. An EODisplayGroup's basic keys are typically those of the attributes and relationships of its objects, as defined by their EOClassDescription through an EOEntity in the model. Local keys are typically used to form associations with key paths, with arbitrary methods of objects, or with properties of objects not associated with an EOEntity. Interface Builder allows the user to add and remove local keys in the EODisplayGroup Attributes Inspector panel.
     */
    public com.webobjects.foundation.NSArray localKeys(){
        return null; //TODO codavaj!!
    }

    /**
     * Notification sent by the notification center when the data source (usually an EOEditingContext) that this display group observes has its objects changed. If objects were deleted from the data source, they will be in the userInfo dictionary of notification with the key "deleted". If the deleted array is not null and not empty, or if the delegate is not set, or if the delegate is set and responds true to shouldRedisplay, redisplay is called.
     */
    public void objectsChangedInEditingContext(com.webobjects.foundation.NSNotification notification){
        return; //TODO codavaj!!
    }

    /**
     * Notification sent by the notification center when the data source (usually an EOEditingContext) that this display group observes has its objects invalidated. If the delegate is not set, or if it is set and responds true to shouldRefetch, fetch is called.
     */
    public void objectsInvalidatedInEditingContext(com.webobjects.foundation.NSNotification notification){
        return; //TODO codavaj!!
    }

    /**
     * Returns all EOAssociations that observe the receiver's objects.
     */
    public com.webobjects.foundation.NSArray observingAssociations(){
        return null; //TODO codavaj!!
    }

    /**
     * Returns the receiver's qualifier, which it uses to filter its array of objects for display when the delegate doesn't do so itself.
     */
    public com.webobjects.eocontrol.EOQualifier qualifier(){
        return null; //TODO codavaj!!
    }

    /**
     * Builds a qualifier constructed from entries in the three query dictionaries: equalTo, greaterThan, and lessThan. These, in turn, are typically manipulated by associations bound to keys of the form @query=.firstName, @query
     * .budget, @query
     * .budget.
     */
    public com.webobjects.eocontrol.EOQualifier qualifierFromQueryValues(){
        return null; //TODO codavaj!!
    }

    /**
     * Takes the result of qualifierFromQueryValues and applies to the receiver's data source. The receiver then sends itself a fetch message. If the receiver is in query mode, query mode is exited. This method differs from qualifyDisplayGroup as follows: whereas qualifyDisplayGroup performs in-memory filtering of already fetched objects, qualifyDataSource triggers a new qualified fetch against the database.
     */
    public void qualifyDataSource(){
        return; //TODO codavaj!!
    }

    /**
     * Takes the result of qualifierFromQueryValues and applies it to the receiver using setQualifier. The method updateDisplayedObjects is invoked to refresh the display. If the receiver is in query mode, query mode is exited.
     */
    public void qualifyDisplayGroup(){
        return; //TODO codavaj!!
    }

    /**
     * Returns a dictionary containing the actual values that the user wants to query upon. You use this method to perform a query stored in the model file. Bind keys in this dictionary to elements on your component that specify query values, then pass this dictionary to the fetch specification that performs the fetch.
     */
    public com.webobjects.foundation.NSDictionary queryBindingValues(){
        return null; //TODO codavaj!!
    }

    /**
     * Returns a dictionary of operators to use on items in the query dictionaries (equalToQueryValues, greaterThanQueryValues, and lessThanQueryValues). If a key in a query dictionary also exists in queryOperatorValues, that operator for that key is used.
     */
    public com.webobjects.foundation.NSDictionary queryOperatorValues(){
        return null; //TODO codavaj!!
    }

    /**
     * Notifies all observing associations to redisplay their values.
     */
    public void redisplay(){
        return; //TODO codavaj!!
    }

    /**
     * Returns the first selected object in the displayed objects array, or null if there is no such object.
     */
    public java.lang.Object selectedObject(){
        return null; //TODO codavaj!!
    }

    /**
     * Returns the objects selected in the receiver's displayed objects array.
     */
    public com.webobjects.foundation.NSArray selectedObjects(){
        return null; //TODO codavaj!!
    }

    /**
     * Returns the value corresponding to key for the first selected object in the receiver's displayed objects array, or null if no objects are selected.
     */
    public java.lang.Object selectedObjectValueForKey(java.lang.String key){
        return null; //TODO codavaj!!
    }

    /**
     * Returns true if the selection has changed and not all observers have been notified, false otherwise. EOAssociations use this in their subjectChanged methods to determine what they need to update.
     */
    public boolean selectionChanged(){
        return false; //TODO codavaj!!
    }

    /**
     * Returns the indexes of the receiver's selected objects as Numbers, in terms of its displayed objects array.
     */
    public com.webobjects.foundation.NSArray selectionIndexes(){
        return null; //TODO codavaj!!
    }

    /**
     * Attempts to select the object just after the currently selected one, returning true if successful and false if not. The selection is altered in this way: If there are no objects, does nothing and returns false. If there's no selection, selects the object at index zero and returns true. If the first selected object is the last object in the displayed objects array, selects the first object and returns true. Otherwise selects the object after the first selected object.
     */
    public boolean selectNext(){
        return false; //TODO codavaj!!
    }

    /**
     * Attempts to find and select object. If object cannot be found, it clears the selection. The selection is performed on the receiver's displayedObjects, not on allObjects.
     */
    public boolean selectObject(java.lang.Object object){
        return false; //TODO codavaj!!
    }

    /**
     * Attempts to select the objects in the receiver's displayed objects array which are equal to those of objectSelection.
     */
    public boolean selectObjectsIdenticalTo(com.webobjects.foundation.NSArray objectSelection){
        return false; //TODO codavaj!!
    }

    /**
     * Selects the objects in the receiver's displayed objects array that are equal to those of objectSelection. If no objects in the displayed objects array match objects in objectSelection and selectFirstOnNoMatch is true, attempts to select the first object in the displayed objects array.
     */
    public boolean selectObjectsIdenticalToSelectFirstOnNoMatch(com.webobjects.foundation.NSArray objectSelection, boolean selectFirstOnNoMatch){
        return false; //TODO codavaj!!
    }

    /**
     * Attempts to select the object just before the presently selected one, returning true if successful and false if not. The selection is altered in this way: If there are no objects, does nothing and returns false. If there is no selection, selects the object at index zero and returns true. If the first selected object is at index zero, selects the last object and returns true. Otherwise selects the object before the first selected object. *
     */
    public boolean selectPrevious(){
        return false; //TODO codavaj!!
    }

    /**
     * Returns true if the receiver automatically selects its first displayed object after a fetch if there was no selection, false if it leaves an empty selection as-is.
     */
    public boolean selectsFirstObjectAfterFetch(){
        return false; //TODO codavaj!!
    }

    /**
     * Sets the receiver's EODataSource to ds. In the process, it performs these actions: Unregisters the receiver as an editor and message handler for the previous EODataSource's EOEditingContext, if necessary, and registers the receiver with ds's editing context. If the new editing context already has a message handler, however, the receiver doesn't assume that role. Registers this for ObjectsChangedInEditingContextNotification and InvalidatedAllObjectsInStoreNotification from the new editing context. Clears the receiver's array of objects. Sends displayGroupDidChangeDataSource to the delegate if there is one.
     */
    public void setDataSource(com.webobjects.eocontrol.EODataSource ds){
        return; //TODO codavaj!!
    }

    /**
     * Sets how pattern matching will be performed on String values in the query dictionaries ( equalToQueryValues, greaterThanQueryValues, and lessThanQueryValues). This format is used for query dictionary properties that have String values and that do not have an associated entry in the queryOperatorValues dictionary. In these cases, the value is matched using pattern matching and format specifies how it will be matched. The default format string for pattern matching is "%@*" which means that the string value in the queryMatch dictionary is used as a prefix. For example, if the query dictionary contains a value "Jo" for the key "Name", the query returns all records whose name values begin with "Jo".
     */
    public void setDefaultStringMatchFormat(java.lang.String format){
        return; //TODO codavaj!!
    }

    /**
     * Sets the operator used to perform pattern matching for String values in the queryMatch dictionary. This operator is used for properties listed in the query dictionaries ( equalToQueryValues, greaterThanQueryValues, and lessThanQueryValues) that have String values and that do not have an associated entry in the queryOperatorValues dictionary. In these cases, the operator matchOperator is used to perform pattern matching.
     * The default value for the query match operator is caseInsensitiveLike, which means that the query does not consider case when matching letters. The other possible value for this operator is like, which matches the case of the letters exactly.
     */
    public void setDefaultStringMatchOperator(java.lang.String op){
        return; //TODO codavaj!!
    }

    /**
     * Sets the receiver's delegate to anObject.
     */
    public void setDelegate(java.lang.Object anObject){
        return; //TODO codavaj!!
    }

    /**
     * Sets to values the receiver's dictionary of equalTo query values. The qualifierFromQueryValues method uses this dictionary along with the lessThan and greaterThan dictionaries to construct qualifiers.
     */
    public void setEqualToQueryValues(com.webobjects.foundation.NSDictionary values){
        return; //TODO codavaj!!
    }

    /**
     * Controls whether the receiver automatically fetches its objects after being loaded from a nib file. If yn is true it does; if yn is false the receiver must be told explicitly to fetch. The default is false. You can also set this behavior in Interface Builder using the Inspector panel.
     */
    public void setFetchesOnLoad(boolean yn){
        return; //TODO codavaj!!
    }

    /**
     * Sets the default behavior display group instances use when they encounter a validation error.
     */
    public static void setGlobalDefaultForValidatesChangesImmediately(boolean yn){
        return; //TODO codavaj!!
    }

    /**
     * Sets the default string match format to be used by display group instances. The default format string for pattern matching is "%@*".
     */
    public static void setGlobalDefaultStringMatchFormat(java.lang.String format){
        return; //TODO codavaj!!
    }

    /**
     * Sets the default string match operator to be used by display group instances. The default operator is "caseInsensitiveLike".
     */
    public static void setGlobalDefaultStringMatchOperator(java.lang.String op){
        return; //TODO codavaj!!
    }

    /**
     * Sets to values the receiver's dictionary of greaterThan query values. The qualifierFromQueryValues method uses this dictionary along with the lessThan and equalTo dictionaries to construct qualifiers.
     */
    public void setGreaterThanQueryValues(com.webobjects.foundation.NSDictionary values){
        return; //TODO codavaj!!
    }

    /**
     * Sets according to yn whether the receiver is in query mode.
     */
    public void setInQueryMode(boolean yn){
        return; //TODO codavaj!!
    }

    /**
     * Sets default values to be used for newly inserted objects. When you use the insert... method to add an object, that object is initially empty. You use this method to provide at least one field that can be displayed for the newly inserted object. The possible keys into the dictionary are the properties of the entity managed by this display group.
     */
    public void setInsertedObjectDefaultValues(com.webobjects.foundation.NSDictionary defaultValues){
        return; //TODO codavaj!!
    }

    /**
     * Sets to values the receiver's dictionary of lessThan query values. The qualifierFromQueryValues method uses this dictionary along with the greaterThan and equalTo dictionaries to construct qualifiers.
     */
    public void setLessThanQueryValues(com.webobjects.foundation.NSDictionary values){
        return; //TODO codavaj!!
    }

    /**
     * Sets the additional keys to which EOAssociations can be bound to the strings in newKeySet. Instead of invoking this method programmatically, you can use Interface Builder to add and remove local keys in the EODisplayGroup Attributes Inspector panel.
     */
    public void setLocalKeys(com.webobjects.foundation.NSArray newKeySet){
        return; //TODO codavaj!!
    }

    /**
     * Sets the receiver's objects to array, regardless of what its EODataSource provides. This method doesn't affect the EODataSource's objects at all; specifically, it results in neither inserts or deletes of objects in the EODataSource. array should contain objects with the same property names or methods as those accessed by the receiver. This method is used by fetch to set the array of fetched objects; you should rarely need to invoke it directly. After setting the object array, this method restores as much of the original selection as possible by invoking selectObjectsIdenticalTo. If there's no match and the receiver selects after fetching, then the first object is selected.
     */
    public void setObjectArray(com.webobjects.foundation.NSArray array){
        return; //TODO codavaj!!
    }

    /**
     * Sets the receiver's qualifier to qualifier. This qualifier is used to filter (in memory) the receiver's array of objects for display when the delegate doesn't do so itself. Use updateDisplayedObjects to apply the qualifier. Note: To set the qualifier used to fetch objects from the database, set the qualifier of the display group's dataSource (assuming that the data source is an EODatabaseDataSource). If the receiver's delegate responds to displayGroupDisplayArrayForObjects, that method is used instead of the qualifier to filter the objects.
     */
    public void setQualifier(com.webobjects.eocontrol.EOQualifier qualifier){
        return; //TODO codavaj!!
    }

    /**
     * Sets the dictionary of values that a user wants to query on. You use this method to perform a query stored in the model file. Bind keys in the queryBindingValues dictionary to elements of your component that specify query values.
     */
    public void setQueryBindingValues(com.webobjects.foundation.NSDictionary values){
        return; //TODO codavaj!!
    }

    /**
     * Sets the dictionary of operators to use on items in the query dictionaries ( equalToQueryValues, greaterThanQueryValues, and lessThanQueryValues). If a key in a query dictionary also exists in queryOperatorValues, that operator for that key is used.
     */
    public void setQueryOperatorValues(com.webobjects.foundation.NSDictionary values){
        return; //TODO codavaj!!
    }

    /**
     * Sets the selected objects to anObject.
     */
    public void setSelectedObject(java.lang.Object anObject){
        return; //TODO codavaj!!
    }

    /**
     * Sets the selected objects to objects.
     */
    public void setSelectedObjects(com.webobjects.foundation.NSArray objects){
        return; //TODO codavaj!!
    }

    /**
     * Invokes setValueForObject with the first selected object, returning true if successful and false otherwise. This method should be invoked only by EOAssociation objects to propagate changes from display objects.
     */
    public boolean setSelectedObjectValue(java.lang.Object value, java.lang.String key){
        return false; //TODO codavaj!!
    }

    /**
     * Selects the objects at indexe of s in the receiver's array if possible, returning true if successful and false if not (in which case the selection remains unaltered). This method is the primitive method for altering the selection; all other such methods invoke this one to make the change. This method invokes endEditing to wrap up any changes being made by the user. If endEditing returns false, this method fails and returns false. This method then checks the delegate with a displayGroupShouldChangeSelection message. If the delegate returns false, this method also fails and returns false. If the receiver successfully changes the selection, its observers (typically EOAssociations) each receive a subjectChanged message.
     */
    public boolean setSelectionIndexes(com.webobjects.foundation.NSArray s){
        return false; //TODO codavaj!!
    }

    /**
     * Controls whether the receiver automatically selects its first displayed object after a fetch when there were no selected objects before the fetch.
     */
    public void setSelectsFirstObjectAfterFetch(boolean yn){
        return; //TODO codavaj!!
    }

    /**
     * Sets the EOSortOrdering objects that updateDisplayedObjects uses to sort the displayed objects to orderings. Use updateDisplayedObjects to apply the sort orderings. If the receiver's delegate responds to displayGroupDisplayArrayForObjects, that method is used instead of the sort orderings to order the objects.
     */
    public void setSortOrderings(com.webobjects.foundation.NSArray keySortOrderArray){
        return; //TODO codavaj!!
    }

    /**
     * Controls how the receiver redisplays on changes to objects. Because changes to other objects can affect the displayed objects (through flattened attributes or custom methods, for example), EODisplayGroups by default use the more pessimistic refresh technique of redisplaying on any change in the EOEditingContext. If you know that none of the EOAssociations for a particular EODisplayGroup display derived values, you can turn on optimistic refresh to reduce redisplay time. You can also change this setting in Interface Builder's Inspector panel using the Refresh All check box.
     */
    public void setUsesOptimisticRefresh(boolean yn){
        return; //TODO codavaj!!
    }

    /**
     * Controls the receiver's behavior on encountering a validation error. Whenever an EODisplayGroup sets a value in an object, it sends the object a validateValueForKey message, allowing the object to coerce the value's type to a more appropriate one or to return an exception indicating that the value isn't valid.
     */
    public void setValidatesChangesImmediately(boolean yn){
        return; //TODO codavaj!!
    }

    /**
     * Sets a property of eo, identified by key, to value. If a new value is set, sends the delegate a displayGroupDidSetValueForObject message. This method should be invoked only by EOAssociation objects to propagate changes from display objects. Other application code should interact with the objects directly. If the receiver validates changes immediately, it sends eo a validateValueForKey message, returning false if the object refuses to validate value. Otherwise, validation errors are checked by the EOEditingContext when it attempts to save changes.
     */
    public boolean setValueForObject(java.lang.Object value, java.lang.Object eo, java.lang.String key){
        return false; //TODO codavaj!!
    }

    /**
     * Invokes setValueForObject with the object at index. This method should be invoked only by EOAssociation objects to propagate changes from display objects.
     */
    public boolean setValueForObjectAtIndex(java.lang.Object value, int index, java.lang.String key){
        return false; //TODO codavaj!!
    }

    /**
     * Returns an array of EOSortOrdering objects that updateDisplayedObjects uses to sort the displayed objects, as returned by the displayedObjects method.
     */
    public com.webobjects.foundation.NSArray sortOrderings(){
        return null; //TODO codavaj!!
    }

    /**
     * Returns the receiver's undo manager.
     */
    public com.webobjects.foundation.NSUndoManager undoManager(){
        return null; //TODO codavaj!!
    }

    /**
     * Recalculates the receiver's displayed objects array and redisplays. If the receiver's delegate responds to displayGroupDisplayArrayForObjects, it is sent this message and the returned array is set as the display group's displayed objects. Otherwise, the receiver applies its qualifier and sort ordering to its array of objects. In either case, any objects that were selected before remain selected in the new displayed objects array.
     */
    public void updateDisplayedObjects(){
        return; //TODO codavaj!!
    }

    /**
     * Returns the index in the displayed objects array of the most recently updated object, or if more than one object has changed. The return value is meaningful only when contentsChanged returns true. EOAssociations can use this method to optimize redisplay of their user interface objects.
     */
    public int updatedObjectIndex(){
        return 0; //TODO codavaj!!
    }

    /**
     * Returns true if the receiver redisplays only when its displayed objects change, false if it redisplays on any change in its EOEditingContext.
     */
    public boolean usesOptimisticRefresh(){
        return false; //TODO codavaj!!
    }

    /**
     * Returns true if the receiver immediately handles validation errors, or false if it leaves errors for the EOEditingContext to handle when saving changes.
     */
    public boolean validatesChangesImmediately(){
        return false; //TODO codavaj!!
    }

    /**
     * Returns object's value for the property identified by key.
     */
    public java.lang.Object valueForObject(java.lang.Object object, java.lang.String key){
        return null; //TODO codavaj!!
    }

    /**
     * Returns the value of the object at index for the property identified by key.
     */
    public java.lang.Object valueForObjectAtIndex(int index, java.lang.String key){
        return null; //TODO codavaj!!
    }

    /**
     * Notifies observers that the receiver will change.
     */
    public void willChange(){
        return; //TODO codavaj!!
    }

    /**
     * The EODisplayGroup.Delegate interface defines methods that an EODisplayGroup can invoke in its delegate. Delegates are not required to provide implementations for all of the methods in the interface, and you don't have to use the implements keyword to specify that the object implements the Delegates interface. Instead, declare and implement any subset of the methods declared in the interface that you need, and use the EODisplayGroup method setDelegate to assign your object as the delegate. A display group can determine if the delegate doesn't implement a delegate method and only attempts to invoke the methods the delegate actually implements.
     */
    public static interface Delegate{
        /**
         * Invoked from insertNewObjectAtIndex to inform the delegate that group has failed to create a new object for dataSource. If the delegate doesn't implement this method, the EODisplayGroup instead runs an alert panel to inform the user of the failure.
         */
        abstract void displayGroupCreateObjectFailed(com.webobjects.eointerface.EODisplayGroup group, com.webobjects.eocontrol.EODataSource dataSource);

        /**
         * Informs the delegate that group 's EODataSource has changed.
         */
        abstract void displayGroupDidChangeDataSource(com.webobjects.eointerface.EODisplayGroup group);

        /**
         * Informs the delegate that group's set of selected objects has changed, regardless of whether the selection indexes have changed.
         */
        abstract void displayGroupDidChangeSelectedObjects(com.webobjects.eointerface.EODisplayGroup group);

        /**
         * Informs the delegate that group's selection has changed.
         */
        abstract void displayGroupDidChangeSelection(com.webobjects.eointerface.EODisplayGroup group);

        /**
         * Informs the delegate that group has deleted eo.
         */
        abstract void displayGroupDidDeleteObject(com.webobjects.eointerface.EODisplayGroup group, java.lang.Object eo);

        /**
         * Informs the delegate that group has fetched objects.
         */
        abstract void displayGroupDidFetchObjects(com.webobjects.eointerface.EODisplayGroup group, com.webobjects.foundation.NSArray objects);

        /**
         * Informs the delegate that group has inserted eo.
         */
        abstract void displayGroupDidInsertObject(com.webobjects.eointerface.EODisplayGroup group, java.lang.Object eo);

        /**
         * Informs the delegate that group has altered a property value of eo. The key identifies the property, and value is its new value.
         */
        abstract void displayGroupDidSetValueForObject(com.webobjects.eointerface.EODisplayGroup group, java.lang.Object value, java.lang.Object eo, java.lang.String key);

        /**
         * Invoked from updateDisplayedObjects, this method allows the delegate to filter and sort group's array of objects to limit which ones get displayed. The delegate should filter any objects that shouldn't be shown and sort the remainder, returning a new array containing this group of objects. You can use EOQualifier's filteredArrayUsingQualifier and EOSortOrdering's sortedArrayUsingKeyOrderArray methods in EOControl to create the new array. If the delegate doesn't implement this method, the EODisplayGroup uses its own qualifier and sort ordering to update its displayed objects array.
         */
        abstract com.webobjects.foundation.NSArray displayGroupDisplayArrayForObjects(com.webobjects.eointerface.EODisplayGroup group, com.webobjects.foundation.NSArray objects);

        /**
         * Allows the delegate to prevent a change in selection by group.
         */
        abstract boolean displayGroupShouldChangeSelection(com.webobjects.eointerface.EODisplayGroup group, com.webobjects.foundation.NSArray newIndexes);

        /**
         * Allows the delegate to prevent group from deleting eo.
         */
        abstract boolean displayGroupShouldDeleteObject(com.webobjects.eointerface.EODisplayGroup group, java.lang.Object eo);

        /**
         * Allows the delegate to prevent group from displaying an attention panel with title and message. The delegate can return.
         */
        abstract boolean displayGroupShouldDisplayAlert(com.webobjects.eointerface.EODisplayGroup group, java.lang.String title, java.lang.String message);

        /**
         * Allows the delegate to prevent group from fetching.
         */
        abstract boolean displayGroupShouldFetch(com.webobjects.eointerface.EODisplayGroup group);

        /**
         * Allows the delegate to prevent group from inserting anObject at index.
         */
        abstract boolean displayGroupShouldInsertObject(com.webobjects.eointerface.EODisplayGroup group, java.lang.Object eo, int index);

        /**
         * Invoked whenever group receives an ObjectsChangedInEditingContextNotification, this method allows the delegate to suppress redisplay based on the nature of the change that has occurred. If the delegate returns true, group redisplays; if it returns false, group doesn't. notification supplies the EOEditingContext that has changed, as well as which objects have changed and how. See the EOEditingContext class specification for information on ObjectsChangedInEditingContextNotification.
         */
        abstract boolean displayGroupShouldRedisplay(com.webobjects.eointerface.EODisplayGroup group, com.webobjects.foundation.NSNotification notification);

        /**
         * Invoked whenever group receives an InvalidatedAllObjectsInStoreNotification, this method allows the delegate to suppress refetching of the invalidated objects. If the delegate returns true, group immediately refetches its objects. If the delegate returns false, group doesn't immediately fetch, instead delaying until absolutely necessary. aNotification is an NSNotification. See the EOObjectStore and EOEditingContext class specifications for information on this notification.
         */
        abstract boolean displayGroupShouldRefetch(com.webobjects.eointerface.EODisplayGroup group, com.webobjects.foundation.NSNotification notification);

    }
}

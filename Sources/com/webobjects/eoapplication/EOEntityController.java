package com.webobjects.eoapplication;
/**
 * The EOEntityController class provides behavior for displaying enterprise objects in a user interface that can optionally be loaded from an interface file archive (a .nib file). EOEntityController's most basic API is specified by the interface EOObjectDisplay, which identifies an implementation strategy that uses EOEditingContexts and EODisplayGroups to manage an entity controller's enterprise objects. An entity controller has an entity name, which identifies the kind of enterprise objects the controller works with. Additionally it has an editing context that manages the controller's enterprise objects, a display group that displays the enterprise objects and manages a selection, and a controller display group that connects controller methods to the user interface.
 * EOEntityController uses an editing context to manage its enterprise objects. By default, an entity controller attempts to get its editing context from a supercontroller. An entity controller looks up the controller hierarchy for the first EOObjectDisplay supercontroller that has an editing context. If it finds one, the entity controller uses that supercontroller's editing context. If it doesn't find one, it creates a new one.
 * You can change the way an entity controller gets its editing context by specifying a so-called provider method with setEditingContextProviderMethodName. If an entity controller has an editing context provider method, it gets its editing context by invoking that method.
 * EOEntityController provides two methods you might find useful as editing context provider methods: newEditingContext and nestedEditingContext. The former simply creates a new editing context and is a convenience for setting the provider method. The latter attempts to create a new editing context that is nested inside a supercontroller's editing context. If no supercontroller can provide an editing context to be a parent, nestedEditingContext simply creates a new editing context.
 * EOEntityController uses a display group to display its enterprise objects. By default, an entity controller attempts to get its display group from a supercontroller. An entity controller looks up the controller hierarchy for the first EOObjectDisplay supercontroller. If that supercontroller has the same entity name and provides a display group, the entity controller uses that supercontroller's display group. If it doesn't find one, it invokes loadArchive to see if a display group is provided in an interface file archive. If the controller still doesn't have a display group, it simply creates a new one.
 * You can change the way an entity controller gets its display group by specifying a so-called provider method with setDisplayGroupProviderMethodName. If an entity controller has a display group provider method, it gets its display group by invoking that method.
 * EOEntityController provides two methods you might find useful as display group provider methods: newDisplayGroup and newDisplayGroupUsingOptimisticRefresh. They simply create new display groups and are convenience methods for setting the provider method.
 * Editing context and display group provider methods are specified as a String, which can be a key path or the name of an arbitrary class's static method. For an example of setting the method name to a key path, consider a subclass of EOEntityController that implements the method customizedEditingContext to return an editing context for the controller to use. In this case, the provider method name could be set to customizedEditingContext. To use a method on a supercontroller, prepend a ^, for example ^customizedEditingContext.
 * If the provider method name is the name of a static method, the format of the string is ":". For example, suppose that you've written a subclass CustomApplicationClass of EOApplication that implements a static method, customizedEditingContextForAllControllers, to return an editing context for all an application's controllers to share. Then the editing context provider method name for all entity controllers could be set to CustomApplicationClass:customizedEditingContextForAllControllers.
 */
public abstract class EOEntityController extends com.webobjects.eoapplication.EOArchiveController implements com.webobjects.eoapplication.EOObjectDisplay, com.webobjects.eoapplication.EOAssociationConnector{
    /**
     * The constant describing a the nestedEditingContext editing context provider method name.
     * See Also:Constant Field Values
     */
    public static final java.lang.String NestedEditingContextProviderMethodName="nestedEditingContext";

    /**
     * The constant describing a the newDisplayGroup display group provider method name.
     * See Also:Constant Field Values
     */
    public static final java.lang.String NewDisplayGroupProviderMethodName="newDisplayGroup";

    /**
     * The constant describing a the newDisplayGroupUsingOptimisticRefresh display group provider method name.
     * See Also:Constant Field Values
     */
    public static final java.lang.String NewDisplayGroupUsingOptimisticRefreshProviderMethodName="newDisplayGroupUsingOptimisticRefresh";

    /**
     * The constant describing a the newEditingContext editing context provider method name.
     * See Also:Constant Field Values
     */
    public static final java.lang.String NewEditingContextProviderMethodName="newEditingContext";

    /**
     * Creates a new entity controller.
     */
    public EOEntityController(){
         //TODO codavaj!!
    }

    /**
     * Creates a new entity controller from an EOXMLUnarchiver.
     * Parameters:unarchiver - the unarchiver providing XML attributes
     */
    public EOEntityController(com.webobjects.eoapplication.EOXMLUnarchiver unarchiver){
         //TODO codavaj!!
    }

    /**
     * Reacts to the connection for the receiver being broken, taking care of association disconnecting.
     */
    protected void connectionWasBroken(){
        return; //TODO codavaj!!
    }

    /**
     * Reacts to the connection for the receiver being established, taking care of association connecting and fetching if necessary.
     */
    protected void connectionWasEstablished(){
        return; //TODO codavaj!!
    }

    /**
     * Invoked from loadArchive to notify the receiver that its interface file has been loaded completely. You can override this method to perform additional initialization for the objects loaded from the interface file archive.
     */
    protected void controllerDidLoadArchive(com.webobjects.foundation.NSDictionary namedObjects){
        return; //TODO codavaj!!
    }

    /**
     * Invoked from loadArchive to notify the receiver that its interface file is about to be loaded. You can override this method to perform additional preparation for the archive loading process.
     */
    protected void controllerWillLoadArchive(){
        return; //TODO codavaj!!
    }

    /**
     * Conformance to EOObjectDisplay. Returns the display group used by this controller. If the display group has so far not been set, attempts to retrieve one from a supercontroller which uses the same entity or creates a new one if no supercontroller can provide one.
     */
    public com.webobjects.eointerface.EODisplayGroup displayGroup(){
        return null; //TODO codavaj!!
    }

    /**
     * Returns the key path which is used to retrieve the display group for the reveiver. If no provider method name is explicitly specified, the default mechanism is used (which means that the controller attempts to use the display group of an supercontroller or simply creates a new one if no supercontroller can provide a display group). EOEntityController provides two useful methods you can use for the editing context provider method name: newDisplayGroup and newDisplayGroupUsingOptimisticRefresh.
     */
    public java.lang.String displayGroupProviderMethodName(){
        return null; //TODO codavaj!!
    }

    /**
     * Returns the sort orderings to be used with the receiver's display group. EOEntityController's default implementation returns null. Note that the display group sort orderings might be overridden by table associations unless they are configured to not change the display group sort orderings.
     */
    protected com.webobjects.foundation.NSArray displayGroupSortOrderings(){
        return null; //TODO codavaj!!
    }

    /**
     * Prepares the receiver so it is disposed when Java performs garbage collection.
     */
    public void dispose(){
        return; //TODO codavaj!!
    }

    /**
     * Conformance to EOObjectDisplay. Returns the editing context used by this controller. If the editing context has so far not been set, attempts to retrieve one from a supercontroller or creates a new one if no supercontroller can provide one.
     */
    public com.webobjects.eocontrol.EOEditingContext editingContext(){
        return null; //TODO codavaj!!
    }

    /**
     * Returns the key path which is used to retrieve the editing context for the reveiver. If no provider method name is explicitly specified, the default mechanism is used (which means that the controller attempts to use the editing context of an supercontroller or simply creates a new one if no supercontroller can provide an editing context). EOEntityController provides two useful methods you can use for the editing context provider method name: newEditingContext and nestedEditingContext.
     */
    public java.lang.String editingContextProviderMethodName(){
        return null; //TODO codavaj!!
    }

    /**
     * Ensures that all editors of the receiver's display groups end editing (flush current user edits to the enterprise object graph if necessary). This method is invoked automatically before saving or reverting changes in subclasses.
     */
    public boolean endEditing(){
        return false; //TODO codavaj!!
    }

    /**
     * Description copied from interface:
     * Returns the name of the entity of the enterprise objects displayed in the receiver's display group.
     */
    public java.lang.String entityName(){
        return null; //TODO codavaj!!
    }

    /**
     * Overridden from the superclass to ensure that, if an archive name is specified for the receiver, the interface file archive is loaded before the connection is established.
     */
    public void establishConnection(){
        return; //TODO codavaj!!
    }

    /**
     * Returns whether the receiver should fetch its display group content next time its connection is established. This value changes often: Whenever an entity controller prepares for a new task, it sets this flag to true. Once it retrieves objects explicitly (for example from a global ID) or actually performs the fetch while connecting, it sets this flag to false.
     */
    public boolean fetchesOnConnect(){
        return false; //TODO codavaj!!
    }

    /**
     * When starting to listen to an editing context, entity controllers register for several notifications from the editing context. Whenever one of these notifications is posted, this method is invoked and allows the controller to react to the editing context changes.
     */
    public void handleEditingContextNotification(com.webobjects.foundation.NSNotification notification){
        return; //TODO codavaj!!
    }

    /**
     * Returns whether the receiver should ever fetch its display group content when a connection is established.
     */
    public boolean isFetchesOnConnectEnabled(){
        return false; //TODO codavaj!!
    }

    /**
     * Returns whether the receiver is a root entity controller (which is the case if none of the supercontrollers conform to EOObjectDisplay).
     */
    public boolean isRootEntityController(){
        return false; //TODO codavaj!!
    }

    /**
     * Creates a new, nested editing context to the editing context from its closest supercontroller conforming to the EOObjectDisplay interface and returning an editing context. If no supercontroller can provide a parent editing context, creates a new one with the default parent object store. This method can be used as editing context provider method.
     */
    public com.webobjects.eocontrol.EOEditingContext nestedEditingContext(){
        return null; //TODO codavaj!!
    }

    /**
     * Creates and returns a new data source to be used with a display group of the receiver. EOEntityController's default implementation creates a new EODistributedDataSource for the entity specified by entityName.
     */
    protected com.webobjects.eocontrol.EODataSource newDataSource(){
        return null; //TODO codavaj!!
    }

    /**
     * Creates a new display group using a data source provided by newDataSource. This method can be used as display group provider method.
     */
    public com.webobjects.eointerface.EODisplayGroup newDisplayGroup(){
        return null; //TODO codavaj!!
    }

    /**
     * Creates a new display group using a data source provided by newDataSource, configured to not use optimistic refresh. This method can be used as display group provider method.
     */
    public com.webobjects.eointerface.EODisplayGroup newDisplayGroupUsingOptimisticRefresh(){
        return null; //TODO codavaj!!
    }

    /**
     * Creates a new editing context with the default parent object store. This method can be used as editing context provider method.
     */
    public com.webobjects.eocontrol.EOEditingContext newEditingContext(){
        return null; //TODO codavaj!!
    }

    /**
     * Returns an object for an outlet path to be substituted in an interface file archive loaded by the receiver. This methods allows you to substitute objects for all objects that can be reached through an outlet connection from the file's owner, for example the editingContext of the receiver (which is the file's owner of the archive) or displayGroup.dataSource. If no substitution object is needed, this method returns null.
     */
    public java.lang.Object objectForOutletPath(com.webobjects.eoapplication.EOArchive archive, java.lang.String outletPath){
        return null; //TODO codavaj!!
    }

    /**
     * Prepares the receiver for performing a new task by resetting any data and refetching objects if necessary.
     */
    public void prepareForNewTask(boolean prepareSubcontrollersForNewTask){
        return; //TODO codavaj!!
    }

    /**
     * Returns whether the receiver should reset its editing context when preparing for a new task in prepareForNewTask(boolean). The default is true.
     */
    public boolean resetsEditingContextWhenPreparingForNewTask(){
        return false; //TODO codavaj!!
    }

    /**
     * Returns the first enterprise object selected in the receiver's display group.
     */
    public com.webobjects.eocontrol.EOEnterpriseObject selectedObject(){
        return null; //TODO codavaj!!
    }

    /**
     * Returns the global ID of the first enterprise object selected in the receiver's display group.
     */
    public com.webobjects.eocontrol.EOGlobalID selectedObjectGlobalID(){
        return null; //TODO codavaj!!
    }

    /**
     * Returns the enterprise objects selected in the receiver's display group.
     */
    public com.webobjects.foundation.NSArray selectedObjects(){
        return null; //TODO codavaj!!
    }

    /**
     * Returns the global IDs of the enterprise objects selected in the receiver's display group.
     */
    public com.webobjects.foundation.NSArray selectedObjectsGlobalIDs(){
        return null; //TODO codavaj!!
    }

    /**
     * Sets the display group used by this controller. If the controller used a different display group before, it invokes stopListeningToDisplayGroup first. After setting the new display group, it invokes startListeningToDisplayGroup.
     */
    public void setDisplayGroup(com.webobjects.eointerface.EODisplayGroup displayGroup){
        return; //TODO codavaj!!
    }

    /**
     * Sets the provider method which is used to retrieve the display group for the reveiver. EOEntityController provides two useful methods you can use for the editing context provider method name: newDisplayGroup and newDisplayGroupUsingOptimisticRefresh. See the EOEntityController class description for how to specify a provider method.
     */
    public void setDisplayGroupProviderMethodName(java.lang.String string){
        return; //TODO codavaj!!
    }

    /**
     * Sets the editing context used by this controller. If the controller used a different editing context before, it invokes stopListeningToEditingContext first. After setting the new editing context, it invokes startListeningToEditingContext.
     */
    public void setEditingContext(com.webobjects.eocontrol.EOEditingContext editingContext){
        return; //TODO codavaj!!
    }

    /**
     * Sets the provider method which is used to retrieve the editing context for the reveiver. EOEntityController provides two useful methods you can use for the editing context provider method name: newEditingContext and nestedEditingContext. See the EOEntityController class description for how to specify a provider method.
     */
    public void setEditingContextProviderMethodName(java.lang.String string){
        return; //TODO codavaj!!
    }

    /**
     * Sets the entity name of the enterprise objects displayed by the receiver.
     */
    public void setEntityName(java.lang.String string){
        return; //TODO codavaj!!
    }

    /**
     * Sets whether the receiver should fetch its display group content next time its connection is established. This value changes often: Whenever an entity controller prepares for a new task, it sets this flag to true. Once it retrieves objects explicitly (for example from a global ID) or actually performs the fetch while connecting, it sets this flag to false.
     */
    public void setFetchesOnConnect(boolean flag){
        return; //TODO codavaj!!
    }

    /**
     * Sets whether the receiver should ever fetch its display group content when a connection is established.
     */
    public void setFetchesOnConnectEnabled(boolean flag){
        return; //TODO codavaj!!
    }

    /**
     * Fetches the objects specified by fetchSpecification into the receiver's display group.
     */
    public void setObjectsWithFetchSpecification(com.webobjects.eocontrol.EOFetchSpecification fetchSpecification){
        return; //TODO codavaj!!
    }

    /**
     * Fetches the objects specified by the global IDs in globalIDs into the receiver's display group.
     */
    public void setObjectsWithGlobalIDs(com.webobjects.foundation.NSArray globalIDs){
        return; //TODO codavaj!!
    }

    /**
     * Fetches the object specified by the global ID globalID into the receiver's display group.
     */
    public void setObjectWithGlobalID(com.webobjects.eocontrol.EOGlobalID globalID){
        return; //TODO codavaj!!
    }

    /**
     * Sets whether the receiver should reset its editing context when preparing for a new task in prepareForNewTask(boolean). The default is true.
     */
    public void setResetsEditingContextWhenPreparingForNewTask(boolean flag){
        return; //TODO codavaj!!
    }

    /**
     * Invoked from setDisplayGroup whenever a new display group is specified, giving the receiver a chance to react. EOEntityController's default implementation registers itself as observer for the display group in the EOObserverCenter. When this method is invoked, displayGroup already returns the new display group of the controller.
     */
    protected void startListeningToDisplayGroup(){
        return; //TODO codavaj!!
    }

    /**
     * Invoked from setEditingContext whenever a new editing context is specified, giving the receiver a chance to react. EOEntityController's default implementation registers for its handleEditingContextNotification method as receiver for the notifications EOEditingContext.ObjectsChangedInEditingContextNotification and EOEditingContext.EditingContextDidSaveChangesNotification. When this method is invoked, editingContext already returns the new editing context of the controller.
     */
    protected void startListeningToEditingContext(){
        return; //TODO codavaj!!
    }

    /**
     * Invoked from setDisplayGroup whenever a display group is cleared out (if either a new display group is specified or if the display group is reset to null), giving the receiver a chance to react. EOEntityController's default implementation unregisters itself as observer from the display group (as registered in startListeningToDisplayGroup). When this method is invoked, displayGroup still returns the old display group of the controller.
     */
    protected void stopListeningToDisplayGroup(){
        return; //TODO codavaj!!
    }

    /**
     * Invoked from setEditingContext whenever an editing context is cleared out (if either a new editing context is specified or if the editing context is reset to null), giving the receiver a chance to react. EOEntityController's default implementation unregisters the notficiations registered in startListeningToEditingContext. When this method is invoked, editingContext still returns the old editing context of the controller.
     */
    protected void stopListeningToEditingContext(){
        return; //TODO codavaj!!
    }

    /**
     * Description copied from interface:
     * Invoked when one of the receiver's subcontrollers is disposed as a transient controller. Instructs the receiver to assume responsibility for managing the subcontroller's EOAssociation, association.
     */
    public void takeResposibilityForConnectionOfAssociation(com.webobjects.eointerface.EOAssociation association){
        return; //TODO codavaj!!
    }

    /**
     * Returns the receiver as a string describing the state of the controller.
     */
    public java.lang.String toString(){
        return null; //TODO codavaj!!
    }

}

package com.webobjects.eoapplication;
/**
 * The EOController class defines basic behavior for controller objects that are responsible for managing and sometimes generating the user interface for the client side of a Java Client application. An application's controllers are arranged in a hierarchy which describes the complete functionality of an application.
 * The controller hierarchy mirrors the hierarchy of windows and widgets that make up the client application's user interface. The root of the hierarchy is an EOApplication object. The EOApplication's subcontrollers are usually window or applet controllers, which themselves have subcontrollers.
 * The most significant functionality provided by the EOController class is managing the controller hierarchy (building, connecting, and traversing the hierarchy) and handling actions.
 * All controller classes need to implement the no-argument constructor. In addition, if they may be instantiated from an XML description, they need to implement a constructor taking a single EOXMLUnarchiver argument. The no-argument constructor is used for all programmatic creation of controllers.
 * Controllers should avoid complex initialization procedures in the constructor. Instead they should attempt to create all the objects they need to perform their task lazily, only when they are needed. Controllers are usually used in various types of situations and there is no guarantee that they are ever used, even if they are in the controller hierarchy. For example the user interface managed by a controller might be placed in a tab view and never be activated by the user. By creating objects and user interfaces lazily, the response time of average applications gets much better.
 * EOController defines numerous methods for traversing the controller hierarchy, but a single method provides the basic traversal functionality. The method controllerEnumeration creates and returns an enumeration that includes all the subcontrollers of a controller (not including the controller), all the supercontrollers of a controller (not including the controller), or a controller and its subcontrollers. You can further restrict the controllers included in an enumeration by specifying an interface the controllers must implement in order to be included. For more information, see the EOController.Enumeration interface specification and the method description for controllerEnumeration.
 * Other methods that traverse the controller hierarchy use a controller enumeration to perform the traversal. There are methods that return controllers in an enumeration that match one or more key-value pairs and methods that use key-value coding on the controllers in an enumeration, returning the first controller that has a specified key or returning the value for that key. Also, there's a method invokeMethod that invokes a particular method on the controllers in an enumeration.
 * A controller in the controller hierarchy can be connected to its supercontroller or not. Controllers are connected when they're performing their duties, and they are disconnected when they become idle. Generally controllers are connected only when their user interface is visible. For example, the controllers associated with a window are connected when the window is visible, and they're disconnected when the window becomes invisible.
 * When a controller connects to its supercontroller, it gets from its supercontroller whatever resources or information it needs, and it prepares itself in whatever way necessary to perform its duties (for example, setting delegates). Similarly, when a controller breaks its connection to its supercontroller, it cleans up its resources for an idle period.
 * The EOController class defines methods for connecting controllers. There are methods for connecting and disconnecting a controller from its supercontroller (establishConnection and breakConnection), and also methods that make connections all the way up the controller hierarchy (establishConnectionToSupercontrollers) and break connections all the way down (breakConnectionToSubcontrollers). Generally you use the latter methods that connect or disconnect an entire branch of a tree. EOController's implementations of all these methods is generally sufficient for subclasses. They set the connection status of a controller (setConnected), and notify the controller that its connection has been established or broken. You shouldn't have to override these methods.
 * If you do need to do something when a controller is connected or disconnected, you should override the methods connectionWasEstablished and connectionWasBroken. These methods are invoked automatically by establishConnection and breakConnection.
 * Controllers define actions that users can perform (such as quitting the application or saving a document) and they know how to respond to those actions when they're performed. EOController defines methods that manage a controllers actions.
 * A controller has a set of actions. It also keeps track of which of those actions are enabled and which are disabled. For performance reasons, EOController's method implementations cache some of this information. Thus, whenever you do something that changes a controller's actions (such as adding a new subcontroller or enabling or disabling an action), the caches must be reset. Most of the time they're reset automatically, but subclasses might need to explicitly reset them with the method resetActions.
 * To specify the actions a subclass understands, override the method defaultActions. However, to find out what actions a controller understands, use actions. This method simply manages and returns a cache of the methods returned by defaultActions. Some implementations of a defaultActions method are potentially costly to invoke over and over again, because they dynamically build their collections of actions. The actions method is simply an optimization. EOController's implementation of actions should be sufficient for subclasses; you should never need to override it.
 * To find out what actions a controller can perform at a specific point in time, use the method enabledActions. This method returns only the controller's actions that aren't explicitly disabled. As with actions, enabledActions manages and returns a cache of methods, and EOController's implemenation should be sufficient for subclasses.
 * Some controllers are needed only to dynamically generate the user interface and don't serve any purpose after the user interface has been created and connected. For example, an EOTextFieldController creates a widget and a corresponding association and then is no longer needed. Controllers such as EOTextFieldController can be transient, because after their work is done, they can usually be removed from the controller hierarchy and disposed of (with disposeIfTransient). This keeps the controller hierarchy simple, which makes user interface management more efficient.
 * Controllers specify whether or not they can be transient by overriding the method canBeTransient. Some controllers can be transient sometimes and not other times, so not all implementations simply return true or false. For example, an EOTableController can be transient if the double click action is unassigned. If the action is assigned, however, the controller must listen for a double click and react when one occurs.
 * Subclasses that can be transient should invoke the method disposeIfTransient as soon as their work is done and they can be disposed of. Sometimes a controller's supercontroller doesn't allow the controller to be disposed of. For example, the EOTabSwitchComponent doesn't allow its subcontrollers to become transient.
 */
public abstract class EOController implements com.webobjects.foundation.NSDisposable, com.webobjects.foundation.NSKeyValueCoding, com.webobjects.foundation.NSKeyValueCoding.ErrorHandling, com.webobjects.foundation.NSKeyValueCodingAdditions, com.webobjects.eoapplication.EOAction.Enabling{
    /**
     * The constant describing enumerations that enumerate over a controller and its subcontrollers.
     * See Also:Constant Field Values
     */
    public static final int ControllerAndSubcontrollersEnumeration=0;

    /**
     * The constant describing enumerations that enumerate over a controller's supercontrollers, not including the controller itself.
     * See Also:Constant Field Values
     */
    public static final int ControllerAndSupercontrollersEnumeration=3;

    /**
     * The constant describing enumerations that enumerate over a controller's subcontrollers, not including the controller itself.
     * See Also:Constant Field Values
     */
    public static final int SubcontrollersEnumeration=1;

    /**
     * The constant describing enumerations that enumerate over a controller's supercontrollers, not including the controller itself.
     * See Also:Constant Field Values
     */
    public static final int SupercontrollersEnumeration=2;

    /**
     * Creates a new controller. The no-argument constructor is used when you create a controller programmatically, whereas the version taking an EOXMLUnarchiver argument is used in Direct to Java Client applications to create controllers from an XML description. Controller subclasses should implement both constructors. Most commonly, controllers are created with the assistance of an unarchiver.
     */
    public EOController(){
         //TODO codavaj!!
    }

    /**
     * Creates a new controller. The constructor taking an EOXMLUnarchiver argument is used when you create a controller from an XML description (in Direct to Java Client), whereas the version taking no arguments is used to create controllers programmatically. Controller subclasses should implement both constructors.
     * Parameters:unarchiver - the unarchiver providing XML attributes
     */
    public EOController(com.webobjects.eoapplication.EOXMLUnarchiver unarchiver){
         //TODO codavaj!!
    }

    /**
     * Returns an array of action method names the controller defines and responds to.
     */
    public com.webobjects.foundation.NSArray actionNames(){
        return null; //TODO codavaj!!
    }

    /**
     * Returns a cached array containing the receiver's actions. EOController's implementation caches the result of defaultActions and returns that. The cache is cleared with the method resetActions.
     */
    public com.webobjects.foundation.NSArray actions(){
        return null; //TODO codavaj!!
    }

    /**
     * If the receiver has an action for a method with name actionName, this method returns that action; otherwise, the method returns null.
     */
    public com.webobjects.eoapplication.EOAction actionWithName(java.lang.String actionName){
        return null; //TODO codavaj!!
    }

    /**
     * Returns actions to be added to the controllers default actions.
     */
    public com.webobjects.foundation.NSArray additionalActions(){
        return null; //TODO codavaj!!
    }

    /**
     * Returns an NSDictionary of additional key-value pairs used by handleQueryWithUnboundKey().
     */
    public com.webobjects.foundation.NSDictionary additionalKeyValuePairs(){
        return null; //TODO codavaj!!
    }

    /**
     * Adds controller as a subcontroller of the receiver and sets the receiver as controller's supercontroller - first removing controller from its supercontroller if it already has one. Invoke this method to add a subcontroller to the hierarchy.
     * EOController's implementation sets subcontroller's supercontroller and notifies the receiver that a subcontroller was added. It does nothing if the receiver is already a supercontroller of controller. The default implementation of this method should be sufficient for most subclasses; you shouldn't have to override it. If you need to do something special when a subcontroller is added, override subcontrollerWasAdded.
     */
    public void addSubcontroller(com.webobjects.eoapplication.EOController controller){
        return; //TODO codavaj!!
    }

    /**
     * Breaks the receiver's connection to its supercontroller. Invokes connectionWasBroken to give the receiver a chance to clean up, and informs all its supercontrolllers that a subcontroller's connection status has changed so the supercontrolllers can react appropriately. Use this method to programmatically disconnect a single controller (and not its supercontrollers). EOController's implementation is sufficient for most subclasses, so you don't ordinarily override this method.
     */
    public void breakConnection(){
        return; //TODO codavaj!!
    }

    /**
     * Breaks the connections the receiver's subcontrollers have to their subcontrollers, and then breaks the receiver's connections to its subcontrollers. This method is invoked recursively down the subcontroller hierarchy until the receiver and all its subcontrollers are disconnected. Use this method to programmatically disconnect a branch of the controller hierarchy from a particular controller down. EOController's implementation is sufficient for most subclasses, so you don't ordinarily override this method.
     */
    public void breakConnectionToSubcontrollers(){
        return; //TODO codavaj!!
    }

    /**
     * Conformance to NSKeyValueCoding. Returns whether the receiving class and its subclasses access instance variables directly for key-value coding. By default, EOControllers don't access instance variables directly and return false.
     */
    public static boolean canAccessFieldsDirectly(){
        return false; //TODO codavaj!!
    }

    /**
     * Returns whether the controller can be transient. EOController's implementation simply returns false.
     */
    public boolean canBeTransient(){
        return false; //TODO codavaj!!
    }

    /**
     * Description copied from interface:
     * Returns true if the receiver can perform the action method (sent by an EOAction object) named actionName, false otherwise. An EOController's implementation of this method generally returns false if the receiver doesn't have an action named actionName or if the actionName action is explicitly disabled.
     */
    public boolean canPerformActionNamed(java.lang.String actionName){
        return false; //TODO codavaj!!
    }

    /**
     * Invoked from breakConnection to notify the receiver that its connection to its supercontroller has been broken, giving the receiver the opportunity to clean up after its become idle.
     */
    protected void connectionWasBroken(){
        return; //TODO codavaj!!
    }

    /**
     * Invoked from establishConnection to notify the receiver that its connection to the controller hierarchy has been established, giving the receiver the opportunity to prepare itself (for example, setting delegates).
     */
    protected void connectionWasEstablished(){
        return; //TODO codavaj!!
    }

    /**
     * Returns an EOController.Enumeration object you can use to traverse the controller hierarchy. enumerationType determines how to traverse the hiearchy. The enumeration will only contain controllers implementing the interface controllerInterface. If controllerInterface is null, the enumeration will contain all controllers for the specified enumeration type.
     */
    public com.webobjects.eoapplication.EOController.Enumeration controllerEnumeration(int enumerationType, java.lang.Class controllerInterface){
        return null; //TODO codavaj!!
    }

    /**
     * Returns all the controllers in an enumeration as an array.
     */
    public com.webobjects.foundation.NSArray controllersInEnumeration(int enumerationType, java.lang.Class controllerInterface){
        return null; //TODO codavaj!!
    }

    /**
     * Traverses the controller hierarchy, and returns all controllers in the hierarchy whose value for key matches value. This method uses a controller enumeration specified by enumerationType and controllerInterface to find the controllers. The method tests the controllers returned by the enumeration for a match and returns all the ones which match the key-value pair. Matches are determined with the method valueForKeyPath.
     */
    public com.webobjects.foundation.NSArray controllersWithKeyValuePair(int enumerationType, java.lang.Class controllerInterface, java.lang.String key, java.lang.Object value){
        return null; //TODO codavaj!!
    }

    /**
     * Traverses the controller hierarchy, and returns all controllers in the hierarchy which match all key/value pairs in keyValuePairs. This method uses a controller enumeration specified by enumerationType and controllerInterface to find the controllers. The method tests the controllers returned by the enumeration for a match and returns all the ones which match the key-value pairs. Matches are determined with the method valueForKeyPath.
     */
    public com.webobjects.foundation.NSArray controllersWithKeyValuePairs(int enumerationType, java.lang.Class controllerInterface, com.webobjects.foundation.NSDictionary keyValuePairs){
        return null; //TODO codavaj!!
    }

    /**
     * Traverses the controller hierarchy, and returns the first controller in the hierarchy whose value for key matches value. This method uses a controller enumeration specified by enumerationType and controllerInterface to find the controller. The method tests the controllers returned by the enumeration for a match and returns the first one that matches. Matches are determined with the method valueForKeyPath.
     */
    public com.webobjects.eoapplication.EOController controllerWithKeyValuePair(int enumerationType, java.lang.Class controllerInterface, java.lang.String key, java.lang.Object value){
        return null; //TODO codavaj!!
    }

    /**
     * Traverses the controller hierarchy, and returns the first controller in the hierarchy which matches all key-value pairs in keyValuePairs. This method uses a controller enumeration specified by enumerationType and controllerInterface to find the controller. The method tests the controllers returned by the enumeration for a match and returns the first one that matches. Matches are determined with the method valueForKeyPath.
     */
    public com.webobjects.eoapplication.EOController controllerWithKeyValuePairs(int enumerationType, java.lang.Class controllerInterface, com.webobjects.foundation.NSDictionary keyValuePairs){
        return null; //TODO codavaj!!
    }

    /**
     * Returns an array of the receiver's default actions (EOAction objects). A subclass of EOController should override this method to return the actions it defines merged with the actions of its superclass. Never invoke this method directly. Instead, invoke actions, which caches the results of defaultActions and is therefore more efficient.
     */
    protected com.webobjects.foundation.NSArray defaultActions(){
        return null; //TODO codavaj!!
    }

    /**
     * Explicitly disables the action method actionName and resets the receiver's actions.
     */
    public void disableActionNamed(java.lang.String actionName){
        return; //TODO codavaj!!
    }

    /**
     * Returns the receiver's disposable registry. This registry contains objects that will be disposed of together with the receiver. Subclasses can use the registry to register objects that should be disposed when their controller is disposed.
     */
    public com.webobjects.foundation.NSDisposableRegistry disposableRegistry(){
        return null; //TODO codavaj!!
    }

    /**
     * Prepares the receiver so it is disposed when Java performs garbage collection.
     */
    public void dispose(){
        return; //TODO codavaj!!
    }

    /**
     * Disposes the receiver if it's transient, first removing it from its supercontroller with removeTransientSubcontroller If the receiver's supercontroller is non-null, this method also attempts to dispose of the supercontroller if it's transient. Supercontrollers can prevent a controller from becoming transient, in which case this method returns false. Subclasses should first invoke the super implementation and only continue disposing if the super implementation returns true.
     */
    protected boolean disposeIfTransient(){
        return false; //TODO codavaj!!
    }

    /**
     * Enables the action method actionName and resets the receiver's actions.
     */
    public void enableActionNamed(java.lang.String actionName){
        return; //TODO codavaj!!
    }

    /**
     * Returns an array of the receiver's actions which are not explicitly disabled. This method caches the enabled actions to enhance performance. The cache is cleared with the method resetActions.
     */
    public com.webobjects.foundation.NSArray enabledActions(){
        return null; //TODO codavaj!!
    }

    /**
     * Connects the receiver to the controller hierarchy. Invokes connectionWasEstablished to give the receiver a chance to prepare the user interface. After connecting the receiver, this method disposes of it if it's transient and is therefore no longer needed. Use this method to connect a single controller (and not its supercontrollers). EOController's implementation is sufficient for most subclasses, so you don't ordinarily override this method.
     */
    public void establishConnection(){
        return; //TODO codavaj!!
    }

    /**
     * Connects the receiver's supercontroller to the controller hierarchy, and then establishes the receiver's connection to the controller hierarchy. This method is invoked recursively up the supercontroller chain until the receiver and all its supercontrollers are connected. Use this method to programmatically prepare a branch of the controller hierarchy from a controller up to the root controller. EOController's implementation is sufficient for most subclasses, so you don't ordinarily override this method.
     */
    public void establishConnectionToSupercontrollers(){
        return; //TODO codavaj!!
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
     * Starting at the receiver, searches up the controller hierarchy for the first controller that implements the interface controllerInterface and has a non-null value for key and returns that controller. If controllerInterface is null, tests all controllers.
     */
    public com.webobjects.eoapplication.EOController hierarchicalControllerForKey(java.lang.Class controllerInterface, java.lang.String key){
        return null; //TODO codavaj!!
    }

    /**
     * Starting at the receiver, searches up the controller hierarchy for the first controller that implements the interface controllerInterface and has a non-null value for key and returns that value. If controllerInterface is null, tests all controllers.
     */
    public java.lang.Object hierarchicalValueForKey(java.lang.Class controllerInterface, java.lang.String key){
        return null; //TODO codavaj!!
    }

    /**
     * Traverses the controller hierarchy, invoking the method specified by methodName and parameterTypes on the appropriate controllers. Uses a controller enumeration specified by enumerationType and controllerInterface to find the controllers on which to invoke the specified method. For each controller in the enumeration, this method invokes the method methodName with the values in parameters as arguments.
     */
    public void invokeMethod(int enumerationType, java.lang.Class controllerInterface, java.lang.String methodName, java.lang.Class[] parameterTypes, java.lang.Object[] parameters){
        return; //TODO codavaj!!
    }

    /**
     * Returns whether the action method actionName isn't explicitly disabled.
     */
    public boolean isActionNamedEnabled(java.lang.String actionName){
        return false; //TODO codavaj!!
    }

    /**
     * Returns whether controller is a subcontroller of the receiver, of the receiver's subcontrollers, or their subcontrollers, and so on.
     */
    public boolean isAncestorOfController(com.webobjects.eoapplication.EOController controller){
        return false; //TODO codavaj!!
    }

    /**
     * Returns the receiver's connection status.
     */
    public boolean isConnected(){
        return false; //TODO codavaj!!
    }

    /**
     * Returns whether controller is a direct subcontroller of the receiver.
     */
    public boolean isSupercontrollerOfController(com.webobjects.eoapplication.EOController controller){
        return false; //TODO codavaj!!
    }

    /**
     * Returns whether transience is explicitly forbidden for this controller.
     */
    protected boolean isTransientExplicitlyForbidden(){
        return false; //TODO codavaj!!
    }

    /**
     * Prepares the receiver for performing a new task by resetting any data. If prepareSubcontrollersForNewTask is true, this method also sends prepareForNewTask to each of the receiver's subcontrollers. This method is usually invoked to prepare a branch of the controller for reuse. Subclasses should override this method to get rid of data and perform any additional clean up.
     */
    public void prepareForNewTask(boolean prepareSubcontrollersForNewTask){
        return; //TODO codavaj!!
    }

    /**
     * Removes the receiver from its supercontroller's set of subcontrollers. Invoke this method when you need to remove a controller from the controller hierarchy. EOController's implementation simply invokes removeSubcontroller on the receiver's supercontroller. This method is mostly a convenience so you don't have to look up a controller's supercontroller. The default implementation should be sufficient for subclasses; you shouldn't have to override it.
     */
    public void removeFromSupercontroller(){
        return; //TODO codavaj!!
    }

    /**
     * Removes controller from the controller hierarchy. EOController's implementation disconnects controller from the controller hierarchy, and invokes subcontrollerWasRemoved on the receiver to give it a chance to react appropriately.
     * Never invoke this method directly; use removeFromSupercontroller instead. The default implementation should be sufficient for subclasses; you shouldn't have to override it. If you need to do something when a subcontroller is removed, override subcontrollerWasRemoved.
     */
    protected void removeSubcontroller(com.webobjects.eoapplication.EOController controller){
        return; //TODO codavaj!!
    }

    /**
     * Removes controller from the controller hierarchy if controller can be transient and if the receiver allows it. Returns whether the controller can be removed. This method is invoked from disposeIfTransient, which is invoked in various situations to remove controllers as soon as they can become transient.
     */
    protected boolean removeTransientSubcontroller(com.webobjects.eoapplication.EOController controller){
        return false; //TODO codavaj!!
    }

    /**
     * Destroys the receiver's cache of actions and enabled actions, and destroys the action caches of the receiver's supercontrollers. This method is generally invoked automatically when the receiver's set of actions changes or when an action's enabled state is changed, but you can invoke it yourself to clear the caches as needed. EOController's implementation of this method is sufficient for most subclasses. You shouldn't have to override it.
     */
    public void resetActions(){
        return; //TODO codavaj!!
    }

    /**
     * Sets actions to be added to the controllers default actions.
     */
    public void setAdditionalActions(com.webobjects.foundation.NSArray additionalActions){
        return; //TODO codavaj!!
    }

    /**
     * Adds value to the dictionary of additionalKeyValuePairs with key.
     */
    public void setAdditionalKeyValuePair(java.lang.Object value, java.lang.String key){
        return; //TODO codavaj!!
    }

    /**
     * Sets NSDictionary, dictionary, of key-value pairs for use in handleQueryWithUnboundKey()
     */
    public void setAdditionalKeyValuePairs(com.webobjects.foundation.NSDictionary dictionary){
        return; //TODO codavaj!!
    }

    /**
     * Sets the receiver's connection status. EOController's implementation is sufficient for most subclasses; you don't normally override this method. Nor should you ever need to invoke it; establishConnection and breakConnection set the controller's connection status automatically.
     */
    protected void setConnected(boolean flag){
        return; //TODO codavaj!!
    }

    /**
     * Sets the receiver's supercontroller to controller and resets the receiver's actions. Returns whether the supercontroller accepted the receiver as subcontroller. Also, controller can be null to unset the receiver's supercontroller. EOController's implementation is sufficient for most subclasses; you don't normally override this method. Nor should you ever need to invoke it; addSubcontroller sets the supercontroller automatically.
     */
    protected boolean setSupercontroller(com.webobjects.eoapplication.EOController controller){
        return false; //TODO codavaj!!
    }

    /**
     * Sets whether transience is explicitly forbidden for this controller.
     */
    protected void setTransientExplicitlyForbidden(boolean flag){
        return; //TODO codavaj!!
    }

    /**
     * Sets the receiver's type name.
     */
    public void setTypeName(java.lang.String typeName){
        return; //TODO codavaj!!
    }

    /**
     * Returns the receiver's direct subcontrollers. Use controllerEnumeration or controllersInEnumeration to return all the controllers in the hierarchy under the receiver.
     */
    public com.webobjects.foundation.NSArray subcontrollers(){
        return null; //TODO codavaj!!
    }

    /**
     * Invoked from addSubcontroller to notify the receiver that a subcontroller has been added to the controller hierarchy, giving the receiver the opportunity to prepare the subcontroller for use.
     */
    protected void subcontrollerWasAdded(com.webobjects.eoapplication.EOController controller){
        return; //TODO codavaj!!
    }

    /**
     * Invoked from removeSubcontroller to notify the receiver that a subcontroller has been removed from the controller hierarchy, giving the receiver the opportunity to perform any necessary clean up.
     */
    protected void subcontrollerWasRemoved(com.webobjects.eoapplication.EOController controller){
        return; //TODO codavaj!!
    }

    /**
     * Returns the receiver's supercontroller, or null if the receiver has no supercontroller.
     */
    public com.webobjects.eoapplication.EOController supercontroller(){
        return null; //TODO codavaj!!
    }

    /**
     * Searching from the receiver's direct supercontroller, returns the first supercontroller that implements the interface controllerInterface. Returns null if the receiver has no supercontroller or if none of the supercontrollers implement the interface. Returns receiver's direct supercontroller if controllerInterface is null.
     */
    public com.webobjects.eoapplication.EOController supercontroller(java.lang.Class controllerInterface){
        return null; //TODO codavaj!!
    }

    /**
     * Conformance to NSKeyValueCoding. See the method description of takeValueForKey in the interface specification for NSKeyValueCoding.
     */
    public void takeValueForKey(java.lang.Object value, java.lang.String key){
        return; //TODO codavaj!!
    }

    /**
     * Description copied from interface:
     * Sets the value for the property identified by keyPath to value. A key path has the form relationship.property (with one or more relationships); for example "movieRole.roleName" or "movieRole.talent.lastName". The default implementation of this method (provided by NSKeyValueCodingAdditions.DefaultImplementation) gets the destination object for each relationship using valueForKey, and sends the final object a takeValueForKey message with value and property.
     */
    public void takeValueForKeyPath(java.lang.Object value, java.lang.String keyPath){
        return; //TODO codavaj!!
    }

    /**
     * Returns the receiver as a string that states the receiver's class name and type name, whether the receiver is connected, and the number of subcontrollers.
     */
    public java.lang.String toString(){
        return null; //TODO codavaj!!
    }

    /**
     * Returns the receiver's type name a string that uniquely identifies the receiver as a node in the controller hierarchy. EOController's implementation returns null. The type name is used to identify controllers that have the same task. It is used to configure a controller with user defaults and also to reuse controllers when possible.
     */
    public java.lang.String typeName(){
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
     * Description copied from interface:
     * Retrieves the value of a property of the object at the end of the key path (a key path is a string of the form "key1.key2"). A key path has the form relationship.property (with one or more relationships); for example "movieRole.roleName" or "movieRole.talent.lastName". The default implementation of this method (provided by NSKeyValueCodingAdditions.DefaultImplementation) gets the destination object for each relationship using valueForKey, and returns the result of a valueForKey message to the final object.
     */
    public java.lang.Object valueForKeyPath(java.lang.String keyPath){
        return null; //TODO codavaj!!
    }

    /**
     * EOController.Enumeration is an interface that defines an enumeration that iterates over a set of EOController objects. It adds one method to the java.util.Enumeration interface: nextController, which simply returns the next controller in the enumeration's set. The nextController method saves you from having to cast the returned object to an EOController.
     * Use the EOController method controllerEnumeration to get an EOController.Enumeration.
     * You can create three types of enumerations:
     * EOController.SubcontrollersEnumeration: Includes all the subcontrollers of a controller -- the controller's subcontrollers, their subcontrollers, and so on down the controller hierarchy -- not including the controller itself.
     * SupercontrollersEnumeration: Includes all the supercontrollers of a controller -- the controller's supercontroller, its supercontroller, and so on up the controller hierarchy -- not including the controller itself.
     * ControllerAndSubcontrollersEnumeration: Includes a controller and all its subcontrollers.
     * You can further restrict the controllers included in an enumeration by specifying an interface the controllers must implement in order to be included. For more information, see the method description for controllerEnumeration in the EOController class.
     * See Also:EOController.controllerEnumeration(int, Class)
     */
    public static interface Enumeration extends java.util.Enumeration{
        /**
         * Returns the next controller in the enumeration. Use this method instead of nextElement because it saves you a cast and because itsimplementation is more efficient.
         */
        abstract com.webobjects.eoapplication.EOController nextController();

    }
}

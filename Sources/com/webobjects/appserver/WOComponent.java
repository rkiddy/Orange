package com.webobjects.appserver;
/**
 * WOComponent objects dynamically render web pages (or sections of pages) at runtime. They provide custom navigation and other logic for the page, provide a framework for organizing constituent objects (static and dynamic HTML elements and subcomponents), and enable the attribute bindings of dynamic elements.
 * The WOComponent class has many methods that have the same names as methods of the WOApplication class. However, the scope of the WOComponent methods is limited to a component rather than being application-wide. For example, you can control component-definition caching on a per-component basis using setCachingEnabled, which has a WOApplication counterpart. When this kind of caching is enabled for a component, the application parses the contents of the component directory the first time the component is requested, creates the component definition, stores this object in memory, and restores it for subsequent requests.
 * WOComponent objects also respond to awake(), sleep() and the three request-handling methods: takeValuesFromRequest, invokeAction and appendToResponse. You can override these methods in your compiled subclasses, and thereby integrate your custom behavior into the request-response loop.
 * The WOComponent class also provides a child-parent callback mechanism to allow a child component to communicate with its parent. In the parent's declaration file, bind an arbitrary attribute of the child to an action method of the parent. Then, as the last step in the child's action method, invoke performParentAction with the argument being the arbitrary attribute, returning the object received back as the response page.
 * Stateless components cannot have state. They can have instance variables, but the variable's content must be transient. To ensure that when the shared instance of a component is reused by another session there are no side effects, reset your component's instance variables by implementing the reset method. In your implementation of reset , set to null each instance variable. Note that a stateless component's instance variables will remain valid for the duration of the phase (takeValuesFromRequest , invokeAction , appendToResponse ); this lets you use instance variables in the stateless components to hold things analogous to items in a WORepetition.
 * Stateless components primarily save memory, but they can significantly speed up the application as well depending on how many stateless components you use in the application. To make a component stateless, override the component's isStateless method so that it returns true.
 * If a stateless component is needed simultaneously in separate threads, additional instances of the component are created (and later discarded) as necessary to prevent conflicts. Thus, the number of threads in which a component could be used determines the maximum number of instances of a stateless component that may be allocated at any given time.
 * See Also:WOComponent.setCachingEnabled(boolean), WOComponent.awake(), WOComponent.sleep(), WOComponent.takeValuesFromRequest(WORequest, WOContext), WOComponent.invokeAction(WORequest, WOContext), WOComponent.appendToResponse(WOResponse aResponse, WOContext aContext), WOComponent.performParentAction(String anActionName), WOComponent.reset(), WOComponent.isStateless(), Serialized Form
 */
public class WOComponent extends com.webobjects.appserver.WOElement implements com.webobjects.foundation.NSKeyValueCoding, com.webobjects.foundation.NSKeyValueCoding.ErrorHandling, com.webobjects.foundation.NSKeyValueCodingAdditions, com.webobjects.foundation.NSValidation, com.webobjects.appserver.WOActionResults, java.lang.Cloneable, java.io.Serializable{
    /**
     * Deprecated.
     * See Also:WOComponent.WOComponent(WOContext aContext)
     */
    public WOComponent(){
         //TODO codavaj!!
    }

    /**
     * WebObjects Builder archive files exist in the component directory, and this constructor initializes component variables from this archive. This constructor throws exceptions if it cannot determine the name of the component or if it cannot initialize the object for any other reason. Override WOComponent(WOContext aContext) in compiled subclasses to perform custom initializations; as always, first invoke super's default constructor.
     * Parameters:aContext - context of a transaction
     */
    public WOComponent(com.webobjects.appserver.WOContext aContext){
         //TODO codavaj!!
    }

    /**
     * Forces the component to generate its interface and output it in the response's content. Component objects associated with a response receive this message during the last phase of the component request handling, or when returned by a direct action method. In the append-to-response phase, application objects (particularly the response page instance itself) generate the HTML content of the page. WOComponent's default implementation of this method invokes the appendToResponse method on the root WOElement object of the component template, which in turn invokes appendToResponse. Subclasses of WOComponent can override this method to replace or supplement the default behavior with custom logic.
     */
    public void appendToResponse(com.webobjects.appserver.WOResponse aResponse, com.webobjects.appserver.WOContext aContext){
        return; //TODO codavaj!!
    }

    /**
     * Returns the WOApplication object for the current application.
     */
    public com.webobjects.appserver.WOApplication application(){
        return null; //TODO codavaj!!
    }

    /**
     * Invoked at the beginning of a WOComponent's involvement in a cycle of the request-response loop. It gives the WOComponent an opportunity to initialize its instance variables or perform setup operations. The default implementation does nothing.
     */
    public void awake(){
        return; //TODO codavaj!!
    }

    /**
     * Returns the component URL relative to the server's document root. For example:"/WebObjects/MyApp.woa/Resources/Main.wo".
     */
    public java.lang.String baseURL(){
        return null; //TODO codavaj!!
    }

    /**
     * Returns an NSArray containing the binding keys (as String objects) for each of the WOComponent's associations. The binding keys are defined in the left column of the table in the component inspector window in WebObjects Builder
     */
    public com.webobjects.foundation.NSArray bindingKeys(){
        return null; //TODO codavaj!!
    }

    /**
     * WOComponent's implementation of this static method returns true. It indicates that key-value coding is allowed to access fields in this object if an appropriate method is not present.
     */
    public static boolean canAccessFieldsDirectly(){
        return false; //TODO codavaj!!
    }

    /**
     * Verifies that the binding exists and that valueForBinding will return a value. The default implementation just calls hasBinding(String aBindingName)
     */
    public boolean canGetValueForBinding(java.lang.String aBindingName){
        return false; //TODO codavaj!!
    }

    /**
     * Verifies that the binding exists and that setValueForBinding will succeed.
     */
    public boolean canSetValueForBinding(java.lang.String aBindingName){
        return false; //TODO codavaj!!
    }

    /**
     * Conformance to Cloneable.
     */
    public java.lang.Object clone() throws java.lang.CloneNotSupportedException{
        return null; //TODO codavaj!!
    }

    /**
     * Returns the WOContext object for the current transaction (request-response loop)
     */
    public com.webobjects.appserver.WOContext context(){
        return null; //TODO codavaj!!
    }

    /**
     * Deprecated.
     * Use NSLog instead.
     */
    public static void debugString(java.lang.String string){
        return; //TODO codavaj!!
    }

    /**
     * Records information about the component, if it is the top-level component. The default implementation records the component's name. You might override this method if you want to record more information about the component. For example, you might want to record the values of some instance variables as well as the component name.
     * This method is invoked only on the top-level response component, that is, the one representing the entire page. Components nested inside of that top-level component do not receive this method.
     * If a CLFF log file is kept for this application, the string returned by this method is recorded in that log file. Thus, you must ensure that the string you return can be analyzed by a CLFF-analysis tool.
     */
    public java.lang.String descriptionForResponse(com.webobjects.appserver.WOResponse aResponse, com.webobjects.appserver.WOContext aContext){
        return null; //TODO codavaj!!
    }

    /**
     * Ensures that the receiver is awake in the specified context. Invoke this method before using a component which was stored in a variable. You don't need to invoke ensureAwakeInContext() if the component was just created with pageWithName, if it was restored from the WebObjects page cache, or if the page will simply be returned as the result of an action. That is, you only need to invoke this method if you're going to invoke methods on a component that is otherwise not awakened. If the receiving component is already awake, this method has no effect.
     */
    public void ensureAwakeInContext(com.webobjects.appserver.WOContext aContext){
        return; //TODO codavaj!!
    }

    /**
     * If the component is stored in a framework, this method returns the name of that framework. For example, if the component is in the framework NeXT_ROOT/System/Library/Frameworks/WOExtensions.framework, then this method returns the String "WOExtensions". If the component is not stored in a framework, this method returns null.
     */
    public java.lang.String frameworkName(){
        return null; //TODO codavaj!!
    }

    /**
     * Conformance to WOActionResults. Returns a newly-created WOResponse object. WOComponent's default implementation of this method translates the receiving component into a new WOResponse object by invoking appendToResponse on itself.
     */
    public com.webobjects.appserver.WOResponse generateResponse(){
        return null; //TODO codavaj!!
    }

    /**
     * Conformance to NSKeyValueCoding.ErrorHandling.
     */
    public java.lang.Object handleQueryWithUnboundKey(java.lang.String key){
        return null; //TODO codavaj!!
    }

    /**
     * Conformance to NSKeyValueCoding.ErrorHandling.
     */
    public void handleTakeValueForUnboundKey(java.lang.Object value, java.lang.String key){
        return; //TODO codavaj!!
    }

    /**
     * Returns whether the component has a binding named aBindingName. This method traverses the chain of associations to the top-level parent, if necessary.
     */
    public boolean hasBinding(java.lang.String aBindingName){
        return false; //TODO codavaj!!
    }

    /**
     * Returns whether the component is already in a session. For example, in direct actions, sessions are lazily created and you can avoid creating one unnecessarily by calling hasSession before session.
     */
    public boolean hasSession(){
        return false; //TODO codavaj!!
    }

    /**
     * Tells the component to execute any action specified in the request. It is systematically called during the middle phase of the component request handling. All WOComponent objects associated with a request page invoke this method. In this middle phase, the invokeAction method is propagated through the WOElement objects of the page. The dynamic element on which the user has acted (by, for example, clicking a button) responds by triggering the method in the request component that is bound to the action. WOComponent's default implementation of this method invokes invokeAction on the root WOElement object of the component template.
     */
    public com.webobjects.appserver.WOActionResults invokeAction(com.webobjects.appserver.WORequest aRequest, com.webobjects.appserver.WOContext aContext){
        return null; //TODO codavaj!!
    }

    /**
     * Returns whether component definition caching is enabled for this component. False is the default. Note that most large applications will set the global caching to true at deployment time, so this flag often has a different value between development and deployment.
     */
    public boolean isCachingEnabled(){
        return false; //TODO codavaj!!
    }

    /**
     * Called to determine if a component wants event logging. This is not desirable, for example, for components which are associated with events as they would interfere with the actual event logging. The default implementation of this method returns true.
     */
    public boolean isEventLoggingEnabled(){
        return false; //TODO codavaj!!
    }

    /**
     * By default, this method returns false, indicating that state will be maintained for instances of the receiver. Overriding this method to return true will make the component stateless. A single instance of each stateless component is shared between multiple sessions, reducing the application's memory footprint.
     * By default, stateless components don't synchronize. So, if you override this method to return true and you want the component to synchronize, you must also override synchronizesVariablesWithBindings and return true.
     */
    public boolean isStateless(){
        return false; //TODO codavaj!!
    }

    /**
     * Deprecated.
     * Use NSLog instead.
     */
    public static void logString(java.lang.String string){
        return; //TODO codavaj!!
    }

    /**
     * Returns the name of the component, which includes a path of all directories under DOCUMENTROOT/WebObjects and is minus the ".wo" extension. For example, "Main" is a typical component name.
     */
    public java.lang.String name(){
        return null; //TODO codavaj!!
    }

    /**
     * Returns a new page instance (a WOComponent object) identified by aName. If aName is null, the "Main" component is returned. If the method cannot create a valid page instance, it throws an exception.
     */
    public com.webobjects.appserver.WOComponent pageWithName(java.lang.String aName){
        return null; //TODO codavaj!!
    }

    public com.webobjects.appserver.WOComponent parent(){
        return null; //TODO codavaj!!
    }

    /**
     * Deprecated.
     */
    public java.lang.String path(){
        return null; //TODO codavaj!!
    }

    /**
     * Returns the path URL to the component. The URL includes the .wo extension. For example file://Users/auser/MyApp.woa/Resources/Main.wo or jar:file://Users/auser/MyApp.jar!/Resources/Main.wo or
     */
    public java.net.URL pathURL(){
        return null; //TODO codavaj!!
    }

    /**
     * Allows a subcomponent to invoke an action method of its parent component bound to the child component. Parent and child components are "synchronized" when this method returns. The variables that are bound by a declaration of the child component in the parent component's declaration file have the same value.
     * An example best illustrates this mechanism. Let's say there is a Palette subcomponent, and this WOComponent is nested in a parent component with a displaySelection action method. When the user selects an item in the palette (perhaps a color), you want to invoke displaySelection to show the result of the new selection (perhaps a car in the new color). The declaration in the parent's .wod file would look like this:
     * PALETTE: Palette { selection = number; callBack =
     * displaySelection
     * ; };
     * The "callBack" item is an arbitrary attribute of the child component bound in this declaration to the parent component's displaySelection method. The performParentAction method is used to activate this binding. Assuming the child component has an action method called click, the implementation would look like this:
     * public WOActionResults click() { // this is the child's action selection =
     * xxxx
     * ; // some value // now invoke the parent's action return performParentAction(callBack); }
     */
    public com.webobjects.appserver.WOActionResults performParentAction(java.lang.String anActionName){
        return null; //TODO codavaj!!
    }

    /**
     * Pulls binding values from the parent component. If this component synchronizes its bindings with its parent component (that is, if synchronizesVariablesWithBindings() returns true), this method causes binding values to be pulled from the parent component.
     */
    public void pullValuesFromParent(){
        return; //TODO codavaj!!
    }

    /**
     * Pushes binding values to the parent component. If this component synchronizes its bindings with its parent component (that is, if synchronizesVariablesWithBindings() returns true), this method causes binding values to be pushed up to the parent component.
     */
    public void pushValuesToParent(){
        return; //TODO codavaj!!
    }

    /**
     * Allows a stateless component to reset temporary references. This method -- which is only invoked if the component is stateless -- allows a component instance to reset or delete temporary references to objects that are specific to a given context. To ensure that when the shared instance of a component is reused by another session there are no side effects, implement this method so that it releases and sets to null each of the component's instance variables.
     */
    public void reset(){
        return; //TODO codavaj!!
    }

    /**
     * Returns the current WOSession object. This method creates a new session if there isn't already one.
     */
    public com.webobjects.appserver.WOSession session(){
        return null; //TODO codavaj!!
    }

    /**
     * Private. This method is used by the Direct to Web generation layer, and does nothing in WOComponent.
     */
    public void set_componentUnroll(java.lang.Object anObject){
        return; //TODO codavaj!!
    }

    /**
     * Private - this method is used by the Direct to Web generation layer, and does nothing in WOComponent.
     */
    public void set_unroll(java.lang.Object anObject){
        return; //TODO codavaj!!
    }

    /**
     * Enables or disables the caching of this component's definition. WOComponent definitions contain templates and other common information related to components and are used to generate instances of these components. When this attribute is set to true, the application parses the HTML template and the declaration (".wod") file of a component once and then stores the resulting component definition for future requests.
     * By default, individual component definition caching is controlled by WOApplication's global component definition caching policy. The global policy is set according to the start-up parameter WOCachingEnabled, or WOApplication's setCachingEnabled(boolean aFlag). With it, you can turn component definition caching off globally. You can then control caching of individual component definitions using WOComponent's version of this method. Note that most large applications will set the global caching to false at deployment time. Selective caching is an especially valuable technique for large applications where a few highly specialized components should not be cached but re-parsed everytime they are requested.
     */
    public void setCachingEnabled(boolean aFlag){
        return; //TODO codavaj!!
    }

    /**
     * Sets the value of the binding specified in the parent component. The binding specified by aBindingName is set to aValue in the parent component. If the binding isn't settable, this method throws an exception.
     */
    public void setValueForBinding(java.lang.Object aValue, java.lang.String aBindingName){
        return; //TODO codavaj!!
    }

    public void setVariableValueForName(java.lang.String name, java.lang.Object value){
        return; //TODO codavaj!!
    }

    /**
     * Invoked at the conclusion of a request-handling cycle. It gives the component the opportunity for releasing references to objects created and initialized in its awake method. The default implementation does nothing.
     */
    public void sleep(){
        return; //TODO codavaj!!
    }

    /**
     * Indicates if the push-pull of values in the parent component is enabled. Returns whether a nested component pulls all values down from its parent and pushes all values to its parent before and after each phase of the request-response loop.
     * This method returns false for stateless components and true otherwise. Override this method to create a non-synchronizing, stateful component (return false ), or a synchronizing stateless component (return true).
     */
    public boolean synchronizesVariablesWithBindings(){
        return false; //TODO codavaj!!
    }

    /**
     * Conformance to NSKeyValueCoding.
     */
    public void takeValueForKey(java.lang.Object value, java.lang.String key){
        return; //TODO codavaj!!
    }

    /**
     * Conformance to NSKeyValueCodingAdditions.
     */
    public void takeValueForKeyPath(java.lang.Object value, java.lang.String keyPath){
        return; //TODO codavaj!!
    }

    /**
     * Tells the component to synchronize its variables with values from the request. It is systematically called during the first phase of the component request handling. All WOComponent objects associated with a request are called with this method during the first phase of the request-response loop. The default WOComponent behavior is to invoke the method on the root WOElement object of the component's template (returned by template(). In this phase, each dynamic element in the template extracts any entered data or changed state (such as a check in a check box) associated with an attribute and assigns the value to the component variable bound to the attribute. Subclasses of WOComponent can override this method to replace or supplement the default behavior with custom logic.
     */
    public void takeValuesFromRequest(com.webobjects.appserver.WORequest aRequest, com.webobjects.appserver.WOContext aContext){
        return; //TODO codavaj!!
    }

    /**
     * Returns the graph of static, dynamic elements and components that compose this component. It is a WOElement representing the root object of the graph of static and dynamic HTML elements and subcomponents that is used to graphically render the receiving component. This template is constructed from the ".html" and ".wod" files found in the component directory. Note that this WOElement template is shared amongst all instances of the component. If component definition caching is set to false, the WOElement template will be reconstructed from the ".html" and .wod" files, for every request of this particular component, and the object returned will change with every request. Therefore, the return value of this method may change between development and deployment if you trigger caching and non-caching modes.
     */
    public com.webobjects.appserver.WOElement template(){
        return null; //TODO codavaj!!
    }

    /**
     * Deprecated.
     * This method is the backwards-compatible version of
     * , which is the preferred API call.
     */
    public static com.webobjects.appserver.WOElement templateWithHTMLString(java.lang.String anHTMLString, java.lang.String aDeclarationString, com.webobjects.foundation.NSArray aLanguageArray){
        return null; //TODO codavaj!!
    }

    /**
     * Deprecated.
     * Programmatically creates a component's template. Using anHTMLString as the HTML template contents and aDeclarationString as the declarations file contents, returns (as a WOElement object) the graph of static and dynamic elements built by parsing the HTML and declaration Strings. You can then use the returned WOElement as a component's template. This method is not called by WebObjects.
     */
    public static com.webobjects.appserver.WOElement templateWithHTMLString(java.lang.String referenceName, java.lang.String anHTMLString, java.lang.String aDeclarationString, com.webobjects.foundation.NSArray aLanguageArray, com.webobjects.appserver.WOAssociationFactory associationFactory, com.webobjects.appserver.parser.woml.WOMLNamespaceProvider namespaceProvider){
        return null; //TODO codavaj!!
    }

    /**
     * Programmatically creates a component's template. Using anHTMLString as the HTML template contents and aDeclarationString as the declarations file contents, returns (as a WOElement object) the graph of static and dynamic elements built by parsing the HTML and declaration Strings. You can then use the returned WOElement as a component's template. This method is not called by WebObjects.
     */
    public static com.webobjects.appserver.WOElement templateWithHTMLString(java.lang.String frameworkName, java.lang.String referenceName, java.lang.String anHTMLString, java.lang.String aDeclarationString, com.webobjects.foundation.NSArray aLanguageArray, com.webobjects.appserver.WOAssociationFactory associationFactory, com.webobjects.appserver.parser.woml.WOMLNamespaceProvider namespaceProvider){
        return null; //TODO codavaj!!
    }

    /**
     * Deprecated.
     * This method should not be used.
     */
    public com.webobjects.appserver.WOElement templateWithName(java.lang.String aName){
        return null; //TODO codavaj!!
    }

    public java.lang.String toString(){
        return null; //TODO codavaj!!
    }

    /**
     * Conformance to NSKeyValueCoding.ErrorHandling.
     */
    public void unableToSetNullForKey(java.lang.String key){
        return; //TODO codavaj!!
    }

    /**
     * Validates (and coerces) the given value, assigning it if it is different than the current value. Throws a validation exception if validateValueForKey returns an exception. Returns the coerced (assigned) value.
     */
    public java.lang.Object validateTakeValueForKeyPath(java.lang.Object value, java.lang.String keyPath) throws com.webobjects.foundation.NSValidation.ValidationException{
        return null; //TODO codavaj!!
    }

    /**
     * Conformance to NSValidation.
     */
    public java.lang.Object validateValueForKey(java.lang.Object value, java.lang.String key) throws com.webobjects.foundation.NSValidation.ValidationException{
        return null; //TODO codavaj!!
    }

    /**
     * Called when an Enterprise Object or formatter failed validation during an assignment. The default implementation ignores the error. Subclassers can override to record the error and possibly return a different page for the current action
     */
    public void validationFailedWithException(java.lang.Throwable t, java.lang.Object value, java.lang.String keyPath){
        return; //TODO codavaj!!
    }

    /**
     * Gets the value for the specified binding from the parent component. If the current component doesn't define this key, this method returns null.
     */
    public java.lang.Object valueForBinding(java.lang.String aBindingName){
        return null; //TODO codavaj!!
    }

    /**
     * Gets the value of an optional boolean binding of the component.
     */
    public boolean valueForBooleanBinding(java.lang.String binding, boolean defaultValue){
        return false; //TODO codavaj!!
    }

    /**
     * Gets the value of an optional integer binding of the component.
     */
    public java.lang.Integer valueForIntegerBinding(java.lang.String binding, java.lang.Number defaultValue){
        return null; //TODO codavaj!!
    }

    /**
     * Conformance to NSKeyValueCoding.
     */
    public java.lang.Object valueForKey(java.lang.String key){
        return null; //TODO codavaj!!
    }

    /**
     * Conformance to NSKeyValueCodingAdditions.
     */
    public java.lang.Object valueForKeyPath(java.lang.String keyPath){
        return null; //TODO codavaj!!
    }

    /**
     * Gets the value of an optional NSArray binding of the component.
     */
    public com.webobjects.foundation.NSArray valueForNSArrayBindings(java.lang.String binding, com.webobjects.foundation.NSArray defaultValue){
        return null; //TODO codavaj!!
    }

    /**
     * Gets the value of an optional NSDictionary binding of the component.
     */
    public com.webobjects.foundation.NSDictionary valueForNSDictionaryBindings(java.lang.String binding, com.webobjects.foundation.NSDictionary defaultValue){
        return null; //TODO codavaj!!
    }

    /**
     * Gets the value of an optional number binding of the component.
     */
    public java.lang.Number valueForNumberBinding(java.lang.String binding, java.lang.Number defaultValue){
        return null; //TODO codavaj!!
    }

    /**
     * Gets the value of an optional String binding of the component.
     */
    public java.lang.String valueForStringBinding(java.lang.String binding, java.lang.String defaultValue){
        return null; //TODO codavaj!!
    }

    public java.lang.Object variableValueForName(java.lang.String name){
        return null; //TODO codavaj!!
    }

    public com.webobjects.appserver.WOComponentVariable variableWithName(java.lang.String name){
        return null; //TODO codavaj!!
    }

    /**
     * The WOComponent.Event class is used to time various operations at the component level.
     * See Also:WOEvent, Serialized Form
     */
    public static class Event extends com.webobjects.appserver.WOEvent{
        public Event(){
             //TODO codavaj!!
        }

        /**
         * In the default implementation, this method returns the description of the "info" instance variable which is passed at log time. This method can be overridden by subclasses to provide information for the event display.
         */
        public java.lang.String comment(){
            return null; //TODO codavaj!!
        }

        /**
         * Used by the WOEventDisplay page in WOJExtensions to display a custom name for this component's event.
         */
        public java.lang.String displayComponentName(){
            return null; //TODO codavaj!!
        }

    }
}

package com.webobjects.appserver;
/**
 * A WOContext object lets you access objects and information that define the context of a transaction. In a typical request-response loop (a transaction), several objects have a hand in what is going on: the WOApplication and WOSession objects, the page involved in the request or response (a WOComponent object), the page's subcomponents (also WOComponents), plus the dynamic elements on the page. The WOContext object passed as an argument in the takeValuesFromRequest, invokeAction, and appendToResponse methods allows access to these objects. A context is identified by the contextID, which appears in the URL after the session ID and page name. Each contextID is an integer that the session increments each time a new context is created.
 * WOContext objects provide other information and services related to the current transaction. From them you can get the entire URL currently in effect as well as portions of that URL, such as the element ID, the context ID, and the URL up to and including the session ID.
 * A WOContext object plays a further role behind the scenes. For the benefit of a page's dynamic elements, it keeps track of the current component, that is, the WOComponent associated with the current element in the request-handling cycle. The current component can be the WOComponent that represents one of the page's subcomponents or the page itself. By reference to the current component,accessed through WOContext's component method, a dynamic element can exchange values associatively between itself and the WOComponent that contains it.
 * See Also:WOContext.component(), WOComponent.takeValuesFromRequest(WORequest aRequest, WOContext aContext), WOComponent.invokeAction(WORequest aRequest, WOContext aContext), WOComponent.appendToResponse(WOResponse aResponse, WOContext aContext)
 */
public class WOContext implements java.lang.Cloneable, com.webobjects.foundation.NSKeyValueCoding, com.webobjects.foundation.NSKeyValueCoding.ErrorHandling, com.webobjects.foundation.NSKeyValueCodingAdditions{
    public static boolean EscapeQueryDictionary;

    /**
     * wosid
     * See Also:Constant Field Values
     */
    public static final java.lang.String SessionIDBindingKey="wosid";

    /**
     * Resolves to string 'WOURLEncoding'
     * See Also:Constant Field Values
     */
    public static final java.lang.String WOURLEncoding="WOURLEncoding";

    /**
     * Returns a WOContext instance initialized with aRequest.
     * Parameters:aRequest - request that initializes the instance
     */
    public WOContext(com.webobjects.appserver.WORequest aRequest){
         //TODO codavaj!!
    }

    /**
     * Appends a string to the current element ID to create an identifier of an HTML element. For example, if the current element ID is "0.1.1" and this method is invoked with an argument of "NameField," the element ID for that field becomes "0.1.1.NameField".
     */
    public void appendElementIDComponent(java.lang.String aString){
        return; //TODO codavaj!!
    }

    /**
     * Appends a ".0" to the current element ID to create an identifier of the first "child" HTML element. For example, if the current element ID is "0.1.1", after this method is invoked the element ID becomes "0.1.1.0".
     */
    public void appendZeroElementIDComponent(){
        return; //TODO codavaj!!
    }

    /**
     * WOContext's implementation of this static method returns true, indicating that key/value coding is allowed to access fields in this object if an appropriate method isn't present.
     */
    public static boolean canAccessFieldsDirectly(){
        return false; //TODO codavaj!!
    }

    public java.lang.Object clone(){
        return null; //TODO codavaj!!
    }

    /**
     * Returns the application url prefix, including the application number.If port is 0 then the url will default to 443 for secure url and the default server port otherwise.
     */
    public java.lang.String completeApplicationURLPrefix(boolean secure, int port){
        return null; //TODO codavaj!!
    }

    /**
     * Returns the complete URL for the specified request handler. The requestHandlerKey is one of the keys registered with WOApplication. The requestHandlerPath is any URL encoded string. The aQueryString is added at the end of the URL behind a "?". If isSecure is true, this method uses "https" instead of "http". If somePort is 0 (zero), this method uses the default port.
     */
    public java.lang.String completeURLWithRequestHandlerKey(java.lang.String requestHandlerKey, java.lang.String aRequestHandlerPath, java.lang.String aQueryString, boolean isSecure, int somePort){
        return null; //TODO codavaj!!
    }

    /**
     * Builds a complete URL from its components. This methods always return a complete
     */
    public java.lang.String completeURLWithRequestHandlerKey(java.lang.String applicationNumber, java.lang.String requestHandlerKey, java.lang.String requestHandlerPath, java.lang.String queryString, boolean isSecure, int somePort){
        return null; //TODO codavaj!!
    }

    /**
     * Returns the WOComponent that dynamic elements are currently using to push and pull values associatively. During the takeValuesFromRequestinvokeAction phases of request handling, this will be either the current request, or a subcomponent of that page. During the appendToResponse phase, it will return the response page or a subcomponent.
     */
    public com.webobjects.appserver.WOComponent component(){
        return null; //TODO codavaj!!
    }

    /**
     * Returns a URL for a component action relative to cgi-bin/WebObjects. The exact form of the URL will vary depending on whether the application is caching pages and whether the session ID is being stored in the URL or not.
     */
    public java.lang.String componentActionURL(){
        return null; //TODO codavaj!!
    }

    /**
     * Returns a URL for a component action relative to cgi-bin/WebObjects. The exact form of the URL will vary depending on whether the application is caching pages and whether the session ID is being stored in the URL or not.
     */
    public java.lang.String componentActionURL(java.lang.String requestHandlerKey){
        return null; //TODO codavaj!!
    }

    /**
     * Returns a URL for a component action relative to cgi-bin/WebObjects. The exact form of the URL will vary depending on whether the application is caching pages and whether the session ID is being stored in the URL or not.
     */
    public java.lang.String componentActionURL(java.lang.String requestHandlerKey, boolean isSecure){
        return null; //TODO codavaj!!
    }

    /**
     * Compute a combined query dictionary. The resulting dictionary will include the session id if necessary. The session id inclusion can be prevented by adding a wosid entry in either of teh dictionaries.
     */
    public com.webobjects.foundation.NSDictionary computeQueryDictionary(java.lang.String aRequestHandlerPath, com.webobjects.foundation.NSDictionary queryDictionary, com.webobjects.foundation.NSDictionary otherQueryDictionary, boolean defaultIncludeSessionID){
        return null; //TODO codavaj!!
    }

    /**
     * Returns the context ID of the receiver.
     */
    public java.lang.String contextID(){
        return null; //TODO codavaj!!
    }

    /**
     * Deprecated.
     * Deprecated.
     */
    public static com.webobjects.appserver.WOContext contextWithRequest(com.webobjects.appserver.WORequest aRequest){
        return null; //TODO codavaj!!
    }

    /**
     * Deletes all components of the current element ID.
     */
    public void deleteAllElementIDComponents(){
        return; //TODO codavaj!!
    }

    /**
     * Deletes the last digit --or name-- of the current element ID, along with its dot separator. Thus, after invoking this method, "0.0.1.1" becomes "0.0.1".
     */
    public void deleteLastElementIDComponent(){
        return; //TODO codavaj!!
    }

    /**
     * Returns a complete URL for the specified action. anActionName can be either an action -- "ActionName" -- or an action on a class -- "ActionClass/ActionName". You can also specify aQueryDict to be an NSDictionary which contains form values as key/value pairs.
     */
    public java.lang.String directActionURLForActionNamed(java.lang.String anActionName, com.webobjects.foundation.NSDictionary queryDictionary){
        return null; //TODO codavaj!!
    }

    /**
     * Builds a complete URL from its components for a direct action. This methods always return a complete URL.
     */
    public java.lang.String directActionURLForActionNamed(java.lang.String requestHandlerPath, com.webobjects.foundation.NSDictionary queryDictionary, boolean isSecure, boolean entityEscapeQueryDict){
        return null; //TODO codavaj!!
    }

    /**
     * Builds a complete URL from its components for a direct action. This methods always return a complete URL.
     */
    public java.lang.String directActionURLForActionNamed(java.lang.String aRequestHandlerPath, com.webobjects.foundation.NSDictionary queryDictionary, boolean isSecure, int somePort, boolean entityEscapeQueryDict){
        return null; //TODO codavaj!!
    }

    protected boolean directConnect(){
        return false; //TODO codavaj!!
    }

    /**
     * Return the value of teh Generate complete URLs variable
     */
    public boolean doesGenerateCompleteURLs(){
        return false; //TODO codavaj!!
    }

    /**
     * Returns an element ID. This element ID is used by WOElements during the appendToResponse phase of request handling to create URLs, and during the invokeAction phase to determine which element was activated. This element ID will change as appendElementIDComponent etc are invoked.
     */
    public java.lang.String elementID(){
        return null; //TODO codavaj!!
    }

    /**
     * Forces the context to generate complete URLs.
     */
    public void generateCompleteURLs(){
        return; //TODO codavaj!!
    }

    /**
     * Forces the context to generate relative URLs.
     */
    public void generateRelativeURLs(){
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
     * Returns true if a session exists for the receiving context, false otherwise.
     */
    public boolean hasSession(){
        return false; //TODO codavaj!!
    }

    /**
     * Increments the last digit of the current element ID. For example, after this method is invoked, "0.0.1.2" becomes "0.0.1.3".
     */
    public void incrementLastElementIDComponent(){
        return; //TODO codavaj!!
    }

    /**
     * Used by subclasses of WODynamicElement to determine if the context is in a WOForm element.
     */
    public boolean isInForm(){
        return false; //TODO codavaj!!
    }

    /**
     * Convenience to determine if multiple submit form was submitted
     */
    public boolean isMultipleSubmitForm(){
        return false; //TODO codavaj!!
    }

    /**
     * Returns a JavaScript safe element id. This element is prefixed with javaScriptElementIDPrefix and all element are separated by "_"
     */
    public java.lang.String javaScriptElementID(){
        return null; //TODO codavaj!!
    }

    /**
     * Returns the prefix for the JavaScript element id.
     */
    public static java.lang.String javaScriptElementIDPrefix(){
        return null; //TODO codavaj!!
    }

    /**
     * Returns the separator for the JavaScript element id.
     */
    public static java.lang.String javaScriptElementIDSeparator(){
        return null; //TODO codavaj!!
    }

    /**
     * Returns a WOComponent object that represents either the request or response page. If this method is called during the takeValuesFromRequestinvokeAction phases of request handling, it will return the request page. If it is called during appendToResponse phase, it will return the response page. During the first two phases, the request page is determined by the context ID in the request -- if one exists, and is restored from the user's session's page cache.
     */
    public com.webobjects.appserver.WOComponent page(){
        return null; //TODO codavaj!!
    }

    /**
     * Returns the ID used in the page fragment cache to identify the component. This defaults to javaScriptElementID
     */
    public java.lang.String pageFragementID(){
        return null; //TODO codavaj!!
    }

    protected java.lang.String relativeURLWithRequestHandlerKey(java.lang.String requestHandlerKey, java.lang.String requestHandlerPath, java.lang.String queryString){
        return null; //TODO codavaj!!
    }

    /**
     * Return the context's WORequest object.
     */
    public com.webobjects.appserver.WORequest request(){
        return null; //TODO codavaj!!
    }

    /**
     * Return the context's WOResponse object.
     */
    public com.webobjects.appserver.WOResponse response(){
        return null; //TODO codavaj!!
    }

    /**
     * Return true if the context is in secure mode.
     */
    public boolean secureMode(){
        return false; //TODO codavaj!!
    }

    /**
     * Return the secure state of the request
     */
    protected boolean secureRequest(){
        return false; //TODO codavaj!!
    }

    /**
     * Returns the part of the WORequest's URI that identifies the dynamic element on the page (such as a form or an active image) responsible for submitting the request. The sender ID is the same as the element ID used to identify the dynamic element. A request's sender ID may be null, as it always is on the first request of a session.
     */
    public java.lang.String senderID(){
        return null; //TODO codavaj!!
    }

    /**
     * Returns the object representing the receiving context's session, if one exists. If the receiver does not have a session, this method creates a new session object and returns it. Note that not all contexts have a session: Direct Actions, for instance, don't always need a session. use hasSession to determine whether a context has a session associated with it.
     * In the case of a direct action, if a session could not be restored from a session ID this method attempts to create a new session by calling WOApplication.createSessionForRequest. If createSessionForRequest returns null, this method throws an IllegalStateException (catch it in your direct action to manually handle session creation error).
     */
    public com.webobjects.appserver.WOSession session(){
        return null; //TODO codavaj!!
    }

    protected java.lang.Object sessionIDInQueryDictionary(com.webobjects.foundation.NSDictionary queryDictionary){
        return null; //TODO codavaj!!
    }

    /**
     * Convenience to set if action was invoked
     */
    public void setActionInvoked(boolean aFlag){
        return; //TODO codavaj!!
    }

    /**
     * Convenience to set if form as submitted
     */
    public void setFormSubmitted(boolean aFlag){
        return; //TODO codavaj!!
    }

    /**
     * If you write something that behaves like a WOForm, invoke this method with aFlag true in appendToResponse(WOResponse aResponse, WOContext aContext) before calling super.appendToResponse(WOResponse aResponse, WOContext aContext) to notify any contained WODynamicElements that they are in a form. After super.appendToResponse(WOResponse aResponse, WOContext aContext) is done, revert the change by invoking invoke this method with aFlag false.
     */
    public void setInForm(boolean aFlag){
        return; //TODO codavaj!!
    }

    /**
     * Convenience to set if multiple submit form was submitted
     */
    public void setIsMultipleSubmitForm(boolean aFlag){
        return; //TODO codavaj!!
    }

    /**
     * Sets the prefix for the JavaScript element id.
     */
    public static void setJavaScriptElementIDPrefix(java.lang.String value){
        return; //TODO codavaj!!
    }

    /**
     * Sets the separator for the JavaScript element id.
     */
    public static void setJavaScriptElementIDSeparator(java.lang.String value){
        return; //TODO codavaj!!
    }

    /**
     * Stes the ID used in the page fragment cache to identify the component.
     */
    public void setPageFragmentID(java.lang.String value){
        return; //TODO codavaj!!
    }

    /**
     * Puts the context in secure mode.
     */
    public void setSecureMode(boolean value){
        return; //TODO codavaj!!
    }

    /**
     * Sets a dictionary in the WOContext object that can contain, as a convenience, any kind of information related to the current response. Objects further down the appendToResponse method chain can retrieve this information by invoking userInfo.
     * This method unconditionally makes an immutable copy of aDictionary. This can be a problem if changes made elsewhere to the dictionary's contents need to be reflected in the userInfo dictionary.
     * If you need to pass in a mutable dictionary that can be changed by other objects down the chain, wrap the mutable dictionary in a read-only (immutable) dictionary and pass the immutable dictionary as the argument to this method. Be extremely careful doing this if your application is multi-threaded and the userInfo data may be accessed by multiple threads.
     */
    public void setUserInfo(java.util.Map aDictionary){
        return; //TODO codavaj!!
    }

    /**
     * Setes the value for key in the infor user dictionary
     */
    public void setUserInfoForKey(java.lang.Object value, java.lang.String key){
        return; //TODO codavaj!!
    }

    /**
     * Checks if the page should not be stored in the backtrack cache.
     */
    public boolean shouldNotStorePageInBacktrackCache(){
        return false; //TODO codavaj!!
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

    /**
     * Description copied from interface:
     * Sets the value for the property identified by keyPath to value. A key path has the form relationship.property (with one or more relationships); for example "movieRole.roleName" or "movieRole.talent.lastName". The default implementation of this method (provided by NSKeyValueCodingAdditions.DefaultImplementation) gets the destination object for each relationship using valueForKey, and sends the final object a takeValueForKey message with value and property.
     */
    public void takeValueForKeyPath(java.lang.Object value, java.lang.String keyPath){
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
     * Returns a URL relative to cgi-bin/WebObjects for the specified request handler. The requestHandlerKey is one of the keys registered with WOApplication. The aRequestHandlerPath is any URL encoded string. The aQueryString is added at the end of the URL behind a "?".
     */
    public java.lang.String urlWithRequestHandlerKey(java.lang.String requestHandlerKey, java.lang.String aRequestHandlerPath, java.lang.String aQueryString){
        return null; //TODO codavaj!!
    }

    /**
     * Return the userInfo dictionary. An object further upstream in the appendToResponse method chain can set this dictionary in the WOMessage object as a way to pass information to other objects.
     */
    public com.webobjects.foundation.NSDictionary userInfo(){
        return null; //TODO codavaj!!
    }

    /**
     * Return the value of the key in the userInfo dictionary
     */
    public java.lang.Object userInfoForKey(java.lang.String key){
        return null; //TODO codavaj!!
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
     * Convenience to determine if action was invoked
     */
    public boolean wasActionInvoked(){
        return false; //TODO codavaj!!
    }

    /**
     * Convenience to determine if form as submitted
     */
    public boolean wasFormSubmitted(){
        return false; //TODO codavaj!!
    }

}

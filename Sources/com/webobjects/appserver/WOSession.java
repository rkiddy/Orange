package com.webobjects.appserver;
/**
 * WOSession objects represent periods of user interaction during which access to a WebObjects application and its resources is granted to a particular client (typically a browser). An application can have many concurrent sessions, each with its own special "view" of the application and its own set of data values. For example: one client can be accessing a "catalog" application, navigating from page to page and filling a virtual shopping cart with items for purchase. Another client can be accessing the same application at the same time, but visiting different pages and placing different items in his or her shopping cart. Neither client will see anything to indicate that they are not the only person using the application.
 * Perhaps the most important purpose of a WOSession object is to encapsulate state for a user session. After the application handles a request, it stores the WOSession until the next request in the session occurs. All of the information that is important for maintaining continuity throughout the session is preserved, as is the integrity of session data. This data not only persists between requests but is kept separate from that of all other sessions.
 * The application uses a session ID to identify a session object. Upon receiving a request that is not identified with a session ID, the application creates a new session and assigns it a session ID -- a unique, randomly generated string. This session ID will appear in the URL between the application name and the page name.
 * When you develop an application, you identify data with session-wide scope by declaring instance variables in your subclass of WOSession. As the client interacts with the application, before the end of each cycle of the request-response loop, you should ensure that the instance variables hold the current session values.
 * At the end of each cycle of the request-response loop, the application stores the WOSession object according to the storage strategy implemented by the chosen WOSessionStore. When the application receives the next request in a given session, it restores the WOSession, using the session ID stored in the request as key. To be stored and restored according to any WOSessionStore strategy, a WOSession must be convertible to a stream. To accomplish this, WOSession implements the interface java.io.Serializable; any custom subclasses should also do so.
 * Because storage of sessions in application memory can consume large amounts of memory over time, WOSession includes methods for controlling the lifespan of session objects. The setTimeOut method sets a period of inactivity after which the session is terminated. The terminate method explicitly ends a session.
 * The WOSession class provides several other methods useful for tasks ranging from localization to database access:
 * subclasses of WOSession can interject custom session behavior into the request-response loop by implementing the request-handling methods (takeValuesFromRequest, invokeAction, and appendToResponse) as well as awake and sleep. For database access, the defaultEditingContext method gives each WOSession object in an application its own Enterprise Objects editing context. An object in an application doesn't have to know which instance variables a WOSession holds in order to store session values. Using the key-value coding methods setObjectForKey and objectForKey it can store and retrieve values as needed. This mechanism is especially useful for reusable components. An application's WOSession objects also play a role in localization. Through the setLanguages method you can store a list of the languages supported by the session. The sequence of language strings in the list indicates the order of language preference for a particular session. Several resource-access methods in WOResourceManager, WOApplication, and WOComponent refer to the languages array when they locate such things as localized strings, images, and sounds. WOSession objects can affect load balancing with the setDistributionEnabled method. If the flag set by this method is false, transactions of the session are restricted to a single application instance. If this is the case, the application instance number as well as the application host name are appended to the URL.
 * See Also:WOSession.setTimeOut(double seconds), WOSession.terminate(), WOSession.takeValuesFromRequest(WORequest aRequest, WOContext aContext), WOSession.invokeAction(WORequest aRequest, WOContext aContext), WOSession.appendToResponse(WOResponse aResponse, WOContext aContext), WOSession.awake(), WOSession.sleep(), WOSession.defaultEditingContext(), WOSession.setObjectForKey(Object anObject, String key), WOSession.objectForKey(String key), WOSession.setLanguages(NSArray languages), WOSession.languages(), WOSession.setDistributionEnabled(boolean aFlag), WOSessionStore, Serialized Form
 */
public class WOSession implements java.lang.Cloneable, java.io.Serializable, com.webobjects.foundation.NSKeyValueCoding, com.webobjects.foundation.NSKeyValueCoding.ErrorHandling, com.webobjects.foundation.NSKeyValueCodingAdditions{
    /**
     * Sent at the end of session creation (including awake). The object of the notification is the session instance.
     * See Also:Constant Field Values
     */
    public static final java.lang.String SessionDidCreateNotification="SessionDidCreateNotification";

    /**
     * Sent after the session is fully restored (including awake). The object of the notification is the session instance.
     * See Also:Constant Field Values
     */
    public static final java.lang.String SessionDidRestoreNotification="SessionDidRestoreNotification";

    /**
     * Sent when a session times out but before it is released. The object of the notification is the session ID.
     * See Also:Constant Field Values
     */
    public static final java.lang.String SessionDidTimeOutNotification="SessionDidTimeOutNotification";

    /**
     * Creates a WOSession with a randomly generated session ID and a session time-out of WOApplication.sessionTimeOut() seconds. The isDistributionEnabled flag is set to false, meaning that each request in the session will be handled by the same application instance.
     * See Also:WOSession.isDistributionEnabled(), WOSession.setDistributionEnabled(boolean aFlag), WOApplication.sessionTimeOut()
     */
    public WOSession(){
         //TODO codavaj!!
    }

    /**
     * Creates a WOSession with session ID aSessionId and a session time-out of WOApplication.sessionTimeOut() seconds. The isDistributionEnabled flag is set to false, meaning that each request in the session will be handled by the same application instance.
     * Parameters:aSessionID - the session ID providedSee Also:WOSession.isDistributionEnabled(), WOSession.setDistributionEnabled(boolean aFlag), WOApplication.sessionTimeOut()
     */
    public WOSession(java.lang.String aSessionID){
         //TODO codavaj!!
    }

    /**
     * Returns whether or not the session is allowed to view the WOEvents* pages. If a password must be supplied prior to viewing the events pages and the client hasn't supplied the proper password, this method returns false.
     * This method returns false by default.
     */
    public boolean allowedToViewEvents(){
        return false; //TODO codavaj!!
    }

    /**
     * Returns whether or not the session is allowed to view the WOStats page. If statistics aren't being gathered, or if a password must be supplied prior to viewing those statistics and the client hasn't supplied the proper password, this method returns false.
     * By default, this method returns false.
     */
    public boolean allowedToViewStatistics(){
        return false; //TODO codavaj!!
    }

    /**
     * Invoked on the WOSession object during the final phase of the request-response loop. During this phase the objects associated with a response page append their HTML content to the response. WOSession's default implementation of this method invokes appendToResponse on the WOComponent that represents the response page. Then it records information about the current transaction by invoking recordStatisticsForResponse and then descriptionForResponse on the WOStatisticsStore object.
     * Subclasses of WOSession can override this method to replace or supplement the default behavior with custom logic. Note This method is not called during a direct action request-response loop.
     */
    public void appendToResponse(com.webobjects.appserver.WOResponse aResponse, com.webobjects.appserver.WOContext aContext){
        return; //TODO codavaj!!
    }

    /**
     * Invoked on the WOSession object at the beginning of a WOSession's involvement in a cycle of the request-response loop, giving the WOSession an opportunity to initialize its instance variables or perform setup operations.
     * The default implementation does nothing.
     */
    public void awake(){
        return; //TODO codavaj!!
    }

    /**
     * Return true in all cases, indicating that key-value coding is allowed to access fields in this object if an appropriate accessor method isn't present.
     */
    public static boolean canAccessFieldsDirectly(){
        return false; //TODO codavaj!!
    }

    public java.lang.Object clone(){
        return null; //TODO codavaj!!
    }

    /**
     * Returns the WOContext object for the current transaction.
     */
    public com.webobjects.appserver.WOContext context(){
        return null; //TODO codavaj!!
    }

    /**
     * Deprecated.
     */
    public static void debugString(java.lang.String string){
        return; //TODO codavaj!!
    }

    /**
     * Returns the default EOEditingContext for the receiver. This method creates the editing context the first time that it is invoked and caches it for subsequent invocations.
     * There is only one unique editing context instance per session.
     * The instance's parent object store is initialized to the default parent object store.
     */
    public com.webobjects.eocontrol.EOEditingContext defaultEditingContext(){
        return null; //TODO codavaj!!
    }

    /**
     * Returns the path that will be used when creating the rendevous cookie for the application to use with the cookie mechanism for storing session and instance IDs This path is lazily created the first time this method is called using the current request's adaptorPrefix and the application name, including the .woa extension.
     */
    public java.lang.String domainForIDCookies(){
        return null; //TODO codavaj!!
    }

    /**
     * Deprecated.
     */
    public com.webobjects.foundation.NSTimestamp expirationDateForIDCookies(){
        return null; //TODO codavaj!!
    }

    /**
     * Gets the page from the Page Cache.
     */
    protected com.webobjects.appserver.WOComponent getPageFromPageCacheForContextID(java.lang.String aContextID){
        return null; //TODO codavaj!!
    }

    /**
     * Gets the page from the Page Fragment Cache.
     */
    protected com.webobjects.appserver.WOComponent getPageFromPageFragmentCacheForContextID(java.lang.String contextID){
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
     * Invoked on the WOSession object during the middle phase of the request-response loop. During this phase, the invokeAction method is propagated through the objects of an application, most importantly, the WOElement objects of the request page. The dynamic element on which the user has acted -- by, for example, clicking a button -- responds by triggering the method in the request WOComponent that is bound to the action.
     * The default behavior of WOSession is to invoke invokeAction on the WOComponent object that represents the request.
     * Subclasses of WOSession can override this method to replace or supplement the default behavior with custom logic.
     */
    public com.webobjects.appserver.WOActionResults invokeAction(com.webobjects.appserver.WORequest aRequest, com.webobjects.appserver.WOContext aContext){
        return null; //TODO codavaj!!
    }

    /**
     * Returns false by default, since the default WOSessionStore does not support distributed sessions.
     * When false, generated URLs include the application instance number. The web server adaptor then uses this number to route the request to a specific application instance.
     * When true, generated URLs do not contain the application instance number, and the transactions in a session are distributed among application instances based on whichever load balancing algorithm is in use.
     */
    public boolean isDistributionEnabled(){
        return false; //TODO codavaj!!
    }

    /**
     * Returns whether or not the receiver is in the process of terminating. If true, the session will terminate after the conclusion of the current request-response loop.
     */
    public boolean isTerminating(){
        return false; //TODO codavaj!!
    }

    /**
     * Returms an enumerator of the keys in the component state dictionary.
     */
    public java.util.Enumeration keyEnumerator(){
        return null; //TODO codavaj!!
    }

    /**
     * Returms a keys sets in the component state dictionary.
     */
    public java.util.Set keySet(){
        return null; //TODO codavaj!!
    }

    /**
     * Returns an NSArray of languages for which the session is localized. The order of language strings returned indicates the preferred order of languages. This is initialized from the user's browser preferences unless explicitly set with setLanguages.
     */
    public com.webobjects.foundation.NSArray languages(){
        return null; //TODO codavaj!!
    }

    /**
     * Return true if we lock the default editing context in the awake/sleep phases.
     */
    public boolean lockDefaultEditingContext(){
        return false; //TODO codavaj!!
    }

    /**
     * Deprecated.
     */
    public static void logString(java.lang.String string){
        return; //TODO codavaj!!
    }

    /**
     * Create a new editing context. Sub classes can override this method to customize the editing context created. If the session locks teh default editing context this context must be returned unlocked.
     */
    public com.webobjects.eocontrol.EOEditingContext newDefaultEditingContext(){
        return null; //TODO codavaj!!
    }

    /**
     * Returns an Object stored in the session under a given key.
     */
    public java.lang.Object objectForKey(java.lang.String aKey){
        return null; //TODO codavaj!!
    }

    /**
     * Removes the Object stored in the session under a given key.
     */
    public void removeObjectForKey(java.lang.String aKey){
        return; //TODO codavaj!!
    }

    /**
     * This method attempts to restore an existing page. It will search the session's page cache first, then the permanent page cache. If the page is found, its awake method is called and it is returned; otherwise, null is returned.
     * The key to the stored instance is its contextID, which derives from the transaction's WOContext or WORequest objects. Note: If you wish to use this method to restore a page generated by WOLongResponse, you must be sure to use the sessionID retrieved during the WOLongResponse's appendToResponse.
     */
    public com.webobjects.appserver.WOComponent restorePageForContextID(java.lang.String aContextID){
        return null; //TODO codavaj!!
    }

    /**
     * Saves the page instance aPage in the session's page cache. Invoked automatically if the WOApplication subclass' pageCacheSize is non-zero. The context ID for the current transaction should be used as the key for retrieving this instance from the cache using restorePageForContextID. This method will take into account the value shouldNotStorePageInBacktrackCachein the WOContext and store the page either in the backtrack cache or the page fragment cache.
     */
    public void savePage(com.webobjects.appserver.WOComponent aPage){
        return; //TODO codavaj!!
    }

    /**
     * Saves the page instance aPage in the session's page cache. Invoked automatically if the WOApplication subclass' pageCacheSize is non-zero. The context ID for the current transaction should be used as the key for retrieving this instance from the cache using restorePageForContextID.
     */
    protected void savePageInPageCache(com.webobjects.appserver.WOComponent aPage){
        return; //TODO codavaj!!
    }

    /**
     * Saves the page instance aPage in the session's page fragment cache. Invoked automatically if the WOApplication subclass' pageCacheSize is non-zero. The context ID for the current transaction should be used as the key for retrieving this instance from the cache using restorePageForContextID. Page fragments are identified by the pageFragementID, as only one copy of each fragment is stored in the cache.
     */
    protected void savePageInPageFragmentCache(com.webobjects.appserver.WOComponent page){
        return; //TODO codavaj!!
    }

    /**
     * Puts aPageComponent into the permanent page cache. The permanent page cache is designed to hold components which are frequently accessed. This is useful when you are using frames, since the number of component instances active in a frameset would dramatically reduce the size of the standard page cache. Objects can fall out of the permanent page cache if the permanent page cache's size is exceeded. Note that the best place to call this method is in your component class' constructor to avoid calling it multiple times for the same object. The latest place this method should ever invoke is the beginning of the component's appendToResponse method.
     */
    public void savePageInPermanentCache(com.webobjects.appserver.WOComponent aPageComponent){
        return; //TODO codavaj!!
    }

    /**
     * Return the receivers sessionID. This ID may be stored in the URL, or in a cookie. If it is in the URL, it will apear after the request handler key.
     * The sessionID does not change during the life of the session.
     * Unless the receiver is a copy of another session, or was created with a specified sessionID, the sessionID will be a unique randomly generated String.
     */
    public java.lang.String sessionID(){
        return null; //TODO codavaj!!
    }

    /**
     * Sets the editing context to be returned by defaultEditingContext. This can be used to set an editing context initialized with a different parent object store than the default. This is useful when, for instance, each session needs its own login to the database.
     * Once a default editing context has been established, setDefaultEditingContext may not be called again. Therefore, to provide your own default editing context, setDefaultEditingContext must be called before ever calling defaultEditingContext since that will lazily establish an editing context.
     */
    public void setDefaultEditingContext(com.webobjects.eocontrol.EOEditingContext editingContext){
        return; //TODO codavaj!!
    }

    /**
     * Enables or disables the distribution mechanism that effects load balancing among multiple application instances.
     * When false, generated URLs include the application instance number. The web server adaptor then uses this number to route the request to a specific application instance.
     * When true, generated URLs do not contain the application instance number, and the transactions in a session are distributed among application instances based on whichever load balancing algorithm is in use. Returns false
     */
    public void setDistributionEnabled(boolean aFlag){
        return; //TODO codavaj!!
    }

    /**
     * Sets the languages for which the session is localized. The ordering of language strings in the array determines the order in which the application will search .lproj directories for localized strings, images, and component definitions.
     */
    public void setLanguages(com.webobjects.foundation.NSArray someLanguages){
        return; //TODO codavaj!!
    }

    /**
     * Stores an Object within the session under a given key. This method allows a reusable component to add state dynamically to any WOSession object. This method eliminates the need for prior knowledge of the WOSession's instance variables. A suggested mechanism for generating a unique key prefix for a given subcomponent is to concatenate the component's name and its element ID. For a specific component instance, such a prefix should remain unique and invariant within a session.
     */
    public void setObjectForKey(java.lang.Object anObject, java.lang.String aKey){
        return; //TODO codavaj!!
    }

    /**
     * Enables or disables the use of cookies for storing the session and instance IDs.
     * If aFlag is true, two cookies are created to store session information: a session ID cookie with the name WORequest.SessionIDKey, and an instance ID cookie with the name WORequest.InstanceKey.
     * By default, this mechanism is disabled.
     */
    public void setStoresIDsInCookies(boolean aFlag){
        return; //TODO codavaj!!
    }

    /**
     * Enables or disables the use of URLs for storing the session and instance IDs.
     * By default, this mechanism is enabled.
     */
    public void setStoresIDsInURLs(boolean aFlag){
        return; //TODO codavaj!!
    }

    /**
     * Set the session time-out in seconds. When the application receives no request from this session's client for a period longer than the time-out setting, the session will terminate, resulting in the garbage collection of the session object.
     * By default, the session time-out is set to the value returned by WOApplication.sessionTimeOut().
     */
    public void setTimeOut(double aTimeInterval){
        return; //TODO codavaj!!
    }

    /**
     * Invoked at the conclusion of each request-response loop in which the session is involved, giving the WOSession the opportunity to clean up objects initialized in the awake method.
     * The default WOSession implementation does nothing.
     */
    public void sleep(){
        return; //TODO codavaj!!
    }

    /**
     * Returns a list of pages accessed by this session, ordered from first to most recently accessed. For each page, the String stored is obtained by sending descriptionForResponse to its WOComponent object. By default, this returns the component's name. If the application keeps a CLFF log file, this list is recorded in the log file when the session terminates.
     */
    public com.webobjects.foundation.NSArray statistics(){
        return null; //TODO codavaj!!
    }

    /**
     * Returns whether the cookie mechanism for storing session and instance IDs is enabled.
     * If true, two cookies are created to store session information: a session ID cookie with the name WORequest.SessionIDKey, and an instance ID cookie with the name WORequest.InstanceKey.
     * Returns false by default.
     */
    public boolean storesIDsInCookies(){
        return false; //TODO codavaj!!
    }

    /**
     * Returns whether the URL mechanism for storing session and instance IDs is enabled.
     * Returns true by default.
     */
    public boolean storesIDsInURLs(){
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

    /**
     * Invoked on the WOSession object during the first phase of the the request-response loop. During this phase, the dynamic elements associated with the request page extract any user input and assign the values to the appropriate component variables.
     * The default behavior of WOSession is to invoke takeValuesFromRequest on the WOComponent object that represents the request.
     * Subclasses of WOSession can override this method to replace or supplement the default behavior with custom logic.
     */
    public void takeValuesFromRequest(com.webobjects.appserver.WORequest aRequest, com.webobjects.appserver.WOContext aContext){
        return; //TODO codavaj!!
    }

    /**
     * Causes the session to terminate after the conclusion of the current request-response loop.
     */
    public void terminate(){
        return; //TODO codavaj!!
    }

    /**
     * Returns the interval in seconds during which the session can remain idle before it times out.
     */
    public double timeOut(){
        return 0.0d; //TODO codavaj!!
    }

    /**
     * Deprecated.
     */
    public int timeOutForIDCookies(){
        return 0; //TODO codavaj!!
    }

    /**
     * Returns the interval in milliseconds during which the session can remain idle before it times out.
     */
    public long timeOutMillis(){
        return 0l; //TODO codavaj!!
    }

    /**
     * Returns a string representation of the receiver, including the session ID, the session time-out and a number of the more important state fields. Intended for use in debugging.
     */
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
     * Validates the username and password used to access the WOEvents* pages. By default, validation will fail unless a password has been specified. This can be done by setting a password on EOEventCenter in code, or by using the WOEventsPassword property.
     * By default, the username is ignored.
     * Subclasses of WOSession can override this method to provide application specific login behavior.
     */
    public void validateEventsLogin(java.lang.String password, java.lang.String username){
        return; //TODO codavaj!!
    }

    /**
     * Validates the username and password used to access the WOStats page. By default, validation will fail unless a password has been specified; this can be done by setting a password on the application's WOStatisticsStore in code, or by using the WOStatisticsPassword property.
     * By default, the username is ignored.
     * Subclasses of WOSession can override this method to provide application specific login behavior.
     */
    public void validateStatisticsLogin(java.lang.String password, java.lang.String username){
        return; //TODO codavaj!!
    }

    /**
     * Handle an exception thrown as a result of validation failure.
     * By default, this method invokes your application class' validationFailedWithException method.
     * Subclasses of WOSession can override this method to provide application specific behavior.
     */
    public void validationFailedWithException(java.lang.Throwable t, java.lang.Object value, java.lang.String keyPath, com.webobjects.appserver.WOComponent component){
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
     * Used primarily in Ajax style page caching. We remove the eldest entry if the page frament cache size has grown beyone 2X the settting for WOApplication.pageFragmentCacheSize().
     * Since: 5.4 See Also:Serialized Form
     */
    public static class PageFragmentCache extends java.util.LinkedHashMap{
        public PageFragmentCache(){
             //TODO codavaj!!
        }

        /**
         * Maintenance the page fragement cache. Remove the oldest entry if we're about to add a new one and that would put us over the cache size. Also, clears out expired pages from the cache when invoked.
         */
        public boolean cleanPageCache(java.lang.String fragmentKey){
            return false; //TODO codavaj!!
        }

        /**
         * For a given contextID, return the page.
         */
        public com.webobjects.appserver.WOComponent pageForContextID(java.lang.String contextID){
            return null; //TODO codavaj!!
        }

        protected boolean removeEldestEntry(java.util.Map.Entry eldest){
            return false; //TODO codavaj!!
        }

    }
}

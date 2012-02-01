package com.webobjects.appserver;
/**
 * The primary role of the WOApplication class is to coordinate the handling of HTTP requests. Each application must have exactly one WOApplication object. The application object receives client requests from an HTTP server adaptor, manages the processing that generates a response, and returns that response to the adaptor. Typically, the response is an object representing a web page. The adaptor then packages the response in a form specific to the HTTP server that orginated the request and then forwards the response to that HTTP server.
 * In handling requests, an application object creates and manages one or more sessions. A session (represented by a WOSession object) dedicates resources to a period of access by a single user and stores persistent state during that period. Conceptually, each cycle of the request-response loop (or transaction) takes place within a session.
 * Besides mediating between the adaptor and the rest of the application during request handling, WOApplication performs many secondary functions. It returns pages based on component name, caches page instances and component definitions, provides some facilities for error handling and script debugging, coordinates the different levels of multi-threaded execution, and furnishes a variety of data.
 * Typical deployment schemes balance the processing load by having multiple application instances per web server adaptor. A single application can interact with multiple adaptors. For example, an application can simultaneously communicate with secure-socket adaptors and HTTP adaptors.
 * You can instantiate ready-made application objects from the WOApplication class or you can obtain the application object from a custom subclass of WOApplication. Custom WOApplication subclasses are common in WebObjects applications since there is often a need to override the awake, sleep, and request-handling methods. Compiled WOApplication subclasses can take any name, but if the name is anything other than "Application" you must implement your own main method to instantiate the application object from this class. However, if the class name is "Application", you don't need to modify main.
 * See Also:WOApplication.awake(), WOApplication.sleep()
 */
public class WOApplication implements com.webobjects.foundation.NSKeyValueCoding, com.webobjects.foundation.NSKeyValueCoding.ErrorHandling, com.webobjects.foundation.NSKeyValueCodingAdditions, com.webobjects.appserver.WOApplicationMBean{
    /**
     * Contains a String that names the notification posted at the end of WOApplication's dispatchRequest method.
     * See Also:Constant Field Values
     */
    public static final java.lang.String ApplicationDidDispatchRequestNotification="ApplicationDidDispatchRequestNotification";

    /**
     * Contains a String that names the notification posted by WOApplication's run method after the application is launched. This notification is posted immediately before the run method logs the "Waiting for requests." message to the console.
     * See Also:Constant Field Values
     */
    public static final java.lang.String ApplicationDidFinishLaunchingNotification="ApplicationDidFinishLaunchingNotification";

    /**
     * Contains a String that names the notification posted at the very beginning of WOApplication's dispatchRequest method.
     * See Also:Constant Field Values
     */
    public static final java.lang.String ApplicationWillDispatchRequestNotification="ApplicationWillDispatchRequestNotification";

    /**
     * Contains a String that names the notification posted at the very beginning of WOApplication's run method.
     * See Also:Constant Field Values
     */
    public static final java.lang.String ApplicationWillFinishLaunchingNotification="ApplicationWillFinishLaunchingNotification";

    public static final java.lang.String CGIAdaptorURLProperty="application.cgiAdaptorUrl";

    public static final java.lang.String DirectoryAliasProperty="application.directoryAlias";

    public static final java.lang.String DocumentRootProperty="application.documentRoot";

    /**
     * Creates and initializes the instance of WOApplication. Some of the interesting initializations that may happen: The main bundle is set. Adaptors are initialized. Page cache size is set to 30 pages. Client caching of pages is disabled (isPageRefreshOnBacktrackEnabled returns true). A resource manager is created. A session store is set in the server. A statistics store is set in the server. The request handlers are registered. Lifebeats are started.
     * An NSForwardException is thrown if initialization does not succeed.
     * See Also:WOApplication.isPageRefreshOnBacktrackEnabled()
     */
    public WOApplication(){
         //TODO codavaj!!
    }

    /**
     * The number returned is only accurate if the application stores state in the server's memory, which is the default. If you use a custom state-storage strategy however, there may be no way to tell how many sessions are active for a given application instance.
     */
    public int activeSessionsCount(){
        return 0; //TODO codavaj!!
    }

    /**
     * Returns the class name of the primary adaptor. This is the cover method for the property WOAdaptor.
     */
    public java.lang.String adaptor(){
        return null; //TODO codavaj!!
    }

    public java.lang.String[] adaptorExtensions(){
        return null; //TODO codavaj!!
    }

    public java.lang.String adaptorName(){
        return null; //TODO codavaj!!
    }

    public java.lang.String adaptorPath(){
        return null; //TODO codavaj!!
    }

    /**
     * Returns a list of the loaded application adaptors. A WOApplication can have multiple adaptors. This allows you to design an application that can not only listen to a socket for incoming HTTP requests (using the WODefaultAdaptor), but can also receive remote request messages using more advanced RPC mechanisms such as CORBA and DCOM.
     */
    public com.webobjects.foundation.NSArray adaptors(){
        return null; //TODO codavaj!!
    }

    /**
     * Return whether or not there is at least one multi-threaded adaptor which may attempt to dispatch requests concurrently.
     */
    public final boolean adaptorsDispatchRequestsConcurrently(){
        return false; //TODO codavaj!!
    }

    /**
     * Invoked in the constructor to create an adaptor. If you subclass WOAdaptor, you should specify the WOAdaptor subclass you want the application to use with the WOAdditionalAdaptors property. This property expects as its value a properly formatted plist containing a dictionary of initialization values for the adaptor. This method looks for a subclass of WOAdaptor with the name aClassName (which was supplied in the dictionary with the key WOAdaptor), and if such a class exists, creates a new instance. The anArgsDictionary dictionary is populated with any adaptor-specific options.
     */
    public com.webobjects.appserver.WOAdaptor adaptorWithName(java.lang.String aClassName, com.webobjects.foundation.NSDictionary anArgsDictionary){
        return null; //TODO codavaj!!
    }

    /**
     * Returns an array of adaptor description dictionaries. This is the cover method for the property WOAdditionalAdaptors
     * The value of the property should be a plist of dictionaries, each of which should contain a key-value pair whose key is WOAdaptor and whose value is a String containing the name of the adaptor class. Other attributes such as WOPort may also be specified, but are adaptor specific. For example, WOWorkerThreadCount is used by the WODefaultAdaptor class and may not be relevant for all adaptors.
     */
    public com.webobjects.foundation.NSArray additionalAdaptors(){
        return null; //TODO codavaj!!
    }

    /**
     * Returns the key which identifies URLs directed at the Ajax Handler for XMLHTTPRequests. By default, this method returns the string "ja". This is a cover for the system property _AjaxRequestHandlerKey.
     */
    public java.lang.String ajaxRequestHandlerKey(){
        return null; //TODO codavaj!!
    }

    /**
     * Return whether or not concurrent request handling is allowed. This is a cover method for the property WOAllowsConcurrentRequestHandling and will return false by default.
     */
    public boolean allowsConcurrentRequestHandling(){
        return false; //TODO codavaj!!
    }

    /**
     * The WOApplication object invokes this method on itself to initiate the final phase of request handling. This occurs right after the invokeAction method has completed, typically with the return of a response page. In the append-to-response phase, the application objects (particularly the response component itself) generate the HTML content of the page. WOApplication's default implementation of this method invokes appendToResponse on the session. Note This method is not called during a direct action request-response loop.
     */
    public void appendToResponse(com.webobjects.appserver.WOResponse aResponse, com.webobjects.appserver.WOContext aContext){
        return; //TODO codavaj!!
    }

    /**
     * Return the application instance. Do not override this method.
     */
    public static com.webobjects.appserver.WOApplication application(){
        return null; //TODO codavaj!!
    }

    /**
     * This is the cover method for the property WOApplicationBaseURL. This method will return the path to where the application may be found under the document root, not including the application name.
     * Will return "/WebObjects" if the application is started without explicitly specifying the WOApplicationBaseURL property (unless the application itself invokes setApplicationBaseURL).
     */
    public java.lang.String applicationBaseURL(){
        return null; //TODO codavaj!!
    }

    public java.lang.String applicationExtension(){
        return null; //TODO codavaj!!
    }

    /**
     * Return the WOAssociationFactory for the application. This will always return the associationFactoryRegistry, which is the application's implementation of the WOAssociationFactory for use in declaration parsing. Users of the application's association factory should call this method; the registry should be used only by code that modifies the registry.
     */
    public final com.webobjects.appserver.WOAssociationFactory associationFactory(){
        return null; //TODO codavaj!!
    }

    /**
     * Return the WOAssociationFactoryRegistry for the application. If the registry is not set this will call createDefaultAssociationFactoryRegistry() to create and initialize the default registry for the application. Code that configures the registry should use this method; code that only uses it to call the declaration parser should use associationFactory().
     */
    public com.webobjects.appserver.WOAssociationFactoryRegistry associationFactoryRegistry(){
        return null; //TODO codavaj!!
    }

    /**
     * Returns whether automatic client application launching is enabled for Java Client applications. By default, automatic browser launching is enabled. This method is a cover for the property WOAutoOpenClientApplication.
     */
    public boolean autoOpenClientApplication(){
        return false; //TODO codavaj!!
    }

    /**
     * Return whether starting the application instance will launch a browser pointing at the main page of the application. By default, automatic browser launching is enabled.
     */
    public boolean autoOpenInBrowser(){
        return false; //TODO codavaj!!
    }

    /**
     * Invoked at the beginning of each cycle of the request-response loop, affording the opportunity to perform initializations with application-wide scope. Since the default implementation does nothing, overridden implementations do not have to call super.
     */
    public void awake(){
        return; //TODO codavaj!!
    }

    /**
     * Returns the application URL relative to the server's document root.
     */
    public java.lang.String baseURL(){
        return null; //TODO codavaj!!
    }

    /**
     * WOApplication's implementation of this static method returns true, indicating that key-value coding is allowed to access fields in this object if an appropriate method isn't present.
     */
    public static boolean canAccessFieldsDirectly(){
        return false; //TODO codavaj!!
    }

    /**
     * Returns the URL for the web server including the path to the WebObjects CGI adaptor: for example, http://localhost/cgi-bin/WebObjects. This URL is used by the direct connect feature only. This is the cover for the property WOCGIAdaptorURL.
     */
    public java.lang.String cgiAdaptorURL(){
        return null; //TODO codavaj!!
    }

    protected java.net.URL combinedComponentPathURL(com.webobjects.appserver.WOResourceManager aResourceManager, java.lang.String templateName, java.lang.String aFrameworkName, java.lang.String aLanguage, boolean refreshProjectOnCacheMiss){
        return null; //TODO codavaj!!
    }

    /**
     * Returns the key which identifies URLs directed at component-action based requests. By default, this method returns the string "wo". This is a cover for the system property _ComponentRequestHandlerKey.
     */
    public java.lang.String componentRequestHandlerKey(){
        return null; //TODO codavaj!!
    }

    /**
     * Defaults to WOContext.
     */
    public java.lang.String contextClassName(){
        return null; //TODO codavaj!!
    }

    /**
     * Creates a new context object for a given request. Override this method if you need to provide your own subclass of WOContext. If you override it, your implementation need not call super.
     * Alternatively, use setContextClassName and contextClassName.
     * If you are using JSP or Servlet support (JavaWOJSPServlet.framework), you must subclass WOServletContext instead of WOContext.
     */
    public com.webobjects.appserver.WOContext createContextForRequest(com.webobjects.appserver.WORequest aRequest){
        return null; //TODO codavaj!!
    }

    /**
     * Creates the default application association factory registry. This will The registry will be configured to include the built-in association factories for constants, KVC expressions and componen temporary variables.
     */
    protected com.webobjects.appserver.WOAssociationFactoryRegistry createDefaultAssociationFactoryRegistry(){
        return null; //TODO codavaj!!
    }

    /**
     * Creates the default namespace provider, which provides the "wo" and "woq" namespaces to WOML templates. This method is called only once during application initialization and is the appropriate place to put application-wide WOML namespaces.
     */
    protected com.webobjects.appserver.parser.woml.WOMLDefaultNamespaceProvider createDefaultNamespaceProvider(){
        return null; //TODO codavaj!!
    }

    /**
     * Convenience method that instantiates and returns a new WORequest object. Developers should override this method to either modify HTTP request data before the WORequest object is instantiated, or to create a custom subclass of WORequest. The default implementation directly invokes the WORequest constructor. Therefore aMethod, aURL and anHTTPVersion are required by the default version. If overridden to create a custom WORequest subclass, the subclass constructor will define the parameter requirements.
     */
    public com.webobjects.appserver.WORequest createRequest(java.lang.String aMethod, java.lang.String aURL, java.lang.String anHTTPVersion, java.util.Map someHeaders, com.webobjects.foundation.NSData aContent, java.util.Map someInfo){
        return null; //TODO codavaj!!
    }

    /**
     * Creates a new instance of WOResourceManager. The WOApplication constructor calls this method. Override this method if you need to provide your own subclass of WOResourceManager. If you override it, your implementation need not call super.
     * Do not use this method to get a reference to the WOResourceManager object. Multiple calls to this method will result in multiple instantiations, which is memory intensive. Use resourceManager to get a reference instead.
     */
    public com.webobjects.appserver.WOResourceManager createResourceManager(){
        return null; //TODO codavaj!!
    }

    /**
     * Convenience method that instantiates and returns a new, empty WOResponse object.
     */
    public com.webobjects.appserver.WOResponse createResponseInContext(com.webobjects.appserver.WOContext aContext){
        return null; //TODO codavaj!!
    }

    /**
     * Creates and returns a WOSession object to manage a session for the client. The method goes through several steps to locate the class to use for instantiating this object:
     * First it looks for a class of name "Session" that is a subclass of WOSession and is in the same package as the subclass of WOApplication being used. If such a class does not exist, it uses WOSession.
     * The method then returns an initialized (using the default WOSession constructor) session instance of the selected class.
     * Note: An implication of the foregoing description is that the names of WOSession subclasses should be "Session", and that this class should be in the same package as the subclass of WOApplication. If not, you will have to override this method to use the proper class to create the session object. The default implementation of createSessionForRequest does not catch any exception thrown by the runtime if it is unable to instantiate a new session. It never returns null.
     * If you implement this method to return null in certain conditions:
     * In component request handling, this will trigger a call to handleSessionCreationErrorInContext.
     * In a direct action, WOContext.session will throw an IllegalStateException, and you'll need to catch it yourself to call handleSessionCreationErrorInContext if desired.
     */
    public com.webobjects.appserver.WOSession createSessionForRequest(com.webobjects.appserver.WORequest aRequest){
        return null; //TODO codavaj!!
    }

    /**
     * Deprecated.
     * Deprecated. Use NSLog instead.
     */
    public void debugString(java.lang.String aString){
        return; //TODO codavaj!!
    }

    /**
     * Returns the default application adaptor.
     */
    public com.webobjects.appserver.WOAdaptor defaultAdaptor(){
        return null; //TODO codavaj!!
    }

    /**
     * Returns the request handler to be used when no request handler key is found in the URL or WORequest. By default, returns the WOComponent request handler. When an application is contacted for the first time it is usually via a URL like the following:
     * http://somehost/cgi-bin/WebObjects/AppName.woa The way that URLs of this type are handled is determined by the default request handler.
     */
    public com.webobjects.appserver.WORequestHandler defaultRequestHandler(){
        return null; //TODO codavaj!!
    }

    /**
     * Returns the class name of the default request handler. By default, this method returns "com.webobjects.appserver._private.WOComponentRequestHandler". Override this method to return "com.webobjects.appserver._private.WODirectActionRequestHandler" to make the direct action request handler the default.
     */
    public java.lang.String defaultRequestHandlerClassName(){
        return null; //TODO codavaj!!
    }

    /**
     * Return the number of levels of undo for a session's default editing context. The default is 10. This value can be overriden by: using the property WODefaultUndoStackLimit setting the undo stack limit from the Session class' constructor overriding this method.
     */
    public java.lang.Number defaultUndoStackLimit(){
        return null; //TODO codavaj!!
    }

    /**
     * Returns the key which identifies URLs directed at Direct Action based requests. By default, this method returns the string "wa". This is a cover for the system property _DirectActionRequestHandlerKey.
     */
    public java.lang.String directActionRequestHandlerKey(){
        return null; //TODO codavaj!!
    }

    /**
     * Returns the URL to connect to the application directly without going through the web server and WOAdaptors. It includes the path to the WebObjects CGI adaptor (although it ignores it), and the port number on which the application is listening. For example, http://localhost:8888/cgi-bin/WebObjects This URL is used in development mode.
     */
    public java.lang.String directConnectURL(){
        return null; //TODO codavaj!!
    }

    /**
     * The starting point of the request-response cycle in WOApplication. Invoked by the adaptor.
     */
    public com.webobjects.appserver.WOResponse dispatchRequest(com.webobjects.appserver.WORequest aRequest){
        return null; //TODO codavaj!!
    }

    /**
     * Returns the document root for static resources.
     */
    public java.lang.String documentRoot(){
        return null; //TODO codavaj!!
    }

    /**
     * Creates and returns a WOElement object based on the element's name, a dictionary of associations, and a template of WOElements. This method is invoked automatically by the template parser to provide a WOElement object that represents a WEBOBJECT element in the HTML template. You don't ordinarily invoke this method, but you might override it to substitute your own WOElement or reusable component for one of the standard WOElements.
     * The arguments aName and someAssociations are derived from a corresponding line in the declarations file. aName is a String that identifies the type of element to create. Generally aName specifies a standard WOElement such as WOString. It may also identify a reusable component. For example, in the method dynamicElementWithName for the following declaration:
     * APP_STRING: WOString {value = applicationString;}; aName contains the string "WOString" someAssociations contains an entry for each attribute specified in the corresponding declaration. For the declaration above, someAssociations contains a single entry for WOString's value attribute. The keys of someAssociations are the attribute names and the values are WOAssociation objects. WOApplication's implementation of dynamicElementWithName first searches for a WOElement named aName. If a WOElement is found, the method creates an instance and returns it. Otherwise, it searches for a component to return instead. If neither is found, this method returns null. The template parser uses this method to instantiate dynamic elements only; WOSwitchComponent uses this method to instantiate either dynamic elements or components.
     */
    public com.webobjects.appserver.WOElement dynamicElementWithName(java.lang.String aName, com.webobjects.foundation.NSDictionary someAssociations, com.webobjects.appserver.WOElement anElement, com.webobjects.foundation.NSArray aLanguageArray){
        return null; //TODO codavaj!!
    }

    /**
     * This value is used to determine URLs that should be generated to reference Web Server Resources in those frameworks. This is the cover method for the property WOFrameworksBaseURL.
     */
    public java.lang.String frameworksBaseURL(){
        return null; //TODO codavaj!!
    }

    /**
     * JMX Support
     */
    public boolean getAdaptorsDispatchRequestsConcurrently(){
        return false; //TODO codavaj!!
    }

    /**
     * JMX Support
     */
    public java.util.ArrayList getAdditionalAdaptors(){
        return null; //TODO codavaj!!
    }

    /**
     * Return the agentid for app instance where agentid=[your_unique_id_for_your_instance] Used for sticky session support.
     */
    public java.lang.String getAgentID(){
        return null; //TODO codavaj!!
    }

    /**
     * JMX Support
     */
    public boolean getAllowsConcurrentRequestHandling(){
        return false; //TODO codavaj!!
    }

    /**
     * JMX support
     */
    public java.lang.String getApplicationBaseURL(){
        return null; //TODO codavaj!!
    }

    /**
     * JMX support
     */
    public java.lang.String getApplicationExtension(){
        return null; //TODO codavaj!!
    }

    /**
     * JMX Support
     */
    public boolean getAutoOpenClientApplication(){
        return false; //TODO codavaj!!
    }

    /**
     * JMX Support
     */
    public java.lang.String getBaseURL(){
        return null; //TODO codavaj!!
    }

    /**
     * JMX Support
     */
    public java.lang.String getCGIAdaptorURL(){
        return null; //TODO codavaj!!
    }

    /**
     * Return a list of URI formatted classpaths used at bootstrap time by the classloader. These are the resolved paths returned after reading the platform specific classpath files in the .woa bundle. For instance, the MacOSClasspath.txt file located in MyApp.woa/Contents/MacOS/MacOSClassPath.txt
     */
    public java.util.ArrayList getClassPaths(){
        return null; //TODO codavaj!!
    }

    /**
     * JMX Support
     */
    public java.lang.String getComponentRequestHandlerKey(){
        return null; //TODO codavaj!!
    }

    /**
     * JMX Support
     */
    public java.lang.String getDefaultAdaptor(){
        return null; //TODO codavaj!!
    }

    /**
     * JMX Support
     */
    public int getDefaultUndoStackLimit(){
        return 0; //TODO codavaj!!
    }

    /**
     * JMX Support
     */
    public java.lang.String getDirectConnectURL(){
        return null; //TODO codavaj!!
    }

    /**
     * Return versions of NSBundle-aware frameworks or jars found at runtime. The NSDictionary uses the framework name as the key to getting the version string.
     */
    public java.util.HashMap getFrameworkVersions(){
        return null; //TODO codavaj!!
    }

    /**
     * JMX support
     */
    public java.lang.String getHost(){
        return null; //TODO codavaj!!
    }

    /**
     * JMX Support
     */
    public java.lang.String getHostAddress(){
        return null; //TODO codavaj!!
    }

    /**
     * JMX Support
     */
    public boolean getIncludeCommentsInResponses(){
        return false; //TODO codavaj!!
    }

    /**
     * JMX Support
     */
    public boolean getIsCachingEnabled(){
        return false; //TODO codavaj!!
    }

    public boolean getIsMonitorEnabled(){
        return false; //TODO codavaj!!
    }

    /**
     * JMX Support
     */
    public boolean getIsPageRefreshOnBacktrackEnabled(){
        return false; //TODO codavaj!!
    }

    /**
     * JMX Support
     */
    public boolean getIsRefusingNewSessions(){
        return false; //TODO codavaj!!
    }

    /**
     * JMX Support
     */
    public boolean getIsTerminating(){
        return false; //TODO codavaj!!
    }

    /**
     * The default JMX domain is composed of the host + app name + port number. For example: ipod.apple.com.MyApplication.2001 where host = ipod.apple.com app name = MyApplication port = 2001
     */
    public java.lang.String getJMXDomain(){
        return null; //TODO codavaj!!
    }

    /**
     * JMX Support
     */
    public int getLifebeatDestinationPort(){
        return 0; //TODO codavaj!!
    }

    /**
     * JMX Support
     */
    public int getLifebeatInterval(){
        return 0; //TODO codavaj!!
    }

    /**
     * JMX Support
     */
    public int getListenQueueSize(){
        return 0; //TODO codavaj!!
    }

    /**
     * JMX Support
     */
    public int getMaxSocketIdleTime(){
        return 0; //TODO codavaj!!
    }

    /**
     * Return an instance of the MBeanserver. Related to JMX support.
     */
    public javax.management.MBeanServer getMBeanServer() throws java.lang.IllegalAccessException{
        return null; //TODO codavaj!!
    }

    /**
     * JXM Support
     */
    public int getMinimumActiveSessionsCount(){
        return 0; //TODO codavaj!!
    }

    /**
     * JMX Support
     */
    public java.lang.String getName(){
        return null; //TODO codavaj!!
    }

    /**
     * JMX Support
     */
    public java.lang.String getOutputPath(){
        return null; //TODO codavaj!!
    }

    /**
     * JMX Support
     */
    public int getPageCacheSize(){
        return 0; //TODO codavaj!!
    }

    /**
     * JMX Support
     */
    public int getPageFragmentCacheSize(){
        return 0; //TODO codavaj!!
    }

    /**
     * JMX Support
     */
    public int getPort(){
        return 0; //TODO codavaj!!
    }

    /**
     * JMX Support
     */
    public java.lang.String getServletConnectURL(){
        return null; //TODO codavaj!!
    }

    /**
     * JMX Support
     */
    public int getSessionTimeOut(){
        return 0; //TODO codavaj!!
    }

    /**
     * JMX Support
     */
    public double getTimeOut(){
        return 0.0d; //TODO codavaj!!
    }

    /**
     * Current version number. Version is determined by the WebObjects framework found in the classpath and the CFBundleShortVersionString value in the plist.
     */
    public java.lang.String getWebObjectsVersion(){
        return null; //TODO codavaj!!
    }

    /**
     * JMX Support
     */
    public java.lang.String getWebserverConnectURL(){
        return null; //TODO codavaj!!
    }

    /**
     * JMX Support
     */
    public int getWorkerThreadCountMax(){
        return 0; //TODO codavaj!!
    }

    /**
     * JMX Support
     */
    public int getWorkerThreadCountMin(){
        return 0; //TODO codavaj!!
    }

    /**
     * Invoked when an action handler throws an exception in handleRequest. Action handlers are subclasses of the WOActionRequestHandler, and include the WODirectActionRequestHandler. exception is the actual exception that was thrown. Typically, this is invoked in the following cases: The Request URI couldn't be parsed. reason will be WOActionRequestHandler.INVALID_PATH. The WOAction class couldn't be found. reason will be WOActionRequestHandler.INSTANTIATION. The WOAction object couldn't be created. reason will be WOActionRequestHandler.INVOCATION. The action couldn't be invoked on the WOAction object. In this case, the exception will likely be an InvocationTargetException. reason will be WOActionRequestHandler.CLASS_NOT_FOUND. actionClassName, actionName, actionClass and actionInstance are self explanatory. They may be null, as they represent the state of the handler at the time of the throw. If a WOContext object is needed, check if actionInstance isn't null and has a context object. Otherwise, simply invoke createContextForRequest to create an appropriate WOContext object. The default behavior is to simply return null. This will cause the original code path to be taken, resulting in the appropriate generateErrorResponse method invocation. Override this method to display a more user-friendly error page.
     */
    public com.webobjects.appserver.WOResponse handleActionRequestError(com.webobjects.appserver.WORequest aRequest, java.lang.Exception exception, java.lang.String reason, com.webobjects.appserver.WORequestHandler aHandler, java.lang.String actionClassName, java.lang.String actionName, java.lang.Class actionClass, com.webobjects.appserver.WOAction actionInstance){
        return null; //TODO codavaj!!
    }

    /**
     * Invoked when an unexpected exception is thrown in the request-response loop. The default behavior displays a page with debugging information.
     * Override this method to display a more user-friendly error page.
     */
    public com.webobjects.appserver.WOResponse handleException(java.lang.Exception anException, com.webobjects.appserver.WOContext aContext){
        return null; //TODO codavaj!!
    }

    /**
     * Invoked when a malformed cookie is parsed. The default behavior is to parse as much of the string as possible and ignore the rest. Override this to implement a different recovery strategy.
     */
    public com.webobjects.foundation.NSMutableDictionary handleMalformedCookieString(java.lang.RuntimeException anException, java.lang.String cookieString, com.webobjects.foundation.NSMutableDictionary aReturnDict){
        return null; //TODO codavaj!!
    }

    /**
     * Invoked when a page (WOComponent) instance cannot be restored, which typically happens when a user backtracks too far. Specifically, this method is invoked when the following occurs: the request is not the first of a session, page restoration by context ID fails, and page re-creation is disabled. The default behavior displays a page with debugging information.
     * Override this method to display a more user-friendly error page.
     */
    public com.webobjects.appserver.WOResponse handlePageRestorationErrorInContext(com.webobjects.appserver.WOContext aContext){
        return null; //TODO codavaj!!
    }

    /**
     * Conformance to NSKeyValueCoding.ErrorHandling. This method is invoked from valueForKey when there is no property binding for key. WOApplication's implementation always throws NSKeyValueCoding.UnknownKeyException.
     */
    public java.lang.Object handleQueryWithUnboundKey(java.lang.String key){
        return null; //TODO codavaj!!
    }

    /**
     * Returns the request handler to be used to handle a given request. This will either be the request handler identified by a request handler key in the URL, or the default request handler.
     */
    public com.webobjects.appserver.WORequestHandler handlerForRequest(com.webobjects.appserver.WORequest aRequest){
        return null; //TODO codavaj!!
    }

    /**
     * Invoked by the component request handler when a session (WOSession) instance cannot be created. The default behavior displays a page with debugging information.
     * Override this method to display a more user-friendly error page. In the case of Direct Actions, you may call this method yourself.
     */
    public com.webobjects.appserver.WOResponse handleSessionCreationErrorInContext(com.webobjects.appserver.WOContext aContext){
        return null; //TODO codavaj!!
    }

    /**
     * Invoked when a session (WOSession) instance cannot be restored, which typically happens when the session times out. The default behavior displays a page with debugging information.
     * Override this method to display a more user-friendly error page.
     */
    public com.webobjects.appserver.WOResponse handleSessionRestorationErrorInContext(com.webobjects.appserver.WOContext aContext){
        return null; //TODO codavaj!!
    }

    /**
     * Conformance to NSKeyValueCoding.ErrorHandling. This method is invoked from takeValueForKey when there is no property binding for key. WOApplication's implementation always throws NSKeyValueCoding.UnknownKeyException.
     */
    public void handleTakeValueForUnboundKey(java.lang.Object value, java.lang.String key){
        return; //TODO codavaj!!
    }

    /**
     * Return the name of the host the instance is running on. This is a cover method for the property WOHost.
     */
    public java.lang.String host(){
        return null; //TODO codavaj!!
    }

    /**
     * Return the InetAddress for the host returned by host.
     */
    public java.net.InetAddress hostAddress(){
        return null; //TODO codavaj!!
    }

    /**
     * Returns whether or not HTML comments are appended to the response. This is the cover method for the property WOIncludeCommentsInResponses.
     */
    public boolean includeCommentsInResponses(){
        return false; //TODO codavaj!!
    }

    /**
     * String key used to obtain the application instance number from a request using methods like formValueForKey(String) and cookieValueForKey(String).
     */
    public java.lang.String instanceIdKey(){
        return null; //TODO codavaj!!
    }

    /**
     * The WOApplication object invokes this method on itself to initiate the middle phase of request handling. In this phase, invokeAction is propagated through the objects of the application until the dynamic element that has received the user action (for instance, a click on a button) responds to the method by triggering the method in the request component that is bound to the action. The default WOApplication implementation of this method invokes invokeAction on the session object.
     */
    public com.webobjects.appserver.WOActionResults invokeAction(com.webobjects.appserver.WORequest aRequest, com.webobjects.appserver.WOContext aContext){
        return null; //TODO codavaj!!
    }

    /**
     * Returns whether or not component caching is enabled. If this is enabled, changes to a component will be reparsed after being saved, assuming the project is under the NSProjectSearchPath. Note that this has no effect on page caching. This is the cover method for the property WOCachingEnabled.
     */
    public boolean isCachingEnabled(){
        return false; //TODO codavaj!!
    }

    /**
     * Returns true if at least one adaptor may dispatch requests concurrently and allowsConcurrentRequestHandling returns true.
     */
    public final boolean isConcurrentRequestHandlingEnabled(){
        return false; //TODO codavaj!!
    }

    /**
     * Do not use. Use NSLog instead.
     */
    public boolean isDebuggingEnabled(){
        return false; //TODO codavaj!!
    }

    /**
     * Returns whether or not direct connect is enabled. By default it is enabled. This is a cover for the system property WODirectConnectEnabled.
     * Direct Connect transforms the application instance into a simple web server. In particular, the instance is able to find and return its own images and resources as if it were a web server. This can be very useful in development mode, as developers can work without having to set up or maintain a web server.
     * To connect to an application instance using Direct Connect point the URL to the port where the instance is listening, and the instance will handle all urls.
     * If direct connect is enabled, the following happen: when using autoOpenInBrowser, a Direct Connect URL will be used. when using WOMailDelivery to mail pages with dynamic links in them, these links will be generated with a complete direct connect URL format. People receiving these mails will be able to access the application with Direct Connect. all files on the system become accessible through the resource request handler. On the other hand, if direct connect is not enabled, the resource request handler can be used to retrieve data objects from memory only, and no more reading in the file system is permitted. For security reasons, it is recommended that Direct Connect be disabled when an application is deployed.
     */
    public boolean isDirectConnectEnabled(){
        return false; //TODO codavaj!!
    }

    /**
     * This is a cover method for the property WOMonitorEnabled. If the application was started by wotaskd, this method will return true, since wotaskd will set the WOMonitorEnabled property to true. However, if the application was started in any other way, this method is not garanteed to return false, only the value of the WOMonitorEnabled property.
     */
    public boolean isMonitorEnabled(){
        return false; //TODO codavaj!!
    }

    /**
     * Returns whether caching of pages is disabled in the client. If it is, the client does not restore request pages from its cache but re-creates them "from scratch" by resending the URL to the server. This flag is set to true by default.
     */
    public boolean isPageRefreshOnBacktrackEnabled(){
        return false; //TODO codavaj!!
    }

    /**
     * Returns true if the application instance is refusing new sessions, and false otherwise. When the application instance refuses new sessions, the WebObjects adaptor tries to create the session in another instance of the same application. If no other instance is running and accepting new sessions, the user receives an error message.
     */
    public boolean isRefusingNewSessions(){
        return false; //TODO codavaj!!
    }

    /**
     * Returns whether the application will terminate at the end of the current request-response loop.
     */
    public boolean isTerminating(){
        return false; //TODO codavaj!!
    }

    /**
     * Returns a String array of launch arguments.
     */
    public java.lang.String[] launchArguments(){
        return null; //TODO codavaj!!
    }

    /**
     * Deprecated.
     * Returns the maximum number of requests WebObjects will handle during the window returned by licensedRequestWindow. You will not be able to exceed licensedRequestLimit requests per licensedRequestWindow milliseconds.
     */
    public static final int licensedRequestLimit(){
        return 0; //TODO codavaj!!
    }

    /**
     * Deprecated.
     * Returns the interval over which the licensedRequestLimit is calculated. You will not be able to exceed licensedRequestLimit requests per licensedRequestWindow milliseconds.
     */
    public static final long licensedRequestWindow(){
        return 0l; //TODO codavaj!!
    }

    /**
     * Deprecated.
     * This static final method returns a boolean indicating whether the license allows multiple instances of the application to run simultaneously.
     */
    public static final boolean licensingAllowsMultipleInstances(){
        return false; //TODO codavaj!!
    }

    /**
     * Deprecated.
     * This static final method returns a boolean that indicates whether or not the application is allowed to run in multithreaded mode.
     */
    public static final boolean licensingAllowsMultipleThreads(){
        return false; //TODO codavaj!!
    }

    /**
     * Returns the port to which lifebeat signals will be sent. This port is controlled by the WOLifebeatDestinationPort property.
     */
    public int lifebeatDestinationPort(){
        return 0; //TODO codavaj!!
    }

    /**
     * Return whether or not the application is sending lifebeats.
     */
    public boolean lifebeatEnabled(){
        return false; //TODO codavaj!!
    }

    /**
     * Return the interval at which the application instance will send lifebeat signals to wotaskd. This is controled by the property WOLifebeatInterval.
     */
    public int lifebeatInterval(){
        return 0; //TODO codavaj!!
    }

    /**
     * Returns the size of the listen queue which will created by the primary adaptor, usually WODefaultAdaptor. This is the cover method for the property WOListenQueueSize.
     */
    public java.lang.Number listenQueueSize(){
        return null; //TODO codavaj!!
    }

    /**
     * Return the NSArray of frameworks to be loaded during application initialization. This is a cover for the property WOLoadFrameworks. The value of the property should be a plist containing an array of strings.
     */
    public com.webobjects.foundation.NSArray loadFrameworks(){
        return null; //TODO codavaj!!
    }

    /**
     * Deprecated.
     */
    public void lock(){
        return; //TODO codavaj!!
    }

    /**
     * Formats and logs a message anytime a value is set through a WOAssociation, when WODebug is set to true for the declaration in which the association appears. Setting a value means the child component/element is setting a value in the parent).
     */
    public void logSetValueForDeclarationNamed(java.lang.String aDeclarationName, java.lang.String aDeclarationType, java.lang.String aBindingName, java.lang.String anAssociationDescription, java.lang.Object aValue){
        return; //TODO codavaj!!
    }

    /**
     * Deprecated.
     * Deprecated. Use NSLog instead.
     */
    public void logString(java.lang.String aString){
        return; //TODO codavaj!!
    }

    /**
     * Formats and logs a message anytime a value is taken through a WOAssociation, when WODebug is set to true for the declaration in which the association appears. Taking a value means the child component/element is taking a value from the parent. Override this method to alter the format of the log message.
     * The arguments of this method are defined in the following example WebObjects declaration:
     * aDeclarationName : aDeclarationType { aBindingName = anAssociationDescription; } Also, aValue is the value which is being pushed to or pulled from the child to the parent.
     */
    public void logTakeValueForDeclarationNamed(java.lang.String aDeclarationName, java.lang.String aDeclarationType, java.lang.String aBindingName, java.lang.String anAssociationDescription, java.lang.Object aValue){
        return; //TODO codavaj!!
    }

    /**
     * The WebObjects application's main method.
     */
    public static void main(java.lang.String[] argv){
        return; //TODO codavaj!!
    }

    /**
     * An alternate main method for the WebObjects applications that allows you to specify a subclass of WOApplication to be instantiated and run instead of WOApplication.
     */
    public static void main(java.lang.String[] argv, java.lang.Class applicationClass){
        return; //TODO codavaj!!
    }

    /**
     * Returns the maximum interval in milliseconds for which a socket should be allowed to wait on incoming data. This is a cover for the WOMaxSocketIdleTime property.
     */
    public java.lang.Number maxSocketIdleTime(){
        return null; //TODO codavaj!!
    }

    /**
     * If the number of active sessions is less than or equal to this number and isRefusingNewSessions returns true, the application instance terminates. The default is 0.
     */
    public int minimumActiveSessionsCount(){
        return 0; //TODO codavaj!!
    }

    /**
     * Deprecated.
     * This is a deprecated cover method for isMonitorEnabled.
     */
    public boolean monitorEnabled(){
        return false; //TODO codavaj!!
    }

    /**
     * Deprecated.
     * This method always returns "localhost".
     */
    public java.lang.String monitorHost(){
        return null; //TODO codavaj!!
    }

    /**
     * Deprecated.
     * This is a deprecated cover method for isMonitorEnabled.
     */
    public boolean monitoringEnabled(){
        return false; //TODO codavaj!!
    }

    /**
     * Returns the name of the application, which is the value of the WOApplicationName property. If WOApplicationName is not defined, returns the name of the executable without any extensions.
     */
    public java.lang.String name(){
        return null; //TODO codavaj!!
    }

    public com.webobjects.appserver.parser.woml.WOMLNamespaceProvider namespaceProvider(){
        return null; //TODO codavaj!!
    }

    /**
     * Create a new dynamic URL for the WORequest.
     */
    public com.webobjects.appserver.WODynamicURL newDynamicURL(){
        return null; //TODO codavaj!!
    }

    /**
     * Create a new dynamic URL for the WORequest.
     */
    public com.webobjects.appserver.WODynamicURL newDynamicURL(java.lang.String url){
        return null; //TODO codavaj!!
    }

    /**
     * Provided for backwards compatibility only. Do not use.
     */
    public java.lang.String number(){
        return null; //TODO codavaj!!
    }

    /**
     * Return the path to which logs will be written. This path may is controlled by the WOOutputPath property, and may be set to "/dev/null".
     */
    public java.lang.String outputPath(){
        return null; //TODO codavaj!!
    }

    /**
     * Provides the size of the default page cache. The default cache size is 30. When page caching is enabled, the session object holds the WOComponent instance corresponding to the response page. When a browser backtracks to the page, the session restores it from the session to act as the request page. The state of the page is retained. If the page is not in the cache or if page caching is disabled, the page is not stored in the session and cannot be reaccessed if the browser backtracks to it.
     */
    public int pageCacheSize(){
        return 0; //TODO codavaj!!
    }

    /**
     * Provides the size of the default page fragments cache. The default cache size is 30. When page fragment caching is enabled, the session object holds the WOComponent instance corresponding to the response page. When a browser backtracks to the page, the session restores it from the session to act as the request page. The state of the page fragment is retained. If the page is not in the cache or if page caching is disabled, the page fragment is not stored in the session and cannot be reaccessed if the browser backtracks to it.
     */
    public int pageFragmentCacheSize(){
        return 0; //TODO codavaj!!
    }

    /**
     * Returns a new page instance (a WOComponent object) identified by aName. If aName is null, the Main component is assumed. If the method cannot create a valid page instance, an exception is thrown.
     */
    public com.webobjects.appserver.WOComponent pageWithName(java.lang.String aName, com.webobjects.appserver.WOContext aContext){
        return null; //TODO codavaj!!
    }

    /**
     * Returns the file system path of the application, which is an absolute path and includes the .woa extension; for example "C:/NETSCAPE/ns-home/docs/WebObjects/Examples/HelloWorld.woa" is a typical application path.
     */
    public java.lang.String path(){
        return null; //TODO codavaj!!
    }

    /**
     * Provides the size of the permanent page cache. The default size is 30.
     */
    public int permanentPageCacheSize(){
        return 0; //TODO codavaj!!
    }

    /**
     * Returns the port number on which the primary adaptor will listen This is the cover method for the property WOPort.
     */
    public java.lang.Number port(){
        return null; //TODO codavaj!!
    }

    /**
     * Deprecated.
     * This is used when calling into WebObjects programmatically (typically to use responseForComponentWithName) rather than running a WebObjects application standalone. This must be called before responseForComponentWithName is called.
     */
    public static void primeApplication(java.lang.String mainBundlePath, java.lang.String nameOfApplicationSubclass){
        return; //TODO codavaj!!
    }

    /**
     * This is used when calling into WebObjects programmatically (typically to use responseForComponentWithName) rather than running a WebObjects application standalone. This must be called before responseForComponentWithName is called. This cannot be used to load new NSBundles into the WebObjects runtime, either mainBundleName or mainBundlePathURL should reference an existing NSBundle.
     */
    public static void primeApplication(java.lang.String mainBundleName, java.net.URL mainBundlePathURL, java.lang.String nameOfApplicationSubclass){
        return; //TODO codavaj!!
    }

    /**
     * Deprecated.
     * Deprecated. Does nothing.
     */
    public boolean printsHTMLParserDiagnostics(){
        return false; //TODO codavaj!!
    }

    /**
     * Returns an array of file system paths which are searched for projects for rapid turnaround mode. This is the cover method for the property NSProjectSearchPath. Note that NSProjectSearchPath is only used for ProjectBuilderWO projects, not the version of Project Builder for Mac OS X. Also note that the behavior changed for NSProjectSearchPath between WebObjects 4.5.1 and 5.0. Previous to WebObjects 5.0, WebObjects applications would search recursively down from any directories included in NSProjectSearchPath, looking for a PB.project file. As of WebObjects 5.0, WebObjects applications only search for a PB.project file directly within any directory identified in NSProjectSearchPath (no more subdirectory searches).
     */
    public com.webobjects.foundation.NSArray projectSearchPath(){
        return null; //TODO codavaj!!
    }

    /**
     * Returns a file system path which is where the recording information should be saved. By default, this method returns null.
     * If this method returns a path, all requests and responses are recorded in the HTTP format in numbered files: 0000-request, 0000-response, 0001-request, 0001-response, etc, and saved under the recording path specified. This directory is then used by the Playback tool to test the application. You will most likely set this as a command line argument -WORecordingPath pathname, exercise your application to record a scenario you would like to test, and then stop the application. Afterward you can restart the application without the WORecordingPath argument, and point Playback to the recording directory just created to replay your sequence of requests and compare the responses received with the ones recorded.
     */
    public java.lang.String recordingPath(){
        return null; //TODO codavaj!!
    }

    /**
     * Controls whether this application instance will create a session when it receives an HTTP request from a new user. If aVal is true, the application does not create new sessions; when it receives a request from a new user, it refuses that request, and the adaptor must try to find another application instance that can process the request. If aVal is false, the application creates new sessions. false is the default.
     * This method is used with setMinimumActiveSessionsCount to gracefully shut down application instances. Use setMinimumActiveSessionsCount to set the active session minimum to a certain number. When the number of active sessions reaches the number that is set and isRefusingNewSessions returns true, the application terminates.
     */
    public void refuseNewSessions(boolean aVal){
        return; //TODO codavaj!!
    }

    /**
     * Returns an array of Strings containing the keys of all of the registered request handlers.
     */
    public com.webobjects.foundation.NSArray registeredRequestHandlerKeys(){
        return null; //TODO codavaj!!
    }

    /**
     * Convenience to register an MBean with the MBean server.
     */
    public void registerMBean(java.lang.Object aMBean, javax.management.ObjectName aName){
        return; //TODO codavaj!!
    }

    /**
     * Convenience to register an MBean with the MBean server. The domain ObjectName is composed of aDomainName+aMBeanName. e.g ipod.apple.com.MyApplication:2001 : name=aMBeanName
     */
    public void registerMBean(java.lang.Object aMBean, java.lang.String aDomainName, java.lang.String aMBeanName) throws java.lang.IllegalArgumentException{
        return; //TODO codavaj!!
    }

    /**
     * Registers a new request handler. aRequestHandlerKey must specify a key which can be found in the URL following the instance number or application name.
     */
    public void registerRequestHandler(com.webobjects.appserver.WORequestHandler aHandler, java.lang.String aRequestHandlerKey){
        return; //TODO codavaj!!
    }

    /**
     * Removes the specified request handler from the application.
     */
    public com.webobjects.appserver.WORequestHandler removeRequestHandlerForKey(java.lang.String aRequestHandlerKey){
        return null; //TODO codavaj!!
    }

    /**
     * Returns the request handler used to handle requests containing the specified key.
     */
    public com.webobjects.appserver.WORequestHandler requestHandlerForKey(java.lang.String aKey){
        return null; //TODO codavaj!!
    }

    /**
     * Returns an Object suitable for a synchronization lock or null if the application isn't multithreaded.
     */
    public java.lang.Object requestHandlingLock(){
        return null; //TODO codavaj!!
    }

    /**
     * Returns the WOResourceManager object that the application uses to manage resources.
     */
    public com.webobjects.appserver.WOResourceManager resourceManager(){
        return null; //TODO codavaj!!
    }

    /**
     * Resource requests are only used during development of an application or when the application is being run without an HTTP server. This is a cover for the system property _ResourceRequestHandlerKey.
     */
    public java.lang.String resourceRequestHandlerKey(){
        return null; //TODO codavaj!!
    }

    /**
     * Returns a WOResponse for the WOComponent named name, using bindings. URLs in the component will be generated using uriPrefix as a base URI and the appName as the application name. Both these arguments are optional. headers is a dictionary containing headers to be passed into the created WORequest. userInfo is used for any additional info passed into the created WORequest. If no values are supplied, uriPrefix defaults to cgiAdaptorURL or if that is not set, /cgi-bin/WebObjects, and appName defaults to name.
     */
    public com.webobjects.appserver.WOResponse responseForComponentWithName(java.lang.String name, java.util.Map bindings, java.util.Map headers, java.util.Map userInfo, java.lang.String uriPrefix, java.lang.String appName){
        return null; //TODO codavaj!!
    }

    /**
     * Returns a WOResponse for the Direct Action actionName in the class named className (optional). The formValueDict is a dictionary of form values which are formed into a queryString. contentStream is an InputStream containing the content of the generated request. URLs will be generated using uriPrefix as a base URI and the appName as the application name; if uriPrefix is null it will default first to cgiAdaptorURL, and if that is null to /cgi-bin/WebObjects, if appName is null it will default to name. headers is a dictionary containing headers to be passed into the created WORequest. userInfo is used for any additional info to be passed into the created WORequest.
     */
    public com.webobjects.appserver.WOResponse responseForDirectActionWithNameAndClass(java.lang.String actionName, java.lang.String className, java.util.Map formValueDict, java.io.InputStream contentStream, java.util.Map headers, java.util.Map userInfo, java.lang.String uriPrefix, java.lang.String appName){
        return null; //TODO codavaj!!
    }

    /**
     * Restores the WOSession object representing a session. In normal request handling, this method is invoked at the start of a cycle of the request-response loop. The default implementation simply invokes WOSessionStore's checkOutSessionWithID method, but raises an exception if the WOSessionStore object is missing. This method also posts a SessionDidRestoreNotification, with the session restored passed as a parameter (null if the session was not restored).
     */
    public com.webobjects.appserver.WOSession restoreSessionWithID(java.lang.String aSessionID, com.webobjects.appserver.WOContext aContext){
        return null; //TODO codavaj!!
    }

    /**
     * Runs the application in a near-indefinite run loop in the default run-loop mode. Before starting the run loop, the method sends registerForEvents to the application's adaptors so that they can begin receiving run-loop events. Normally, run is invoked from the main method.
     */
    public void run(){
        return; //TODO codavaj!!
    }

    /**
     * Called at the end of the request handling loop when the current session object needs to be saved. The default implementation simply invokes WOSessionStore's checkInSessionForContext method, but throws an exception if the WOSession object is missing or if there is no WOSessionStore.
     */
    public void saveSessionForContext(com.webobjects.appserver.WOContext aContext){
        return; //TODO codavaj!!
    }

    /**
     * Returns the URL to connect to the application through a servlet container. It includes the path to the WebObjects CGI adaptor and the application name. For example, http://localhost/cgi-bin/WebObjects/HelloWorld.woa. This URL is used mostly in servlet deployment mode.
     */
    public java.lang.String servletConnectURL(){
        return null; //TODO codavaj!!
    }

    /**
     * Return the string key used to obtain the session ID from a request using methods like formValueForKey(String) and cookieValueForKey(String).
     */
    public java.lang.String sessionIdKey(){
        return null; //TODO codavaj!!
    }

    /**
     * Returns the application's current WOSessionStore object. By default, an object that stores session state in process memory (that is, in the server) is used.
     */
    public com.webobjects.appserver.WOSessionStore sessionStore(){
        return null; //TODO codavaj!!
    }

    /**
     * Return the name of the class that will be used to store sessions. This method is a cover for the WOSessionStoreClassName property and has a default value of "WOServerSessionStore".
     */
    public java.lang.String sessionStoreClassName(){
        return null; //TODO codavaj!!
    }

    /**
     * Return the number of seconds for which a session may be idle before it times out. The default is 3600. This value can be overriden by: using the property WOSessionTimeOut setting the session timeOut from the Session class' constructor overriding this method.
     */
    public java.lang.Number sessionTimeOut(){
        return null; //TODO codavaj!!
    }

    /**
     * Deprecated.
     * Deprecated. Do not use.
     */
    public void setAdaptor(java.lang.String aString){
        return; //TODO codavaj!!
    }

    /**
     * Deprecated.
     * Deprecated. Do not use.
     */
    public void setAdditionalAdaptors(com.webobjects.foundation.NSArray anAdaptorArray){
        return; //TODO codavaj!!
    }

    /**
     * Explicitly specifiy whether concurrent request handling is allowed.
     */
    public void setAllowsConcurrentRequestHandling(boolean aValue){
        return; //TODO codavaj!!
    }

    /**
     * Sets to aString the path to which the current application may be found under the document root, with or without the .woa.
     */
    public void setApplicationBaseURL(java.lang.String aString){
        return; //TODO codavaj!!
    }

    /**
     * Controls whether starting up an application instance also launches a Java Client client application. If aBool is true, the application launches the client. If it is false, the application does not launch the client. Automatic launching of a browser is disabled if client application launching is active and successful. Starting the client application requires the generation of a client launch script at build time. Client application launching cannot be enabled unless there is a WOAdaptorURL key in the file NeXT_ROOT/NextLibrary/WOAdaptors/Configuration/WebServerConfig.plist.
     * The value set here will override the property WOAutoOpenClientApplication To disable client application launching, you must invoke this method in your subclass's constructor, or set the WOAutoOpenClientApplication property to false. Must be called from the your WOApplication subclass' constructor to have effect.
     */
    public void setAutoOpenClientApplication(boolean aBool){
        return; //TODO codavaj!!
    }

    /**
     * Controls whether starting up this application also launches a web browser. If aBool is true, the application launches the web browser. If false, the application does not launch the browser. Browser launching is enabled by default as long as there is a WOAdaptorURL key in the file NeXT_ROOT/Library/WOAdaptors/Configuration/WebServerConfig.plist.
     * To disable web browser launching, you must invoke this method in your subclass's constructor, or set the WOAutoOpenInBrowser property to false. Must be called from the your WOApplication subclass' constructor to have effect.
     */
    public void setAutoOpenInBrowser(boolean aBool){
        return; //TODO codavaj!!
    }

    /**
     * Sets whether or not component caching is enabled. If this is enabled, changes to a component will be reparsed after being saved, assuming the project is under the NSProjectSearchPath. Note that this has no effect on page caching.
     */
    public void setCachingEnabled(boolean aBool){
        return; //TODO codavaj!!
    }

    /**
     * Sets the URL through the web server to aString. The URL must include the path to the WebObjects CGI adaptor: for example, http://localhost/cgi-bin/WebObjects.
     * This URL is used by the direct connect feature only.
     */
    public void setCGIAdaptorURL(java.lang.String aString){
        return; //TODO codavaj!!
    }

    /**
     * Deprecated.
     * Deprecated, do not use.
     */
    public void setComponentRequestHandlerKey(java.lang.String aString){
        return; //TODO codavaj!!
    }

    /**
     * Sets the name of the WOContext subclass class.
     */
    public void setContextClassName(java.lang.String name){
        return; //TODO codavaj!!
    }

    /**
     * Sets the default request handler.
     */
    public void setDefaultRequestHandler(com.webobjects.appserver.WORequestHandler aRequestHandler){
        return; //TODO codavaj!!
    }

    /**
     * Set the limit size for the undo stack for a session's default editing context. The default is 10.
     */
    public void setDefaultUndoStackLimit(int stackLimit){
        return; //TODO codavaj!!
    }

    /**
     * Deprecated.
     * Deprecated, do not use.
     */
    public void setDirectActionRequestHandlerKey(java.lang.String aString){
        return; //TODO codavaj!!
    }

    /**
     * Deprecated.
     * Deprecated, do not use.
     */
    public void setDirectConnectEnabled(boolean aBool){
        return; //TODO codavaj!!
    }

    /**
     * Sets aString as the path under which all frameworks can be found inside the document root. This value is used to determine URLs that should be generated to reference Web Server Resources in those frameworks.
     */
    public void setFrameworksBaseURL(java.lang.String aString){
        return; //TODO codavaj!!
    }

    /**
     * Sets whether or not HTML comments are appended to the response.
     */
    public void setIncludeCommentsInResponses(boolean aBool){
        return; //TODO codavaj!!
    }

    /**
     * Set the JMX domain.
     */
    public void setJMXDomain(java.lang.String aName){
        return; //TODO codavaj!!
    }

    /**
     * Deprecated.
     * Deprecated, do not use.
     */
    public void setListenQueueSize(java.lang.Number listenQueueSize){
        return; //TODO codavaj!!
    }

    /**
     * Deprecated.
     * Deprecated, do not use.
     */
    public void setLoadFrameworks(com.webobjects.foundation.NSArray anArray){
        return; //TODO codavaj!!
    }

    /**
     * Deprecated.
     * Deprecated, do not use.
     */
    public void setMaxSocketIdleTime(java.lang.Number maxSocketIdleTime){
        return; //TODO codavaj!!
    }

    /**
     * Sets the minimum number of active sessions to aVal. The default value is 0.
     * Use this method in conjunction with refuseNewSessions to gracefully shut down application instances. If the active sessions count reaches the minimum active session count and isRefusingNewSessions returns true, the application terminates. It may be desirable to terminate application instances periodically for performance reasons; some applications leak a certain amount of memory per transaction, and shutting down and restarting instances of those applications can free up that memory.
     */
    public void setMinimumActiveSessionsCount(int aVal){
        return; //TODO codavaj!!
    }

    /**
     * Sets the value of the WOMonitorEnabled property.
     */
    public void setMonitorEnabled(boolean aBool){
        return; //TODO codavaj!!
    }

    /**
     * Deprecated.
     * This method does nothing.
     */
    public void setMonitorHost(java.lang.String aString){
        return; //TODO codavaj!!
    }

    /**
     * Set the WOMLNamespaceProvider
     */
    public void setNamespaceProvider(com.webobjects.appserver.parser.woml.WOMLNamespaceProvider value){
        return; //TODO codavaj!!
    }

    /**
     * Sets the number of page instances the cache will hold. Disable page caching by passing 0 for anUnsigned. Pages that require state must be cached in order to access that state for the very next request. If you have components that hold state (which is the usual case), disable page caching by passing 1 for anUnsigned.
     */
    public void setPageCacheSize(int anUnsigned){
        return; //TODO codavaj!!
    }

    /**
     * Sets the number of page fragments the cache will hold. Disable page fragments caching by passing 0 for anUnsigned. Pages fragments that require state must be cached in order to access that state for the very next request. If you have components that hold state (which is the usual case), disable page caching by passing 1 for anUnsigned.
     */
    public void setPageFragmentCacheSize(int anUnsigned){
        return; //TODO codavaj!!
    }

    /**
     * When aFlag is true, disables caching of pages by the client by setting the page's expiration-time header to the current date and time. By default, this attribute is set to true. Disabling of client caching affects what happens during backtracking. With client caching disabled, the browser resends the URL to the server for the page requested by backtracking. The application will then return a new page to the browser (corresponding to a new WOComponent instance). This behavior is desirable when you do not want the user to backtrack to a page that might be obsolete because of changes that have occurred in the session.
     * When this flag is turned on and a request corresponding to a client backtrack occurs, the retrieved page will only be asked to regenerate its response. The first two phases of a normal request-response loop (value extraction from the request and action invocation) do not occur.
     */
    public void setPageRefreshOnBacktrackEnabled(boolean aFlag){
        return; //TODO codavaj!!
    }

    /**
     * Sets the permanentPageCacheSize to anUnsigned. Setting the size to 0 disables the permanent page cache.
     */
    public void setPermanentPageCacheSize(int anUnsigned){
        return; //TODO codavaj!!
    }

    /**
     * Deprecated.
     * Deprecated, do not use.
     */
    public void setPort(java.lang.Number port){
        return; //TODO codavaj!!
    }

    /**
     * Deprecated.
     * Deprecated. Does nothing.
     */
    public void setPrintsHTMLParserDiagnostics(boolean aBOOL){
        return; //TODO codavaj!!
    }

    /**
     * Sets the array of file system paths which are searched for projects for rapid turnaround mode.
     */
    public void setProjectSearchPath(com.webobjects.foundation.NSArray aPathArray){
        return; //TODO codavaj!!
    }

    /**
     * Sets the file system path to where the recording information should be saved. Use null as the path if you don't want to save recording information. By default, recording information is not saved.
     * If you save recording information, all requests and responses are recorded in the HTTP format in numbered files: 0000-request, 0000-response, 0001-request, 0001-response, etc, and saved under the recording path specified. This directory is then used by the Playback tool to test the application. You will most likely set this as a command line argument -WORecordingPath pathname, exercise your application to record a scenario you would like to test, and then stop the application. Afterwards you can restart the application without the WORecordingPath argument, and point Playback to the recording directory just created to replay your sequence of requests and compare the responses received with the ones recorded.
     */
    public void setRecordingPath(java.lang.String aString){
        return; //TODO codavaj!!
    }

    /**
     * Deprecated.
     * Do not use this method. Use createResourceManager to replace the default WOResourceManager implementation with your own.
     */
    public void setResourceManager(com.webobjects.appserver.WOResourceManager aResourceManager){
        return; //TODO codavaj!!
    }

    /**
     * Deprecated.
     * Deprecated, do not use.
     */
    public void setResourceRequestHandlerKey(java.lang.String aString){
        return; //TODO codavaj!!
    }

    /**
     * Set the session-store object for the application. By default, an object that stores session state in process memory (that is, in the server) is used. The session-store object specifies the state storage strategy for the whole application. This object is responsible for making session objects persistent. You should set the session store object when the application starts up, before the first request is handled.
     */
    public void setSessionStore(com.webobjects.appserver.WOSessionStore aSessionStore){
        return; //TODO codavaj!!
    }

    /**
     * Sets the name of the session store class to the specified name. The value specified to this method takes precedence over the WOSessionStoreClassName property.
     */
    public void setSessionStoreClassName(java.lang.String aString){
        return; //TODO codavaj!!
    }

    /**
     * Set the interval, in seconds, during which a session may be idle before it times out. The default is 3600.
     */
    public void setSessionTimeOut(java.lang.Number timeOut){
        return; //TODO codavaj!!
    }

    /**
     * Sets the name of the host that will be used to send e-mail messages created by WOMailDelivery.
     */
    public void setSMTPHost(java.lang.String aString){
        return; //TODO codavaj!!
    }

    /**
     * Deprecated.
     * Deprecated, do not use.
     */
    public void setSocketCacheSize(java.lang.Number socketCacheSize){
        return; //TODO codavaj!!
    }

    /**
     * Deprecated.
     * Sets the length of time in milliseconds that the socket monitor will sleep in order to allow the worker threads to operate. If you don't invoke this method, the value of the WOSocketMonitorSleepTime key will be used; the default value for this key is 50 milliseconds.
     */
    public void setSocketMonitorSleepTime(java.lang.Number socketMonitorSleepTime){
        return; //TODO codavaj!!
    }

    /**
     * Sets the WOStatisticsStore object to aStatisticsStore. WOStatisticsStore objects record application statistics while the application runs.
     */
    public void setStatisticsStore(com.webobjects.appserver.WOStatisticsStore aStatisticsStore){
        return; //TODO codavaj!!
    }

    /**
     * Sets the number of seconds the application can experience inactivity before it terminates execution.
     */
    public void setTimeOut(double aTimeInterval){
        return; //TODO codavaj!!
    }

    /**
     * Deprecated.
     * Deprecated, do not use.
     */
    public void setWebServiceRequestHandlerKey(java.lang.String aString){
        return; //TODO codavaj!!
    }

    /**
     * Deprecated.
     * This method no longer does anything.
     */
    public void setWorkerThreadCount(java.lang.Number threadCount){
        return; //TODO codavaj!!
    }

    /**
     * Sets the value of the property WOWorkerThreadCountMax. Generally, by the time this can be called, the WODefaultAdaptor has already been initialized. However, if you have custom or additional adaptors, this method might be useful. If the WODefaultAdaptor is initialized when this property is <= 0, there is no upper limit to the number of worker threads it will create.
     */
    public void setWorkerThreadCountMax(java.lang.Number threadCount){
        return; //TODO codavaj!!
    }

    /**
     * Sets the value of the property WOWorkerThreadCountMin. Generally, by the time this can be called, the WODefaultAdaptor has already been initialized. However, if you have custom or additional adaptors, this method might be useful.
     */
    public void setWorkerThreadCountMin(java.lang.Number threadCount){
        return; //TODO codavaj!!
    }

    /**
     * Deprecated.
     * This is a convenience method that returns the default shared editing context.
     */
    public com.webobjects.eocontrol.EOSharedEditingContext sharedEditingContext(){
        return null; //TODO codavaj!!
    }

    /**
     * This is a delegate method for the developer to override for custom behavior. If an application receives a request with a "clean" URL (i.e. with nothing after the application name) and the sessionID is stored in a cookie, this method is invoked to determine if the session should be restored using the stored session ID. If Servlet integration is being used, this determines if an existing JSP/Servlet session should be invalidated when receiving a request with a "clean" URL. This method defaults to returning false, so that existing WOSessions will not be restored, and any JSP/Servlet sessions will be invalidated.
     */
    public boolean shouldRestoreSessionOnCleanEntry(com.webobjects.appserver.WORequest aRequest){
        return false; //TODO codavaj!!
    }

    /**
     * Invoked at the conclusion of a request-handling cycle to give an application the opportunity for releasing references to objects created and initialized in its awake method. The default implementation does nothing.
     */
    public void sleep(){
        return; //TODO codavaj!!
    }

    /**
     * Returns the name of the host that will be used to send e-mail messages created by WOMailDelivery. This is a cover method for the property WOSMTPHost.
     */
    public java.lang.String SMTPHost(){
        return null; //TODO codavaj!!
    }

    /**
     * Deprecated.
     * Deprecated, do not use.
     */
    public java.lang.Number socketCacheSize(){
        return null; //TODO codavaj!!
    }

    /**
     * Deprecated.
     * Returns a Number indicating the length of time (in milliseconds) that the socket monitor will sleep in order to allow the worker threads to operate. The default is 50 milliseconds.
     */
    public java.lang.Number socketMonitorSleepTime(){
        return null; //TODO codavaj!!
    }

    /**
     * Returns a copy of the dictionary containing the application statistics maintained by WOStatisticsStore. This method is used by the Monitor application to retrieve application statistics. If you need to access the statistics internally, use the following instead:
     * WOApplication.application().statisticsStore().statistics()
     */
    public com.webobjects.foundation.NSDictionary statistics(){
        return null; //TODO codavaj!!
    }

    /**
     * Returns the WOStatisticsStore object, which records statistics while the application runs.
     */
    public com.webobjects.appserver.WOStatisticsStore statisticsStore(){
        return null; //TODO codavaj!!
    }

    /**
     * Returns the key which identifies URLs directed at Stream based requests. By default, this method returns the string "wis".
     */
    public java.lang.String streamActionRequestHandlerKey(){
        return null; //TODO codavaj!!
    }

    /**
     * Conformance to NSKeyValueCoding. Sets the value of the property identified by key to value.
     */
    public void takeValueForKey(java.lang.Object value, java.lang.String key){
        return; //TODO codavaj!!
    }

    /**
     * Conformance to NSKeyValueCodingAdditions. Sets the property identified by keyPath to value. The key path has the form relationship.property, with one or more relationships. This method retrieves the destination object for each relationship using valueForKey, and invokes the method takeValueForKey on the final object.
     */
    public void takeValueForKeyPath(java.lang.Object value, java.lang.String keyPath){
        return; //TODO codavaj!!
    }

    /**
     * WOComponentRequestHandler invokes this method on WOApplication to initiate the first phase of request handling. In this phase, takeValuesFromRequest is propagated to the session and component objects involved in the request as well as the request page's dynamic elements. Each dynamic element acquires any entered data or changed state (such as a check in a check box) associated with an attribute and assigns the value to the variable bound to the attribute. The default WOApplication implementation of this method invokes takeValuesFromRequest on the session object.
     */
    public void takeValuesFromRequest(com.webobjects.appserver.WORequest aRequest, com.webobjects.appserver.WOContext aContext){
        return; //TODO codavaj!!
    }

    /**
     * Terminates the application process. Termination does not take place until the handling of the current request has completed.
     */
    public void terminate(){
        return; //TODO codavaj!!
    }

    /**
     * Deprecated.
     */
    public void terminateAfterTimeInterval(double aTimeInterval){
        return; //TODO codavaj!!
    }

    /**
     * Returns the application's time-out interval: a period (in seconds) of inactivity after which the application will terminate execution. The default application time-out interval is a very large number.
     */
    public double timeOut(){
        return 0.0d; //TODO codavaj!!
    }

    /**
     * Returns a String containing a string representation of the receiver.
     */
    public java.lang.String toString(){
        return null; //TODO codavaj!!
    }

    /**
     * Conformance to NSKeyValueCoding.ErrorHandling. This method is invoked from takeValueForKey when it is given a null value for a scalar property such as an int or a float. WOApplication's implementation always throws an java.lang.IllegalArgumentException.
     */
    public void unableToSetNullForKey(java.lang.String key){
        return; //TODO codavaj!!
    }

    /**
     * Deprecated.
     */
    public void unlock(){
        return; //TODO codavaj!!
    }

    /**
     * Unregister a MBean given its ObjectName, a convenience method.
     */
    public void unregisterMBean(javax.management.ObjectName aName){
        return; //TODO codavaj!!
    }

    /**
     * Appends a validation failed message to NSLog.err. If debugging is enabled, also logs more detailed information on NSLog.debug.
     */
    public void validationFailedWithException(java.lang.Throwable t, java.lang.Object value, java.lang.String keyPath, com.webobjects.appserver.WOComponent component, com.webobjects.appserver.WOSession session){
        return; //TODO codavaj!!
    }

    /**
     * Conformance to NSKeyValueCoding. Returns the value of the property identified by key.
     */
    public java.lang.Object valueForKey(java.lang.String key){
        return null; //TODO codavaj!!
    }

    /**
     * Conformance to NSKeyValueCodingAdditions. Returns the receiver's value for the derived property identified by keyPath. The key path has the form relationship.property, with one or more relationships. This method retrieves the destination object for each relationship using valueForKey, and returns the result of invoking valueForKey on the final object.
     */
    public java.lang.Object valueForKeyPath(java.lang.String keyPath){
        return null; //TODO codavaj!!
    }

    /**
     * Used to determine if the WO application was started standalone or not. In particular, applications running in a Servlet Container will return false.
     */
    public boolean wasMainInvoked(){
        return false; //TODO codavaj!!
    }

    /**
     * Returns the URL to connect to the application through the web server and WOAdaptors. It includes the path to the WebObjects CGI adaptor, the application name, and a negative port number. For example, http://localhost/cgi-bin/WebObjects/HelloWorld.woa/-4444. The negative port number ensures that using this URL returns to the specific application that created it in a load-balancing scenario. This URL is used mostly to test deployment mode on a development system.
     */
    public java.lang.String webserverConnectURL(){
        return null; //TODO codavaj!!
    }

    /**
     * Returns the key which identifies URLs directed at Web services. By default, this method returns the string "ws". This is a cover for the system property _WebServiceRequestHandlerKey.
     */
    public java.lang.String webServiceRequestHandlerKey(){
        return null; //TODO codavaj!!
    }

    /**
     * Deprecated.
     * This method no longer does anything.
     */
    public java.lang.Number workerThreadCount(){
        return null; //TODO codavaj!!
    }

    /**
     * Returns the number of worker threads the default adaptor will create startup. This method is a cover for the property WOWorkerThreadCountMax. Generally, by the time this can be called, the WODefaultAdaptor has already been initialized. However, if you have custom or additional adaptors, this method might be useful.
     */
    public java.lang.Number workerThreadCountMax(){
        return null; //TODO codavaj!!
    }

    /**
     * Returns the number of worker threads the default adaptor will create at startup. This method is a cover for the property WOWorkerThreadCountMin. Generally, by the time this can be called, the WODefaultAdaptor has already been initialized. However, if you have custom or additional adaptors, this method might be useful.
     */
    public java.lang.Number workerThreadCountMin(){
        return null; //TODO codavaj!!
    }

    /**
     * This is a subclass of WOEvent used by the WebObjects runtime to collect pageWithName events.
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
         * Returns the name of a WebObjects component to use to display the receiver's logging information. This implementation uses the WOEventRow component.
         */
        public java.lang.String displayComponentName(){
            return null; //TODO codavaj!!
        }

    }
}

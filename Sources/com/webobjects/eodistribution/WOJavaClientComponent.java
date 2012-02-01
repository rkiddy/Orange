package com.webobjects.eodistribution;
/**
 * WOJavaClientComponent is the web component used by Java Client applications in connection with Web Start or other desktop applications installed on client machines. It passes on several parameters including the codebase and EOApplication specific parameters like the initial EOInterfaceController subclass name and language.
 * WOJavaClientComponent is used on the server side to determine the EOApplication specific parameters and to handle the communication with the client application. The bindings of the WOJavaClientComponent are the single place where the client side arguments are configured, independent of the deployment mechanism of the client desktop application (Web Start, preinstalled desktop application).
 * WOJavaClientComponents sends the values of all bindings to the client application, even if you add additional bindings. The values of these bindings will be available on the client side through the arguments method of the EOApplication instance. Thus you can use the WOJavaClientComponent to create arguments for the client.
 * The following bindings are used by all Java Client desktop applications:
 * The following bindings are used to generate Web Start specific information:
 * The following bindings are used only by clients not started through WebStart (preinstalled desktop applications):
 * The following bindings are special:
 * See Also:Serialized Form
 */
public class WOJavaClientComponent extends com.webobjects.appserver.WOComponent{
    /**
     * The name of the applicationClassName binding.
     * See Also:Constant Field Values
     */
    public static final java.lang.String ApplicationClassNameKey="applicationClassName";

    /**
     * The name of the applicationDescription binding.
     * See Also:Constant Field Values
     */
    public static final java.lang.String ApplicationDescriptionKey="applicationDescription";

    /**
     * The name of the applicationIcon binding.
     * See Also:Constant Field Values
     */
    public static final java.lang.String ApplicationIconKey="applicationIcon";

    /**
     * The name of the applicationName binding.
     * See Also:Constant Field Values
     */
    public static final java.lang.String ApplicationNameKey="applicationName";

    /**
     * The name of the client side parameter containing the application URL.
     * See Also:Constant Field Values
     */
    public static final java.lang.String ApplicationURLKey="applicationURL";

    /**
     * The name of the channelClassName binding.
     * See Also:Constant Field Values
     */
    public static final java.lang.String ChannelClassNameKey="channelClassName";

    /**
     * The name of bundle info plist key looked up in all bundles to find the names of the client side principal classes.
     * See Also:Constant Field Values
     */
    public static final java.lang.String ClientPrincipalClassBundleInfoKey="NSClientPrincipalClass";

    /**
     * The name of the codebase binding.
     * See Also:Constant Field Values
     */
    public static final java.lang.String CodebaseKey="codebase";

    /**
     * The name of the client side parameter containing the component URL of the WOJavaClientComponent.
     * See Also:Constant Field Values
     */
    public static final java.lang.String ComponentURLKey="componentURL";

    /**
     * The name of the notification sent when the WOJavaClientComponent determines its component URL.
     * See Also:Constant Field Values
     */
    public static final java.lang.String DidVendComponentURLNotification="WOJavaClientComponentDidVendComponentURLNotification";

    /**
     * The name of the distributionContext binding.
     * See Also:Constant Field Values
     */
    public static final java.lang.String DistributionContextKey="distributionContext";

    /**
     * The name of the downloadClientClasses binding.
     * See Also:Constant Field Values
     */
    public static final java.lang.String DownloadClientClassesKey="downloadClientClasses";

    /**
     * The name of the downloadClientClassURLs binding.
     * See Also:Constant Field Values
     */
    public static final java.lang.String DownloadClientClassURLsKey="downloadClientClassURLs";

    /**
     * The name of the homepage binding.
     * See Also:Constant Field Values
     */
    public static final java.lang.String HomepageKey="homepage";

    /**
     * The name of the interfaceControllerClassName binding.
     * See Also:Constant Field Values
     */
    public static final java.lang.String InterfaceControllerClassNameKey="interfaceControllerClassName";

    /**
     * The name of the j2seVersion binding.
     * See Also:Constant Field Values
     */
    public static final java.lang.String J2SEVersionKey="j2seVersion";

    /**
     * The name of the jarFileNames binding.
     * See Also:Constant Field Values
     */
    public static final java.lang.String JarFilesNamesKey="jarFileNames";

    /**
     * The name of the JNLPComponentName binding.
     * See Also:Constant Field Values
     */
    public static final java.lang.String JNLPComponentNameKey="JNLPComponentName";

    /**
     * The name of the language binding.
     * See Also:Constant Field Values
     */
    public static final java.lang.String LanguageKey="language";

    /**
     * The name of the needsAllPermissions binding.
     * See Also:Constant Field Values
     */
    public static final java.lang.String NeedsAllPermissionsKey="needsAllPermissions";

    /**
     * A public variable used in a repetition to create a list of all non-standard bindings.
     */
    public java.lang.String otherParameterName;

    /**
     * The name of the principalClassNames binding.
     * See Also:Constant Field Values
     */
    public static final java.lang.String PrincipalClassNamesKey="principalClassNames";

    /**
     * The name of the client side parameter containing the session ID.
     * See Also:Constant Field Values
     */
    public static final java.lang.String SessionIDKey="sessionID";

    /**
     * The name of the splashIconName binding.
     * See Also:Constant Field Values
     */
    public static final java.lang.String SplashIconNameKey="splashIconName";

    /**
     * The name of the splashIconURL binding.
     * See Also:Constant Field Values
     */
    public static final java.lang.String SplashIconURLKey="splashIconURL";

    /**
     * The name of the temporaryGIDBase binding.
     * See Also:Constant Field Values
     */
    public static final java.lang.String TemporaryGIDBaseKey="temporaryGIDBase";

    /**
     * The name of the vendor binding.
     * See Also:Constant Field Values
     */
    public static final java.lang.String VendorKey="vendor";

    /**
     * Creates a new WOJavaClientComponent in a given context.
     * Parameters:context - the WebObjects context for the WOJavaClientComponent
     */
    public WOJavaClientComponent(com.webobjects.appserver.WOContext context){
         //TODO codavaj!!
    }

    /**
     * Overridden for internal purposes. You should never invoke this method directly or override it.
     */
    public void appendToResponse(com.webobjects.appserver.WOResponse response, com.webobjects.appserver.WOContext context){
        return; //TODO codavaj!!
    }

    /**
     * Returns the value of the applicationClassName binding. If specified, determines the class used for the EOApplication instance on the client side.
     */
    public java.lang.String applicationClassName(){
        return null; //TODO codavaj!!
    }

    /**
     * Returns a description of the application. If the receiver has an applicationDescription binding, the value of that binding is returned. Otherwise, "WebObjects Java Client Application" is used.
     */
    public java.lang.String applicationDescription(){
        return null; //TODO codavaj!!
    }

    /**
     * Returns the value of the applicationIcon binding. If specified, the value will be used for specifying an icon for the application used by Web Start.
     */
    public java.lang.String applicationIcon(){
        return null; //TODO codavaj!!
    }

    /**
     * Returns the name used for client applications. If the receiver has an applicationName binding, the value of that binding is returned. Otherwise, the name of the WebObjects (server) application is used.
     */
    public java.lang.String applicationName(){
        return null; //TODO codavaj!!
    }

    /**
     * Returns a string containing the application URL the client uses to communicate with the WOJavaClientComponent.
     */
    public java.lang.String applicationURL(){
        return null; //TODO codavaj!!
    }

    /**
     * Returns the value of the channelClassName binding. If specified, determines the class used for the distribution channel on the client side. Otherwise, a standard Java Client HTTP channel is used by the client.
     */
    public java.lang.String channelClassName(){
        return null; //TODO codavaj!!
    }

    /**
     * Returns a dictionary with the values of all the client bindings that have been set. This method is used by Java Client applications to get all the arguments.
     */
    public com.webobjects.foundation.NSDictionary clientSideRequestApplicationParameters(){
        return null; //TODO codavaj!!
    }

    /**
     * Returns the codebase to be used by Java Client applications. If the receiver has a codebase binding, the value of that binding is returned. Otherwise, this method returns a URL to look up Java classes from the resource manager appropriate for all types of deployment (web server, direct connect, etc.).
     */
    public java.lang.String codebase(){
        return null; //TODO codavaj!!
    }

    /**
     * Returns a string containing the receiver's component URL.
     */
    public java.lang.String componentURL(){
        return null; //TODO codavaj!!
    }

    /**
     * This method is used in combination with the downloadClientClasses binding. Returns an array with the names of all client classes from all custom (not standard WebObjects) bundles (main bundle and frameworks) used by the application.
     */
    public com.webobjects.foundation.NSArray customBundlesClientClasses(){
        return null; //TODO codavaj!!
    }

    /**
     * This method is used in combination with the downloadClientClasses binding. Returns an array with the names of all client classes from all custom (not standard WebObjects) frameworks used by the application.
     */
    public com.webobjects.foundation.NSArray customFrameworksClientClasses(){
        return null; //TODO codavaj!!
    }

    /**
     * Returns the distribution context used by this component. The distribution context is the object that handles all client requests.
     */
    public com.webobjects.eodistribution.EODistributionContext distributionContext(){
        return null; //TODO codavaj!!
    }

    /**
     * Returns an array of classes to be downloaded to desktop application clients before they start.
     */
    public com.webobjects.foundation.NSArray downloadClientClasses(){
        return null; //TODO codavaj!!
    }

    /**
     * Returns an array of URLs to downloaded client classes for desktop application clients.
     */
    public com.webobjects.foundation.NSArray downloadClientClassURLs(){
        return null; //TODO codavaj!!
    }

    /**
     * Using the receiver's distribution context, generates a response for a client request.
     */
    public com.webobjects.appserver.WOActionResults handleClientRequest(){
        return null; //TODO codavaj!!
    }

    /**
     * Returns the URL for the client application's home page. If the receiver has a homepage binding, the value of that binding is returned. Otherwise, the application URL is used.
     */
    public java.lang.String homepage(){
        return null; //TODO codavaj!!
    }

    /**
     * Returns the value of the interfaceControllerClassName binding. If specified, the client automatically instantiates an interface controller of the specified class and displays its user interface while starting up.
     */
    public java.lang.String interfaceControllerClassName(){
        return null; //TODO codavaj!!
    }

    /**
     * Overridden for internal purposes to dispatch Java Client requests. You should never invoke this method directly or override it.
     */
    public com.webobjects.appserver.WOActionResults invokeAction(com.webobjects.appserver.WORequest request, com.webobjects.appserver.WOContext context){
        return null; //TODO codavaj!!
    }

    /**
     * Returns the value of the j2seVersion binding. If specified, the value will be used for specifying the version of the J2SE for Web Start to run the application with.
     */
    public java.lang.String j2seVersion(){
        return null; //TODO codavaj!!
    }

    /**
     * Returns the names of all jar files to be downloaded by Web Start for the client application. If the receiver has a jarFileNames binding, the value of that binding is returned. Otherwise, the list of jar files is derived by looking up all client jar files of all bundles of the application.
     */
    public com.webobjects.foundation.NSArray jarFileNames(){
        return null; //TODO codavaj!!
    }

    /**
     * Returns the name of the WebObjects component used to generate the JNLP information to start the client application through Web Start. If the receiver has a JNLPComponentName binding, the value of that binding is returned. Otherwise, the WOJavaClientJNLP class is used.
     */
    public java.lang.String JNLPComponentName(){
        return null; //TODO codavaj!!
    }

    /**
     * Returns the value of the language binding. If specified, the client automatically uses this language as the preferred language.
     */
    public java.lang.String language(){
        return null; //TODO codavaj!!
    }

    /**
     * This method is used in combination with the downloadClientClasses binding. Returns an array with the names of all client classes from the main bundle of the application.
     */
    public com.webobjects.foundation.NSArray mainBundleClientClasses(){
        return null; //TODO codavaj!!
    }

    /**
     * Returns whether the application needs all permissions (versus running in an applet-like sandbox). If the receiver has a needsAllPermissions binding, the value of that binding is returned. The default is false.
     */
    public boolean needsAllPermissions(){
        return false; //TODO codavaj!!
    }

    /**
     * This method is used in combination with the downloadClientClasses binding. Returns an empty array to indicate that no classes should be downloaded to desktop application clients.
     */
    public com.webobjects.foundation.NSArray noDownloadClientClasses(){
        return null; //TODO codavaj!!
    }

    /**
     * Returns the names of all principal classes for the client side. These classes will be explicitly initialized when the application starts up. If the receiver has a principalClassNames binding, the value of that binding is returned. Otherwise, the list of principal classes is derived by looking up the "NSClientPrincipalClass" key in all info plist files of all bundles of the application.
     * This method (and thus the principalClassNames binding) must return either an NSArray containing all principal class names or a single String with all principal class names, separated by a space character.
     */
    public java.lang.Object principalClassNames(){
        return null; //TODO codavaj!!
    }

    /**
     * Returns a string containing the receiver's session ID.
     */
    public java.lang.String sessionID(){
        return null; //TODO codavaj!!
    }

    /**
     * Returns the value of the splashIconName binding. The splash icon is displayed in a window during client startup. You can also specify the splash icon with an URL.
     */
    public java.lang.String splashIconName(){
        return null; //TODO codavaj!!
    }

    /**
     * Returns the value of the splashIconURL binding. The splash icon is displayed in a window during client startup. You can also specify the splash icon with a name.
     */
    public java.lang.String splashIconURL(){
        return null; //TODO codavaj!!
    }

    /**
     * Overridden from the superclass to return false.
     */
    public boolean synchronizesVariablesWithBindings(){
        return false; //TODO codavaj!!
    }

    /**
     * Returns a value used to generate unique values for temporary global IDs. Do not touch this value.
     */
    public java.lang.String temporaryGIDBase(){
        return null; //TODO codavaj!!
    }

    /**
     * Returns the name of the vendor of the application. If the receiver has a vendor binding, the value of that binding is returned. Otherwise, "Unspecified Vendor" is used.
     */
    public java.lang.String vendor(){
        return null; //TODO codavaj!!
    }

    /**
     * This static method returns the URL for calling a direct action which returns the JNLP file that initiates the WebStart download/update by the web browser. The entry web site for the client application should provide a link directing the web browser to this URL. In order to support multiple JNLP file settings and/or multiple applications, the page parameter can specify different pages (each having a different WOJavaClientComponent with its own bindings). If no page is specified, first the page name "JavaClient" and then "Main" will be looked for.
     */
    public static java.lang.String webStartActionURL(com.webobjects.appserver.WOContext context, java.lang.String pageName){
        return null; //TODO codavaj!!
    }

}

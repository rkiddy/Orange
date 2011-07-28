
package com.webobjects.eodistribution;

import com.webobjects.appserver.*;
import com.webobjects.appserver._private.*;
import com.webobjects.eocontrol.EOTemporaryGlobalID;
import com.webobjects.foundation.*;


public class WOJavaClientComponent extends WOComponent
    implements _PermanentCacheSingleton {


    public static String webStartActionURL(WOContext context, String pageName) { return null; }

    public static WOComponent _newJavaClientPage(WODirectAction directAction, String pageName) { return null; }

    public WOJavaClientComponent(WOContext context) { return null; }

    public boolean synchronizesVariablesWithBindings() { return true; }

    public WOActionResults invokeAction(WORequest request, WOContext context) { return null; }

    public void appendToResponse(WOResponse response, WOContext context) {}

    private void _generateBindingInfo() {}

    public String componentURL() { return null; }

    public String applicationURL() { return null; }

    public String sessionID() { return null; }

    public EODistributionContext distributionContext() { return null; }

    private boolean _isUsingWebServer() { return true; }

    public String codebase() { return null; }

    public String applicationName() { return null; }

    public String vendor() { return null; }

    public String homepage() { return null; }

    public String applicationDescription() { return null; }

    public String applicationIcon() { return null; }

    public String j2seVersion() { return null; }

    public boolean needsAllPermissions() { return true; }

    public String JNLPComponentName() { return null; }

    public String interfaceControllerClassName() { return null; }

    public String applicationClassName() { return null; }

    public String channelClassName() { return null; }

    public String splashIconName() { return null; }

    public String splashIconURL() { return null; }

    public String language() { return null; }

    public Object principalClassNames() { return null; }

    private void _appendByteRepresentationToStringBuffer(byte bytes[], StringBuffer buffer) {}

    public String temporaryGIDBase() { return null; }

    public NSArray downloadClientClasses() { return null; }

    public NSArray downloadClientClassURLs() { return null; }

    public NSArray noDownloadClientClasses() { return null; }

    static synchronized void _prepareBundleCaches() { return null; }

    public NSArray jarFileNames() { return null; }

    static void _bundlesClientClasses(WORequest request, String applicationURL, NSArray deployedBundles, NSMutableSet downloadClassNames, NSMutableArray downloadURLs) {}

    private NSArray _clientClassesForBundlesAndKey(NSArray deployedBundles, String key) { return null; }

    public NSArray mainBundleClientClasses() { return null; }

    public NSArray customFrameworksClientClasses() { return null; }

    public NSArray customBundlesClientClasses() { return null; }

    public NSDictionary _potentialCommandLineArguments() { return null; }

    public NSDictionary clientSideRequestApplicationParameters() { return null; }

    public WOActionResults handleClientRequest() { return null; }

    static  {}

    private static final long serialVersionUID = 0xb4598c40L;
    public static final String CodebaseKey = "codebase";
    public static final String DistributionContextKey = "distributionContext";
    public static final String InterfaceControllerClassNameKey = "interfaceControllerClassName";
    public static final String ApplicationClassNameKey = "applicationClassName";
    public static final String PrincipalClassNamesKey = "principalClassNames";
    public static final String SplashIconNameKey = "splashIconName";
    public static final String SplashIconURLKey = "splashIconURL";
    public static final String LanguageKey = "language";
    public static final String ChannelClassNameKey = "channelClassName";
    public static final String TemporaryGIDBaseKey = "temporaryGIDBase";
    public static final String DownloadClientClassesKey = "downloadClientClasses";
    public static final String DownloadClientClassURLsKey = "downloadClientClassURLs";
    public static final String ApplicationNameKey = "applicationName";
    public static final String VendorKey = "vendor";
    public static final String HomepageKey = "homepage";
    public static final String ApplicationDescriptionKey = "applicationDescription";
    public static final String ApplicationIconKey = "applicationIcon";
    public static final String J2SEVersionKey = "j2seVersion";
    public static final String NeedsAllPermissionsKey = "needsAllPermissions";
    public static final String JarFilesNamesKey = "jarFileNames";
    public static final String JNLPComponentNameKey = "JNLPComponentName";
    public static final String ApplicationURLKey = "applicationURL";
    public static final String ComponentURLKey = "componentURL";
    public static final String SessionIDKey = "sessionID";
    public static final String _PotentialCommmandLineArgumentsKey = "_potentialCommmandLineArguments";
    public static final String ClientPrincipalClassBundleInfoKey = "NSClientPrincipalClass";
    static final String _ClientPrincipalClassNameSeparator = " ";
    public static final String DidVendComponentURLNotification = "WOJavaClientComponentDidVendComponentURLNotification";
    static final char _TemporaryGIDBaseSeparator = 61;
    static final char _TemporaryGIDBaseValueSeparator = 43;
    private static final String _DefaultVendor = "Unspecified Vendor";
    static final String _DefaultApplicationName = "Java Client";
    private static final String _DefaultApplicationDescription = "WebObjects Java Client Application";
    static final String _EONoDownloadFrameworksKey = "_EONoDownloadFrameworks";
    private static final String _EODefaultJarKey = "_EODefaultJar";
    private static final String _EOMainJarFrameworkKey = "_EOMainJarFramework";
    private static final String _EODefaultJarFrameworkKey = "_EODefaultJarFramework";
    protected static final String _JavaClientMessageMimeType = "x-eojavaclient-message";
    private static final NSArray _standardParameters;
    private static final NSArray _requiredParameters;
    private static final NSArray _serverOnlyParameters;
    static byte _temporaryGIDBaseCounterLow;
    static byte _temporaryGIDBaseCounterHigh;
    static String _defaultJarFileName;
    static NSMutableArray _jarFileDeployedBundles;
    static NSMutableArray _mainBundleDeployedBundles;
    static NSMutableArray _customFrameworksDeployedBundles;
    static NSMutableArray _customBundlesDeployedBundles;
    static NSMutableDictionary _downloadClassInfo;
    static NSMutableArray _jarFileNames;
    static final String _MainBundleDownloadClassInfoKey = "main";
    static final String _CustomFrameworksDownloadClassInfoKey = "frameworks";
    static final String _CustomBundlesDownloadClassInfoKey = "bundles";
    static final String _DownloadClassNamesInfoKey = "classNames";
    static final String _DownloadURLsInfoKey = "URLs";
    private boolean _generateSession;
    private EODistributionContext _distributionContext;
    private NSMutableDictionary _arguments;
    private String _temporaryGIDBase;
    private String _componentURL;
    private NSArray _downloadClientClassURLs;
    public String otherParameterName;

}

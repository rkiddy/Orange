
package com.webobjects.eodistribution;

import com.webobjects.appserver.*;
import com.webobjects.appserver._private._PermanentCacheSingleton;
import com.webobjects.eocontrol.EOTemporaryGlobalID;
import com.webobjects.foundation.*;
import java.net.MalformedURLException;
import java.net.URL;


/**
 * @deprecated Class WOJavaClientApplet is deprecated
 */

public class WOJavaClientApplet extends WOComponent
    implements _PermanentCacheSingleton {


    public WOJavaClientApplet(WOContext context) { return null; }

    public String componentURL() { return null; }

    private boolean _isUsingWebServer() { return true; }

    public String applicationURL() { return null; }

    public String sessionID() { return null; }

    public EODistributionContext distributionContext() { return null; }

    public boolean synchronizesVariablesWithBindings() { return true; }

    public String archive() { return null; }

    public String code() { return null; }

    public String codebase() { return null; }

    public String pluginCodebase() { return null; }

    public boolean shouldOmitInterfaceControllerClassName() { return true; }

    public String interfaceControllerClassName() { return null; }

    public boolean shouldOmitApplicationClassName() { return true; }

    public String applicationClassName() { return null; }

    public boolean shouldOmitChannelClassName() { return true; }

    public String channelClassName() { return null; }

    public String applicationName() { return null; }

    public boolean shouldOmitSplashIconName() { return true; }

    public String splashIconName() { return null; }

    public boolean shouldOmitSplashIconURL() { return true; }

    public String splashIconURL() { return null; }

    public boolean shouldOmitLanguage() { return true; }

    public String language() { return null; }

    public String principalClassNames() { return null; }

    private void _appendByteRepresentationToStringBuffer(byte bytes[], StringBuffer buffer) {}

    public String temporaryGIDBase() { return null; }

    public NSArray downloadClientClasses() { return null; }

    public NSArray downloadClientClassURLs() { return null; }

    public NSArray noDownloadClientClasses() { return null; }

    private NSArray _clientClassesForBundlesAndKey(NSArray deployedBundles, String key) { return null; }

    public NSArray mainBundleClientClasses() { return null; }

    public NSArray customFrameworksClientClasses() { return null; }

    public NSArray customBundlesClientClasses() { return null; }

    public NSArray otherParameterNames() { return null; }

    public String otherParametersString() { return null; }

    public String otherParameterValue() { return null; }

    public String allParameterNamesString() { return null; }

    public NSDictionary clientSideRequestApplicationParameters() { return null; }

    public Object handleClientRequest() { return null; }

    static  {}

    public static final String WidthKey = "width";
    public static final String HeightKey = "height";
    public static final String UseJavaPluginKey = "useJavaPlugin";
    public static final String ArchiveKey = "archive";
    public static final String CodeKey = "code";
    public static final String CodebaseKey = "codebase";
    public static final String PluginCodebaseKey = "pluginCodebase";
    public static final String DistributionContextKey = "distributionContext";
    public static final String InterfaceControllerClassNameKey = "interfaceControllerClassName";
    public static final String ApplicationClassNameKey = "applicationClassName";
    public static final String PrincipalClassNamesKey = "principalClassNames";
    public static final String ApplicationNameKey = "applicationName";
    public static final String SplashIconNameKey = "splashIconName";
    public static final String SplashIconURLKey = "splashIconURL";
    public static final String LanguageKey = "language";
    public static final String ChannelClassNameKey = "channelClassName";
    public static final String TemporaryGIDBaseKey = "temporaryGIDBase";
    public static final String DownloadClientClassesKey = "downloadClientClasses";
    public static final String DownloadClientClassURLsKey = "downloadClientClassURLs";
    public static final String AllParameterNamesKey = "allParameterNames";
    public static final String SessionIDKey = "sessionID";
    public static final String ComponentURLKey = "componentURL";
    public static final String ApplicationURLKey = "applicationURL";
    public static final String DidVendComponentURLNotification = "WOJavaClientAppletDidVendComponentURLNotification";
    private static final String _DefaultCode = "com.webobjects.eoapplication.EOApplet";
    private static final String _DefaultCodebase = "/WebObjects/Java";
    private static final String _DefaultArchive = "wojavaclient.jar";
    private static final NSArray _standardParameters;
    private static final NSArray _requiredParameters;
    private static final NSDictionary _requriedParametersDefaults;
    private static final NSArray _serverOnlyParameters;
    private EODistributionContext _distributionContext;
    private NSMutableDictionary _arguments;
    private String _temporaryGIDBase;
    public String otherParameterName;
    private String _componentURL;
    private NSArray _downloadClientClassURLs;

}

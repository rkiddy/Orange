
package com.webobjects.appserver;

import com.webobjects._ideservices._WOLaunchServices;
import com.webobjects.appserver._private.WOActionURL;
import com.webobjects.appserver._private.WOActiveImage;
import com.webobjects.appserver._private.WOAjaxRequestHandler;
import com.webobjects.appserver._private.WOApplet;
import com.webobjects.appserver._private.WOBody;
import com.webobjects.appserver._private.WOBrowser;
import com.webobjects.appserver._private.WOBundle;
import com.webobjects.appserver._private.WOCGIFormValues;
import com.webobjects.appserver._private.WOCheckBox;
import com.webobjects.appserver._private.WOClassicAdaptor;
import com.webobjects.appserver._private.WOComponentContent;
import com.webobjects.appserver._private.WOComponentDefinition;
import com.webobjects.appserver._private.WOComponentRequestHandler;
import com.webobjects.appserver._private.WOConditional;
import com.webobjects.appserver._private.WODefaultExceptions;
import com.webobjects.appserver._private.WODeployedBundle;
import com.webobjects.appserver._private.WODirectActionRequestHandler;
import com.webobjects.appserver._private.WOFileUpload;
import com.webobjects.appserver._private.WOForm;
import com.webobjects.appserver._private.WOFrame;
import com.webobjects.appserver._private.WOGenericContainer;
import com.webobjects.appserver._private.WOGenericElement;
import com.webobjects.appserver._private.WOHiddenField;
import com.webobjects.appserver._private.WOHttpIO;
import com.webobjects.appserver._private.WOHyperlink;
import com.webobjects.appserver._private.WOImage;
import com.webobjects.appserver._private.WOImageButton;
import com.webobjects.appserver._private.WOJavaScript;
import com.webobjects.appserver._private.WOParam;
import com.webobjects.appserver._private.WOPasswordField;
import com.webobjects.appserver._private.WOPopUpButton;
import com.webobjects.appserver._private.WOProjectBundle;
import com.webobjects.appserver._private.WOProperties;
import com.webobjects.appserver._private.WORadioButton;
import com.webobjects.appserver._private.WORecording;
import com.webobjects.appserver._private.WORepetition;
import com.webobjects.appserver._private.WOResetButton;
import com.webobjects.appserver._private.WOResourceRequestHandler;
import com.webobjects.appserver._private.WOResourceURL;
import com.webobjects.appserver._private.WOServerSessionStore;
import com.webobjects.appserver._private.WOStaticResourceRequestHandler;
import com.webobjects.appserver._private.WOString;
import com.webobjects.appserver._private.WOSubmitButton;
import com.webobjects.appserver._private.WOSwitchComponent;
import com.webobjects.appserver._private.WOText;
import com.webobjects.appserver._private.WOTextField;
import com.webobjects.appserver._private.WOURLFormatException;
import com.webobjects.appserver._private.WOUniqueIDGenerator;
import com.webobjects.appserver._private.WOWebServiceRequestHandler;
import com.webobjects.appserver._private.WOXMLNode;
import com.webobjects.appserver.parser.woml.WOMLDefaultNamespaceProvider;
import com.webobjects.appserver.parser.woml.WOMLNamespaceProvider;
import com.webobjects.appserver.parser.woml.WOMLTemplateExtensions;
import com.webobjects.appserver.parser.woml.namespaces.WOMLDefaultNamespace;
import com.webobjects.appserver.parser.woml.namespaces.WOMLWebObjectsNamespace;
import com.webobjects.appserver.parser.woml.namespaces.WOMLWebObjectsQualifierNamespace;
import com.webobjects.eoaccess.EOModelGroup;
import com.webobjects.eocontrol.*;
import com.webobjects.foundation.*;
import java.io.*;
import java.lang.management.ManagementFactory;
import java.lang.reflect.Method;
import java.net.*;
import java.util.*;
import java.util.jar.*;
import javax.management.*;


public class WOApplication
    implements NSKeyValueCoding, com.webobjects.foundation.NSKeyValueCoding.ErrorHandling, NSKeyValueCodingAdditions, WOApplicationMBean {
    public static class _EventLoggingEnabler
        implements com.webobjects.eocontrol.EOEventCenter.EventRecordingHandler {

        public _EventLoggingEnabler() { return null; }

        public void setLoggingEnabled(boolean isLogging, Class aClass) {}
    }

    class _LifebeatThread extends Thread {


        _LifebeatThread(String anAppName, int anAppPort, InetAddress anAppHost, int aLifebeatPort, long aLifebeatInterval) { return null; }

        private void initMessages() {}

        void sendMessage(byte aMessage[]) { return null; }

        private void _closeLifebeatSocket() {}

        void udpMessage() { return null; }

        public void run() {}

        private InetAddress _localAddress;
        private String _localhostName;
        private int _lifebeatDestinationPort;
        private long _lifebeatInterval;
        private String _appName;
        private int _appPort;
        private int _deathCounter;
        private Socket lifebeatSocket;
        private OutputStream lifebeatOS;
        private InputStream lifebeatIS;
        private byte lifebeatResponseBuffer[];
        private DatagramSocket datagramSocket;
        private byte _versionRequest[];
        byte _mbuffer[];
        DatagramPacket incomingPacket;
        DatagramPacket outgoingPacket;
        private byte _hasStarted[];
        private byte _lifebeat[];
        byte _willStop[];
        byte _willCrash[];
        final WOApplication this$0;

    }

    public static class Event extends WOEvent {


        public Event() { return null; }

        public String displayComponentName() { return null; }

        public String comment() { return null; }

        private static final long serialVersionUID = 0x72a25a23L;

    }

    private class QuitTask extends TimerTask {


        public QuitTask() { return null; }

        public void start() {}

        public void run() {}

        final WOApplication this$0;

    }

    protected class TimeoutTask extends TimerTask {


        protected TimeoutTask() { return null; }

        public void start() {}

        public void run() {}

        public boolean cancel() { return true; }

        final WOApplication this$0;

    }



    public static void main(String argv[]) { return null; }

    public static void main(String argv[], Class applicationClass) { return null; }

    static void _setApplication(WOApplication anApplication) {}

    public static WOApplication application() { return null; }

    /**
     * @deprecated Method primeApplication is deprecated
     */

    public static void primeApplication(String mainBundlePath, String nameOfApplicationSubclass) { return null; }

    public static void primeApplication(String mainBundleName, URL mainBundlePathURL, String nameOfApplicationSubclass) { return null; }

    public boolean wasMainInvoked() { return true; }

    /**
     * @deprecated Method sharedEditingContext is deprecated
     */

    public EOSharedEditingContext sharedEditingContext() { return null; }

    WOApplication(String sessionStoreClassName) { return null; }

    public WOApplication() { return null; }

    private boolean _initializeRapidTurnaroundMode() { return true; }

    public String toString() { return null; }

    public String path() { return null; }

    public String baseURL() { return null; }

    public String getBaseURL() { return null; }

    public String number() { return null; }

    public String name() { return null; }

    public String getName() { return null; }

    public String getWebObjectsVersion() { return null; }

    public HashMap getFrameworkVersions() { return null; }

    public ArrayList getClassPaths() { return null; }

    private boolean _runOnce() { return true; }

    public _WORunLoop _runLoop() { return null; }

    public void terminate() {}

    public void _quitTimer() {}

    Timer applicationTimer() { return null; }

    public boolean isTerminating() { return true; }

    public boolean getIsTerminating() { return true; }

    public void setTimeOut(double aTimeInterval) {}

    public double timeOut() { return null; }

    public double getTimeOut() { return null; }

    /**
     * @deprecated Method _scheduleApplicationTimerForTimeInterval is deprecated
     */

    private synchronized void _scheduleApplicationTimerForTimeInterval(long aTimeInterval) { return null; }

    /**
     * @deprecated Method _terminateOrResetTimer is deprecated
     */

    public void _terminateOrResetTimer(Object sender) {}

    public void run() {}

    public WOAdaptor adaptorWithName(String aClassName, NSDictionary anArgsDictionary) { return null; }

    public NSArray adaptors() { return null; }

    public WOAdaptor defaultAdaptor() { return null; }

    public String getDefaultAdaptor() { return null; }

    private NSMutableDictionary _argsDictionary() { return null; }

    private void _initAdaptors() {}

    protected void _setAllowsCacheControlHeader(boolean aBool) {}

    protected boolean _allowsCacheControlHeader() { return true; }

    /**
     * @deprecated Method setResourceManager is deprecated
     */

    public void setResourceManager(WOResourceManager aResourceManager) {}

    public WOResourceManager resourceManager() { return null; }

    public WOResponse dispatchRequest(WORequest aRequest) { return null; }

    public void awake() {}

    public void takeValuesFromRequest(WORequest aRequest, WOContext aContext) {}

    public WOActionResults invokeAction(WORequest aRequest, WOContext aContext) { return null; }

    public void appendToResponse(WOResponse aResponse, WOContext aContext) {}

    public void sleep() {}

    public void setSessionStore(WOSessionStore aSessionStore) {}

    public WOSessionStore sessionStore() { return null; }

    public void saveSessionForContext(WOContext aContext) {}

    public WOSession restoreSessionWithID(String aSessionID, WOContext aContext) { return null; }

    protected Class _sessionClass() { return null; }

    public WOSession createSessionForRequest(WORequest aRequest) { return null; }

    public boolean shouldRestoreSessionOnCleanEntry(WORequest aRequest) { return true; }

    public void setContextClassName(String name) {}

    public String contextClassName() { return null; }

    public WOContext createContextForRequest(WORequest aRequest) { return null; }

    public WOResponse createResponseInContext(WOContext aContext) { return null; }

    public WOResourceManager createResourceManager() { return null; }

    public WORequest createRequest(String aMethod, String aURL, String anHTTPVersion, Map someHeaders, NSData aContent, Map someInfo) { return null; }

    public WOSession _initializeSessionInContext(WOContext aContext) { return null; }

    public int activeSessionsCount() { return 0; }

    protected void _finishInitializingSession(WOSession wosession) {}

    protected void _discountTerminatedSession() {}

    public void setPageCacheSize(int anUnsigned) {}

    public int pageCacheSize() { return 0; }

    public int getPageCacheSize() { return 0; }

    public void setPageFragmentCacheSize(int anUnsigned) {}

    public int pageFragmentCacheSize() { return 0; }

    public int getPageFragmentCacheSize() { return 0; }

    public void setPermanentPageCacheSize(int anUnsigned) {}

    public int permanentPageCacheSize() { return 0; }

    public void setPageRefreshOnBacktrackEnabled(boolean aFlag) {}

    public boolean isPageRefreshOnBacktrackEnabled() { return true; }

    public boolean getIsPageRefreshOnBacktrackEnabled() { return true; }

    public WOComponent pageWithName(String aName, WOContext aContext) { return null; }

    public boolean _isPageRecreationEnabled() { return true; }

    public WOElement dynamicElementWithName(String aName, NSDictionary someAssociations, WOElement anElement, NSArray aLanguageArray) { return null; }

    private NSMutableArray _initComponentBearingFrameworksFromBundleArray(NSArray aBundleArray) { return null; }

    private NSMutableArray _componentBearingFrameworks() { return null; }

    protected URL combinedComponentPathURL(WOResourceManager aResourceManager, String templateName, String aFrameworkName, String aLanguage, boolean refreshProjectOnCacheMiss) { return null; }

    private WOComponentDefinition _loadComponentDefinition(String aComponentName, String aLanguage, boolean refreshProjectOnCacheMiss) { return null; }

    private void _preloadAllLocalizedComponentDefinitions(String aComponentName) {}

    private WOComponentDefinition _componentDefinition(String componentKey, String aComponentName, String aLanguage, boolean refreshProjectOnCacheMiss) { return null; }

    public boolean _rapidTurnaroundActiveForAnyProject() { return true; }

    public void _removeComponentDefinitionCacheContents() {}

    public void _addToExpectedLanguages(NSArray someLanguages) {}

    public NSArray _expectedLanguages() { return null; }

    public WOComponentDefinition _componentDefinitionFromClassNamed(String aComponentName) { return null; }

    public WOComponentDefinition _componentDefinition(String aComponentName, NSArray aLanguageArray) { return null; }

    private void _disableDynamicLoading() {}

    private boolean _isDynamicLoadingEnabled() { return true; }

    /**
     * @deprecated Method setPrintsHTMLParserDiagnostics is deprecated
     */

    public void setPrintsHTMLParserDiagnostics(boolean flag) {}

    /**
     * @deprecated Method printsHTMLParserDiagnostics is deprecated
     */

    public boolean printsHTMLParserDiagnostics() { return true; }

    public void setStatisticsStore(WOStatisticsStore aStatisticsStore) {}

    public WOStatisticsStore statisticsStore() { return null; }

    public NSDictionary statistics() { return null; }

    public synchronized void refuseNewSessions(boolean aVal) { return null; }

    public boolean isRefusingNewSessions() { return true; }

    public boolean getIsRefusingNewSessions() { return true; }

    public void setMinimumActiveSessionsCount(int aVal) {}

    public int minimumActiveSessionsCount() { return 0; }

    public int getMinimumActiveSessionsCount() { return 0; }

    private WOResponse _invokeDefaultException(String aPageName, Exception anException) { return null; }

    private WOResponse _handleError(String aPageName, Exception anException, WOContext aContext) { return null; }

    public WOResponse handleSessionCreationErrorInContext(WOContext aContext) { return null; }

    public WOResponse handleSessionRestorationErrorInContext(WOContext aContext) { return null; }

    public WOResponse handlePageRestorationErrorInContext(WOContext aContext) { return null; }

    public WOResponse handleActionRequestError(WORequest aRequest, Exception exception, String reason, WORequestHandler worequesthandler, String s, String s1, Class class1, 
            WOAction woaction) { return null; }

    public WOResponse handleException(Exception anException, WOContext aContext) { return null; }

    public NSMutableDictionary handleMalformedCookieString(RuntimeException anException, String cookieString, NSMutableDictionary aReturnDict) { return null; }

    public void registerRequestHandler(WORequestHandler aHandler, String aRequestHandlerKey) {}

    public WORequestHandler removeRequestHandlerForKey(String aRequestHandlerKey) { return null; }

    public WORequestHandler defaultRequestHandler() { return null; }

    public void setDefaultRequestHandler(WORequestHandler aRequestHandler) {}

    public WORequestHandler requestHandlerForKey(String aKey) { return null; }

    public NSArray registeredRequestHandlerKeys() { return null; }

    private WORequestHandler _staticResourceRequestHandler() { return null; }

    public WORequestHandler handlerForRequest(WORequest aRequest) { return null; }

    private void _registerRequestHandlers() {}

    public String defaultRequestHandlerClassName() { return null; }

    /**
     * @deprecated Method debugString is deprecated
     */

    public void debugString(String aString) {}

    /**
     * @deprecated Method _debugString is deprecated
     */

    public static void _debugString(String aString) { return null; }

    /**
     * @deprecated Method logString is deprecated
     */

    public void logString(String aString) {}

    public void logTakeValueForDeclarationNamed(String aDeclarationName, String aDeclarationType, String aBindingName, String anAssociationDescription, Object aValue) {}

    public void logSetValueForDeclarationNamed(String aDeclarationName, String aDeclarationType, String aBindingName, String anAssociationDescription, Object aValue) {}

    /**
     * @deprecated Method monitoringEnabled is deprecated
     */

    public boolean monitoringEnabled() { return true; }

    /**
     * @deprecated Method terminateAfterTimeInterval is deprecated
     */

    public void terminateAfterTimeInterval(double aTimeInterval) {}

    protected void _terminateFromMonitor() {}

    public String _newLocationForRequest(WORequest aRequest) { return null; }

    protected void _openInitialURL() {}

    public String directConnectURL() { return null; }

    public String getDirectConnectURL() { return null; }

    public String webserverConnectURL() { return null; }

    public String getWebserverConnectURL() { return null; }

    public String servletConnectURL() { return null; }

    public String getServletConnectURL() { return null; }

    public final boolean adaptorsDispatchRequestsConcurrently() { return null; }

    public boolean getAdaptorsDispatchRequestsConcurrently() { return true; }

    public final boolean isConcurrentRequestHandlingEnabled() { return null; }

    public Object requestHandlingLock() { return null; }

    /**
     * @deprecated Method licensingAllowsMultipleInstances is deprecated
     */

    public static final boolean licensingAllowsMultipleInstances() { return null; }

    /**
     * @deprecated Method licensingAllowsMultipleThreads is deprecated
     */

    public static final boolean licensingAllowsMultipleThreads() { return null; }

    /**
     * @deprecated Method licensedRequestWindow is deprecated
     */

    public static final long licensedRequestWindow() { return null; }

    /**
     * @deprecated Method licensedRequestLimit is deprecated
     */

    public static final int licensedRequestLimit() { return null; }

    public static final void _setChecksForSpecialHeaders(boolean flag) { return null; }

    public static final boolean _checksForSpecialHeaders() { return null; }

    /**
     * @deprecated Method setLoadFrameworks is deprecated
     */

    public void setLoadFrameworks(NSArray anArray) {}

    public NSArray loadFrameworks() { return null; }

    public void setProjectSearchPath(NSArray aPathArray) {}

    public NSArray projectSearchPath() { return null; }

    /**
     * @deprecated Method setAdditionalAdaptors is deprecated
     */

    public void setAdditionalAdaptors(NSArray anAdaptorArray) {}

    public NSArray additionalAdaptors() { return null; }

    public ArrayList getAdditionalAdaptors() { return null; }

    public static boolean _isDebuggingEnabled() { return null; }

    public boolean isDebuggingEnabled() { return true; }

    /**
     * @deprecated Method setDirectConnectEnabled is deprecated
     */

    public void setDirectConnectEnabled(boolean aBool) {}

    public boolean isDirectConnectEnabled() { return true; }

    private static void _setCachingEnabled(boolean aBool) { return null; }

    private static boolean _isCachingEnabled() { return null; }

    public void setCachingEnabled(boolean aBool) {}

    public boolean isCachingEnabled() { return true; }

    public boolean getIsCachingEnabled() { return true; }

    public void setMonitorEnabled(boolean aBool) {}

    public boolean isMonitorEnabled() { return true; }

    public boolean getIsMonitorEnabled() { return true; }

    public void setIncludeCommentsInResponses(boolean aBool) {}

    public boolean includeCommentsInResponses() { return true; }

    public boolean getIncludeCommentsInResponses() { return true; }

    /**
     * @deprecated Method setPort is deprecated
     */

    public void setPort(Number port) {}

    public Number port() { return null; }

    public int getPort() { return 0; }

    public void _setHost(String host) {}

    public String host() { return null; }

    public String getHost() { return null; }

    public void _setHostAddress(InetAddress host) {}

    public InetAddress hostAddress() { return null; }

    public String getHostAddress() { return null; }

    /**
     * @deprecated Method setWorkerThreadCount is deprecated
     */

    public void setWorkerThreadCount(Number threadCount) {}

    /**
     * @deprecated Method workerThreadCount is deprecated
     */

    public Number workerThreadCount() { return null; }

    public void setWorkerThreadCountMin(Number threadCount) {}

    public Number workerThreadCountMin() { return null; }

    public int getWorkerThreadCountMin() { return 0; }

    public void setWorkerThreadCountMax(Number threadCount) {}

    public Number workerThreadCountMax() { return null; }

    public int getWorkerThreadCountMax() { return 0; }

    /**
     * @deprecated Method setSocketCacheSize is deprecated
     */

    public void setSocketCacheSize(Number socketCacheSize) {}

    /**
     * @deprecated Method socketCacheSize is deprecated
     */

    public Number socketCacheSize() { return null; }

    /**
     * @deprecated Method setSocketMonitorSleepTime is deprecated
     */

    public void setSocketMonitorSleepTime(Number socketMonitorSleepTime) {}

    /**
     * @deprecated Method socketMonitorSleepTime is deprecated
     */

    public Number socketMonitorSleepTime() { return null; }

    /**
     * @deprecated Method setMaxSocketIdleTime is deprecated
     */

    public void setMaxSocketIdleTime(Number maxSocketIdleTime) {}

    public Number maxSocketIdleTime() { return null; }

    public int getMaxSocketIdleTime() { return 0; }

    /**
     * @deprecated Method setListenQueueSize is deprecated
     */

    public void setListenQueueSize(Number listenQueueSize) {}

    public Number listenQueueSize() { return null; }

    public int getListenQueueSize() { return 0; }

    private void _setLifebeatEnabled(boolean aBool) {}

    public boolean lifebeatEnabled() { return true; }

    /**
     * @deprecated Method monitorEnabled is deprecated
     */

    public boolean monitorEnabled() { return true; }

    private void _setOutputPath(String aString) {}

    public String outputPath() { return null; }

    public String getOutputPath() { return null; }

    protected void _setLifebeatDestinationPort(int anInt) {}

    public int lifebeatDestinationPort() { return 0; }

    public int getLifebeatDestinationPort() { return 0; }

    private void _setLifebeatInterval(int anInt) {}

    public int lifebeatInterval() { return 0; }

    public int getLifebeatInterval() { return 0; }

    /**
     * @deprecated Method setMonitorHost is deprecated
     */

    public void setMonitorHost(String s) {}

    /**
     * @deprecated Method monitorHost is deprecated
     */

    public String monitorHost() { return null; }

    public void setRecordingPath(String aString) {}

    public String recordingPath() { return null; }

    public void setAutoOpenInBrowser(boolean aBool) {}

    public boolean autoOpenInBrowser() { return true; }

    public void setAutoOpenClientApplication(boolean aBool) {}

    public boolean autoOpenClientApplication() { return true; }

    public boolean getAutoOpenClientApplication() { return true; }

    public void setSMTPHost(String aString) {}

    public String SMTPHost() { return null; }

    /**
     * @deprecated Method setAdaptor is deprecated
     */

    public void setAdaptor(String aString) {}

    public String adaptor() { return null; }

    /**
     * @deprecated Method setComponentRequestHandlerKey is deprecated
     */

    public void setComponentRequestHandlerKey(String aString) {}

    public String componentRequestHandlerKey() { return null; }

    public String getComponentRequestHandlerKey() { return null; }

    /**
     * @deprecated Method setDirectActionRequestHandlerKey is deprecated
     */

    public void setDirectActionRequestHandlerKey(String aString) {}

    public String directActionRequestHandlerKey() { return null; }

    public String streamActionRequestHandlerKey() { return null; }

    /**
     * @deprecated Method setResourceRequestHandlerKey is deprecated
     */

    public void setResourceRequestHandlerKey(String aString) {}

    public String resourceRequestHandlerKey() { return null; }

    /**
     * @deprecated Method setWebServiceRequestHandlerKey is deprecated
     */

    public void setWebServiceRequestHandlerKey(String aString) {}

    public String webServiceRequestHandlerKey() { return null; }

    public String ajaxRequestHandlerKey() { return null; }

    public void setSessionStoreClassName(String aString) {}

    public String sessionStoreClassName() { return null; }

    public WODynamicURL newDynamicURL() { return null; }

    public WODynamicURL newDynamicURL(String url) throws WOURLFormatException { return null; }

    public void setFrameworksBaseURL(String aString) {}

    public String frameworksBaseURL() { return null; }

    public void setCGIAdaptorURL(String aString) {}

    public String cgiAdaptorURL() { return null; }

    public String getCGIAdaptorURL() { return null; }

    public void setApplicationBaseURL(String aString) {}

    public String applicationBaseURL() { return null; }

    public String getApplicationBaseURL() { return null; }

    public String[] adaptorExtensions() { return null; }

    public String applicationExtension() { return null; }

    public String getApplicationExtension() { return null; }

    public String adaptorName() { return null; }

    public String adaptorPath() { return null; }

    protected void _parseCGIAdaptorURL() {}

    public String documentRoot() { return null; }

    public void setAllowsConcurrentRequestHandling(boolean aValue) {}

    public boolean allowsConcurrentRequestHandling() { return true; }

    public boolean getAllowsConcurrentRequestHandling() { return true; }

    public void setSessionTimeOut(Number timeOut) {}

    public void setDefaultUndoStackLimit(int stackLimit) {}

    public Number sessionTimeOut() { return null; }

    public int getSessionTimeOut() { return 0; }

    public Number defaultUndoStackLimit() { return null; }

    public int getDefaultUndoStackLimit() { return 0; }

    protected WOAssociationFactoryRegistry createDefaultAssociationFactoryRegistry() { return null; }

    public final WOAssociationFactory associationFactory() { return null; }

    public WOAssociationFactoryRegistry associationFactoryRegistry() { return null; }

    protected WOMLDefaultNamespaceProvider createDefaultNamespaceProvider() { return null; }

    public WOMLNamespaceProvider namespaceProvider() { return null; }

    public void setNamespaceProvider(WOMLNamespaceProvider value) {}

    protected void _setLockDefaultEditingContext(boolean aValue) {}

    protected boolean _lockDefaultEditingContext() { return true; }

    public static boolean canAccessFieldsDirectly() { return null; }

    public Object valueForKey(String key) { return null; }

    public void takeValueForKey(Object value, String key) {}

    public Object handleQueryWithUnboundKey(String key) { return null; }

    public void handleTakeValueForUnboundKey(Object value, String key) {}

    public void unableToSetNullForKey(String key) {}

    public Object valueForKeyPath(String keyPath) { return null; }

    public void takeValueForKeyPath(Object value, String keyPath) {}

    public void validationFailedWithException(Throwable t, Object value, String keyPath, WOComponent component, WOSession session) {}

    /**
     * @deprecated Method lock is deprecated
     */

    public void lock() {}

    /**
     * @deprecated Method unlock is deprecated
     */

    public void unlock() {}

    public boolean _isSupportedDevelopmentPlatform() { return true; }

    public boolean _isDomesticSupportedDevelopmentPlatform() { return true; }

    public boolean _isForeignSupportedDevelopmentPlatform() { return true; }

    private static void _initWOApp(boolean logDefaults) { return null; }

    private static void _initWOOuputPath() { return null; }

    private Object _instanceOfNamedClassAssignableFrom(String nameOfClassToInstantiate, Class assignableFrom, Class defaultClass) { return null; }

    Number _refuseNewSessionsTime() { return null; }

    public WOResponse responseForComponentWithName(String name, Map bindings, Map headers, Map userInfo, String uriPrefix, String appName) { return null; }

    public WOResponse responseForDirectActionWithNameAndClass(String actionName, String className, Map formValueDict, InputStream contentStream, Map headers, Map userInfo, String uriPrefix, 
            String appName) { return null; }

    public String getAgentID() { return null; }

    public String sessionIdKey() { return null; }

    public String instanceIdKey() { return null; }

    public MBeanServer getMBeanServer() throws IllegalAccessException { return null; }

    public String getJMXDomain() { return null; }

    public void setJMXDomain(String aName) {}

    public void registerMBean(Object aMBean, ObjectName aName) {}

    public void registerMBean(Object aMBean, String aDomainName, String aMBeanName) throws IllegalArgumentException {}

    public void unregisterMBean(ObjectName aName) {}

    public String[] launchArguments() { return null; }

    static  {}

    private final String _name;
    private String _agentID;
    private String _jmxDomain;
    private MBeanServer _mbs;
    private volatile WOSessionStore _sessionStore;
    private volatile WOStatisticsStore _statisticsStore;
    private final _NSThreadsafeMutableDictionary _componentDefinitionCache;
    private final _NSThreadsafeMutableDictionary _requestHandlers;
    private volatile WORequestHandler _defaultRequestHandler;
    private volatile WOResourceManager _resourceManager;
    private volatile WOAdaptor _defaultAdaptor;
    private NSTimestamp _runLoopDate;
    long _timeOut;
    protected boolean _cgiAdaptorURLParsed;
    public static final String CGIAdaptorURLProperty = "application.cgiAdaptorUrl";
    public static final String DocumentRootProperty = "application.documentRoot";
    public static final String DirectoryAliasProperty = "application.directoryAlias";
    /**
     * @deprecated Field _timer is deprecated
     */
    private WOTimer _timer;
    Timer _applicationTimer;
    private _WORunLoop _currentRunLoop;
    protected volatile boolean _terminating;
    private final Object _globalLock;
    private final Object _recorder;
    private NSMutableArray _adaptors;
    private InetAddress _hostAddress;
    public static URL _classPathURLs[];
    public boolean _unsetHost;
    public static boolean _wasMainInvoked;
    private volatile int _activeSessionsCount;
    private volatile int _minimumActiveSessions;
    private volatile int _permanentCacheSize;
    private volatile int _pageCacheSize;
    private volatile int _pageFragmentCacheSize;
    private volatile boolean _refusingNewClients;
    private volatile boolean _dynamicLoadingEnabled;
    private volatile boolean _pageRefreshOnBacktrackEnabled;
    private boolean _isMultiThreaded;
    private boolean _allowsConcurrentRequestHandling;
    static _LifebeatThread _lifebeatThread;
    public static final String _adminRequestHandlerKey = "womp";
    private static WOApplication _WOApp;
    private static String _WOAppClassName;
    private static String _WOAppPackageName;
    private static Class _theSessionClass;
    private static String _argv[];
    private static int TheLoadedFrameworkCount;
    private static NSMutableArray TheComponentBearingFrameworks;
    private static boolean _checksForSpecialHeaders;
    protected static volatile long _TheLastApplicationAccessTime;
    static volatile boolean _IsEventLoggingEnabled;
    private static final String pageWithNameEvent = "pageWithName";
    private final boolean _inRapidTurnaroundMode;
    private final _NSThreadsafeMutableSet _expectedLanguages;
    public static _WOLaunchServices _launchServices;
    public static final String ApplicationWillFinishLaunchingNotification = "ApplicationWillFinishLaunchingNotification";
    public static final String ApplicationDidFinishLaunchingNotification = "ApplicationDidFinishLaunchingNotification";
    public static final String ApplicationWillDispatchRequestNotification = "ApplicationWillDispatchRequestNotification";
    public static final String ApplicationDidDispatchRequestNotification = "ApplicationDidDispatchRequestNotification";
    private static final String _WORecordingClassName = "com.webobjects.appserver._private.WORecording";
    private static final String _WORecordingClassNameKey = "WORecordingClassName";
    private WOAssociationFactoryRegistry _associationFactoryRegistry;
    private WOMLNamespaceProvider _namespaceProvider;
    private Class _createContextForRequestParams[];
    private static final String _applicationExtensions[];
    private String _adaptorName;
    private String _adaptorPath;
    private static final String __hostDelimiter = "//";
    private static final String __localhost = "localhost";
    private static final String __localAddress = "127.0.0.1";
    private String _documentRoot;


    // Unreferenced inner class com/webobjects/appserver/WOApplication$1

/* anonymous class */
    class _cls1
        implements Runnable {


        _cls1() { return null; }

        public void run() {}

        final NSArray val$finalAdaptors;
        final int val$j;
        final WOApplication this$0;

    }

}

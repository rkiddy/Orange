
package com.webobjects.appserver._private;

import com.webobjects.appserver.WOApplication;
import com.webobjects.appserver.WOResourceManager;
import com.webobjects.foundation.*;
import java.io.File;
import java.net.URL;
import java.util.*;

public class WOProperties {


    public WOProperties() { return null; }

    public static synchronized void initLanguageDictionary() { return null; }

    private static NSDictionary languagesFromString(String aString) { return null; }

    public static void initPropertiesFromWebServerConfig() { return null; }

    public static void initUserDefaultsKeys() { return null; }

    public static NSMutableDictionary _webServerConfigDictionary() { return null; }

    public static void printWODefaults() { return null; }

    private static NSMutableArray _convertRelativePathsToAbsolutes(NSArray aPathArray) { return null; }

    public static void setProjectSearchPath(NSArray pathArray) { return null; }

    public static NSArray projectSearchPath() { return null; }

    public static String description() { return null; }

    private static void provideDefaultValueForUnsetSystemProperty(String name, String value) { return null; }

    public static void initProgrammaticWODefaults() { return null; }

    public String toString() { return null; }

    static  {}

    public static String _FrameworkPathKey;
    public static String _CGIAdaptorURLKey;
    public static String _LoadFrameworksKey;
    public static String _FrameworksBaseURLKey;
    public static String _RecordingPathKey;
    public static String _DirectConnectEnabledKey;
    public static String _CachingEnabledKey;
    public static String _ApplicationBaseURLKey;
    public static String _ProjectSearchPathKey;
    public static String _SessionStoreClassNameKey;
    public static String _ContextClassNameKey;
    public static String _StatisticsStorePasswordKey;
    public static String _SMTPHostKey;
    public static String _PortKey;
    public static String _HostKey;
    public static String _ListenQueueSizeKey;
    public static String _SocketCacheSizeKey;
    public static String _SocketMonitorSleepTimeKey;
    public static String _MaxSocketIdleTimeKey;
    public static String _WorkerThreadCountKey;
    public static String _WorkerThreadCountMinKey;
    public static String _WorkerThreadCountMaxKey;
    public static String _AdaptorKey;
    public static String _AdditionalAdaptorsKey;
    public static String _ComponentRequestHandlerKey;
    public static String _DirectActionRequestHandlerKey;
    public static String _StreamActionRequestHandlerKey;
    public static String _ResourceRequestHandlerKey;
    public static String _WebServiceRequestHandlerKey;
    public static String _AjaxRequestHandlerKey;
    public static String _IncludeCommentsInResponseKey;
    public static String _SessionTimeOutKey;
    public static String _TolerateMalformedCookiesKey;
    public static String _AutoOpenBrowserKey;
    public static String _GenerateWSDLKey;
    public static String _AutoOpenClientApplicationKey;
    public static String _AllowsConcurrentRequestHandlingKey;
    public static String _GarbageCollectionRepeatCountKey;
    public static String _LockDefaultEditingContextKey;
    public static String _AllowsCacheControlHeaderKey;
    public static String _HTMLParserClassNameKey;
    public static String __SessionReclaimingInterval;
    public static String _DefaultUndoStackLimitKey;
    public static String _StatisticsStoreSessionMaxKey;
    public static NSDictionary TheLanguageDictionary;
    public static String _ApplicationNameKey;
    public static String _OutputPathKey;
    public static String _LifebeatDestinationPortKey;
    public static String _LifebeatEnabledKey;
    public static String _LifebeatIntervalKey;
    public static String _MonitorEnabledKey;
    public static String _LaunchdEnabledKey;
    public static String _LaunchdFilePathKey;
    public static String _WOApplicationRecylingExpressionKey;
    public static boolean TheAutoOpenBrowserFlag;
    public static boolean TheAutoOpenClientApplicationFlag;
    public static boolean TheDirectConnectEnabledFlag;
    public static boolean TheCachingFlag;
    public static boolean TheIncludeCommentsInResponseFlag;
    public static boolean TheAllowsConcurrentRequestHandlingFlag;
    public static boolean TheLockDefaultEditingContextFlag;
    public static boolean TheAllowsCacheControlHeaderFlag;
    public static boolean TheMonitorEnabledFlag;
    public static boolean TheLifebeatEnabledFlag;
    public static boolean TheLaunchdEnabledFlag;
    public static boolean isTheAutoOpenBrowserFlagSet;
    public static boolean isTheAutoOpenClientApplicationFlagSet;
    public static boolean isTheDirectConnectEnabledFlagSet;
    public static boolean isTheCachingFlagSet;
    public static boolean isTheIncludeCommentsInResponseFlagSet;
    public static boolean isTheAllowsConcurrentRequestHandlingFlagSet;
    public static boolean isTheLockDefaultEditingContextFlagSet;
    public static boolean isTheAllowsCacheControlHeaderFlagSet;
    public static boolean isTheWOHTMLParserClassNameFlagSet;
    public static boolean isTolerateMalformedCookiesSet;
    public static boolean isTheMonitorEnabledFlagSet;
    public static boolean isTheLifebeatEnabledFlagSet;
    public static boolean isTheLaunchdEnabledFlagSet;
    public static int TheGarbageCollectionRepeatCount;
    public static Number ThePrimaryPort;
    public static String TheHost;
    public static int TheWorkerThreadCount;
    public static int TheWorkerThreadCountMin;
    public static int TheWorkerThreadCountMax;
    public static Number TheListenQueueSize;
    public static int TheSocketCacheSize;
    public static int TheSocketMonitorSleepTime;
    public static int TheMaxSocketIdleTime;
    public static Number TheSessionTimeOut;
    public static int TheDefaultUndoStackLimit;
    public static String TheRecordingPath;
    public static String TheSMTPHost;
    public static String ThePrimaryAdaptorName;
    public static String TheFrameworksBaseURL;
    public static String TheCGIAdaptorURL;
    public static String TheApplicationBaseURL;
    public static String TheComponentRequestHandlerKey;
    public static String TheDirectActionRequestHandlerKey;
    public static String TheResourceRequestHandlerKey;
    public static String TheWebServiceRequestHandlerKey;
    public static String TheAjaxRequestHandlerKey;
    public static String TheSessionStoreClassName;
    public static String TheContextClassName;
    public static String TheStatisticsStorePassword;
    public static NSArray TheLoadFrameworks;
    public static NSArray TheProjectSearchPath;
    public static NSArray TheAdditionalAdaptors;
    public static NSArray TheFrameworkPath;
    public static String TheWOHTMLParserClassName;
    public static String TheStreamActionRequestHandlerKey;
    public static String TheLaunchdFilePath;
    public static String TheWOApplicationRecycleExpression;
    public static int TheStatisticsStoreSessionMax;
    public static int TheLifebeatDestinationPort;
    public static String TheApplicationName;
    public static int TheLifebeatInterval;
    public static String TheOutputPath;
    protected static NSMutableDictionary TheWebServerConfigDictionary;

}

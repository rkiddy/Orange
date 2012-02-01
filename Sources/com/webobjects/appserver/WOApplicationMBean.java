package com.webobjects.appserver;
/**
 * Register this Mbean with the JMX MBean server to monitor a WOApplication instance.
 * Since: 5.4
 */
public interface WOApplicationMBean{
    abstract boolean getAdaptorsDispatchRequestsConcurrently();

    abstract java.util.ArrayList getAdditionalAdaptors();

    abstract boolean getAllowsConcurrentRequestHandling();

    abstract java.lang.String getApplicationBaseURL();

    abstract java.lang.String getBaseURL();

    abstract java.lang.String getCGIAdaptorURL();

    abstract java.util.ArrayList getClassPaths();

    abstract int getDefaultUndoStackLimit();

    abstract java.lang.String getDirectConnectURL();

    abstract java.lang.String getHost();

    abstract java.lang.String getHostAddress();

    abstract boolean getIncludeCommentsInResponses();

    abstract boolean getIsCachingEnabled();

    abstract boolean getIsMonitorEnabled();

    abstract boolean getIsPageRefreshOnBacktrackEnabled();

    abstract boolean getIsRefusingNewSessions();

    abstract boolean getIsTerminating();

    abstract java.lang.String getJMXDomain();

    abstract int getLifebeatDestinationPort();

    abstract int getLifebeatInterval();

    abstract int getListenQueueSize();

    abstract int getMaxSocketIdleTime();

    abstract int getMinimumActiveSessionsCount();

    abstract java.lang.String getName();

    abstract java.lang.String getOutputPath();

    abstract int getPageCacheSize();

    abstract int getPort();

    abstract java.lang.String getServletConnectURL();

    abstract int getSessionTimeOut();

    abstract double getTimeOut();

    abstract java.lang.String getWebObjectsVersion();

    abstract java.lang.String getWebserverConnectURL();

    abstract int getWorkerThreadCountMax();

    abstract int getWorkerThreadCountMin();

}

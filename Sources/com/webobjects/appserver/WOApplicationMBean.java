
package com.webobjects.appserver;

import java.util.ArrayList;

public interface WOApplicationMBean {

    public abstract String getApplicationBaseURL();

    public abstract boolean getAdaptorsDispatchRequestsConcurrently();

    public abstract ArrayList getAdditionalAdaptors();

    public abstract boolean getAllowsConcurrentRequestHandling();

    public abstract String getBaseURL();

    public abstract String getCGIAdaptorURL();

    public abstract int getDefaultUndoStackLimit();

    public abstract String getDirectConnectURL();

    public abstract String getHost();

    public abstract String getHostAddress();

    public abstract boolean getIncludeCommentsInResponses();

    public abstract boolean getIsCachingEnabled();

    public abstract boolean getIsMonitorEnabled();

    public abstract boolean getIsPageRefreshOnBacktrackEnabled();

    public abstract boolean getIsRefusingNewSessions();

    public abstract boolean getIsTerminating();

    public abstract String getJMXDomain();

    public abstract int getLifebeatDestinationPort();

    public abstract int getLifebeatInterval();

    public abstract int getListenQueueSize();

    public abstract int getMaxSocketIdleTime();

    public abstract int getMinimumActiveSessionsCount();

    public abstract String getName();

    public abstract String getOutputPath();

    public abstract int getPageCacheSize();

    public abstract int getPort();

    public abstract String getServletConnectURL();

    public abstract int getSessionTimeOut();

    public abstract double getTimeOut();

    public abstract String getWebserverConnectURL();

    public abstract int getWorkerThreadCountMax();

    public abstract int getWorkerThreadCountMin();

    public abstract String getWebObjectsVersion();

    public abstract ArrayList getClassPaths();
}

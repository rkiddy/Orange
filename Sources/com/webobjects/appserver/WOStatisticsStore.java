
package com.webobjects.appserver;

import com.webobjects.appserver._private.WOProperties;
import com.webobjects.foundation.*;
import java.io.File;
import java.util.*;


public class WOStatisticsStore
    implements NSKeyValueCoding, com.webobjects.foundation.NSKeyValueCoding.ErrorHandling, NSKeyValueCodingAdditions, WOStatisticsStoreMBean {


    protected WOStatisticsStore() { return null; }

    public int getTransactionMovingAverageSampleSize() { return 0; }

    public int transactionMovingAverageSampleSize() { return 0; }

    public void setTransactionMovingAverageSampleSize(int aCount) {}

    public int getSessionMovingAverageSampleSize() { return 0; }

    public int sessionMovingAverageSampleSize() { return 0; }

    public void setSessionMovingAverageSampleSize(int aCount) {}

    public NSDictionary statistics() { return null; }

    private void _applicationWillHandleRequest() {}

    public void applicationWillHandleComponentActionRequest() {}

    public void applicationWillHandleWebServiceRequest() {}

    public void applicationWillHandleDirectActionRequest() {}

    private long _applicationDidHandleRequest() { return 0L; }

    private void _applicationDidHandleWebServiceRequestWithActionNamed(String anActionName) {}

    private void _applicationDidHandleDirectActionRequestWithActionNamed(String anActionName) {}

    public void applicationDidHandleWebServiceRequestWithActionNamed(String anActionName) {}

    public void applicationDidHandleDirectActionRequestWithActionNamed(String anActionName) {}

    private void _applicationDidHandleComponentActionRequest() {}

    public void applicationDidHandleComponentActionRequestWithPageNamed(String pageName) {}

    private void applicationCreatedSession(WOSession aSession) {}

    protected void _applicationCreatedSession(WOSession aSession) {}

    private void sessionTerminating(WOSession aSession) {}

    protected void _sessionTerminating(WOSession aSession) {}

    private void _updateHandlerStatistics(NSMutableDictionary handlerStatistics, String aName, long lastInterval) {}

    private void _updatePathsStatisticsWithPaths(NSArray paths) {}

    private void _purgePathsStatistics() {}

    public void recordStatisticsForResponse(WOResponse aResponse, WOContext aContext) {}

    public String descriptionForResponse(WOResponse aResponse, WOContext aContext) { return null; }

    public String formatDescription(String statistics, WOResponse aResponse, WOContext aContext) { return null; }

    public void setLogFile(String path, long milliseconds) {}

    /**
     * @deprecated Method setLogFile is deprecated
     */

    public void setLogFile(String path, double days) {}

    public String logFile() { return null; }

    public long logFileRotationFrequency() { return 0L; }

    /**
     * @deprecated Method logFileRotationFrequencyInDays is deprecated
     */

    public double logFileRotationFrequencyInDays() { return null; }

    public void logString(String statistics) {}

    public long getAverageIdleTime() { return 0L; }

    public long getAverageTransactionTime() { return 0L; }

    public long getAverageWSTransactionTime() { return 0L; }

    public long getAverageDATransactionTime() { return 0L; }

    public long getAverageCATransactionTime() { return 0L; }

    public long getMovingAverageIdleTime() { return 0L; }

    public long getMovingAverageTransactionTime() { return 0L; }

    public double getAverageRequestsPerSession() { return null; }

    public double getMovingAverageRequestsPerSession() { return null; }

    public long getMovingAverageSessionLife() { return 0L; }

    public HashMap getAverageSessionMemory() { return null; }

    public NSMutableDictionary memoryUsage() { return null; }

    public HashMap getMemoryUsage() { return null; }

    public ArrayList getLastSessionStatistics() { return null; }

    public NSArray lastSessionStatistics() { return null; }

    private static NSMutableDictionary _hashtableForHandlerStatistics(NSMutableDictionary statistics) { return null; }

    private static HashMap _hashMapForHandlerStatistics(NSMutableDictionary statistics) { return null; }

    public HashMap getPagesStatistics() { return null; }

    private NSDictionary _pagesStatistics() { return null; }

    public HashMap getWebServiceStatistics() { return null; }

    private NSDictionary _webServiceStatistics() { return null; }

    public HashMap getDirectActionStatistics() { return null; }

    private NSDictionary _directActionStatistics() { return null; }

    public HashMap getPathsStatistics() { return null; }

    private NSDictionary _pathsStatistics() { return null; }

    protected String _password() { return null; }

    public int getStatisticStoreSessionMax() { return 0; }

    public void setPassword(String password) {}

    public boolean validateLogin(String string, WOSession aSession) { return true; }

    public static boolean canAccessFieldsDirectly() { return null; }

    public Object valueForKey(String key) { return null; }

    public void takeValueForKey(Object value, String key) {}

    public Object handleQueryWithUnboundKey(String key) { return null; }

    public void handleTakeValueForUnboundKey(Object value, String key) {}

    public void unableToSetNullForKey(String key) {}

    public Object valueForKeyPath(String keyPath) { return null; }

    public void takeValueForKeyPath(Object value, String keyPath) {}

    public long getApplicationlastAccessTime() { return 0L; }

    public void setApplicationLastAccessTime(long timeInMillis) {}

    static  {}

    private static final int DefaultTransactionMovingAverageCount = 100;
    private static final int DefaultSessionMovingAverageCount = 10;
    private static final String _PagesTotalServed = "Served";
    private static final String _PagesAvgResponseTime = "Avg Resp. Time";
    private static final String _PagesMinResponseTime = "Min Resp. Time";
    private static final String _PagesMaxResponseTime = "Max Resp. Time";
    private static final String _MemoryCommittedNT = "Committed";
    private static final String _MemoryReservedNT = "Reserved";
    private static final String _MemoryUnknown = "Unknown";
    private static final String _MemoryProcessImageSizeSUN = "Process Image Size";
    private static final String _MemoryResident = "Resident Set Size";
    private static final String _MemoryVirtual = "Virtual";
    private static final String _Memory = "Memory";
    private static final String _StartingDate = "StartedAt";
    private static final String _PagesStatistics = "Pages";
    private static final String _WebServiceStatistics = "WebService";
    private static final String _DirectActionStatistics = "DirectActions";
    private static final String _DetailsStatistics = "Details";
    private static final String _LogInfo = "LogFile";
    private static final String _TransactionsCount = "Transactions";
    private static final String _WSTransactionsCount = "Web Service Transactions";
    private static final String _DATransactionsCount = "Direct Action Transactions";
    private static final String _CATransactionsCount = "Component Action Transactions";
    private static final String _WSTransactionTime = "Web Service Avg. Transaction Time";
    private static final String _DATransactionTime = "Direct Action Avg. Transaction Time";
    private static final String _CATransactionTime = "Component Action  Avg. Transaction Time";
    private static final String _IdleTime = "Avg. Idle Time";
    private static final String _MovingIdleTime = "Moving Avg. Idle Time";
    private static final String _TransactionTime = "Avg. Transaction Time";
    private static final String _MovingTransactionTime = "Moving Avg. Transaction Time";
    private static final String _SampleSize = "Sample Size For Moving Avg.";
    private static final String _TransactionsStatistics = "Transactions";
    private static final String _TransactionRate = "Transaction Rate";
    private static final String _SessionsCount = "Total Sessions Created";
    private static final String _CurrentSessionsCount = "Current Active Sessions";
    private static final String _MaxActiveSessions = "Peak Active Sessions";
    private static final String _MaxActiveSessionsDate = "Peak Active Sessions Date";
    private static final String _MovingTransactionsPerSession = "Moving Avg. Transactions Per Session";
    private static final String _MovingSessionLife = "Moving Avg. Session Life";
    private static final String _TransactionsPerSession = "Avg. Transactions Per Session";
    private static final String _SessionLife = "Avg. Session Life";
    private static final String _SessionMemory = "Avg. Memory Per Session";
    private static final String _LastSessionStatistics = "Last Session's Statistics";
    private static final String _SessionsStatistics = "Sessions";
    private static final String _SessionRate = "Session Rate";
    private static final NSTimestampFormatter TheDateFormat;
    private static final NSTimeZone TheDateFormatTZ;
    private static final NSTimestampFormatter TheFileDateFormat;
    private volatile int _transactionMovingAverageSampleCount;
    private volatile int _sessionMovingAverageSampleCount;
    private volatile int _transactionsCount;
    private volatile int _lastStatsTransactionsCount;
    private volatile int _webServiceTransactionsCount;
    private volatile int _directActionTransactionsCount;
    private volatile int _componentActionTransactionsCount;
    private volatile int _sessionsCount;
    private volatile int _lastStatsSessionsCount;
    private volatile int _maxActiveSessionsCount;
    private volatile NSTimestamp _maxActiveSessionsDate;
    private volatile int _averageSessionLife;
    private volatile NSArray _lastSessionStatistics;
    private volatile int _movingAverageSessionLife;
    private volatile double _movingAverageRequestsPerSession;
    private volatile int _movingAverageSessionsCount;
    private final NSTimestamp _startDate;
    private final long _startDateMillis;
    private long _lastStatsDateMillis;
    private long _lastWillHandleRequestTimeIntervalMillis;
    private long _lastDidHandleRequestTimeIntervalMillis;
    private long _totalIdleTimeIntervalMillis;
    private long _totalTransactionTimeIntervalMillis;
    private long _totalWSTransactionTimeIntervalMillis;
    private long _totalDATransactionTimeIntervalMillis;
    private long _totalCATransactionTimeIntervalMillis;
    private long _movingIdleTimeIntervalMillis;
    private long _movingTransactionTimeIntervalMillis;
    private volatile int _movingAverageTransactionsCount;
    private final NSDictionary _initializationMemory;
    private final NSMutableDictionary _pagesStatistics;
    private final NSMutableDictionary _pathsStatistics;
    private volatile String _logPath;
    private long _logRotation;
    private long _logCreationDate;
    private volatile String _password;
    private final NSMutableDictionary _webServiceStatistics;
    private final NSMutableDictionary _directActionStatistics;
    private int _statStoreSessionMax;
    private volatile String _currentPage;
    private static final double msecPerDay = 86400000D;
    private static final double dayPerMsec = 1.1574074074074074E-08D;
    protected static volatile long _applicationLastAccessTime;

}

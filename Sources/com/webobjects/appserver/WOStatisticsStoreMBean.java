package com.webobjects.appserver;
/**
 * JMX interface for WOStatisticsStore
 * Since: 5.4
 */
public interface WOStatisticsStoreMBean{
    abstract long getApplicationlastAccessTime();

    abstract long getAverageCATransactionTime();

    abstract long getAverageDATransactionTime();

    abstract long getAverageIdleTime();

    abstract double getAverageRequestsPerSession();

    abstract java.util.HashMap getAverageSessionMemory();

    abstract long getAverageTransactionTime();

    abstract long getAverageWSTransactionTime();

    abstract java.util.HashMap getDirectActionStatistics();

    abstract java.util.ArrayList getLastSessionStatistics();

    abstract java.util.HashMap getMemoryUsage();

    abstract long getMovingAverageIdleTime();

    abstract double getMovingAverageRequestsPerSession();

    abstract long getMovingAverageSessionLife();

    abstract long getMovingAverageTransactionTime();

    abstract java.util.HashMap getPagesStatistics();

    abstract java.util.HashMap getPathsStatistics();

    abstract int getStatisticStoreSessionMax();

    abstract int getTransactionMovingAverageSampleSize();

    abstract java.util.HashMap getWebServiceStatistics();

    abstract java.lang.String logFile();

    abstract long logFileRotationFrequency();

    abstract double logFileRotationFrequencyInDays();

    abstract void logString(java.lang.String statistics);

    abstract int sessionMovingAverageSampleSize();

    abstract void setApplicationLastAccessTime(long timeInMillis);

    /**
     * Logging to Files
     */
    abstract void setLogFile(java.lang.String path, long milliseconds);

    abstract void setSessionMovingAverageSampleSize(int aCount);

    abstract void setTransactionMovingAverageSampleSize(int aCount);

}

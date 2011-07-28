
package com.webobjects.appserver;

import java.util.ArrayList;
import java.util.HashMap;

public interface WOStatisticsStoreMBean {

    public abstract void setLogFile(String s, long l);

    public abstract String logFile();

    public abstract long logFileRotationFrequency();

    public abstract double logFileRotationFrequencyInDays();

    public abstract void logString(String s);

    public abstract int getTransactionMovingAverageSampleSize();

    public abstract void setTransactionMovingAverageSampleSize(int i);

    public abstract int sessionMovingAverageSampleSize();

    public abstract void setSessionMovingAverageSampleSize(int i);

    public abstract long getAverageIdleTime();

    public abstract long getAverageTransactionTime();

    public abstract long getAverageWSTransactionTime();

    public abstract long getAverageDATransactionTime();

    public abstract long getAverageCATransactionTime();

    public abstract long getMovingAverageIdleTime();

    public abstract long getMovingAverageTransactionTime();

    public abstract double getAverageRequestsPerSession();

    public abstract double getMovingAverageRequestsPerSession();

    public abstract long getMovingAverageSessionLife();

    public abstract HashMap getAverageSessionMemory();

    public abstract HashMap getMemoryUsage();

    public abstract ArrayList getLastSessionStatistics();

    public abstract HashMap getPagesStatistics();

    public abstract HashMap getWebServiceStatistics();

    public abstract HashMap getDirectActionStatistics();

    public abstract HashMap getPathsStatistics();

    public abstract int getStatisticStoreSessionMax();

    public abstract long getApplicationlastAccessTime();

    public abstract void setApplicationLastAccessTime(long l);
}

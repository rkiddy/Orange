
package com.webobjects.eocontrol;

import com.webobjects.foundation.*;
import java.util.*;


public class EOEventCenter {
    public static interface EventRecordingHandler {


        public abstract void setLoggingEnabled(boolean flag, Class class1);



        public static final Class _CLASS = null;

    }



    public static void suspendLogging() { return null; }

    public static void resumeLogging() { return null; }

    public static void setPassword(String p) { return null; }

    public static String password() { return null; }

    public EOEventCenter() { return null; }

    public static EOEventCenter currentCenter() { return null; }

    public static NSArray allCenters() { return null; }

    public static void resetLoggingForAllCenters() { return null; }

    public void resetLogging() {}

    public static void registerEventClass(Class aClass, EventRecordingHandler handler) { return null; }

    public static NSArray registeredEventClasses() { return null; }

    public static boolean recordsEventsForClass(Class eventClass) { return null; }

    public static void setRecordsEvents(boolean flag, Class eventClass) { return null; }

    public static EOEvent newEventOfClass(Class aClass, String type) { return null; }

    private void _pruneEventTree(EOEvent event) {}

    private void _trimDownEventTreeTo(long cutoff) {}

    public void _appendEvent(EOEvent event) {}

    private EOEvent _cancelRootEvent(EOEvent event) { return null; }

    private void _cancelEvent(EOEvent event) {}

    public void _markEndOfEvent(EOEvent event) {}

    public static void markStartOfEvent(EOEvent anEvent, Object info) { return null; }

    public static void markAtomicEvent(EOEvent anEvent, Object info) { return null; }

    public static void markEndOfEvent(EOEvent anEvent) { return null; }

    public static void cancelEvent(EOEvent anEvent) { return null; }

    public NSArray eventsOfClass(Class aClass, String type) { return null; }

    public static NSArray eventsOfClassForAllCenters(Class aClass, String type) { return null; }

    public NSArray allEvents() { return null; }

    public static NSArray allEventsForAllCenters() { return null; }

    public NSArray rootEvents() { return null; }

    private static NSMutableArray _rootLevelEvents() { return null; }

    public static NSArray rootEventsForAllCenters() { return null; }

    public static NSArray rootEventsByDuration() { return null; }

    protected static final long _time() { return null; }

    static  {}

    public static final Class _CLASS = null;
    public static final String EventLoggingOverflowDisplay = "EOEventLoggingOverflowDisplay";
    public static final String EventLoggingEnabled = "EOEventLoggingEnabled";
    public static final String EventLoggingLimit = "EOEventLoggingLimit";
    public static final String EventLoggingPassword = "EOEventLoggingPassword";
    private EOEvent _rootEvent;
    private EOEvent _lastEvent;
    private NSMutableArray _events;
    private long _eventCounter;
    private static volatile String _password;
    private static final WeakHashMap _centers;
    private static final NSMutableDictionary _classesWithCallbacks;
    private static final NSMutableDictionary _classesWithCallbacksState;
    private static volatile int sleepy;
    private static boolean _loggingErrorAbort;
    private static boolean defaultLoggingEnabled;
    private static boolean logOverflow;
    private static final NSSelector _resetLoggingCall;
    private static final NSSelector _setLoggingEnabledCall;
    private static long eventLimit;
    private static final String DisabledMarker = "***Disabled***";

}

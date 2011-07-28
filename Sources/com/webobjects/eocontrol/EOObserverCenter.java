
package com.webobjects.eocontrol;

import com.webobjects.foundation.*;
import java.lang.ref.WeakReference;
import java.util.Iterator;
import java.util.WeakHashMap;


public class EOObserverCenter {
    private static class _ThreadInfo {


        _ThreadInfo() { return null; }

        int _notificationSuppressCount;
        Object _lastWillChangeObject;

    }

    private static class _EOObserverArray extends _NSWeakMutableArray {


        public _EOObserverArray() { return null; }

        public EOObserving firstObjectNoCopy() { return null; }

        public void addObjectsToSet(NSMutableSet set) {}

        public Object objectOfClass(Class aClass) { return null; }

        public boolean containsObject(Object eo) { return true; }

        static final long serialVersionUID = 0x32d659aeL;

    }



    public EOObserverCenter() { return null; }

    private static _ThreadInfo _threadInfo() { return null; }

    public static void suppressObserverNotification() { return null; }

    public static void enableObserverNotification() { return null; }

    public static int observerNotificationSuppressCount() { return null; }

    private static void _startReading() { return null; }

    private static void _endReading() { return null; }

    private static void _startWriting() { return null; }

    private static void _endWriting() { return null; }

    public static void addObserver(EOObserving observer, Object eo) { return null; }

    public static void removeObserver(EOObserving observer, Object eo) { return null; }

    public static NSArray observersForObject(Object eo) { return null; }

    public static EOObserving observerForObject(Object eo, Class aClass) { return null; }

    public static void addOmniscientObserver(EOObserving observer) { return null; }

    public static void removeOmniscientObserver(EOObserving observer) { return null; }

    public static void notifyObserversObjectWillChange(Object eo) { return null; }

    static  {}

    public static final Class _CLASS;
    private static final WeakHashMap _observersBySubject;
    private static volatile _EOObserverArray _omniscientObservers;
    private static final WeakHashMap _threadInfos;
    private static WeakReference _lastThread;
    private static _ThreadInfo _lastThreadInfo;
    private static final _NSReadReentrantReaderWriterLock _lock;

}

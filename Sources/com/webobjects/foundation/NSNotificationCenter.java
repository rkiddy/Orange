
package com.webobjects.foundation;

import java.lang.ref.ReferenceQueue;
import java.lang.ref.WeakReference;
import java.lang.reflect.Method;
import java.util.*;


public class NSNotificationCenter {
    private static class _Entry extends _NSWeakMutableCollection._NSWeakMutableCollectionReference {


        public _Entry(Object observer, NSSelector sel, ReferenceQueue queue) { return null; }

        public void invokeMethod(NSNotification notification) {}

        public boolean equals(Object object) { return true; }

        public Object observer() { return null; }

        public Method method() { return null; }

        public String toString() { return null; }

        Method _method;

    }



    public static NSNotificationCenter defaultCenter() { return null; }

    protected NSNotificationCenter() { return null; }

    public String toString() { return null; }

    protected _Entry _getEntry(Object observer, NSSelector selector, ReferenceQueue queue) { return null; }

    private void _checkObserverAndSelector(Object observer, NSSelector sel) {}

    public synchronized void addOmniscientObserver(Object observer, NSSelector sel) { return null; }

    public synchronized void addObserver(Object observer, NSSelector sel, String name, Object object) { return null; }

    private void _removeReferencesWithReferentFromByObjectDict(Object observer, WeakHashMap simpleDict) {}

    private void _removeReferencesWithReferentFromWeakArray(Object observer, _NSWeakMutableArray weakArray) {}

    public synchronized void removeOmniscientObserver(Object observer) { return null; }

    public void removeObserver(Object observer) {}

    public synchronized void removeObserver(Object observer, String name, Object object) { return null; }

    private static void _addObserversFromArrayToSet(_NSWeakMutableArray array, NSMutableSet observers) { return null; }

    public void postNotification(NSNotification notification) {}

    public void postNotification(String notificationName, Object notificationObject) {}

    public void postNotification(String notificationName, Object notificationObject, NSDictionary userInfo) {}

    static  {}

    public static final Class _CLASS;
    private static NSNotificationCenter _defaultCenter;
    private static final WeakHashMap _byObjectPlaceholder;
    private static final _NSWeakMutableArray _byNamePlaceholder;
    private WeakHashMap _byObject;
    private _NSWeakMutableSet _omniscient;
    private NSMutableDictionary _byName;

}

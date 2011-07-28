
package com.webobjects.foundation;

import java.lang.ref.WeakReference;
import java.util.WeakHashMap;


public class NSDelayedCallbackCenter {
    private static class NSLightInvocation {


        public NSLightInvocation(NSSelector newSelector, Object newTarget, Object newArgument, int newOrder) { return null; }

        public NSLightInvocation(NSSelector newSelector, Object newTarget, Object newArgument) { return null; }

        public Object target() { return null; }

        public boolean equals(Object other) { return true; }

        public void invoke() {}

        public int order() { return 0; }

        public int hashCode() { return 0; }

        protected final Object _target;
        protected final NSSelector _selector;
        protected final Object _argument;
        protected final int _order;

    }

    public static interface _Delegate {

        public abstract void _delayedCallbackCenterWillNeedEndOfEventNotification(NSDelayedCallbackCenter nsdelayedcallbackcenter);

        public abstract boolean _delayedCallbackCenterShouldHandleEndOfEvent(NSDelayedCallbackCenter nsdelayedcallbackcenter);

        public abstract void _delayedCallbackCenterWillHandleEndOfEvent(NSDelayedCallbackCenter nsdelayedcallbackcenter);
    }



    public static NSDelayedCallbackCenter defaultCenter() { return null; }

    public static void _setDelegate(_Delegate newDelegate) { return null; }

    public static _Delegate _delegate() { return null; }

    private NSDelayedCallbackCenter() { return null; }

    public void performSelector(NSSelector selector, Object target, Object argument, int order) {}

    public void cancelPerformSelector(NSSelector selector, Object target, Object argument) {}

    public void _cancelAllActionsWithTarget(Object obj) {}

    public void eventEnded() {}

    public void _eventEnded() {}

    static  {}

    public static final Class _CLASS;
    private static volatile _Delegate _delegate;
    private static final WeakHashMap _centers;
    private static volatile WeakReference _lastThread;
    private static volatile NSDelayedCallbackCenter _lastCenter;
    private final NSMutableArray _queue;

}

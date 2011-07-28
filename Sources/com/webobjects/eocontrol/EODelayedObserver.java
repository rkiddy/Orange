
package com.webobjects.eocontrol;

import com.webobjects.foundation._NSUtilities;


public abstract class EODelayedObserver
    implements EOObserving {


    public EODelayedObserver() { return null; }

    public void discardPendingNotification() {}

    public void objectWillChange(Object object) {}

    public int priority() { return 0; }

    public EODelayedObserverQueue observerQueue() { return null; }

    public abstract void subjectChanged();

    static  {}

    public static final Class _CLASS;
    public static final int ObserverPriorityImmediate = 0;
    public static final int ObserverPriorityFirst = 1;
    public static final int ObserverPrioritySecond = 2;
    public static final int ObserverPriorityThird = 3;
    public static final int ObserverPriorityFourth = 4;
    public static final int ObserverPriorityFifth = 5;
    public static final int ObserverPrioritySixth = 6;
    public static final int ObserverPriorityLater = 7;
    public static final int ObserverNumberOfPriorities = 8;
    EODelayedObserver _next;

}

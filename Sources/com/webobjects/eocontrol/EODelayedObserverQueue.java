
package com.webobjects.eocontrol;

import com.webobjects.foundation.*;


public class EODelayedObserverQueue {


    public static EODelayedObserverQueue defaultObserverQueue() { return null; }

    public EODelayedObserverQueue() { return null; }

    public synchronized void _processEndOfEventObservers(Object arg) { return null; }

    public synchronized void enqueueObserver(EODelayedObserver observer) { return null; }

    public synchronized void dequeueObserver(EODelayedObserver observer) { return null; }

    public synchronized void notifyObserversUpToPriority(int lastPriority) { return null; }

    static  {}

    public static final Class _CLASS;
    public static final int FlushDelayedObserversRunLoopOrdering = 0x61a80;
    private static final EODelayedObserverQueue _defaultQueue;
    private static NSSelector _endOfEventSelector;
    private EODelayedObserver _queue[];
    private int _highestNonEmptyQueue;
    private boolean _haveEntryInNotificationQueue;

}

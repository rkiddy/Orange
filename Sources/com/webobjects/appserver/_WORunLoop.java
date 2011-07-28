
package com.webobjects.appserver;

import com.webobjects.foundation.*;


public class _WORunLoop {


    public static _WORunLoop currentRunLoop() { return null; }

    private _WORunLoop() { return null; }

    /**
     * @deprecated Method addTimer is deprecated
     */

    public void addTimer(WOTimer timer) {}

    /**
     * @deprecated Method removeTimer is deprecated
     */

    protected void removeTimer(WOTimer timer) {}

    public synchronized boolean runBeforeDate(NSTimestamp limitDate) { return null; }

    private NSTimestamp _limitDate() { return null; }

    /**
     * @deprecated Method _insertTimer is deprecated
     */

    private void _insertTimer(WOTimer timer) {}

    /**
     * @deprecated Method _nextTimerInterval is deprecated
     */

    private long _nextTimerInterval() { return 0L; }

    private void _acceptInputBeforeDate(NSTimestamp limitDate) {}

    private synchronized void _notify() { return null; }

    public synchronized void stopNow() { return null; }

    public String toString() { return null; }

    static  {}

    NSMutableArray _timers;
    long _nextIntervalDate;
    boolean _hasIntervalDate;
    public static final long _LimitWaitInterval = 0x34fb3b8L;
    private static _WORunLoop _currentRunLoop;

}

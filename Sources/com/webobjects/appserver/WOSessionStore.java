
package com.webobjects.appserver;

import com.webobjects.appserver._private.WOServerSessionStore;
import com.webobjects.foundation.*;
import java.util.Enumeration;


public abstract class WOSessionStore {
    protected class _SessionTimeoutManager
        implements Runnable {


        _SessionTimeoutManager(int interval) { return null; }

        public void terminate() {}

        public void run() {}

        private volatile boolean inAction;
        private final int _interval;
        final WOSessionStore this$0;

    }

    private static class TimeoutEntry {


        TimeoutEntry(String aSessionID) { return null; }

        final String sessionID;
        volatile int expiryTime;
        boolean checkedOut;
        short waitingThreads;

    }



    public WOSessionStore() { return null; }

    public void finalize() throws Throwable {}

    private TimeoutEntry timeoutEntryForSession(String id) { return null; }

    public final WOSession checkOutSessionWithID(String id, WORequest aRequest) { return null; }

    public final void checkInSessionForContext(WOContext context) { return null; }

    private long now() { return 0L; }

    public abstract WOSession removeSessionWithID(String s);

    public abstract WOSession restoreSessionWithID(String s, WORequest worequest);

    public abstract void saveSessionForContext(WOContext wocontext);

    public static WOSessionStore serverSessionStore() { return null; }

    final _NSThreadsafeMutableDictionary _timeoutEntries;
    protected final _SessionTimeoutManager _timeoutManager;

}

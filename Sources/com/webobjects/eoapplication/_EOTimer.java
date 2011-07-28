
package com.webobjects.eoapplication;

import com.webobjects.foundation._NSUtilities;
import java.util.Date;
import javax.swing.SwingUtilities;

public class _EOTimer {
    private static class _TimerThread extends Thread {


        public _TimerThread(_EOTimer timer) { return null; }

        public void run() {}

        static _EOTimer access$000(_TimerThread x0) { return null; }

        private _EOTimer _timer;


        static _EOTimer access$000(_TimerThread x0) { return null; }

        // Unreferenced inner class com/webobjects/eoapplication/_EOTimer$_TimerThread$1

/* anonymous class */
        class _cls1
            implements Runnable {


            _cls1() { return null; }

            public void run() {}

            final _TimerThread this$0;

        }

    }

    public static class CallbackAdaptor
        implements Callback {


        public CallbackAdaptor() { return null; }

        public void timerFired(_EOTimer _peotimer, Date date1, Date date2) {}

        static  {}

        public static final Class _CLASS = null;

    }

    public static interface Callback {


        public abstract void timerFired(_EOTimer _peotimer, Date date, Date date1);



        public static final Class _CLASS = null;

    }



    public _EOTimer(long fireIntervalInMs, Callback timerCallback) { return null; }

    public _EOTimer(long fireIntervalInMs, Callback timerCallback, boolean providesDates, boolean startImmediately, boolean stopsImmediatelyWhenFired, boolean filterTooFastEvents) { return null; }

    protected synchronized void _fire() { return null; }

    public long fireInterval() { return 0L; }

    public Date lastFireDate() { return null; }

    public void start() {}

    public void stop() {}

    public boolean isRunning() { return true; }

    static  {}

    public static final Class _CLASS = null;
    private long _fireInterval;
    private Callback _timerCallback;
    private boolean _providesDates;
    private boolean _stopsImmediatelyWhenFired;
    private boolean _filterTooFastEvents;
    private Date _lastFireDate;
    private Thread _timerThread;

}

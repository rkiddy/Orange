
package com.webobjects.appserver;

import com.webobjects.eocontrol.EOEvent;

/**
 * @deprecated Class WOStopWatch is deprecated
 */

public class WOStopWatch extends EOEvent {


    public WOStopWatch(String aName) { return null; }

    public int count() { return 0; }

    public double accumulatedTime() { return null; }

    public double averageTime() { return null; }

    public double currentRunningTime() { return null; }

    public void start() {}

    public void stop() {}

    public void reset() {}

    public String toString() { return null; }

    private static final long serialVersionUID = 0x2f9956e3L;
    private String _name;
    private long _accumulatedTime;
    private long _currentStartTime;
    private int _startCount;
    private boolean _isRunning;

}

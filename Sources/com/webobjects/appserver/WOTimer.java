
package com.webobjects.appserver;

import com.webobjects.foundation.*;


/**
 * @deprecated Class WOTimer is deprecated
 */

public class WOTimer {


    public static WOTimer scheduledTimer(long ti, Object aTarget, String aSelectorName, Object userInfo, boolean repeats) { return null; }

    public static WOTimer scheduledTimer(long ti, Object aTarget, String aSelectorName, Object anArgument, Class anArgumentClass, boolean repeats) { return null; }

    public WOTimer(long ti, Object aTarget, String aSelectorName, Object userInfo, Class userInfoClass, boolean repeats) { return null; }

    public WOTimer(NSTimestamp fireDate, long interval, Object aTarget, String aSelectorName, Object userInfo, Class userInfoClass, 
            boolean repeats) { return null; }

    public void fire() {}

    public NSTimestamp fireDate() { return null; }

    public double timeInterval() { return null; }

    public void invalidate() {}

    public boolean isValid() { return true; }

    public Object userInfo() { return null; }

    public Object target() { return null; }

    public NSSelector selector() { return null; }

    public void schedule() {}

    public String toString() { return null; }

    public boolean equals(Object aTimer) { return true; }

    public int hashCode() { return 0; }

    private NSTimestamp _fireDate;
    private Object _target;
    private NSSelector _selector;
    private Object _userInfo;
    private boolean _firing;
    private boolean _repeats;
    private boolean _invalid;
    private boolean _hasUserInfoClass;
    private long _timeInterval;

}

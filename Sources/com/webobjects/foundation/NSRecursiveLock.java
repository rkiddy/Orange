
package com.webobjects.foundation;

import java.lang.ref.WeakReference;


/**
 * @deprecated Class NSRecursiveLock is deprecated
 */

public class NSRecursiveLock
    implements NSLocking {


    public NSRecursiveLock() { return null; }

    public void lock() {}

    public boolean tryLock() { return true; }

    public boolean _verifyLock() { return true; }

    public boolean tryLock(long msecs) { return true; }

    public boolean tryLock(NSTimestamp timestamp) { return true; }

    /**
     * @deprecated Method lockBeforeDate is deprecated
     */

    public boolean lockBeforeDate(NSTimestamp timestamp) { return true; }

    public synchronized void unlock() { return null; }

    public synchronized void unlock(long n) { return null; }

    public synchronized long recursionCount() { return null; }

    public String toString() { return null; }

    static  {}

    public static final Class _CLASS;
    protected WeakReference _owner;
    protected long _recursionCount;
    protected short _waitingThreads;

}

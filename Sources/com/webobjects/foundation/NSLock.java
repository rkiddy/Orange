
package com.webobjects.foundation;



public class NSLock
    implements NSLocking {


    public NSLock() { return null; }

    public synchronized void lock() { return null; }

    public synchronized void unlock() { return null; }

    public synchronized boolean tryLock() { return null; }

    public synchronized boolean tryLock(long msecs) { return null; }

    public boolean tryLock(NSTimestamp timestamp) { return true; }

    /**
     * @deprecated Method lockBeforeDate is deprecated
     */

    public boolean lockBeforeDate(NSTimestamp timestamp) { return true; }

    public String toString() { return null; }

    public synchronized boolean _isLocked() { return null; }

    static  {}

    public static final Class _CLASS;
    protected boolean _locked;
    protected short _waitingThreads;

}

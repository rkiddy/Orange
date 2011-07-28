
package com.webobjects.foundation;

import java.util.Enumeration;


/**
 * @deprecated Class NSMultiReaderLock is deprecated
 */

public class NSMultiReaderLock
    implements NSLocking {
    private class ConditionLock {


        public ConditionLock(NSLock lock) { return null; }

        public void await() {}

        public boolean await(long msecs) { return true; }

        public synchronized void signal() { return null; }

        public synchronized void broadcast() { return null; }

        private NSLock _lock;
        final NSMultiReaderLock this$0;

    }

    private class LockRecord {


        public LockRecord() { return null; }

        public long readerLockCount() { return 0L; }

        public void incrementLockCount() {}

        public void decrementLockCount() {}

        public int readerStatus() { return 0; }

        public void promote() {}

        public void demote() {}

        public void suspend() {}

        public void retrieve() {}

        private long _readerLockCount;
        private int _readerStatus;
        final NSMultiReaderLock this$0;

    }



    private void _gcLockTable() {}

    public NSMultiReaderLock() { return null; }

    public void lockForReading() {}

    private void _lockForReading() {}

    public void unlockForReading() {}

    public void lock() {}

    public void lockForWriting() {}

    private void _lockForWriting() {}

    public void unlock() {}

    public void unlockForWriting() {}

    public void suspendReaderLocks() {}

    public void retrieveReaderLocks() {}

    public boolean tryLockForWriting() { return true; }

    public boolean tryLockForReading() { return true; }

    public String toString() { return null; }

    protected String _padString(long num, int fieldWidth) { return null; }

    protected String _padString(String val, int fieldWidth, boolean truncate) { return null; }

    synchronized void validateLockCounts() {}

    static  {}

    public static final Class _CLASS;
    NSMutableDictionary _lockTable;
    volatile Thread _writerLockThread;
    volatile int _writerLockCount;
    volatile int _totalReaderCount;
    NSLock _instanceLock;
    ConditionLock _writerFinished;
    ConditionLock _readerFinished;
    private static final int EOEnabled = 0;
    private static final int EOPromoted = 1;
    private static final int EOSuspended = 2;

}

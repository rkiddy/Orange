
package com.webobjects.foundation;

import java.lang.ref.WeakReference;


public class _NSCollectionReaderWriterLock {


    public _NSCollectionReaderWriterLock() { return null; }

    public synchronized void startReading() { return null; }

    public synchronized void endReading() { return null; }

    public void startWriting() {}

    public synchronized void endWriting() { return null; }

    static  {}

    public static final Class _CLASS;
    private short _readingCounter;
    private short _writingCounter;
    private WeakReference _writingThread;
    private short _waitingWriters;
    private short _waitingReaders;

}

package com.webobjects.foundation;
/**
 * An NSLock object is used to coordinate the operation of multiple threads of execution within the same application. An NSLock object can be used to mediate access to an application's global data or to protect a critical section of code, allowing it to run atomically.
 * An NSLock object represents a lock that can be acquired by only a single thread at a time. While one thread holds the lock, any other thread is prevented from doing so until the owner relinquishes the lock. An application can have multiple NSLock objects, each protecting different sections of code. It's safest to create all of the locks before the application becomes multi-threaded, to avoid race conditions. To create additional locks after the application becomes multi-threaded, the new lock must be made inside a critical code section that is itself protected by an existing lock.
 * The basic interface to NSLock is declared by the NSLocking interface, which defines the lock and unlock methods. To this base, NSLock adds the tryLock methods. Whereas the lock method declared in the interface doesn't return until it is successful, the methods declared in this class add more flexible means of acquiring a lock.
 * An NSLock could be used to coordinate the updating of a visual display shared by a number of threads involved in a single calculation:
 * See Also:NSLock.tryLock(), NSLocking.lock(), NSLocking.unlock(), NSLocking
 */
public class NSLock implements com.webobjects.foundation.NSLocking{
    /**
     * Creates an NSLock object.
     */
    public NSLock(){
         //TODO codavaj!!
    }

    /**
     * Conformance to NSLocking.
     */
    public void lock(){
        return; //TODO codavaj!!
    }

    /**
     * Deprecated.
     * Use tryLock(NSTimestamp timestamp) instead.
     */
    public boolean lockBeforeDate(com.webobjects.foundation.NSTimestamp timestamp){
        return false; //TODO codavaj!!
    }

    public java.lang.String toString(){
        return null; //TODO codavaj!!
    }

    /**
     * Attempts to acquire a lock.
     */
    public boolean tryLock(){
        return false; //TODO codavaj!!
    }

    /**
     * Attempts to acquire a lock for msec milliseconds. The thread is blocked until the receiver acquires the lock or msec milliseconds have passed.
     */
    public boolean tryLock(long msecs){
        return false; //TODO codavaj!!
    }

    /**
     * Attempts to acquire a lock until the time specified by timestamp. The thread is blocked until the receiver acquires the lock or timestamp is reached.
     */
    public boolean tryLock(com.webobjects.foundation.NSTimestamp timestamp){
        return false; //TODO codavaj!!
    }

    /**
     * Conformance to NSLocking. See the method description of unlock in the interface specification for NSLocking.
     */
    public void unlock(){
        return; //TODO codavaj!!
    }

}

package com.webobjects.foundation;
/**
 * The NSLocking interface declares the elementary methods adopted by classes that define lock objects. A lock object is used to coordinate the actions of multiple threads of execution within a single application. By using a lock object, an application can protect critical sections of code from being executed simultaneously by separate threads, thus protecting shared data and other shared resources from corruption.
 * For example, a multithreaded application can be considered in which each thread updates a shared counter. If two threads simultaneously fetch the current value into local storage, increment it, and then write the value back, the counter will be incremented only once, losing one thread's contribution. However, if the code that manipulates the shared data (the critical section of code) must be locked before being executed, only one thread at a time can perform the updating operation, and collisions are prevented.
 * A lock object is either locked or unlocked. You acquire a lock by invoking lock on it, thus putting the object in the locked state. You relinquish a lock by invoking unlock which puts the object in the unlocked state. (The Foundation classes that adopt this interface define additional ways to acquire and relinquish locks.)
 * The lock method as declared in this interface is blocking. That is, the thread that sends a lock message is blocked from further execution until the lock is acquired (presumably because some other thread relinquishes its lock). Classes that adopt this interface typically add methods that offer nonblocking alternatives.
 * These Foundation classes conform to the NSLocking interface:
 * These classes use a locking mechanism that causes a thread to sleep while waiting to acquire a lock rather than to poll the system constantly. Thus, lock objects can be used to lock time-consuming operations without causing system performance to degrade.
 * Java also has a locking mechanism, which is based on the synchronized keyword. In certain cases, you may want to use the Foundation locking classes instead:
 */
public interface NSLocking{
    /**
     * Number of milliseconds in one century
     * See Also:Constant Field Values
     */
    static final long OneCentury=3155695200000l;

    /**
     * Number of milliseconds in one day
     * See Also:Constant Field Values
     */
    static final long OneDay=86400000l;

    /**
     * Number of milliseconds in one Hour
     * See Also:Constant Field Values
     */
    static final long OneHour=3600000l;

    /**
     * Number of milliseconds in one Minute
     * See Also:Constant Field Values
     */
    static final long OneMinute=60000l;

    /**
     * Number of milliseconds in one Second
     * See Also:Constant Field Values
     */
    static final long OneSecond=1000l;

    /**
     * Number of milliseconds in one Week
     * See Also:Constant Field Values
     */
    static final long OneWeek=604800000l;

    /**
     * Number of milliseconds in one Year (defined as 365.2425 days)
     * See Also:Constant Field Values
     */
    static final long OneYear=31556952000l;

    /**
     * Attempts to acquire a lock. This method blocks a thread's execution until the lock can be acquired.
     * An application protects a critical section of code by requiring a thread to acquire a lock before executing the code. Once the critical section is past, the thread relinquishes the lock by invoking unlock.
     */
    abstract void lock();

    /**
     * Relinquishes a previously acquired lock.
     */
    abstract void unlock();

}

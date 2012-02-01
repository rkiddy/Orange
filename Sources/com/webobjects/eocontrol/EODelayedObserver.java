package com.webobjects.eocontrol;
/**
 * The EODelayedObserver class is a part of EOControl's change tracking mechanism. It is an abstract superclass that defines the basic functionality for coalescing change notifications for multiple objects and postponing notification according to a prioritized queue.
 * You would never create an instance of EODelayedObserver. Instead, you would use subclasses, typically subclasses of EOAssociation (defined in EOInterface).
 * See EODelayedObserverConcepts for more information.
 * See Also:EODelayedObserverQueue
 */
public abstract class EODelayedObserver implements com.webobjects.eocontrol.EOObserving{
    /**
     * Constant to represent the number of priorities(8).
     * See Also:Constant Field Values
     */
    public static final int ObserverNumberOfPriorities=8;

    /**
     * Constant to represent the priority of a notification in the queue.
     * See Also:Constant Field Values
     */
    public static final int ObserverPriorityFifth=5;

    /**
     * Constant to represent the priority of a notification in the queue.
     * See Also:Constant Field Values
     */
    public static final int ObserverPriorityFirst=1;

    /**
     * Constant to represent the priority of a notification in the queue.
     * See Also:Constant Field Values
     */
    public static final int ObserverPriorityFourth=4;

    /**
     * Constant to represent the priority of a notification in the queue.
     * See Also:Constant Field Values
     */
    public static final int ObserverPriorityImmediate=0;

    /**
     * Constant to represent the priority of a notification in the queue.
     * See Also:Constant Field Values
     */
    public static final int ObserverPriorityLater=7;

    /**
     * Constant to represent the priority of a notification in the queue.
     * See Also:Constant Field Values
     */
    public static final int ObserverPrioritySecond=2;

    /**
     * Constant to represent the priority of a notification in the queue.
     * See Also:Constant Field Values
     */
    public static final int ObserverPrioritySixth=6;

    /**
     * Constant to represent the priority of a notification in the queue.
     * See Also:Constant Field Values
     */
    public static final int ObserverPriorityThird=3;

    public EODelayedObserver(){
         //TODO codavaj!!
    }

    /**
     * Sends a dequeueObserver message to the receiver's EODelayedObserverQueue to clear it from receiving a change notification. A subclass of EODelayedObserver should invoke this method when its done observing changes.
     */
    public void discardPendingNotification(){
        return; //TODO codavaj!!
    }

    /**
     * Implemented by EODelayedObserver to enqueue the receiver on its EODelayedObserverQueue. Subclasses shouldn't need to override this method; if they do, they must be sure to invoke the superclass's implementation.
     */
    public void objectWillChange(java.lang.Object object){
        return; //TODO codavaj!!
    }

    /**
     * Overridden by subclasses to determine the receiver's designated EODelayedObserverQueue.
     */
    public com.webobjects.eocontrol.EODelayedObserverQueue observerQueue(){
        return null; //TODO codavaj!!
    }

    /**
     * Overridden by subclasses to determine the receiver's change notification priority. The change notification is one of the following: ObserverPriorityImmediate ObserverPriorityFirst ObserverPrioritySecond ObserverPriorityThird ObserverPriorityFourth ObserverPriorityFifth ObserverPrioritySixth ObserverPriorityLater The default implementation returns ObserverPriorityThird.
     */
    public int priority(){
        return 0; //TODO codavaj!!
    }

    /**
     * Implemented by subclasses to examine the receiver's observed objects and take whatever action is necessary. The default implementation does nothing.
     */
    public abstract void subjectChanged();

}

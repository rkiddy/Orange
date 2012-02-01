package com.webobjects.eocontrol;
/**
 * The EODelayedObserverQueue class is a part of EOControl's change tracking mechanism. An EODelayedObserverQueue collects change notifications for observers of multiple objects and notifies them of the changes all at once during the application's run loop, according to their individual priorities.
 * EODelayedObserverQueue's style of notification is particularly useful for coalescing and prioritizing multiple changes. The EOInterface layer's EOAssociation subclasses use it extensively to update Java Client and Cocoa user interfaces, for example. Instead of being told that an object will change, an EODelayedObserver is told that it did change, with a subjectChanged message, as described in the EODelayedObserver class specification. Delayed observation is thus not useful for comparing old and new states, but only for examining the new state. Delayed observation also isn't ordinarily used outside the scope of a Java Client or Cocoa application.
 * The motivation for a delayed change notification mechanism arises mainly from issues in observing multiple objects. Any single change to an observed object typically requires the observer to update some state or perform an action. When many such objects change, it makes no sense to recalculate the new state and perform the action for each object. EODelayedObserverQueue allows these changes to be collected into a single notification. It further orders change notifications according to priorities, allowing observers to be updated in sequence according to dependencies among them. For example, an EOMasterDetailAssociation (in EOInterface), which must update its detail EODisplayGroup (in EOInterface) according to the selection in the master before any redisplay occurs, has an earlier priority than the default for EOAssociations. This prevents regular EOAssociations from redisplaying old values and then displaying the new values after the EOMasterDetailAssociation updates.
 * See EODelayedObserverQueueConcepts for more information.
 * See Also:EODelayedObserverQueue.enqueueObserver(EODelayedObserver observer), EODelayedObserverQueue.defaultObserverQueue(), EODelayedObserverQueue.dequeueObserver(EODelayedObserver anObserver), EOObserving.objectWillChange(Object anObject), EOEnterpriseObject.willChange(), EODelayedObserver.observerQueue(), EODelayedObserver.discardPendingNotification(), EODelayedObserver.subjectChanged(), EOObserverCenter.addObserver(EOObserving observer , Object eo)
 */
public class EODelayedObserverQueue{
    /**
     * Used as a priority the first time enqueueObserver is invoked( if the observer doesn't have a priority ObserverPriorityImmediate) to register the receiver to be sent a notifyObserversUpToPriority message at the end of the run loop.
     * See Also:EODelayedObserverQueue.enqueueObserver(EODelayedObserver), Constant Field Values
     */
    public static final int FlushDelayedObserversRunLoopOrdering=400000;

    /**
     * Creates and returns a new EODelayedObserverQueue with NSRunLoop.DefaultRunLoopMode as its only run loop mode.
     */
    public EODelayedObserverQueue(){
         //TODO codavaj!!
    }

    /**
     * Gets a default observer queue so it can be used to enqueue delay observers.
     */
    public static com.webobjects.eocontrol.EODelayedObserverQueue defaultObserverQueue(){
        return null; //TODO codavaj!!
    }

    /**
     * Removes observer from the receiver.
     */
    public void dequeueObserver(com.webobjects.eocontrol.EODelayedObserver observer){
        return; //TODO codavaj!!
    }

    /**
     * Records observer to be sent subjectChanged messages. If observer's priority is ObserverPriorityImmediate, it's immediately sent the message and not enqueued. Otherwise observer is sent the message the next time notifyObserversUpToPriority is invoked with a priority later than or equal to observer's. Does nothing if observer is already recorded.
     * The first time this method is invoked during the run loop with an observer whose priority isn't ObserverPriorityImmediate, it registers the receiver to be sent a notifyObserversUpToPriority message at the end of the run loop, using FlushDelayedObserversRunLoopOrdering and the receiver's run loop modes. This causes enqueued observers up to a priority of ObserverPrioritySixth to be notified automatically during each pass of the run loop.
     * When observer is done observing changes, it should invoke discardPendingNotification to remove itself from the queue.
     */
    public void enqueueObserver(com.webobjects.eocontrol.EODelayedObserver observer){
        return; //TODO codavaj!!
    }

    /**
     * Sends subjectChanged messages to all of the receiver's enqueued observers whose priority is lastPriority or earlier. This method cycles through the receiver's enqueued observers in priority order, sending each a subjectChanged message and then returning to the very beginning of the queue, in case another observer with an earlier priority was enqueued as a result of the message.
     * EODelayedObserverQueue invokes this method automatically as needed during the run loop, with a lastPriority of ObserverPrioritySixth.
     */
    public void notifyObserversUpToPriority(int lastPriority){
        return; //TODO codavaj!!
    }

}

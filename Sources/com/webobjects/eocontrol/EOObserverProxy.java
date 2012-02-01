package com.webobjects.eocontrol;
/**
 * The EOObserverProxy class is a part of EOControl's change tracking mechanism. It provides a means for objects that can't inherit from EODelayedObserver to handle subjectChanged messages.
 * An EOObserverProxy has a target object on whose behalf it observes objects. EOObserverProxy overrides subjectChanged to send an action message to its target object, allowing the target to act as though it had received subjectChanged directly from an EODelayedObserverQueue.
 * See Also:EOObserverCenter, EODelayedObserverQueue
 */
public class EOObserverProxy extends com.webobjects.eocontrol.EODelayedObserver{
    /**
     * Creates a new EOObserverProxy to send action to target upon receiving a subjectChanged message. action should be a selector for a typical action method, taking one java.util.Object argument and returning void. priority indicates when the receiver is sent this message from EODelayedObserverQueue's notifyObserversUpToPriority method.
     * Parameters:target - the target object on whose behalf EOObserverProxy observes objectsaction - the selector (a typical action method)priority - the priority of the action
     */
    public EOObserverProxy(java.lang.Object target, com.webobjects.foundation.NSSelector action, int priority){
         //TODO codavaj!!
    }

    /**
     * Returns the priority of the action.
     */
    public int priority(){
        return 0; //TODO codavaj!!
    }

    /**
     * Implemented to react to a change in an observed object. Sends the action to the target registered with the receiver.
     */
    public void subjectChanged(){
        return; //TODO codavaj!!
    }

}

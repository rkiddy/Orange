package com.webobjects.eocontrol;
/**
 * The EOObserving interface, a part of EOControl's change tracking mechanism, declares the objectWillChange method, used by observers to receive notifications that an object has changed. This message is sent by EOObserverCenter to all observers registered using its addObserver method.
 * See Also:EOObserverCenter, EODelayedObserver, EODelayedObserverQueue
 */
public interface EOObserving{
    /**
     * Informs the receiver that object's state is about to change. The receiver can record object's state, mark or record it as changed, and examine it later (such as at the end of the run loop) to see how it's changed.
     */
    abstract void objectWillChange(java.lang.Object object);

}

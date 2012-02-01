package com.webobjects.foundation;
/**
 * The NSDisposable interface declares one method, dispose, in which an object prepares for destruction. In dispose, an object should clear all references that other objects have to it. For example, if an NSDisposable object has assigned itself as another object's delegate, the NSDisposable object should set the other object's delegate to null in dispose, thus clearing the other object's reference to the NSDisposable object.
 * By implementing NSDisposable, objects are given a chance to remove references that other objects have to them. This allows other objects to send dispose messages to NSDisposable objects when the NSDisposable objects are no longer needed. As an example, Direct to Java Client disposes of controllers when they are no longer needed, and subsequently, the NSDisposable controllers are garbage collected.
 * See Also:NSDisposable.dispose(), NSDisposableRegistry
 */
public interface NSDisposable{
    /**
     * Invoked when the receiver should prepare itself for destruction. Implementations of this method should break connections that other objects have to the receiver, including unregistering for notifications, resigning as other objects' delegates, release locks and system resources, close files, and any other clean up operations.
     */
    abstract void dispose();

}

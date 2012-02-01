package com.webobjects.foundation;
/**
 * NSNotification objects encapsulate information so that it can be broadcast to other objects by an NSNotificationCenter object.
 * The standard way to pass information between objects is method invocation -- one object invokes the method of another object. However, method invocation requires that the object invoking the method knows which object to invoke the method on, and what messages it responds to. At times, this tight coupling of two objects is undesirable -- most notably because it would join together two otherwise independent subsystems. For these cases, a broadcast model is introduced: an object posts a notification, which is dispatched to the appropriate observers through an NSNotificationCenter object, or simply notification center.
 * This notification model frees an object from concern about what objects it should send information to. Any object may simply post a notification without knowing what objects -- if any -- are receiving the notification. However, objects receiving notifications will need to know at least the notification name, and possibly the type of information the notification contains. The notification center takes care of broadcasting notifications to registered observers. Another benefit of this model is to allow multiple objects to listen for notifications, which would otherwise be cumbersome.
 * Any object may post a notification. Other objects can register themselves as observers to receive notifications when they are posted. The object posting the notification, the object included in the notification, and the observer of the notification may all be different objects or the same object.
 * You can create a notification object with the constructor, however, generally, you will not need to create notifications directly. The NSNotificationCenter method postNotification allows convenient posting of a notification without creating it first.
 * An NSNotification object (referred to as a notification) contains a name, an object, and a userInfo. The name is a tag identifying the notification. The object is any object that the poster of the notification wants to send to observers of that notification, although typically it is the object that posted the notification. The userInfo is an NSDictionary used to store other information the sender of the notification may want to pass to observers.
 * NSNotification objects are immutable.
 * See Also:NSNotificationCenter, NSNotificationCenter.postNotification(NSNotification notification), Serialized Form
 */
public class NSNotification implements com.webobjects.foundation.NSCoding, java.io.Serializable{
    /**
     * Initializes and returns a notification with name name, object object, and an empty userInfo. name may not be null.
     * Parameters:name - name attached to the objectobject - the current notification object
     */
    public NSNotification(java.lang.String name, java.lang.Object object){
         //TODO codavaj!!
    }

    /**
     * Initializes and returns a notification with name name, object object, and arbitrary user information userInfo. The userInfo parameter may be null; if so, the userInfo method will return an empty NSDictionary. name may not be null.
     * Parameters:name - String name of the notificationobject - Object associated with the notificationuserInfo - NSDictionary of arbitrary information
     */
    public NSNotification(java.lang.String name, java.lang.Object object, com.webobjects.foundation.NSDictionary userInfo){
         //TODO codavaj!!
    }

    /**
     * Returns the class that should be used for encoding the receiver in an NSCoder.
     */
    public java.lang.Class classForCoder(){
        return null; //TODO codavaj!!
    }

    /**
     * Creates an NSNotification from the data in coder.
     */
    public static java.lang.Object decodeObject(com.webobjects.foundation.NSCoder coder){
        return null; //TODO codavaj!!
    }

    /**
     * Encodes the receiver using coder.
     */
    public void encodeWithCoder(com.webobjects.foundation.NSCoder coder){
        return; //TODO codavaj!!
    }

    /**
     * Compares the receiving NSNotification object to other. If other is an NSNotification and the contents of other are equal to the contents of the receiver, this method returns true. If not, it returns false.
     * Two notifications are equal if their name and userInfo are equal and their object have identical references.
     */
    public boolean equals(java.lang.Object other){
        return false; //TODO codavaj!!
    }

    /**
     * Provide an appropriate hash code useful for storing the receiver in a hash-based data structure.
     */
    public int hashCode(){
        return 0; //TODO codavaj!!
    }

    /**
     * Returns the name of the notification. Typically, you invoke this method on the notification object passed to your notification-handler method. This notification-handler method is the method applied by the NSSelector registered with NSNotificationCenter when the observer registered to receive the notification.
     * Notification names can be any string. To avoid name collisions, however, you might want to use a prefix that's specific to your application.
     */
    public java.lang.String name(){
        return null; //TODO codavaj!!
    }

    /**
     * Returns the object associated with the notification. The object returned is often the object that posted this notification. It may, however, be null, or another object entirely. Typically, you invoke this method on the notification object passed to your notification-handler method. This notification-handler method is the method applied by the NSSelector registered with NSNotificationCenter when the observer registered to receive the notification.
     */
    public java.lang.Object object(){
        return null; //TODO codavaj!!
    }

    /**
     * Returns a string representation of the receiver including its nameobject and userInfo.
     */
    public java.lang.String toString(){
        return null; //TODO codavaj!!
    }

    /**
     * Returns the notification's userInfo dictionary. This NSDictionary stores any additional information that objects receiving the notification might use. The NSDictionary is empty if no userInfo dictionary was specified when the notification was created.
     */
    public com.webobjects.foundation.NSDictionary userInfo(){
        return null; //TODO codavaj!!
    }

}

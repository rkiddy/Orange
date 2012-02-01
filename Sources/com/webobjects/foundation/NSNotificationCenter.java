package com.webobjects.foundation;
/**
 * An NSNotificationCenter object (or simply, notification center) is essentially a notification dispatch table. It notifies all observers of notifications meeting specific criteria. This information is encapsulated in NSNotification objects, also known as notifications. Client objects register themselves as observers of specific notifications posted by other objects. When an event occurs, an object posts an appropriate notification to the notification center. The notification center dispatches a message to each registered observer, passing the notification as the sole argument. It is possible for the posting object and the observing object to be the same.
 * There is a single notification center instance which can be accessed with the defaultCenter static method.
 * There are two ways to register to receive notifications: If an object wishes to register itself to receive all notifications from all objects, it should invoke the addOmniscientObserver method specifying the method the notification should invoke on the observer Otherwise, an object should register itself to receive a notification by invoking the addObserver method, specifying the method the notification should invoke, and one or both of the name of the notification the observer wants to receive, and which object notifications it receives should contain. If the observer specifies only the object, it will receive all notifications containing that object. If the observer specifies only a notification name, it will receive that notification every time it's posted, regardless of the object associated with it. If both are specified, the observer will receive all of the notifications with that name and associated with the object It is possible for an observer to register to receive more than one message for the same notification. In such a case, the observer will receive all messages it is registered to receive for the notification, but the order in which it receives them cannot be determined.
 * Note: If the default NSNotificationCenter is the last object in your application with a reference to either an object registered to receive notifications or an object being observed, that object will be garbage collected.
 * See Also:NSNotification, NSNotificationCenter.defaultCenter(), NSNotificationCenter.addOmniscientObserver(Object observer, NSSelector sel), NSNotificationCenter.addObserver(Object observer, NSSelector sel, String name, Object object)
 */
public class NSNotificationCenter{
    /**
     * Standard no-arg constructor. For use by subclasses only.
     */
    protected NSNotificationCenter(){
         //TODO codavaj!!
    }

    /**
     * Registers observer to receive notifications with the name name and/or containing object. When a notification of name name containing the object object is posted, the method specified by sel is invoked on observer with the notification as the argument. object or name can be null, but not both.
     * name object Action null null Do not invoke this method specifying null for both name and object. Instead, use addOmniscientObserver. notificationName anObject The notification center notifies the observer of all notifications with the name notficationName and object anObject. notificationName null The notification center notifies the observer of all notifications with the name notificationName. null anObject The notification center notifies the observer of all notifications with an object matching anObject.
     */
    public void addObserver(java.lang.Object observer, com.webobjects.foundation.NSSelector sel, java.lang.String name, java.lang.Object object){
        return; //TODO codavaj!!
    }

    /**
     * Registers observer to receive all notifications from all objects. When a notification is posted, the method specified by sel is invoked on observer with the notification as the argument.
     * Omniscient observers can significantly degrade performance and should be used with care.
     */
    public void addOmniscientObserver(java.lang.Object observer, com.webobjects.foundation.NSSelector sel){
        return; //TODO codavaj!!
    }

    /**
     * Return the single instance of NSNotificationCenter, which should be used for registering all notifications.
     */
    public static com.webobjects.foundation.NSNotificationCenter defaultCenter(){
        return null; //TODO codavaj!!
    }

    /**
     * Posts notification to the notification center. You can create notification with the NSNotification constructor.
     */
    public void postNotification(com.webobjects.foundation.NSNotification notification){
        return; //TODO codavaj!!
    }

    /**
     * Creates a notification with the name notificationName, associates it with the object notificationObject, and posts it to the notification center. notificationObject is typically the object posting the notification. It may be null, or something else entirely.
     */
    public void postNotification(java.lang.String notificationName, java.lang.Object notificationObject){
        return; //TODO codavaj!!
    }

    /**
     * Creates a notification with the name notificationName, associates it with the object notificationObject and dictionary userInfo, and posts it to the notification center.
     * This method is the preferred method for posting notifications. notificationObject is typically the object posting the notification. It may be null, or something else entirely. userInfo also may be null.
     */
    public void postNotification(java.lang.String notificationName, java.lang.Object notificationObject, com.webobjects.foundation.NSDictionary userInfo){
        return; //TODO codavaj!!
    }

    /**
     * Removes observer as the observer of notifications from the notification center.
     */
    public void removeObserver(java.lang.Object observer){
        return; //TODO codavaj!!
    }

    /**
     * Removes observer as the observer of notifications with the name name and object object from the notification center. This method interprets null parameters as wildcards:
     * observer name object Action null name object Removes all observers of name containing object. observer null object Removes observer as an observer of all notifications containing object. observer name null Removes observer as an observer of name containing any object. observer null null Removes all notifications containing observer. null name null Removes all observers of name. null null object Removes all observers of object.
     * Recall that the object a notification contains is usually, but not always, the object that posted the notification.
     */
    public void removeObserver(java.lang.Object observer, java.lang.String name, java.lang.Object object){
        return; //TODO codavaj!!
    }

    /**
     * Unregisters observer as an observer of all notifications.
     */
    public void removeOmniscientObserver(java.lang.Object observer){
        return; //TODO codavaj!!
    }

    public java.lang.String toString(){
        return null; //TODO codavaj!!
    }

}

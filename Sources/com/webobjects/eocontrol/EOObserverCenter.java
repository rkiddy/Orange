package com.webobjects.eocontrol;
/**
 * EOObserverCenter is the central player in EOControl's change tracking mechanism. EOObserverCenter records observers and the objects they observe, and it distributes notifications when the observable objects change.
 * You don't ever create instances of EOObserverCenter. Instead, the class itself acts as the central manager of change notification, registering observers and notifying them of changes. The EOObserverCenter API is provided entirely in static methods.
 * EOObserverCenter is implemented using weak references. Thus, if EOObserverCenter is the last object in the application with a reference to either an object which is registered to receive notifications, or to an object which is being observed, the object is garbage collected.
 * Objects that directly observe others must implement the EOObserving interface, which consists of the single method objectWillChange. To register an object as an observer, invoke EOObserverCenter's addObserver with the observer and the object to be observed. Once this is done, any time the observed object invokes its willChange method, the observer is sent an objectWillChange message informing it of the pending change. An observer to be notified can also be registered when any object changes using addOmniscientObserver. This can be useful in certain situations, but as it's very costly to deal out frequent change notifications, omniscient observers should be used sparingly. To unregister either kind of observer, use a corresponding remove... method.
 * Objects that are about to change invoke willChange, a method defined by the EOEnterpriseObject interface. The implementations of this method invoke EOObserverCenter's notifyObserversObjectWillChange, which sends an objectWillChange message to all observers registered for the object that's changing, as well as to any omniscient observers. notifyObserversObjectWillChange optimizes the process by suppressing redundant objectWillChange messages when the same object invokes willChange several times in a row (as often happens when multiple properties are changed). Change notification is immediate, and takes place before the object's state changes. To compare the object's state before and after the change, it must be arranged to examine the new state at the end of the event.
 * Change notification can be suppressed when necessary, using the suppressObserverNotification and enableObserverNotification methods. While notification is suppressed, neither regular nor omniscient observers are informed of changes. These methods nest, so suppressObserverNotification can be invoked multiple times, and notification isn't re enabled until a matching number of enableObserverNotification messages have been sent.
 * See Also:EOEnterpriseObject.willChange(), EOObserving.objectWillChange(Object)
 */
public class EOObserverCenter{
    public EOObserverCenter(){
         //TODO codavaj!!
    }

    /**
     * Records observer to be notified with an objectWillChange message when eo changes.
     */
    public static void addObserver(com.webobjects.eocontrol.EOObserving observer, java.lang.Object eo){
        return; //TODO codavaj!!
    }

    /**
     * Records observer to be notified with an objectWillChange message when any object changes. This can cause significant performance degradation, and so should be used with care. The omniscient observer must be prepared to receive the objectWillChange message with a null argument.
     */
    public static void addOmniscientObserver(com.webobjects.eocontrol.EOObserving observer){
        return; //TODO codavaj!!
    }

    /**
     * Counters a prior suppressObserverNotification message. When no such messages remain in effect, the notifyObserversObjectWillChange method is re-enabled. Throws an IllegalStateException if not paired with a prior suppressObserverNotification message.
     */
    public static void enableObserverNotification(){
        return; //TODO codavaj!!
    }

    /**
     * Unless change notification is suppressed, sends an objectWillChange to all observers registered for eo with that object as the argument, and sends that message to all omniscient observers as well. If invoked several times in a row with the same object, only the first invocation has any effect, since subsequent change notifications are redundant.
     * If an observer wants to ensure that it receives notification the next time the last object to change changes again, it should use the statement:
     * EOObserverCenter.notifyObserversObjectWillChange(null);
     * An observable object (typically an enterprise object) invokes this method from its willChange implementation, so this method should never be invoked directly.
     */
    public static void notifyObserversObjectWillChange(java.lang.Object eo){
        return; //TODO codavaj!!
    }

    /**
     * Returns an observer for eo that is of class aClass. If more than one observer of eo is of class aClass, the specific observer returned is undetermined. observersForObject can be used instead to get all observers and examine their class membership.
     */
    public static com.webobjects.eocontrol.EOObserving observerForObject(java.lang.Object eo, java.lang.Class aClass){
        return null; //TODO codavaj!!
    }

    /**
     * Returns the number of suppressObserverNotification messages in effect.
     */
    public static int observerNotificationSuppressCount(){
        return 0; //TODO codavaj!!
    }

    /**
     * Returns all observers of eo.
     */
    public static com.webobjects.foundation.NSArray observersForObject(java.lang.Object eo){
        return null; //TODO codavaj!!
    }

    /**
     * Removes observer as an observer of eo.
     */
    public static void removeObserver(com.webobjects.eocontrol.EOObserving observer, java.lang.Object eo){
        return; //TODO codavaj!!
    }

    /**
     * Unregisters observer as an observer of all objects.
     */
    public static void removeOmniscientObserver(com.webobjects.eocontrol.EOObserving observer){
        return; //TODO codavaj!!
    }

    /**
     * Disables the notifyObserversObjectWillChange method, so that no change notifications are sent. This method can be invoked multiple times. enableObserverNotification must then be invoked an equal number of times to re-enable change notification.
     */
    public static void suppressObserverNotification(){
        return; //TODO codavaj!!
    }

}

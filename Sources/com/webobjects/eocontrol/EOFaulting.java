package com.webobjects.eocontrol;
/**
 * The EOFaulting interface together with the EOFaultHandler class forms a general mechanism for postponing an object's initialization until it is actually needed. In it's preinitialization state, an EOFaulting object is known as a fault. When the object is sent a message to which it can't respond without initializing, it fires a fault handler to finish initializing. Faults are most commonly used by the EOAccess layer to represent an object not yet fetched from the database, but that must nonetheless exist as an instance in the application, typically because it's the destination of a relationship. Consequently, a fault typically fires when an attempt is made to access any of its data. In this case, firing a fault involves fetching the object's data.
 * The default implementations of EOFaulting in EOCustomObject and EOGenericRecord are sufficient for most purposes. If you need custom faulting behavior, you typically create a subclass of EOFaultHandler to accommodate different means of converting faults into regular objects.
 * See Also:EOFaultHandler
 */
public interface EOFaulting{
    /**
     * Restores the receiver to its status prior to the turnIntoFault message that turned the object into a fault. Throws an exception if the receiver isn't a fault. You rarely use this method. Ususally, it is invoked by an EOFaultHandler during the process of firing the fault.
     */
    abstract void clearFault();

    /**
     * Returns the EOFaultHandler that will help the reciever to fire. Returns null if the receiver isn't a fault.
     */
    abstract com.webobjects.eocontrol.EOFaultHandler faultHandler();

    /**
     * Returns whether the receiver is a fault or not.
     */
    abstract boolean isFault();

    /**
     * Converts the receiver into a fault, assigning handler as the object that stores how to retrieve its original state and later converts the fault back into a normal object (typically by fetching data from an external data source). The receiver becomes the owner of handler.
     */
    abstract void turnIntoFault(com.webobjects.eocontrol.EOFaultHandler handler);

    /**
     * Fills the receiver with values fetched from the database. Before the application attempts to message an object, you must ensure that it has been filled with its data. To do this, enterprise objects invoke the method willRead prior to any attempt to access the object's state, most typically in "get" methods such as the following:
     * public String roleName() { willRead(); return roleName; }
     */
    abstract void willRead();

}

package com.webobjects.eocontrol;
/**
 * EOFaultHandler is an abstract class that defines the mechanisms that create faults and help them to fire. Faults are used as placeholders for an enterprise object's relationship destinations. For example, suppose an Employee object has a department relationship to the employee's department. When an employee is fetched, faults are created for its relationship destinations. In the case of the department relationship, an empty Department object is created. The Department object's data isn't fetched until the Department is accessed, at which time the fault is said to fire.
 * Subclasses of EOFaultHandler perform the specific steps necessary to get data for the fault and fire it. The EOAccess layer, for example, uses private subclasses to fetch data using an EODatabaseContext. Most of EOFaultHandler's methods are properly defined. Only overriding of completeInitializationOfObject is needed to provide appropriate behavior.
 * An EOFaultHandler belongs exclusively to a single fault object, and shouldn't be shared or used by any other object. You also shouldn't send messages directly to a fault handler object, only the fault object should do that.
 * An EOFaultHandler can be created using the standard constructor. To turn an object into a fault, the static method EOFaulthandler.makeObjectIntoFault can be invoked with the object and a fault handler as an argument. Alternatively, you can send a newly created object a turnIntoFault message (defined in the EOFaulting interface which must be implemented by all objects which can be faults) and provide an EOFaultHandler as argument that will help the fault to fire.
 * When a fault receives a message that requires it to fire, it sends a completeInitializationOfObject method to its EOFaultHandler. This method is responsible for invoking the clearFault method to revert the fault to its original state, and then do whatever is necessary to complete initialization of the object. Doing so typically involves fetching data from an external data source and passing it to the object.
 * See Also:EOFaultHandler.completeInitializationOfObject(Object), EOFaultHandler.makeObjectIntoFault(Object, EOFaultHandler), EOFaultHandler.clearFault(Object), EOFaulting.turnIntoFault(EOFaultHandler)
 */
public abstract class EOFaultHandler{
    public EOFaultHandler(){
         //TODO codavaj!!
    }

    /**
     * Restores object to its status prior to the makeObjectIntoFault message that turned it into a fault. Throws an IllegalArgumentException if object isn't a fault. Faults typically fire automatically when accessed, using the completeInitializationOfObject method.
     */
    public static void clearFault(java.lang.Object object){
        return; //TODO codavaj!!
    }

    /**
     * Implemented by subclasses to revert object to its original state (to fire the fault) and complete its initialization in whatever means is appropriate to the subclass. For example, the EOAccess layer's subclasses of EOFaultHandler fetch data from the database and pass it to the object. This method is invoked automatically by a fault when it's sent a message it can't handle without fetching its data.
     */
    public abstract void completeInitializationOfObject(java.lang.Object object);

    /**
     * Invoked by willReadRelationship to ensure that fault isn't a deferred fault, or to replace it with a normal fault if it is. EOFaultHandler's implementation simply returns its fault. A private subclass that handles deferred faulting implements this method to return a normal fault if fault is a deferred fault. You should never need to override this method.
     */
    public java.lang.Object createFaultForDeferredFault(java.lang.Object fault, com.webobjects.eocontrol.EOEnterpriseObject sourceEO){
        return null; //TODO codavaj!!
    }

    /**
     * Returns a String that describes object.
     */
    public java.lang.String descriptionForObject(java.lang.Object object){
        return null; //TODO codavaj!!
    }

    /**
     * Returns a String that describes object in a short form.
     */
    public static java.lang.String eoShallowDescription(java.lang.Object object){
        return null; //TODO codavaj!!
    }

    /**
     * Informs the receiver that object is about to be reverted to its original state. EOFaultHandler's implementation does nothing.
     */
    public abstract void faultWillFire(java.lang.Object object);

    /**
     * Returns the EOFaultHandler that will help object to fire. Returns null if object isn't a fault.
     */
    public static com.webobjects.eocontrol.EOFaultHandler handlerForFault(java.lang.Object object){
        return null; //TODO codavaj!!
    }

    /**
     * Returns true if object is a fault, false otherwise.
     */
    public static boolean isFault(java.lang.Object object){
        return false; //TODO codavaj!!
    }

    /**
     * Converts object into a fault, assigning handler as the object that stores how to retrieve its original state and later converts the fault back into a normal object (typically by fetching data from an external data source). The new fault becomes the owner of handler.
     */
    public static void makeObjectIntoFault(java.lang.Object object, com.webobjects.eocontrol.EOFaultHandler handler){
        return; //TODO codavaj!!
    }

    /**
     * Returns the target class of the receiver's fault. The fault may, however, be converted to a member of this class or of a subclass of this class. For example, to support entity inheritance, the EOAccess layer fires faults for entities with subentities into the appropriate class on fetching their data.
     */
    public java.lang.Class targetClass(){
        return null; //TODO codavaj!!
    }

    /**
     * Returns a String containing a string representation of the receiver.
     */
    public java.lang.String toString(){
        return null; //TODO codavaj!!
    }

}

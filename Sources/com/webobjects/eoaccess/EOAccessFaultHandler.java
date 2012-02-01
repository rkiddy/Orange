package com.webobjects.eoaccess;
/**
 * EOAccessFaultHandler is a subclass of EOAccessGenericFaultHandler that implements an object fault for Enterprise Objects.
 */
public class EOAccessFaultHandler extends com.webobjects.eoaccess.EOAccessGenericFaultHandler{
    /**
     * Returns a new fault handler with all of the information necessary to fetch the object when the fault is fired.
     * Parameters:globalID - The EOKeyGlobalID for the object to be faulted in.dbcontext - The EODatabaseContext that should be used to load the object to be faulted in.ec - The EOEditingContext in which the faulted object should be recorded.
     */
    public EOAccessFaultHandler(com.webobjects.eocontrol.EOKeyGlobalID globalID, com.webobjects.eoaccess.EODatabaseContext dbcontext, com.webobjects.eocontrol.EOEditingContext ec){
         //TODO codavaj!!
    }

    /**
     * Asks the receiver's database context to fetch the object if it is not already in memory. This method is called when the fault is fired and uses the EOObjectStore interface to get the information from the receiver's editing context. Throws an exception if the fault was fired while there was another fetch in progress and there were no database channels available to process this fault.
     */
    public void completeInitializationOfObject(java.lang.Object object){
        return; //TODO codavaj!!
    }

    /**
     * Returns a string naming the original class of the receiver's fault and giving the fault's id, also noting that it's a fault. For example: "
     * Employee (Fault 0x3a07)
     * ". (The fault must be passed as a parameter because EOFaultHandlers don't store back pointers to their faults.)
     */
    public java.lang.String descriptionForObject(java.lang.Object object){
        return null; //TODO codavaj!!
    }

    /**
     * Returns the receiver's globalID.
     */
    public com.webobjects.eocontrol.EOKeyGlobalID globalID(){
        return null; //TODO codavaj!!
    }

    /**
     * Returns a string representation of the fault handler.
     */
    public java.lang.String toString(){
        return null; //TODO codavaj!!
    }

}

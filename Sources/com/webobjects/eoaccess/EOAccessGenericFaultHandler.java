package com.webobjects.eoaccess;
/**
 * EOAccessGenericFaultHandler is an abstract class that helps an EOAccessFault to fire by fetching data using an EODatabaseContext. You shouldn't use EOAccessGenericFaultHandler directly; instead, use its subclasses, EOAccessFaultHandler and EOAccessArrayFaultHandler. EOAccessGenericFaultHandler lets you chain together all the fault handlers in the access layer, so that the batch faulting mechanism can find other faults related to the one that triggered the batch. Use linkAfterHandler to link one fault after another. Use next and previous to traverse the chain.
 * See Also:EOAccessGenericFaultHandler.linkAfterHandler(EOAccessGenericFaultHandler faultHandler, int generation), EOAccessGenericFaultHandler.next(), EOAccessGenericFaultHandler.previous(), EOAccessFaultHandler, EOAccessArrayFaultHandler
 */
public abstract class EOAccessGenericFaultHandler extends com.webobjects.eocontrol.EOFaultHandler{
    /**
     * Default constructor.
     */
    public EOAccessGenericFaultHandler(){
         //TODO codavaj!!
    }

    /**
     * An abstract method that should be implemented by subclasses to fetch the rest of the object eo from the database when the fault fires. This can be perceived as the completion of the initialization of an object in memory.
     */
    public abstract void completeInitializationOfObject(java.lang.Object eo);

    /**
     * Returns the current database context associated with this fault handler.
     */
    public com.webobjects.eoaccess.EODatabaseContext databaseContext(){
        return null; //TODO codavaj!!
    }

    /**
     * Returns the current EOEditingContext associated with this fault handler.
     */
    public com.webobjects.eocontrol.EOEditingContext editingContext(){
        return null; //TODO codavaj!!
    }

    /**
     * Removes object from the chain of fault handlers.
     */
    public void faultWillFire(java.lang.Object object){
        return; //TODO codavaj!!
    }

    /**
     * Returns the number that represents when the fault handler was built.
     */
    public int generation(){
        return 0; //TODO codavaj!!
    }

    /**
     * Adds this handler to a chain of fault handlers. All faults in an access layer can be chained together, so the batch faulting mechanism can find other faults related to the one that triggered the batch.
     */
    public void linkAfterHandler(com.webobjects.eoaccess.EOAccessGenericFaultHandler faultHandler, int generation){
        return; //TODO codavaj!!
    }

    /**
     * Returns the next fault handler in the chain.
     */
    public com.webobjects.eoaccess.EOAccessGenericFaultHandler next(){
        return null; //TODO codavaj!!
    }

    /**
     * Returns the previous fault handler in the chain.
     */
    public com.webobjects.eoaccess.EOAccessGenericFaultHandler previous(){
        return null; //TODO codavaj!!
    }

    /**
     * Removes fault handlers that are not associated with any editing context from the chain of fault handlers. Each fault handler has a WeakReference to the EOEditingContext associated with it; hence, it does not prevent the editing context from being garbage collected. From time to time, this static method is called to perform housekeeping on the WeakReferences.
     */
    public static void processQueue(java.lang.ref.ReferenceQueue refQueue){
        return; //TODO codavaj!!
    }

    protected void setContext(com.webobjects.eoaccess.EODatabaseContext dbcontext, com.webobjects.eocontrol.EOEditingContext ec){
        return; //TODO codavaj!!
    }

}

package com.webobjects.eocontrol;
/**
 * An instance of the EOAggregateEvent class is used to aggregate multiple EOEvent objects with the same aggregate signature into one event. This one aggregate event is typically used in a WOEventDisplay page in a WebObjects application to display the sum of all of the aggregated events' durations.
 * See Also:Serialized Form
 */
public class EOAggregateEvent extends com.webobjects.eocontrol.EOEvent{
    public EOAggregateEvent(){
         //TODO codavaj!!
    }

    /**
     * Adds e to the set of events that the receiver aggregates.
     */
    public void addEvent(com.webobjects.eocontrol.EOEvent e){
        return; //TODO codavaj!!
    }

    /**
     * Gets the comment from any member of the EOvents set aggregated by the receiver.
     */
    public java.lang.String comment(){
        return null; //TODO codavaj!!
    }

    /**
     * Gets the description of the family of events represented by the class.
     */
    public java.lang.String description(){
        return null; //TODO codavaj!!
    }

    /**
     * Description copied from class:
     * Returns the name of a WebObjects component to use to display the receiver's logging information. EOEvent's implementation uses the WOEventRow component, which is generally sufficient for subclasses.
     */
    public java.lang.String displayComponentName(){
        return null; //TODO codavaj!!
    }

    /**
     * Gets the the sum of all of the aggregated events'durations excluding the receivers subevents.
     */
    public long durationWithoutSubevents(){
        return 0l; //TODO codavaj!!
    }

    /**
     * Typically, an EOAggregateEvent has at least one event, the event for which the event logging system created the aggregate event.
     */
    public com.webobjects.foundation.NSArray events(){
        return null; //TODO codavaj!!
    }

    /**
     * Gets the info from any member of the EOvents set aggregated by the receiver.
     */
    public java.lang.Object info(){
        return null; //TODO codavaj!!
    }

    /**
     * Used to group and aggregate the receiver with other events that have the same signature. EOEvent defines one signature type, EOBasicEventSignature, which has the corresponding signature of the form, "title comment". If the specified signature type is unknown, EOEvent's implementation returns null.
     */
    public java.lang.String signatureOfType(int tag){
        return null; //TODO codavaj!!
    }

    /**
     * For each EOEvent aggregated in the reciver this method gathers their subevents and return an array with them.The array is ordered ascending by duration.
     */
    public com.webobjects.foundation.NSArray subevents(){
        return null; //TODO codavaj!!
    }

    /**
     * Gets the title from any member of the EOvents set aggregated by the receiver.
     */
    public java.lang.String title(){
        return null; //TODO codavaj!!
    }

}

package com.webobjects.eocontrol;
/**
 * EOAccountEvent class is intended for internal use only.
 * See Also:Serialized Form
 */
public class EOAccountEvent extends com.webobjects.eocontrol.EOAggregateEvent{
    public EOAccountEvent(){
         //TODO codavaj!!
    }

    /**
     * Description copied from class:
     * Gets the comment from any member of the EOvents set aggregated by the receiver.
     */
    public java.lang.String comment(){
        return null; //TODO codavaj!!
    }

    /**
     * Description copied from class:
     * For each EOEvent aggregated in the reciver this method gathers their subevents and return an array with them.The array is ordered ascending by duration.
     */
    public com.webobjects.foundation.NSArray subevents(){
        return null; //TODO codavaj!!
    }

    /**
     * Description copied from class:
     * Gets the title from any member of the EOvents set aggregated by the receiver.
     */
    public java.lang.String title(){
        return null; //TODO codavaj!!
    }

    /**
     * Description copied from class:
     * Returns a String that includes the receiver's title, comment, and duration or start date (whichever is appropriate).
     */
    public java.lang.String toString(){
        return null; //TODO codavaj!!
    }

}

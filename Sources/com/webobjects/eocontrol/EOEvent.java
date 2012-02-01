package com.webobjects.eocontrol;
/**
 * EOEvent is an abstract class that provides concrete subclasses with a structure for storing information about a logged event.
 * Subclasses of EOEvent don't need to override any inherited methods or implement any methods at all. You can customize the behavior if you want, but the default implementations are sufficient for most cases. Generally, to create a subclass of EOEvent, you declare it and create a description file that defines the events the subclass logs. The class itself usually declares no instance variables and implements no methods. The abstract implementation gets all the information it needs from the description file.
 * Most of the work involved in logging custom events is instrumenting the code.
 * See Also:EOEvent.eventTypeDescriptions(Class aClass), EOEventCenter, Serialized Form
 */
public class EOEvent implements java.io.Serializable{
    /**
     * A possible signature type for use with the methods signatureOfType, aggregateEvents and groupEvents.
     * See Also:EOEvent.signatureOfType(int), EOEvent.aggregateEvents(NSArray, int), EOEvent.groupEvents(NSArray, int), Constant Field Values
     */
    public static final int BasicEventSignature=0;

    /**
     * Key used in the dictionary returned by eventTypeDescriptions. The EventGroupName entry provides the description of the family of events represented by the event class.
     * See Also:EOEvent.eventTypeDescriptions(Class), Constant Field Values
     */
    public static final java.lang.String EventGroupName="EOEventGroupName";

    /**
     * Creates a new event object.
     */
    public EOEvent(){
         //TODO codavaj!!
    }

    /**
     * Returns an array of aggregated events. Gets the signature of type tag from each EOEvent in events and aggregates the events with the same signature into a special, single event. The resulting array has an event for each different signature. The events in this array have a duration equal to the sum of the durations of its aggregated events. The subevents of these special events are the union of the subevents of its aggregated events. This method is for use by the WOEventDisplay page.
     */
    public static com.webobjects.foundation.NSArray aggregateEvents(com.webobjects.foundation.NSArray events, int tag){
        return null; //TODO codavaj!!
    }

    /**
     * Returns a description of the family of events represented by the class aClass. EOEvent's implementation returns the event description for the EOEvent.EventGroupName key. For more information, see the eventTypeDescriptions method description.
     */
    public static java.lang.String classDescription(java.lang.Class aClass){
        return null; //TODO codavaj!!
    }

    /**
     * Returns type-specific information about the event. EOEvent's implementation returns a String representation of the receiver's info.
     */
    public java.lang.String comment(){
        return null; //TODO codavaj!!
    }

    /**
     * Compares the receiver to other. If the receiver was logged before the other event, this method returns NSComparator.OrderedAscending. If the receiver was logged after the other event, this method returns NSComparator.OrderedDescending. If the dates match, this method returns NSComparator.OrderedSame.
     */
    public int compare(com.webobjects.eocontrol.EOEvent other){
        return 0; //TODO codavaj!!
    }

    /**
     * Returns a String that includes the receiver's title, comment, and duration or start date (whichever is appropriate).
     */
    public java.lang.String description(){
        return null; //TODO codavaj!!
    }

    /**
     * Returns the name of a WebObjects component to use to display the receiver's logging information. EOEvent's implementation uses the WOEventRow component, which is generally sufficient for subclasses.
     */
    public java.lang.String displayComponentName(){
        return null; //TODO codavaj!!
    }

    /**
     * Returns the duration of the receiver in milliseconds or 0 if the event is atomic (not a branch event) or if the branch is not yet closed.
     */
    public long duration(){
        return 0l; //TODO codavaj!!
    }

    /**
     * Returns the duration of the receiver in milliseconds, not including the time spent in its subevents (if any).
     */
    public long durationWithoutSubevents(){
        return 0l; //TODO codavaj!!
    }

    /**
     * Used to determine event types and descriptions for a family of events. The keys of this dictionary are event types and the corresponding values are descriptions of events of the types. Subclasses don't need to implement this method since EOEvent's implementation is generally sufficient for subclasses.
     * EOEvent's implementation reads the event types and their descriptions from a file. To define the types the event class represents, create a description file for the event and add it to the project's resources. An event's description file defines the event categories and subcategories used in the WOEventDisplay page. The file's contents is a dictionary in plist format.
     * For example, consider a CustomAdaptorEvent that would log events for a custom database adaptor. CustomAdaptorEvent would be a subclass of EOEvent and use EOEvent's implementation of eventTypeDescriptions. The name of its description file would be CustomAdaptorEvent.description, and it would look like this:
     * { EOEventGroupName =
     * Custom Adaptor Event
     * ; connect =
     * Connect
     * ; openChannel =
     * Open Channel
     * ; evaluateExpression =
     * Evaluate Expression
     * ; fetchRow =
     * Fetch Row
     * ; commitTransaction =
     * Commit Transaction
     * ; }
     * Using the EOEvent implementation, the EOEventGroupName entry is mandatory; it describes the family of events logged by the event class. Any other keys are defined by the event class itself. In the CustomAdaptorEvent class, the other keys (connect, openChannel, and so on) would be the types of the events CustomAdaptorEvent logs.
     * If the file doesn't exist or if there's an error reading the file, EOEvent creates a dictionary with a single entry; the entry's key is EOEventGroupName and the value is the name of the event class (such as CustomAdaptorEvent).
     */
    public static com.webobjects.foundation.NSDictionary eventTypeDescriptions(java.lang.Class aClass){
        return null; //TODO codavaj!!
    }

    /**
     * Returns an array of grouped events. Gets the signature of type tag from each EOEvent in events and groups events with the same signature into a special, single event. The resulting array has an event for each different signature. The subevents of these special events are the grouped events. This method is for use by the WOEventDisplay page.
     */
    public static com.webobjects.foundation.NSArray groupEvents(com.webobjects.foundation.NSArray events, int tag){
        return null; //TODO codavaj!!
    }

    /**
     * Returns the custom info for the receiver.
     */
    public java.lang.Object info(){
        return null; //TODO codavaj!!
    }

    /**
     * Initializes the receiver, a newly created event, as an atomic event that has an absolute start date (and not a duration), and sets its info to info. The new event object is usually created with the EOEventCenter method newEventOfClass.
     * Note: Don't invoke this method directly. Use the corresponding method defined in EOEventCenter instead.
     */
    public void markAtomicWithInfo(java.lang.Object info){
        return; //TODO codavaj!!
    }

    /**
     * Marks the end of a branch event, which has the side effect of setting the duration.
     * Note: Don't invoke this method directly. Use the corresponding method defined in EOEventCenter instead.
     */
    public void markEnd(){
        return; //TODO codavaj!!
    }

    /**
     * Initializes the receiver, a newly created event, to be a branch event (that possibly has nested subevents), and sets its info to info. The new event object is usually created with the EOEventCenter method newEventOfClass.
     * Note: Don't invoke this method directly. Use the corresponding method defined in EOEventCenter instead.
     */
    public void markStartWithInfo(java.lang.Object info){
        return; //TODO codavaj!!
    }

    /**
     * Returns the parent event, if any, or null otherwise. Events logged at the root level do not have a parent. Other events return the event that was open at the time that they were started.
     */
    public com.webobjects.eocontrol.EOEvent parentEvent(){
        return null; //TODO codavaj!!
    }

    /**
     * Sets the custom event information for the receiver. This information is used to display event logging information in the WOEventDisplay page. The info argument can be any kind of object that implements the equals and toString methods.
     */
    public void setInfo(java.lang.Object info){
        return; //TODO codavaj!!
    }

    /**
     * Sets the receiver's type. EOEvent's default implementation gets the set of available types from a description file.
     */
    public void setType(java.lang.String type){
        return; //TODO codavaj!!
    }

    /**
     * Returns the requested receiver's signature, which can be used to group and aggregate the receiver with other events that have the same signature. EOEvent defines one signature type, EOEvent.BasicEventSignature, which has the corresponding signature of the form "title-comment". If the specified signature type is unknown, EOEvent's implementation returns null.
     */
    public java.lang.String signatureOfType(int tag){
        return null; //TODO codavaj!!
    }

    /**
     * Returns the date at which the receiver was logged.
     */
    public com.webobjects.foundation.NSTimestamp startDate(){
        return null; //TODO codavaj!!
    }

    /**
     * Returns the receiver's immediate subevents (events that were logged with this event as their parent).
     */
    public com.webobjects.foundation.NSArray subevents(){
        return null; //TODO codavaj!!
    }

    /**
     * Returns the event type description corresponding with the receiver's type. The title is used by WOEventDisplay. EOEvent's implementation returns the value from the eventTypeDescriptions dictionary for the receiver's type. If there isn't an entry in the eventTypeDescriptions dictionary for the receiver's type, EOEvent's implementation returns the name of the receiver's class.
     */
    public java.lang.String title(){
        return null; //TODO codavaj!!
    }

    /**
     * Returns a String that includes the receiver's title, comment, and duration or start date (whichever is appropriate).
     */
    public java.lang.String toString(){
        return null; //TODO codavaj!!
    }

    /**
     * Returns the receiver's type. Using the event type definition scheme implemented by EOEvent, the types are defined in a description file as described in the eventTypeDescriptions method description.
     */
    public java.lang.String type(){
        return null; //TODO codavaj!!
    }

}

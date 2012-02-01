package com.webobjects.eocontrol;
/**
 * EOEventCenter collects and manages EOEvents to measure the duration of operations in any applications. Measurements allow you to profile an application and optimize its execution time. For this, Enterprise Objects Framework and WebObjects instrument key portions of their code to measure the elapsed time of functions and methods.
 * The event logging system defined by EOEventCenter and EOEvent allow the measurement of the length of certain instrumented operations. An EOEvent keeps information (such as duration and type) about a logged event, and an EOEventCenter manages those events. EOEvent is an abstract class whose subclasses are responsible for defining the events they track. For example, there are (private) subclasses for adaptor events, editing context events, WOApplication events, and so on. To enable event logging in an application, simply open the WOEventSetup page as described in WOEventSetup and enable logging for the event classes.
 * In addition to the framework support, the WOExtensions framework provides components for using the feature. WOEventSetup is a page used to configure event logging, and WOEventDisplay is a page that displays event information.
 * See EOEventCenterConcepts for more information.
 * See Also:EOEvent, WOEventSetup
 */
public class EOEventCenter{
    /**
     * Name of the system property (a Boolean value) defining whether or not to log registered event classes by default.
     * See Also:Constant Field Values
     */
    public static final java.lang.String EventLoggingEnabled="EOEventLoggingEnabled";

    /**
     * Name of the system property (an Integer value) defining the maximum size of the event logging stack.
     * See Also:Constant Field Values
     */
    public static final java.lang.String EventLoggingLimit="EOEventLoggingLimit";

    /**
     * Name of the system property (a Boolean value) defining whether an event log overflow should be logged.
     * See Also:Constant Field Values
     */
    public static final java.lang.String EventLoggingOverflowDisplay="EOEventLoggingOverflowDisplay";

    /**
     * Name of the system property (a String value) defining the password which allows access to event logging information.
     * The String value is "EOEventLoggingPassword".
     * See Also:Constant Field Values
     */
    public static final java.lang.String EventLoggingPassword="EOEventLoggingPassword";

    /**
     * Creates a new event center. Note that new instances of EOEventCenter should be retrieved through the static method currentCenter instead of via this constructor.
     * See Also:EOEventCenter.currentCenter()
     */
    public EOEventCenter(){
         //TODO codavaj!!
    }

    /**
     * Returns all event centers. Typically used only for post-processing of events and statistics gathering. Note that there is one event center per thread.
     */
    public static com.webobjects.foundation.NSArray allCenters(){
        return null; //TODO codavaj!!
    }

    /**
     * Returns an array of the receiver's events (in no particular order).
     */
    public com.webobjects.foundation.NSArray allEvents(){
        return null; //TODO codavaj!!
    }

    /**
     * Returns an array of all events logged in all the event centers (in no particular order).
     */
    public static com.webobjects.foundation.NSArray allEventsForAllCenters(){
        return null; //TODO codavaj!!
    }

    /**
     * Cancels the recording of an in-progress event. This method doesn't work with atomic events or with events that have already been ended with markEndOfEvent.
     * Generally an event will be canceled when the operation being logged is aborted. For example, an adaptor channel cancels an "Open Channel" event if the openChannel method doesn't successfully open a connection to the database.
     */
    public static void cancelEvent(com.webobjects.eocontrol.EOEvent anEvent){
        return; //TODO codavaj!!
    }

    /**
     * Returns the event center for the calling thread. Note that this is the normal manner in which an EOEventCenter is retrieved: if one does not yet exist for the calling thread, it is created and initialized.
     */
    public static com.webobjects.eocontrol.EOEventCenter currentCenter(){
        return null; //TODO codavaj!!
    }

    /**
     * Returns the subset of the receiver's events that are instances of aClass and that have the type type. Specifying null for the class returns events of any class. Similarly, specifying null for the type returns events of any type.
     */
    public com.webobjects.foundation.NSArray eventsOfClass(java.lang.Class aClass, java.lang.String type){
        return null; //TODO codavaj!!
    }

    /**
     * Returns an array of all events (from all the event centers) that are instances of aClass and whose type is type. Specifying null for the class returns events of any class. Similarly, specifying null for the type returns events of any type.
     */
    public static com.webobjects.foundation.NSArray eventsOfClassForAllCenters(java.lang.Class aClass, java.lang.String type){
        return null; //TODO codavaj!!
    }

    /**
     * Marks anEvent, a newly created event, as an atomic event, and assigns it's info to info. The new event object is usually created with newEventOfClass.
     */
    public static void markAtomicEvent(com.webobjects.eocontrol.EOEvent anEvent, java.lang.Object info){
        return; //TODO codavaj!!
    }

    /**
     * Marks the time anEvent ended.
     */
    public static void markEndOfEvent(com.webobjects.eocontrol.EOEvent anEvent){
        return; //TODO codavaj!!
    }

    /**
     * Marks anEvent, a newly created event, to be a branch event (that possibly has nested subevents), and assigns it's info to info. The new event object is usually created with newEventOfClass.
     * There is a limit on the number of events the event logging system logs. This is 200,000 by default, but can be changed using the system property EOEventLoggingLimit. When the logging limit is reached, the logging system attempts to purge old events before logging new ones. If the system is unable to purge old events, event logging is aborted.
     * The system's attempt to purge events can fail if the event logging limit is too small. This happens because the event system can't purge the first event logged, and it can't purge unclosed branch events.
     */
    public static void markStartOfEvent(com.webobjects.eocontrol.EOEvent anEvent, java.lang.Object info){
        return; //TODO codavaj!!
    }

    /**
     * Creates an event of the desired class and type.
     */
    public static com.webobjects.eocontrol.EOEvent newEventOfClass(java.lang.Class aClass, java.lang.String type){
        return null; //TODO codavaj!!
    }

    /**
     * Returns the password which allows access to event logging information.
     */
    public static java.lang.String password(){
        return null; //TODO codavaj!!
    }

    /**
     * Returns true if the application logs events of the eventClass class, or false otherwise.
     */
    public static boolean recordsEventsForClass(java.lang.Class eventClass){
        return false; //TODO codavaj!!
    }

    /**
     * Returns an array of all event classes registered in the application.
     */
    public static com.webobjects.foundation.NSArray registeredEventClasses(){
        return null; //TODO codavaj!!
    }

    /**
     * Registers aClass as an event class. The handler is the object that the event logging system notifies when event logging is enabled or disabled for aClass.
     * If the EOEventLoggingEnabled system property is set to true, this method enables logging for aClass. Programmatically, you can selectively enable or disable logging for a specific class with setRecordsEvents.
     * When the event logging system enables logging for the event class, it sends handler a setLoggingEnabled message with true as the flag and aClass as the event class. handler is responsible for enabling logging in the instrumented code.
     */
    public static void registerEventClass(java.lang.Class aClass, com.webobjects.eocontrol.EOEventCenter.EventRecordingHandler handler){
        return; //TODO codavaj!!
    }

    /**
     * Discards all events in the event center for the calling thread.
     */
    public void resetLogging(){
        return; //TODO codavaj!!
    }

    /**
     * Discards all events in all event centers, restarting event collection for the entire application (that is, for all threads).
     */
    public static void resetLoggingForAllCenters(){
        return; //TODO codavaj!!
    }

    /**
     * Resumes event logging in all centers. However, logging doesn't actually resume until each invocation of suspendLogging is paired with an invocation of resumeLogging. Invoking resumeLogging without a corresponding suspendLogging isn't harmful.
     */
    public static void resumeLogging(){
        return; //TODO codavaj!!
    }

    /**
     * Returns the receiver's events that were recorded at the root level; that is, returns the events that don't have a parent event.
     */
    public com.webobjects.foundation.NSArray rootEvents(){
        return null; //TODO codavaj!!
    }

    /**
     * Returns the events from all event centers that are recorded at root level, sorted by decreasing duration.
     */
    public static com.webobjects.foundation.NSArray rootEventsByDuration(){
        return null; //TODO codavaj!!
    }

    /**
     * Returns the events from all event centers that are recorded at root level.
     */
    public static com.webobjects.foundation.NSArray rootEventsForAllCenters(){
        return null; //TODO codavaj!!
    }

    /**
     * Sets the password which allows access to event logging information.
     */
    public static void setPassword(java.lang.String p){
        return; //TODO codavaj!!
    }

    /**
     * Sets according to flag whether event centers record events of the eventClass class (and its subclasses). By default, event centers don't record events of any class. You can selectively enable logging for a particular event class with this method. To enable event logging for all event classes, set the system property EOEventLoggingEnabled. Then, you can selectively disable logging for a particular event with this method.
     */
    public static void setRecordsEvents(boolean flag, java.lang.Class eventClass){
        return; //TODO codavaj!!
    }

    /**
     * Suspends event logging in all event centers. Each invocation of suspendLogging must be paired with an invocation of resumeLogging to resume event logging.
     */
    public static void suspendLogging(){
        return; //TODO codavaj!!
    }

    /**
     * The EOEventCenter.EventRecordingHandler interface declares the setLoggingEnabled method, which is invoked by the event-logging system when logging is enabled or disabled for an event class. Event recording handlers are responsible for enabling logging in instrumented code. An event recording handler only receives messages about event classes registered with registerEventClass.
     * See Also:EOEventCenter.registerEventClass(Class, EOEventCenter.EventRecordingHandler), EOEventCenter.setRecordsEvents(boolean flag, Class eventClass)
     */
    public static interface EventRecordingHandler{
        /**
         * If flag is true, instrumented code should log events of class aClass and the receiver should enable updating in instrumented code.
         */
        abstract void setLoggingEnabled(boolean flag, java.lang.Class aClass);

    }
}

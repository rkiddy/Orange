package com.webobjects.foundation;
/**
 * An NSDelayedCallbackCenter object (also called a delayed callback center) provides a way to guarantee that particular methods are invoked after an event has ended. It allows you to postpone or schedule the execution of certain tasks for a point in time, for example because they can't be performed earlier, or because then they will have to be performed only once (combined effect). Selectors are registered with the delayed callback center in an internal list. The center, in turn, invokes them when the event ends. In WebObjects, this happens at the end of the current request-response cycle.
 * When a selector is registered, a priority is specified, which determines the order in which it is invoked relative to the other selectors. The selectors are invoked in order of ascending priority. To register a selector with the delayed callback center, use performSelector. To cancel it before the event ends, use cancelPerformSelector.
 * The event loop invokes eventEnded to indicate that the current event has ended. The eventEnded method invokes the queued selectors.
 * Each task has a default delayed callback center that you access with the defaultCenter static method.
 * See Also:NSDelayedCallbackCenter.performSelector(NSSelector,Object,Object,int), NSDelayedCallbackCenter.cancelPerformSelector(NSSelector,Object,Object), NSDelayedCallbackCenter.eventEnded(), NSDelayedCallbackCenter.defaultCenter()
 */
public class NSDelayedCallbackCenter{
    /**
     * Removes the specified selector for the specified target object and argument from the list of registered selectors. Only this specific combination of selector, target and argument will be removed.
     */
    public void cancelPerformSelector(com.webobjects.foundation.NSSelector selector, java.lang.Object target, java.lang.Object argument){
        return; //TODO codavaj!!
    }

    /**
     * Returns the current default center for the current request-response cycle. This is the current delayed callback center (NSDelayedCallbackCenter) for the calling thread.
     */
    public static com.webobjects.foundation.NSDelayedCallbackCenter defaultCenter(){
        return null; //TODO codavaj!!
    }

    /**
     * Invokes the registered selectors in order of ascending priority. The event loop should invoke this method when the current event ends.
     */
    public void eventEnded(){
        return; //TODO codavaj!!
    }

    /**
     * Registers selector to be invoked on target with the specified argument and order (priority). When the current event ends, the registered selectors are invoked in order of ascending priority.
     */
    public void performSelector(com.webobjects.foundation.NSSelector selector, java.lang.Object target, java.lang.Object argument, int order){
        return; //TODO codavaj!!
    }

}

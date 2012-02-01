package com.webobjects.appserver;
/**
 * The WOAdaptor class serves as the abstract superclass for all WebObjects application adaptors (eg, the adaptor running on the application side). Note that the WOServletAdaptor is not included in this list.
 * The Default adaptor's primary task is to receive incoming HTTP requests and package these events into a WORequest object. Second, the WOApplication object's dispatchRequest method is invoked with the WORequest object as a parameter. dispatchRequest returns a WOResponse object, which is then returned to the client as an HTTP response. The name of the default adaptor is WODefaultAdaptor.
 * During the WOApplication constructor, WOApplication.adaptorForName() is invoked, which in turn invokes the WOAdaptor constructor. Once the WOApplication object begins its runloop (started by WOApplication's run() method), registerForEvents is called. Once the runloop is ready to exit (typically by calling WOApplication's terminate() method), unregisterForEvents is called. If there are multiple adaptors, these invocations are called on each of them.
 * Note that the runloop does not repeatedly invoke any methods on the WOAdaptor objects. Because of this, developers should spawn at least one thread in registerForEvents to do useful work.
 * Custom adaptors can be be used by subclassing WOAdaptor. They can be substituted for the WODefaultAdaptor by using the WOAdaptor property, or they can be run in addition to the WODefaultAdaptor by using the WOAdditionalAdaptors property. To substitute a custom adaptor for the default adaptor:
 * To run additional adaptors:
 * See Also:WOApplication.adaptorWithName(String aClassName, NSDictionary anArgsDictionary), WOApplication.dispatchRequest(WORequest aRequest), WOAdaptor.registerForEvents(), WOAdaptor.unregisterForEvents()
 */
public abstract class WOAdaptor{
    /**
     * This class constant is an integer that specifies the default value for the WOListenQueueSize property, if not set elsewhere.
     * See Also:Constant Field Values
     */
    protected static final int DefaultListenQueueSize=128;

    /**
     * Initializes a WOAdaptor with the name aName and arguments arguments. aName is the name of the WOAdaptor subclass. arguments are the default options specified for this adaptor (such as port number and listen queue size).
     * The WOApplication method adaptorWithName invokes this method to create new WOAdaptors. If no custom WOAdaptors are added, either through the WOAdaptor or WOAdditionalAdaptors properties, a default adaptor (WONIOAdaptor) will be created.
     * Custom subclasses should override this method to initialize their objects.
     * Parameters:aName - name of the WOAdaptor subclassarguments - the default options specified for this adaptorSee Also:WOApplication.adaptorWithName(String aClassName, NSDictionary anArgsDictionary)
     */
    public WOAdaptor(java.lang.String aName, com.webobjects.foundation.NSDictionary arguments){
         //TODO codavaj!!
    }

    /**
     * This should return true if the adaptor is capable of dispatching requests to the application concurrently, false otherwise. Returning true does not necessarily mean that requests will be dispatched concurrently -- the WOAllowsConcurrentRequestHandling property must be set as well. WOApplication's isConcurrentRequestHandlingEnabled returns the current status of concurrent request handling in the application.
     */
    public boolean dispatchesRequestsConcurrently(){
        return false; //TODO codavaj!!
    }

    /**
     * Deprecated.
     * This method will never be called and should not be used or overridden.
     */
    public boolean doesBusyRunOnce(){
        return false; //TODO codavaj!!
    }

    /**
     * Returns the port number on which the adaptor listens. If possible, the value returned by this method should be set in the constructor for the WOAdaptor subclass. Typically, this should be set to the value of the WOPort property.
     */
    public int port(){
        return 0; //TODO codavaj!!
    }

    /**
     * WOApplication will invoke this method to prepare the WOAdaptor to start receiving events. You can assume that this method will only be called once in the lifetime of the adaptor, and will be called before unregisterForEvents. This method should never be invoked directly.
     */
    public abstract void registerForEvents();

    /**
     * Deprecated.
     * This method will never be called and should not be used or overridden.
     */
    public void runOnce(){
        return; //TODO codavaj!!
    }

    /**
     * Returns a string representation of the receiver.
     */
    public java.lang.String toString(){
        return null; //TODO codavaj!!
    }

    /**
     * WOApplication will invoke this method to cause the WOAdaptor to stop receiving events. You can assume that this method will only be called once in the lifetime of the adaptor, and will be called after registerForEvents. This method should never be invoked directly.
     */
    public abstract void unregisterForEvents();

}

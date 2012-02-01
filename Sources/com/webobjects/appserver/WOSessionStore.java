package com.webobjects.appserver;
/**
 * WOSessionStore, an abstract superclass, offers an object abstraction for storing client state per session. The application object (WOApplication) uses an instance of a concrete WOSessionStore subclass to implement a strategy for storing and retrieving session state. Set the WOSessionStore during application initialization through WOApplication's setSessionStore method.
 * An application first creates a session (WOSession) when it receives a request without a session ID. When this first request has been handled, the application stores the WOSession object under a randomly generated session ID by invoking its own saveSessionForContext method. This method by default forwards the method to the chosen WOSessionStore and that WOSessionStore takes care of the details of saving session state. When the next request comes in for that session, the application restores the session by sending itself restoreSessionWithID, which by default is forwarded to the application's WOSessionStore. The WOSessionStore then asks the WOContext of the transaction for the session ID of the session. Based on the implementation of the WOSessionStore, the session object is located and returned.
 * There is one subclass of WOSessionStore implemented for the developer's convenience. A server WOSessionStore (the default) stores session state in the server, in application memory. The serverSessionStore method returns this WOSessionStore.
 * You can create a custom session store by making a subclass of WOSessionStore. The subclass should properly implement the saveSessionForContext and restoreSessionWithID methods and should have a public method that the application object can use to obtain an instance. Some interesting session stores could be: A database session store that stores session data in a database as blobs, with the session ID as the primary key. This kind of WOSessionStore can be shared by many instances of the same WebObjects application, thus distributing the load (requests) among the instances. An adaptive session store that stores session state either in cookies or on the server, depending on what the client supports. If you create your own WOSessionStore class that generates persistent objects, you should implement an algorithm that cleans up session state after the session is inactive for a long time. The server WOSessionStore provided by WebObjects performs this clean-up properly, but the API is not yet public.
 * See Also:WOSessionStore.saveSessionForContext(WOContext), WOSessionStore.restoreSessionWithID(String, WORequest), WOSessionStore.serverSessionStore(), WOApplication.setSessionStore(WOSessionStore)
 */
public abstract class WOSessionStore{
    /**
     * Creates a default WOSessionStore. Since WOSessionStore is an abstract class, this constructor will not be called directly but rather by subclasses.
     */
    public WOSessionStore(){
         //TODO codavaj!!
    }

    /**
     * Checks in the session in context so that pending (and future) requests for the same session may proceed. This method is called by WOApplication to save the session even if the session was not previously checked out via checkOutSessionWithID (that is, the session is a new session which was just created and, therefore, not restored).
     * Internally, this method calls saveSessionForContext (implemented in the concrete subclass) to save the session in context using whatever storage technique is supported by the subclass.
     */
    public final void checkInSessionForContext(com.webobjects.appserver.WOContext context){
        return; //TODO codavaj!!
    }

    /**
     * Checks out a session using id, which is the session id associated with the session. This method calls restoreSessionWithID (implemented in the concrete subclass) to do the actual session restoration using whatever storage technique is supported by the subclass. If the session is located and restored, this method ensures that simultaneous access to the same session is precluded. The session should have been checked in using checkInSessionForContext.
     */
    public final com.webobjects.appserver.WOSession checkOutSessionWithID(java.lang.String id, com.webobjects.appserver.WORequest aRequest){
        return null; //TODO codavaj!!
    }

    /**
     * Inherited finalize() method from java.lang.Object.
     */
    public void finalize() throws java.lang.Throwable{
        return; //TODO codavaj!!
    }

    /**
     * Removes a WOSession instance from storage in order to make it eligible for garbage collection.
     * This method should be implemented by concrete WOSessionStore subclasses.
     */
    public abstract com.webobjects.appserver.WOSession removeSessionWithID(java.lang.String sessionID);

    /**
     * Restores a WOSession associated with sessionID from storage. This method is called from checkOutSessionWithID and is to be implemented by a concrete WOSessionStore subclass. The subclass is free to decide on the kind of suitable storage and the algorithm for restoration.
     * The default implementation does nothing.
     */
    public abstract com.webobjects.appserver.WOSession restoreSessionWithID(java.lang.String sessionID, com.webobjects.appserver.WORequest aRequest);

    /**
     * Saves the current WOSession in context into storage. This method is called from checkInSessionForContext and is to implemented by a concrete WOSessionStore subclass. The subclass is free to decided on the kind of suitable storage and the algorithm for saving.
     * The default implementation does nothing.
     */
    public abstract void saveSessionForContext(com.webobjects.appserver.WOContext context);

    /**
     * Gets the default WOSessionStore object that saves and restores session states using application memory. Since this is the default storage strategy, you do not need to explicitly set the session store during application initialization if this is the strategy you want.
     * State storage in the server's application memory is the easiest strategy and is usually good enough for most general use. You can also easily manage the amount of storage consumed by setting session timeouts, limiting the size of the page-instance cache, and page uniquing.
     */
    public static com.webobjects.appserver.WOSessionStore serverSessionStore(){
        return null; //TODO codavaj!!
    }

}

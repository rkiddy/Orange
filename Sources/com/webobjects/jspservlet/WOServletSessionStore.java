package com.webobjects.jspservlet;
/**
 * This is a subclass of WOSessionStore, and is intended to replace the WOServerSessionStore subclass. The intention is that WOSessions will be piggybacked on HttpSession objects from the JSP/Servlet world. As they expire, so will the WOSessions. If they are serialized and moved to another container, the WOSession should follow it -- however, this functionality may not be completed. Because of this, this session store does not actually store sessions. Instead, it knows how to add/remove sessions to/from existing JSP sessions. One consequence is that the WOSessionTimeout setting is no longer applicable, as the JSP session setting will be used instead.
 */
public class WOServletSessionStore extends com.webobjects.appserver.WOSessionStore{
    /**
     * Creates a default session object.
     */
    public WOServletSessionStore(){
         //TODO codavaj!!
    }

    /**
     * Description copied from class:
     * Removes a WOSession instance from storage in order to make it eligible for garbage collection.
     * This method should be implemented by concrete WOSessionStore subclasses.
     */
    public com.webobjects.appserver.WOSession removeSessionWithID(java.lang.String sessionID){
        return null; //TODO codavaj!!
    }

    /**
     * Description copied from class:
     * Restores a WOSession associated with sessionID from storage. This method is called from checkOutSessionWithID and is to be implemented by a concrete WOSessionStore subclass. The subclass is free to decide on the kind of suitable storage and the algorithm for restoration.
     * The default implementation does nothing.
     */
    public com.webobjects.appserver.WOSession restoreSessionWithID(java.lang.String sessionID, com.webobjects.appserver.WORequest woRequest){
        return null; //TODO codavaj!!
    }

    /**
     * Description copied from class:
     * Saves the current WOSession in context into storage. This method is called from checkInSessionForContext and is to implemented by a concrete WOSessionStore subclass. The subclass is free to decided on the kind of suitable storage and the algorithm for saving.
     * The default implementation does nothing.
     */
    public void saveSessionForContext(com.webobjects.appserver.WOContext context){
        return; //TODO codavaj!!
    }

    /**
     * Returns the WOSession associated with anHttpSession. If anHttpSession is null, or has no associated WOSession, this method returns null.
     */
    public static com.webobjects.appserver.WOSession woSessionFromHttpSession(javax.servlet.http.HttpSession anHttpSession){
        return null; //TODO codavaj!!
    }

}

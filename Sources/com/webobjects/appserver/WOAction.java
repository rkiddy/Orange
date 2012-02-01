package com.webobjects.appserver;
/**
 * Interface for Direct Actions
 * Since: 5.0
 */
public abstract class WOAction{
    /**
     * Defaults to 'Goober'
     * See Also:Constant Field Values
     */
    public static final java.lang.String actionText="Goober";

    /**
     * Subclasses must override to provide any additional initialization.
     * Parameters:aRequest - the request to be processed
     */
    public WOAction(com.webobjects.appserver.WORequest aRequest){
         //TODO codavaj!!
    }

    /**
     * WOAction's implementation of this static method returns true, indicating that key-value coding is allowed to access fields in this object if an appropriate method isn't present.
     */
    public static boolean canAccessFieldsDirectly(){
        return false; //TODO codavaj!!
    }

    /**
     * Returns the current WOContext object.
     */
    public com.webobjects.appserver.WOContext context(){
        return null; //TODO codavaj!!
    }

    /**
     * Deprecated.
     * Deprecated. Use NSLog instead.
     */
    public static void debugString(java.lang.String string){
        return; //TODO codavaj!!
    }

    /**
     * Restores the session based on the request. If the request did not have a session ID or the session ID referred to a non-existent session, then this method returns null. To determine if a session failed to restore, check the request's session ID to see if it non-null and if so, call this method to check its result.
     */
    public com.webobjects.appserver.WOSession existingSession(){
        return null; //TODO codavaj!!
    }

    /**
     * Get and return the session ID for the request, if one exists. Otherwise, return null.
     */
    public abstract java.lang.String getSessionIDForRequest(com.webobjects.appserver.WORequest aRequest);

    public java.lang.Object handleQueryWithUnboundKey(java.lang.String key){
        return null; //TODO codavaj!!
    }

    public void handleTakeValueForUnboundKey(java.lang.Object value, java.lang.String key){
        return; //TODO codavaj!!
    }

    /**
     * This sets the sessionID in the context if there is a sessionID in the request. This context uses this sessionID to restore the session in the event its needed for the response.
     */
    public void initializeRequestSessionIDInContext(com.webobjects.appserver.WOContext aContext){
        return; //TODO codavaj!!
    }

    /**
     * Returns an NSArray of languages for which the action is localized. The order of language strings returned indicates the preferred order of languages. This is initialized from the user's browser preferences unless explicitly set with setLanguages.
     */
    public com.webobjects.foundation.NSArray languages(){
        return null; //TODO codavaj!!
    }

    /**
     * Deprecated.
     * Deprecated. Use NSLog instead. This is simply a cover method for NSLog.err.appendln(string). You should use NSLog instead.
     */
    public static void logString(java.lang.String string){
        return; //TODO codavaj!!
    }

    /**
     * Returns the page with given name. This is equivalent to calling pageWithName on the WOApplication object.
     */
    public com.webobjects.appserver.WOComponent pageWithName(java.lang.String aComponentName){
        return null; //TODO codavaj!!
    }

    /**
     * Performs the action with the specified name and returns the result of that action. The default implementation appends the actionText to anActionName and tries to invoke the resulting method name. Override this method to change how actions are dispatched.
     */
    public abstract com.webobjects.appserver.WOActionResults performActionNamed(java.lang.String anActionName);

    /**
     * Returns the WORequest that created this Action object.
     */
    public com.webobjects.appserver.WORequest request(){
        return null; //TODO codavaj!!
    }

    /**
     * If there is no session, this method first tries to restore the session that the request's session ID refers to. If the request has no session ID -- which is a possibility if the application is written entirely with direct actions -- this method creates a new session and returns it. If the session ID refers to a session that doesn't exist or cannot be restored, this method returns a new session object with a different session ID.
     * This method may call WOApplication's restoreSessionWithID, which posts a SessionDidRestoreNotification. If the session does not exist or cannot be restored, the notification is posted with a null session for parameter (the only indication that a session time out has occurred), and a new session object is created.
     * This method may also call WOApplication's createSessionForRequest If the session can not be created, an IllegalStateException is thrown, otherwise, a SessionDidCreateNotification is posted and the new session is returned.
     */
    public com.webobjects.appserver.WOSession session(){
        return null; //TODO codavaj!!
    }

    /**
     * Sets the languages for which the action is localized. The ordering of language strings in the array determines the order in which the application will search .lproj directories for localized strings, images, and component definitions.
     * Note that the language setting only last for an action and does not persist across actions. If you want the language setting to persist, you should consider creating a temporary session and use setLanguages in that session. If you set the language setting in a session, that setting has precedence.
     */
    public void setLanguages(com.webobjects.foundation.NSArray someLanguages){
        return; //TODO codavaj!!
    }

    public void takeValueForKey(java.lang.Object value, java.lang.String key){
        return; //TODO codavaj!!
    }

    public void takeValueForKeyPath(java.lang.Object value, java.lang.String keyPath){
        return; //TODO codavaj!!
    }

    public java.lang.String toString(){
        return null; //TODO codavaj!!
    }

    public void unableToSetNullForKey(java.lang.String key){
        return; //TODO codavaj!!
    }

    public java.lang.Object validateTakeValueForKeyPath(java.lang.Object value, java.lang.String keyPath) throws com.webobjects.foundation.NSValidation.ValidationException{
        return null; //TODO codavaj!!
    }

    public java.lang.Object validateValueForKey(java.lang.Object value, java.lang.String key) throws com.webobjects.foundation.NSValidation.ValidationException{
        return null; //TODO codavaj!!
    }

    public java.lang.Object valueForKey(java.lang.String key){
        return null; //TODO codavaj!!
    }

    public java.lang.Object valueForKeyPath(java.lang.String keyPath){
        return null; //TODO codavaj!!
    }

}

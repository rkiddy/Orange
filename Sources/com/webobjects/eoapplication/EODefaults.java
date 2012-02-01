package com.webobjects.eoapplication;
/**
 * EODefaults objects are used to collect user defaults like window sizes and positions. The EOApplication object of the application has a defaults method which returns the shared instance used by all controllers to register values.
 */
public class EODefaults implements com.webobjects.foundation.NSDisposable{
    /**
     * The key through which you can access the (mutable) dictionary of default values to be loaded or saved in the userInfo of the LoadUserDefaultsNotification and SaveUserDefaultsNotification notifications.
     * See Also:Constant Field Values
     */
    public static final java.lang.String DefaultsKey="defaults";

    /**
     * The name of the notification sent by default managers which rely on other objects to load default values (default implementation of EODefaults, but commonly overridden by subclasses). If the defaults manager your application uses supports it, you can register for this notification and fill in the user defaults in the mutable dictionary (NSMutableDictionary) provided through the the DefaultsKey key in the userInfo of the notification.
     * See Also:Constant Field Values
     */
    public static final java.lang.String LoadUserDefaultsNotification="EOLoadUserDefaultsNotification";

    /**
     * The name of the notification sent by default managers which rely on other objects to store default values (default implementation of EODefaults, but commonly overridden by subclasses). If the defaults manager your application uses supports it, you can register for this notification and store the user defaults provided as a dictionary with the DefaultsKey key in the userInfo of the notification.
     * See Also:Constant Field Values
     */
    public static final java.lang.String SaveUserDefaultsNotification="EOSaveUserDefaultsNotification";

    /**
     * Creates a new defaults manager object.
     */
    public EODefaults(){
         //TODO codavaj!!
    }

    /**
     * Returns a dictionary with all key/value pairs stored in the defaults manager (both transient and persistent values).
     */
    public com.webobjects.foundation.NSDictionary allValues(){
        return null; //TODO codavaj!!
    }

    /**
     * Clears out all default values collected so far.
     */
    public void clearAllValues(){
        return; //TODO codavaj!!
    }

    /**
     * Prepares the receiver so it is disposed when Java performs garbage collection.
     */
    public void dispose(){
        return; //TODO codavaj!!
    }

    /**
     * Saves the persistent user defaults, but only if there have been any changes that would require saving.
     */
    public void flushDefaultsToPersistentStore(){
        return; //TODO codavaj!!
    }

    /**
     * Loads the persistent user defaults. The default implementation posts a LoadUserDefaultsNotification notification to give other objects an opportunity to fill in values.
     */
    protected com.webobjects.foundation.NSDictionary loadPersistentValues(){
        return null; //TODO codavaj!!
    }

    /**
     * Saves the persistent user defaults. The default implementation posts a SaveUserDefaultsNotification notification to give other objects an opportunity to store the values.
     */
    protected void savePersistentValues(com.webobjects.foundation.NSDictionary values){
        return; //TODO codavaj!!
    }

    /**
     * Stores a value with the key key as persistent in the defaults manager. The receiver attempts to save the values with the help of the server when the client application terminates. If you just want to collect temporary values which should not be stored, use the setTransientValueForKey method.
     */
    public void setPersistentValueForKey(java.lang.Object value, java.lang.String key){
        return; //TODO codavaj!!
    }

    /**
     * Stores a value with the key key as transient in the defaults manager. Transient values will be forgotten completely when the client application terminates. If you want to store a value for the next time the application is started, use the setPersistentValueForKey method.
     */
    public void setTransientValueForKey(java.lang.Object value, java.lang.String key){
        return; //TODO codavaj!!
    }

    /**
     * Returns the value stored in the defaults manager with the key key or null if no value is stored with that key. First checks in the persistent values and then in the transient values.
     */
    public java.lang.Object valueForKey(java.lang.String key){
        return null; //TODO codavaj!!
    }

}

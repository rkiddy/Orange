package com.webobjects.eoapplication.client;
/**
 * EORemoteStorageDefaults works together with the server side of a Java Client application to manage the defaults of an application: When the client starts up, it tries to receive values from the distribution context on the server side, and when the application terminates, it asks the distribution context to store all the persistent values. The distribution context in turn sends out notifications to read or write the default values, so you can register for these notifications on the server side and implement your own storage mechanism (for example to store the user defaults in the database).
 * See Also:EODefaults
 */
public class EORemoteStorageDefaults extends com.webobjects.eoapplication.EODefaults{
    /**
     * Creates a new defaults manager object.
     */
    public EORemoteStorageDefaults(){
         //TODO codavaj!!
    }

    /**
     * Tries to load the persistent user defaults from the server. On the server side you need to register for EODefaults.LoadUserDefaultsNotification notifications to fill in the values, otherwise nothing happens.
     */
    protected com.webobjects.foundation.NSDictionary loadPersistentValues(){
        return null; //TODO codavaj!!
    }

    /**
     * Saves the persistent user defaults by asking the server to store them. On the server side you need to register for EODefaults.SaveUserDefaultsNotification notifications to save the values, otherwise nothing happens.
     */
    protected void savePersistentValues(com.webobjects.foundation.NSDictionary values){
        return; //TODO codavaj!!
    }

}

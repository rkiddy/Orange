package com.webobjects.eoapplication;
/**
 * EOUserFileDefaults manages the defaults of an application by storing and loading them from the file system. The file location can be specified as userDefaultsFile argument to the EOApplication. The value of that argument can contain "~" to specify the user's hoe directory and "#" to specify the application name, for example "~/.Defaults#".
 * See Also:EODefaults
 */
public class EOUserFileDefaults extends com.webobjects.eoapplication.EODefaults{
    /**
     * Creates a new defaults manager object.
     */
    public EOUserFileDefaults(){
         //TODO codavaj!!
    }

    /**
     * Tries to load the persistent user defaults from the file system.
     */
    protected com.webobjects.foundation.NSDictionary loadPersistentValues(){
        return null; //TODO codavaj!!
    }

    /**
     * Saves the persistent user defaults in the file system.
     */
    protected void savePersistentValues(com.webobjects.foundation.NSDictionary values){
        return; //TODO codavaj!!
    }

}

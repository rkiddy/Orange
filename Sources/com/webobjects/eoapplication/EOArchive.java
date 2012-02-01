package com.webobjects.eoapplication;
/**
 * EOArchive is used to load interface files created with the Interface Builder application. It is important that the file's owner of the interface file is specified correctly in Interface Builder. The class of the file's owner has to be set exactly to the class of the object which is the owner of the archive at runtime, including the full package name.
 */
public class EOArchive{
    /**
     * Creates a new archive object with the owner owner and the disposably registry registry for the objects loaded from the archive. You never instantiate an EOArchive directly. Rather, you use the loadArchiveNamed methods to load interface files.
     * Parameters:owner - the owner of the archiveregistry - the disposable registry for the objects loaded from the archive
     */
    public EOArchive(java.lang.Object owner, com.webobjects.foundation.NSDisposableRegistry registry){
         //TODO codavaj!!
    }

    /**
     * Logs a debug message.
     */
    protected void debug(java.lang.String message){
        return; //TODO codavaj!!
    }

    /**
     * Returns the disposable registry for the objects loaded from the archive. All objects loaded from the archive are added to this registry and are disposed off together with the registry object.
     */
    public com.webobjects.foundation.NSDisposableRegistry disposableRegistry(){
        return null; //TODO codavaj!!
    }

    /**
     * Loads an archive. archiveName is the name of the interface file created in Interface Builder, owner is the owner of the archive (the object loading the archive), and archivePackageName is the package name of the owner's class (you can just pass null and this method will find the package name automatically). All objects loaded from the archive will be placed in the disposable registry registry (which can also be null if you don't need a disposable registry), so that you can easily dispose off all the objects loaded by disposing the registry.
     * If the archive can't be found or there is an error while loading it, this method throws a runtime exception.
     */
    public static com.webobjects.foundation.NSDictionary loadArchiveNamed(java.lang.String archiveName, java.lang.Object owner, java.lang.String archivePackageName, com.webobjects.foundation.NSDisposableRegistry registry){
        return null; //TODO codavaj!!
    }

    /**
     * Returns a dictionary with all named objects loaded from the archive. Not all objects are named. The keys in the dictionary are the names, the values are the objects.
     */
    public com.webobjects.foundation.NSDictionary namedObjects(){
        return null; //TODO codavaj!!
    }

}

package com.webobjects.foundation;
/**
 * A NSDisposableRegistry object is a registry of NSDisposable objects that should be disposed when the registry is disposed. Objects can be added to a registry with addObject and addObjectsFromRegistry, or removed with removeObject
 * There are two ways you may interact with a disposable registry: adding objects to another object's registry and creating a class whose instances manage their own disposable registries.
 * As an example of the former, consider the EOController class (defined in the eoapplication package and used in Direct to Java Client applications). EOController has a disposable registry, which you can access with the EOController method disposableRegistry. In EOController's dispose method, it disposes its disposable registry, which in turn disposes all its objects. You can get a Controller's registry and add objects to it; they will be disposed along with the EOController.
 * The second way to interact with a disposable registry is to create a class similar to EOController that uses a disposable registry to group objects that should be disposed of along with instances of class.
 * See Also:NSDisposableRegistry.addObject(com.webobjects.foundation.NSDisposable), NSDisposableRegistry.addObjectsFromRegistry(com.webobjects.foundation.NSDisposableRegistry), NSDisposableRegistry.removeObject(com.webobjects.foundation.NSDisposable), NSDisposableRegistry.dispose(), NSDisposable
 */
public class NSDisposableRegistry implements com.webobjects.foundation.NSDisposable{
    /**
     * Creates an empty disposable registry.
     */
    public NSDisposableRegistry(){
         //TODO codavaj!!
    }

    /**
     * Adds disposable to the receiver so that disposable will be disposed when this registry is disposed.
     */
    public void addObject(com.webobjects.foundation.NSDisposable disposable){
        return; //TODO codavaj!!
    }

    /**
     * Adds the objects in registry to this registry, so that registry's objects will be disposed when this one is disposed.
     */
    public void addObjectsFromRegistry(com.webobjects.foundation.NSDisposableRegistry registry){
        return; //TODO codavaj!!
    }

    /**
     * Conformance to NSDisposable. NSDisposableRegistry's implementation simply sends dispose to all its objects.
     */
    public void dispose(){
        return; //TODO codavaj!!
    }

    /**
     * Removes object from the receiver.
     */
    public void removeObject(com.webobjects.foundation.NSDisposable object){
        return; //TODO codavaj!!
    }

    public java.lang.String toString(){
        return null; //TODO codavaj!!
    }

}

package com.webobjects.eoapplication;
/**
 * EOURLClassLoader is an URLClassLoader that can be used to add classes to your program at runtime. Provided a url or set of urls to search through, and a class to load, the class loader will look for the class in the set of classes available at the URLs it knows of. Once a matching class is found the class is registered with the WebObjects frameworks so that other classes in the WebObjects runtime will know about it.
 * This is useful specifically for Java Client applications so that classes needed by the client application can be downloaded on demand. EOApplication uses the shared class loader if the bindings of the WOJavaClientApplet that application connects to specifies classes for the client to download. Developers can also use this class to add classes to the running Java Client application.
 * Example: First, add the NSArray of url(s) for the class loader to search through using EOURLClassLoader.sharedURLClassLoader().addURLs(). Then call EOURLClassLoader.sharedURLClassLoader().loadClass() to load an individual class, or EOURLClassLoader.sharedURLClassLoader().loadClasses() to load an array of classes. The classes are then registered with the WebObjects frameworks using the static registerClass method.
 * To use your custom subclass of EOURLClassLoader in an EOApplication, make sure that you set your class loader as the default class loader with setSharedURLClassLoader before EOApplication's startApplication method is invoked (write your own main function which prepares the class loader and then jumps into EOApplication's main function).
 * See Also:URLClassLoader
 */
public class EOURLClassLoader extends java.net.URLClassLoader{
    /**
     * Creates a new EOURLClassLoader object initialized to search at the URLs urls for classes. The parent class loader will be the default parent class loader.
     * Parameters:urls - array of URL objects
     */
    public EOURLClassLoader(java.net.URL[] urls){
         //TODO codavaj!!
    }

    /**
     * Creates a new EOURLClassLoader object initialized to search at the URLs urls for classes. The parent class loader will be parentClassLoader.
     * Parameters:urls - array of URL objectsparentClassLoader - the parent class loader for the new EOURLClassLoader
     */
    public EOURLClassLoader(java.net.URL[] urls, java.lang.ClassLoader parentClassLoader){
         //TODO codavaj!!
    }

    /**
     * Creates a new EOURLClassLoader object initialized to search at the URLs urls for classes. The parent class loader will be parentClassLoader and the stream handler factory will be streamHandlerFactory.
     * Parameters:urls - array of URL objectsparentClassLoader - the parent class loader for the new EOURLClassLoaderstreamHandlerFactory - the stream handler factory for the new EOURLClassLoader
     */
    public EOURLClassLoader(java.net.URL[] urls, java.lang.ClassLoader parentClassLoader, java.net.URLStreamHandlerFactory streamHandlerFactory){
         //TODO codavaj!!
    }

    /**
     * Adds the URLs specified by String in the array urls to the list of urls for the class loader to search when trying to load a class.
     */
    public void addURLs(com.webobjects.foundation.NSArray urls) throws java.net.MalformedURLException{
        return; //TODO codavaj!!
    }

    /**
     * Returns all of the class objects that have been loaded through the class loader instance.
     */
    public com.webobjects.foundation.NSArray allLoadedClasses(){
        return null; //TODO codavaj!!
    }

    /**
     * Tries to load the class named className and registers it with the WebObjects frameworks. If the class loader (or one of its parent class loaders) cannot find the class, this method throws a ClassNotFoundException.
     */
    protected java.lang.Class loadClass(java.lang.String className, boolean resolveClass) throws java.lang.ClassNotFoundException{
        return null; //TODO codavaj!!
    }

    /**
     * Tries to load the classes specified by name in the array classNames and registers them with the WebObjects frameworks. If the class loader (or one of its parent class loaders) cannot find one of the classes, this method throws a ClassNotFoundException.
     */
    public void loadClasses(com.webobjects.foundation.NSArray classNames) throws java.lang.ClassNotFoundException{
        return; //TODO codavaj!!
    }

    /**
     * Registers a class loaded with an EOURLClassLoader with the WebObjects frameworks.
     */
    public static void registerClass(java.lang.Class objectClass){
        return; //TODO codavaj!!
    }

    /**
     * Sets the class loader object to use as the shared EOURLClassLoader class loader.
     */
    public static void setSharedURLClassLoader(com.webobjects.eoapplication.EOURLClassLoader classLoader){
        return; //TODO codavaj!!
    }

    /**
     * Returns the shared EOURLClassLoader class loader instance.
     */
    public static com.webobjects.eoapplication.EOURLClassLoader sharedURLClassLoader(){
        return null; //TODO codavaj!!
    }

}

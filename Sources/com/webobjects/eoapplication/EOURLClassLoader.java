
package com.webobjects.eoapplication;

import com.webobjects.foundation.*;
import java.net.*;

public class EOURLClassLoader extends URLClassLoader {


    public static void setSharedURLClassLoader(EOURLClassLoader classLoader) { return null; }

    public static EOURLClassLoader sharedURLClassLoader() { return null; }

    public static void registerClass(Class objectClass) { return null; }

    public EOURLClassLoader(URL urls[]) { return null; }

    public EOURLClassLoader(URL urls[], ClassLoader parentClassLoader) { return null; }

    public EOURLClassLoader(URL urls[], ClassLoader parentClassLoader, URLStreamHandlerFactory streamHandlerFactory) { return null; }

    public void addURLs(NSArray urls) throws MalformedURLException {}

    public void _addURL(URL url) {}

    protected synchronized Class loadClass(String className, boolean resolveClass) throws ClassNotFoundException { return null; }

    public void loadClasses(NSArray classNames) throws ClassNotFoundException {}

    public NSArray allLoadedClasses() { return null; }

    static  {}

    public static final Class _CLASS;
    private static EOURLClassLoader _sharedInstance;
    private NSMutableSet _loadedClasses;

}

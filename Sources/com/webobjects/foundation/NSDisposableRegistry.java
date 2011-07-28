
package com.webobjects.foundation;

import java.util.Enumeration;


public class NSDisposableRegistry
    implements NSDisposable {


    public NSDisposableRegistry() { return null; }

    public void addObject(NSDisposable disposable) {}

    public void removeObject(NSDisposable object) {}

    public void dispose() {}

    public void addObjectsFromRegistry(NSDisposableRegistry registry) {}

    public String toString() { return null; }

    public Enumeration _objectEnumerator() { return null; }

    static  {}

    public static final Class _CLASS;
    private NSMutableSet _entries;

}

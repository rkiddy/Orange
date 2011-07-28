
package com.webobjects.jndiadaptor;


abstract class _EOCachedObjectFactory {


    _EOCachedObjectFactory() { return null; }

    protected synchronized Object _cachedObject() { return null; }

    public synchronized Object createObject() { return null; }

    public synchronized Object createCachedObject() { return null; }

    public synchronized void clearCache() { return null; }

    protected abstract Object doCreate();

    private Object _cachedObject;

}

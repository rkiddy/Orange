
package com.webobjects.appserver;

import com.webobjects.foundation.NSDictionary;

public abstract class WOAdaptor {


    public WOAdaptor(String aName, NSDictionary arguments) { return null; }

    /**
     * @deprecated Method runOnce is deprecated
     */

    public void runOnce() {}

    /**
     * @deprecated Method doesBusyRunOnce is deprecated
     */

    public boolean doesBusyRunOnce() { return true; }

    public boolean dispatchesRequestsConcurrently() { return true; }

    public int port() { return 0; }

    public abstract void registerForEvents();

    public abstract void unregisterForEvents();

    public String toString() { return null; }

    static  {}

    protected static final int DefaultListenQueueSize = 128;
    protected static final Class _ConstructorParametersTypes[];
    protected int _port;

}

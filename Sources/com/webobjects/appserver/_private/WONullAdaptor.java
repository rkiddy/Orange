
package com.webobjects.appserver._private;

import com.webobjects.appserver.WOAdaptor;
import com.webobjects.appserver.WOApplication;
import com.webobjects.foundation.NSDictionary;

public class WONullAdaptor extends WOAdaptor {

    public WONullAdaptor(String aName, NSDictionary arguments) { return null; }

    public boolean dispatchesRequestsConcurrently() { return true; }

    public int port() { return 0; }

    public void registerForEvents() {}

    public void unregisterForEvents() {}
}

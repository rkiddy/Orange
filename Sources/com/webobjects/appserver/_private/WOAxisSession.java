
package com.webobjects.appserver._private;

import com.webobjects.appserver.WOContext;
import com.webobjects.appserver.WOSession;
import java.util.Enumeration;
import java.util.Hashtable;
import org.apache.axis.session.Session;

public class WOAxisSession
    implements Session {


    public WOAxisSession(WOContext aContext) { return null; }

    public Object get(String key) { return null; }

    public void set(String key, Object value) {}

    public void remove(String key) {}

    public Enumeration getKeys() { return null; }

    public void setTimeout(int timeout) {}

    public int getTimeout() { return 0; }

    public void touch() {}

    public synchronized Object getLockObject() { return null; }

    public void invalidate() {}

    WOContext _woContext;
    private Hashtable rep;

}

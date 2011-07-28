
package com.webobjects.appserver._private;

import com.webobjects.appserver.*;
import com.webobjects.foundation.*;

public class WOServerSessionStore extends WOSessionStore {


    public WOServerSessionStore() { return null; }

    public WOSession removeSessionWithID(String sessionID) { return null; }

    public WOSession restoreSessionWithID(String sessionID, WORequest aRequest) { return null; }

    public void saveSessionForContext(WOContext context) {}

    public int getActiveSessionsCount() { return 0; }

    public NSDictionary _sessions() { return null; }

    private final _NSThreadsafeMutableDictionary _sessions;

}

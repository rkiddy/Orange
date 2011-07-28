
package com.webobjects.jspservlet;

import com.webobjects.appserver.*;
import com.webobjects.foundation.NSDictionary;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;


public class WOServletSessionStore extends WOSessionStore {


    public WOServletSessionStore() { return null; }

    public WOSession removeSessionWithID(String sessionID) { return null; }

    public WOSession restoreSessionWithID(String sessionID, WORequest woRequest) { return null; }

    public void saveSessionForContext(WOContext context) {}

    public static WOSession woSessionFromHttpSession(HttpSession anHttpSession) { return null; }

    static  {}

    static String _sessionAttributeKey;
    static String _sessionWatcherAttributeKey;

}

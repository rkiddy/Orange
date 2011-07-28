
package com.webobjects.appserver;

import com.webobjects.foundation.NSNotificationCenter;


public class _WOSimpleApplication extends WOApplication {
    public static class _SimpleSessionStore extends WOSessionStore {

        public _SimpleSessionStore() { return null; }

        public WOSession removeSessionWithID(String sessionID) { return null; }

        public WOSession restoreSessionWithID(String sessionID, WORequest aRequest) { return null; }

        public void saveSessionForContext(WOContext wocontext) {}
    }



    public static void _primeSimpleApplication() { return null; }

    static WOSession _singletonSession() { return null; }

    private _WOSimpleApplication() { return null; }

    public WOSession createSessionForRequest(WORequest aRequest) { return null; }

    static  {}

    private static WOSession _singletonSession;

}

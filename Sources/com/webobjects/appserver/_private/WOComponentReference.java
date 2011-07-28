
package com.webobjects.appserver._private;

import com.webobjects.appserver.*;
import com.webobjects.eocontrol.EOEventCenter;
import com.webobjects.foundation.*;


public class WOComponentReference extends WODynamicElement {
    public static class _EventLoggingEnabler
        implements com.webobjects.eocontrol.EOEventCenter.EventRecordingHandler {

        public _EventLoggingEnabler() { return null; }

        public void setLoggingEnabled(boolean isLogging, Class aClass) {}
    }

    public static class Event extends WOEvent {


        public Event() { return null; }

        public String displayComponentName() { return null; }

        public String comment() { return null; }

        private static final long serialVersionUID = 0xec2a6f03L;

    }



    public WOComponentReference(String aName, NSDictionary someAssociations, WOElement anElement) { return null; }

    public String toString() { return null; }

    public void _pushComponentInContext(WOContext aContext) {}

    public void _popComponentFromContext(WOContext aContext) {}

    public void takeValuesFromRequest(WORequest aRequest, WOContext aContext) {}

    public WOActionResults invokeAction(WORequest aRequest, WOContext aContext) { return null; }

    public void appendToResponse(WOResponse aResponse, WOContext aContext) {}

    static  {}

    public String _name;
    private NSMutableDictionary _keyAssociations;
    public WOElement _contentElement;
    protected static boolean _IsEventLoggingEnabled;
    public static String PushComponentInContextEvent;

}

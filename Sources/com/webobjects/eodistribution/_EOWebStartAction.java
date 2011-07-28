
package com.webobjects.eodistribution;

import com.webobjects.appserver.*;
import com.webobjects.appserver._private.WODirectActionRequestHandler;
import com.webobjects.eodistribution.common._EONotificationRequest;
import com.webobjects.eodistribution.common._EOServerInvocation;
import com.webobjects.foundation.*;


public class _EOWebStartAction extends WODirectAction {
    public static class _RequestHandler extends WODirectActionRequestHandler {


        public static void _applicationWillFinishLaunching(NSNotification notification) { return null; }

        static void _registerRequestHandlerKey() {}

        static String _webStartActionURL(WOContext context, String pageName) { return null; }

        public _RequestHandler() { return null; }

        public NSArray getRequestHandlerPathForRequest(WORequest request) { return null; }

        static  {}

        public static final String RequestHandlerKey = "eowebstart";
        private static final NSSelector _applicationWillFinishLaunchingSelector;

    }



    public _EOWebStartAction(WORequest request) { return null; }

    public WOActionResults webStartAction() { return null; }

    static  {}

    private static final String _JNLPExtensions = ".jnlp";
    private static final String _JNLPMimeType = "application/x-java-jnlp-file";
    static final String _InfoDictionaryKey = "_EOWebStartActionInfoDictionary";
    static final String _PageNameKey = "_EOWebStartActionPageName";

}

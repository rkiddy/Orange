
package com.webobjects.appserver._private;

import com.webobjects.appserver.*;
import com.webobjects.foundation.*;
import java.io.IOException;
import java.io.InputStream;
import java.net.URL;


public class WOResourceRequestHandler extends WORequestHandler {


    public WOResourceRequestHandler() { return null; }

    WOResponse _generateResponseForInputStream(InputStream is, long aContentLength, String aContentType) { return null; }

    private WOResponse _responseForDataCachedWithKey(String aResourceKey) { return null; }

    private WOResponse _responseForDataAtURL(URL anURL) { return null; }

    private WOResponse _responseForJavaClassAtPath(String aPath) { return null; }

    public WOResponse handleRequest(WORequest aRequest) { return null; }

    static  {}

    private static WOApplication application;

}

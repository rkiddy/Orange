
package com.webobjects.jspservlet;

import com.webobjects.appserver.*;
import com.webobjects.appserver._private.WOInputStreamData;
import com.webobjects.appserver._private.WONoCopyPushbackInputStream;
import com.webobjects.foundation.*;
import java.io.*;
import java.util.*;
import javax.servlet.ServletOutputStream;
import javax.servlet.http.*;


public class _WOApplicationWrapper
    implements _WOServletAppInterface {


    public _WOApplicationWrapper() { return null; }

    public String applicationName() { return null; }

    public void setApplication(Object uncastApp) {}

    public Object applicationObject() { return null; }

    public void setSessionStoreClassName(String sessionStoreClassName) {}

    public void setContextClassName(String contextClassName) {}

    public void servletDispatchRequest(Map userInfo, boolean isDeployed) throws IOException {}

    private static Map _headersFromRequest(HttpServletRequest request, Map extraHeaders, boolean isDeployed) { return null; }

    private static void _mergeHeaders(WOResponse woResponse, HttpServletResponse servletResponse) { return null; }

    public String servletResponseForComponentWithName(String name, Map bindings, Map extraHeaders, Map userInfo, String urlPrefix, String appName, boolean mergeResponseHeaders, 
            boolean isDeployed) { return null; }

    public String servletResponseForDirectActionWithNameAndClass(String actionName, String className, Map formValues, InputStream contentStream, Map extraHeaders, Map userInfo, String urlPrefix, 
            String appName, boolean mergeResponseHeaders, boolean isDeployed) { return null; }

    static  {}

    private WOApplication appInstance;
    private static NSArray _adaptorVersion;

}

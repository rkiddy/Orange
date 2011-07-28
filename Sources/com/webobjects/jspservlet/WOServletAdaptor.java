
package com.webobjects.jspservlet;

import com.webobjects.appserver.WOApplication;
import java.io.*;
import java.lang.reflect.Constructor;
import java.lang.reflect.Method;
import java.net.URL;
import java.net.URLClassLoader;
import java.util.*;
import javax.naming.InitialContext;
import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.PageContext;


public class WOServletAdaptor extends HttpServlet {
    public static class JavaArchiveFilter
        implements FilenameFilter {


        public JavaArchiveFilter() { return null; }

        public boolean accept(File dir, String aName) { return true; }

        private static final String JAR = ".jar";
        private static final String ZIP = ".zip";

    }



    public static void initStatics(ServletContext servletContext) throws UnavailableException { return null; }

    private static _WOServletAppInterface appInstance(ServletContext servletContext) { return null; }

    public static Object woApplicationObject() { return null; }

    private static String getRealPath(String path) { return null; }

    private static String[] tokenizeClasspath(String aClasspath) { return null; }

    private static void addArchivesToList(File archiveDir, ArrayList al) { return null; }

    private static URL[] mangleClasspathForClassLoader(String aClasspath) { return null; }

    private static String mangleClasspathForBundle(String aClasspath) { return null; }

    private static _WOServletAppInterface getAppWrapper(Object app) { return null; }

    public static synchronized void _applicationInit(ServletContext servletContext) throws UnavailableException { return null; }

    protected static String embeddedComponentResponse(String name, Map bindings, Map extraHeaders, PageContext pageContext, boolean bodyContentOnly, boolean mergeResponseHeaders) { return null; }

    public static String embeddedComponentResponse(String name, Map bindings, Map extraHeaders, HttpServletRequest servletRequest, HttpServletResponse servletResponse, HttpServlet servlet, boolean bodyContentOnly, boolean mergeResponseHeaders) { return null; }

    private static String _embeddedComponentResponse(String name, Map bindings, Map extraHeaders, Map userInfo, String urlPrefix, String appName, boolean bodyContentOnly, boolean mergeResponseHeaders) { return null; }

    protected static String embeddedDirectActionResponse(String actionName, String className, Map formValues, InputStream contentStream, Map extraHeaders, PageContext pageContext, boolean bodyContentOnly, boolean mergeResponseHeaders) { return null; }

    public static String embeddedDirectActionResponse(String actionName, String className, Map formValues, InputStream contentStream, Map extraHeaders, HttpServletRequest servletRequest, HttpServletResponse servletResponse, HttpServlet servlet, 
            boolean bodyContentOnly, boolean mergeResponseHeaders) { return null; }

    private static String _embeddedDirectActionResponse(String actionName, String className, Map formValues, InputStream contentStream, Map extraHeaders, Map userInfo, String urlPrefix, String appName, 
            boolean bodyContentOnly, boolean mergeResponseHeaders) { return null; }

    private static String extractBodyFromContent(String contentString) { return null; }

    public WOServletAdaptor() throws ServletException { return null; }

    public void init() throws ServletException {}

    public void destroy() {}

    public void doPost(HttpServletRequest request, HttpServletResponse response) throws IOException, ServletException {}

    public void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException, ServletException {}

    private void _handleRequest(HttpServletRequest request, HttpServletResponse response) throws IOException, ServletException {}

    private static boolean _isDeployed(ServletContext servletContext) { return null; }

    public String toString() { return null; }

    static  {}

    private static final long serialVersionUID = 0x3c28f31cL;
    private static final String WOROOT = "WOROOT";
    private static final String LOCALROOT = "LOCALROOT";
    private static final String WOAINSTALLROOT = "WOAINSTALLROOT";
    private static final String WEBINFROOT = "WEBINFROOT";
    private static final String LAUNCH_ROOT_ERR_MSG = "You can either define WOROOT, LOCALROOT and WOAINSTALLROOT as Java system properties (e.g. in your application server's launch script as command line arguments) or in the application Deployment Descriptor file (web.xml).";
    private static final String WEBINF_ROOT_ERR_MSG = "WEBINFROOT can only be used if the application is being deployed in a directory (Servlet Single Directory Deployment). It cannot be used if you are deploying the application in a WAR file.";
    private static Class stringParamType;
    private static Class urlParamType;
    private static Class woappInitParamTypesOld[];
    private static Class woappInitParamTypesNew[];
    private static _WOServletAppInterface woApplicationWrapper;
    private static ClassLoader classLoader;
    private static String woRoot;
    private static String localRoot;
    private static String woaInstallRoot;
    private static String webInfRoot;
    private static String classpath;
    private static String tokenizedClasspath[];
    private static String mainBundlePath;
    private static String mainclassname;
    private static String mainBundleName;
    private static JavaArchiveFilter jaf;
    private static volatile ServletContext _servletContext;

}

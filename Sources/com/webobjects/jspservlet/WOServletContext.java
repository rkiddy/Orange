
package com.webobjects.jspservlet;

import com.webobjects.appserver.*;
import com.webobjects.foundation.NSDictionary;
import com.webobjects.foundation.NSLog;
import javax.servlet.ServletConfig;
import javax.servlet.ServletContext;
import javax.servlet.http.*;
import javax.servlet.jsp.JspWriter;
import javax.servlet.jsp.PageContext;


public class WOServletContext extends WOContext
    implements Cloneable {


    public WOServletContext(WORequest aRequest) { return null; }

    public String _urlWithRequestHandlerKey(String requestHandlerKey, String aRequestHandlerPath, String aQueryString, boolean isSecure) { return null; }

    public WOSession session() { return null; }

    public JspWriter jspWriter() { return null; }

    public Object jspPage() { return null; }

    public HttpServletRequest httpServletRequest() { return null; }

    public HttpServletResponse httpServletResponse() { return null; }

    public ServletConfig servletConfig() { return null; }

    public ServletContext servletContext() { return null; }

    public HttpSession httpSession() { return null; }

    private PageContext _pageContext;
    private JspWriter _jspWriter;
    private Object _page;
    private HttpServletRequest _servletRequest;
    private HttpServletResponse _servletResponse;
    private ServletConfig _servletConfig;
    private ServletContext _servletContext;

}

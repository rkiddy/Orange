package com.webobjects.jspservlet;
public class WOServletContext extends com.webobjects.appserver.WOContext implements java.lang.Cloneable{
    /**
     * Creates a new WOServletContext object with aRequest. The userInfo dictionary of aRequest should contain at least the following: HttpServletRequest, HttpServletResponse ServletConfig, ServletContext. Optionally (for JSP pages), PageContext should also be included. The keys for the above objects are the same as the class of object. If PageContext is included, the JSP page and JspWriter objects will be extracted from the PageContext.
     * Parameters:aRequest - the WORequest the context should be created for
     */
    public WOServletContext(com.webobjects.appserver.WORequest aRequest){
         //TODO codavaj!!
    }

    /**
     * Returns the HttpServletRequest.
     */
    public javax.servlet.http.HttpServletRequest httpServletRequest(){
        return null; //TODO codavaj!!
    }

    /**
     * Returns the HttpServletResponse.
     */
    public javax.servlet.http.HttpServletResponse httpServletResponse(){
        return null; //TODO codavaj!!
    }

    /**
     * Returns the HttpSession, if it exists. Returns null otherwise.
     */
    public javax.servlet.http.HttpSession httpSession(){
        return null; //TODO codavaj!!
    }

    /**
     * Returns the JSP page object that was part of the PageContext. Only relevant for requests coming from JSP pages.
     */
    public java.lang.Object jspPage(){
        return null; //TODO codavaj!!
    }

    /**
     * Returns the JspWriter that was part of the PageContext. Only relevant for requests coming from JSP pages.
     */
    public javax.servlet.jsp.JspWriter jspWriter(){
        return null; //TODO codavaj!!
    }

    /**
     * Returns the ServletConfig.
     */
    public javax.servlet.ServletConfig servletConfig(){
        return null; //TODO codavaj!!
    }

    /**
     * Returns the ServletContext.
     */
    public javax.servlet.ServletContext servletContext(){
        return null; //TODO codavaj!!
    }

    /**
     * Returns the object representing the receiving context's session, if one exists. The overriden method checks to see if the session is part of the JSP session. If that fails, it defaults to the superclass behavior.
     */
    public com.webobjects.appserver.WOSession session(){
        return null; //TODO codavaj!!
    }

}

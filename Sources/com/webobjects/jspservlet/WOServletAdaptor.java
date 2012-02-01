package com.webobjects.jspservlet;
/**
 * See Also:Serialized Form
 */
public class WOServletAdaptor extends javax.servlet.http.HttpServlet{
    /**
     * Empty default constructor that just calls super().
     * Throws: javax.servlet.ServletException
     */
    public WOServletAdaptor() throws javax.servlet.ServletException{
         //TODO codavaj!!
    }

    public void destroy(){
        return; //TODO codavaj!!
    }

    /**
     * Method for GET requests. The request will be parsed and translated into a WORequest, and handed off to the WOApplication object. The WOResponse from the WOApplication will be parsed and translated into the HttpServletResponse. This, along with doPost, allows a WOApp to run inside of a Servlet container unchanged.
     */
    public void doGet(javax.servlet.http.HttpServletRequest request, javax.servlet.http.HttpServletResponse response) throws java.io.IOException, javax.servlet.ServletException{
        return; //TODO codavaj!!
    }

    /**
     * Method for POST requests. The request will be parsed and translated into a WORequest, and handed off to the WOApplication object. The WOResponse from the WOApplication will be parsed and translated into the HttpServletResponse. This, along with doGet, allows a WOApp to run inside of a Servlet container unchanged.
     */
    public void doPost(javax.servlet.http.HttpServletRequest request, javax.servlet.http.HttpServletResponse response) throws java.io.IOException, javax.servlet.ServletException{
        return; //TODO codavaj!!
    }

    /**
     * Returns a String representing the generated content for a given WOComponent with name. The bindings for that WOComponent are passed in bindings. extraHeaders are headers that will be added to the WORequest as seen by the WOComponent -- note that all the headers that are part of the HttpServletRequest are included automatically. The servletRequest, servletResponse and servlet are passed in for possible use later. If bodyContentOnly is true, only text between the first tag and the last tag will be returned. If mergeResponseHeaders is true, the response headers for the WOComponent will be merged into the servletResponse. Note that all the servlet objects will be stored in the userInfo dictionary argument of WOApplication.responseForComponentWithName. This API is designed to be invoked from inside a Servlet -- for embedding components within JSP pages, use the taglib instead.
     */
    public static java.lang.String embeddedComponentResponse(java.lang.String name, java.util.Map bindings, java.util.Map extraHeaders, javax.servlet.http.HttpServletRequest servletRequest, javax.servlet.http.HttpServletResponse servletResponse, javax.servlet.http.HttpServlet servlet, boolean bodyContentOnly, boolean mergeResponseHeaders){
        return null; //TODO codavaj!!
    }

    protected static java.lang.String embeddedComponentResponse(java.lang.String name, java.util.Map bindings, java.util.Map extraHeaders, javax.servlet.jsp.PageContext pageContext, boolean bodyContentOnly, boolean mergeResponseHeaders){
        return null; //TODO codavaj!!
    }

    /**
     * Returns a String representing the generated content for a given direct action with actionName. The Direct Action className may be specified as well, but is optional. formValues are passed to the direct action as a query string, while the contentString is just passed as regular content -- if the content requires special headers to process use extraHeaders. extraHeaders are headers that will be added to the WORequest as seen by the Direct Action -- note that all the headers that are part of the HttpServletRequest are included automatically. The servletRequest, servletResponse and servlet are passed in for possible use later. If bodyContentOnly is true, only text between the first BODY tag and the last BODY tag will be returned. If mergeResponseHeaders is true, the response headers for the WOComponent will be merged into the servletResponse. Note that all the servlet objects will be stored in the userInfo dictionary argument of WOApplication.responseForComponentWithName. This API is designed to be invoked from inside a Servlet -- for embedding direct actions within JSP pages, use the taglib instead.
     */
    public static java.lang.String embeddedDirectActionResponse(java.lang.String actionName, java.lang.String className, java.util.Map formValues, java.io.InputStream contentStream, java.util.Map extraHeaders, javax.servlet.http.HttpServletRequest servletRequest, javax.servlet.http.HttpServletResponse servletResponse, javax.servlet.http.HttpServlet servlet, boolean bodyContentOnly, boolean mergeResponseHeaders){
        return null; //TODO codavaj!!
    }

    protected static java.lang.String embeddedDirectActionResponse(java.lang.String actionName, java.lang.String className, java.util.Map formValues, java.io.InputStream contentStream, java.util.Map extraHeaders, javax.servlet.jsp.PageContext pageContext, boolean bodyContentOnly, boolean mergeResponseHeaders){
        return null; //TODO codavaj!!
    }

    /**
     * Default init method that just calls initStatics
     */
    public void init() throws javax.servlet.ServletException{
        return; //TODO codavaj!!
    }

    /**
     * Initializes all the appropriate objects so that JSP/Servlet integration works. Normally, this method should never be called, since either calling embeddedComponentResponse or having the servlet container initialize the WOServletAdaptor object will do everything for you. However, if you are planning on using WebObjects objects directly in either a JSP or Servlet, you must invoke this method first. Further invocations of this method past the first will do nothing.
     */
    public static void initStatics(javax.servlet.ServletContext servletContext) throws javax.servlet.UnavailableException{
        return; //TODO codavaj!!
    }

    /**
     * String representation of this class, which includes the classpath, the mainBundlePath, the name of the WOApplication subclass, as well as the ServletConfig and ServletContext
     */
    public java.lang.String toString(){
        return null; //TODO codavaj!!
    }

    /**
     * Returns the WOApplication class (or subclass) used by this application. initStatics, embeddedComponentResponse, embeddedDirectActionResponse, or a Taglib must have been invoked previous to calling this.
     */
    public static java.lang.Object woApplicationObject(){
        return null; //TODO codavaj!!
    }

    public static class JavaArchiveFilter implements java.io.FilenameFilter{
        public JavaArchiveFilter(){
             //TODO codavaj!!
        }

        public boolean accept(java.io.File dir, java.lang.String aName){
            return false; //TODO codavaj!!
        }

    }
}

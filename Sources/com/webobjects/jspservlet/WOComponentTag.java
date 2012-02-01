package com.webobjects.jspservlet;
/**
 * This is a regular JSP taglib handler that enables the use of a WOComponent within a JSP. Please see WOtaglib_1_0.tld for the most authoritative definition of the tag library, including the description of this class. This tag handler has the following tag attributes: className. The WOComponent class name. Required. bodyContentOnly. Indicates if only the WOResponse body content is required. The HTML headers will be stripped off if this is true. Default is true. Optional. mergeHeader. Indicates if only the WOResponse headers should be merged with the ServletResponse's headers. Default is false. Optional. This tag's body content is labelled "jsp". What this means is that its body should be parsed for additional tags. For this version, the body contains one or more WOBindingTag, and WOExtraHeaderTag.
 * See Also:WOComponent, WOBindingTag, WOExtraHeaderTag, Serialized Form
 */
public class WOComponentTag extends javax.servlet.jsp.tagext.BodyTagSupport{
    public WOComponentTag(){
         //TODO codavaj!!
    }

    /**
     * Standard method to end the tag. Invokes WOServletAdaptor.embeddedComponentResponse
     */
    public int doEndTag() throws javax.servlet.jsp.JspException{
        return 0; //TODO codavaj!!
    }

    /**
     * Standard method to start using the tag.
     */
    public int doStartTag() throws javax.servlet.jsp.JspException{
        return 0; //TODO codavaj!!
    }

    /**
     * Sets a key-value pair to be passed to the WOComponent for binding.
     */
    public void setBinding(java.lang.String key, java.lang.Object value){
        return; //TODO codavaj!!
    }

    /**
     * Sets the attribute bodyContentOnly for this tag. This is called by the servlet container framework to pass in the value given the JSP.
     */
    public void setBodyContentOnly(boolean bodyContentOnly){
        return; //TODO codavaj!!
    }

    /**
     * Sets the attribute className for this tag. See the class description for more details. This is called by the servlet container framework to pass in the value given the JSP.
     */
    public void setClassname(java.lang.String className){
        return; //TODO codavaj!!
    }

    /**
     * Sets the attribute className for this tag. See the class description for more details. This is called by the servlet container framework to pass in the value given the JSP.
     */
    public void setClassName(java.lang.String className){
        return; //TODO codavaj!!
    }

    /**
     * Sets a key-value pair to be set as an extra HTTP header to either the WOComponent or the Direct Action. Passing a null object will cause the appropriate existing header to be removed from the request.
     */
    public void setExtraHeader(java.lang.String key, java.lang.String value){
        return; //TODO codavaj!!
    }

    /**
     * Sets the attribute mergeResponseHeaders for this tag. See the class description for more details. This is called by the servlet container framework to pass in the value given the JSP.
     */
    public void setMergeResponseHeaders(boolean mergeResponseHeaders){
        return; //TODO codavaj!!
    }

}

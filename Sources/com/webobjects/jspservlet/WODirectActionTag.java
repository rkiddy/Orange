package com.webobjects.jspservlet;
/**
 * See Also:Serialized Form
 */
class WODirectActionTag extends javax.servlet.jsp.tagext.BodyTagSupport{
    public WODirectActionTag(){
         //TODO codavaj!!
    }

    /**
     * Standard method to end the tag.
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
     * Sets the attribute actionName for this tag. See the class description for more details. This is called by the servlet container framework to pass in the value given the JSP.
     */
    public void setActionName(java.lang.String name){
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
     * Sets the content of the WOResponse as seen by the Direct Action. This is optional.
     */
    public void setContentStream(java.io.InputStream is){
        return; //TODO codavaj!!
    }

    /**
     * Sets a key-value pair to be set as an extra HTTP header to either the WOComponent or the Direct Action. Passing a null object will cause the appropriate existing header to be removed from the request.
     */
    public void setExtraHeader(java.lang.String key, java.lang.String value){
        return; //TODO codavaj!!
    }

    /**
     * Sets a key-value pair to be passed to the Direct Action as a form value in the queryString.
     */
    public void setFormValue(java.lang.String key, java.lang.String value){
        return; //TODO codavaj!!
    }

    /**
     * Sets the attribute mergeResponseHeaders for this tag. See the class description for more details. This is called by the servlet container framework to pass in the value given the JSP.
     */
    public void setMergeResponseHeaders(boolean mergeResponseHeaders){
        return; //TODO codavaj!!
    }

}

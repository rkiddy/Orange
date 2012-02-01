package com.webobjects.jspservlet;
/**
 * See Also:Serialized Form
 */
public class WOExtraHeaderTag extends javax.servlet.jsp.tagext.TagSupport{
    public WOExtraHeaderTag(){
         //TODO codavaj!!
    }

    /**
     * Standard method to start using the tag. Calls its parent WOTag to set the extra header.
     */
    public int doStartTag() throws javax.servlet.jsp.JspException{
        return 0; //TODO codavaj!!
    }

    /**
     * Sets the attribute key for this tag. See the class description for more details. This is called by the servlet container framework to pass in the value given the JSP.
     */
    public void setKey(java.lang.String key){
        return; //TODO codavaj!!
    }

    /**
     * Sets the attribute value for this tag. See the class description for more details. This is called by the servlet container framework to pass in the value given the JSP. If this is not passed in, the header key will be removed from the HTTP request passed to the component.
     */
    public void setValue(java.lang.String value){
        return; //TODO codavaj!!
    }

}

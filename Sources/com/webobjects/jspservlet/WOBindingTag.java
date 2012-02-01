package com.webobjects.jspservlet;
/**
 * This is a sub-tag of WOComponentTag used to pass bindings. WebObjects supports the use of WOComponents in JSP through the use of a Tag Library. While WOComponentTag specifies the WOComponent that is used in a JSP, this specifies the key-value pair to be passed to the WOComponent as a binding. This tag has no body but has the following attributes: key. The key of the binding. Required. value. The value of the binding. Can be any type of Object. Required.
 * See Also:WOComponent, WOComponentTag, Serialized Form
 */
public class WOBindingTag extends javax.servlet.jsp.tagext.TagSupport{
    public WOBindingTag(){
         //TODO codavaj!!
    }

    /**
     * Standard method to start using the tag. Calls its parent WOComponentTag to set key-value binding.
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
     * Sets the attribute value for this tag. See the class description for more details. This is called by the servlet container framework to pass in the value given the JSP. Can be any kind of Object.
     */
    public void setValue(java.lang.Object value){
        return; //TODO codavaj!!
    }

}

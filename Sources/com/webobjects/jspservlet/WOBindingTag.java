
package com.webobjects.jspservlet;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;
import javax.servlet.jsp.tagext.TagSupport;


public class WOBindingTag extends TagSupport {


    public WOBindingTag() { return null; }

    public void setKey(String key) {}

    public void setValue(Object value) {}

    public int doStartTag() throws JspException { return 0; }

    private static final long serialVersionUID = 0x9c41c34fL;
    private String _key;
    private Object _value;

}

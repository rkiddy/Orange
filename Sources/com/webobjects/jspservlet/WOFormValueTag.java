
package com.webobjects.jspservlet;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;
import javax.servlet.jsp.tagext.TagSupport;


public class WOFormValueTag extends TagSupport {


    public WOFormValueTag() { return null; }

    public void setKey(String key) {}

    public void setValue(String value) {}

    public int doStartTag() throws JspException { return 0; }

    private static final long serialVersionUID = 0xd1f9226bL;
    private String _key;
    private String _value;

}

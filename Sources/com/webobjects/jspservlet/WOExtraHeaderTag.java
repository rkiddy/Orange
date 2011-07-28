
package com.webobjects.jspservlet;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;
import javax.servlet.jsp.tagext.TagSupport;


public class WOExtraHeaderTag extends TagSupport {


    public WOExtraHeaderTag() { return null; }

    public void setKey(String key) {}

    public void setValue(String value) {}

    public int doStartTag() throws JspException { return 0; }

    private static final long serialVersionUID = 0xbd7c10afL;
    private String _key;
    private String _value;

}

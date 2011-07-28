
package com.webobjects.jspservlet;

import java.util.HashMap;
import javax.servlet.jsp.*;


public class WOComponentTag extends WOTag {


    public WOComponentTag() { return null; }

    public void setBinding(String key, Object value) {}

    public int doStartTag() throws JspException { return 0; }

    public int doEndTag() throws JspException { return 0; }

    private static final long serialVersionUID = 0x9c2727bL;
    private HashMap _bindings;

}

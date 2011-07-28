
package com.webobjects.jspservlet;

import java.io.InputStream;
import java.util.HashMap;
import java.util.Map;
import javax.servlet.jsp.*;


public class WODirectActionTag extends WOTag {


    public WODirectActionTag() { return null; }

    public void setActionName(String name) {}

    public void setFormValue(String key, String value) {}

    public void setContentStream(InputStream is) {}

    public int doStartTag() throws JspException { return 0; }

    public int doEndTag() throws JspException { return 0; }

    private static final long serialVersionUID = 0xb77e8475L;
    private String _actionName;
    private Map _formValues;
    private InputStream _contentStream;

}

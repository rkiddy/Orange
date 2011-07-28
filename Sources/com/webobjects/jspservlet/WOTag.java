
package com.webobjects.jspservlet;

import java.util.*;
import javax.servlet.jsp.JspException;
import javax.servlet.jsp.tagext.BodyTagSupport;

abstract class WOTag extends BodyTagSupport {


    public WOTag() { return null; }

    public void setClassName(String className) {}

    public void setClassname(String className) {}

    public void setExtraHeader(String key, String value) {}

    public void setBodyContentOnly(boolean bodyContentOnly) {}

    public void setMergeResponseHeaders(boolean mergeResponseHeaders) {}

    public abstract int doStartTag() throws JspException;

    public abstract int doEndTag() throws JspException;

    protected String _className;
    protected Map _extraHeaders;
    protected boolean _bodyContentOnly;
    protected boolean _mergeResponseHeaders;

}

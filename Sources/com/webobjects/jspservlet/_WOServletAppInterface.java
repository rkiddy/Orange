
package com.webobjects.jspservlet;

import java.io.IOException;
import java.io.InputStream;
import java.util.Map;

public interface _WOServletAppInterface {

    public abstract String applicationName();

    public abstract Object applicationObject();

    public abstract void setSessionStoreClassName(String s);

    public abstract void setContextClassName(String s);

    public abstract void servletDispatchRequest(Map map, boolean flag) throws IOException;

    public abstract String servletResponseForComponentWithName(String s, Map map, Map map1, Map map2, String s1, String s2, boolean flag, 
            boolean flag1);

    public abstract String servletResponseForDirectActionWithNameAndClass(String s, String s1, Map map, InputStream inputstream, Map map1, Map map2, String s2, 
            String s3, boolean flag, boolean flag1);
}

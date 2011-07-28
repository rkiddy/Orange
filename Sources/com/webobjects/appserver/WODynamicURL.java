
package com.webobjects.appserver;

import com.webobjects.appserver._private.WOURLFormatException;
import com.webobjects.foundation.NSLog;
import java.io.*;


public class WODynamicURL
    implements Serializable {
    public static class WOURLInvalidQueryString extends LocaleURLFormatException {


        public WOURLInvalidQueryString() { return null; }

        private static final long serialVersionUID = 0xc78fb5d6L;

    }

    public static class WOURLInvalidRequestHandlerPath extends LocaleURLFormatException {


        public WOURLInvalidRequestHandlerPath() { return null; }

        private static final long serialVersionUID = 0x9df55981L;

    }

    public static class WOURLInvalidRequestHandlerKey extends LocaleURLFormatException {


        public WOURLInvalidRequestHandlerKey() { return null; }

        private static final long serialVersionUID = 0x6d93176aL;

    }

    public static class WOURLInvalidApplicationNumber extends LocaleURLFormatException {


        public WOURLInvalidApplicationNumber() { return null; }

        private static final long serialVersionUID = 0x555d6fd1L;

    }

    public static class WOURLInvalidApplicationName extends LocaleURLFormatException {


        public WOURLInvalidApplicationName() { return null; }

        private static final long serialVersionUID = 0x733b239dL;

    }

    public static class WOURLInvalidWebObjectsVersion extends LocaleURLFormatException {


        public WOURLInvalidWebObjectsVersion() { return null; }

        private static final long serialVersionUID = 0xb71f4c35L;

    }

    public static class WOURLInvalidPrefix extends LocaleURLFormatException {


        public WOURLInvalidPrefix() { return null; }

        private static final long serialVersionUID = 0x1a9dfd2dL;

    }

    public static class LocaleURLFormatException extends WOURLFormatException {


        public LocaleURLFormatException(String value) { return null; }

        private static final long serialVersionUID = 0xbfa51a38L;

    }



    public WODynamicURL() { return null; }

    public WODynamicURL(String url) { return null; }

    protected int setPrefixToken(String url, int start, int stop) { return 0; }

    protected int setApplicationNameToken(String url, int start, int stop) { return 0; }

    protected int setApplicationNumberToken(String url, int start, int stop) { return 0; }

    protected int setHandlerKeyToken(String url, int start, int stop) { return 0; }

    protected int setHandlerPathToken(String url, int start, int stop) { return 0; }

    protected int setQueryStringToken(String url, int start, int stop) { return 0; }

    public int nextSeparator(String value, int start) { return 0; }

    public int nextProtocolSeparator(String value, int start) { return 0; }

    public int nextProtocolSeparator(String value, int start, int stop) { return 0; }

    public int nextQuerySeparator(String value, int start) { return 0; }

    public int nextSeparatorBefore(String value, int start, int stop) { return 0; }

    public String safeSubstring(String value, int start, int end) { return null; }

    public String prefix() { return null; }

    public void setPrefix(String value) {}

    public void checkPrefix() throws LocaleURLFormatException {}

    public String webObjectsVersion() { return null; }

    public void setWebObjectsVersion(String value) {}

    public void checkWebObjectsVersion() throws LocaleURLFormatException {}

    public String applicationName() { return null; }

    public void setApplicationName(String value) {}

    public void checkApplicationName() throws LocaleURLFormatException {}

    public String applicationNumber() { return null; }

    public void setApplicationNumber(String value) {}

    public void checkApplicationNumber() throws LocaleURLFormatException {}

    public String requestHandlerKey() { return null; }

    public void setRequestHandlerKey(String value) {}

    public void checkRequestHandlerKey() throws LocaleURLFormatException {}

    public String requestHandlerPath() { return null; }

    public void setRequestHandlerPath(String value) {}

    public void checkRequestHandlerPath() throws LocaleURLFormatException {}

    public String queryString() { return null; }

    public void setQueryString(String value) {}

    public void checkQueryString() throws LocaleURLFormatException {}

    public void check() throws WOURLFormatException {}

    public Object clone() { return null; }

    public String toString() { return null; }

    private void writeObject(ObjectOutputStream out) throws IOException {}

    private void readObject(ObjectInputStream in) throws IOException, ClassNotFoundException {}

    protected boolean containsNull(String value) { return true; }

    protected boolean containsQuestionMark(String value) { return true; }

    public String applicationExtension() { return null; }

    public String adaptorName() { return null; }

    public String adaptorPath() { return null; }

    public String[] adaptorExtensions() { return null; }

    static final long serialVersionUID = 0x5a47be22L;
    protected String _prefix;
    protected String _webObjectsVersion;
    protected String _applicationName;
    protected String _applicationNumber;
    protected String _requestHandlerKey;
    protected String _requestHandlerPath;
    protected String _queryString;
    protected static final String ProtocolSeparator = "://";

}

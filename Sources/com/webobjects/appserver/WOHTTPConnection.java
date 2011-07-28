
package com.webobjects.appserver;

import com.webobjects.appserver._private.WOHttpIO;
import com.webobjects.appserver._private.WOLowercaseCharArray;
import com.webobjects.appserver._private.WOUrlConnection;
import com.webobjects.foundation.*;
import java.io.IOException;
import java.net.*;
import java.util.StringTokenizer;


public class WOHTTPConnection
    implements NSKeyValueCoding, com.webobjects.foundation.NSKeyValueCoding.ErrorHandling, NSKeyValueCodingAdditions {


    private void resetSendRequest() {}

    private void status() throws IOException {}

    private int responseCode() throws IOException { return 0; }

    private String httpVersion() throws IOException { return null; }

    private void setResponseHeaders(WOResponse response, NSDictionary headersDict) {}

    private void getRequestProperties(WORequest req) throws ProtocolException {}

    /**
     * @deprecated Method expectContentLengthHeader is deprecated
     */

    public static void expectContentLengthHeader(boolean expectContentLengthHeader, int contentTimeout) { return null; }

    public WOHTTPConnection(String aHost, int portNumber) { return null; }

    /**
     * @deprecated Method WOHTTPConnection is deprecated
     */

    public WOHTTPConnection(String aHost, int portNumber, int timeout) { return null; }

    public void setReceiveTimeout(int receiveTimeout) {}

    public int receiveTimeout() { return 0; }

    /**
     * @deprecated Method isConnected is deprecated
     */

    public boolean isConnected() { return true; }

    public void setReadTimeout(int readTimeout) {}

    public long readTimeout() { return 0L; }

    public void setSendTimeout(int sendTimeout) {}

    public int sendTimeout() { return 0; }

    /**
     * @deprecated Method setConnectTimeout is deprecated
     */

    public void setConnectTimeout(int connectTimeout) {}

    /**
     * @deprecated Method connectTimeout is deprecated
     */

    public int connectTimeout() { return 0; }

    public void setKeepAliveEnabled(boolean keepAlive) {}

    public boolean keepAliveEnabled() { return true; }

    public void setFollowRedirects(boolean followRedirects) {}

    public boolean followRedirects(boolean followRedirects) { return true; }

    protected static Socket socketForHostAndPortAndTimeout(String host, int port, int timeout) { return null; }

    private boolean oldSendRequest(WORequest request) { return true; }

    public boolean sendRequest(WORequest request) { return true; }

    private WOResponse oldReadResponse() { return null; }

    public WOResponse readResponse() { return null; }

    public String toString() { return null; }

    public static boolean canAccessFieldsDirectly() { return null; }

    public Object valueForKey(String key) { return null; }

    public void takeValueForKey(Object value, String key) {}

    public Object handleQueryWithUnboundKey(String key) { return null; }

    public void handleTakeValueForUnboundKey(Object value, String key) {}

    public void unableToSetNullForKey(String key) {}

    public Object valueForKeyPath(String keyPath) { return null; }

    public void takeValueForKeyPath(Object value, String keyPath) {}

    private String _host;
    private int _port;
    protected WOHttpIO _httpIO;
    protected Socket _socket;
    private boolean _useUrlConnection;
    private WOUrlConnection _woUrlConnection;
    private int _responseCode;
    private String _httpVersion;
    private boolean _followRedirects;
    private int _receiveTimeout;
    private int _sendTimeout;
    private int _readTimeout;
    private boolean _keepAlive;
    private static final int DEFAULT_CONNECT_TIMEOUT = 5000;
    private static final int DEFAULT_SEND_TIMEOUT = 10000;
    private static final int DEFAULT_RECEIVE_TIMEOUT = 30000;
    private static final int DEFAULT_READ_TIMEOUT = 0;
    private static final String HTTP = "http";

}

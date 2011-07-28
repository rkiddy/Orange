
package com.webobjects.eodistribution.client;

import com.webobjects.eodistribution.common._EOReferenceRecordingCoder;
import com.webobjects.foundation.*;
import java.io.*;
import java.net.*;
import java.util.StringTokenizer;


public class EOHTTPChannel extends EODistributionChannel {


    public EOHTTPChannel() { return null; }

    public NSArray connectionKeys() { return null; }

    public static String _resolvedHostName(String host, String applicationURL) { return null; }

    public void establishConnection() {}

    private void _buildURL(String applicationURL, String componentURL, String sessionID) {}

    public Socket createSocket(String protocol, String hostName, int portNumber) throws IOException { return null; }

    private void _openSocketToServer() throws IOException {}

    private void cleanUpConnectionResources() {}

    private Object _responseToMessage(Object message, NSCoder coder, boolean useDelegate) { return null; }

    boolean _isWithinResponseToMessage() { return null; }

    public Object responseToMessage(Object message, NSCoder coder) { return null; }

    public URL _completeURL(String string) { return null; }

    private String _headerForMessageLength(int length) { return null; }

    private void _saveCookie(StringBuffer cookieBuffer) throws IOException {}

    private void _skipHeadersInResponse(InputStream input) throws IOException {}

    static  {}

    public static final Class _CLASS;
    public static final String ApplicationURLKey = "applicationURL";
    public static final String ComponentURLKey = "componentURL";
    public static final String SessionIDKey = "sessionID";
    public static final String PageKey = "page";
    private static final int _DefaultPort = 80;
    private static final int _Newline = 10;
    private static final int _CarriageReturn = 13;
    private static final int FailureDelayMilliseconds = 10;
    public static final String _EODefaultJavaClientMimeType = "x-eojavaclient-message";
    public static final String _ContentLengthHeader = "content-length:";
    public static final String _SetCookieHeader = "Set-Cookie:";
    private static final char _EODefaultJavaClientMimeTypeCharacters[];
    private static final char _LowercaseContentLengthHeaderCharacters[];
    private static final char _UppercaseContentLengthHeaderCharacters[];
    private static final char _LowercaseSetCookieHeaderCharacters[];
    private static final char _UppercaseSetCookieHeaderCharacters[];
    private static int _StandardPostRequest;
    private static int _DirectActionGetRequestFullURL;
    private static int _DirectActionGetRequestRelativeURL;
    public static String _EOJavaClientMimeType;
    private String _url;
    private String _protocol;
    private String _host;
    private int _port;
    private String _sessionID;
    private int _requestType;
    private Socket _socket;
    private InputStream _input;
    private InputStream _delegateInput;
    private OutputStream _output;
    private ByteArrayOutputStream _privateMessage;
    private OutputStream _delegatePrivateMessage;
    private boolean _delegateAskedForInputStream;
    private boolean _delegateAskedForPrivateMessageStream;
    private Thread _lastThread;
    private NSMutableArray _cookies;

}

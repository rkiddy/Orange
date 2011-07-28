
package com.webobjects.appserver._private;

import com.webobjects.appserver.*;
import com.webobjects.foundation.*;
import java.io.*;
import java.net.Socket;
import java.net.SocketException;


public final class WOHttpIO {


    public static void expectContentLengthHeader(boolean expectContentLengthHeader, int contentTimeout) { return null; }

    private int _readBlob(InputStream inputStream, int length) throws IOException { return 0; }

    private int refillInputBuffer(InputStream inputStream) throws IOException { return 0; }

    public int readLine(InputStream inputStream) throws IOException { return 0; }

    public WOHttpIO() { return null; }

    public void resetBuffer() {}

    private void _ensureBufferIsLargeEnoughToRead(int length) {}

    private void _shrinkBufferToHighWaterMark() {}

    public WORequest readRequestFromSocket(Socket connectionSocket) throws IOException { return null; }

    private void appendMessageHeaders(WOMessage message) {}

    public boolean sendResponse(WOResponse aResponse, Socket connectionSocket, WORequest aRequest) throws IOException { return true; }

    public void sendRequest(WORequest aRequest, Socket connectionSocket) throws IOException {}

    protected boolean sendMessage(WOMessage aMessage, Socket connectionSocket, String httpVersion, WORequest aRequest) throws IOException { return true; }

    public WOResponse readResponseFromSocket(Socket connectionSocket) throws IOException { return null; }

    private static final boolean isHTTP11(String httpVersion) { return null; }

    public NSDictionary headers() { return null; }

    public InputStream _readHeaders(InputStream sis, boolean checkKeepAlive, boolean isRequest, boolean isMultipartHeaders) throws IOException { return null; }

    private NSData _forceReadContent(InputStream sis, Socket connectionSocket) { return null; }

    private NSData _content(InputStream sis, Socket connectionSocket, boolean connectionClosed) throws IOException { return null; }

    private NSData _readChunks(InputStream is, Socket socket) throws IOException { return null; }

    private int readChunkSizeLine(InputStream is) throws IOException { return 0; }

    protected int setSocketTimeout(Socket socket, int timeout) { return 0; }

    public String toString() { return null; }

    static  {}

    private static final int USE_KEEP_ALIVE_DEFAULT = 2;
    private int _keepAlive;
    private static final int _TheInputBufferSize = 2048;
    private static final int _TheOutputBufferSize = 2048;
    private static final int _HighWaterBufferSize;
    public static String URIResponseString;
    private final WOHTTPHeaderValue KeepAliveValue;
    private final WOHTTPHeaderValue CloseValue;
    private final WOLowercaseCharArray ConnectionKey;
    private final WOLowercaseCharArray ContentLengthKey;
    private final WOLowercaseCharArray TransferEncodingKey;
    private byte _buffer[];
    private int _bufferLength;
    private int _bufferIndex;
    private int _lineStartIndex;
    StringBuffer _headersBuffer;
    public boolean _socketClosed;
    private final WOApplication _application;
    private static boolean _expectContentLengthHeader;
    private static int _contentTimeout;
    private final WOHTTPHeadersDictionary _headers;
    public static boolean _alwaysAppendContentLength;

}

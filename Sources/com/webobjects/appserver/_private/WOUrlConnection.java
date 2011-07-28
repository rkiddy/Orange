
package com.webobjects.appserver._private;

import com.webobjects.foundation.*;
import java.io.*;
import java.net.*;
import java.util.LinkedList;
import java.util.ListIterator;

public class WOUrlConnection {
    class UrlDataReader
        implements Runnable {


        public UrlDataReader() { return null; }

        public void reset() {}

        public Exception exception() { return null; }

        public int bytesRead() { return 0; }

        private void prepare(boolean readManyBytes) {}

        public void prepare(byte bytes[], int offset, int bytesToRead) {}

        public void prepare() {}

        public void waitForChunk(long timeout) throws InterruptedException {}

        public void stop() {}

        public void run() {}

        private volatile Exception _exception;
        private volatile int _bytesRead;
        private boolean _keepReading;
        private volatile byte _bytes[];
        private volatile int _offset;
        private volatile int _bytesToRead;
        private boolean _readManyBytes;
        private boolean _startReading[];
        private boolean _chunkRead[];
        final WOUrlConnection this$0;

    }

    class UrlDataReceiver
        implements Runnable {


        public UrlDataReceiver(URLConnection urlConnection) { return null; }

        public void reset() {}

        public void setReadTimeout(long readTimeout) {}

        public NSData response() { return null; }

        public Exception exception() { return null; }

        public void stop() {}

        public void run() {}

        private static final int CHUNK_SIZE = 1024;
        private volatile URLConnection _urlConnection;
        private volatile boolean _keepReceiving;
        private long _readTimeout;
        private UrlDataReader _urlDataReader;
        private final byte _dataLock[];
        private NSData _data;
        private volatile Exception _exception;
        final WOUrlConnection this$0;

    }

    class UrlDataSender
        implements Runnable {


        public UrlDataSender(URLConnection ucon) { return null; }

        public final void setContent(byte content[]) { return null; }

        public final void reset() { return null; }

        public final void stop() { return null; }

        public void run() {}

        public final boolean sent() { return null; }

        private volatile URLConnection _urlConnection;
        private volatile boolean _dataSent;
        private volatile byte _content[];
        final WOUrlConnection this$0;

    }



    private void closeConnection() {}

    public WOUrlConnection(URL url, int connectTimeout, int sendTimeout, int receiveTimeout, int readTimeout) throws IOException { return null; }

    public WOUrlConnection(URL url) throws IOException { return null; }

    public void cleanup() {}

    public void reset() {}

    public long connectTimeout() { return 0L; }

    public void setConnectTimeout(long connectTimeout) {}

    public long sendTimeout() { return 0L; }

    public void setSendTimeout(long sendTimeout) {}

    public long receiveTimeout() { return 0L; }

    public void setReceiveTimeout(long receiveTimeout) {}

    public long readTimeout() { return 0L; }

    public void setReadTimeout(long readTimeout) {}

    public void connect() throws IOException {}

    public void connect(long connectTimeout) throws IOException {}

    public void send(byte content[]) throws IOException {}

    public void send(long sendTimeout, byte content[]) throws IOException {}

    public NSData receive() throws IOException { return null; }

    public NSData receive(long receiveTimeout, long readTimeout) throws IOException { return null; }

    public URLConnection urlConnection() { return null; }

    public HttpURLConnection httpUrlConnection() { return null; }

    public NSDictionary responseHeaders() { return null; }

    public static final String CONNECTION = "connection";
    public static final String CLOSE = "close";
    public static final String KEEPALIVE = "keep-alive";
    private volatile URLConnection _urlConnection;
    private long _connectTimeout;
    private long _sendTimeout;
    private long _readTimeout;
    private long _receiveTimeout;
    InputStream _httpIs;
    UrlDataSender _urlDataSender;
    private UrlDataReceiver _urlDataReceiver;
    private NSMutableDictionary _responseHeaders;

}

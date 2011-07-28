
package com.webobjects.appserver._private;

import com.webobjects.appserver.*;
import com.webobjects.foundation.*;
import java.io.IOException;
import java.io.InterruptedIOException;
import java.net.*;
import javax.net.ssl.SSLException;


public class WOWorkerThread
    implements Runnable {


    /**
     * @deprecated Method WOWorkerThread is deprecated
     */

    public WOWorkerThread(WOClassicAdaptor mtAdaptor, ServerSocket ss, int socketTimeout, boolean isRestricted, int id) { return null; }

    public WOWorkerThread(WOClassicAdaptor mtAdaptor, ServerSocket ss, int socketTimeout, int id) { return null; }

    public int id() { return 0; }

    private void runOnce() {}

    private void _closeSocket() {}

    public void run() {}

    public String toString() { return null; }

    static  {}

    private static String _requestIdKey;
    private int _selfId;
    private WOApplication _app;
    private WOClassicAdaptor _mtAdaptor;
    private ServerSocket _serverSocket;
    private Socket _currentSocket;
    private int _maxSocketIdleTime;
    private WOHttpIO _httpio;
    private boolean _errorOnRead;
    private boolean _dispatchError;
    private Thread t;
    volatile boolean _runFlag;
    volatile boolean _processingRequest;

}

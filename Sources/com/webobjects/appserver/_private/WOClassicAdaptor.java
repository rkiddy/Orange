
package com.webobjects.appserver._private;

import com.webobjects.appserver.*;
import com.webobjects.foundation.*;
import java.io.IOException;
import java.io.InputStream;
import java.net.*;
import java.security.KeyStore;
import javax.net.ssl.*;


public class WOClassicAdaptor extends WOAdaptor {


    protected WOClassicAdaptor(String aName, NSDictionary anAdaptorArgsDict, boolean secure) { return null; }

    public WOClassicAdaptor(String aName, NSDictionary anAdaptorArgsDict) { return null; }

    private char[] _getSSLPassphrase() { return null; }

    private void _initServerSocket(boolean secure) {}

    public synchronized void registerForEvents(boolean secure) { return null; }

    public synchronized void registerForEvents() { return null; }

    public synchronized void unregisterForEvents() { return null; }

    public void incrementActiveThreads() {}

    public void decrementActiveThreads() {}

    int _nmbOfWorkerThreads() { return null; }

    void _setNmbOfWorkerThreads(int value) { return null; }

    int _nmbOfActiveThreads() { return null; }

    void _setNmbOfActiveThreads(int value) { return null; }

    int _windowSize() { return null; }

    void _setWindowSize(int value) { return null; }

    public int port() { return 0; }

    public boolean dispatchesRequestsConcurrently() { return true; }

    public String toString() { return null; }

    private static final int _WO_LIMITED_MAX_THREADS_ = 16;
    private static final int _WO_MIN_THREADS_ = 4;
    private static final int _WO_MAX_SOCKET_IDLE_ = 0x2bf20;
    private static final int _WO_UNSET_PORT_ = 0;
    private static final int _WO_LISTEN_QUEUE_ = 128;
    private static final int _WO_WINDOW_RATIO_ = 4;
    private static final float _WO_GROW_RATIO_ = 2F;
    private NSMutableArray _workerThreads;
    private boolean _registered;
    private InetAddress _host;
    private ServerSocket _listenSocket;
    private int _listenQueueSize;
    private int _maxSocketIdleTime;
    private int _maxWorkerThreads;
    private Object _lock;
    private int __nmbOfWorkerThreads;
    private int __nmbOfActiveThreads;
    private int __windowSize;
    private volatile boolean _shouldGrow;

}

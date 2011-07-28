
package com.webobjects.foundation;

import java.io.IOException;
import java.net.*;


public class NSSocketUtilities {
    private class SocketThread extends Thread {


        public SocketThread(boolean bindLocal, InetAddress address, int port, InetAddress localAddress, int localPort) { return null; }

        public void run() {}

        protected volatile Socket returnSocket;
        protected volatile IOException exception;
        private boolean shouldBindLocal;
        private InetAddress aRemoteAddress;
        private int aRemotePort;
        private InetAddress aLocalAddress;
        private int aLocalPort;
        final NSSocketUtilities this$0;

    }


    private NSSocketUtilities() { return null; }

    public static Socket getSocketWithTimeout(String host, int port, int timeout) throws UnknownHostException, IOException { return null; }

    public static Socket getSocketWithTimeout(String host, int port, InetAddress localAddress, int localPort, int timeout) throws UnknownHostException, IOException { return null; }

    public static Socket getSocketWithTimeout(InetAddress address, int port, int timeout) throws IOException { return null; }

    public static Socket getSocketWithTimeout(InetAddress address, int port, InetAddress localAddress, int localPort, int timeout) throws IOException { return null; }

    private Socket _getSocketWithTimeout(boolean bindLocal, InetAddress address, int port, InetAddress localAddress, int localPort, int timeout) throws IOException { return null; }

    /**
     * @deprecated Method pollingInterval is deprecated
     */

    public static int pollingInterval() { return null; }

    /**
     * @deprecated Method setPollingInterval is deprecated
     */

    public static void setPollingInterval(int i) { return null; }
}

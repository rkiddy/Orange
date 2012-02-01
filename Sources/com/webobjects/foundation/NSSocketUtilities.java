package com.webobjects.foundation;
/**
 * This class provides an easy way to get a TCP socket (java.net.Socket) with a connection timeout. The static methods in this class correspond to all of the java.net.Socket constructors. Invoking getSocketWithTimeout either returns a valid socket, or throws an java.io.IOException (because the Socket creation timed out, or failed for other reasons). When a new socket is requested with getSocketWithTimeout, a timeout argument (in milliseconds) is passed in, and the socket creation times-out when that timeout is exceeded. Passing a timeout value of 0 will result in the default java.net.Socket creation behavior (i.e. a system dependant timeout). This class only contains static methods, and should never be instantiated.
 * See Also:NSSocketUtilities.getSocketWithTimeout(String host, int port, int timeout), NSSocketUtilities.getSocketWithTimeout(InetAddress address, int port, int timeout), NSSocketUtilities.getSocketWithTimeout(String host, int port, InetAddress localAddress, int localPort, int timeout), NSSocketUtilities.getSocketWithTimeout(InetAddress address, int port, InetAddress localAddress, int localPort, int timeout), Socket
 */
public class NSSocketUtilities{
    /**
     * Creates a socket and connects it to the remote address and host specified, using the given timeout in milliseconds. The local end of the socket will be bound to the localPort and localAddress specified.
     */
    public static java.net.Socket getSocketWithTimeout(java.net.InetAddress address, int port, java.net.InetAddress localAddress, int localPort, int timeout) throws java.io.IOException{
        return null; //TODO codavaj!!
    }

    /**
     * Creates a socket and connects it to the remote port and address specified, using the given timeout in milliseconds.
     */
    public static java.net.Socket getSocketWithTimeout(java.net.InetAddress address, int port, int timeout) throws java.io.IOException{
        return null; //TODO codavaj!!
    }

    /**
     * Creates a socket and connects it to the remote port and host specified, using the given timeout in milliseconds. The local end of the socket will be bound to the localPort and localAddress specified.
     */
    public static java.net.Socket getSocketWithTimeout(java.lang.String host, int port, java.net.InetAddress localAddress, int localPort, int timeout) throws java.net.UnknownHostException, java.io.IOException{
        return null; //TODO codavaj!!
    }

    /**
     * Creates a socket and connects it to the remote port and host specified, using the given timeout in milliseconds.
     */
    public static java.net.Socket getSocketWithTimeout(java.lang.String host, int port, int timeout) throws java.net.UnknownHostException, java.io.IOException{
        return null; //TODO codavaj!!
    }

    /**
     * Deprecated.
     */
    public static int pollingInterval(){
        return 0; //TODO codavaj!!
    }

    /**
     * Deprecated.
     */
    public static void setPollingInterval(int interval){
        return; //TODO codavaj!!
    }

}

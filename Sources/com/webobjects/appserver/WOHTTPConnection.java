package com.webobjects.appserver;
/**
 * The WOHTTPConnection class is intended to be used as a client for HTTP communications. It gives direct access to HTTP contents and headers. WOHTTPConnection's sendRequest method allows you to send a WORequest object directly to the server specified by the constructor's host and port parameters, and readResponse allows you to receive WOResponse objects from that same server.
 * Use HTTP/1.1 protocol in WORequest whenever possible.
 * See Also:WORequest, WOResponse, WOHTTPConnection.WOHTTPConnection(java.lang.String, int), WOHTTPConnection.sendRequest(WORequest aRequest), WOHTTPConnection.readResponse()
 */
public class WOHTTPConnection implements com.webobjects.foundation.NSKeyValueCoding, com.webobjects.foundation.NSKeyValueCoding.ErrorHandling, com.webobjects.foundation.NSKeyValueCodingAdditions{
    /**
     * Creates a WOHTTPConnection instance initialized with the specified host name and port number.
     * Parameters:aHost - the host name to connect toportNumber - the port number to connect to
     */
    public WOHTTPConnection(java.lang.String aHost, int portNumber){
         //TODO codavaj!!
    }

    /**
     * Deprecated.
     * Creates a WOHTTPConnection instance initialized with the specified host name, port number and the timeout interval in milliseconds
     * Parameters:aHost - the host name to connect toportNumber - the port number to connect totimeout - timeout interval in millisecondsSee Also:WOHTTPConnection.setReceiveTimeout(int), WOHTTPConnection.setSendTimeout(int)
     */
    public WOHTTPConnection(java.lang.String aHost, int portNumber, int timeout){
         //TODO codavaj!!
    }

    /**
     * WOHTTPConnection's implementation of this static method returns true, indicating that key/value coding is allowed to access fields in this object if an appropriate method isn't present.
     */
    public static boolean canAccessFieldsDirectly(){
        return false; //TODO codavaj!!
    }

    /**
     * Deprecated.
     * Gets the connection timeout interval.
     */
    public int connectTimeout(){
        return 0; //TODO codavaj!!
    }

    /**
     * Deprecated.
     * Relevant only in HTTP/1.0, this static method allows you to specify whether a content-length header is expected to accompany HTTP content, and, if a content-length header is not found, how long (in milliseconds) WOHTTPConnection should wait to determine that all HTTP content has been received.
     * Set the first parameter to false and supply an appropriate timeout if a content-length header might not be expected to be present. If you set the first parameter to true, the timeout parameter is ignored and, if no content-length header is found among the HTTP content, no data will be returned when reading from the socket. If a content-length header is detected, the value the header specifies will be used to determine how much data to accumulate independent of the contentTimeout.
     */
    public static void expectContentLengthHeader(boolean expectContentLengthHeader, int contentTimeout){
        return; //TODO codavaj!!
    }

    /**
     * Gets boolean value indicating whether or not HTTP redirects (3xx) should be automatically followed. The parameter is ignored.
     */
    public boolean followRedirects(boolean followRedirects){
        return false; //TODO codavaj!!
    }

    /**
     * Conformance to NSKeyValueCoding.ErrorHandling.
     */
    public java.lang.Object handleQueryWithUnboundKey(java.lang.String key){
        return null; //TODO codavaj!!
    }

    /**
     * Conformance to NSKeyValueCoding.ErrorHandling.
     */
    public void handleTakeValueForUnboundKey(java.lang.Object value, java.lang.String key){
        return; //TODO codavaj!!
    }

    /**
     * Deprecated.
     */
    public boolean isConnected(){
        return false; //TODO codavaj!!
    }

    /**
     * Gets the previously set boolean value to indicate if a connection should be left open after a request has been sent.
     * The default value is true.
     */
    public boolean keepAliveEnabled(){
        return false; //TODO codavaj!!
    }

    /**
     * Receives a response after sendRequest is executed. The response is then encapsulated as a WOResponse object and returned.
     * Use setReceiveTimeout to control the receive timeout interval.
     */
    public com.webobjects.appserver.WOResponse readResponse(){
        return null; //TODO codavaj!!
    }

    /**
     * Gets the read timeout interval set previously for a finer-grained read operation.
     */
    public long readTimeout(){
        return 0l; //TODO codavaj!!
    }

    /**
     * Gets the receive timeout interval.
     */
    public int receiveTimeout(){
        return 0; //TODO codavaj!!
    }

    /**
     * Sends a WORequest request to a destination connection point initialized in the constructor WOHTTPConnection. After a request has been sent, use readReponse to receive the response back.
     * Use setSendTimeout to control the send timeout interval.
     */
    public boolean sendRequest(com.webobjects.appserver.WORequest request){
        return false; //TODO codavaj!!
    }

    /**
     * Gets the send timeout interval.
     */
    public int sendTimeout(){
        return 0; //TODO codavaj!!
    }

    /**
     * Deprecated.
     * Sets the connection timeout interval to connectTimeout milliseconds. The default value for this timeout is 5 seconds unless overridden by the WOHTTPConnectTimeout property.
     */
    public void setConnectTimeout(int connectTimeout){
        return; //TODO codavaj!!
    }

    /**
     * Sets whether HTTP redirects (requests with response code 3xx) should be automatically followed by this class. True by default. Applets cannot change this variable.
     * If there is a security manager, this method first calls the security manager's checkSetFactory method to ensure the operation is allowed. This could result in a SecurityException.
     */
    public void setFollowRedirects(boolean followRedirects){
        return; //TODO codavaj!!
    }

    /**
     * Specifies according to keepAlive whether the connection is to be left open after a request has been sent so that subsequent requests to the same destination connection point don't require the connection to be re-opened.
     * The default for HTTP/1.1 is to keep the connection open while for HTTP/1.0 is to close the connection.
     * In cases where you make a lot of one-time connections to different servers using HTTP/1.1, you want to consider using this method with keepAlive=false to prevent too many opened connections (sockets). Take note that this value overwrites the "connection" header in the WORequest and the default value is true. Thus, if your intention is to have "connection=close" in the header (which results in the connection closing), make sure that you set the parameter to false.
     */
    public void setKeepAliveEnabled(boolean keepAlive){
        return; //TODO codavaj!!
    }

    /**
     * Sets the timeout interval to control each finer-grained socket read operation when receiving data from a remote connection. To control the timeout for the entire receive operation, use setReceiveTimeout.
     * The default value is the system-dependent socket read timeout. Since there is a default receive timeout interval, you do not usually have to set the read timeout interval.
     */
    public void setReadTimeout(int readTimeout){
        return; //TODO codavaj!!
    }

    /**
     * Sets the receive timeout interval to receiveTimeout milliseconds. This timeout interval specifies the timeout applicable to the entire receive operation, including each individual sockets read operation. To control the timeout for each socket read operation, use setReadTimeout.
     * The default value is 30 seconds unless overridden by the WOHTTPReceiveTimeout property
     */
    public void setReceiveTimeout(int receiveTimeout){
        return; //TODO codavaj!!
    }

    /**
     * Sets the send timeout interval to sendTimeout milliseconds.
     * The default value is 10 seconds.
     */
    public void setSendTimeout(int sendTimeout){
        return; //TODO codavaj!!
    }

    /**
     * Protected class method that returns a java.net.Socket for the provided hostname and port. This method may throw a java.io.IOException or a java.net.UnknownHostException if it is unable to create a new socket based upon the supplied hostname and port.
     */
    protected static java.net.Socket socketForHostAndPortAndTimeout(java.lang.String host, int port, int timeout){
        return null; //TODO codavaj!!
    }

    /**
     * Conformance to NSKeyValueCoding.
     */
    public void takeValueForKey(java.lang.Object value, java.lang.String key){
        return; //TODO codavaj!!
    }

    /**
     * Conformance to NSKeyValueCodingAdditions.
     */
    public void takeValueForKeyPath(java.lang.Object value, java.lang.String keyPath){
        return; //TODO codavaj!!
    }

    public java.lang.String toString(){
        return null; //TODO codavaj!!
    }

    /**
     * Conformance to NSKeyValueCoding.ErrorHandling.
     */
    public void unableToSetNullForKey(java.lang.String key){
        return; //TODO codavaj!!
    }

    /**
     * Conformance to NSKeyValueCoding.
     */
    public java.lang.Object valueForKey(java.lang.String key){
        return null; //TODO codavaj!!
    }

    /**
     * Conformance to NSKeyValueCodingAdditions.
     */
    public java.lang.Object valueForKeyPath(java.lang.String keyPath){
        return null; //TODO codavaj!!
    }

}

package com.webobjects.eodistribution.client;
/**
 * An EOHTTPChannel is a concrete implementation of an EODistributionChannel which handles communication between the client and server in distributed Java Client applications using the HTTP protocol (POST commands).
 * EOHTTPChannels use regular sockets to establish the connection. You can subclass EOHTTPChannel and override the createSocket method if you want to use different kinds of sockets, for example to implement an SSL channel.
 */
public class EOHTTPChannel extends com.webobjects.eodistribution.client.EODistributionChannel{
    /**
     * The name of the applicationURL connection key. The application URL is the URL of the server application.
     * See Also:Constant Field Values
     */
    public static final java.lang.String ApplicationURLKey="applicationURL";

    /**
     * The name of the componentURL connection key. The component URL identifies the WOJavaClientComponent component used on the server side to represent the client.
     * See Also:Constant Field Values
     */
    public static final java.lang.String ComponentURLKey="componentURL";

    /**
     * The name of the page connection key. If specified, the channel connects to a WOJavaClientComponent on the page specified by name with this connection key (the default is the Main page).
     * See Also:Constant Field Values
     */
    public static final java.lang.String PageKey="page";

    /**
     * The name of the sessionID connection key. The session ID identifies the session used on the server side for the client.
     * See Also:Constant Field Values
     */
    public static final java.lang.String SessionIDKey="sessionID";

    /**
     * Creates a new HTTP channel.
     */
    public EOHTTPChannel(){
         //TODO codavaj!!
    }

    /**
     * Returns the connection keys for EOHTTPChannels. Not all the keys have to be specified, usually the application URL is sufficient:
     */
    public com.webobjects.foundation.NSArray connectionKeys(){
        return null; //TODO codavaj!!
    }

    /**
     * Creates and returns a new socket to communicate with the server. You can override this method if you wish to use different kinds of sockets, for example to implement an SSL channel.
     */
    public java.net.Socket createSocket(java.lang.String protocol, java.lang.String hostName, int portNumber) throws java.io.IOException{
        return null; //TODO codavaj!!
    }

    /**
     * Establishes a connection with the server and begins communication using the HTTP protocol. The method retrieves host, port, and URL information from the connection dictionary (application URL). Throws an NSForwardException containing an IOException if a communication problem occurs and an IllegalArgumentException if required information is missing from the connection dictionary.
     */
    public void establishConnection(){
        return; //TODO codavaj!!
    }

    /**
     * Sends the message message from the client to the server using the HTTP POST command. The message is encoded before it is sent using the coder coder. Synchronously receives, decodes, and returns the response to the message. Throws an IllegalStateException if the method is re-entered or an NSForwardException containing an IOException if a communication problem occurs.
     */
    public java.lang.Object responseToMessage(java.lang.Object message, com.webobjects.foundation.NSCoder coder){
        return null; //TODO codavaj!!
    }

}

package com.webobjects.eodistribution.client;
/**
 * EODistributionChannel is an abstract class that defines the interface for objects handling the communication of data between the client and the server in a distributed Java Client application. It is used by EODistributedObjectStores to invoke remote methods on the server side. The distribution layer also includes the EOHTTPChannel class, a concrete subclass of EODistributionChannel that handles communication via the HTTP protocol (the most common protocol in distributed Internet applications). You can create you own subclass of EODistributionChannel if you need client-server communication based on a different protocol such as CORBA/IIOP. All distribution channels subclasses are expected to have a no-argument constructor.
 * An EODistributionChannel object has a connection dictionary that contains the values required to establish a connection on the channel, for example port, host, and URL components. You can change the connection dictionary with the setConnectionDictionary method.
 */
public abstract class EODistributionChannel{
    /**
     * Creates a new distribution channel.
     */
    public EODistributionChannel(){
         //TODO codavaj!!
    }

    /**
     * Returns an EODistributionChannel object instantiated from the class whose name is className. EODistributionChannel subclasses are expected to have a no-argument constructor. This method returns null if the channel can't be instantiated (which is probably because the class cannot be found).
     */
    public static com.webobjects.eodistribution.client.EODistributionChannel channelWithName(java.lang.String className){
        return null; //TODO codavaj!!
    }

    /**
     * Returns the connection dictionary used to connect to the server.
     */
    public com.webobjects.foundation.NSDictionary connectionDictionary(){
        return null; //TODO codavaj!!
    }

    /**
     * Subclasses have to implement this method to return an array of the connection dictionary keys required to establish a connection to the server.
     */
    public abstract com.webobjects.foundation.NSArray connectionKeys();

    /**
     * Returns the receiver's delegate.
     */
    public java.lang.Object delegate(){
        return null; //TODO codavaj!!
    }

    /**
     * Subclasses have to implement this method to establish a connection with the server using a specific protocol.
     */
    public abstract void establishConnection();

    /**
     * Subclasses have to implement this method to send a message to the server and synchronously receive a response. It's the receiver's responsibility to encode the message, represented by the message object, with the help of the NSCoder coder.
     */
    public abstract java.lang.Object responseToMessage(java.lang.Object message, com.webobjects.foundation.NSCoder coder);

    /**
     * Sets the connection dictionary to be used to connect to the server.
     */
    public void setConnectionDictionary(com.webobjects.foundation.NSDictionary connectionDictionary){
        return; //TODO codavaj!!
    }

    /**
     * Sets the receiver's delegate.
     */
    public void setDelegate(java.lang.Object delegate){
        return; //TODO codavaj!!
    }

    /**
     * This interface defines the methods that can be implemented by the delegate of EODistributionChannels -- mostly to handle exceptions. The delegate does not have to actually implement the interface and all methods of it; it is sufficient to implement just the methods needed, but by implementing the interface, the compiler helps to find problems with wrong method signatures.
     */
    public static interface Delegate{
        /**
         * Gives the delegate an opportunity to handle an I/O exception which occured while communicating with the server. The delegate can try to handle the exception and return a new one or null if it is able to deal with the exception completely. If the delegate does not want to handle the exception, it should return the exception passed as the ioException argument (which is the exception the client throws if the delegate does not implement this method or the method is not set).
         */
        abstract java.io.IOException distributionChannelShouldThrowIOException(com.webobjects.eodistribution.client.EODistributionChannel channel, java.io.IOException ioException);

        /**
         * Gives the delegate an opportunity to handle an exception that occured on the server side. The delegate can try to handle the exception and return a new one or null if it is able to deal with the exception completely. If the delegate does not want to handle the exception, it should return the exception passed as the clientExceptionForServerException argument (which is the exception the client throws if the delegate does not implement this method or the method is not set).
         */
        abstract java.lang.Throwable distributionChannelShouldThrowServerException(com.webobjects.eodistribution.client.EODistributionChannel channel, java.lang.Throwable clientExceptionForServerException, java.lang.String originalServerExceptionClassName, java.lang.String originalServerExceptionMessage);

        /**
         * Gives the delegate an opportunity to decrypt data received from the server. Note that the server side has to encrypt the data with the help of the distribution context delegate.
         */
        abstract java.io.InputStream distributionChannelWillReadFromStream(com.webobjects.eodistribution.client.EODistributionChannel channel, java.io.InputStream stream);

        /**
         * Gives the delegate an opportunity to encrypt data sent to the server. Note that the server side has to decrypt the data with the help of the distribution context delegate.
         */
        abstract java.io.OutputStream distributionChannelWillWriteToStream(com.webobjects.eodistribution.client.EODistributionChannel channel, java.io.OutputStream stream);

    }
}

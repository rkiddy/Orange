
package com.webobjects.eodistribution.client;

import com.webobjects.foundation.*;
import java.io.*;
import java.net.MalformedURLException;
import java.net.URL;

public abstract class EODistributionChannel {
    public static interface _DefaultExceptionHandler {

        public abstract Throwable _handleDistributionChannelServerException(Throwable throwable, String s, String s1);

        public abstract IOException _handleDistributionChannelIOException(IOException ioexception);
    }

    public static interface Delegate {


        public abstract OutputStream distributionChannelWillWriteToStream(EODistributionChannel eodistributionchannel, OutputStream outputstream);

        public abstract InputStream distributionChannelWillReadFromStream(EODistributionChannel eodistributionchannel, InputStream inputstream);

        public abstract Throwable distributionChannelShouldThrowServerException(EODistributionChannel eodistributionchannel, Throwable throwable, String s, String s1);

        public abstract IOException distributionChannelShouldThrowIOException(EODistributionChannel eodistributionchannel, IOException ioexception);



        public static final Class _CLASS = null;

    }



    public static void _setDefaultExceptionHandler(_DefaultExceptionHandler exceptionHandler) { return null; }

    public static EODistributionChannel channelWithName(String className) { return null; }

    public EODistributionChannel() { return null; }

    public abstract NSArray connectionKeys();

    public abstract void establishConnection();

    public void setConnectionDictionary(NSDictionary connectionDictionary) {}

    public NSDictionary connectionDictionary() { return null; }

    public abstract Object responseToMessage(Object obj, NSCoder nscoder);

    public URL _completeURL(String string) { return null; }

    Throwable _handleServerException(Throwable clientExceptionForServerException, String originalServerExceptionClassName, String originalServerExceptionMessage) { return null; }

    IOException _handleIOException(IOException ioException) { return null; }

    public Object _mthdelegate() { return null; }

    public void setDelegate(Object delegate) {}

    static  {}

    public static final Class _CLASS = null;
    static final String _distributionChannelWillWriteToStream = "distributionChannelWillWriteToStream";
    static final String _distributionChannelWillReadFromStream = "distributionChannelWillReadFromStream";
    static final String _distributionChannelShouldThrowServerException = "distributionChannelShouldThrowServerException";
    static final String _distributionChannelShouldThrowIOException = "distributionChannelShouldThrowIOException";
    public static final String _DistributionChannelArgumentsProvidedNotification = "_EODistributionChannelArgumentsProvidedNotification";
    public static final String _ArgumentsKey = "arguments";
    private static _DefaultExceptionHandler _defaultExceptionHandler;
    private NSDictionary _connectionDictionary;
    _NSDelegate _delegate;

}

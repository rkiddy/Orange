
package com.webobjects.eoapplication.client;

import com.webobjects.eoapplication.*;
import com.webobjects.eocontrol.*;
import com.webobjects.eodistribution.client.*;
import com.webobjects.foundation.*;
import java.io.IOException;
import java.net.MalformedURLException;
import java.net.URL;


public class EOClientApplicationSupport extends com.webobjects.eoapplication.EOApplication.ApplicationSupport
    implements com.webobjects.eodistribution.client.EODistributionChannel._DefaultExceptionHandler {
    public class _DataSourceFactory extends EODataSourceFactory {


        public _DataSourceFactory() { return null; }

        public EODataSource newMasterDataSourceWithFetchSpecificationName(EOEditingContext editingContext, String entityName, String fetchSpecificationName) { return null; }

        public EODataSource newMasterDataSource(EOEditingContext editingContext, String entityName, EOFetchSpecification fetchSpecification) { return null; }

        public boolean isMasterDataSource(EODataSource dataSource) { return true; }

        public boolean isDetailDataSource(EODataSource dataSource) { return true; }

        public void setAuxilaryQualifierOnDataSource(EODataSource dataSource, EOQualifier qualifier) {}

        final EOClientApplicationSupport this$0;

    }



    public static void main(String argv[]) { return null; }

    public EOClientApplicationSupport(boolean remoteRequestArguments) { return null; }

    public void _distributionChannelArgumentsProvided(NSNotification notification) {}

    public EODistributionChannel channelWithParameters(NSDictionary parameters) { return null; }

    public void runStartupDialogs(NSDictionary arguments) {}

    private void _initializePrincipalClasses(NSDictionary arguments, boolean logProblems) {}

    private void _downloadClientClasses(NSDictionary arguments, EODistributionChannel channel) {}

    public void prepareClasses(NSDictionary arguments) {}

    public void prepareGlobalObjects(NSDictionary arguments) {}

    private static byte[] _bytesFromDescriptions(NSArray descriptions) { return null; }

    private static void _initializeTemporaryGlobalID(String temporaryGIDBase) { return null; }

    public void prepareApplication(EOApplication application, NSDictionary arguments) {}

    public void refreshData() {}

    public void acknowledgeQuit() {}

    public Throwable _handleDistributionChannelServerException(Throwable clientExceptionForServerException, String originalServerExceptionClassName, String originalServerExceptionMessage) { return null; }

    public IOException _handleDistributionChannelIOException(IOException ioException) { return null; }

    static  {}

    public static final Class _CLASS;
    private static final String _RunApplicationURLDialogArgument = "runApplicationURLDialog";
    private static final String _SuppressClassLoadingArgument = "suppressClassLoading";
    private static final String _ApplicationNameArgument = "applicationName";
    private static final String _ChannelClassNameArgument = "channelClassName";
    private static final String _DownloadClientClassesArgument = "downloadClientClasses";
    private static final String _DownloadClientClassURLsArgument = "downloadClientClassURLs";
    private static final String _PrincipalClassNamesArgument = "principalClassNames";
    private static final String _TemporaryGIDBaseArgument = "temporaryGIDBase";
    private static final String _PrincipalClassNameSeparator = " ";
    private static final char _TemporaryGIDBaseSeparator = 61;
    private static final String _TemporaryGIDBaseValueSeparator = "+";
    private static final String _DefaultChannelClassName = "com.webobjects.eodistribution.client.EOHTTPChannel";
    private boolean _remoteRequestArguments;
    private boolean _argumentsProvidedThroughNotification;
    private EODistributionChannel _distributionChannel;
    private EODistributedObjectStore _distributedObjectStore;

}

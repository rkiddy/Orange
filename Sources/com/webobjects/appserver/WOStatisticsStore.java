package com.webobjects.appserver;
/**
 * This class holds various runtime statistics of an application.
 * There is only one instance of this class in an application, so access to all methods must be thread-safe. If at all possible, use "volatile" instead of synchronization to avoid scalability issues here.
 * You can override descriptionForResponse in each of the components if the user wants to record more information. For example, you might want to record the values of all of the component's variables or perhaps just one or two key variables.
 * If the user want to record extra information about the session, the user can override WOStatisticsStore's recordStatisticsForResponse method.
 * The session information is saved as several lines in the Common Log File Format (CLFF), one line per request served. The log is maintained in the CLFF format so that it can be analyzed by any standard CLFF-analysis tool. (For more information about the statistics recorded in the log file, see the formatDescription method description.).
 * See Also:WOStatisticsStore.recordStatisticsForResponse(WOResponse, WOContext), WOStatisticsStore.descriptionForResponse(WOResponse, WOContext), WOStatisticsStore.setLogFile(String, long), WOStatisticsStore.formatDescription(String, WOResponse, WOContext)
 */
public class WOStatisticsStore implements com.webobjects.foundation.NSKeyValueCoding, com.webobjects.foundation.NSKeyValueCoding.ErrorHandling, com.webobjects.foundation.NSKeyValueCodingAdditions, com.webobjects.appserver.WOStatisticsStoreMBean{
    /**
     * Return an initialized WOStatisticsStore.
     */
    protected WOStatisticsStore(){
         //TODO codavaj!!
    }

    /**
     * A component action request handler should call this method at the appropriate time to register the fact that it just handled a component action request.
     */
    public void applicationDidHandleComponentActionRequestWithPageNamed(java.lang.String pageName){
        return; //TODO codavaj!!
    }

    /**
     * A direct action request handler should call this method at the appropriate time to register the fact that it just handled a direct action request.
     */
    public void applicationDidHandleDirectActionRequestWithActionNamed(java.lang.String anActionName){
        return; //TODO codavaj!!
    }

    /**
     * A web service request handler should call this method at the appropriate time to register the fact that it just handled a web service request.
     */
    public void applicationDidHandleWebServiceRequestWithActionNamed(java.lang.String anActionName){
        return; //TODO codavaj!!
    }

    /**
     * A component action request handler should call this method at the appropriate time to register the fact that it is about to handle a component action request.
     */
    public void applicationWillHandleComponentActionRequest(){
        return; //TODO codavaj!!
    }

    /**
     * A direct action request handler should call this method at the appropriate time to register the fact that it is about to handle a direct action request.
     */
    public void applicationWillHandleDirectActionRequest(){
        return; //TODO codavaj!!
    }

    /**
     * A web service request handler should call this method at the appropriate time to register the fact that it is about to handle a web service request.
     */
    public void applicationWillHandleWebServiceRequest(){
        return; //TODO codavaj!!
    }

    /**
     * WOStatisticsStore's implementation of this static method returns true, indicating that key-value coding is allowed to access fields in this object if an appropriate method isn't present.
     */
    public static boolean canAccessFieldsDirectly(){
        return false; //TODO codavaj!!
    }

    /**
     * Records information about the current response by invoking descriptionForResponse on the current response page and returning the result. This method is invoked at the end of the request-response loop in WOSession's appendToResponse method, after the recordStatisticsForResponse method.
     */
    public java.lang.String descriptionForResponse(com.webobjects.appserver.WOResponse aResponse, com.webobjects.appserver.WOContext aContext){
        return null; //TODO codavaj!!
    }

    /**
     * If log file recording is enabled, this method formats the string statistics using the Common Log File Format (CLFF). The resulting string contains:
     * The host from which the HTTP request was received The name of the user that performed the request The current date The request's HTTP method (GET or PUT) The WebObjects application name The result of the descriptionForResponse method (by default, this method returns the response component's name) The request's HTTP version The HTTP status of the response The size of the response
     * Log file recording is enabled by setting a log file using the setLogFile method.
     * This method is used by WOSession to record information about the current transaction when log file recording is enabled.
     */
    public java.lang.String formatDescription(java.lang.String statistics, com.webobjects.appserver.WOResponse aResponse, com.webobjects.appserver.WOContext aContext){
        return null; //TODO codavaj!!
    }

    /**
     * JMX Support
     */
    public long getApplicationlastAccessTime(){
        return 0l; //TODO codavaj!!
    }

    public long getAverageCATransactionTime(){
        return 0l; //TODO codavaj!!
    }

    public long getAverageDATransactionTime(){
        return 0l; //TODO codavaj!!
    }

    public long getAverageIdleTime(){
        return 0l; //TODO codavaj!!
    }

    public double getAverageRequestsPerSession(){
        return 0.0d; //TODO codavaj!!
    }

    public java.util.HashMap getAverageSessionMemory(){
        return null; //TODO codavaj!!
    }

    public long getAverageTransactionTime(){
        return 0l; //TODO codavaj!!
    }

    public long getAverageWSTransactionTime(){
        return 0l; //TODO codavaj!!
    }

    /**
     * JMX MBean Support
     */
    public java.util.HashMap getDirectActionStatistics(){
        return null; //TODO codavaj!!
    }

    /**
     * JMX support
     */
    public java.util.ArrayList getLastSessionStatistics(){
        return null; //TODO codavaj!!
    }

    /**
     * JMX support
     */
    public java.util.HashMap getMemoryUsage(){
        return null; //TODO codavaj!!
    }

    public long getMovingAverageIdleTime(){
        return 0l; //TODO codavaj!!
    }

    public double getMovingAverageRequestsPerSession(){
        return 0.0d; //TODO codavaj!!
    }

    public long getMovingAverageSessionLife(){
        return 0l; //TODO codavaj!!
    }

    public long getMovingAverageTransactionTime(){
        return 0l; //TODO codavaj!!
    }

    /**
     * JMX MBean Support
     */
    public java.util.HashMap getPagesStatistics(){
        return null; //TODO codavaj!!
    }

    /**
     * JMX MBean Support
     */
    public java.util.HashMap getPathsStatistics(){
        return null; //TODO codavaj!!
    }

    /**
     * JMX Support
     */
    public int getSessionMovingAverageSampleSize(){
        return 0; //TODO codavaj!!
    }

    public int getStatisticStoreSessionMax(){
        return 0; //TODO codavaj!!
    }

    /**
     * JMX Support
     */
    public int getTransactionMovingAverageSampleSize(){
        return 0; //TODO codavaj!!
    }

    /**
     * JMX MBean Support
     */
    public java.util.HashMap getWebServiceStatistics(){
        return null; //TODO codavaj!!
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
     * Statistics for the last session
     */
    public com.webobjects.foundation.NSArray lastSessionStatistics(){
        return null; //TODO codavaj!!
    }

    /**
     * Gets the full path of the log file. This log file does not exist unless setLogFile has been called.
     */
    public java.lang.String logFile(){
        return null; //TODO codavaj!!
    }

    /**
     * The number of milliseconds a log file lasts. That is, a log file's contents are flushed after a certain time interval to ensure that it does not grow too large and a new log file is started. This method returns that time interval.
     * Before a new log file is started, the contents of the current log file are saved to a backup file. You can then inspect this log file and/or removed when its data has grown stale.
     */
    public long logFileRotationFrequency(){
        return 0l; //TODO codavaj!!
    }

    /**
     * Deprecated.
     */
    public double logFileRotationFrequencyInDays(){
        return 0.0d; //TODO codavaj!!
    }

    /**
     * Writes the string statistics to the log file specified by logFile. The method is used to record a session's statistics when that session ends. You can also use it to record any string to the log file that you might find helpful.
     */
    public void logString(java.lang.String statistics){
        return; //TODO codavaj!!
    }

    /**
     * Gets an NSMutableDictionary that indicates the total amount of memory in the Java Virtual Machine (access this value using the dictionary key "Total Memory"), and an approximation of the amount of free memory in the system (access this value using the dictionary key "Free Memory"). Both values are measured in bytes. These values can be obtained directly from the java.lang.Runtime object by using the totalMemory() and freeMemory() methods, respectively.
     */
    public com.webobjects.foundation.NSMutableDictionary memoryUsage(){
        return null; //TODO codavaj!!
    }

    /**
     * Records statistics for the current cycle of the request-response loop. This method is invoked at the end of WOSession's appendToResponse method, immediately before the descriptionForResponse method. By default, this method records the name of the response page for later use by descriptionForResponse. You can override it if you want to record more information about the session before the current request and response are garbage collected. You must begin your implementation by invoking the superclass method.
     */
    public void recordStatisticsForResponse(com.webobjects.appserver.WOResponse aResponse, com.webobjects.appserver.WOContext aContext){
        return; //TODO codavaj!!
    }

    /**
     * The WOStatisticsStore object uses the returned sample size to compute the response time for the last n transactions and the idle time between the last n transactions, where n is the number returned by this method. The default sample size is 10.
     */
    public int sessionMovingAverageSampleSize(){
        return 0; //TODO codavaj!!
    }

    /**
     * JMX Support
     */
    public void setApplicationLastAccessTime(long timeInMillis){
        return; //TODO codavaj!!
    }

    /**
     * Deprecated.
     */
    public void setLogFile(java.lang.String path, double days){
        return; //TODO codavaj!!
    }

    /**
     * Sets the full path of the log file to which statistics will be recorded; these statistics will be in Common Log File Format (CLFF). It also sets the rotation period of the log file in milliseconds. After each period the contents of the current log file are saved to a backup file and a new log file is started.
     * The default is not to record information to a log file.
     */
    public void setLogFile(java.lang.String path, long milliseconds){
        return; //TODO codavaj!!
    }

    /**
     * Implements security for the WOStats page by setting its password to password. By default, there is no password, and access to the WOStats page is disabled. You can call this method to set the access password or you can set the password in the Java system properties through the property key "WOStatisticsPassword".
     * When you enter the WOStats URL, a login panel appears. You can leave the user name field blank; as long as you type the appropriate password in the password field, the WOStats page will appear.
     */
    public void setPassword(java.lang.String password){
        return; //TODO codavaj!!
    }

    /**
     * Sets the moving average sample size for each session to aCount. The WOStatisticsStore object uses this sample size to compute the response time for the last aCount transactions and the idle time between the last aCount transactions.
     * The default moving average session sample size is 10 transactions.
     */
    public void setSessionMovingAverageSampleSize(int aCount){
        return; //TODO codavaj!!
    }

    /**
     * Sets the moving average sample size for each transaction to aCount. The WOStatisticsStore object uses this sample size to compute the response time for the last aCount transactions and the idle time between the last aCount transactions.
     * The default moving average transaction sample size is 100 transactions.
     */
    public void setTransactionMovingAverageSampleSize(int aCount){
        return; //TODO codavaj!!
    }

    /**
     * Gets a dictionary containing the statistics that the WOStatisticsStore records.
     * The averages that are displayed by this method are not computed until this method is invoked. Therefore, invoking this method is costly and should not be done at every request.
     */
    public com.webobjects.foundation.NSDictionary statistics(){
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

    /**
     * The WOStatisticsStore object uses the returned sample size to compute the response time for the last n transactions and the idle time between the last n transactions, where n is the number returned by this method. The default sample size is 100.
     */
    public int transactionMovingAverageSampleSize(){
        return 0; //TODO codavaj!!
    }

    /**
     * Conformance to NSKeyValueCoding.ErrorHandling.
     */
    public void unableToSetNullForKey(java.lang.String key){
        return; //TODO codavaj!!
    }

    /**
     * Validates if the password string is correct so as to allow viewing of the application's statistics.
     */
    public boolean validateLogin(java.lang.String string, com.webobjects.appserver.WOSession aSession){
        return false; //TODO codavaj!!
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

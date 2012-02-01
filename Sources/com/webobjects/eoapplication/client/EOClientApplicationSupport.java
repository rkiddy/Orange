package com.webobjects.eoapplication.client;
/**
 * EOClientApplicationSupport is an EOApplication.ApplicationSupport subclass used with three-tier Java Client applications. The main function on EOClientApplicationSupport is the entry point used for these kind of applications.
 */
public class EOClientApplicationSupport extends com.webobjects.eoapplication.EOApplication.ApplicationSupport{
    /**
     * Creates a new EOClientApplicationSupport object.
     * Parameters:remoteRequestArguments - true if additional arguments need to be requested from the server; false if all arguments have already been retrieved
     */
    public EOClientApplicationSupport(boolean remoteRequestArguments){
         //TODO codavaj!!
    }

    /**
     * Notifies the server that the client is about to quit so that it can terminate the session.
     */
    public void acknowledgeQuit(){
        return; //TODO codavaj!!
    }

    /**
     * Creates a new distribution channel to be used with the application.
     */
    public com.webobjects.eodistribution.client.EODistributionChannel channelWithParameters(com.webobjects.foundation.NSDictionary parameters){
        return null; //TODO codavaj!!
    }

    /**
     * Main entry point for three-tier Java Client applications.
     */
    public static void main(java.lang.String[] argv){
        return; //TODO codavaj!!
    }

    /**
     * Sets the application name and a client-side specific defaults manager.
     */
    public void prepareApplication(com.webobjects.eoapplication.EOApplication application, com.webobjects.foundation.NSDictionary arguments){
        return; //TODO codavaj!!
    }

    /**
     * Initializes some client-side principal classes and the distribution channel if that has not already happened.
     */
    public void prepareClasses(com.webobjects.foundation.NSDictionary arguments){
        return; //TODO codavaj!!
    }

    /**
     * Initializes all client-side principal classes and a client-side specific data source factory and resource bundle. Also creates a distributed object store and registers it as default parent object store for editing contexts.
     */
    public void prepareGlobalObjects(com.webobjects.foundation.NSDictionary arguments){
        return; //TODO codavaj!!
    }

    /**
     * Refreshes the enterprise objects fetched to the client with to reflect the latest state known on the server.
     */
    public void refreshData(){
        return; //TODO codavaj!!
    }

    /**
     * If requested with the
     * runApplicationURLDialog
     * argument, runs a URL connection dialog to ask for the server URL.
     */
    public void runStartupDialogs(com.webobjects.foundation.NSDictionary arguments){
        return; //TODO codavaj!!
    }

}

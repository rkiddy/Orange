package com.webobjects.eodistribution;
/**
 * WOJavaClientJNLP is the component called to dynamically create the Web Start JNLP information for WebObjects Java Client applications. The JNLP information is in XML format, and its format is defined in WOJavaClientJNLP.wo, mainly by using WOXMLNode components. The implemented format uses several variables, repetitions and conditionals. The WOJavaClientJNLP class mostly consists of accessor methods for these variables. Developers configure the values through bindings on WOJavaClientComponents (the values are read from the bindings and transferred to the WOJavaClientJNLP component).
 * If developers create additional bindings for the WOJavaClientComponent, they will be passed as additionalMainArguments to the WOJavaClientJNLP component and then then (automatically) to the Java Client applications, as long as the values are of type String.
 * The JNLP XML format defined here includes all the commonly used parameters. However, it can be subclassed for very special situations. In these cases, additional string bindings in the WOJavaClientComponent can be used for additional variables in the JNLP file. Since these will be passed to the WOJavaClientJNLP component as "additionalMainArguments", subclasses can override either the method setAdditionalMainArguments or the method additionalMainArguments in order to filter these variables out of the list of "real" main arguments. To use your own WOJavaClientJNLP subclass, specify the class name with the JNLPComponentName binding on the WOJavaClientComponent.
 * See Also:Serialized Form
 */
public class WOJavaClientJNLP extends com.webobjects.appserver.WOComponent{
    /**
     * Creates a new WOJavaClientJNLP component in a given context.
     * Parameters:context - the WebObjects context for the WOJavaClientJNLP component
     */
    public WOJavaClientJNLP(com.webobjects.appserver.WOContext context){
         //TODO codavaj!!
    }

    /**
     * Returns the additional command line parameters (in addition to the predefined, standard ones) which will be passed to the main method on the client.
     */
    public com.webobjects.foundation.NSDictionary additionalMainArguments(){
        return null; //TODO codavaj!!
    }

    /**
     * Returns a string describing the application. Usually one sentence.
     */
    public java.lang.String applicationDescription(){
        return null; //TODO codavaj!!
    }

    /**
     * Returns the URL for the (optional) application icon. See the Web Start documentation for more information.
     */
    public java.lang.String applicationIcon(){
        return null; //TODO codavaj!!
    }

    /**
     * Returns the descriptive client application name. It will appear in the Web Start dialogs and progress panels.
     */
    public java.lang.String applicationName(){
        return null; //TODO codavaj!!
    }

    /**
     * Returns the application's URL for the JNLP file generation.
     */
    public java.lang.String applicationURL(){
        return null; //TODO codavaj!!
    }

    /**
     * Returns the channelClassName for the JNLP file generation. The channelClassName will be passed to the Java Client application as a command line parameter, and can be used to set a custom EODistributionChannel for the application.
     */
    public java.lang.String channelClassName(){
        return null; //TODO codavaj!!
    }

    /**
     * Returns the codebase URL. At this URL, Web Start will look for the jar files to be downloaded.
     */
    public java.lang.String codebase(){
        return null; //TODO codavaj!!
    }

    /**
     * Returns whether the string describing the application is set. Used for a conditional in the JNLP XML format.
     */
    public boolean hasApplicationDescription(){
        return false; //TODO codavaj!!
    }

    /**
     * Returns whether the URL for the (optional) application icon is set. Used for a conditional in the JNLP XML format.
     */
    public boolean hasApplicationIcon(){
        return false; //TODO codavaj!!
    }

    /**
     * Returns whether the application name is set. Used for a conditional in the JNLP XML format.
     */
    public boolean hasApplicationName(){
        return false; //TODO codavaj!!
    }

    /**
     * Returns whether the homepage URL is set. Used for a conditional in the JNLP XML format.
     */
    public boolean hasHomepage(){
        return false; //TODO codavaj!!
    }

    /**
     * Returns whether the vendor is set. Used for a conditional in the JNLP XML format.
     */
    public boolean hasVendor(){
        return false; //TODO codavaj!!
    }

    /**
     * Returns the Homepage URL. It will appear in the Web Start dialogs and progress panels.
     */
    public java.lang.String homepage(){
        return null; //TODO codavaj!!
    }

    /**
     * Returns J2SE version required for the client installation, by default "1.4+".
     */
    public java.lang.String j2seVersion(){
        return null; //TODO codavaj!!
    }

    /**
     * Returns the download option for the current jar file (the default is "eager", but you may use "lazy"). See the Web Start and JNLP documentation for more information.
     */
    public java.lang.String jarFileDownload(){
        return null; //TODO codavaj!!
    }

    /**
     * Returns the "main" flag for the current jar file (null by default). See the Web Start and JNLP documentation for more information.
     */
    public java.lang.String jarFileMain(){
        return null; //TODO codavaj!!
    }

    /**
     * Returns the current jar file that the WORepetition (for the jar file names) is iterating over while generating the JNLP file.
     */
    public java.lang.String jarFileName(){
        return null; //TODO codavaj!!
    }

    /**
     * Returns the array of jar files to be downloaded by Web Start (at the codebase URL). The list of jar files is usually generated automatically from the bundles of the application or set per binding on the WOJavaClientComponent.
     */
    public com.webobjects.foundation.NSArray jarFileNames(){
        return null; //TODO codavaj!!
    }

    /**
     * Returns the URL at which Web Start will look an updated JNLP file. The web site should have link to this URL for browsers to initiate a Web Start doenload/update. This method would be overridden by a subclass only in very rare cases.
     */
    public java.lang.String jnlpURL(){
        return null; //TODO codavaj!!
    }

    /**
     * Returns the current main argument that the WORepetition (for the main arguments) is iterating over over while generating the JNLP file.
     */
    public java.lang.String mainArgument(){
        return null; //TODO codavaj!!
    }

    /**
     * Returns all command line parameters which will be passed to the Java Client application's main method. This includes both names and values in one ordered NSArray. Instead of overriding this method in a subclass, consider overriding setAdditionalMainArguments or additionalMainArguments.
     */
    public com.webobjects.foundation.NSArray mainArguments(){
        return null; //TODO codavaj!!
    }

    /**
     * Returns the full Java class name containing the main method for the client, by default com.webobjects.eoapplication.client.EOClientApplicationSupport.
     */
    public java.lang.String mainClass(){
        return null; //TODO codavaj!!
    }

    /**
     * Returns whether the Java Client application needs all permissions (versus running in an applet-like sandbox).
     */
    public boolean needsAllPermissions(){
        return false; //TODO codavaj!!
    }

    /**
     * Returns the page for the JNLP file generation. This page is the page on which the WOJavaClientComponent is defined. (So that there can be be multiple such pages, although usually it is the "JavaClient" page.)
     */
    public java.lang.String page(){
        return null; //TODO codavaj!!
    }

    /**
     * Sets additional command line parameters (in addition to the predefined, standard ones) which will be passed to the main method on the client.
     */
    public void setAdditionalMainArguments(com.webobjects.foundation.NSDictionary additionalMainArguments){
        return; //TODO codavaj!!
    }

    /**
     * Sets a string describing the application. Usually one sentence.
     */
    public void setApplicationDescription(java.lang.String applicationDescription){
        return; //TODO codavaj!!
    }

    /**
     * Sets a URL for the (optional) application icon. See the Web Start documentation for more information.
     */
    public void setApplicationIcon(java.lang.String applicationIcon){
        return; //TODO codavaj!!
    }

    /**
     * Sets the descriptive client application name. It will appear in the Web Start dialogs and progress panels.
     */
    public void setApplicationName(java.lang.String applicationName){
        return; //TODO codavaj!!
    }

    /**
     * Sets the application's URL so that it can be used in the JNLP file generation.
     */
    public void setApplicationURL(java.lang.String applicationURL){
        return; //TODO codavaj!!
    }

    /**
     * Sets the channelClassName so that it can be used in the JNLP file generation. The channelClassName will be passed to the Java Client application as a command line parameter, and can be used to set a custom EODistributionChannel for the application.
     */
    public void setChannelClassName(java.lang.String channelClassName){
        return; //TODO codavaj!!
    }

    /**
     * Sets the codebase URL. At this URL, Web Start will look for the jar files to be downloaded.
     */
    public void setCodebase(java.lang.String codebase){
        return; //TODO codavaj!!
    }

    /**
     * Sets the Homepage URL. It will appear in the Web Start dialogs and progress panels.
     */
    public void setHomepage(java.lang.String homepage){
        return; //TODO codavaj!!
    }

    /**
     * Sets the J2SE version required for the client installation.
     */
    public void setJ2seVersion(java.lang.String j2seVersion){
        return; //TODO codavaj!!
    }

    /**
     * Sets the current jar file that the WORepetition (for the jar file names) is iterating over while generating the JNLP file.
     */
    public void setJarFileName(java.lang.String name){
        return; //TODO codavaj!!
    }

    /**
     * Sets the array of jar files to be downloaded by Web Start (at the codebase URL). The list of jar files is usually generated automatically from the bundles of the application or set per binding on the WOJavaClientComponent.
     */
    public void setJarFileNames(com.webobjects.foundation.NSArray jarFileNames){
        return; //TODO codavaj!!
    }

    /**
     * Sets the current main argument that the WORepetition (for the main arguments) is iterating over over while generating the JNLP file.
     */
    public void setMainArgument(java.lang.String name){
        return; //TODO codavaj!!
    }

    /**
     * Sets whether the Java Client application needs all permissions (versus running in an applet-like sandbox).
     */
    public void setNeedsAllPermissions(boolean flag){
        return; //TODO codavaj!!
    }

    /**
     * Sets the page so that it can be used in the JNLP file generation. This page is the page on which the WOJavaClientComponent is defined. (So that there can be be multiple such pages, although usually it is the "JavaClient" page.)
     */
    public void setPage(java.lang.String page){
        return; //TODO codavaj!!
    }

    /**
     * Sets the descriptive vendor name. It will appear in the Web Start dialogs and progress panels.
     */
    public void setVendor(java.lang.String vendor){
        return; //TODO codavaj!!
    }

    /**
     * Returns the descriptive vendor name. It will appear in the Web Start dialogs and progress panels.
     */
    public java.lang.String vendor(){
        return null; //TODO codavaj!!
    }

}

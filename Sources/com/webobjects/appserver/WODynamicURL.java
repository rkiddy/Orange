package com.webobjects.appserver;
/**
 * Since: 5.4 See Also:Serialized Form
 */
public class WODynamicURL implements java.io.Serializable{
    protected static final java.lang.String ProtocolSeparator="://";

    public WODynamicURL(){
         //TODO codavaj!!
    }

    public WODynamicURL(java.lang.String url){
         //TODO codavaj!!
    }

    public java.lang.String[] adaptorExtensions(){
        return null; //TODO codavaj!!
    }

    public java.lang.String adaptorName(){
        return null; //TODO codavaj!!
    }

    public java.lang.String adaptorPath(){
        return null; //TODO codavaj!!
    }

    public java.lang.String applicationExtension(){
        return null; //TODO codavaj!!
    }

    public java.lang.String applicationName(){
        return null; //TODO codavaj!!
    }

    public java.lang.String applicationNumber(){
        return null; //TODO codavaj!!
    }

    public void check(){
        return; //TODO codavaj!!
    }

    public void checkApplicationName() throws com.webobjects.appserver.WODynamicURL.LocaleURLFormatException{
        return; //TODO codavaj!!
    }

    public void checkApplicationNumber() throws com.webobjects.appserver.WODynamicURL.LocaleURLFormatException{
        return; //TODO codavaj!!
    }

    public void checkPrefix() throws com.webobjects.appserver.WODynamicURL.LocaleURLFormatException{
        return; //TODO codavaj!!
    }

    public void checkQueryString() throws com.webobjects.appserver.WODynamicURL.LocaleURLFormatException{
        return; //TODO codavaj!!
    }

    public void checkRequestHandlerKey() throws com.webobjects.appserver.WODynamicURL.LocaleURLFormatException{
        return; //TODO codavaj!!
    }

    public void checkRequestHandlerPath() throws com.webobjects.appserver.WODynamicURL.LocaleURLFormatException{
        return; //TODO codavaj!!
    }

    public void checkWebObjectsVersion() throws com.webobjects.appserver.WODynamicURL.LocaleURLFormatException{
        return; //TODO codavaj!!
    }

    public java.lang.Object clone(){
        return null; //TODO codavaj!!
    }

    protected boolean containsNull(java.lang.String value){
        return false; //TODO codavaj!!
    }

    protected boolean containsQuestionMark(java.lang.String value){
        return false; //TODO codavaj!!
    }

    public int nextProtocolSeparator(java.lang.String value, int start){
        return 0; //TODO codavaj!!
    }

    public int nextProtocolSeparator(java.lang.String value, int start, int stop){
        return 0; //TODO codavaj!!
    }

    public int nextQuerySeparator(java.lang.String value, int start){
        return 0; //TODO codavaj!!
    }

    public int nextSeparator(java.lang.String value, int start){
        return 0; //TODO codavaj!!
    }

    public int nextSeparatorBefore(java.lang.String value, int start, int stop){
        return 0; //TODO codavaj!!
    }

    public java.lang.String prefix(){
        return null; //TODO codavaj!!
    }

    public java.lang.String queryString(){
        return null; //TODO codavaj!!
    }

    public java.lang.String requestHandlerKey(){
        return null; //TODO codavaj!!
    }

    public java.lang.String requestHandlerPath(){
        return null; //TODO codavaj!!
    }

    public java.lang.String safeSubstring(java.lang.String value, int start, int end){
        return null; //TODO codavaj!!
    }

    public void setApplicationName(java.lang.String value){
        return; //TODO codavaj!!
    }

    protected int setApplicationNameToken(java.lang.String url, int start, int stop){
        return 0; //TODO codavaj!!
    }

    public void setApplicationNumber(java.lang.String value){
        return; //TODO codavaj!!
    }

    protected int setApplicationNumberToken(java.lang.String url, int start, int stop){
        return 0; //TODO codavaj!!
    }

    protected int setHandlerKeyToken(java.lang.String url, int start, int stop){
        return 0; //TODO codavaj!!
    }

    protected int setHandlerPathToken(java.lang.String url, int start, int stop){
        return 0; //TODO codavaj!!
    }

    public void setPrefix(java.lang.String value){
        return; //TODO codavaj!!
    }

    protected int setPrefixToken(java.lang.String url, int start, int stop){
        return 0; //TODO codavaj!!
    }

    public void setQueryString(java.lang.String value){
        return; //TODO codavaj!!
    }

    protected int setQueryStringToken(java.lang.String url, int start, int stop){
        return 0; //TODO codavaj!!
    }

    public void setRequestHandlerKey(java.lang.String value){
        return; //TODO codavaj!!
    }

    public void setRequestHandlerPath(java.lang.String value){
        return; //TODO codavaj!!
    }

    public void setWebObjectsVersion(java.lang.String value){
        return; //TODO codavaj!!
    }

    public java.lang.String toString(){
        return null; //TODO codavaj!!
    }

    public java.lang.String webObjectsVersion(){
        return null; //TODO codavaj!!
    }

    /**
     * See Also:Serialized Form
     */
    public static class WOURLInvalidApplicationNumber extends com.webobjects.appserver.WODynamicURL.LocaleURLFormatException{
        public WOURLInvalidApplicationNumber(){
             //TODO codavaj!!
        }

    }
    /**
     * See Also:Serialized Form
     */
    public static class WOURLInvalidWebObjectsVersion extends com.webobjects.appserver.WODynamicURL.LocaleURLFormatException{
        public WOURLInvalidWebObjectsVersion(){
             //TODO codavaj!!
        }

    }
    /**
     * See Also:Serialized Form
     */
    public static class WOURLInvalidRequestHandlerKey extends com.webobjects.appserver.WODynamicURL.LocaleURLFormatException{
        public WOURLInvalidRequestHandlerKey(){
             //TODO codavaj!!
        }

    }
    /**
     * Since: 5.4 See Also:Serialized Form
     */
    public static class LocaleURLFormatException extends com.webobjects.appserver._private.WOURLFormatException{
        public LocaleURLFormatException(java.lang.String value){
             //TODO codavaj!!
        }

    }
    /**
     * See Also:Serialized Form
     */
    public static class WOURLInvalidQueryString extends com.webobjects.appserver.WODynamicURL.LocaleURLFormatException{
        public WOURLInvalidQueryString(){
             //TODO codavaj!!
        }

    }
    /**
     * See Also:Serialized Form
     */
    public static class WOURLInvalidPrefix extends com.webobjects.appserver.WODynamicURL.LocaleURLFormatException{
        public WOURLInvalidPrefix(){
             //TODO codavaj!!
        }

    }
    /**
     * See Also:Serialized Form
     */
    public static class WOURLInvalidApplicationName extends com.webobjects.appserver.WODynamicURL.LocaleURLFormatException{
        public WOURLInvalidApplicationName(){
             //TODO codavaj!!
        }

    }
    /**
     * See Also:Serialized Form
     */
    public static class WOURLInvalidRequestHandlerPath extends com.webobjects.appserver.WODynamicURL.LocaleURLFormatException{
        public WOURLInvalidRequestHandlerPath(){
             //TODO codavaj!!
        }

    }
}

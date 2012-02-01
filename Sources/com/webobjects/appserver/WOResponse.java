package com.webobjects.appserver;
/**
 * A WOResponse object represents an HTTP response that an application returns to a Web server to complete a cycle of the request-response loop. The composition of a response occurs during the third and final phase of this loop, a phase marked by the propagation of the appendToResponse method through the objects of the application. The WOApplication object first invokes this method, passing in a newly-created WOResponse object as an argument. WOElement objects, which represent the dynamic and static HTML elements on a page, respond to the method by appending their HTML representation to the content of the WOResponse object. WOApplication, WOSession, and WOComponent objects can also respond to the method by adding information to the WOResponse object.
 * A WOResponse has two major parts: HTML content and HTTP information. The HTML content is what is displayed in a Web browser; it can include escaped HTML, which is HTML code shown "as is," uninterpreted. The HTTP information encapsulated by a WOResponse object is used when handling the response. This HTTP data includes headers, status codes, and an HTTP version string.
 * The WOMessage class -- from which WOResponse inherits -- declares most of the methods you use when constructing a response. These methods can be divided into two groups, those that add to a response's HTML content and those that read and set HTTP information. For images and other binary data, the user should use the method appendContentData declared in the WOMessage class. You can obtain and set the entire content of the message using WOResponse's content and setContent methods. The following example shows a sequence of appendContent invocations that compose an HTTP "POST" message:
 * It is possible to set an InputStream as the content of the response as well, by invoking setContentStream. If setContentStream is invoked with a non-null InputStream, only the data in the InputStream will be returned to the client - any other content (set using the WOMessage APIs) will be ignored.
 * See Also:WOMessage.appendContentData(NSData dataObject), WOMessage.setContent(NSData someData), WOMessage.content(), WOMessage, WOResponse.setContentStream(InputStream, int, long)
 */
public class WOResponse extends com.webobjects.appserver.WOMessage implements com.webobjects.appserver.WOActionResults, java.lang.Cloneable{
    /**
     * Creates a WOResponse with HTTP status set to 200 (OK), client caching enabled, and the default string encoding set to ISO Latin 1.
     */
    public WOResponse(){
         //TODO codavaj!!
    }

    public java.lang.Object clone(){
        return null; //TODO codavaj!!
    }

    /**
     * Returns the InputStream set in setContentStream. If not stream was set, it returns null.
     */
    public java.io.InputStream contentInputStream(){
        return null; //TODO codavaj!!
    }

    /**
     * Returns the size of the transfer buffer set in setContentStream.
     */
    public int contentInputStreamBufferSize(){
        return 0; //TODO codavaj!!
    }

    /**
     * Returns the length of the content set in setContentStream.
     */
    public long contentInputStreamLength(){
        return 0l; //TODO codavaj!!
    }

    /**
     * Appends certain headers to the response to disable caching in the client (browser). Do not invoke this method more than once for a given response. After this method is invoked, the response will include the following headers: date:
     * expires:
     * pragma: no-cache If cache-control headers are allowed (if the WOAllowsCacheControlHeader property is set to true, which is the default behavior), the response also includes the following cache-control headers: private no-cache no-store must-revalidate max-age=0
     */
    public void disableClientCaching(){
        return; //TODO codavaj!!
    }

    /**
     * WOResponse's implementation simply returns itself.
     */
    public com.webobjects.appserver.WOResponse generateResponse(){
        return null; //TODO codavaj!!
    }

    /**
     * Deprecated.
     * This sets an InputStream as the source of the response content (rather than a String or an NSData). When the response is returned to the client, the data is streamed from inputStream, using bufferSize as the size of the transport buffer in bytes. Note that the contentSize (also in bytes) must be accurate. If there is an InputStream available when the response is to be returned, only the data in the InputStream is returned -- any data that was added or set (either as String or NSData) is ignored. The InputStream will be closed after the response is returned to the client, or if an exception is thrown while sending the response. If you want custom logic to be invoked at that point, create a custom FilterInputStream to wrap the InputStream source and override the close method. However, note that the close() will be invoked after the entire request-response loop has finished; thus references to resources that need to be cleaned up must be carefully managed. Also be cautious during the clean-up itself, as some resources may have changed state. For instance, the defaultEditingContext of a session may have already been unlocked.
     */
    public void setContentStream(java.io.InputStream inputStream, int bufferSize, int contentSize){
        return; //TODO codavaj!!
    }

    /**
     * This sets an InputStream as the source of the response content (rather than a String or an NSData). When the response is returned to the client, the data is streamed from inputStream, using bufferSize as the size of the transport buffer in bytes. Note that the contentSize (also in bytes) must be accurate. If there is an InputStream available when the response is to be returned, only the data in the InputStream is returned -- any data that was added or set (either as String or NSData) is ignored. The InputStream will be closed after the response is returned to the client, or if an exception is thrown while sending the response. If you want custom logic to be invoked at that point, create a custom FilterInputStream to wrap the InputStream source and override the close method. However, note that the close() will be invoked after the entire request-response loop has finished; thus references to resources that need to be cleaned up must be carefully managed. Also be cautious during the clean-up itself, as some resources may have changed state. For instance, the defaultEditingContext of a session may have already been unlocked.
     */
    public void setContentStream(java.io.InputStream inputStream, int bufferSize, long contentSize){
        return; //TODO codavaj!!
    }

    /**
     * Sets the HTTP status to aStatus. The most commonly useful status codes are defined in static fields on WOMessage.
     * Consult RFC 2616 for the significance of status integers.
     */
    public void setStatus(int aStatus){
        return; //TODO codavaj!!
    }

    /**
     * Returns the HTTP return status of the WOResponse. The most commonly useful status codes are defined in static fields on WOMessage.
     * By default, the status is 200 ("OK" status).
     * Consult RFC 2616 for the significance of status integers.
     */
    public int status(){
        return 0; //TODO codavaj!!
    }

    /**
     * Returns a String representation of the receiver. This string representation is suitable for debugging. It details many of the WOResponse object's attributes and should not be confused with the contentString method.
     */
    public java.lang.String toString(){
        return null; //TODO codavaj!!
    }

}

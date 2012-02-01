package com.webobjects.appserver;
/**
 * This class represents the content of a multipart/form-data HTTP request. You get the iterator for such a request by calling multipartIterator on the WORequest object. Once you have this object, you get WOFormData objects by repeatedly calling nextFormData, until it returns null. Each WOFormData allows you to introspect the sub-headers, as well as either look at the form value(s) or grab the entire content of the part as an InputStream subclass. The InputStream subclass is a WOFormDataInpuStream and can be used to stream large file uploads to disk (or elsewhere). The WOMultipartIterator should NOT be used with WOFileUpload component actions. It may be used with component actions where there is no WOFileUpload, and it may be used in DirectActions.
 */
public class WOMultipartIterator{
    protected WOMultipartIterator(){
         //TODO codavaj!!
    }

    /**
     * Intentionally Undocumented
     */
    public WOMultipartIterator(com.webobjects.appserver.WORequest aRequest){
         //TODO codavaj!!
    }

    /**
     * Returns the boundary from the content-type header of the WORequest. If this boundary doesn't exist, the iterator attempts to find one by looking at the first part of the content itself.
     */
    public java.lang.String boundary(){
        return null; //TODO codavaj!!
    }

    /**
     * Returns the number of bytes left to be read from the request content stream. Note that this includes all delimiter information, some padding characters around each delimiter, headers for each form element and the content of each form element as well. Also note that non-file upload elements are often pre-read, and so this number represents the number of bytes actually left on the client and in the socket/stream buffers. If the underlying stream has been closed, this number cannot be depended upon.
     */
    public int contentLengthRemaining(){
        return 0; //TODO codavaj!!
    }

    /**
     * Returns true if the underlying content stream terminated early. This implies that any subsequent form-elements are invalid, and cannot be relied upon to have consistent or useful data. Typically, you would check this after getting an IOException while reading from the InputStream returned by a WOFormData This API may be used to determine if the user canceled the upload.
     */
    public boolean didContentTerminatePrematurely(){
        return false; //TODO codavaj!!
    }

    /**
     * Returns the parsed values from the content-type header of the WORequest.
     */
    public com.webobjects.foundation.NSDictionary multipartHeaders(){
        return null; //TODO codavaj!!
    }

    /**
     * This is the primary method for the iterator. By calling this method, the next form data element is returned, wrapped in a WOFormData object. When the end of the content data is reached, this method returns null. Note that each time this method is invoked, it looks at the previously returned object. If that object represents a file upload, by having the filename sub-header in its content-disposition headers, it will have the file data set to null. Thus, if you are using this method to upload files, you must use up the file data as you get the WOFormData objects. If the previous object was a file upload, even if you have a reference to the InputStream, it is summarily closed once nextFormData is called again.
     */
    public com.webobjects.appserver.WOMultipartIterator.WOFormData nextFormData(){
        return null; //TODO codavaj!!
    }

}

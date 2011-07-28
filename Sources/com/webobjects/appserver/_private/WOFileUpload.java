
package com.webobjects.appserver._private;

import com.webobjects.appserver.*;
import com.webobjects.foundation.*;
import java.io.*;


public class WOFileUpload extends WOInput {


    public WOFileUpload(String aName, NSDictionary someAssociations, WOElement template) { return null; }

    protected String type() { return null; }

    public void takeValuesFromRequest(WORequest aRequest, WOContext aContext) {}

    protected File createTempFileInContext(String localFilePath, WOContext context) { return null; }

    protected void writeOuputStream(InputStream anInputStream, OutputStream anOutputStream, WOContext context) {}

    protected void renameTempFileInContext(File tempFile, String localFilePath, WOContext context) {}

    protected boolean overwriteInContext(WOContext context) { return true; }

    protected boolean copyDataInContext(WOContext context) { return true; }

    protected OutputStream outputStreamInContext(WOContext context) { return null; }

    protected String localFilePathInContext(WOContext context) { return null; }

    protected int bufferSizeInContext(WOContext context) { return 0; }

    public WOActionResults invokeAction(WORequest aRequest, WOContext aContext) { return null; }

    protected void _appendValueAttributeToResponse(WOResponse woresponse, WOContext wocontext) {}

    public String toString() { return null; }

    public static final String FILENAME_SUBKEY = "filename";
    public static final String MIMETYPE_SUBKEY = "mimetype";
    public static final String CONTENTTYPE_KEY = "content-type";
    public static final int DEFAULT_BUFFER_SIZE = 0x80000;
    WOAssociation _data;
    WOAssociation _filepath;
    WOAssociation _mimeType;
    WOAssociation _copyData;
    WOAssociation _inputStream;
    WOAssociation _outputStream;
    WOAssociation _bufferSize;
    WOAssociation _streamToFilePath;
    WOAssociation _overwrite;
    WOAssociation _finalFilePath;

}

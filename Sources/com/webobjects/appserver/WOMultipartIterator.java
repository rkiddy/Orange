
package com.webobjects.appserver;

import com.webobjects.appserver._private.WOCaseInsensitiveDictionary;
import com.webobjects.appserver._private.WOFileUploadSupport;
import com.webobjects.appserver._private.WOHTTPHeaderValue;
import com.webobjects.appserver._private.WOHTTPHeadersDictionary;
import com.webobjects.appserver._private.WOHttpIO;
import com.webobjects.appserver._private.WOInputStreamData;
import com.webobjects.appserver._private.WONoCopyPushbackInputStream;
import com.webobjects.foundation.*;
import java.io.IOException;
import java.io.InputStream;
import java.text.ParseException;
import java.util.LinkedList;


public class WOMultipartIterator {
    public class WOFormData {
        protected class _WOFormDataInputStream extends InputStream {


            protected _WOFormDataInputStream() { return null; }

            public int available() { return 0; }

            public void close() throws IOException {}

            public int read() throws IOException { return 0; }

            public int read(byte b[]) throws IOException { return 0; }

            public int read(byte b[], int off, int len) throws IOException { return 0; }

            public long skip(long n) throws IOException { return 0L; }

            public boolean isClosed() { return true; }

            private boolean _streamClosed;
            private byte _oneByteArray[];
            private byte _drainBuffer[];
            private int _drainBufferLength;
            final WOFormData this$1;

        }



        protected WOFormData() { return null; }

        protected WOFormData(String filePath) { return null; }

        private void _initHeaders() {}

        public boolean isFileUpload() { return true; }

        public NSDictionary headers() { return null; }

        public NSDictionary contentDispositionHeaders() { return null; }

        public String name() { return null; }

        public InputStream formDataInputStream() { return null; }

        public NSData formData() throws IOException { return null; }

        public NSData formData(int bufferSize) throws IOException { return null; }

        public boolean isStreamAvailable() { return true; }

        public String formValue() throws IOException { return null; }

        protected void _addToFormValues(NSMutableDictionary formValues) throws IOException {}

        protected void _legacyFormValues(NSMutableDictionary aFormValues) throws IOException {}

        public Number numericFormValue(NSNumberFormatter numericFormatter) throws IOException { return null; }

        public NSTimestamp dateFormValue(NSTimestampFormatter dateFormatter) throws IOException { return null; }

        void _invalidate() { return null; }

        public boolean isStreamValid() { return true; }

        public String toString() { return null; }

        NSDictionary _headers;
        _WOFormDataInputStream _fdstream;
        NSData _data;
        NSDictionary _cdHeaders;
        NSData _cdData;
        int _index;
        boolean _isTheLast;
        boolean _isFileUpload;
        boolean _streamWasCalled;
        boolean _dataWasCalled;
        String _formValueString;
        final WOMultipartIterator this$0;

    }



    public WOMultipartIterator(WORequest aRequest) { return null; }

    protected WOMultipartIterator() { return null; }

    public String boundary() { return null; }

    public NSDictionary multipartHeaders() { return null; }

    protected void _initSeparator() {}

    public boolean didContentTerminatePrematurely() { return true; }

    public int contentLengthRemaining() { return 0; }

    public int _estimatedContentLength(int numFileUploads, int numNonFileUploads) { return 0; }

    public WOFormData nextFormData() { return null; }

    protected void _invalidateFormData(WOFormData data) {}

    protected WOFormData _currentFormData() { return null; }

    protected WOFormData _nextFormData() { return null; }

    private WOFormData _nextFormDataInList() { return null; }

    protected void _pushFormData(WOFormData newData) {}

    protected void _addFormData(WOFormData newData) {}

    static  {}

    private LinkedList _formDataList;
    private LinkedList _formDataStack;
    int _formDataIndex;
    private int _nextFormDataIndex;
    boolean _closed;
    boolean _isFirstFormData;
    boolean _prematureTermination;
    protected String _boundary;
    byte _separator[];
    private WOCaseInsensitiveDictionary _multipartHeaders;
    protected WORequest _request;
    WONoCopyPushbackInputStream _bis;
    static byte dashDash[];
    static byte CRLF[];

}

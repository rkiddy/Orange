
package com.webobjects.appserver;

import com.webobjects.appserver._private.WOShared;
import com.webobjects.foundation.*;
import java.io.InputStream;
import java.nio.channels.FileChannel;
import java.text.SimpleDateFormat;


public class WOResponse extends WOMessage
    implements WOActionResults, Cloneable {


    public WOResponse() { return null; }

    public void disableClientCaching() {}

    public boolean _isClientCachingDisabled() { return true; }

    public Object clone() { return null; }

    public String toString() { return null; }

    public void setStatus(int aStatus) {}

    public int status() { return 0; }

    public void _finalizeInContext(WOContext aContext) {}

    public void _appendTagAttributeAndValue(String attribute, String value, boolean valueMayNeedEscaping) {}

    public static void _redirectResponse(WOResponse aResponse, String newLocationURL, String contentString) { return null; }

    public WOResponse generateResponse() { return null; }

    public static WOResponse _redirectionResponseForAbsoluteURL(String url, boolean isPermanent) { return null; }

    public void setContentStream(InputStream inputStream, int bufferSize, long contentSize) {}

    /**
     * @deprecated Method setContentStream is deprecated
     */

    public void setContentStream(InputStream inputStream, int bufferSize, int contentSize) {}

    public InputStream contentInputStream() { return null; }

    public int contentInputStreamBufferSize() { return 0; }

    public long contentInputStreamLength() { return 0L; }

    static  {}

    protected FileChannel _fileChannel;
    protected long _channelCount;
    protected long _channelPosition;
    protected InputStream _contentInputStream;
    protected int _contentInputStreamBufferSize;
    protected long _contentInputStreamLength;
    private int _status;
    private boolean _isClientCachingDisabled;
    private static NSMutableArray cacheControlHeaders;
    private static String _disableCacheDateString;
    static String TheLoadAverageKey;
    static String TheRefuseSessionsKey;
    public static final WOResponse _lastDitchErrorResponse;

}


package com.webobjects.appserver._private;

import com.webobjects.appserver.WORequest;
import com.webobjects.foundation.*;
import java.io.UnsupportedEncodingException;
import java.util.Iterator;
import java.util.Set;


public class WOFileUploadSupport {

    public WOFileUploadSupport() { return null; }

    private static Object[] _parseKeyValue(String aKeyValue) { return null; }

    public static WOCaseInsensitiveDictionary _parseOneHeader(String hdr) { return null; }

    public static WOCaseInsensitiveDictionary _parseOneHeader(NSData headerData) { return null; }

    private static NSArray _parseData(NSData data) { return null; }

    public static NSData _dataWithAsciiString(String asciiString) { return null; }

    public static byte[] _bytesWithAsciiString(String asciiString) { return null; }

    private static NSArray _componentsSeparatedByData(NSData aData, NSData separator) { return null; }

    public static NSRange _rangeOfData(NSData aData, NSData data) { return null; }

    public static NSRange _rangeOfData(NSData aData, NSData separator, NSRange aRange) { return null; }

    private static int _indexOf(NSData aData, NSData separator, NSRange range) { return null; }

    private static NSArray _decodeMultipartBody(NSData aBodyData, String boundary) { return null; }

    private static String _encodedFileNameForRequestEncoding(NSData fileNameData, WORequest request) { return null; }

    public static WOCaseInsensitiveDictionary _parseContentDispositionHeader(WORequest aRequest, NSMutableDictionary aFormValues, WOCaseInsensitiveDictionary aHeadersDict, NSData aBodyData, NSData aHeader) { return null; }

    public static String _getFormValuesFromData(WORequest aRequest, NSMutableDictionary aFormValues, NSData bodyData, String key) { return null; }

    public static NSDictionary getFormValuesFromMultipartContent(WORequest aRequest) { return null; }
}

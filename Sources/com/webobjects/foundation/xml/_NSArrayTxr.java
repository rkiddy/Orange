
package com.webobjects.foundation.xml;

import com.webobjects.foundation._NSBase64;
import com.webobjects.foundation._NSUtilities;
import java.io.*;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.StringTokenizer;
import java.util.WeakHashMap;
import org.xml.sax.Attributes;


final class _NSArrayTxr extends _NSTagTransformer
    implements NSXMLObjectStreamConstants {


    private static long computeArraySUID(String typeName) { return null; }

    public _NSArrayTxr(_NSTransformHandler aHandler) { return null; }

    protected boolean isFullObject(Attributes attributes) throws IOException { return true; }

    public void handleStart(String tag, Attributes attributes) throws IOException {}

    public void handleEnd(String tag, String data) throws IOException {}

    static  {}

    private static WeakHashMap suidMap;
    private static final String DELIMITER = " \r\n";
    private String _idRef;
    private _NSTagTransformer.CharArray _EDBs;
    private int _len;
    private char _typeCode[];
    private _NSTagTransformer.CharArray _typeCodes;
    private int _stackLevel;
    private boolean _isPrimitive;

}

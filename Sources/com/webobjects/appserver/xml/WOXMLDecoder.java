
package com.webobjects.appserver.xml;

import com.webobjects.appserver.xml._private._DecodingContentHandler;
import com.webobjects.appserver.xml._private._DecodingHandler;
import com.webobjects.appserver.xml._private._DecodingNode;
import com.webobjects.appserver.xml._private._WOXMLMappingDecoder;
import com.webobjects.eocontrol.*;
import com.webobjects.foundation.*;
import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.text.SimpleDateFormat;
import java.util.Stack;
import java.util.TimeZone;
import org.apache.xerces.impl.dv.util.Base64;
import org.xml.sax.*;


public class WOXMLDecoder
    implements NSKeyValueCoding {


    public String toString() { return null; }

    public void _setDecodingStack(Stack aStack) {}

    public void _setUseTopOfStack(boolean yn) {}

    private _DecodingNode _elementForKey(String aKey) { return null; }

    private Object objectFromCache(_DecodingNode childNode) { return null; }

    protected void addObjectToCache(_DecodingNode childNode, Object anObject) {}

    private Object constructObject(_DecodingNode childNode, Class aClass, Class parameterTypes[], Object constructorArgs[]) { return null; }

    private Object constructFromNodeContent(_DecodingNode childNode, Class aClass) { return null; }

    private Object _decodeNumber(_DecodingNode childNode, Class aClass) { return null; }

    private Object _decodeData(_DecodingNode childNode, Class aClass) { return null; }

    protected Object _decodeString(_DecodingNode childNode, Class aClass) { return null; }

    private Object _decodeBoolean(_DecodingNode childNode, Class aClass) { return null; }

    private Object _decodeDate(_DecodingNode childNode, Class aClass) { return null; }

    private Object _decodeArray(_DecodingNode childNode, Class aClass) { return null; }

    private Object _decodeDictionary(_DecodingNode childNode, Class aClass) { return null; }

    private Object _decodeEO(_DecodingNode childNode, Class aClass) { return null; }

    protected WOXMLDecoder() { return null; }

    /**
     * @deprecated Method parserClassName is deprecated
     */

    public String parserClassName() { return null; }

    /**
     * @deprecated Method setParserrClassName is deprecated
     */

    public void setParserrClassName(String newValue) {}

    public String xmlReaderClassName() { return null; }

    public void setXMLReaderClassName(String newValue) {}

    public static WOXMLDecoder decoder() { return null; }

    public static WOXMLDecoder decoderWithMapping(String mappingModelFile) { return null; }

    /**
     * @deprecated Method handler is deprecated
     */

    protected _DecodingHandler handler() { return null; }

    protected _DecodingContentHandler contentHandler() { return null; }

    /**
     * @deprecated Method parser is deprecated
     */

    public Parser parser() { return null; }

    public XMLReader xmlReader() { return null; }

    public synchronized void setEncoding(String encoding) { return null; }

    public synchronized String encoding() { return null; }

    public synchronized Object decodeRootObject(String xmlFile) { return null; }

    public synchronized Object decodeRootObject(NSData data) { return null; }

    public synchronized Object decodeRootObject(InputSource is) { return null; }

    /**
     * @deprecated Method decodeRootObjectWithParser is deprecated
     */

    private Object decodeRootObjectWithParser(InputSource is) { return null; }

    private Object decodeRootObjectWithXMLReader(InputSource is) { return null; }

    protected String getChildNodeType(_DecodingNode childNode) { return null; }

    public Object decodeObjectForKey(String aKey) { return null; }

    public boolean decodeBooleanForKey(String aKey) { return true; }

    public int decodeIntForKey(String aKey) { return 0; }

    public float decodeFloatForKey(String aKey) { return null; }

    public double decodeDoubleForKey(String aKey) { return null; }

    public Object valueForKey(String key) { return null; }

    public void takeValueForKey(Object value, String key) {}

    private Stack _decodingStack;
    private boolean _useTopOfStack;
    private NSMutableDictionary _decodedObjectCache;
    /**
     * @deprecated Field _handler is deprecated
     */
    private _DecodingHandler _handler;
    private _DecodingContentHandler _contentHandler;
    private String _parserClassName;
    /**
     * @deprecated Field _parser is deprecated
     */
    private Parser _parser;
    private XMLReader _xmlReader;
    private String _encoding;

}

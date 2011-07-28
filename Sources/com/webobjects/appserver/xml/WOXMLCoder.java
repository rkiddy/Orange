
package com.webobjects.appserver.xml;

import com.webobjects.eocontrol.EOClassDescription;
import com.webobjects.eocontrol.EOEnterpriseObject;
import com.webobjects.foundation.*;
import java.text.SimpleDateFormat;
import java.util.Stack;
import java.util.TimeZone;
import org.apache.xerces.impl.dv.util.Base64;


public class WOXMLCoder {
    private class _IdentityCodeMap {


        public _IdentityCodeMap() { return null; }

        public int identityCode(Object object) { return 0; }

        private static final int _NULL = 0;
        private static final int _UNREGISTERED = 0x80000000;
        private _NSMutableIntegerDictionary _objectToIntegerMap;
        private int _nextInt;
        final WOXMLCoder this$0;

    }



    protected void cr() {}

    protected boolean typeNeedsIndentation(Object o) { return true; }

    protected String encodedClassName() { return null; }

    protected String xmlTagForClassNamed(String className) { return null; }

    protected String xmlTagForPropertyKey(String propertyKey, String className) { return null; }

    private String _tabString(int aTabCount) { return null; }

    void appendAttribute(String name, String value) { return null; }

    void appendAttribute(String name, int value) { return null; }

    void appendTypeAndObjectID(String type) { return null; }

    void appendAndTab(String toAppend) { return null; }

    void beginNode(String name) { return null; }

    void endNode(String name) { return null; }

    private static boolean _isPlausibleName(String s) { return null; }

    protected void encodeObjectInTag(String s, String xmlTag, String type) {}

    protected void encodeStringInTag(String s, String xmlTag, String type) {}

    protected void encodeReferenceInTag(int objectID, String xmlTag, String type) {}

    protected void _encodeStringForKey(String aString, String aKey) {}

    protected String escapeString(String toValidate) { return null; }

    protected void _encodeArrayForKey(NSArray objects, String aKey) {}

    protected void _encodeDictionaryForKey(NSDictionary aDictionary, String aKey) {}

    protected void _encodeDataForKey(NSData theData, String aKey) {}

    protected void _encodeDateForKey(NSTimestamp aDate, String aKey) {}

    protected void _encodeNumberForKey(Number aNumber, String aKey) {}

    protected void _encodeBooleanForKey(Boolean b, String aKey) {}

    protected void _encodeNullForKey(String aKey) {}

    protected void _encodeWOXMLCodingForKey(WOXMLCoding object, String key) {}

    protected void _encodeEOEnterpriseObjectForKey(EOEnterpriseObject eo, String aKey) {}

    protected WOXMLCoder() { return null; }

    public static WOXMLCoder coder() { return null; }

    public static WOXMLCoder coderWithMapping(String mappingURL) { return null; }

    public String xmlDeclaration() { return null; }

    public synchronized void setXmlDeclaration() { return null; }

    public synchronized void setXmlDeclaration(String version, String encoding, String standalone) { return null; }

    public synchronized String encodeRootObjectForKey(Object object, String key) { return null; }

    public void encodeObjectForKey(Object object, String key) {}

    public void encodeBooleanForKey(boolean b, String key) {}

    public void encodeIntForKey(int i, String key) {}

    public void encodeFloatForKey(float f, String key) {}

    public void encodeDoubleForKey(double d, String key) {}

    static  {}

    protected StringBuffer _buffer;
    protected String xmlDeclaration;
    protected _IdentityCodeMap _idMap;
    private NSMutableDictionary _encodedObjects;
    private int refCount;
    private int tabCount;
    private static NSArray tabArray;
    protected Stack _encodedClasses;

}

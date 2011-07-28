
package com.webobjects.foundation.xml;

import com.webobjects.foundation._NSObjectStreamClass;
import com.webobjects.foundation._NSSerialFieldDesc;
import java.lang.reflect.Constructor;
import java.util.HashMap;
import org.w3c.dom.Document;
import org.w3c.dom.Element;


final class _NSXMLObjectStreamClass extends _NSObjectStreamClass
    implements NSXMLObjectStreamConstants {
    static class PrimitiveValue {


        PrimitiveValue(String aTag, String aZeroValue) { return null; }

        public String tag;
        public String zeroValue;

    }



    public _NSXMLObjectStreamClass(Class cl) { return null; }

    private void writeFieldDesc(NSXMLOutputStream out) {}

    private static String niceTypeName(Class type, NSXMLOutputStream out) { return null; }

    public Element writeArray(NSXMLOutputStream out, Element parent, int handle) { return null; }

    public Element write(NSXMLOutputStream out, Element parent, int handle, String tag) { return null; }

    public static _NSXMLObjectStreamClass NSXMLlookup(Class cl) { return null; }

    static  {}

    private static final long serialVersionUID = 0xaf05ff50L;
    private static HashMap _cachedNiceTypeNames;
    static HashMap primitiveClassToXMLTag;
    private static final String ARRAY_TYPE = "[]";
    private Element _classElement;

}

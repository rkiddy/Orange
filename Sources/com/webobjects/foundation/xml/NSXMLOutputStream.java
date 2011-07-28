
package com.webobjects.foundation.xml;

import com.webobjects.foundation.*;
import java.io.*;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.Arrays;
import java.util.HashMap;
import javax.xml.parsers.*;
import javax.xml.transform.*;
import javax.xml.transform.dom.DOMSource;
import javax.xml.transform.sax.SAXSource;
import javax.xml.transform.stream.StreamResult;
import javax.xml.transform.stream.StreamSource;
import org.apache.xml.serialize.XMLSerializer;
import org.w3c.dom.*;
import org.xml.sax.InputSource;


public class NSXMLOutputStream extends ObjectOutputStream
    implements NSXMLObjectStreamConstants, NSXMLObjectOutput {
    private static final class OverriddenMtdsRecursiveInfo {


        OverriddenMtdsRecursiveInfo(Object curObj, _NSXMLObjectStreamClass curDesc, _NSXMLPutField putField) { return null; }

        boolean isActive() { return null; }

        Object _curObj;
        _NSXMLObjectStreamClass _curDesc;
        _NSXMLPutField _curPutField;

    }

    static final class DOMRecursiveInfo {


        DOMRecursiveInfo(Element parent) { return null; }

        DOMRecursiveInfo(Element parent, boolean leaf) { return null; }

        Element _curParent;
        boolean _leafClass;

    }

    private static final class _LightweightReplaceMap {


        private void grow() {}

        _LightweightReplaceMap(int initialCapacity, float loadFactor) { return null; }

        void assign(Object obj, Object rep) { return null; }

        Object lookup(Object obj) { return null; }

        void clear() { return null; }

        int size() { return null; }

        private _LightweightObjectIntMap _indices;
        private Object _replacements[];

    }

    private static final class _LightweightObjectIntMap {


        private void insert(Object obj, int handle) {}

        private void growSpine() {}

        private void growEntries() {}

        private int hash(Object obj) { return 0; }

        _LightweightObjectIntMap(int initialCapacity, float loadFactor) { return null; }

        int assign(Object obj) { return null; }

        int lookup(Object obj) { return null; }

        void clear() { return null; }

        int size() { return null; }

        private int _nextInt;
        private int _threshold;
        private float _loadFactor;
        private int _spine[];
        private int _next[];
        private Object _objs[];

    }



    static Element createTextElement(Document targetDoc, String NodeName, String textData) { return null; }

    private Element writeTextElement(String NodeName, String textData) { return null; }

    private void writeTextElement(String NodeName, String textData, String key) {}

    private void clear() {}

    private Element writeElement(String tagName, String key) { return null; }

    private Element writeHandle(String tagName, String key) { return null; }

    private Element writePrimitiveString(String str) { return null; }

    private Element writeString(String str, String key) { return null; }

    private Element writeClassObject(Class cl, String key) { return null; }

    private Object invoke(Object obj, Method method, Object args[]) throws IOException { return null; }

    private Object findReplacement(Object obj) throws IOException { return null; }

    private Element writeObjectStreamClass(ObjectStreamClass osc, String key) { return null; }

    Element writeInternalObject(Object obj, String key) throws IOException { return null; }

    private void writeNonProxyDesc(_NSXMLObjectStreamClass desc) {}

    private void writeProxyDesc(_NSXMLObjectStreamClass desc) {}

    private void writeClassDesc(_NSXMLObjectStreamClass desc) {}

    private void writeEndDataBlock() {}

    private void writeExternalizable(Externalizable obj) throws IOException {}

    private void _writeSerializable(Serializable obj, _NSXMLObjectStreamClass desc) throws IOException {}

    private void writeSerializable(Serializable obj, _NSXMLObjectStreamClass desc) throws IOException {}

    private Element createPrimFieldElement(Object obj, _NSSerialFieldDesc fieldDesc) { return null; }

    private void writeProxyData(Object proxy, _NSXMLObjectStreamClass desc) throws IOException {}

    private void writeFieldsData(Object obj, _NSXMLObjectStreamClass desc) throws IOException {}

    private Element writeNormalObject(Serializable obj, String key) throws IOException { return null; }

    private int writeArrayData(Object array, Element parent, _NSXMLObjectStreamClass desc) throws IOException { return 0; }

    private Element writeArray(Object array, String key) throws IOException { return null; }

    private void writeFinalException(IOException e) throws StreamCorruptedException {}

    private void callWriteObjectOverridden() throws IOException {}

    private boolean isOverridden() { return true; }

    private void initWithTransformer(Source source) throws IOException {}

    private boolean setUseReferenceForString(boolean on) { return true; }

    void setFieldType(Element element, String typeName) { return null; }

    Element curParent() { return null; }

    protected void writeStreamHeader() throws IOException {}

    protected void writeObjectOverride(Object obj) throws IOException {}

    public NSXMLOutputStream(OutputStream out, File xslt) throws IOException { return null; }

    public NSXMLOutputStream(OutputStream out, InputSource xslt) throws IOException { return null; }

    public NSXMLOutputStream(OutputStream out, Transformer transformer) throws IOException { return null; }

    public NSXMLOutputStream(OutputStream out) throws IOException { return null; }

    public void setXSLTSource(File xslt) throws IOException {}

    public void setXSLTSource(InputSource xslt) throws IOException {}

    public void setTransformer(Transformer transformer) {}

    public Transformer transformer() { return null; }

    public NSXMLOutputFormat outputFormat() { return null; }

    public void setOutputFormat(NSXMLOutputFormat format) {}

    public void defaultWriteObject() throws IOException {}

    public java.io.ObjectOutputStream.PutField putFields() throws IOException { return null; }

    public void writeFields() throws IOException {}

    public void write(int val) throws IOException {}

    public void write(byte buf[]) throws IOException {}

    public void write(byte buf[], int off, int len) throws IOException {}

    public void writeBoolean(boolean val) throws IOException {}

    public void writeByte(int val) throws IOException {}

    public void writeShort(int val) throws IOException {}

    public void writeChar(int val) throws IOException {}

    public void writeInt(int val) throws IOException {}

    public void writeLong(long val) throws IOException {}

    public void writeFloat(float val) throws IOException {}

    public void writeDouble(double val) throws IOException {}

    public void writeBytes(String str) throws IOException {}

    public void writeChars(String str) throws IOException {}

    public void writeUTF(String str) throws IOException {}

    public void reset() throws IOException {}

    public void flush() throws IOException {}

    public void close() throws IOException {}

    public void write(int val, String key) {}

    public void write(byte buf[], String key) throws IOException {}

    public void write(byte buf[], int off, int len, String key) throws IOException {}

    public void writeBoolean(boolean val, String key) {}

    public void writeByte(int val, String key) {}

    public void writeShort(int val, String key) {}

    public void writeChar(int val, String key) {}

    public void writeInt(int val, String key) {}

    public void writeLong(long val, String key) {}

    public void writeFloat(float val, String key) {}

    public void writeDouble(double val, String key) {}

    public void writeObject(Object obj, String key) throws IOException {}

    public void writeBytes(String str, String key) throws IOException {}

    public void writeChars(String str, String key) throws IOException {}

    public void writeUTF(String str, String key) {}

    public void writeComment(String comment) {}

    public void writeRootComment(String comment, boolean before) {}

    public final boolean setUseBase64ForBinaryData(boolean on) { return null; }

    public final boolean useBase64ForBinaryData() { return null; }

    public boolean enableReferenceForString() { return true; }

    public boolean disableReferenceForString() { return true; }

    public int disableReferenceForString(int length) { return 0; }

    public boolean useReferenceForString() { return true; }

    static  {}

    private static final String XMLNS_WOXML = "xmlns";
    private static final String SCHEMA_LOC = "http://www.apple.com/webobjects/5.2/schemas/woxml.xsd";
    private static final String XSI_NAMESPACE = "http://www.w3.org/2001/XMLSchema-instance";
    private static final String XMLNS_NAMESPACE = "http://www.w3.org/2000/xmlns/";
    private static final DocumentBuilderFactory _DOM_BUILDER_FACTORY;
    private static final TransformerFactory _TRX_FACTORY;
    private static final String ARRAY_DELIMITER = " ";
    static final String BASE64_TYPE = "base64";
    static final String BASE64_ENCODING = "US-ASCII";
    DOMImplementation _dom;
    Document _doc;
    private int _curHandle;
    private DOMRecursiveInfo _DOMRecursiveInfo;
    private OverriddenMtdsRecursiveInfo _OvMtdsRecursiveInfo;
    private NSXMLOutputFormat _outputFormat;
    private boolean _useBase64ForBinaryData;
    private boolean _useReferenceForString;
    private int _useReferenceForStringLength;
    private int _depth;
    private _LightweightObjectIntMap _handles;
    private _LightweightReplaceMap _replacements;
    private OutputStream _out;
    private Transformer _transformer;

}

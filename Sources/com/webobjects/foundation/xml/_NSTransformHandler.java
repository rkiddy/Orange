
package com.webobjects.foundation.xml;

import java.io.*;
import java.util.HashMap;
import org.xml.sax.*;
import org.xml.sax.ext.LexicalHandler;


final class _NSTransformHandler
    implements ContentHandler, LexicalHandler, NSXMLObjectStreamConstants {
    static final class _NSExceptionTxr extends _NSTagTransformer {

        public _NSExceptionTxr(_NSTransformHandler aHandler) { return null; }

        public void handleStart(String tag, Attributes attributes) throws IOException {}

        public void handleEnd(String tag, String data) throws IOException {}
    }

    static final class _NSDoubleTxr extends _NSPrimitiveTxr {

        public _NSDoubleTxr(_NSTransformHandler aHandler) { return null; }

        public void handleEnd(String tag, String data) throws IOException {}
    }

    static final class _NSFloatTxr extends _NSPrimitiveTxr {

        public _NSFloatTxr(_NSTransformHandler aHandler) { return null; }

        public void handleEnd(String tag, String data) throws IOException {}
    }

    static final class _NSLongTxr extends _NSPrimitiveTxr {

        public _NSLongTxr(_NSTransformHandler aHandler) { return null; }

        public void handleEnd(String tag, String data) throws IOException {}
    }

    static final class _NSIntTxr extends _NSPrimitiveTxr {

        public _NSIntTxr(_NSTransformHandler aHandler) { return null; }

        public void handleEnd(String tag, String data) throws IOException {}
    }

    static final class _NSCharTxr extends _NSPrimitiveTxr {


        public _NSCharTxr(_NSTransformHandler aHandler, _NSStringTxr stringTxr) { return null; }

        public void handleStart(String tag, Attributes attributes) throws IOException {}

        public void handleEnd(String tag, String data) throws IOException {}

        private _NSStringTxr _stringTxr;

    }

    static final class _NSShortTxr extends _NSPrimitiveTxr {

        public _NSShortTxr(_NSTransformHandler aHandler) { return null; }

        public void handleEnd(String tag, String data) throws IOException {}
    }

    static final class _NSByteTxr extends _NSPrimitiveTxr {

        public _NSByteTxr(_NSTransformHandler aHandler) { return null; }

        public void handleEnd(String tag, String data) throws IOException {}
    }

    static final class _NSBoolTxr extends _NSPrimitiveTxr {

        public _NSBoolTxr(_NSTransformHandler aHandler) { return null; }

        public void handleEnd(String tag, String data) throws IOException {}
    }

    static abstract class _NSPrimitiveTxr extends _NSTagTransformer {


        protected _NSPrimitiveTxr(_NSTransformHandler aHandler) { return null; }

        public void handleStart(String tag, Attributes attributes) throws IOException {}

        protected boolean objectValue;

    }

    static final class BlockDataOutputStream extends OutputStream
        implements DataOutput {


        BlockDataOutputStream(OutputStream out) { return null; }

        boolean setBlockDataMode(boolean mode) throws IOException { return null; }

        boolean getBlockDataMode() { return null; }

        public void write(int b) throws IOException {}

        public void write(byte b[]) throws IOException {}

        public void write(byte b[], int off, int len) throws IOException {}

        public void flush() throws IOException {}

        public void close() throws IOException {}

        void write(byte b[], int offset, int length, boolean copy) throws IOException { return null; }

        void drain() throws IOException { return null; }

        private void writeBlockHeader(int len) throws IOException {}

        public void writeBoolean(boolean v) throws IOException {}

        public void writeByte(int v) throws IOException {}

        public void writeShort(int v) throws IOException {}

        public void writeChar(int v) throws IOException {}

        public void writeInt(int v) throws IOException {}

        public void writeFloat(float v) throws IOException {}

        public void writeLong(long v) throws IOException {}

        public void writeDouble(double v) throws IOException {}

        public void writeBytes(String s1) throws IOException {}

        public void writeChars(String s1) throws IOException {}

        public void writeUTF(String s1) throws IOException {}

        private static final int MAX_BLOCK_SIZE = 1024;
        private static final int MAX_HEADER_SIZE = 5;
        private byte buf[];
        private byte hbuf[];
        private boolean blkmode;
        private int pos;
        private OutputStream _out;
        private DataOutputStream _dout;

    }



    public void write(byte b[]) throws IOException {}

    public void write(byte v) throws IOException {}

    public static void write(byte v, OutputStream os) throws IOException { return null; }

    public void write(short v) throws IOException {}

    public static void write(short v, OutputStream os) throws IOException { return null; }

    public void write(char v) throws IOException {}

    public static void write(char v, OutputStream os) throws IOException { return null; }

    public void write(int v) throws IOException {}

    public static void write(int v, OutputStream os) throws IOException { return null; }

    public void write(long v) throws IOException {}

    public static void write(long v, OutputStream os) throws IOException { return null; }

    public void write(float v) throws IOException {}

    public static void write(float v, OutputStream os) throws IOException { return null; }

    public void write(double v) throws IOException {}

    public static void write(double v, OutputStream os) throws IOException { return null; }

    public void write(String s) throws IOException {}

    public static void write(String s, OutputStream os) throws IOException { return null; }

    public void writeReference(String referenceStr) throws IOException {}

    public static void writeReference(String referenceStr, OutputStream os) throws IOException { return null; }

    public _NSTransformHandler() throws IOException { return null; }

    public OutputStream transformedData() { return null; }

    public String previousPartOfString() { return null; }

    public void setDocumentLocator(Locator locator1) {}

    public void startDocument() throws SAXException {}

    public void endDocument() throws SAXException {}

    public void startElement(String namespaceURI, String localName, String rawName, Attributes atts) throws SAXException {}

    public void endElement(String namespaceURI, String localName, String rawName) throws SAXException {}

    public void characters(char ch[], int start, int length) throws SAXException {}

    public void startPrefixMapping(String s, String s1) throws SAXException {}

    public void endPrefixMapping(String s) throws SAXException {}

    public void ignorableWhitespace(char ac[], int i, int j) throws SAXException {}

    public void processingInstruction(String s, String s1) throws SAXException {}

    public void skippedEntity(String s) throws SAXException {}

    public void startDTD(String s, String s1, String s2) throws SAXException {}

    public void endDTD() throws SAXException {}

    public void startEntity(String s) throws SAXException {}

    public void endEntity(String s) throws SAXException {}

    public void startCDATA() throws SAXException {}

    public void endCDATA() throws SAXException {}

    public void comment(char ac[], int i, int j) throws SAXException {}

    private OutputStream _transformedData;
    private _NSTagTransformer _curTagTxr;
    private static HashMap tag2Handler;
    private StringBuffer _curChars;
    BlockDataOutputStream _bdos;

}

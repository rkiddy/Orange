
package com.webobjects.eogeneration;

import com.webobjects.eoapplication.EOResourceBundle;
import com.webobjects.foundation.*;
import java.io.*;
import javax.xml.parsers.*;
import org.xml.sax.*;
import org.xml.sax.helpers.DefaultHandler;

public class _EODictionaryXMLParser extends DefaultHandler {


    private static Object _parseXML(InputSource inputSource, NSBundle bundle) { return null; }

    public static Object parseXML(String xmlString) { return null; }

    public static Object parseXML(NSData xmlData) { return null; }

    public static Object parseXML(NSBundle bundle, String resourcePath) throws IOException { return null; }

    public _EODictionaryXMLParser(NSBundle bundle) { return null; }

    private XMLReader _initReader() { return null; }

    private void _parseDocument(InputSource inputSource) {}

    public NSArray document() { return null; }

    public void startDocument() throws SAXException {}

    public void endDocument() throws SAXException {}

    public void startElement(String uri, String localName, String name, Attributes attributes) throws SAXException {}

    public void endElement(String uri, String localName, String name) throws SAXException {}

    public void characters(char ac[], int i, int j) throws SAXException {}

    public void ignorableWhitespace(char ac[], int i, int j) throws SAXException {}

    public void processingInstruction(String target, String data) throws SAXException {}

    public void warning(SAXParseException exception) throws SAXException {}

    public void error(SAXParseException exception) throws SAXException {}

    public void fatalError(SAXParseException exception) throws SAXException {}

    static  {}

    private static String _BundleResourcePathImport;
    private static String _ArrayTag;
    private static String _DictionaryTag;
    private static String _StringTag;
    private static SAXParserFactory _Factory;
    private static Object StateArray;
    private static Object StateDictionary;
    private static Object StateController;
    private static Object StateString;
    private NSBundle _bundle;
    private NSMutableArray _stack;
    private NSMutableArray _document;
    private NSMutableArray _state;

}

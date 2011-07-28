
package com.webobjects.appserver.xml._private;

import com.webobjects.appserver.xml.WOXMLDecoder;
import java.util.Stack;
import org.xml.sax.*;
import org.xml.sax.ext.DefaultHandler2;


public class _DecodingContentHandler extends DefaultHandler2
    implements ContentHandler {


    public _DecodingContentHandler(WOXMLDecoder decoder) { return null; }

    public Object root() { return null; }

    public void startElement(String uri, String localName, String qName, Attributes attributes) throws SAXException {}

    public void endElement(String uri, String localName, String qName) throws SAXException {}

    public void characters(char ch[], int start, int length) {}

    public void reset() {}

    protected final int DEPTH = 100;
    protected WOXMLDecoder _decoder;
    protected Object _parsedObject;
    protected Stack _decodeNodeStack;

}

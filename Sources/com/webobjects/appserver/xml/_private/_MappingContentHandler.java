
package com.webobjects.appserver.xml._private;

import com.webobjects.appserver.xml.WOXMLException;
import com.webobjects.foundation.NSMutableArray;
import com.webobjects.foundation.NSMutableDictionary;
import java.util.HashMap;
import java.util.Map;
import org.xml.sax.Attributes;
import org.xml.sax.SAXException;


public class _MappingContentHandler extends _DecodingContentHandler {
    private static class MappingContentEntry {


        public MappingContentEntry(String uri, String localName, String qName) { return null; }

        String _uri;
        String _localName;
        String _qName;
        Map _parsedAttributes;

    }



    public _MappingContentHandler(_WOXMLMappingDecoder mapping) { return null; }

    public _WOXMLMappingDecoder decoder() { return null; }

    protected void addValueToKeyInContainer(Object value, String qName, NSMutableDictionary container) {}

    protected void addValueToXMLTagInContainer(Object attributeValue, String attributeQName, String containerQName, NSMutableDictionary container) {}

    protected void addValueToContents(Object value, String qName, NSMutableDictionary container) {}

    private NSMutableDictionary unmappedTagsContainer(NSMutableDictionary contentsContainer) { return null; }

    public void startElement(String uri, String localName, String qName, Attributes attributes) throws SAXException {}

    public void endElement(String uri, String localName, String qName) throws SAXException {}

    private static int _firstNonWhitespaceCharacter(char ch[], int start, int length) { return null; }

    public void characters(char ch[], int start, int length) {}

    public Object root() { return null; }

    protected int _currentSize;
    protected char _currentChars[];
    protected int _parsedObjectIndex;
    protected String _parsedTags[];
    protected boolean _parsedObjectHadAttributes[];
    protected NSMutableDictionary _contentsContainer[];
    protected int _currentLength;

}

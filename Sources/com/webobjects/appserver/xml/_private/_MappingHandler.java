
package com.webobjects.appserver.xml._private;

import com.webobjects.appserver.xml.WOXMLException;
import com.webobjects.foundation.NSMutableArray;
import com.webobjects.foundation.NSMutableDictionary;
import org.xml.sax.AttributeList;
import org.xml.sax.SAXException;


/**
 * @deprecated Class _MappingHandler is deprecated
 */

class _MappingHandler extends _DecodingHandler {


    public _MappingHandler(_WOXMLMappingDecoder mapping) { return null; }

    public _WOXMLMappingDecoder decoder() { return null; }

    protected void addValueToKeyInContainer(Object value, String name, NSMutableDictionary container) {}

    protected void addValueToXMLTagInContainer(Object value, String xmlTag, String containerTag, NSMutableDictionary container) {}

    protected void addValueToContents(Object value, String xmlTag, NSMutableDictionary container) {}

    private NSMutableDictionary unmappedTagsContainer(NSMutableDictionary contentsContainer) { return null; }

    public void startElement(String name, AttributeList atts) throws SAXException {}

    public void endElement(String xmlTag) throws SAXException {}

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

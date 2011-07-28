
package com.webobjects.appserver.xml._private;

import com.webobjects.appserver.xml.WOXMLDecoder;
import java.util.Stack;
import org.xml.sax.*;


/**
 * @deprecated Class _DecodingHandler is deprecated
 */

public class _DecodingHandler extends HandlerBase {


    public _DecodingHandler(WOXMLDecoder decoder) { return null; }

    public Object root() { return null; }

    public void startElement(String name, AttributeList atts) throws SAXException {}

    public void endElement(String xmlTag) throws SAXException {}

    public void characters(char ch[], int start, int length) {}

    public void reset() {}

    protected final int DEPTH = 100;
    protected WOXMLDecoder _decoder;
    protected Object _parsedObject;
    protected Stack decodeNodeStack;

}

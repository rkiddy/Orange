
package com.webobjects.appserver.parser.woml;

import com.webobjects.foundation.NSLog;
import org.xml.sax.DTDHandler;
import org.xml.sax.SAXException;

public class WOMLDefaultDTDHandler
    implements DTDHandler {

    public WOMLDefaultDTDHandler() { return null; }

    public void notationDecl(String name, String publicId, String systemId) throws SAXException {}

    public void unparsedEntityDecl(String name, String publicId, String systemId, String notationName) throws SAXException {}
}

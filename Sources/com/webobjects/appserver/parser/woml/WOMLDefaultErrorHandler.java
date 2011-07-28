
package com.webobjects.appserver.parser.woml;

import com.webobjects.foundation.NSLog;
import org.xml.sax.*;

public class WOMLDefaultErrorHandler
    implements ErrorHandler {

    public WOMLDefaultErrorHandler() { return null; }

    public void error(SAXParseException exception) throws SAXException {}

    public void fatalError(SAXParseException exception) throws SAXException {}

    public void warning(SAXParseException exception) throws SAXException {}
}

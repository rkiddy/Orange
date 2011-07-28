
package com.webobjects.appserver.parser;

import com.webobjects.appserver.parser.woml.WOMLPosition;

public class WOParserException extends RuntimeException {


    public WOParserException(String message) { return null; }

    public WOParserException(Throwable cause) { return null; }

    public WOParserException(String message, Throwable cause) { return null; }

    public WOParserException(String referenceName, WOMLPosition position, Throwable cause) { return null; }

    public WOParserException(String referenceName, WOMLPosition position, String message, Throwable cause) { return null; }

    public WOParserException(String referenceName, WOMLPosition position) { return null; }

    public WOParserException(String referenceName, WOMLPosition position, String message) { return null; }

    public String getReferenceName() { return null; }

    public WOMLPosition getPosition() { return null; }

    public String toString() { return null; }

    private static final long serialVersionUID = 0xbf0f96dcL;
    private static final String SEP = ": ";
    private String _referenceName;
    private WOMLPosition _position;

}


package com.webobjects.appserver.parser.woml;

import com.webobjects.appserver.*;

public class WOMLComment extends WOElement {


    public WOMLComment(String aString, String commentStartPrefix, String commentEndSuffix) { return null; }

    public boolean isStart() { return true; }

    public boolean isEnd() { return true; }

    public void appendToResponse(WOResponse aResponse, WOContext aContext) {}

    private String _string;
    private boolean _start;
    private boolean _end;

}

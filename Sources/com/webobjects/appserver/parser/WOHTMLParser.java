
package com.webobjects.appserver.parser;

import com.webobjects.appserver.parser.declaration.WODeclarationFormatException;
import com.webobjects.foundation.NSLog;
import com.webobjects.foundation._NSStringUtilities;
import java.util.NoSuchElementException;
import java.util.StringTokenizer;


public class WOHTMLParser {


    public WOHTMLParser(WOHTMLParserDelegate aClient, String string) { return null; }

    public void parseHTML() throws WOHTMLFormatException, WODeclarationFormatException, ClassNotFoundException {}

    private void handleWebObjectTag(String element) throws WODeclarationFormatException, WOHTMLFormatException, ClassNotFoundException {}

    private void startOfWebObjectTag(String element) throws WOHTMLFormatException {}

    private void endOfWebObjectTag(String element) throws WODeclarationFormatException, WOHTMLFormatException, ClassNotFoundException {}

    private void didParseText() {}

    private void didParseOpeningWebObjectTag() throws WOHTMLFormatException {}

    private void didParseClosingWebObjectTag() throws WODeclarationFormatException, WOHTMLFormatException, ClassNotFoundException, ClassNotFoundException {}

    private void didParseComment() {}

    private WOHTMLParserDelegate _client;
    private String _string;
    private StringBuffer _contentText;
    private static final int STATE_OUTSIDE = 0;
    private static final int STATE_INSIDE_COMMENT = 3;
    private static final String JS_START_TAG = "<script";
    private static final String JS_END_TAG = "</script";

}

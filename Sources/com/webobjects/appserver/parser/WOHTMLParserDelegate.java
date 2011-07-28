
package com.webobjects.appserver.parser;

import com.webobjects.appserver.parser.declaration.WODeclarationFormatException;


public interface WOHTMLParserDelegate {

    public abstract void didParseOpeningWebObjectTag(String s, WOHTMLParser wohtmlparser) throws WOHTMLFormatException;

    public abstract void didParseClosingWebObjectTag(String s, WOHTMLParser wohtmlparser) throws WODeclarationFormatException, WOHTMLFormatException, ClassNotFoundException;

    public abstract void didParseComment(String s, WOHTMLParser wohtmlparser);

    public abstract void didParseText(String s, WOHTMLParser wohtmlparser);
}

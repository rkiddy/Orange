package com.webobjects.appserver.parser;
/**
 * Since: 5.4
 */
public interface WOHTMLParserDelegate{
    abstract void didParseClosingWebObjectTag(java.lang.String webobject, com.webobjects.appserver.parser.WOHTMLParser parser) throws com.webobjects.appserver.parser.declaration.WODeclarationFormatException, com.webobjects.appserver.parser.WOHTMLFormatException, java.lang.ClassNotFoundException;

    abstract void didParseComment(java.lang.String comment, com.webobjects.appserver.parser.WOHTMLParser parser);

    abstract void didParseOpeningWebObjectTag(java.lang.String webobject, com.webobjects.appserver.parser.WOHTMLParser parser) throws com.webobjects.appserver.parser.WOHTMLFormatException;

    abstract void didParseText(java.lang.String text, com.webobjects.appserver.parser.WOHTMLParser parser);

}

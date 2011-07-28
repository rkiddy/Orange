
package com.webobjects.appserver.parser;

import com.webobjects.appserver.WOAssociationFactory;
import com.webobjects.appserver.WOElement;
import com.webobjects.appserver._private.WOHTMLCommentString;
import com.webobjects.appserver.parser.declaration.WODeclarationFormatException;
import com.webobjects.appserver.parser.declaration.WODeclarationParser;
import com.webobjects.appserver.parser.woml.WOMLNamespaceProvider;
import com.webobjects.foundation.*;


public class WOBundleComponentTemplateParser extends WOComponentTemplateParser
    implements WOHTMLParserDelegate {


    public WOBundleComponentTemplateParser(String referenceName, String HTMLString, String declarationString, NSArray languages, WOAssociationFactory associationFactory, WOMLNamespaceProvider namespaceProvider) { return null; }

    public void didParseOpeningWebObjectTag(String webobject, WOHTMLParser parser) throws WOHTMLFormatException {}

    public void didParseClosingWebObjectTag(String webobject, WOHTMLParser parser) throws WODeclarationFormatException, WOHTMLFormatException, ClassNotFoundException {}

    public void didParseComment(String comment, WOHTMLParser parser) {}

    public void didParseText(String text, WOHTMLParser parser) {}

    public NSDictionary declarations() throws WODeclarationFormatException { return null; }

    public void setDeclarations(NSDictionary value) {}

    public WOElement parse() throws WODeclarationFormatException, WOHTMLFormatException, ClassNotFoundException { return null; }

    static  {}

    protected WOHTMLWebObjectTag _currentWebObjectTag;
    protected NSDictionary _declarations;

}


package com.webobjects.appserver.parser.woml;

import com.webobjects.appserver.WOAssociationFactory;
import com.webobjects.appserver.WOElement;
import com.webobjects.appserver._private.*;
import com.webobjects.appserver.parser.WOComponentTemplateParser;
import com.webobjects.appserver.parser.WOHTMLFormatException;
import com.webobjects.appserver.parser.declaration.WODeclarationFormatException;
import com.webobjects.appserver.parser.woml.namespaces.WOMLDefaultNamespace;
import com.webobjects.foundation.*;
import java.io.*;
import java.lang.reflect.InvocationTargetException;
import java.net.URL;
import java.util.*;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import javax.xml.parsers.*;
import org.xml.sax.*;
import org.xml.sax.ext.LexicalHandler;


public class WOMLTemplateParser extends WOComponentTemplateParser
    implements ContentHandler, LexicalHandler {


    private static void dumpNode(WOMLNode node, String depthString) { return null; }

    private static void dumpElement(WOElement element, String depthString, boolean asTree) { return null; }

    public static WOElement templateWithString(String referenceName, String templateString, NSArray languages, WOAssociationFactory associationFactory, WOMLNamespaceProvider namespaceProvider) throws WODeclarationFormatException, WOHTMLFormatException, ClassNotFoundException { return null; }

    public static String escapeRegex(String s) { return null; }

    public static boolean isCombinedTemplate(WOComponentDefinition definition) { return null; }

    public WOMLTemplateParser(String referenceName, String HTMLString, String declarationString, NSArray languages, WOAssociationFactory associationFactory, WOMLNamespaceProvider namespaceProvider) { return null; }

    protected String pathForComponentDef(WOComponentDefinition componentDef) { return null; }

    protected WOMLParentNode getCurrentNode() { return null; }

    protected WOMLParentNode popNode() { return null; }

    protected void pushNode(WOMLParentNode node) {}

    protected void escapeInnerData(CharSequence sequence, String prefix, String suffix, StringBuilder buffer) {}

    protected void appendEscapedText(CharSequence sequence, StringBuilder buffer) {}

    protected String preprocess(String templateString) { return null; }

    protected WOElement process(String theTemplateString, String xmlProcessingInstruction, String prefixString) throws WOMLTemplateParserException { return null; }

    protected int getCurrentLineNumber() { return 0; }

    protected int getCurrentColumnNumber() { return 0; }

    protected WOMLPosition getCurrentPosition() { return null; }

    protected void updateStartPosition() {}

    protected void endCurrentTextNode() {}

    protected void addWOElement(WOElement element, List elements) {}

    protected void createWOElements(List nodes, StringBuilder textBuffer, List childElements) {}

    public ErrorHandler getErrorHandler() { return null; }

    public void setErrorHandler(ErrorHandler handler) {}

    public EntityResolver getEntityResolver() { return null; }

    public void setEntityResolver(EntityResolver entityResolver) {}

    public DTDHandler getDTDHandler() { return null; }

    public void setDTDHandler(DTDHandler dtdHandler) {}

    protected String parseUntil(String prefix, StringBuilder buffer, String endToken, boolean includeLeadingWhitespace, boolean includeTrailingWhitespace) { return null; }

    public WOElement parse() throws ClassNotFoundException, WODeclarationFormatException, WOHTMLFormatException { return null; }

    public void setDocumentLocator(Locator locator) {}

    public void startDocument() throws SAXException {}

    public void endDocument() throws SAXException {}

    public void startPrefixMapping(String prefix, String uri) throws SAXException {}

    public void endPrefixMapping(String s) throws SAXException {}

    public void processingInstruction(String target, String data) throws SAXException {}

    public void startElement(String uri, String localName, String qName, Attributes attributes) throws SAXException {}

    public void endElement(String uri, String localName, String qName) throws SAXException {}

    public void characters(char ch[], int start, int length) throws SAXException {}

    public void ignorableWhitespace(char ch[], int start, int length) throws SAXException {}

    public void skippedEntity(String s) throws SAXException {}

    public void comment(char ch[], int start, int length) throws SAXException {}

    public void startCDATA() throws SAXException {}

    public void endCDATA() throws SAXException {}

    public void startDTD(String s, String s1, String s2) throws SAXException {}

    public void endDTD() throws SAXException {}

    public void startEntity(String s) throws SAXException {}

    public void endEntity(String s) throws SAXException {}

    static  {}

    public static String CDATA_EMBED_PREFIX;
    public static String CDATA_EMBED_SUFFIX;
    public static String TEMPLATE_WRAPPER_ELEMENT_NAME;
    public static String TEMPLATE_CANNED_PREFIX;
    public static String TEMPLATE_CANNED_SUFFIX;
    private static final String ENTITY_AMP = "&amp;";
    private static Pattern CDATA_EMBED_START_PATTERN;
    private static Pattern CDATA_EMBED_END_PATTERN;
    private static Pattern CDATA_START_PATTERN;
    private static Pattern CDATA_END_PATTERN;
    private static Pattern COMMENT_END_PATTERN;
    private ErrorHandler errorHandler;
    private EntityResolver entityResolver;
    private DTDHandler dtdHandler;
    private Map uriToNamespace;
    private Map namespaceToUri;
    private Locator locator;
    private int lineNumberAdjust;
    private List nodeStack;
    private WOMLRootNode rootNode;
    private WOMLTextNode currentTextNode;
    private int startLineNumber;
    private int startColumnNumber;

}

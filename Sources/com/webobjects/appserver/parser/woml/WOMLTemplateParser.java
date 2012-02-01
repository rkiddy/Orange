package com.webobjects.appserver.parser.woml;
public class WOMLTemplateParser extends com.webobjects.appserver.parser.WOComponentTemplateParser implements org.xml.sax.ContentHandler, org.xml.sax.ext.LexicalHandler{
    public static java.lang.String CDATA_EMBED_PREFIX;

    public static java.lang.String CDATA_EMBED_SUFFIX;

    public static java.lang.String TEMPLATE_CANNED_PREFIX;

    public static java.lang.String TEMPLATE_CANNED_SUFFIX;

    public static java.lang.String TEMPLATE_WRAPPER_ELEMENT_NAME;

    public WOMLTemplateParser(java.lang.String referenceName, java.lang.String HTMLString, java.lang.String declarationString, com.webobjects.foundation.NSArray languages, com.webobjects.appserver.WOAssociationFactory associationFactory, com.webobjects.appserver.parser.woml.WOMLNamespaceProvider namespaceProvider){
         //TODO codavaj!!
    }

    /**
     * Adds the given WOElement to the list of WOElement objects. If the given element is a bare string and the last element in the list is also a bare string the elements will be combined.
     */
    protected void addWOElement(com.webobjects.appserver.WOElement element, java.util.List elements){
        return; //TODO codavaj!!
    }

    protected void appendEscapedText(java.lang.CharSequence sequence, java.lang.StringBuilder buffer){
        return; //TODO codavaj!!
    }

    public void characters(char[] ch, int start, int length) throws org.xml.sax.SAXException{
        return; //TODO codavaj!!
    }

    public void comment(char[] ch, int start, int length) throws org.xml.sax.SAXException{
        return; //TODO codavaj!!
    }

    /**
     * Creates a list of WOElement objects from a list of WOMLNode objects. The given textBuffer holds the current bare string that was present at the beginning of the element creation.
     */
    protected void createWOElements(java.util.List nodes, java.lang.StringBuilder textBuffer, java.util.List childElements){
        return; //TODO codavaj!!
    }

    public void endCDATA() throws org.xml.sax.SAXException{
        return; //TODO codavaj!!
    }

    protected void endCurrentTextNode(){
        return; //TODO codavaj!!
    }

    public void endDocument() throws org.xml.sax.SAXException{
        return; //TODO codavaj!!
    }

    public void endDTD() throws org.xml.sax.SAXException{
        return; //TODO codavaj!!
    }

    public void endElement(java.lang.String uri, java.lang.String localName, java.lang.String qName) throws org.xml.sax.SAXException{
        return; //TODO codavaj!!
    }

    public void endEntity(java.lang.String name) throws org.xml.sax.SAXException{
        return; //TODO codavaj!!
    }

    public void endPrefixMapping(java.lang.String prefix) throws org.xml.sax.SAXException{
        return; //TODO codavaj!!
    }

    protected void escapeInnerData(java.lang.CharSequence sequence, java.lang.String prefix, java.lang.String suffix, java.lang.StringBuilder buffer){
        return; //TODO codavaj!!
    }

    public static java.lang.String escapeRegex(java.lang.String s){
        return null; //TODO codavaj!!
    }

    protected int getCurrentColumnNumber(){
        return 0; //TODO codavaj!!
    }

    protected int getCurrentLineNumber(){
        return 0; //TODO codavaj!!
    }

    protected com.webobjects.appserver.parser.woml.WOMLParentNode getCurrentNode(){
        return null; //TODO codavaj!!
    }

    protected com.webobjects.appserver.parser.woml.WOMLPosition getCurrentPosition(){
        return null; //TODO codavaj!!
    }

    public org.xml.sax.DTDHandler getDTDHandler(){
        return null; //TODO codavaj!!
    }

    public org.xml.sax.EntityResolver getEntityResolver(){
        return null; //TODO codavaj!!
    }

    public org.xml.sax.ErrorHandler getErrorHandler(){
        return null; //TODO codavaj!!
    }

    public void ignorableWhitespace(char[] ch, int start, int length) throws org.xml.sax.SAXException{
        return; //TODO codavaj!!
    }

    public static boolean isCombinedTemplate(com.webobjects.appserver._private.WOComponentDefinition definition){
        return false; //TODO codavaj!!
    }

    public com.webobjects.appserver.WOElement parse() throws java.lang.ClassNotFoundException, com.webobjects.appserver.parser.declaration.WODeclarationFormatException, com.webobjects.appserver.parser.WOHTMLFormatException{
        return null; //TODO codavaj!!
    }

    /**
     * Parses the current buffer with the given prefix until the given suffix is found. If the prefix is not present then this method returns null and the buffer unmodified. If found characters are consumed into the result until the end token is found. If includeTrailingWhitespace is true this will add any trailing whitespace to the returned token. If includeLeadingWhitespace is specified then leading whitespace will be ignored for matching purposes, but still returned in the return value.
     */
    protected java.lang.String parseUntil(java.lang.String prefix, java.lang.StringBuilder buffer, java.lang.String endToken, boolean includeLeadingWhitespace, boolean includeTrailingWhitespace){
        return null; //TODO codavaj!!
    }

    /**
     * Returns the path string for the component definition given.
     */
    protected java.lang.String pathForComponentDef(com.webobjects.appserver._private.WOComponentDefinition componentDef){
        return null; //TODO codavaj!!
    }

    protected com.webobjects.appserver.parser.woml.WOMLParentNode popNode(){
        return null; //TODO codavaj!!
    }

    /**
     * This is unclean. This splits CDATA and comment sections into bits that have embedded elements. This also translates any non-comment and non-CDATA content ampersands to XML escape sequences (& ->
     * ).
     */
    protected java.lang.String preprocess(java.lang.String templateString){
        return null; //TODO codavaj!!
    }

    protected com.webobjects.appserver.WOElement process(java.lang.String theTemplateString, java.lang.String xmlProcessingInstruction, java.lang.String prefixString) throws com.webobjects.appserver.parser.woml.WOMLTemplateParserException{
        return null; //TODO codavaj!!
    }

    public void processingInstruction(java.lang.String target, java.lang.String data) throws org.xml.sax.SAXException{
        return; //TODO codavaj!!
    }

    protected void pushNode(com.webobjects.appserver.parser.woml.WOMLParentNode node){
        return; //TODO codavaj!!
    }

    public void setDocumentLocator(org.xml.sax.Locator locator){
        return; //TODO codavaj!!
    }

    public void setDTDHandler(org.xml.sax.DTDHandler dtdHandler){
        return; //TODO codavaj!!
    }

    public void setEntityResolver(org.xml.sax.EntityResolver entityResolver){
        return; //TODO codavaj!!
    }

    public void setErrorHandler(org.xml.sax.ErrorHandler handler){
        return; //TODO codavaj!!
    }

    public void skippedEntity(java.lang.String name) throws org.xml.sax.SAXException{
        return; //TODO codavaj!!
    }

    public void startCDATA() throws org.xml.sax.SAXException{
        return; //TODO codavaj!!
    }

    public void startDocument() throws org.xml.sax.SAXException{
        return; //TODO codavaj!!
    }

    public void startDTD(java.lang.String name, java.lang.String publicId, java.lang.String systemId) throws org.xml.sax.SAXException{
        return; //TODO codavaj!!
    }

    public void startElement(java.lang.String uri, java.lang.String localName, java.lang.String qName, org.xml.sax.Attributes attributes) throws org.xml.sax.SAXException{
        return; //TODO codavaj!!
    }

    public void startEntity(java.lang.String name) throws org.xml.sax.SAXException{
        return; //TODO codavaj!!
    }

    public void startPrefixMapping(java.lang.String prefix, java.lang.String uri) throws org.xml.sax.SAXException{
        return; //TODO codavaj!!
    }

    public static com.webobjects.appserver.WOElement templateWithString(java.lang.String referenceName, java.lang.String templateString, com.webobjects.foundation.NSArray languages, com.webobjects.appserver.WOAssociationFactory associationFactory, com.webobjects.appserver.parser.woml.WOMLNamespaceProvider namespaceProvider) throws com.webobjects.appserver.parser.declaration.WODeclarationFormatException, com.webobjects.appserver.parser.WOHTMLFormatException, java.lang.ClassNotFoundException{
        return null; //TODO codavaj!!
    }

    protected void updateStartPosition(){
        return; //TODO codavaj!!
    }

}

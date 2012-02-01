package com.webobjects.appserver.parser;
/**
 * Since: 5.4
 */
public class WOBundleComponentTemplateParser extends com.webobjects.appserver.parser.WOComponentTemplateParser implements com.webobjects.appserver.parser.WOHTMLParserDelegate{
    public WOBundleComponentTemplateParser(java.lang.String referenceName, java.lang.String HTMLString, java.lang.String declarationString, com.webobjects.foundation.NSArray languages, com.webobjects.appserver.WOAssociationFactory associationFactory, com.webobjects.appserver.parser.woml.WOMLNamespaceProvider namespaceProvider){
         //TODO codavaj!!
    }

    public com.webobjects.foundation.NSDictionary declarations() throws com.webobjects.appserver.parser.declaration.WODeclarationFormatException{
        return null; //TODO codavaj!!
    }

    public void didParseClosingWebObjectTag(java.lang.String webobject, com.webobjects.appserver.parser.WOHTMLParser parser) throws com.webobjects.appserver.parser.declaration.WODeclarationFormatException, com.webobjects.appserver.parser.WOHTMLFormatException, java.lang.ClassNotFoundException{
        return; //TODO codavaj!!
    }

    public void didParseComment(java.lang.String comment, com.webobjects.appserver.parser.WOHTMLParser parser){
        return; //TODO codavaj!!
    }

    public void didParseOpeningWebObjectTag(java.lang.String webobject, com.webobjects.appserver.parser.WOHTMLParser parser) throws com.webobjects.appserver.parser.WOHTMLFormatException{
        return; //TODO codavaj!!
    }

    public void didParseText(java.lang.String text, com.webobjects.appserver.parser.WOHTMLParser parser){
        return; //TODO codavaj!!
    }

    public com.webobjects.appserver.WOElement parse() throws com.webobjects.appserver.parser.declaration.WODeclarationFormatException, com.webobjects.appserver.parser.WOHTMLFormatException, java.lang.ClassNotFoundException{
        return null; //TODO codavaj!!
    }

    public void setDeclarations(com.webobjects.foundation.NSDictionary value){
        return; //TODO codavaj!!
    }

}

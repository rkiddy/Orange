
package com.webobjects.appserver.parser;

import com.webobjects.appserver.*;
import com.webobjects.appserver._private.WOProperties;
import com.webobjects.appserver.parser.declaration.WODeclarationFormatException;
import com.webobjects.appserver.parser.woml.WOMLNamespaceProvider;
import com.webobjects.foundation.*;


public abstract class WOComponentTemplateParser {
    public static class Factory {
        public static interface ClassDelegate {

            public abstract Factory newInstance();
        }



        protected Factory() { return null; }

        public static Factory getInstance() { return null; }

        public static boolean hasClassDelegate() { return null; }

        protected static ClassDelegate getClassDelegate() { return null; }

        public static void setClassDelegate(ClassDelegate delegate) { return null; }

        public void setWOHTMLTemplateParserClassName(String className) {}

        public WOComponentTemplateParser newParserWithHTMLAndDeclaration(String frameworkName, String referenceName, String someHTML, String declarations, NSArray languages, WOAssociationFactory associationFactory, WOMLNamespaceProvider namespaceProvider) throws ClassNotFoundException { return null; }

        static  {}

        private static Factory _instance;
        private static ClassDelegate _classDelegate;
        protected Class _WOHTMLParserClass;
        private static final Class _oldParamClass[];
        private static final String _WOHTMLParserBaseProperty = "com.webobjects.appserver.parser.";

    }



    public WOComponentTemplateParser(String referenceName, String HTMLString, String declarationString, NSArray languages, WOAssociationFactory associationFactory, WOMLNamespaceProvider namespaceProvider) { return null; }

    public abstract WOElement parse() throws ClassNotFoundException, WODeclarationFormatException, WOHTMLFormatException;

    public String referenceName() { return null; }

    public String htmlString() { return null; }

    public void setHtmlString(String value) {}

    public String declarationString() { return null; }

    public void setDeclarationString(String value) {}

    public NSArray languages() { return null; }

    public void setLanguages(NSArray languages) {}

    public WOAssociationFactory associationFactory() { return null; }

    public WOMLNamespaceProvider namespaceProvider() { return null; }

    protected boolean shouldThrowException() { return true; }

    public String toString() { return null; }

    public static void setWOHTMLTemplateParserClassName(String className) { return null; }

    /**
     * @deprecated Method templateWithHTMLAndDeclaration is deprecated
     */

    public static WOElement templateWithHTMLAndDeclaration(String someHTML, String declarations, NSArray languages) throws WODeclarationFormatException, WOHTMLFormatException, ClassNotFoundException { return null; }

    /**
     * @deprecated Method templateWithHTMLAndDeclaration is deprecated
     */

    public static WOElement templateWithHTMLAndDeclaration(String referenceName, String someHTML, String declarations, NSArray languages, WOAssociationFactory associationFactory, WOMLNamespaceProvider namespaceProvider) throws WODeclarationFormatException, WOHTMLFormatException, ClassNotFoundException { return null; }

    public static WOElement templateWithHTMLAndDeclaration(String frameworkName, String referenceName, String someHTML, String declarations, NSArray languages, WOAssociationFactory associationFactory, WOMLNamespaceProvider namespaceProvider) throws WODeclarationFormatException, WOHTMLFormatException, ClassNotFoundException { return null; }

    static  {}

    protected String _referenceName;
    protected String _declarationString;
    protected String _HTMLString;
    protected NSArray _languages;
    protected WOAssociationFactory _associationFactory;
    protected WOMLNamespaceProvider _namespaceProvider;

}

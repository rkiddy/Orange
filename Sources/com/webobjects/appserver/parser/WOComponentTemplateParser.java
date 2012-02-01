package com.webobjects.appserver.parser;
/**
 * Used for parsing traditional .wo components. Formerly a private class, moved to com.webobjects.appserver.parser.* as of WebObjects 5.4.
 * Since: 5.4
 */
public abstract class WOComponentTemplateParser{
    public WOComponentTemplateParser(java.lang.String referenceName, java.lang.String HTMLString, java.lang.String declarationString, com.webobjects.foundation.NSArray languages, com.webobjects.appserver.WOAssociationFactory associationFactory, com.webobjects.appserver.parser.woml.WOMLNamespaceProvider namespaceProvider){
         //TODO codavaj!!
    }

    public com.webobjects.appserver.WOAssociationFactory associationFactory(){
        return null; //TODO codavaj!!
    }

    public java.lang.String declarationString(){
        return null; //TODO codavaj!!
    }

    public java.lang.String htmlString(){
        return null; //TODO codavaj!!
    }

    public com.webobjects.foundation.NSArray languages(){
        return null; //TODO codavaj!!
    }

    public com.webobjects.appserver.parser.woml.WOMLNamespaceProvider namespaceProvider(){
        return null; //TODO codavaj!!
    }

    public abstract com.webobjects.appserver.WOElement parse() throws java.lang.ClassNotFoundException, com.webobjects.appserver.parser.declaration.WODeclarationFormatException, com.webobjects.appserver.parser.WOHTMLFormatException;

    public java.lang.String referenceName(){
        return null; //TODO codavaj!!
    }

    public void setDeclarationString(java.lang.String value){
        return; //TODO codavaj!!
    }

    public void setHtmlString(java.lang.String value){
        return; //TODO codavaj!!
    }

    public void setLanguages(com.webobjects.foundation.NSArray languages){
        return; //TODO codavaj!!
    }

    public static void setWOHTMLTemplateParserClassName(java.lang.String className){
        return; //TODO codavaj!!
    }

    protected boolean shouldThrowException(){
        return false; //TODO codavaj!!
    }

    /**
     * Deprecated.
     */
    public static com.webobjects.appserver.WOElement templateWithHTMLAndDeclaration(java.lang.String someHTML, java.lang.String declarations, com.webobjects.foundation.NSArray languages) throws com.webobjects.appserver.parser.declaration.WODeclarationFormatException, com.webobjects.appserver.parser.WOHTMLFormatException, java.lang.ClassNotFoundException{
        return null; //TODO codavaj!!
    }

    /**
     * Deprecated.
     * Creates a new parser and parse the component
     */
    public static com.webobjects.appserver.WOElement templateWithHTMLAndDeclaration(java.lang.String referenceName, java.lang.String someHTML, java.lang.String declarations, com.webobjects.foundation.NSArray languages, com.webobjects.appserver.WOAssociationFactory associationFactory, com.webobjects.appserver.parser.woml.WOMLNamespaceProvider namespaceProvider) throws com.webobjects.appserver.parser.declaration.WODeclarationFormatException, com.webobjects.appserver.parser.WOHTMLFormatException, java.lang.ClassNotFoundException{
        return null; //TODO codavaj!!
    }

    /**
     * Creates a new parser and parse the component
     */
    public static com.webobjects.appserver.WOElement templateWithHTMLAndDeclaration(java.lang.String frameworkName, java.lang.String referenceName, java.lang.String someHTML, java.lang.String declarations, com.webobjects.foundation.NSArray languages, com.webobjects.appserver.WOAssociationFactory associationFactory, com.webobjects.appserver.parser.woml.WOMLNamespaceProvider namespaceProvider) throws com.webobjects.appserver.parser.declaration.WODeclarationFormatException, com.webobjects.appserver.parser.WOHTMLFormatException, java.lang.ClassNotFoundException{
        return null; //TODO codavaj!!
    }

    public java.lang.String toString(){
        return null; //TODO codavaj!!
    }

    /**
     * Factory method for new parser.
     * Since: 5.4
     */
    public static class Factory{
        protected Factory(){
             //TODO codavaj!!
        }

        /**
         * Returns the class delegate.
         */
        protected static com.webobjects.appserver.parser.WOComponentTemplateParser.Factory.ClassDelegate getClassDelegate(){
            return null; //TODO codavaj!!
        }

        /**
         * Returns the singleton, creating the instance if necessary. If the instance need to be created the delegate is given the opportunity before falling back on the class constructor.
         */
        public static com.webobjects.appserver.parser.WOComponentTemplateParser.Factory getInstance(){
            return null; //TODO codavaj!!
        }

        /**
         * Checks if the class has a class delegate.
         */
        public static boolean hasClassDelegate(){
            return false; //TODO codavaj!!
        }

        /**
         * Creates a new instance of the component parser.
         */
        public com.webobjects.appserver.parser.WOComponentTemplateParser newParserWithHTMLAndDeclaration(java.lang.String frameworkName, java.lang.String referenceName, java.lang.String someHTML, java.lang.String declarations, com.webobjects.foundation.NSArray languages, com.webobjects.appserver.WOAssociationFactory associationFactory, com.webobjects.appserver.parser.woml.WOMLNamespaceProvider namespaceProvider) throws java.lang.ClassNotFoundException{
            return null; //TODO codavaj!!
        }

        /**
         * Assigns delegate as the class delegate. The class delegate is optional.
         */
        public static void setClassDelegate(com.webobjects.appserver.parser.WOComponentTemplateParser.Factory.ClassDelegate delegate){
            return; //TODO codavaj!!
        }

        /**
         * Sets the parser class. This must be a subclass of WOComponentTemplateParser.
         */
        public void setWOHTMLTemplateParserClassName(java.lang.String className){
            return; //TODO codavaj!!
        }

        /**
         * This interface defines a delegate to enable subclassing.
         * Since: 5.4
         */
        public static interface ClassDelegate{
            /**
             * Allows the delegate the opportunity to construct and return a different object.
             */
            abstract com.webobjects.appserver.parser.WOComponentTemplateParser.Factory newInstance();

        }
    }
}

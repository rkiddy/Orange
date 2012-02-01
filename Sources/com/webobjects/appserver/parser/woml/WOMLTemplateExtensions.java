package com.webobjects.appserver.parser.woml;
public class WOMLTemplateExtensions{
    public static final java.lang.String DYNAMIC_ATTRIBUTE_PREFIX="[";

    public static final java.lang.String DYNAMIC_ATTRIBUTE_SUFFIX="]";

    /**
     * Usual defaults are html, xhtml, and xml
     */
    public java.util.List combinedTemplateFileExtensions(){
        return null; //TODO codavaj!!
    }

    public java.lang.String dynamicAttributePrefix(){
        return null; //TODO codavaj!!
    }

    public java.lang.String dynamicAttributeSuffix(){
        return null; //TODO codavaj!!
    }

    /**
     * Returns an instance of the WOTemplatePaser subclass. Must be implemented by subclassers.
     */
    public static com.webobjects.appserver.parser.woml.WOMLTemplateExtensions instance(){
        return null; //TODO codavaj!!
    }

    /**
     * Set supported file extensions for combined html components
     */
    public void setCombinedTemplateFileExtensions(java.util.List extensions){
        return; //TODO codavaj!!
    }

    public void setDynamicAttributePrefix(java.lang.String dynamicAttributePrefix){
        return; //TODO codavaj!!
    }

    public void setDynamicAttributeSuffix(java.lang.String dynamicAttributeSuffix){
        return; //TODO codavaj!!
    }

}

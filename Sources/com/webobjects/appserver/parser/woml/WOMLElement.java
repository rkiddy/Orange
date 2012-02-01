package com.webobjects.appserver.parser.woml;
/**
 * Since: 5.4
 */
public class WOMLElement extends com.webobjects.appserver.parser.woml.WOMLNamespaced{
    public WOMLElement(java.lang.String containerReferenceName, com.webobjects.appserver.parser.woml.WOMLElement parent, java.util.Map uriToNamespace, java.lang.String uri, java.lang.String localName, java.lang.String qName, java.util.List attributeList, com.webobjects.appserver.WOAssociationFactory associationFactory){
         //TODO codavaj!!
    }

    public com.webobjects.appserver.parser.woml.WOMLAttributeMap getAttributes(){
        return null; //TODO codavaj!!
    }

    /**
     * Returns the reference name of the container of this element. This is usually the file name of the parsed file.
     */
    public java.lang.String getContainerReferenceName(){
        return null; //TODO codavaj!!
    }

    public com.webobjects.appserver.parser.woml.WOMLElement getParent(){
        return null; //TODO codavaj!!
    }

    public java.util.Map getProperties(){
        return null; //TODO codavaj!!
    }

    public java.lang.Object getProperty(java.lang.String name){
        return null; //TODO codavaj!!
    }

    public boolean hasDynamicAttributes(){
        return false; //TODO codavaj!!
    }

    public boolean hasNamespaces(){
        return false; //TODO codavaj!!
    }

    public void removeProperty(java.lang.String name){
        return; //TODO codavaj!!
    }

    public void setProperty(java.lang.String name, java.lang.Object value){
        return; //TODO codavaj!!
    }

    public java.lang.String toString(){
        return null; //TODO codavaj!!
    }

}

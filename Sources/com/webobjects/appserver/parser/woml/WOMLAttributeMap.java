package com.webobjects.appserver.parser.woml;
public class WOMLAttributeMap{
    public WOMLAttributeMap(java.util.Map attributesByNamespace, java.util.Map associationsByNamespace){
         //TODO codavaj!!
    }

    public boolean containsAttribute(java.lang.String namespace, java.lang.String key){
        return false; //TODO codavaj!!
    }

    public boolean containsAttribute(java.lang.String namespace, java.lang.String key, boolean searchUpward){
        return false; //TODO codavaj!!
    }

    public boolean containsNamespace(java.lang.String namespace){
        return false; //TODO codavaj!!
    }

    public com.webobjects.appserver.WOAssociation getAssociation(java.lang.String namespace, java.lang.String key){
        return null; //TODO codavaj!!
    }

    /**
     * Returns the WOAssociation value for the given key.
     */
    public com.webobjects.appserver.WOAssociation getAssociation(java.lang.String namespace, java.lang.String key, boolean searchUpward){
        return null; //TODO codavaj!!
    }

    public java.util.Map getAssociations(java.lang.String namespace){
        return null; //TODO codavaj!!
    }

    public com.webobjects.appserver.parser.woml.WOMLAttribute getAttribute(java.lang.String namespace, java.lang.String key){
        return null; //TODO codavaj!!
    }

    /**
     * Returns the attribute value for the given key.
     */
    public com.webobjects.appserver.parser.woml.WOMLAttribute getAttribute(java.lang.String namespace, java.lang.String key, boolean searchUpward){
        return null; //TODO codavaj!!
    }

    public java.util.Map getAttributes(java.lang.String namespace){
        return null; //TODO codavaj!!
    }

    /**
     * Returns a collection of the namespaces that are available in this map.
     */
    public java.util.Collection getNamespaces(){
        return null; //TODO codavaj!!
    }

    public void setAssociation(java.lang.String namespace, java.lang.String key, com.webobjects.appserver.WOAssociation value){
        return; //TODO codavaj!!
    }

    public void setAttribute(java.lang.String namespace, java.lang.String key, com.webobjects.appserver.parser.woml.WOMLAttribute value){
        return; //TODO codavaj!!
    }

    public java.lang.String toString(){
        return null; //TODO codavaj!!
    }

}

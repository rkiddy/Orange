
package com.webobjects.appserver.parser.woml;

import com.webobjects.appserver.WOAssociation;
import java.util.*;


public class WOMLAttributeMap {


    public WOMLAttributeMap(Map attributesByNamespace, Map associationsByNamespace) { return null; }

    public Collection getNamespaces() { return null; }

    public boolean containsNamespace(String namespace) { return true; }

    public boolean containsAttribute(String namespace, String key) { return true; }

    public boolean containsAttribute(String namespace, String key, boolean searchUpward) { return true; }

    public WOMLAttribute getAttribute(String namespace, String key) { return null; }

    public WOMLAttribute getAttribute(String namespace, String key, boolean searchUpward) { return null; }

    public void setAttribute(String namespace, String key, WOMLAttribute value) {}

    public Map getAttributes(String namespace) { return null; }

    public Map getAssociations(String namespace) { return null; }

    public WOAssociation getAssociation(String namespace, String key) { return null; }

    public void setAssociation(String namespace, String key, WOAssociation value) {}

    public WOAssociation getAssociation(String namespace, String key, boolean searchUpward) { return null; }

    public String toString() { return null; }

    private Map _attributesByNamespace;
    private Map _associationsByNamespace;

}

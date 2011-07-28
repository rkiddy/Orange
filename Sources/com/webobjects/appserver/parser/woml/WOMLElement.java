
package com.webobjects.appserver.parser.woml;

import com.webobjects.appserver.WOAssociationFactory;
import com.webobjects.appserver.parser.declaration.WODeclarationFormatException;
import com.webobjects.appserver.parser.declaration.WODeclarationParser;
import java.util.*;


public class WOMLElement extends WOMLNamespaced {


    public WOMLElement(String containerReferenceName, WOMLElement parent, Map uriToNamespace, String uri, String localName, String qName, List attributeList, 
            WOAssociationFactory associationFactory) { return null; }

    private void addAttribute(WOMLAttribute attribute) {}

    private void createAttributes(WOAssociationFactory associationFactory) {}

    public String getContainerReferenceName() { return null; }

    public WOMLElement getParent() { return null; }

    public boolean hasNamespaces() { return true; }

    public boolean hasDynamicAttributes() { return true; }

    public WOMLAttributeMap getAttributes() { return null; }

    public Map getProperties() { return null; }

    public Object getProperty(String name) { return null; }

    public void setProperty(String name, Object value) {}

    public void removeProperty(String name) {}

    public String toString() { return null; }

    private String _containerReferenceName;
    private WOMLElement _parent;
    private Map _attributesByNamespace;
    private Map _associationsByNamespace;
    private boolean hasNamespaces;
    private boolean hasDynamicAttributes;
    private WOMLAttributeMap attributes;
    private Map properties;

}

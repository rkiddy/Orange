
package com.webobjects.appserver.parser.woml;

import java.util.*;


public class WOMLDefaultNamespaceProvider
    implements WOMLNamespaceProvider {


    public WOMLDefaultNamespaceProvider() { return null; }

    public boolean containsNamespace(String namespace) { return true; }

    public Map getNamespacesById() { return null; }

    public void setDefaultNamespace(WOMLNamespace value) {}

    public void addNamespace(WOMLNamespace namespace) {}

    public WOMLNamespace getDefaultNamespace() { return null; }

    public WOMLNamespace getNamespace(String namespace) { return null; }

    public String getNamespaceId(WOMLNamespace namespace) { return null; }

    public Collection getNamespaces() { return null; }

    private WOMLNamespace defaultNamespace;
    private Map namespacesById;

}

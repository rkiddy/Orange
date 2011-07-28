
package com.webobjects.appserver.parser.woml;

import java.util.Collection;


public interface WOMLNamespaceProvider {

    public abstract WOMLNamespace getDefaultNamespace();

    public abstract WOMLNamespace getNamespace(String s);

    public abstract Collection getNamespaces();

    public abstract String getNamespaceId(WOMLNamespace womlnamespace);
}

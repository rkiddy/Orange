package com.webobjects.appserver.parser.woml;
public interface WOMLNamespaceProvider{
    /**
     * Returns the default WOMLNamespace for the provider that will be used in the absence of another namespace in the provider that claims a particular declaration. The normal case for this is when the declared element has dynamic attributes that indicate an element should be generated but contains no identifying namespace or attribute that marks is specically (like wo:component). The provider must provide a default namespace. Do not confuse this with the namespace associated with the empty namespace (null).
     */
    abstract com.webobjects.appserver.parser.woml.WOMLNamespace getDefaultNamespace();

    abstract com.webobjects.appserver.parser.woml.WOMLNamespace getNamespace(java.lang.String namespace);

    /**
     * Returns the namespace identifier of the given namespace. If the namespace is not contained in the provider this will throw IllegalArgumentException.
     */
    abstract java.lang.String getNamespaceId(com.webobjects.appserver.parser.woml.WOMLNamespace namespace);

    /**
     * Returns a collection of all namespaces that the provider manages, in the order in which they should be used to contribute to declarations.
     */
    abstract java.util.Collection getNamespaces();

}

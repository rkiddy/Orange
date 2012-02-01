package com.webobjects.appserver.parser.woml;
/**
 * DefaultNamespaceProvider is a Map-based container for namespaces. It maintains a map of namespace id mappings to namespaces in the order in which they were added. The public getNamespacesById() method provides the Map for adding or removing namespaces. The WOMLNamespace.getNamespaces() method returns the collection of WOMLNamespace objects in the order in which they were added.
 */
public class WOMLDefaultNamespaceProvider implements com.webobjects.appserver.parser.woml.WOMLNamespaceProvider{
    public WOMLDefaultNamespaceProvider(){
         //TODO codavaj!!
    }

    public void addNamespace(com.webobjects.appserver.parser.woml.WOMLNamespace namespace){
        return; //TODO codavaj!!
    }

    public boolean containsNamespace(java.lang.String namespace){
        return false; //TODO codavaj!!
    }

    /**
     * Description copied from interface:
     * Returns the default WOMLNamespace for the provider that will be used in the absence of another namespace in the provider that claims a particular declaration. The normal case for this is when the declared element has dynamic attributes that indicate an element should be generated but contains no identifying namespace or attribute that marks is specically (like wo:component). The provider must provide a default namespace. Do not confuse this with the namespace associated with the empty namespace (null).
     */
    public com.webobjects.appserver.parser.woml.WOMLNamespace getDefaultNamespace(){
        return null; //TODO codavaj!!
    }

    public com.webobjects.appserver.parser.woml.WOMLNamespace getNamespace(java.lang.String namespace){
        return null; //TODO codavaj!!
    }

    /**
     * Description copied from interface:
     * Returns the namespace identifier of the given namespace. If the namespace is not contained in the provider this will throw IllegalArgumentException.
     */
    public java.lang.String getNamespaceId(com.webobjects.appserver.parser.woml.WOMLNamespace namespace){
        return null; //TODO codavaj!!
    }

    /**
     * Description copied from interface:
     * Returns a collection of all namespaces that the provider manages, in the order in which they should be used to contribute to declarations.
     */
    public java.util.Collection getNamespaces(){
        return null; //TODO codavaj!!
    }

    public java.util.Map getNamespacesById(){
        return null; //TODO codavaj!!
    }

    public void setDefaultNamespace(com.webobjects.appserver.parser.woml.WOMLNamespace value){
        return; //TODO codavaj!!
    }

}

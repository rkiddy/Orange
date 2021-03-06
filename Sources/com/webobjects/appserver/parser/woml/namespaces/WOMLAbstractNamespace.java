package com.webobjects.appserver.parser.woml.namespaces;
public abstract class WOMLAbstractNamespace implements com.webobjects.appserver.parser.woml.WOMLNamespace{
    public static final java.lang.String ATTRIBUTE_VALUE_CONTENT="$content";

    public static final java.lang.String ATTRIBUTE_VALUE_REMOVE="$remove";

    public static final java.lang.String WOGENERIC_CONTAINER_NAME="WOGenericContainer";

    public static final java.lang.String WOGENERIC_ELEMENT_NAME="WOGenericElement";

    public WOMLAbstractNamespace(java.lang.String namespace){
         //TODO codavaj!!
    }

    /**
     * Default implementation returns true if (a) the element name is in the same namespace as the receiver or (b) it contains the component identifier attribute in the same namespace as the receiver.
     */
    public boolean canGenerateElement(com.webobjects.appserver.parser.woml.WOMLElement element){
        return false; //TODO codavaj!!
    }

    /**
     * Default implementation copies all associations from the defined element that match the namespace of the receiver into the declaration. It then calls the registered element generator to contribute to the declaration.
     */
    public void contributeToDeclaration(com.webobjects.appserver.parser.woml.WOMLElement element, com.webobjects.appserver._private.WOMutableDeclaration declaration, com.webobjects.foundation.NSArray languages, com.webobjects.appserver.WOAssociationFactory associationFactory) throws com.webobjects.appserver.parser.woml.WOMLElementGenerationException{
        return; //TODO codavaj!!
    }

    /**
     * The default implementation will generate a WOElement from the declaration given. If the type of the element (as indicated by the declaration's type()) is one of the special "$remove" or "$content" the appropriate element is returned. Otherwise the element is generated by the WOMLElementGenerator registered with the receiver via setElementGenerator().
     */
    public com.webobjects.appserver.WOElement generateElement(com.webobjects.appserver.parser.woml.WOMLElement element, com.webobjects.appserver.WOElement template, com.webobjects.appserver._private.WOMutableDeclaration declaration, com.webobjects.foundation.NSArray languages, com.webobjects.appserver.WOAssociationFactory associationFactory) throws com.webobjects.appserver.parser.woml.WOMLElementGenerationException{
        return null; //TODO codavaj!!
    }

    /**
     * Returns either the alias for a given element name of the element name itself.
     */
    public java.lang.String getAlias(java.lang.String elementName){
        return null; //TODO codavaj!!
    }

    /**
     * Returns the map of associations that should be contributed by this namespace. Default implementation returns the associations from this namespace identifier from WOMLElement.getAssociations().
     */
    protected java.util.Map getAssociations(com.webobjects.appserver.parser.woml.WOMLElement element, com.webobjects.appserver.WOAssociationFactory associationFactory){
        return null; //TODO codavaj!!
    }

    public abstract java.lang.String getComponentIdentifierAttributeName();

    /**
     * Returns the type of component as determined by either the specified JSP-style tag name or the wo:component specification. The value returned by this method is the actual component or dynamic element name that will be used in the declaration. Any aliases are resolved (i.e. "if" and "else" both become WOConditional).
     */
    public java.lang.String getDeclaredType(com.webobjects.appserver.parser.woml.WOMLElement element){
        return null; //TODO codavaj!!
    }

    public com.webobjects.appserver.parser.woml.namespaces.WOMLAbstractNamespace.WOMLElementGenerator getDefaultElementGenerator(){
        return null; //TODO codavaj!!
    }

    public com.webobjects.appserver.parser.woml.namespaces.WOMLAbstractNamespace.WOMLElementGenerator getElementGenerator(java.lang.String elementName){
        return null; //TODO codavaj!!
    }

    public java.lang.String getGenericElementType(com.webobjects.appserver.WOElement element){
        return null; //TODO codavaj!!
    }

    /**
     * Returns the namespace identifier for this namespace.
     */
    public java.lang.String getNamespaceId(){
        return null; //TODO codavaj!!
    }

    /**
     * Returns the raw component type as determined from the parsed element. This is either the name of the element (for JSP-style specification of tag name) or the component value from the wo:component attribute.
     */
    public java.lang.String getRawComponentType(com.webobjects.appserver.parser.woml.WOMLElement element){
        return null; //TODO codavaj!!
    }

    public java.lang.String setAlias(java.lang.String fromElementName, java.lang.String toElementName){
        return null; //TODO codavaj!!
    }

    public void setDefaultElementGenerator(com.webobjects.appserver.parser.woml.namespaces.WOMLAbstractNamespace.WOMLElementGenerator elementGenerator){
        return; //TODO codavaj!!
    }

    public void setElementGenerator(java.lang.String elementName, com.webobjects.appserver.parser.woml.namespaces.WOMLAbstractNamespace.WOMLElementGenerator elementGenerator){
        return; //TODO codavaj!!
    }

    /**
     * Returns true if the given association with the given name should be contributed to the declaration. The default implementation returns true if the name of the association is not equal to the component identifier attribute for the namespace.
     */
    protected boolean shouldContributeAssociation(com.webobjects.appserver.parser.woml.WOMLElement element, com.webobjects.appserver._private.WOMutableDeclaration declaration, com.webobjects.foundation.NSArray languages, java.lang.String name, com.webobjects.appserver.WOAssociation association){
        return false; //TODO codavaj!!
    }

    public static interface WOMLElementGenerator{
        abstract void contributeToDeclaration(com.webobjects.appserver.parser.woml.namespaces.WOMLAbstractNamespace namespace, com.webobjects.appserver.parser.woml.WOMLElement element, com.webobjects.appserver._private.WOMutableDeclaration declaration, com.webobjects.foundation.NSArray languages, com.webobjects.appserver.WOAssociationFactory associationFactory) throws com.webobjects.appserver.parser.woml.WOMLElementGenerationException;

        abstract com.webobjects.appserver.WOElement generateElement(com.webobjects.appserver.parser.woml.namespaces.WOMLAbstractNamespace namespace, com.webobjects.appserver.parser.woml.WOMLElement element, com.webobjects.appserver.WOElement template, com.webobjects.appserver._private.WOMutableDeclaration declaration, com.webobjects.foundation.NSArray languages, com.webobjects.appserver.WOAssociationFactory associationFactory) throws com.webobjects.appserver.parser.woml.WOMLElementGenerationException;

    }
    public static class WOGenericElementRule{
        public static com.webobjects.appserver.parser.woml.namespaces.WOMLAbstractNamespace.WOGenericElementRule DEFAULT_RULE;

        public static com.webobjects.foundation.NSMutableDictionary RULES;

        public WOGenericElementRule(java.lang.String name, com.webobjects.foundation.NSDictionary ruleDictionary){
             //TODO codavaj!!
        }

        public WOGenericElementRule(java.lang.String name, com.webobjects.appserver.parser.woml.namespaces.WOMLAbstractNamespace.WOGenericElementRule.EndTagPolicy endTagOptionality){
             //TODO codavaj!!
        }

        protected static com.webobjects.appserver.parser.woml.namespaces.WOMLAbstractNamespace.WOGenericElementRule.EndTagPolicy decodeEndTagPolicy(java.lang.Object value, com.webobjects.appserver.parser.woml.namespaces.WOMLAbstractNamespace.WOGenericElementRule.EndTagPolicy defaultValue){
            return null; //TODO codavaj!!
        }

        /**
         * Returns the generic element rule for the given element name. If the rule for the given element does not exist this will return the default rule.
         */
        public static com.webobjects.appserver.parser.woml.namespaces.WOMLAbstractNamespace.WOGenericElementRule getGenericElementRule(java.lang.String elementName){
            return null; //TODO codavaj!!
        }

        /**
         * Returns the generic element rule for the given generic element. If the parameter is not a WOGenericElement this will return the default rule.
         */
        public static com.webobjects.appserver.parser.woml.namespaces.WOMLAbstractNamespace.WOGenericElementRule getGenericElementRule(com.webobjects.appserver.WOElement element){
            return null; //TODO codavaj!!
        }

        /**
         * Returns either WOGenericElement or WOGenericContainer, depending on the state of the input element. A container is returned if the element has children or if the GenericElementRules require an end tag. The returned type is suitable for finding a type declaration via a WODeclaration.
         */
        public java.lang.String getGenericElementType(com.webobjects.appserver.WOElement element){
            return null; //TODO codavaj!!
        }

        /**
         * Returns the name to which this rule is associated.
         */
        public java.lang.String getName(){
            return null; //TODO codavaj!!
        }

        /**
         * Convenience API for getGenericElementType that will return true if the represented elementName and hasChildren should be represented by a container tag (i.e.
         * div
         * /div
         * instead of
         * div/
         */
        public boolean isContainer(java.lang.String elementName, boolean hasChildren){
            return false; //TODO codavaj!!
        }

        /**
         * See Also:Serialized Form
         */
        public static final class EndTagPolicy extends java.lang.Enum{
            public static final com.webobjects.appserver.parser.woml.namespaces.WOMLAbstractNamespace.WOGenericElementRule.EndTagPolicy FORBIDDEN=null;

            public static final com.webobjects.appserver.parser.woml.namespaces.WOMLAbstractNamespace.WOGenericElementRule.EndTagPolicy OPTIONAL=null;

            public static final com.webobjects.appserver.parser.woml.namespaces.WOMLAbstractNamespace.WOGenericElementRule.EndTagPolicy REQUIRED=null;

            public static com.webobjects.appserver.parser.woml.namespaces.WOMLAbstractNamespace.WOGenericElementRule.EndTagPolicy valueOf(java.lang.String name){
                return null; //TODO codavaj!!
            }

            public static final com.webobjects.appserver.parser.woml.namespaces.WOMLAbstractNamespace.WOGenericElementRule.EndTagPolicy[] values(){
                return null; //TODO codavaj!!
            }

        }
    }
}


package com.webobjects.appserver.parser.woml.namespaces;

import com.webobjects.appserver.*;
import com.webobjects.appserver._private.*;
import com.webobjects.appserver.parser.woml.*;
import com.webobjects.foundation.*;
import java.util.*;


public abstract class WOMLAbstractNamespace
    implements WOMLNamespace {
    public static class WOGenericElementRule {
        public static final class EndTagPolicy extends Enum {


            public static final EndTagPolicy[] values() { return null; }

            public static EndTagPolicy valueOf(String name) { return null; }

            private EndTagPolicy(String s, int i) { return null; }

            static  {}

            public static final EndTagPolicy OPTIONAL;
            public static final EndTagPolicy REQUIRED;
            public static final EndTagPolicy FORBIDDEN;
            private static final EndTagPolicy $VALUES[];

        }



        protected static EndTagPolicy decodeEndTagPolicy(Object value, EndTagPolicy defaultValue) { return null; }

        public static WOGenericElementRule getGenericElementRule(WOElement element) { return null; }

        public static WOGenericElementRule getGenericElementRule(String elementName) { return null; }

        public WOGenericElementRule(String name, NSDictionary ruleDictionary) { return null; }

        public WOGenericElementRule(String name, EndTagPolicy endTagOptionality) { return null; }

        public String getName() { return null; }

        public String getGenericElementType(WOElement element) { return null; }

        public boolean isContainer(String elementName, boolean hasChildren) { return true; }

        static  {}

        public static NSMutableDictionary RULES;
        public static WOGenericElementRule DEFAULT_RULE;
        private String name;
        private EndTagPolicy endTagPolicy;

    }

    public static interface WOMLElementGenerator {

        public abstract WOElement generateElement(WOMLAbstractNamespace womlabstractnamespace, WOMLElement womlelement, WOElement woelement, WOMutableDeclaration womutabledeclaration, NSArray nsarray, WOAssociationFactory woassociationfactory) throws WOMLElementGenerationException;

        public abstract void contributeToDeclaration(WOMLAbstractNamespace womlabstractnamespace, WOMLElement womlelement, WOMutableDeclaration womutabledeclaration, NSArray nsarray, WOAssociationFactory woassociationfactory) throws WOMLElementGenerationException;
    }



    public WOMLAbstractNamespace(String namespace) { return null; }

    protected Map getAssociations(WOMLElement element, WOAssociationFactory associationFactory) { return null; }

    protected boolean shouldContributeAssociation(WOMLElement element, WOMutableDeclaration declaration, NSArray languages, String name, WOAssociation association) { return true; }

    public WOMLElementGenerator getElementGenerator(String elementName) { return null; }

    public void setElementGenerator(String elementName, WOMLElementGenerator elementGenerator) {}

    public WOMLElementGenerator getDefaultElementGenerator() { return null; }

    public void setDefaultElementGenerator(WOMLElementGenerator elementGenerator) {}

    public String getAlias(String elementName) { return null; }

    public String setAlias(String fromElementName, String toElementName) { return null; }

    public abstract String getComponentIdentifierAttributeName();

    public String getRawComponentType(WOMLElement element) { return null; }

    private Class classWithName(String className) { return null; }

    public String getDeclaredType(WOMLElement element) { return null; }

    public String getGenericElementType(WOElement element) { return null; }

    public String getNamespaceId() { return null; }

    public boolean canGenerateElement(WOMLElement element) { return true; }

    public WOElement generateElement(WOMLElement element, WOElement template, WOMutableDeclaration declaration, NSArray languages, WOAssociationFactory associationFactory) throws WOMLElementGenerationException { return null; }

    public void contributeToDeclaration(WOMLElement element, WOMutableDeclaration declaration, NSArray languages, WOAssociationFactory associationFactory) throws WOMLElementGenerationException {}

    public static final String ATTRIBUTE_VALUE_REMOVE = "$remove";
    public static final String ATTRIBUTE_VALUE_CONTENT = "$content";
    public static final String WOGENERIC_CONTAINER_NAME = "WOGenericContainer";
    public static final String WOGENERIC_ELEMENT_NAME = "WOGenericElement";
    private String namespaceId;
    private Map aliases;
    private Map elementGenerators;
    private WOMLElementGenerator defaultElementGenerator;
    private Map classForNameCache;
    private Map declaredTypeCache;
    private static final String DECLARED_TYPE_NOT_FOUND = "DeclaredTypeNotFound";

}

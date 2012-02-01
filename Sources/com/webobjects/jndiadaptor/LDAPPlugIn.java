package com.webobjects.jndiadaptor;
/**
 * The LDAPPlugIn class represents a plug-in to the JNDIAdaptor for Lightweight Directory Access Protocol services.
 */
public class LDAPPlugIn extends com.webobjects.jndiadaptor.JNDIPlugIn{
    /**
     * Creates a new instance of LDAPPlugIn.
     * See Also:JNDIPlugIn
     */
    public LDAPPlugIn(){
         //TODO codavaj!!
    }

    /**
     * Description copied from class:
     * Creates a base with the specified fetch specification and entity. The base represents the relative name of a context or object in a search. For a typical fetch-all operation, the base will be the empty string. For fetching a particular row, the base will be the relative distinguished name. See RFC 2253 UTF-8 String Representation of Distinguished Names
     */
    public java.lang.String base(com.webobjects.eocontrol.EOFetchSpecification fetchSpecification, com.webobjects.eoaccess.EOEntity entity){
        return null; //TODO codavaj!!
    }

    /**
     * Creates a version of the specified name that is a valid relative distinguished name. The following special characters are escaped: , ; + = #
     * \
     * See RFC 2253 UTF-8 String Representation of Distinguished Names
     */
    public java.lang.String convertSpecialCharactersForDistinguishedName(java.lang.String name){
        return null; //TODO codavaj!!
    }

    /**
     * Description copied from class:
     * Gets the default JNDI type. The default type is used by EOModeler for reverse engineering in case the external type of an attribute cannot be determined.
     */
    public com.webobjects.jndiadaptor.JNDIType defaultType(){
        return null; //TODO codavaj!!
    }

    /**
     * Description copied from class:
     * Creates a filter with the specified fetch specification and entity. The filter represents the filter expression to use in a search. See RFC 2254 The String Representation of LDAP Search Filters
     */
    public java.lang.String filter(com.webobjects.eocontrol.EOFetchSpecification fetchSpecification, com.webobjects.eoaccess.EOEntity entity){
        return null; //TODO codavaj!!
    }

    /**
     * Gets the JNDI types. EOModeler requires external types, primarily for reverse engineering. The LDAP plug-in defines JNDI types for all LDAP attribute syntaxes. See RFC 2252 Attribute Syntax Definitions
     */
    public com.webobjects.foundation.NSArray jndiTypes(){
        return null; //TODO codavaj!!
    }

    /**
     * Gets the relative distinguished name for a new row. Uses the write format for automatic primary key generation. For example, the following pattern specifies the constant string "cn=" to be followed by the value of the attribute named "cn": cn=
     * cn
     * See RFC 2253 UTF-8 String Representation of Distinguished Names
     */
    public java.lang.String relativeDistinguishedNameForNewRow(com.webobjects.foundation.NSDictionary row, com.webobjects.eoaccess.EOAttribute relativeDistinguishedNameAttribute, java.lang.String currentRelativeDistinguishedNameAttributeValue){
        return null; //TODO codavaj!!
    }

}

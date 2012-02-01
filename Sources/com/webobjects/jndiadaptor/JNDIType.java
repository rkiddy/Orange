package com.webobjects.jndiadaptor;
/**
 * The JNDIType class represents the external type of an EOAttribute.
 */
public interface JNDIType{
    /**
     * Creates an instance of BasicAttribute with the specified id and internal value.
     */
    abstract javax.naming.directory.BasicAttribute createBasicAttribute(java.lang.String id, java.lang.Object internal);

    /**
     * Creates an internal value with the specified instance of Attribute and value type.
     */
    abstract java.lang.Object createInternalValue(javax.naming.directory.Attribute attribute, java.lang.String valueType);

    /**
     * Creates an instance of ModificationItem with the specified id, old external value, and new internal value.
     */
    abstract javax.naming.directory.ModificationItem createModificationItem(java.lang.String id, java.lang.Object oldInternal, java.lang.Object newInternal);

    /**
     * Creates a filter expression with the specified internal value. A filter expression is a string that represents the value of a row within an expression on the server, such as an LDAP search filter. For simple objects, the toString implementation will suffice. See RFC 2254 The String Representation of LDAP Search Filters.
     */
    abstract java.lang.String filterExpression(java.lang.Object internal);

    /**
     * Gets the Java value class name. For example, "java.lang.String".
     */
    abstract java.lang.String javaValueClassName();

    /**
     * Gets the name. The name is a human-readable string that uniquely identifies an attribute type, e.g., "Directory String". See RFC 2252 Attribute Syntax Definitions.
     */
    abstract java.lang.String name();

    /**
     * Gets the Objective-C value class name. For example, "NSString".
     */
    abstract java.lang.String objCValueClassName();

    /**
     * Gets the object identifier. The object identifier is a numeric string that uniquely identifies an attribute type, e.g., "1.3.6.1.4.1.1466.115.121.1.15". See RFC 2252 Attribute Syntax Definitions.
     */
    abstract java.lang.String objectIdentifier();

    /**
     * Gets the value type. For example, "i" for Integer. The empty string indicates the absence of a value type.
     */
    abstract java.lang.String valueType();

}

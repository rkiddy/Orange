package com.webobjects.jndiadaptor;
/**
 * The JNDIPlugIn class represents a plug-in to the JNDIAdaptor.
 */
public abstract class JNDIPlugIn{
    /**
     * The initial value of a primary key for a new row; the empty string.
     * See Also:JNDIPlugIn.relativeDistinguishedNameForNewRow(NSDictionary, EOAttribute, String), EOAdaptorChannel#primaryKeysForNewRowsWithEntity(int, EOEntity), Constant Field Values
     */
    public static final java.lang.String MagicPrimaryKey="";

    /**
     * Creates a new instance of JNDIPlugIn.
     */
    public JNDIPlugIn(){
         //TODO codavaj!!
    }

    /**
     * Creates a base with the specified fetch specification and entity. The base represents the relative name of a context or object in a search. For a typical fetch-all operation, the base will be the empty string. For fetching a particular row, the base will be the relative distinguished name. See RFC 2253 UTF-8 String Representation of Distinguished Names
     */
    public abstract java.lang.String base(com.webobjects.eocontrol.EOFetchSpecification fetchSpecification, com.webobjects.eoaccess.EOEntity entity);

    /**
     * Creates a new instance of InitialDirContext with the specified adaptor.
     */
    public javax.naming.directory.InitialDirContext createInitialDirContext(com.webobjects.jndiadaptor.JNDIAdaptor adaptor){
        return null; //TODO codavaj!!
    }

    /**
     * Gets the default JNDI type. The default type is used by EOModeler for reverse engineering in case the external type of an attribute cannot be determined.
     */
    public abstract com.webobjects.jndiadaptor.JNDIType defaultType();

    /**
     * Creates a filter with the specified fetch specification and entity. The filter represents the filter expression to use in a search. See RFC 2254 The String Representation of LDAP Search Filters
     */
    public abstract java.lang.String filter(com.webobjects.eocontrol.EOFetchSpecification fetchSpecification, com.webobjects.eoaccess.EOEntity entity);

    /**
     * Gets the JNDI types. EOModeler requires external types, primarily for reverse engineering.
     */
    public abstract com.webobjects.foundation.NSArray jndiTypes();

    public java.lang.Object performChannelOperation(com.webobjects.jndiadaptor.JNDIPlugIn.ChannelOperation operation){
        return null; //TODO codavaj!!
    }

    /**
     * Gets the relative distinguished name for a new row. The default implementation returns the current value of the relative distinguished name attribute. In most cases, the current value will be the Magic Primary Key, and the default implementation will not suffice. See RFC 2253 UTF-8 String Representation of Distinguished Names
     */
    public java.lang.String relativeDistinguishedNameForNewRow(com.webobjects.foundation.NSDictionary row, com.webobjects.eoaccess.EOAttribute relativeDistinguishedNameAttribute, java.lang.String currentRelativeDistinguishedNameAttributeValue){
        return null; //TODO codavaj!!
    }

    /**
     * The ChannelOperation interface encapsulates an operation to be performed in the JNDIChannel.
     */
    public static interface ChannelOperation{
        /**
         * Performs an operation in a JNDIChannel. In code that uses the Java Authentication and Authorization Service, one can invoke performOperation on a ChannelOperation from the run method of the class that implements java.security.PrivilegedAction. In the JAAS model, one must write code for the privileged action.
         */
        abstract java.lang.Object performOperation();

    }
}

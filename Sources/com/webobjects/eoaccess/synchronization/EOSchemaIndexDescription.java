
package com.webobjects.eoaccess.synchronization;



public class EOSchemaIndexDescription extends EOSchemaPropertyDescription {


    protected EOSchemaIndexDescription() { return null; }

    public boolean isEmpty() { return true; }

    public String indexType() { return null; }

    protected void setIndexType(String value) {}

    protected void fieldsToString(StringBuilder aLog) {}

    static  {}

    protected String _indexType;
    public static final String EXPLICIT = "EXPLICIT";
    public static final String PRIMARYKEY = "PRIMARY KEY";
    public static final EOSchemaIndexDescription EmptyDescription;

}

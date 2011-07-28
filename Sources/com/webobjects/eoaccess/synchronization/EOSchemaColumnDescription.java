
package com.webobjects.eoaccess.synchronization;



public class EOSchemaColumnDescription extends EOSchemaPropertyDescription {


    protected EOSchemaColumnDescription() { return null; }

    public boolean isEmpty() { return true; }

    public String dataType() { return null; }

    protected void setDataType(String value) {}

    public Object internalDataType() { return null; }

    protected void setInternalDataType(Object value) {}

    public Number width() { return null; }

    protected void setWidth(Number value) {}

    public Number scale() { return null; }

    protected void setScale(Number value) {}

    public Boolean allowsNull() { return null; }

    protected void setAllowsNull(Boolean value) {}

    protected void fieldsToString(StringBuilder aLog) {}

    static  {}

    protected String _dataType;
    protected Object _internalDataType;
    protected Number _width;
    protected Number _scale;
    protected Boolean _allowsNull;
    public static final EOSchemaColumnDescription EmptyDescription;

}


package com.webobjects.eoaccess.synchronization;



public class EOSchemaSynchronizationColumnChanges extends EOSchemaSynchronizationChanges {


    public EOSchemaSynchronizationColumnChanges(String name) { return null; }

    public String name() { return null; }

    public boolean isEmpty() { return true; }

    public String oldName() { return null; }

    public void setOldName(String value) {}

    public boolean isRename() { return true; }

    public boolean isAllowNullDefined() { return true; }

    public void clearAllowNull() {}

    public boolean allowNull() { return true; }

    public void setAllowNull(boolean value) {}

    public boolean isExternalTypeDefined() { return true; }

    public void clearExternalType() {}

    public String defaultExternalType() { return null; }

    public String externalType() { return null; }

    public void setExternalType(String value) {}

    public boolean isPrecisionDefined() { return true; }

    public void clearPrecision() {}

    public Number defaultPrecision() { return null; }

    public int precision() { return 0; }

    public void setPrecision(int value) {}

    public boolean isWidthDefined() { return true; }

    public void clearWidth() {}

    public Number defaultWidth() { return null; }

    public int width() { return 0; }

    public void setWidth(int value) {}

    public boolean isScaleDefined() { return true; }

    public void clearScale() {}

    public Number defaultScale() { return null; }

    public int scale() { return 0; }

    public void setScale(int scale) {}

    public EOSchemaSynchronizationColumnChanges clone() { return null; }

    public void fieldsToString(StringBuilder aLog) {}

    public volatile Object clone() throws CloneNotSupportedException { return null; }

    protected String _name;
    protected String _oldName;
    protected String _externalType;
    protected Boolean _allowNull;
    protected Number _precision;
    protected Number _scale;
    protected Number _width;

}

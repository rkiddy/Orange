
package com.webobjects.eodistribution.client;

import com.webobjects.foundation.*;

public class EORelationship
    implements NSCoding {


    public EORelationship() { return null; }

    public Class classForCoder() { return null; }

    public static Object decodeObject(NSCoder coder) { return null; }

    public void encodeWithCoder(NSCoder coder) {}

    public String name() { return null; }

    public String destinationName() { return null; }

    public String inverseName() { return null; }

    public int deleteRule() { return 0; }

    public boolean ownsDestination() { return true; }

    public boolean propagatesPrimaryKey() { return true; }

    public boolean isMandatory() { return true; }

    public boolean isToMany() { return true; }

    void setIsToMany(boolean in) { return null; }

    void setIsMandatory(boolean in) { return null; }

    public String toString() { return null; }

    public Object validateValue(Object value) throws com.webobjects.foundation.NSValidation.ValidationException { return null; }

    Object deferredFault() { return null; }

    void setDeferredFault(Object fault) { return null; }

    static  {}

    public static final Class _CLASS;
    private String _name;
    private int _deleteRule;
    private boolean _ownsDestination;
    private boolean _propagatePrimaryKey;
    private boolean _isMandatory;
    private boolean _isToMany;
    private String _destinationName;
    private String _inverseName;
    private Object _deferredFault;

}

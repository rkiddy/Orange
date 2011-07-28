
package com.webobjects.eoaccess.synchronization;

import com.webobjects.foundation.NSKeyValueCoding;
import com.webobjects.foundation.NSKeyValueCodingAdditions;

public abstract class EOSchemaPropertyDescription
    implements NSKeyValueCodingAdditions {


    protected EOSchemaPropertyDescription() { return null; }

    public abstract boolean isEmpty();

    public String name() { return null; }

    protected void setName(String value) {}

    public Object valueForKey(String key) { return null; }

    public void takeValueForKey(Object value, String key) {}

    public Object valueForKeyPath(String key) { return null; }

    public void takeValueForKeyPath(Object value, String key) {}

    public String toString() { return null; }

    protected void fieldsToString(StringBuilder aLog) {}

    protected String _name;

}

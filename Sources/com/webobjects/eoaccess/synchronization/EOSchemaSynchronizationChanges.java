
package com.webobjects.eoaccess.synchronization;

import com.webobjects.foundation.NSKeyValueCoding;
import com.webobjects.foundation.NSKeyValueCodingAdditions;

public abstract class EOSchemaSynchronizationChanges
    implements NSKeyValueCodingAdditions {

    public EOSchemaSynchronizationChanges() { return null; }

    public abstract boolean isEmpty();

    public Object valueForKey(String key) { return null; }

    public void takeValueForKey(Object value, String key) {}

    public Object valueForKeyPath(String key) { return null; }

    public void takeValueForKeyPath(Object value, String key) {}

    public String toString() { return null; }

    public void fieldsToString(StringBuilder stringbuilder) {}
}

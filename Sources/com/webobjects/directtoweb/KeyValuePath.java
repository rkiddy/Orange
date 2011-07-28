
package com.webobjects.directtoweb;

import com.webobjects.eoaccess.EOEntity;
import com.webobjects.eoaccess.EORelationship;
import com.webobjects.foundation.NSKeyValueCoding;
import com.webobjects.foundation.NSKeyValueCodingAdditions;

public class KeyValuePath {

    public KeyValuePath() { return null; }

    public static final Object valueForKeyPathOnObject(String keyPath, Object object) { return null; }

    public static final void takeValueForKeyPathOnObject(Object value, String keyPath, Object object) { return null; }

    static final String car(String keyPath, int firstDot) { return null; }

    static final String cdr(String keyPath, int firstDot) { return null; }

    public static final String lastPropertyKeyInKeyPath(String keyPath) { return null; }

    public static final String keyPathWithoutLastProperty(String keyPath) { return null; }

    public static final String keyPathPortionNotInModel(String keyPath, String keyPathPortionInModel) { return null; }

    public static final String keyPathPortionInModel(String keyPath, EOEntity startingEntity) { return null; }

    public static final EOEntity entityAtEndOfKeyPath(String keyPath, EOEntity startingEntity) { return null; }

    public static final Object valueForKeyOnObject(String key, Object o) { return null; }
}


package com.webobjects.foundation;

import java.io.*;
import java.util.Enumeration;


public class _NSThreadsafeMutableDictionary extends _NSThreadsafeWrapper
    implements Serializable, NSKeyValueCoding {


    public _NSThreadsafeMutableDictionary(NSMutableDictionary dict) { return null; }

    public NSMutableDictionary _mthdelegate() { return null; }

    public Object clone() { return null; }

    public int count() { return 0; }

    public Object objectForKey(Object key) { return null; }

    public void setObjectForKey(Object object, Object key) {}

    public Object removeObjectForKey(Object key) { return null; }

    public void removeAllObjects() {}

    public NSDictionary immutableClone() { return null; }

    public NSMutableDictionary mutableClone() { return null; }

    public Object valueForKey(String key) { return null; }

    public Enumeration keyEnumerator() { return null; }

    public Enumeration objectEnumerator() { return null; }

    public void takeValueForKey(Object value, String key) {}

    public NSArray allKeys() { return null; }

    public NSArray allValues() { return null; }

    private void writeObject(ObjectOutputStream s) throws IOException {}

    private void readObject(ObjectInputStream s) throws IOException, ClassNotFoundException {}

    private Object readResolve() throws ObjectStreamException { return null; }

    static  {}

    public static final Class _CLASS;
    static final long serialVersionUID = 0xd4beb131L;
    private static final String SerializationDictionaryFieldKey = "dictionary";
    private static final Class _NSMutableDictionaryClass;
    private final NSMutableDictionary _delegate;
    private NSMutableDictionary _serializationDelegate;
    private static final ObjectStreamField serialPersistentFields[];

}


package com.webobjects.foundation;

import java.io.*;
import java.lang.ref.Reference;
import java.lang.ref.WeakReference;
import java.util.*;


public class _NSWeakValueMutableDictionary extends _NSWeakMutableCollection
    implements Serializable {


    public _NSWeakValueMutableDictionary() { return null; }

    public _NSWeakValueMutableDictionary(int capacity) { return null; }

    public NSArray allKeys() { return null; }

    public NSArray allValues() { return null; }

    public NSArray allObjects() { return null; }

    public int count() { return 0; }

    public Object[] objects() { return null; }

    public Enumeration keyEnumerator() { return null; }

    public Enumeration objectEnumerator() { return null; }

    public Enumeration referenceEnumerator() { return null; }

    public void setObjectForKey(Object object, Object key) {}

    public Object removeObjectForKey(Object key) { return null; }

    public void removeAllObjects() {}

    public Object objectForKey(Object key) { return null; }

    public WeakReference referenceForKey(Object key) { return null; }

    public void addObject(Object anObject) {}

    public void addReference(WeakReference anObject) {}

    public void removeObject(Object object) {}

    public void removeReference(Object object) {}

    protected void __removeReference(Reference object) {}

    public String toString() { return null; }

    private void writeObject(ObjectOutputStream s) throws IOException {}

    private void readObject(ObjectInputStream s) throws IOException, ClassNotFoundException {}

    static  {}

    public static final Class _CLASS;
    static final long serialVersionUID = 0x7c5ab3afL;
    private static final String SerializationKeysFieldKey = "keys";
    private static final String SerializationValuesFieldKey = "objects";
    NSMutableDictionary dictionary;
    private static final ObjectStreamField serialPersistentFields[];

}

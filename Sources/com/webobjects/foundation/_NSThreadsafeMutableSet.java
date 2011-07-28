
package com.webobjects.foundation;

import java.io.*;
import java.util.Enumeration;


public class _NSThreadsafeMutableSet extends _NSThreadsafeWrapper
    implements Serializable {


    public _NSThreadsafeMutableSet(NSMutableSet set) { return null; }

    public NSMutableSet _mthdelegate() { return null; }

    public Object clone() { return null; }

    public Enumeration objectEnumerator() { return null; }

    public int count() { return 0; }

    public Object member(Object value) { return null; }

    public void addObject(Object value) {}

    public void addObjectsFromArray(NSArray array) {}

    public Object removeObject(Object value) { return null; }

    public void removeAllObjects() {}

    public NSSet immutableClone() { return null; }

    public NSMutableSet mutableClone() { return null; }

    public NSArray allObjects() { return null; }

    private void writeObject(ObjectOutputStream s) throws IOException {}

    private void readObject(ObjectInputStream s) throws IOException, ClassNotFoundException {}

    private Object readResolve() throws ObjectStreamException { return null; }

    static  {}

    public static final Class _CLASS;
    static final long serialVersionUID = 0x3fa763aaL;
    private static final String SerializationSetFieldKey = "set";
    private static final Class _NSMutableSetClass;
    private final NSMutableSet _delegate;
    private NSMutableSet _serializationDelegate;
    private static final ObjectStreamField serialPersistentFields[];

}

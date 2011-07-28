
package com.webobjects.foundation;

import java.io.*;
import java.util.Enumeration;


public class _NSThreadsafeMutableArray extends _NSThreadsafeWrapper
    implements Serializable, NSKeyValueCoding {


    public _NSThreadsafeMutableArray(NSMutableArray array) { return null; }

    public NSMutableArray array() { return null; }

    public Enumeration objectEnumerator() { return null; }

    public String componentsJoinedByString(String separator) { return null; }

    public NSArray immutableClone() { return null; }

    public Object clone() { return null; }

    public int count() { return 0; }

    public Object objectAtIndex(int index) { return null; }

    public void addObject(Object object) {}

    public void addObjectIfAbsent(Object object) {}

    public boolean containsObject(Object object) { return true; }

    public void removeObject(Object object) {}

    public Object valueForKey(String key) { return null; }

    public void takeValueForKey(Object value, String key) {}

    private void writeObject(ObjectOutputStream s) throws IOException {}

    private void readObject(ObjectInputStream s) throws IOException, ClassNotFoundException {}

    private Object readResolve() throws ObjectStreamException { return null; }

    static  {}

    public static final Class _CLASS;
    static final long serialVersionUID = 0x191587f1L;
    private static final String SerializationArrayFieldKey = "array";
    private static final Class _NSMutableArrayClass;
    private final NSMutableArray _delegate;
    private NSMutableArray _serializationDelegate;
    private static final ObjectStreamField serialPersistentFields[];

}

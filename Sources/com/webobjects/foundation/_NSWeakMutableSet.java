
package com.webobjects.foundation;

import java.io.*;
import java.lang.ref.Reference;
import java.lang.ref.WeakReference;
import java.util.*;


public class _NSWeakMutableSet extends _NSWeakMutableCollection
    implements Serializable {


    public _NSWeakMutableSet() { return null; }

    public _NSWeakMutableSet(int capacity) { return null; }

    public NSArray allObjects() { return null; }

    public int count() { return 0; }

    public Object[] objects() { return null; }

    public Enumeration objectEnumerator() { return null; }

    public Enumeration referenceEnumerator() { return null; }

    public void addObject(Object object) {}

    public void addReference(WeakReference object) {}

    public void removeObject(Object object) {}

    public void removeReference(Object object) {}

    protected void __removeReference(Reference object) {}

    protected void removeReferencesWithReferent(Object object) {}

    public void removeAllObjects() {}

    public String toString() { return null; }

    private void writeObject(ObjectOutputStream s) throws IOException {}

    private void readObject(ObjectInputStream s) throws IOException, ClassNotFoundException {}

    static  {}

    public static final Class _CLASS;
    static final long serialVersionUID = 0x3d5dff1dL;
    private static final String SerializationKeysFieldKey = "objects";
    private NSMutableSet set;
    private static final ObjectStreamField serialPersistentFields[];

}

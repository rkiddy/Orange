
package com.webobjects.foundation;

import java.io.*;


public class _NSIntegerKeyDictionary
    implements Cloneable, Serializable, _NSFoundationCollection {


    protected void _initializeDictionary() {}

    protected void _ensureCapacity(int capacity) {}

    public _NSIntegerKeyDictionary() { return null; }

    public _NSIntegerKeyDictionary(Object value, int key) { return null; }

    private void initFromIntegers(Object values[], int keys[], boolean checkForNull) {}

    private _NSIntegerKeyDictionary(Object values[], int keys[], boolean checkForNull) { return null; }

    public _NSIntegerKeyDictionary(Object values[], int keys[]) { return null; }

    public _NSIntegerKeyDictionary(_NSIntegerKeyDictionary otherIntegerKeyDictionary) { return null; }

    protected int[] keysNoCopy() { return null; }

    protected Object[] objectsNoCopy() { return null; }

    public int count() { return 0; }

    public Object objectForKey(int key) { return null; }

    public int[] allKeys() { return null; }

    public NSArray allObjects() { return null; }

    public int[] allKeysForObject(Object value) { return null; }

    public NSArray objectsForKeys(int keys[]) { return null; }

    private boolean _equalsIntegerKeyDictionary(_NSIntegerKeyDictionary otherIntegerKeyDictionary) { return true; }

    public boolean isEqualToIntegerKeyDictionary(_NSIntegerKeyDictionary otherIntegerKeyDictionary) { return true; }

    public boolean equals(Object object) { return true; }

    public int _shallowHashCode() { return 0; }

    public int hashCode() { return 0; }

    public Object clone() { return null; }

    public String toString() { return null; }

    private void writeObject(ObjectOutputStream s) throws IOException {}

    private void readObject(ObjectInputStream s) throws IOException, ClassNotFoundException {}

    static  {}

    public static final Class _CLASS;
    static final long serialVersionUID = 0xe66b08e2L;
    private static final String SerializationKeysFieldKey = "keys";
    private static final String SerializationValuesFieldKey = "objects";
    protected transient int _capacity;
    protected transient int _hashtableBuckets;
    protected transient int _count;
    protected Object _values[];
    protected transient Object _valuesCache[];
    protected transient byte _flags[];
    protected int _keys[];
    protected transient int _keysCache[];
    protected transient int _hashCache;
    protected static int _NSDictionaryClassHashCode;
    private static final ObjectStreamField serialPersistentFields[];

}

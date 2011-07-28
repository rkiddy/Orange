
package com.webobjects.foundation;

import java.io.*;
import java.util.Enumeration;


public class _NSIntegerDictionary
    implements Cloneable, Serializable, _NSFoundationCollection {


    protected void _initializeDictionary() {}

    protected void _ensureCapacity(int capacity) {}

    public _NSIntegerDictionary() { return null; }

    public _NSIntegerDictionary(int value, Object key) { return null; }

    private void initFromIntegers(int values[], Object keys[], boolean checkForNull) {}

    private _NSIntegerDictionary(int values[], Object keys[], boolean checkForNull) { return null; }

    public _NSIntegerDictionary(int values[], Object keys[]) { return null; }

    public _NSIntegerDictionary(_NSIntegerDictionary otherIntegerDictionary) { return null; }

    protected Object[] keysNoCopy() { return null; }

    protected int[] integersNoCopy() { return null; }

    public int count() { return 0; }

    public int integerForKey(Object key) { return 0; }

    public NSArray allKeys() { return null; }

    public int[] allIntegers() { return null; }

    public Enumeration keyEnumerator() { return null; }

    public NSArray allKeysForInteger(int value) { return null; }

    public int[] integersForKeys(NSArray keys) { return null; }

    private boolean _equalsIntegerDictionary(_NSIntegerDictionary otherIntegerDictionary) { return true; }

    public boolean isEqualToIntegerDictionary(_NSIntegerDictionary otherIntegerDictionary) { return true; }

    public boolean equals(Object object) { return true; }

    public int _shallowHashCode() { return 0; }

    public int hashCode() { return 0; }

    public Object clone() { return null; }

    public String toString() { return null; }

    private void writeObject(ObjectOutputStream s) throws IOException {}

    private void readObject(ObjectInputStream s) throws IOException, ClassNotFoundException {}

    static  {}

    public static final Class _CLASS;
    public static final int NotAvailable = 0x80000000;
    static final long serialVersionUID = 0xf4f4f56fL;
    private static final String SerializationKeysFieldKey = "keys";
    private static final String SerializationValuesFieldKey = "integers";
    protected transient int _capacity;
    protected transient int _hashtableBuckets;
    protected transient int _count;
    protected int _values[];
    protected transient int _valuesCache[];
    protected transient byte _flags[];
    protected Object _keys[];
    protected transient Object _keysCache[];
    protected transient int _hashCache;
    protected static int _NSDictionaryClassHashCode;
    private static final ObjectStreamField serialPersistentFields[];

}

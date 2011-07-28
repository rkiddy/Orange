
package com.webobjects.eocontrol;

import com.webobjects.foundation.*;
import java.io.*;
import java.util.Enumeration;


public class _EOMutableKnownKeyDictionary extends NSMutableDictionary {
    public static class Initializer
        implements Serializable {
        public static class _LazyGenericRecordBinding extends _GenericRecordBinding {

            public _LazyGenericRecordBinding(Initializer initializer, int index, String key) { return null; }

            public _LazyGenericRecordBinding(Initializer initializer, int index, String key, Class enforcedNumberOrBooleanClass) { return null; }

            public Object valueInObject(Object object) { return null; }
        }

        public static class _GenericRecordBinding extends _FastAccessBinding {


            public _GenericRecordBinding(Initializer initializer, int index, String key) { return null; }

            public _GenericRecordBinding(Initializer initializer, int index, String key, Class enforcedNumberOrBooleanClass) { return null; }

            public Object valueInObject(Object object) { return null; }

            public void setValueInObject(Object value, Object object) {}

            private Class _enforcedNumberOrBooleanClass;

        }

        public static class _FastAccessBinding extends com.webobjects.foundation.NSKeyValueCoding._KeyBinding {


            public _FastAccessBinding(Initializer initializer, int index, String key) { return null; }

            public Object valueInObject(Object object) { return null; }

            public void setValueInObject(Object value, Object object) {}

            public String toString() { return null; }

            protected Initializer _bindingInitializer;
            protected int _bindingIndex;

        }



        public Initializer(NSArray keyArray) { return null; }

        private void initFromKeyArray(Object keys[]) {}

        private void writeObject(ObjectOutputStream s) throws IOException {}

        private void readObject(ObjectInputStream s) throws IOException, ClassNotFoundException {}

        public int count() { return 0; }

        public Object[] keys() { return null; }

        public SubsetMapping subsetMappingForInitializer(Initializer otherInitializer) { return null; }

        public SubsetMapping subsetMappingForInitializer(Initializer other, NSArray sourceKeys, NSArray destinationKeys) { return null; }

        public int indexForKey(Object key) { return 0; }

        public Object objectForIndex(int index, NSDictionary dictionary) { return null; }

        public void setObjectForIndex(Object object, int index, NSMutableDictionary dictionary) {}

        public com.webobjects.foundation.NSKeyValueCoding._KeyBinding _createKeyBindingForKey(String key) { return null; }

        public com.webobjects.foundation.NSKeyValueCoding._KeyBinding _genericRecordKeyBindingForKey(String key, boolean lazyBindingNeeded, Class enforcedNumberOrBooleanClass) { return null; }

        static  {}

        static final long serialVersionUID = 0x6f403f58L;
        transient _NSMutableIntegerDictionary _keyToIndexMapTable;
        transient int _count;
        Object _keys[];
        transient com.webobjects.foundation.NSKeyValueCoding._KeyBinding _fastAccessBindings[];
        transient com.webobjects.foundation.NSKeyValueCoding._KeyBinding _genericRecordKeyBindings[];
        transient com.webobjects.foundation.NSKeyValueCoding._KeyBinding _lazyGenericRecordKeyBindings[];
        private static final String SerializationKeysFieldKey = "knownKeys";
        private static final ObjectStreamField serialPersistentFields[];

    }

    public static class SubsetMapping
        implements Serializable {


        public SubsetMapping(int count, Initializer sourceDescription, Initializer destinationDescription) { return null; }

        static final long serialVersionUID = 0x2d71ab4L;
        Initializer _sourceDescription;
        Initializer _destinationDescription;
        int _sourceOffsetForDestinationOffset[];

    }



    private int _countNumberOfNullValues() { return 0; }

    public _EOMutableKnownKeyDictionary(Initializer initializer) { return null; }

    public _EOMutableKnownKeyDictionary(Initializer initializer, Object objects[]) { return null; }

    public _EOMutableKnownKeyDictionary(Initializer initializer, Object objects[], boolean copy) { return null; }

    public _EOMutableKnownKeyDictionary(NSDictionary otherDictionary, SubsetMapping mapping) { return null; }

    private Object[] _extraKeysNoCopy() { return null; }

    private Object[] _extraObjectsNoCopy() { return null; }

    protected Object[] keysNoCopy() { return null; }

    protected Object[] objectsNoCopy() { return null; }

    public int count() { return 0; }

    Object _objectForIndex(int index) { return null; }

    public Object objectForKey(Object key) { return null; }

    public Enumeration keyEnumerator() { return null; }

    public Enumeration objectEnumerator() { return null; }

    void _setObjectForIndex(Object object, int index) { return null; }

    public void setObjectForKey(Object object, Object key) {}

    public Object removeObjectForKey(Object key) { return null; }

    public void removeAllObjects() {}

    private void _addEntriesFromMKKD(_EOMutableKnownKeyDictionary mutableKnownKeyDictionary) {}

    public void addEntriesFromDictionary(NSDictionary otherDictionary) {}

    public boolean containsObjectsNotIdenticalTo(Object object) { return true; }

    public Initializer initializer() { return null; }

    public Object clone() { return null; }

    public NSDictionary immutableClone() { return null; }

    public NSMutableDictionary mutableClone() { return null; }

    static  {}

    public static final Class _CLASS;
    static final long serialVersionUID = 0xc02f4a85L;
    protected Initializer _initializer;
    protected Object _values[];
    protected int _numberOfNullValues;
    protected boolean _hasExtras;

}

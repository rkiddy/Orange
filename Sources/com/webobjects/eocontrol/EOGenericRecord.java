
package com.webobjects.eocontrol;

import com.webobjects.foundation.*;
import java.io.*;


public class EOGenericRecord extends EOCustomObject {
    public static class _LazyDictionaryBinding extends _DictionaryBinding {

        public _LazyDictionaryBinding(String key) { return null; }

        public _LazyDictionaryBinding(String key, Class enforcedNumberOrBooleanClass) { return null; }

        public Object valueInObject(Object object) { return null; }
    }

    public static class _DictionaryBinding extends com.webobjects.foundation.NSKeyValueCoding._KeyBinding {


        public _DictionaryBinding(String key) { return null; }

        public _DictionaryBinding(String key, Class enforcedNumberOrBooleanClass) { return null; }

        public Object valueInObject(Object object) { return null; }

        public void setValueInObject(Object value, Object object) {}

        private Class _enforcedNumberOrBooleanClass;

    }



    /**
     * @deprecated Method EOGenericRecord is deprecated
     */

    public EOGenericRecord(EOEditingContext editingContext, EOClassDescription classDescription, EOGlobalID gid) { return null; }

    public EOGenericRecord(EOClassDescription classDescription) { return null; }

    public EOGenericRecord() { return null; }

    public static boolean usesDeferredFaultCreation() { return null; }

    private void __setClassDescription() {}

    public final void __setClassDescription(EOClassDescription classDescription) { return null; }

    public EOClassDescription classDescription() { return null; }

    public com.webobjects.foundation.NSKeyValueCoding._KeyBinding _otherStorageBinding(String key) { return null; }

    public com.webobjects.foundation.NSKeyValueCoding._KeyBinding _keyGetBindingForKey(String key) { return null; }

    public com.webobjects.foundation.NSKeyValueCoding._KeyBinding _keySetBindingForKey(String key) { return null; }

    public com.webobjects.foundation.NSKeyValueCoding._KeyBinding _storedKeyGetBindingForKey(String key) { return null; }

    public com.webobjects.foundation.NSKeyValueCoding._KeyBinding _storedKeySetBindingForKey(String key) { return null; }

    private void writeObject(ObjectOutputStream out) throws IOException {}

    private void readObject(ObjectInputStream in) throws IOException, ClassNotFoundException {}

    static  {}

    public static final Class _CLASS;
    static final long serialVersionUID = 0x4b8f5235L;
    transient NSMutableDictionary __dictionary;
    private static final String SerializationClassDescriptionFieldKey = "classDescription";
    private static final ObjectStreamField serialPersistentFields[];

}

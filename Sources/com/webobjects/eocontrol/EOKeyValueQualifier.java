
package com.webobjects.eocontrol;

import com.webobjects.foundation.*;
import java.io.*;
import java.math.BigDecimal;


public class EOKeyValueQualifier extends EOQualifier
    implements NSCoding, EOKeyValueArchiving {


    public EOKeyValueQualifier(String key, NSSelector selector, Object value) { return null; }

    public boolean equals(Object other) { return true; }

    public boolean evaluateWithObject(Object object) { return true; }

    public String key() { return null; }

    public Object value() { return null; }

    public NSSelector selector() { return null; }

    public String toString() { return null; }

    public void validateKeysWithRootClassDescription(EOClassDescription classDesc) {}

    public EOQualifier qualifierWithBindings(NSDictionary bindings, boolean requiresAll) { return null; }

    void _addBindingsToDictionary(NSMutableDictionary dict) { return null; }

    public void addQualifierKeysToSet(NSMutableSet qualKeys) {}

    public Class classForCoder() { return null; }

    public static Object decodeObject(NSCoder coder) { return null; }

    public void encodeWithCoder(NSCoder coder) {}

    public void encodeWithKeyValueArchiver(EOKeyValueArchiver archiver) {}

    public static Object decodeWithKeyValueUnarchiver(EOKeyValueUnarchiver unarchiver) { return null; }

    private void writeObject(ObjectOutputStream s) throws IOException {}

    private void readObject(ObjectInputStream s) throws IOException, ClassNotFoundException {}

    public void _accept(EOQualifierVisitor visitor, boolean isPostOrder) {}

    static  {}

    public static final Class _CLASS;
    static final long serialVersionUID = 0xf9a34ce4L;
    private static final String SerializationKeyFieldKey = "key";
    private static final String SerializationSelectorNameFieldKey = "selectorName";
    private static final String SerializationValueFieldKey = "value";
    protected NSSelector _selector;
    protected String _key;
    protected Object _value;
    protected transient String _lowercaseCache;
    private static final ObjectStreamField serialPersistentFields[];

}

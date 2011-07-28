
package com.webobjects.eocontrol;

import com.webobjects.foundation.*;
import java.io.*;


public class EOKeyComparisonQualifier extends EOQualifier
    implements NSCoding, EOKeyValueArchiving {


    public EOKeyComparisonQualifier(String leftKey, NSSelector selector, String rightKey) { return null; }

    public boolean equals(Object other) { return true; }

    public boolean evaluateWithObject(Object object) { return true; }

    public String leftKey() { return null; }

    public NSSelector selector() { return null; }

    public String rightKey() { return null; }

    public String toString() { return null; }

    public void validateKeysWithRootClassDescription(EOClassDescription classDesc) {}

    public EOQualifier qualifierWithBindings(NSDictionary bindings, boolean requiresAll) { return null; }

    void _addBindingsToDictionary(NSMutableDictionary nsmutabledictionary) { return null; }

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
    static final long serialVersionUID = 0x37d4c58eL;
    private static final String SerializationKeyFieldKey = "key";
    private static final String SerializationSelectorNameFieldKey = "selectorName";
    private static final String SerializationValueFieldKey = "value";
    private NSSelector _selector;
    private String _leftKey;
    private String _rightKey;
    private static final ObjectStreamField serialPersistentFields[];

}

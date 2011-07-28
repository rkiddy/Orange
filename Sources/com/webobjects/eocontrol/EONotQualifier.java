
package com.webobjects.eocontrol;

import com.webobjects.foundation.*;
import java.io.*;


public class EONotQualifier extends EOQualifier
    implements NSCoding, EOKeyValueArchiving {


    public EONotQualifier(EOQualifier qualifier) { return null; }

    public EOQualifier qualifier() { return null; }

    public boolean equals(Object other) { return true; }

    public boolean _isEmpty() { return true; }

    public boolean evaluateWithObject(Object object) { return true; }

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
    static final long serialVersionUID = 0x9e1a0be2L;
    private EOQualifier _qualifier;
    private static final String SerializationQualifierFieldKey = "qualifier";
    private static final ObjectStreamField serialPersistentFields[];

}

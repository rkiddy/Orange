
package com.webobjects.eocontrol;

import com.webobjects.foundation.*;
import java.io.*;


public class EOAndQualifier extends EOQualifier
    implements NSCoding, EOKeyValueArchiving {


    public EOAndQualifier(NSArray qualifiers) { return null; }

    public NSArray qualifiers() { return null; }

    public boolean equals(Object other) { return true; }

    public boolean _isEmpty() { return true; }

    public boolean evaluateWithObject(Object object) { return true; }

    public void validateKeysWithRootClassDescription(EOClassDescription classDesc) {}

    public String toString() { return null; }

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
    static final long serialVersionUID = 0x69ff7a2L;
    private NSArray _qualifiers;
    private transient boolean _isEmptyCache;
    private static final String SerializationQualifiersFieldKey = "qualifiers";
    private static final Class _QualifierArrayClass;
    private static final EOQualifier _NoQualifierArray[];
    private static final ObjectStreamField serialPersistentFields[];

}


package com.webobjects.eocontrol;

import com.webobjects.foundation.*;
import java.io.*;


public class EOQualifierVariable
    implements Serializable, NSCoding, EOKeyValueArchiving {


    public EOQualifierVariable(String key) { return null; }

    public String toString() { return null; }

    public boolean equals(Object other) { return true; }

    public String key() { return null; }

    public Class classForCoder() { return null; }

    public static Object decodeObject(NSCoder coder) { return null; }

    public void encodeWithCoder(NSCoder coder) {}

    public void encodeWithKeyValueArchiver(EOKeyValueArchiver archiver) {}

    public static Object decodeWithKeyValueUnarchiver(EOKeyValueUnarchiver unarchiver) { return null; }

    private void writeObject(ObjectOutputStream s) throws IOException {}

    private void readObject(ObjectInputStream s) throws IOException, ClassNotFoundException {}

    static  {}

    public static final Class _CLASS;
    static final long serialVersionUID = 0xa13a6b82L;
    private static final String SerializationKeyFieldKey = "key";
    private String _key;
    private static final ObjectStreamField serialPersistentFields[];

}

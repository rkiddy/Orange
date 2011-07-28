
package com.webobjects.foundation;

import java.io.*;


public class NSNotification
    implements NSCoding, Serializable {


    public NSNotification(String name, Object object, NSDictionary userInfo) { return null; }

    public NSNotification(String name, Object object) { return null; }

    public String name() { return null; }

    public Object object() { return null; }

    public NSDictionary userInfo() { return null; }

    public String toString() { return null; }

    public boolean equals(Object other) { return true; }

    public Class classForCoder() { return null; }

    public static Object decodeObject(NSCoder coder) { return null; }

    public void encodeWithCoder(NSCoder coder) {}

    public int hashCode() { return 0; }

    private void writeObject(ObjectOutputStream s) throws IOException {}

    private void readObject(ObjectInputStream s) throws IOException, ClassNotFoundException {}

    static  {}

    public static final Class _CLASS;
    static final long serialVersionUID = 0x465cd4ecL;
    private static final String SerializationNameFieldKey = "name";
    private static final String SerializationObjectFieldKey = "object";
    private static final String SerializationUserInfoFieldKey = "userInfo";
    private String _name;
    private Object _object;
    private NSDictionary _userInfo;
    private static final ObjectStreamField serialPersistentFields[];

}


package com.webobjects.foundation;

import java.io.*;

public class _NSJavaArrayWrapper
    implements Serializable {


    private _NSJavaArrayWrapper() { return null; }

    public _NSJavaArrayWrapper(Object values[]) { return null; }

    public boolean equals(Object obj) { return true; }

    public int hashCode() { return 0; }

    public void nullify() {}

    private void writeObject(ObjectOutputStream s) throws IOException {}

    private void readObject(ObjectInputStream s) throws IOException, ClassNotFoundException {}

    static  {}

    static final long serialVersionUID = 0xfb71b58fL;
    private static final String SerializationDataFieldKey = "data";
    private static final String SerializationHashFieldKey = "hash";
    public int hash;
    public Object data[];
    private static final ObjectStreamField serialPersistentFields[];

}

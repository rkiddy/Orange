
package com.webobjects.foundation;

import java.io.*;


public class _NSStreamingOutputData extends OutputStream
    implements Serializable {


    public _NSStreamingOutputData() { return null; }

    public _NSStreamingOutputData(int baseSize) { return null; }

    public final NSMutableData data() { return null; }

    public final NSData dataNoCopy() { return null; }

    public void setData(NSMutableData newData) {}

    public void write(int byteValue) throws IOException {}

    public void write(byte data[]) throws IOException {}

    public void write(byte data[], int offset, int length) throws IOException {}

    private void writeObject(ObjectOutputStream s) throws IOException {}

    private void readObject(ObjectInputStream s) throws IOException, ClassNotFoundException {}

    static  {}

    static final long serialVersionUID = 0x8afc5ae1L;
    private static final String SerializationDataFieldKey = "data";
    private static final Class _NSMutableDataClass;
    protected NSMutableData _data;
    private static final ObjectStreamField serialPersistentFields[];

}

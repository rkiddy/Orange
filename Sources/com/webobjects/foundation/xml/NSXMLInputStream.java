package com.webobjects.foundation.xml;
/**
 * An NSXMLInputStream deserializes primitive data and objects previously written as XML data using an NSXMLOutputStream.
 * NSXMLInputStream and NSXMLOutputStream can provide an application with persistent storage for graphs of objects when used with a FileOutputStream and FileInputStream respectively. Since the data is in XML data (which is plain text), visually inspection of the data would be easier. NSXMLInputStream is used to recover those objects previously serialized. Other uses include passing objects between hosts using a socket stream or for marshaling and unmarshaling arguments and parameters in a remote communication system.
 * NSXMLInputStream ensures that the types of all objects in the graph created from the stream match the classes present in the Java Virtual Machine. Classes are loaded as required using the standard mechanisms.
 * Only objects that support the java.io.Serializable or java.io.Externalizable interface can be read from streams.
 * The method readObject is used to read an object from the stream. Java's safe casting should be used to get the desired type. In Java, strings and arrays are objects and are treated as objects during serialization. When read they need to be cast to the expected type.
 * Primitive data types can be read from the stream using the appropriate method on DataInput.
 * The default deserialization mechanism for objects restores the contents of each field to the value and type it had when it was written. Fields declared as transient or static are ignored by the deserialization process. References to other objects cause those objects to be read from the stream as necessary. Graphs of objects are restored correctly using a reference sharing mechanism. New objects are always allocated when deserializing, which prevents existing objects from being overwritten.
 * Reading an object is analogous to running the constructors of a new object. Memory is allocated for the object and initialized to zero (NULL). No-arg constructors are invoked for the non-serializable classes and then the fields of the serializable classes are restored from the stream starting with the serializable class closest to java.lang.object and finishing with the object's most specific class.
 * For example to read from a stream as written by the corresponding example in NSXMLOutputStream: FileInputStream istream = new FileInputStream("t.tmp"); NSXMLInputStream p = new NSXMLInputStream(istream); int i = p.readInt(); String today = (String)p.readObject(); Date date = (Date)p.readObject(); p.close();
 * Classes control how they are serialized by implementing either the java.io.Serializable or java.io.Externalizable interfaces.
 * Implementing the Serializable interface allows object serialization to save and restore the entire state of the object and it allows classes to evolve between the time the stream is written and the time it is read. It automatically traverses references between objects, saving and restoring entire graphs.
 * Serializable classes that require special handling during the serialization and deserialization process should implement the following methods:
 * private void writeObject(java.io.ObjectOutputStream stream) throws java.io.IOException; private void readObject(java.io.ObjectInputStream stream) throws java.io.IOException, ClassNotFoundException;
 * The readObject method is responsible for reading and restoring the state of the object for its particular class using XML data written to the stream by the corresponding writeObject method. The method does not need to concern itself with the state belonging to its superclasses or subclasses. State is restored by reading data from the NSXMLInputStream for the individual fields and making assignments to the appropriate fields of the object. Reading primitive data types is supported by DataInput.
 * Any attempt to read object data which exceeds the boundaries of the custom data written by the corresponding writeObject method will cause an OptionalDataException to be thrown with an eof field value of true. Non-object reads which exceed the end of the allotted data will reflect the end of data in the same way that they would indicate the end of the stream: bytewise reads will return -1 as the byte read or number of bytes read, and primitive reads will throw EOFExceptions. If there is no corresponding writeObject method, then the end of default serialized data marks the end of the allotted data.
 * Primitive and object read calls issued from within a readExternal method behave in the same manner--if the stream is already positioned at the end of data written by the corresponding writeExternal method, object reads will throw OptionalDataExceptions with eof set to true, bytewise reads will return -1, and primitive reads will throw EOFExceptions.
 * Serialization does not read or assign values to the fields of any object that does not implement the java.io.Serializable interface. Subclasses of Objects that are not serializable can be serializable. In this case the non-serializable class must have a no-arg constructor to allow its fields to be initialized. In this case it is the responsibility of the subclass to save and restore the state of the non-serializable class. It is frequently the case that the fields of that class are accessible (public, package, or protected) or that there are get and set methods that can be used to restore the state.
 * Any exception that occurs while deserializing an object will be caught by the NSXMLInputStream and abort the reading process.
 * Implementing the Externalizable interface allows the object to assume complete control over the contents and format of the object's serialized form. The methods of the Externalizable interface, writeExternal and readExternal, are called to save and restore the objects state. When implemented by a class they can write and read their own state using all of the methods of ObjectOutput and ObjectInput. It is the responsibility of the objects to handle any versioning that occurs.
 * We do not provide a counterpart interface of NSXMLObjectOutput; the key in the attribute is simply ignored during deserialization.
 * NSXMLInputStream is made final for performance reasons.
 * See Also:ObjectInputStream, DataInput, Serializable, Externalizable
 */
public final class NSXMLInputStream extends java.io.ObjectInputStream{
    /**
     * Creates an ObjectInputStream that reads from the specified InputStream. A serialization stream header is read from the stream and verified. This constructor will block until the corresponding ObjectOutputStream has written and flushed the header.
     * If a security manager is installed, this constructor will check for the "enableSubclassImplementation" SerializablePermission when invoked directly or indirectly by the constructor of a subclass which overrides the ObjectInputStream.readFields or ObjectInputStream.readUnshared methods.
     * Parameters:in - input stream to read from Throws: StreamCorruptedException - if the stream header is incorrect IOException - if an I/O error occurs while reading stream header SecurityException - if untrusted subclass illegally overrides security-sensitive methodsSee Also:NSXMLInputStream.readFields(), NSXMLOutputStream.NSXMLOutputStream(OutputStream)
     */
    public NSXMLInputStream(java.io.InputStream in) throws java.io.IOException, java.io.StreamCorruptedException{
         //TODO codavaj!!
    }

    /**
     * Returns the number of bytes that can be read without blocking.
     */
    public int available() throws java.io.IOException{
        return 0; //TODO codavaj!!
    }

    /**
     * Closes the input stream. Must be called to release any resources associated with the stream.
     */
    public void close() throws java.io.IOException{
        return; //TODO codavaj!!
    }

    /**
     * Read the non-static and non-transient fields of the current class from this stream. This may only be called from the readObject method of the class being deserialized. It will throw the NotActiveException if it is called otherwise.
     */
    public void defaultReadObject() throws java.io.IOException, java.lang.ClassNotFoundException{
        return; //TODO codavaj!!
    }

    /**
     * Reads a byte of data. This method will block if no input is available.
     */
    public int read() throws java.io.IOException{
        return 0; //TODO codavaj!!
    }

    /**
     * Reads into an array of bytes. This method will block until some input is available. Consider using java.io.DataInputStream.readFully to read exactly 'length' bytes.
     */
    public int read(byte[] buf, int off, int len) throws java.io.IOException{
        return 0; //TODO codavaj!!
    }

    /**
     * Reads in a boolean.
     */
    public boolean readBoolean() throws java.io.IOException{
        return false; //TODO codavaj!!
    }

    /**
     * Reads an 8 bit byte.
     */
    public byte readByte() throws java.io.IOException{
        return 0; //TODO codavaj!!
    }

    /**
     * Reads a 16 bit char.
     */
    public char readChar() throws java.io.IOException{
        return ' '; //TODO codavaj!!
    }

    /**
     * Reads a 64 bit double.
     */
    public double readDouble() throws java.io.IOException{
        return 0.0d; //TODO codavaj!!
    }

    /**
     * Reads the persistent fields from the stream and makes them available by name.
     */
    public java.io.ObjectInputStream.GetField readFields() throws java.io.IOException, java.lang.ClassNotFoundException{
        return null; //TODO codavaj!!
    }

    /**
     * Reads a 32 bit float.
     */
    public float readFloat() throws java.io.IOException{
        return 0.0f; //TODO codavaj!!
    }

    /**
     * Reads bytes, blocking until all bytes are read.
     */
    public void readFully(byte[] buf) throws java.io.IOException{
        return; //TODO codavaj!!
    }

    /**
     * Reads bytes, blocking until all bytes are read.
     */
    public void readFully(byte[] buf, int off, int len) throws java.io.IOException{
        return; //TODO codavaj!!
    }

    /**
     * Reads a 32 bit int.
     */
    public int readInt() throws java.io.IOException{
        return 0; //TODO codavaj!!
    }

    /**
     * Deprecated.
     * Reads in a line that has been terminated by a \n, \r, \r\n or EOF.
     */
    public java.lang.String readLine() throws java.io.IOException{
        return null; //TODO codavaj!!
    }

    /**
     * Reads a 64 bit long.
     */
    public long readLong() throws java.io.IOException{
        return 0l; //TODO codavaj!!
    }

    /**
     * This method is called by trusted subclasses of ObjectOutputStream that constructed ObjectOutputStream using the protected no-arg constructor. The subclass is expected to provide an override method with the modifier "final".
     */
    protected java.lang.Object readObjectOverride() throws java.io.OptionalDataException, java.lang.ClassNotFoundException, java.io.IOException{
        return null; //TODO codavaj!!
    }

    /**
     * Reads a 16 bit short.
     */
    public short readShort() throws java.io.IOException{
        return 0; //TODO codavaj!!
    }

    /**
     * Reads an unsigned 8 bit byte.
     */
    public int readUnsignedByte() throws java.io.IOException{
        return 0; //TODO codavaj!!
    }

    /**
     * Reads an unsigned 16 bit short.
     */
    public int readUnsignedShort() throws java.io.IOException{
        return 0; //TODO codavaj!!
    }

    /**
     * Reads a UTF format String.
     */
    public java.lang.String readUTF() throws java.io.IOException{
        return null; //TODO codavaj!!
    }

    /**
     * Register an object to be validated before the graph is returned. While similar to resolveObject these validations are called after the entire graph has been reconstituted. Typically, a readObject method will register the object with the stream so that when all of the objects are restored a final set of validations can be performed.
     */
    public void registerValidation(java.io.ObjectInputValidation obj, int prio) throws java.io.NotActiveException, java.io.InvalidObjectException{
        return; //TODO codavaj!!
    }

    /**
     * Skips bytes, block until all bytes are skipped.
     */
    public int skipBytes(int len) throws java.io.IOException{
        return 0; //TODO codavaj!!
    }

}

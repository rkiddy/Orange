package com.webobjects.foundation.xml;
/**
 * An NSXMLOutputStream writes primitive data types and graphs of Java objects to an OutputStream as XML data. The objects can be read (reconstituted) using an NSXMLInputStream. Persistent storage of objects can be accomplished by using a file for the stream. If the stream is a network socket stream, the objects can be reconsituted on another host or in another process.
 * Only objects that support the java.io.Serializable interface can be written to streams. The class structure of each serializable object is encoded including the class name and the super classes, the values of the object's fields and arrays, and the closure of any other objects referenced from the initial objects.
 * The method writeObject is used to write an object to the stream. Any object, including Strings and arrays, is written with writeObject. Multiple objects or primitives can be written to the stream. The objects must be read back from the corresponding NSXMLInputstream with the same types and in the same order as they were written.
 * Primitive data types can also be written to the stream using the appropriate methods from DataOutput. Strings can also be written using the writeUTF method.
 * The default serialization mechanism for an object writes the class structure of the object and the values of all non-transient and non-static fields. References to other objects (except in transient or static fields) cause those objects to be written also. Multiple references to a single object are encoded using a reference sharing mechanism so that graphs of objects can be restored to the same shape as when the original was written. Reader is encouraged to consult the serialization specification to understand how and when each reference number is assigned if there is a need to.
 * For example to write an object that can be read by the corresponding example in NSXMLInputStream: FileOutputStream ostream = new FileOutputStream(t.tmp); NSXMLOutputStream p = new NSXMLOutputStream(ostream); if (p instanceof NSXMLOutputStream) { NSXMLOutputFormat format = new NSXMLOutputFormat(); p.setOutputFormat(format); p.writeRootComment(Writing comment, true); } p.writeInt(12345); p.writeObject(Today); p.writeObject(new Date()); p.flush(); p.close(); The default XML output is: ?xml version=1.0 encoding=UTF-8? !--Writing comment-- content xmlns=http://www.apple.com/webobjects/XMLSerialization xmlns:xsi=http://www.w3.org/2001/XMLSchema-instance xsi:schemaLocation=http://www.apple.com/webobjects/XMLSerialization http://www.apple.com/webobjects/5.2/schemas/woxml.xsd int12345/int string id=0 xml:space=preserveToday/string object id=2 class flag=3 id=1 name=java.util.Date suid=7523967970034938905/ long ignoreEDB=11026763105869/long /object /content
 * Classes that require special handling during the serialization and deserialization process must implement special methods with these exact signatures: private void readObject(java.io.ObjectInputStream stream) throws java.io.IOException, ClassNotFoundException; private void writeObject(java.io.ObjectOutputStream stream) throws java.io.IOException
 * The writeObject method is responsible for writing the state of the object for its particular class so that the corresponding readObject method can restore it. The method does not need to concern itself with the state belonging to the object's superclasses or subclasses. State is saved by writing the individual fields to the NSXMLOutputStream using the writeObject method or by using the methods for primitive data types supported by DataOutput.
 * Serialization does not write out the fields of any object that does not implement the java.io.Serializable interface. Subclasses of Objects that are not serializable can be serializable. In this case the non-serializable class must have a no-arg constructor to allow its fields to be initialized. In this case it is the responsibility of the subclass to save and restore the state of the non-serializable class. It is frequently the case that the fields of that class are accessible (public, package, or protected) or that there are get and set methods that can be used to restore the state.
 * Serialization of an object can be prevented by implementing writeObject and readObject methods that throw the NotSerializableException. The exception will be caught by the ObjectOutputStream and abort the serialization process.
 * Implementing the Externalizable interface allows the object to assume complete control over the contents and format of the object's serialized form. The methods of the Externalizable interface, writeExternal and readExternal, are called to save and restore the objects state. When implemented by a class they can write and read their own state using all of the methods of ObjectOutput and ObjectInput. It is the responsibility of the objects to handle any versioning that occurs.
 * We provided a simple interface NSXMLObjectOutput that would add a key as an attribute to the XML element representing the primitive data or the object. This key can then be used in XSLT to transform the tag name of the XML element. For example: float key=InterestRate6.25/float --- InterestRate6.25/InterestRate
 * See Also:DataOutput, ObjectInputStream, Serializable, Externalizable
 */
public class NSXMLOutputStream extends java.io.ObjectOutputStream implements com.webobjects.foundation.xml.NSXMLObjectStreamConstants, com.webobjects.foundation.xml.NSXMLObjectOutput{

    public static class DOMRecursiveInfo { }

    /**
     * Creates an ObjectOutputStream that writes to the specified OutputStream.
     * If a security manager is installed, this constructor will check for the "enableSubclassImplementation" SerializablePermission.
     * Parameters:out - output stream to write to Throws: IOException - if an I/O error occurs while writing stream header SecurityException - if the "enableSubclassImplementation" SerializablePermission is not allowedSee Also:NSXMLOutputStream.NSXMLOutputStream(OutputStream, File), NSXMLOutputStream.NSXMLOutputStream(OutputStream, InputSource), NSXMLOutputStream.NSXMLOutputStream(OutputStream, Transformer), NSXMLOutputStream.putFields(), NSXMLInputStream.NSXMLInputStream(InputStream)
     */
    public NSXMLOutputStream(java.io.OutputStream out) throws java.io.IOException{
         //TODO codavaj!!
    }

    /**
     * Creates an ObjectOutputStream that writes to the specified OutputStream.
     * If a security manager is installed, this constructor will check for the "enableSubclassImplementation" SerializablePermission.
     * Parameters:out - output stream to write toxslt - XSLT stylesheet that will be used to transform the XML output before the it is written to out; the File reference must be non null Throws: IOException - if an I/O error occurs while writing stream header SecurityException - if the "enableSubclassImplementation" SerializablePermission is not allowedSee Also:NSXMLOutputStream.NSXMLOutputStream(OutputStream), NSXMLOutputStream.NSXMLOutputStream(OutputStream, InputSource), NSXMLOutputStream.NSXMLOutputStream(OutputStream, Transformer), NSXMLOutputStream.putFields(), NSXMLInputStream.NSXMLInputStream(InputStream)
     */
    public NSXMLOutputStream(java.io.OutputStream out, java.io.File xslt) throws java.io.IOException{
         //TODO codavaj!!
    }

    /**
     * Creates an ObjectOutputStream that writes to the specified OutputStream.
     * If a security manager is installed, this constructor will check for the "enableSubclassImplementation" SerializablePermission.
     * Parameters:out - output stream to write toxslt - XSLT stylesheet that will be used to transform the XML output before the it is written to out Throws: IOException - if an I/O error occurs while writing stream header SecurityException - if the "enableSubclassImplementation" SerializablePermission is not allowedSee Also:NSXMLOutputStream.NSXMLOutputStream(OutputStream, File), NSXMLOutputStream.NSXMLOutputStream(OutputStream), NSXMLOutputStream.NSXMLOutputStream(OutputStream, Transformer), NSXMLOutputStream.putFields(), NSXMLInputStream.NSXMLInputStream(InputStream), InputSource
     */
    public NSXMLOutputStream(java.io.OutputStream out, org.xml.sax.InputSource xslt) throws java.io.IOException{
         //TODO codavaj!!
    }

    /**
     * Creates an ObjectOutputStream that writes to the specified OutputStream.
     * If a security manager is installed, this constructor will check for the "enableSubclassImplementation" SerializablePermission.
     * Parameters:out - output stream to write totransformer - XSLT transformer that will be used to transform the XML output before the it is written to out Throws: IOException - if an I/O error occurs while writing stream header SecurityException - if the "enableSubclassImplementation" SerializablePermission is not allowedSee Also:NSXMLOutputStream.NSXMLOutputStream(OutputStream, File), NSXMLOutputStream.NSXMLOutputStream(OutputStream, Transformer), NSXMLOutputStream.NSXMLOutputStream(OutputStream), NSXMLOutputStream.putFields(), NSXMLInputStream.NSXMLInputStream(InputStream), Transformer
     */
    public NSXMLOutputStream(java.io.OutputStream out, javax.xml.transform.Transformer transformer) throws java.io.IOException{
         //TODO codavaj!!
    }

    /**
     * Closes the stream. This method must be called to release any resources associated with the stream.
     */
    public void close() throws java.io.IOException{
        return; //TODO codavaj!!
    }

    /**
     * Write the non-static and non-transient fields of the current class to this stream. This may only be called from the writeObject method of the class being serialized. It will throw the NotActiveException if it is called otherwise.
     */
    public void defaultWriteObject() throws java.io.IOException{
        return; //TODO codavaj!!
    }

    /**
     * Description copied from interface:
     * Disables the use of references for repeated Strings in XML output. Because Strings are objects in general, NSXMLObjectOutput attaches an id attribute by default:
     * string id="39" xml:space="preserve">Well Done!
     * /string> And any repeating output of the same String will just use the idRef attribute feature:
     * string idRef="39" /> This saves space in the output and more importantly maintain the integrity of the objects during deserialization: the two Strings are the same object.
     * However, sometimes you are just concerned about the data itself and want to see the content of the repeated string without following its reference. You can either use the writeUTF method or use this method to globally treat all Strings as different objects. Thus, if you are not using references for String, subsequent output of the same string looks like this: string id="40" xml:space="preserve">Well Done!/string>
     */
    public boolean disableReferenceForString(){
        return false; //TODO codavaj!!
    }

    /**
     * Description copied from interface:
     * See disableReferenceForString() for details first.
     * The parameter length allows you to further fine tune the disabled effect. It tells NSXMLObjectOutput to revert back to default behavior when length of the string exceeds the length so that long strings will not waste space in the output. For example, when the length is 100, only strings of length 100 or less are written out as they out, without the use of references.
     */
    public int disableReferenceForString(int length){
        return 0; //TODO codavaj!!
    }

    /**
     * Description copied from interface:
     * Enables the use of references for repeated Strings in XML output. Because Strings are objects in general, NSXMLObjectOutput attaches an id attribute by default:
     * string id="39" xml:space="preserve">Well Done!
     * /string> And any repeating output of the same String will just use the idRef attribute feature:
     * string idRef="39" /> This saves space in the output and more importantly maintain the integrity of the objects during deserialization: the two Strings are the same object.
     * This is the default behavior.
     */
    public boolean enableReferenceForString(){
        return false; //TODO codavaj!!
    }

    /**
     * Flushes the stream. Nothing happens at this point. Use close() to do the final flush.
     */
    public void flush() throws java.io.IOException{
        return; //TODO codavaj!!
    }

    /**
     * Gets the current NSXMLOutputFormat object.
     */
    public com.webobjects.foundation.xml.NSXMLOutputFormat outputFormat(){
        return null; //TODO codavaj!!
    }

    /**
     * Retrieve the object used to buffer persistent fields to be written to the stream. The fields will be written to the stream when writeFields method is called.
     */
    public java.io.ObjectOutputStream.PutField putFields() throws java.io.IOException{
        return null; //TODO codavaj!!
    }

    /**
     * Reset will disregard the state of any objects already written to the stream. The state is reset to be the same as a new NSXMLOutputStream.
     */
    public void reset() throws java.io.IOException{
        return; //TODO codavaj!!
    }

    /**
     * Sets the current NSXMLOutputFormat object that will be used to change the format of the XML output.
     */
    public void setOutputFormat(com.webobjects.foundation.xml.NSXMLOutputFormat format){
        return; //TODO codavaj!!
    }

    /**
     * Sets the XSLT transformer that will be used to transform the XML output before the it is written out.
     */
    public void setTransformer(javax.xml.transform.Transformer transformer){
        return; //TODO codavaj!!
    }

    /**
     * Description copied from interface:
     * Sets the output mode for binary data (essentially array of bytes) to be either using the Base64 encoding or a simple series of numbers (-128 to 127) delimited by a space. The former is the default. Binary data cannot usually be represented as a series of characters because not all characters (e.g. 0x00) can be represented as legal XML characters. Thus, we have the two ways to deal with it. See http://www.w3c.org/TR/2000/REC-xml-20001006#charsets for more details.
     */
    public final boolean setUseBase64ForBinaryData(boolean on){
        return false; //TODO codavaj!!
    }

    /**
     * Sets the XSLT stylesheet that will be used to transform the XML output before the it is written out.
     */
    public void setXSLTSource(java.io.File xslt) throws java.io.IOException{
        return; //TODO codavaj!!
    }

    /**
     * Sets the XSLT stylesheet that will be used to transform the XML output before the it is written out.
     */
    public void setXSLTSource(org.xml.sax.InputSource xslt) throws java.io.IOException{
        return; //TODO codavaj!!
    }

    /**
     * Gets the XSLT transformer that will be used to transform the XML output before the it is written out. User can use it to change the output properties.
     */
    public javax.xml.transform.Transformer transformer(){
        return null; //TODO codavaj!!
    }

    /**
     * Description copied from interface:
     * Gets the previously set output mode for binary data. The default is true.
     */
    public final boolean useBase64ForBinaryData(){
        return false; //TODO codavaj!!
    }

    /**
     * Description copied from interface:
     * Gets the previously set output behavior for a java.lang.String object. The default is true.
     */
    public boolean useReferenceForString(){
        return false; //TODO codavaj!!
    }

    /**
     * Writes an array of bytes.
     */
    public void write(byte[] buf) throws java.io.IOException{
        return; //TODO codavaj!!
    }

    /**
     * Writes a sub array of bytes.
     */
    public void write(byte[] buf, int off, int len) throws java.io.IOException{
        return; //TODO codavaj!!
    }

    /**
     * Description copied from interface:
     * Writes a sub array of bytes.
     */
    public void write(byte[] buf, int off, int len, java.lang.String key) throws java.io.IOException{
        return; //TODO codavaj!!
    }

    /**
     * Description copied from interface:
     * Writes an array of bytes.
     */
    public void write(byte[] buf, java.lang.String key) throws java.io.IOException{
        return; //TODO codavaj!!
    }

    /**
     * Writes a byte.
     */
    public void write(int val) throws java.io.IOException{
        return; //TODO codavaj!!
    }

    /**
     * Writes a byte.
     */
    public void write(int val, java.lang.String key){
        return; //TODO codavaj!!
    }

    /**
     * Writes a boolean.
     */
    public void writeBoolean(boolean val) throws java.io.IOException{
        return; //TODO codavaj!!
    }

    /**
     * Writes a boolean.
     */
    public void writeBoolean(boolean val, java.lang.String key){
        return; //TODO codavaj!!
    }

    /**
     * Writes an 8 bit byte.
     */
    public void writeByte(int val) throws java.io.IOException{
        return; //TODO codavaj!!
    }

    /**
     * Writes an 8 bit byte.
     */
    public void writeByte(int val, java.lang.String key){
        return; //TODO codavaj!!
    }

    /**
     * Writes a String as a sequence of bytes. Unlike the JDK implementation where each character in str is cast into a byte (and hence information could be lost), the encoding specified by the user (using NSXMLOutputFormat) is used to convert each character to a certain number of bytes.
     */
    public void writeBytes(java.lang.String str) throws java.io.IOException{
        return; //TODO codavaj!!
    }

    /**
     * Description copied from interface:
     * Writes a String as a sequence of bytes. Unlike the JDK implementation where each character in str is cast into a byte (and hence information could be lost), the encoding specified by the user (using NSXMLOutputFormat) is used to convert each character to a certain number of bytes.
     */
    public void writeBytes(java.lang.String str, java.lang.String key) throws java.io.IOException{
        return; //TODO codavaj!!
    }

    /**
     * Writes a 16 bit char.
     */
    public void writeChar(int val) throws java.io.IOException{
        return; //TODO codavaj!!
    }

    /**
     * Writes a 16 bit char.
     */
    public void writeChar(int val, java.lang.String key){
        return; //TODO codavaj!!
    }

    /**
     * Writes a String as a sequence of chars.
     */
    public void writeChars(java.lang.String str) throws java.io.IOException{
        return; //TODO codavaj!!
    }

    /**
     * Writes a String as a sequence of chars.
     */
    public void writeChars(java.lang.String str, java.lang.String key) throws java.io.IOException{
        return; //TODO codavaj!!
    }

    /**
     * Writes a comment to the XML output. The location is right after the most recent write operation and enclosed within the root element.
     */
    public void writeComment(java.lang.String comment){
        return; //TODO codavaj!!
    }

    /**
     * Writes a 64 bit double.
     */
    public void writeDouble(double val) throws java.io.IOException{
        return; //TODO codavaj!!
    }

    /**
     * Writes a 64 bit double.
     */
    public void writeDouble(double val, java.lang.String key){
        return; //TODO codavaj!!
    }

    /**
     * Write the buffered fields to the stream.
     */
    public void writeFields() throws java.io.IOException{
        return; //TODO codavaj!!
    }

    /**
     * Writes a 32 bit float.
     */
    public void writeFloat(float val) throws java.io.IOException{
        return; //TODO codavaj!!
    }

    /**
     * Writes a 32 bit float.
     */
    public void writeFloat(float val, java.lang.String key){
        return; //TODO codavaj!!
    }

    /**
     * Writes a 32 bit int.
     */
    public void writeInt(int val) throws java.io.IOException{
        return; //TODO codavaj!!
    }

    /**
     * Writes a 32 bit int.
     */
    public void writeInt(int val, java.lang.String key){
        return; //TODO codavaj!!
    }

    /**
     * Writes a 64 bit long.
     */
    public void writeLong(long val) throws java.io.IOException{
        return; //TODO codavaj!!
    }

    /**
     * Writes a 64 bit long.
     */
    public void writeLong(long val, java.lang.String key){
        return; //TODO codavaj!!
    }

    /**
     * Writes the specified object as XML data. The class structure of the object and the values of the non-transient and non-static fields of the class and all of its supertypes are written. Default serialization for a class can be overridden using the writeObject and the readObject methods. Objects referenced by this object are written transitively so that a complete equivalent graph of objects can be reconstructed by an NSXMLInputStream.
     * Exceptions are thrown for problems with the OutputStream and for classes that should not be serialized. All exceptions are fatal to the OutputStream, which is left in an indeterminate state, and it is up to the caller to ignore or recover the stream state.
     */
    public void writeObject(java.lang.Object obj, java.lang.String key) throws java.io.IOException{
        return; //TODO codavaj!!
    }

    /**
     * Method used by subclasses to override the default writeObject method.
     */
    protected void writeObjectOverride(java.lang.Object obj) throws java.io.IOException{
        return; //TODO codavaj!!
    }

    /**
     * Writes a comment to the XML output. The location is either before or after the root element.
     */
    public void writeRootComment(java.lang.String comment, boolean before){
        return; //TODO codavaj!!
    }

    /**
     * Writes a 16 bit short.
     */
    public void writeShort(int val) throws java.io.IOException{
        return; //TODO codavaj!!
    }

    /**
     * Writes a 16 bit short.
     */
    public void writeShort(int val, java.lang.String key){
        return; //TODO codavaj!!
    }

    /**
     * The writeStreamHeader method is provided so subclasses can append or prepend their own header to the stream.
     */
    protected void writeStreamHeader() throws java.io.IOException{
        return; //TODO codavaj!!
    }

    /**
     * Primitive data write of this String in UTF format. Note that there is a significant difference between writing a String into the stream as primitive data or as an Object. A String instance written by writeObject is written into the stream as a String initially. Future writeObject() calls write references to the string into the stream.
     */
    public void writeUTF(java.lang.String str) throws java.io.IOException{
        return; //TODO codavaj!!
    }

    /**
     * Primitive data write of this String in UTF format. Note that there is a significant difference between writing a String into the stream as primitive data or as an Object. A String instance written by writeObject is written into the stream as a String initially. Future writeObject() calls write references to the string into the stream.
     */
    public void writeUTF(java.lang.String str, java.lang.String key){
        return; //TODO codavaj!!
    }

}

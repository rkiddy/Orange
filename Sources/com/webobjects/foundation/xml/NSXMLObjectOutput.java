package com.webobjects.foundation.xml;
/**
 * This interface provides for converting data from any of the Java primitive types to a series of XML elements. There are also facilities for converting a Java object in a XML element which then includes sub XML elements.
 * The major difference from java.io.ObjectOutput is that each of the method in this interface takes an extra parameter key, which will be appear as the data of the attribute "key" in the XML element written out. This key can then be used in XSLT to transform the tag name of the XML element. For example: 6.25 ---> 6.25 Thus, key has to be a proper XML attribute value. For example, it cannot be a String of the null character, \U0000. And if you want to use it in XSLT to become a tag name, then it has to be a proper XML tag name. For example, there must not be whitespaces.
 * There are also a few utility methods that are not found in java.io.ObjectOutput.
 */
public interface NSXMLObjectOutput{
    /**
     * Disables the use of references for repeated Strings in XML output. Because Strings are objects in general, NSXMLObjectOutput attaches an id attribute by default:
     * string id="39" xml:space="preserve">Well Done!
     * /string> And any repeating output of the same String will just use the idRef attribute feature:
     * string idRef="39" /> This saves space in the output and more importantly maintain the integrity of the objects during deserialization: the two Strings are the same object.
     * However, sometimes you are just concerned about the data itself and want to see the content of the repeated string without following its reference. You can either use the writeUTF method or use this method to globally treat all Strings as different objects. Thus, if you are not using references for String, subsequent output of the same string looks like this: string id="40" xml:space="preserve">Well Done!/string>
     */
    abstract boolean disableReferenceForString();

    /**
     * See disableReferenceForString() for details first.
     * The parameter length allows you to further fine tune the disabled effect. It tells NSXMLObjectOutput to revert back to default behavior when length of the string exceeds the length so that long strings will not waste space in the output. For example, when the length is 100, only strings of length 100 or less are written out as they out, without the use of references.
     */
    abstract int disableReferenceForString(int length);

    /**
     * Enables the use of references for repeated Strings in XML output. Because Strings are objects in general, NSXMLObjectOutput attaches an id attribute by default:
     * string id="39" xml:space="preserve">Well Done!
     * /string> And any repeating output of the same String will just use the idRef attribute feature:
     * string idRef="39" /> This saves space in the output and more importantly maintain the integrity of the objects during deserialization: the two Strings are the same object.
     * This is the default behavior.
     */
    abstract boolean enableReferenceForString();

    /**
     * Sets the output mode for binary data (essentially array of bytes) to be either using the Base64 encoding or a simple series of numbers (-128 to 127) delimited by a space. The former is the default. Binary data cannot usually be represented as a series of characters because not all characters (e.g. 0x00) can be represented as legal XML characters. Thus, we have the two ways to deal with it. See http://www.w3c.org/TR/2000/REC-xml-20001006#charsets for more details.
     */
    abstract boolean setUseBase64ForBinaryData(boolean on);

    /**
     * Gets the previously set output mode for binary data. The default is true.
     */
    abstract boolean useBase64ForBinaryData();

    /**
     * Gets the previously set output behavior for a java.lang.String object. The default is true.
     */
    abstract boolean useReferenceForString();

    /**
     * Writes a sub array of bytes.
     */
    abstract void write(byte[] buf, int off, int len, java.lang.String key) throws java.io.IOException;

    /**
     * Writes an array of bytes.
     */
    abstract void write(byte[] buf, java.lang.String key) throws java.io.IOException;

    /**
     * Writes a byte.
     */
    abstract void write(int val, java.lang.String key);

    /**
     * Writes a boolean.
     */
    abstract void writeBoolean(boolean val, java.lang.String key);

    /**
     * Writes an 8 bit byte.
     */
    abstract void writeByte(int val, java.lang.String key);

    /**
     * Writes a String as a sequence of bytes. Unlike the JDK implementation where each character in str is cast into a byte (and hence information could be lost), the encoding specified by the user (using NSXMLOutputFormat) is used to convert each character to a certain number of bytes.
     */
    abstract void writeBytes(java.lang.String str, java.lang.String key) throws java.io.IOException;

    /**
     * Writes a 16 bit char.
     */
    abstract void writeChar(int val, java.lang.String key);

    /**
     * Writes a String as a sequence of chars.
     */
    abstract void writeChars(java.lang.String str, java.lang.String key) throws java.io.IOException;

    /**
     * Writes a comment to the XML output. The location is right after the most recent write operation and enclosed within the root element.
     */
    abstract void writeComment(java.lang.String comment);

    /**
     * Writes a 64 bit double.
     */
    abstract void writeDouble(double val, java.lang.String key);

    /**
     * Writes a 32 bit float.
     */
    abstract void writeFloat(float val, java.lang.String key);

    /**
     * Writes a 32 bit int.
     */
    abstract void writeInt(int val, java.lang.String key);

    /**
     * Writes a 64 bit long.
     */
    abstract void writeLong(long val, java.lang.String key);

    /**
     * Writes the specified object as XML data. The class structure of the object and the values of the non-transient and non-static fields of the class and all of its supertypes are written. Default serialization for a class can be overridden using the writeObject and the readObject methods. Objects referenced by this object are written transitively so that a complete equivalent graph of objects can be reconstructed by an NSXMLInputStream.
     * Exceptions are thrown for problems with the OutputStream and for classes that should not be serialized. All exceptions are fatal to the OutputStream, which is left in an indeterminate state, and it is up to the caller to ignore or recover the stream state.
     */
    abstract void writeObject(java.lang.Object object, java.lang.String key) throws java.io.IOException;

    /**
     * Writes a comment to the XML output. The location is either before or after the root element.
     */
    abstract void writeRootComment(java.lang.String comment, boolean before);

    /**
     * Writes a 16 bit short.
     */
    abstract void writeShort(int val, java.lang.String key);

    /**
     * Primitive data write of this String in UTF format. Note that there is a significant difference between writing a String into the stream as primitive data or as an Object. A String instance written by writeObject is written into the stream as a String initially. Future writeObject() calls write references to the string into the stream.
     */
    abstract void writeUTF(java.lang.String str, java.lang.String key);

}

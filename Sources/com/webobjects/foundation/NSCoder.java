package com.webobjects.foundation;
/**
 * NSCoder is an abstract class that declares the API used by concrete subclasses to transfer objects and other data items between memory and some other format. This capability provides the basis for archiving (where objects and data items are stored on disk) and distribution (where objects and data items are copied between different processes or threads).
 * You should never need to subclass NSCoder. Rather, WebObjects provides private concrete subclasses that it uses by default. However, you might interact with a coder object if you create a class that implements the NSCoding interface.
 * NSCoder operates on scalars (booleans, bytes, and integers, for example), and any other types of object. A coder object stores object type information along with an object's data, so an object decoded from a stream of bytes is normally of the same class as the object that was originally encoded into the stream.
 * See Also:NSCoding, NSCoder.encodeObject(Object object)
 */
public abstract class NSCoder{
    public NSCoder(){
         //TODO codavaj!!
    }

    /**
     * Decodes a boolean value that was previously encoded with encodeBoolean.
     */
    public abstract boolean decodeBoolean();

    /**
     * Decodes a byte value that was previously encoded with encodeByte.
     */
    public abstract byte decodeByte();

    /**
     * Decodes an array of byte values that were previously encoded with encodeBytes.
     */
    public abstract byte[] decodeBytes();

    /**
     * Decodes a character value that was previously encoded with encodeChar.
     */
    public abstract char decodeChar();

    /**
     * Decodes a class that was previously encoded with encodeClass.
     */
    public abstract java.lang.Class decodeClass();

    /**
     * Decodes a double value that was previously encoded with encodeDouble.
     */
    public abstract double decodeDouble();

    /**
     * Decodes a float value that was previously encoded with encodeFloat.
     */
    public abstract float decodeFloat();

    /**
     * Decodes an integer value that was previously encoded with encodeInt.
     */
    public abstract int decodeInt();

    /**
     * Decodes a long value that was previously encoded with encodeLong.
     */
    public abstract long decodeLong();

    /**
     * Decodes an object that was previously encoded with encodeObject.
     */
    public abstract java.lang.Object decodeObject();

    /**
     * Decodes an array of objects that were previously encoded with encodeObjects.
     */
    public abstract java.lang.Object[] decodeObjects();

    /**
     * Decodes a short value that was previously encoded with encodeShort.
     */
    public abstract short decodeShort();

    /**
     * Encodes a boolean value. To decode a value encoded with this method, use decodeBoolean.
     */
    public abstract void encodeBoolean(boolean aBoolean);

    /**
     * Encodes a byte value. To decode a value encoded with this method, use decodeByte.
     */
    public abstract void encodeByte(byte aByte);

    /**
     * Encodes an array of bytes. To decode a value encoded with this method, use decodeBytes.
     */
    public abstract void encodeBytes(byte[] bytes);

    /**
     * Encodes a character value. To decode a value encoded with this method, use decodeChar.
     */
    public abstract void encodeChar(char aChar);

    /**
     * Encodes a class. To decode a value encoded with this method, use decodeClass.
     */
    public abstract void encodeClass(java.lang.Class aClass);

    /**
     * Encodes a double value. To decode a value encoded with this method, use decodeDouble.
     */
    public abstract void encodeDouble(double aDouble);

    /**
     * Encodes a float value. To decode a value encoded with this method, use decodeFloat.
     */
    public abstract void encodeFloat(float aFloat);

    /**
     * Encodes an integer value. To decode a value encoded with this method, use decodeInt.
     */
    public abstract void encodeInt(int anInt);

    /**
     * Encodes a long value. To decode a value encoded with this method, use decodeLong.
     */
    public abstract void encodeLong(long aLong);

    /**
     * Encodes an object. To decode a value encoded with this method, use decodeObject.
     */
    public abstract void encodeObject(java.lang.Object object);

    /**
     * Encodes an array of objects. To decode a value encoded with this method, use decodeObjects.
     */
    public abstract void encodeObjects(java.lang.Object[] objects);

    /**
     * Encodes a short value. To decode a value encoded with this method, use decodeShort.
     */
    public abstract void encodeShort(short aShort);

    /**
     * Cleans up the receiver's state after the receiver has finished encoding data. NSCoder's default implementation does nothing.
     */
    public void finishCoding(){
        return; //TODO codavaj!!
    }

    /**
     * Prepares the receiver for reading data from stream. NSCoder's default implementation does nothing.
     */
    public void prepareForReading(java.io.InputStream stream){
        return; //TODO codavaj!!
    }

    /**
     * Prepares the receiver for writing to stream. NSCoder's default implementation does nothing.
     */
    public void prepareForWriting(java.io.OutputStream stream){
        return; //TODO codavaj!!
    }

}

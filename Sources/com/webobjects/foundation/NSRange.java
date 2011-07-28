
package com.webobjects.foundation;

import java.io.*;


public class NSRange
    implements Serializable, Cloneable {


    public static NSRange fromString(String string) { return null; }

    public NSRange() { return null; }

    private NSRange(int location, int length, boolean checkValues) { return null; }

    public NSRange(int location, int length) { return null; }

    public NSRange(NSRange range) { return null; }

    public int location() { return 0; }

    public int length() { return 0; }

    public NSRange rangeByUnioningRange(NSRange otherRange) { return null; }

    public NSRange rangeByIntersectingRange(NSRange otherRange) { return null; }

    public void subtractRange(NSRange otherRange, NSMutableRange resultRange1, NSMutableRange resultRange2) {}

    public int maxRange() { return 0; }

    public boolean isEmpty() { return true; }

    public boolean containsLocation(int location) { return true; }

    /**
     * @deprecated Method locationInRange is deprecated
     */

    public boolean locationInRange(int location) { return true; }

    public boolean intersectsRange(NSRange otherRange) { return true; }

    public boolean isSubrangeOfRange(NSRange otherRange) { return true; }

    public boolean isEqualToRange(NSRange otherRange) { return true; }

    public boolean equals(Object object) { return true; }

    public int hashCode() { return 0; }

    public Object clone() { return null; }

    public String toString() { return null; }

    private void writeObject(ObjectOutputStream s) throws IOException {}

    private void readObject(ObjectInputStream s) throws IOException, ClassNotFoundException {}

    private Object readResolve() throws ObjectStreamException { return null; }

    static  {}

    public static final Class _CLASS;
    static final long serialVersionUID = 0x63f33cd7L;
    private static final String SerializationLocationFieldKey = "location";
    private static final String SerializationLengthFieldKey = "length";
    public static final NSRange ZeroRange;
    protected int _location;
    protected int _length;
    private static final ObjectStreamField serialPersistentFields[];

}

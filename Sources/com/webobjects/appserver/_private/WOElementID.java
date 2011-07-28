
package com.webobjects.appserver._private;

import java.io.*;

public class WOElementID
    implements Serializable {


    public WOElementID(String aName) { return null; }

    public String toString() { return null; }

    private int _lastDotPosition() { return 0; }

    private void _makeFit(int newSize) {}

    private void _appendChar(char c) {}

    private void _appendChars(char newChars[]) {}

    private void writeObject(ObjectOutputStream out) throws IOException {}

    private void readObject(ObjectInputStream in) throws IOException, ClassNotFoundException {}

    public void appendElementIDComponent(String aString) {}

    public void appendZeroElementIDComponent() {}

    public void incrementLastElementIDComponent() {}

    public void deleteLastElementIDComponent() {}

    public void deleteAllElementIDComponents() {}

    static final long serialVersionUID = 0x51a0248bL;
    char _elementID[];
    transient String _elementIDString;
    transient int _size;
    int _lastDot;
    private int DefaultSize;

}


package com.webobjects.foundation.xml;

import com.webobjects.foundation._NSSerialFieldDesc;
import java.io.*;
import java.util.HashMap;
import org.w3c.dom.Element;


final class _NSXMLPutField extends java.io.ObjectOutputStream.PutField
    implements NSXMLObjectStreamConstants {


    _NSXMLPutField(NSXMLOutputStream os, _NSXMLObjectStreamClass osc, NSXMLOutputStream.DOMRecursiveInfo info) { return null; }

    public void put(String name, boolean val) {}

    public void put(String name, byte val) {}

    public void put(String name, short val) {}

    public void put(String name, char val) {}

    public void put(String name, int val) {}

    public void put(String name, long val) {}

    public void put(String name, float val) {}

    public void put(String name, double val) {}

    public void put(String name, Object val) {}

    public void write(ObjectOutput out) throws IOException {}

    private void writeFields(Element parent) throws IOException {}

    void writeFields() throws IOException { return null; }

    private final NSXMLOutputStream _xmlOs;
    private final NSXMLOutputStream.DOMRecursiveInfo _DOMRecursiveInfo;
    private final _NSXMLObjectStreamClass _osc;
    private final Element _primFields[];
    private final Element _objFields[];
    private Object _storedObjects[];
    private final _NSSerialFieldDesc _fieldDescs[];
    private boolean _writtenOnce;

}

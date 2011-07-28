
package com.webobjects.appserver._private;

import com.webobjects.foundation.*;

public class WOHTTPHeaderValue
    implements NSDisposable {


    public WOHTTPHeaderValue() { return null; }

    public WOHTTPHeaderValue(String value) { return null; }

    public void dispose() {}

    public void set(byte aBuffer[], int anOffset, int aLength) {}

    public NSData _data() { return null; }

    protected boolean equals(WOHTTPHeaderValue elt) { return true; }

    public boolean equals(Object elt) { return true; }

    protected char[] uppercase() { return null; }

    protected char[] lowercase() { return null; }

    public boolean equalsIgnoreCase(WOHTTPHeaderValue elt) { return true; }

    public String toString() { return null; }

    public String description() { return null; }

    private byte buffer[];
    private int offset;
    private int length;
    private char uppercase[];
    private char lowercase[];

}

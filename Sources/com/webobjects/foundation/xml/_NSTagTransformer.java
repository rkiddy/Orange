
package com.webobjects.foundation.xml;

import com.webobjects.foundation._NSCollectionPrimitives;
import java.io.IOException;
import java.io.StreamCorruptedException;
import org.xml.sax.Attributes;


abstract class _NSTagTransformer
    implements NSXMLObjectStreamConstants {
    protected static final class CharArray {


        public CharArray(int capacity) { return null; }

        char get(int index) { return null; }

        void put(int index, char ch) { return null; }

        private char _charArray[];

    }



    public _NSTagTransformer(_NSTransformHandler aHandler) { return null; }

    protected final void getNumEndDataBlock(Attributes attributes) throws StreamCorruptedException { return null; }

    protected final void writeEndDataBlock() throws IOException { return null; }

    protected final void writeEndDataBlock(int edb) throws IOException { return null; }

    public void handleStart(String s, Attributes attributes1) throws IOException {}

    public void handleEnd(String s, String s1) throws IOException {}

    protected _NSTransformHandler handler;
    protected int numEDB;

}

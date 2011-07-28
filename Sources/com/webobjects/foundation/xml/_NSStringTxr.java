
package com.webobjects.foundation.xml;

import java.io.IOException;
import org.xml.sax.Attributes;


final class _NSStringTxr extends _NSTagTransformer {


    public _NSStringTxr(_NSTransformHandler aHandler) { return null; }

    public void handleStart(String tag, Attributes attributes) throws IOException {}

    public void handleEnd(String tag, String data) throws IOException {}

    public boolean partOfString() { return true; }

    public void append(String data) {}

    public void append(char ch) {}

    private String _idRef;
    private String _id;
    private boolean _inString;
    private StringBuffer _data;

}

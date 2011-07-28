
package com.webobjects.foundation.xml;

import com.webobjects.foundation.NSMutableDictionary;
import com.webobjects.foundation._NSMutableIntegerDictionary;
import java.io.IOException;
import org.xml.sax.Attributes;


final class _NSFieldTxr extends _NSTagTransformer
    implements NSXMLObjectStreamConstants {
    static class ArrayClassSignature {


        ArrayClassSignature() { return null; }

        String sig;
        char code;

    }



    private static String classSignature(String className) { return null; }

    static String arrayClassSignature(String className, char typeCode[]) { return null; }

    private static String arrayFieldSignature(String className) { return null; }

    private static String arraySig(String className, StringBuffer buf) { return null; }

    public _NSFieldTxr(_NSTransformHandler aHandler, _NSTagTransformer txr) { return null; }

    public void handleStart(String tag, Attributes attributes) throws IOException {}

    static  {}

    private static _NSMutableIntegerDictionary TYPESTRING_TO_CODE;
    private static NSMutableDictionary TYPE_TO_CLASS_SIG;
    private static NSMutableDictionary TYPE_TO_FIELD_SIG;
    private _NSClassTxr _classTxr;

}

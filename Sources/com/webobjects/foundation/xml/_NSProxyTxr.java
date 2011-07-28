
package com.webobjects.foundation.xml;

import java.io.ByteArrayOutputStream;
import java.io.IOException;
import org.xml.sax.Attributes;


final class _NSProxyTxr extends _NSTagTransformer
    implements NSXMLObjectStreamConstants {
    static final class _NSInterfaceTxr extends _NSTagTransformer {


        public _NSInterfaceTxr(_NSTransformHandler aHandler, _NSProxyTxr proxyTxr) { return null; }

        public void handleStart(String tag, Attributes attributes) throws IOException {}

        private _NSProxyTxr _proxyTxr;

    }



    public _NSProxyTxr(_NSTransformHandler aHandler) { return null; }

    public void handleStart(String tag, Attributes attributes) throws IOException {}

    public void handleEnd(String tag, String data) throws IOException {}

    private String _idRef;
    ByteArrayOutputStream _baos;
    int _numIfaces;

}

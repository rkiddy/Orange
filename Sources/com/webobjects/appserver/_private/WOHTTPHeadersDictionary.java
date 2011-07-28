
package com.webobjects.appserver._private;

import com.webobjects.foundation.*;
import java.util.*;


public class WOHTTPHeadersDictionary extends WOCaseInsensitiveDictionary
    implements NSDisposable {
    protected class WOHTTPHeaderValuePool extends WOObjectPool {


        public WOHTTPHeaderValuePool(int size) { return null; }

        public NSDisposable newInstance() { return null; }

        public String highWaterMarkPropertyKey() { return null; }

        public int highWaterMarkSize() { return 0; }

        final WOHTTPHeadersDictionary this$0;

    }

    protected class WOHTTPHeaderPool extends WOObjectPool {


        public WOHTTPHeaderPool(int size) { return null; }

        public NSDisposable newInstance() { return null; }

        public String highWaterMarkPropertyKey() { return null; }

        final WOHTTPHeadersDictionary this$0;

    }

    public static class WOHTTPHeader
        implements NSDisposable {


        public WOHTTPHeader(WOLowercaseCharArray aKey, NSMutableArray someValues) { return null; }

        public void dispose() {}

        public String toString() { return null; }

        protected WOLowercaseCharArray key;
        protected NSMutableArray values;

    }



    public WOHTTPHeadersDictionary() { return null; }

    public WOHTTPHeadersDictionary(int size) { return null; }

    public void dispose() {}

    public Map headerDictionary() { return null; }

    public WOHTTPHeaderValue setBufferForKey(byte buffer[], int value_offset, int value_length, int key_offset, int key_length) { return null; }

    public WOLowercaseCharArray lastInsertedKey() { return null; }

    protected Object _objectForKey(Object key) { return null; }

    protected Object _removeObjectForKey(Object key) { return null; }

    private Object _objectForKey(Object key, boolean changeHeaderValuesToString) { return null; }

    public Object _realObjectForKey(Object key) { return null; }

    public String toString() { return null; }

    static final long serialVersionUID = 0x9cc28d4L;
    private static final int _TheHeadersDictionarySize = 20;
    private static final int _TheHeaderValuesMultiplier = 5;
    private static final String HighWaterHeadersSize = "WOMaxHeaders";
    WOHTTPHeaderPool _headerPool;
    private WOHTTPHeaderValuePool _valuePool;
    private WOLowercaseCharArray _lastKey;

}

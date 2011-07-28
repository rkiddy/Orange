
package com.webobjects.appserver._private;

import com.webobjects.foundation.*;
import java.net.URLDecoder;
import java.net.URLEncoder;
import java.util.*;
import org.apache.log4j.Logger;

public class WOCGIFormValues {
    public static class Decoder {

        protected Decoder() { return null; }

        public NSDictionary decodeCGIFormValues(String value, String encoding) { return null; }

        public void decodeObject(NSMutableDictionary formValues, String encodedValue, String encoding) {}

        protected void setObjectForKeyInDictionary(Object value, String key, NSMutableDictionary dictionary) {}

        protected String getRootKeyPath(String encodedKeyPath, int indexDot) { return null; }

        protected String getRemainingKeyPath(String encodedKeyPath, int indexDot) { return null; }

        protected String getKeyPath(String encodedValue, int indexEqual) { return null; }

        protected String getValue(String encodedValue, int indexEqual) { return null; }

        protected String decode(String value, String encoding) { return null; }
    }

    public static class Encoder {


        protected Encoder() { return null; }

        public String encodeAsCGIFormValues(Map values, String encoding) { return null; }

        public String encodeAsCGIFormValues(Map values, String encoding, boolean entityEscapeAmpersand) { return null; }

        public NSArray encodeObject(Object value, String path, String encoding) { return null; }

        public NSArray encodeDictionary(NSDictionary values, String path, String encoding) { return null; }

        public NSArray encodeArray(NSArray values, String path, String encoding) { return null; }

        public NSArray encodeString(String value, String path, String encoding) { return null; }

        protected String encode(String value, String encoding) { return null; }

        static  {}

        private static Logger logger;

    }



    protected WOCGIFormValues() { return null; }

    public static WOCGIFormValues getInstance() { return null; }

    public Encoder encoder() { return null; }

    public Decoder decoder() { return null; }

    public String encodeAsCGIFormValues(Map values) { return null; }

    public String encodeAsCGIFormValues(Map values, boolean entityEscapeAmpersand) { return null; }

    public NSDictionary decodeCGIFormValues(String value) { return null; }

    public NSDictionary decodeCGIFormValues(String value, String encoding) { return null; }

    public NSDictionary decodeDataFormValues(String value, String encoding) { return null; }

    public String getWOURLEncoding(String value) { return null; }

    public void setUrlEncoding(String value) {}

    public String urlEncoding() { return null; }

    protected String _woURLEncoding;
    protected static WOCGIFormValues _instance;
    public static final String WOURLEncoding = "WOURLEncoding";

}


package com.webobjects.appserver._private;

import com.webobjects.foundation.*;

public class WOEncodingDetector {
    public static interface Delegate {

        public abstract String encodingDetectorWillFallback(WOEncodingDetector woencodingdetector);
    }



    private static boolean couldBeUTF16BigEndian(byte bytes[], int offset) { return null; }

    private static boolean couldBeUTF16SmallEndian(byte bytes[], int offset) { return null; }

    protected static boolean is7bitString(byte bytes[], int offset, int length) { return null; }

    protected static boolean isISOSequence(byte bytes[], int offset, boolean isThreeBytes) { return null; }

    protected static boolean isISO2022JPString(byte bytes[], int offset, int length) { return null; }

    protected static boolean isUnicodeString(byte bytes[], int offset, int length) { return null; }

    protected static boolean isShiftJISString(byte bytes[], int offset, int len) { return null; }

    protected static boolean isJapaneseEUCString(byte bytes[], int offset, int len) { return null; }

    private static boolean _properFollowingUTF8Bytes(byte bytes[], int offset, int length, int count) { return null; }

    protected static boolean isUTF8String(byte bytes[], int offset, int len) { return null; }

    private String _realGuessEncoding(byte bytes[], int offset, int length, String otherFallbackEncoding) { return null; }

    public static synchronized WOEncodingDetector sharedInstance() { return null; }

    public WOEncodingDetector() { return null; }

    public String fallbackEncoding() { return null; }

    public void setFallbackEncoding(String theEncoding) {}

    public Object _mthdelegate() { return null; }

    public void setDelegate(Object theDelegate) {}

    public String guessEncodingForData(NSData data) { return null; }

    public String guessEncodingForData(NSData data, String otherFallbackEncoding) { return null; }

    public String guessEncodingForData(byte data[]) { return null; }

    public String guessEncodingForData(byte data[], String otherFallbackEncoding) { return null; }

    public boolean couldBeUTF16(byte bytes[], int offset) { return true; }

    public static String detectEncodingWithDefaultEncoding(NSData self, String anEncoding) { return null; }

    static  {}

    protected static WOEncodingDetector WOEncodingDetectorInstance;
    private static final byte BOM_MOST_SIGNIFICATNT_BIT = -2;
    private static final byte BOM_LEAST_SIGNIFICATNT_BIT = -1;
    protected String fallbackEncoding;
    protected _NSDelegate _flddelegate;

}

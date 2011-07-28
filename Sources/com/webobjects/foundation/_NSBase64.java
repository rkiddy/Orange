
package com.webobjects.foundation;

import java.io.UnsupportedEncodingException;

public final class _NSBase64 {


    public _NSBase64() { return null; }

    protected static boolean isWhiteSpace(byte octect) { return null; }

    protected static boolean isPad(byte octect) { return null; }

    protected static boolean isData(byte octect) { return null; }

    protected static boolean isBase64(byte octect) { return null; }

    public static byte[] encode(byte binaryData[], int off, int len) { return null; }

    public static byte[] encode(byte binaryData[]) { return null; }

    public static byte[] decode(byte base64Data[]) { return null; }

    public static String decode(String base64Data) { return null; }

    static  {}

    private static final int BASELENGTH = 255;
    private static final int LOOKUPLENGTH = 64;
    private static final int TWENTYFOURBITGROUP = 24;
    private static final int EIGHTBIT = 8;
    private static final int SIXTEENBIT = 16;
    private static final int FOURBYTE = 4;
    private static final int SIGN = -128;
    private static final byte PAD = 61;
    private static byte base64Alphabet[];
    private static byte lookUpBase64Alphabet[];

}

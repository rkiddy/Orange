
package com.webobjects.appserver._private;

import com.webobjects.foundation.NSLog;
import java.io.DataInputStream;
import java.io.IOException;


public class WOJPEGHeaderScanner extends WOImageHeaderScanner {


    public WOJPEGHeaderScanner() { return null; }

    public void scan() throws IOException {}

    public int getByte() throws IOException { return 0; }

    public int getInt() { return 0; }

    public int nextMarker() throws IOException { return 0; }

    public int firstMarker() throws IOException { return 0; }

    public void skipVariable() throws IOException {}

    public void processSOFn(int marker) throws IOException {}

    static final int M_SOF0 = 192;
    static final int M_SOF1 = 193;
    static final int M_SOF2 = 194;
    static final int M_SOF3 = 195;
    static final int M_SOF5 = 197;
    static final int M_SOF6 = 198;
    static final int M_SOF7 = 199;
    static final int M_SOF9 = 201;
    static final int M_SOF10 = 202;
    static final int M_SOF11 = 203;
    static final int M_SOF13 = 205;
    static final int M_SOF14 = 206;
    static final int M_SOF15 = 207;
    static final int M_SOI = 216;
    static final int M_EOI = 217;
    static final int M_SOS = 218;
    static final int M_COM = 254;

}

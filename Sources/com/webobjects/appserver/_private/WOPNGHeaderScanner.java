
package com.webobjects.appserver._private;

import com.webobjects.foundation.NSForwardException;
import com.webobjects.foundation.NSLog;
import java.io.DataInputStream;
import java.io.IOException;


public class WOPNGHeaderScanner extends WOImageHeaderScanner {
    class PNGChunk {


        public PNGChunk(int aLength, int aType, byte aData[], int aCrc) { return null; }

        public int getLength() { return 0; }

        public int getType() { return 0; }

        public String getTypeString() { return null; }

        public byte[] getData() { return null; }

        public byte getByte(int offset) { return null; }

        public int getInt1(int offset) { return 0; }

        public int getInt2(int offset) { return 0; }

        public int getInt4(int offset) { return 0; }

        public String getString4(int offset) { return null; }

        public boolean isType(String typeName) { return true; }

        int length;
        int type;
        byte data[];
        int crc;
        String typeString;
        final WOPNGHeaderScanner this$0;

    }



    public WOPNGHeaderScanner() { return null; }

    public void scan() throws IOException {}

    private void _readSignature() throws IOException {}

    private void _parseIHDRChunk() {}

    private void _readChunks() throws IOException {}

    private PNGChunk _readChunk() throws IOException { return null; }

    private void _addChunk(PNGChunk chunk) {}

    private PNGChunk _getChunk(String type) { return null; }

    private int mNumberOfChunks;
    private PNGChunk mChunks[];

}

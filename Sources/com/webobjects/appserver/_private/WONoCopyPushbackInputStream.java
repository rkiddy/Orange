
package com.webobjects.appserver._private;

import java.io.*;
import java.util.LinkedList;
import java.util.ListIterator;

public class WONoCopyPushbackInputStream extends FilterInputStream {
    class PushbackBuffer {


        PushbackBuffer(byte b[], int p, int l) { return null; }

        byte buf[];
        int pos;
        int length;
        final WONoCopyPushbackInputStream this$0;

    }



    private void ensureOpen() throws IOException {}

    public WONoCopyPushbackInputStream(InputStream ins, int maxBytes) { return null; }

    public int read() throws IOException { return 0; }

    public int read(byte b[]) throws IOException { return 0; }

    public int read(byte buffer[], int offset, int length) throws IOException { return 0; }

    public void unread(byte b[], int off, int len) throws IOException {}

    public void unread(byte b[]) throws IOException {}

    public int available() throws IOException { return 0; }

    public int theoreticallyAvailable() { return 0; }

    public long skip(long numberOfBytesToSkip) throws IOException { return 0L; }

    public boolean markSupported() { return true; }

    public synchronized void close() throws IOException { return null; }

    public void drain() throws IOException {}

    public int readMax() { return 0; }

    public int originalReadMax() { return 0; }

    public boolean wasPrematurelyTerminated() { return true; }

    LinkedList buffers;
    byte oneByteArray[];
    int readMax;
    int originalReadMax;
    boolean prematureTermination;

}

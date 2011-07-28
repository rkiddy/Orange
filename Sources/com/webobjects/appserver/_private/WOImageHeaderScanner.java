
package com.webobjects.appserver._private;

import java.io.DataInputStream;
import java.io.IOException;

public abstract class WOImageHeaderScanner {


    public WOImageHeaderScanner() { return null; }

    protected void setStream(DataInputStream image) {}

    public int getHeight() { return 0; }

    public int getWidth() { return 0; }

    public abstract void scan() throws IOException;

    protected DataInputStream inputStream;
    protected int height;
    protected int width;

}

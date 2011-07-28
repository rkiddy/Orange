
package com.webobjects.appserver._private;

import com.webobjects.foundation.*;
import java.io.*;
import java.net.URL;


public class WOImageInfo {


    private WOImageInfo() { return null; }

    public WOImageInfo(URL anImageFileURL) throws IOException, FileNotFoundException { return null; }

    public static NSArray getSupportedExtensions() { return null; }

    public static boolean isSupportedExtension(String aFileExtension) { return null; }

    public static boolean pathHasSupportedExtension(String aPath) { return null; }

    public int width() { return 0; }

    public int height() { return 0; }

    public String widthString() { return null; }

    public String heightString() { return null; }

    public String toString() { return null; }

    private DataInputStream _readImageFromURL(URL anImageFileURL) throws FileNotFoundException, IOException { return null; }

    private void _setImageDimensionUsingScanner(WOImageHeaderScanner scanner) throws IOException {}

    private static WOImageHeaderScanner _getScannerForExtension(String aFileExtension) { return null; }

    static  {}

    private int _width;
    private int _height;
    private String _widthString;
    private String _heightString;
    static WOCaseInsensitiveDictionary theSubclassPerExtensionDictionary;
    public static final WOImageInfo ImageInfoNotFoundMarker;

}

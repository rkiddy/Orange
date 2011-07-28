
package com.webobjects.appserver._private;

import com.webobjects.foundation.*;
import java.net.URL;

public class WOFileCacheManager {


    public WOFileCacheManager() { return null; }

    public String toString() { return null; }

    public static WOFileCacheManager manager() { return null; }

    private NSMutableDictionary getPathTimeStampDictionary(URL path) { return null; }

    private long getPathTimeStampForReader(URL path, Object aReader) { return 0L; }

    public void pathURLWasRead(URL path, Object aReader) {}

    public boolean hasPathURLBeenModified(URL path, Object aReader) { return true; }

    static  {}

    private final _NSThreadsafeMutableDictionary _TheTimeStampsDictKeyedByFilePath;
    private static final WOFileCacheManager _manager;

}

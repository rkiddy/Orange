
package com.webobjects.appserver._private;

import com.webobjects.appserver.WOApplication;
import com.webobjects.appserver.WOAssociation;
import com.webobjects.foundation.NSMutableArray;
import com.webobjects.foundation.NSMutableDictionary;
import java.net.URL;
import java.util.Enumeration;


public class WOImagemapRegion {


    protected WOImagemapRegion(WOAssociation anAction, WOGeometricRegion aRegion) { return null; }

    private static NSMutableArray _imagemapRegionsWithPathURL(URL aFileURL) { return null; }

    protected static NSMutableArray imagemapRegionsWithPathURL(URL aFileURL) { return null; }

    public WOAssociation hitTest(WOPoint pt) { return null; }

    public String toString() { return null; }

    static  {}

    private WOAssociation _action;
    private WOGeometricRegion _region;
    private static final NSMutableDictionary _theImageMapRegionArrayCache;
    private static final String TheDefaultCacheKey = "WOImagemapRegion";
    public static final char DIRECT_ACTION_DELIMITER = 47;

}

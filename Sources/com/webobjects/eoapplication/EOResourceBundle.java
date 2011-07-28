
package com.webobjects.eoapplication;

import com.webobjects.foundation.*;
import java.io.*;
import java.net.URL;
import java.util.*;
import javax.swing.Icon;
import javax.swing.ImageIcon;


public class EOResourceBundle extends ResourceBundle
    implements EOUserInterfaceParameters._IconHandler {
    private static class _Enumeration
        implements Enumeration {


        public _Enumeration(NSArray stringKeys, NSArray imageKeys) { return null; }

        public boolean hasMoreElements() { return true; }

        public Object nextElement() { return null; }

        int index;
        private NSMutableArray _keys;

    }

    private static class _ResourceInfo {


        public _ResourceInfo(NSBundle bundle, String resourcePath) { return null; }

        public String resourcePath() { return null; }

        public NSBundle bundle() { return null; }

        public boolean equals(Object object) { return true; }

        public String toString() { return null; }

        private NSBundle _bundle;
        private String _resourcePath;

    }



    public static NSArray _ignoreResourceBundleNames() { return null; }

    public static NSArray _resourceBundles() { return null; }

    public static NSDictionary _resourceBundlesToResourcePathsMapTable(String extensions[]) { return null; }

    public static String _stringFromBundleResource(NSBundle bundle, String resourcePath) throws IOException { return null; }

    public EOResourceBundle() { return null; }

    private static boolean _shouldIgnoreResourcePath(String resourcePath) { return null; }

    private NSArray _platformSensitiveResourcePathsFromBundle(NSBundle bundle, String extension, boolean onlyPlatformIndependentResourceNames) { return null; }

    private NSArray _availableIconNames(NSArray bundles) { return null; }

    public NSDictionary _iconInfos(NSDictionary bundlesMapTable, NSArray bundles, NSArray localeIndicators, NSArray platformIndicators) { return null; }

    public NSArray _stringTableInfos(NSDictionary bundlesMapTable, NSArray bundles, NSArray localeIndicators, NSArray platformIndicators) { return null; }

    private NSDictionary _stringTableFromInfo(_ResourceInfo stringTableInfo) { return null; }

    public ImageIcon _iconFromURL(String url) { return null; }

    private ImageIcon _iconFromInfo(_ResourceInfo iconInfo) { return null; }

    private void _generateValues() {}

    private NSDictionary _stringToLocalizedStringMapTable() { return null; }

    private NSDictionary _iconNameToIconInfoMapTable() { return null; }

    public String _nameForLocalizedIcon(Icon icon) { return null; }

    protected Object handleGetObject(String key) throws MissingResourceException { return null; }

    public Enumeration getKeys() { return null; }

    static  {}

    public static final String _EOIconFileExtensions[];
    public static final String _EOStringTableFileExtension = "strings";
    public static final String _EOAllResourcesFileExtensions[];
    public static final String _NonLocalizedResourcePath;
    public static final String _ResourcePathLanguageExtension;
    private static final String _EONoResourceFrameworksKey = "_EONoResourceFrameworks";
    private static NSMutableArray _bundles;
    private NSArray _stringTableInfos;
    private NSDictionary _iconNameToIconInfoMapTable;
    private NSMutableDictionary _stringToLocalizedStringMapTable;
    private NSMutableDictionary _iconNameToLocalizedIconMapTable;

}


package com.webobjects.appserver;

import com.webobjects.appserver._private.WODeployedBundle;
import com.webobjects.appserver._private.WOEncodingDetector;
import com.webobjects.appserver._private.WOImageInfo;
import com.webobjects.appserver._private.WOProjectBundle;
import com.webobjects.appserver._private.WOURLEncoder;
import com.webobjects.appserver._private.WOURLValuedElementData;
import com.webobjects.foundation.*;
import java.io.*;
import java.net.URL;
import java.util.Enumeration;


public class WOResourceManager {


    protected WOResourceManager() { return null; }

    public String toString() { return null; }

    private static NSMutableDictionary _initContentTypes() { return null; }

    public static InputStream __getJavaWebObjectsResourceAsStream(String name) throws IllegalStateException { return null; }

    private static WODeployedBundle _initAppBundle() { return null; }

    public String contentTypeForResourceNamed(String aResourcePath) { return null; }

    private static WODeployedBundle _bundleWithNSBundle(NSBundle nsBundle) { return null; }

    private static WODeployedBundle _locateBundleForFrameworkNamed(String aFrameworkName) { return null; }

    public WODeployedBundle _cachedBundleForFrameworkNamed(String aFrameworkName) { return null; }

    private void _initFrameworkProjectBundles() {}

    public NSArray _frameworkProjectBundles() { return null; }

    public InputStream inputStreamForResourceNamed(String aResourceName, String aFrameworkName, NSArray aLanguagesList) { return null; }

    public byte[] bytesForResourceNamed(String aResourceName, String aFrameworkName, NSArray aLanguagesList) { return null; }

    /**
     * @deprecated Method pathForResourceNamed is deprecated
     */

    public String pathForResourceNamed(String aResourceName, String aFrameworkName, NSArray aLanguagesList) { return null; }

    public URL pathURLForResourceNamed(String aResourceName, String aFrameworkName, NSArray aLanguagesList) { return null; }

    private String _cachedURLForResource(String aResourceName, String aFrameworkName, NSArray aLanguagesList) { return null; }

    public String _completeURLForResourceNamed(String aResourceName, String aFrameworkName, NSArray aLanguagesList, WORequest aRequest, boolean isSecure, int somePort) { return null; }

    public String urlForResourceNamed(String aResourceName, String aFrameworkName, NSArray aLanguagesList, WORequest aRequest) { return null; }

    public String errorMessageUrlForResourceNamed(String aResourceName, String aFrameworkName) { return null; }

    public WOImageInfo _imageInfoForUrl(String anImageURL, String anImageName, String aFrameworkName, NSArray aLanguageArray) { return null; }

    private NSDictionary _stringsTable(String aTableName, String aFrameworkName, String aLanguage) { return null; }

    private NSDictionary _cachedStringsTable(String aTableName, String aFrameworkName, String aLanguage) { return null; }

    private String _cachedStringForKey(String aKey, String aTableName, String aFrameworkName, String aLanguage) { return null; }

    private String _stringForKey(String aKey, String aTableName, String aFrameworkName, NSArray aLanguagesList) { return null; }

    public String stringForKey(String aKey, String aTableName, String aDefaultValue, String aFrameworkName, NSArray aLanguagesList) { return null; }

    public NSDictionary _contentTypesDictionary() { return null; }

    public void _cacheData(WOURLValuedElementData uved) {}

    public WOURLValuedElementData _cachedDataForKey(String aKey) { return null; }

    private WOURLValuedElementData cachedDataForKey(String aKey) { return null; }

    public URL _pathURLForJavaClass(String javaClass) { return null; }

    protected String _pathForResourceNamed(String aResourceName, String aFrameworkName, String aLanguageString, boolean refreshProjectOnCacheMiss) { return null; }

    protected URL _pathURLForResourceNamed(String aResourceName, String aFrameworkName, String aLanguageString, boolean refreshProjectOnCacheMiss) { return null; }

    public void setData(NSData someData, String key, String type, WOSession aSession) {}

    public void removeDataForKey(String aKey, WOSession aSession) {}

    public void flushDataCache() {}

    public WODeployedBundle _appProjectBundle() { return null; }

    static  {}

    private final _NSThreadsafeMutableDictionary _frameworkProjectBundles;
    private final _NSThreadsafeMutableDictionary _urlValuedElementsData;
    private volatile NSMutableArray _frameworkClassPaths;
    private final _NSThreadsafeMutableDictionary _imageInfoDictionary;
    private WODeployedBundle TheAppProjectBundle;
    private final _NSThreadsafeMutableDictionary TheStringsTableDictionary;
    private final NSDictionary TheContentTypes;
    private static final NSDictionary StringTableNotFoundMarker;
    private static final WOImageInfo ImageInfoNotFoundMarker;

}

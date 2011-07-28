
package com.webobjects.appserver._private;

import com.webobjects.appserver.WOApplication;
import com.webobjects.foundation.*;
import java.io.*;
import java.net.URL;
import java.util.Enumeration;


public class WODeployedBundle {


    public WODeployedBundle(NSBundle nsb) { return null; }

    public WODeployedBundle(String projectPath, NSBundle nsb) { return null; }

    public static WODeployedBundle deployedBundle() { return null; }

    private void _newAddToRelativePaths(File aFile, int pathIndex, int keyPathIndex) {}

    private void _jarAddToRelativePaths(String aFile) {}

    private void _newPreloadAllResourcesInLanguageDirectory(File aDirectory, int pathIndex, int keyPathIndex) {}

    private void _jarPreloadAllResourcesInLanguageDirectory(String aDirectory) {}

    protected void _newPreloadAllResourcesInSubDirectory(File aDir, int pathIndex, int keyPathIndex, NSMutableArray array) {}

    protected void _jarPreloadAllResourcesInSubDirectory(String aDirectory, NSMutableArray array) {}

    private void _newPreloadAllResourcesInTopDirectory(String aDirectory) {}

    private void _jarPreloadAllResourcesInTopDirectory(String aDirectory) {}

    private void addToExpectedLanguages(String aLanguage) {}

    private NSArray expectedLanguages() { return null; }

    private boolean isLocalized() { return true; }

    private synchronized void _preloadAllResourcesIfNecessary() { return null; }

    public String relativePathForResource(String aResourceName, NSArray aLanguagesList) { return null; }

    public String relativePathForResource(String aResourceName, String aLanguageString) { return null; }

    private String _cachedAbsolutePath(String aRelativePath) { return null; }

    private URL _cachedPathURL(String aRelativePath) { return null; }

    private String _absolutePathForRelativePath(String aRelativePath) { return null; }

    private URL _pathURLForRelativePath(String aRelativePath) { return null; }

    public String _absolutePathForResource(String aResourceName, NSArray aLanguagesList) { return null; }

    public String _absolutePathForResource(String aResourceName, String aLanguage, boolean refresh) { return null; }

    public String _absolutePathForResource(String aResourceName, String aLanguage) { return null; }

    public InputStream inputStreamForResourceNamed(String aResourceName, NSArray aLanguagesList) { return null; }

    public InputStream inputStreamForResourceNamed(String aResourceName, String aLanguage) { return null; }

    public URL pathURLForResourceNamed(String aResourceName, String aLanguageString, boolean refreshProjectOnCacheMiss) { return null; }

    public URL pathURLForResourceNamed(String aResourceName, String aLanguageString) { return null; }

    public URL pathURLForResourceNamed(String aResourceName, NSArray aLanguagesList) { return null; }

    private String _cachedURL(String aRelativePath) { return null; }

    public String urlForResource(String aResourceName, NSArray aLanguagesList) { return null; }

    public String bundlePath() { return null; }

    protected String _initBundlePath(String aPath) { return null; }

    protected URL _initBundleURL(URL anURL) { return null; }

    protected String _initProjectName(String aProjectName) { return null; }

    public String projectName() { return null; }

    public String wrapperName() { return null; }

    public boolean isFramework() { return true; }

    public boolean isAggregate() { return true; }

    public boolean isJar() { return true; }

    public NSBundle nsBundle() { return null; }

    public WOProjectBundle projectBundle() { return null; }

    public static synchronized WODeployedBundle bundleWithPath(String aPath) { return null; }

    public static synchronized WODeployedBundle bundleWithNSBundle(NSBundle nsBundle) { return null; }

    private boolean _isWebServerResource(String resourceName) { return true; }

    private boolean _isAnyWebServerResource(String pathName) { return true; }

    public NSArray _allResourceNamesWithExtension(String extension, boolean webServerResourcesOnly) { return null; }

    public static synchronized WODeployedBundle deployedBundleForFrameworkNamed(String aFrameworkName) { return null; }

    public String toString() { return null; }

    static  {}

    private final NSMutableDictionary _absolutePaths;
    private final NSMutableDictionary _pathURLs;
    protected final String _bundlePath;
    protected final boolean _isFramework;
    protected final String _projectName;
    private final _NSThreadsafeMutableDictionary _relativePaths;
    private boolean _resourcesHaveBeenPreloaded;
    private final NSMutableDictionary _URLs;
    protected final String _wrapperName;
    private final NSMutableSet _expectedLanguages;
    private boolean _isJar;
    private NSBundle _nsBundle;
    private static final NSMutableDictionary TheBundles;
    private static final boolean _allowRapidTurnaround;
    private static final String _webServerResources = "/WebServerResources";
    private static final String _resources = "/Resources";
    private static final String _cvs = "/CVS";
    private static final String _versions = "/Versions";
    private static final String _contentsWebServerResourcesPathKey = "Contents/WebServerResources/";
    private static final String _webServerResourcesPathKey = "WebServerResources/";

}

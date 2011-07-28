
package com.webobjects.foundation;

import java.io.*;
import java.net.*;
import java.util.*;
import java.util.jar.JarFile;
import java.util.zip.ZipEntry;


public class NSBundle {
    private static class SpecificResourceFilter
        implements FilenameFilter {


        public SpecificResourceFilter(String aName) { return null; }

        public boolean accept(File dir, String aName) { return true; }

        private String name;

    }

    private static class ResourceFilter
        implements FilenameFilter {


        public ResourceFilter(String anExtension) { return null; }

        public boolean accept(File dir, String aName) { return true; }

        private String extension;

    }

    private static class ResourceDirectoryFilter
        implements FilenameFilter {


        public ResourceDirectoryFilter(String anExtension) { return null; }

        public boolean accept(File dir, String aName) { return true; }

        private String extension;

    }

    private static class OldResourceFilter
        implements FilenameFilter {


        public OldResourceFilter(String anExtension) { return null; }

        public boolean accept(File dir, String aName) { return true; }

        private String extension;

    }

    static class InfoDictFilter
        implements FilenameFilter {


        InfoDictFilter() { return null; }

        public boolean accept(File dir, String aName) { return true; }

        private static final String INFO_DICT_NAME = "Info.plist";

    }

    static class FilesFilter
        implements FilenameFilter {

        FilesFilter() { return null; }

        public boolean accept(File dir, String aName) { return true; }
    }

    static class DirectoryFilter
        implements FilenameFilter {

        DirectoryFilter() { return null; }

        public boolean accept(File dir, String aName) { return true; }
    }



    private static final String __exctractStringFromURL(URL anURL) { return null; }

    private NSBundle() { return null; }

    /**
     * @deprecated Method allBundles is deprecated
     */

    public static synchronized NSArray allBundles() { return null; }

    /**
     * @deprecated Method allFrameworks is deprecated
     */

    public static NSArray allFrameworks() { return null; }

    public static synchronized NSBundle bundleForClass(Class aClass) { return null; }

    /**
     * @deprecated Method bundleWithPath is deprecated
     */

    public static NSBundle bundleWithPath(String aPath) { return null; }

    public static NSBundle _bundleWithPathShouldCreateIsJar(String aPath, boolean shouldCreateBundle, boolean newIsJar) { return null; }

    public static synchronized NSBundle bundleForName(String aName) { return null; }

    public static synchronized NSBundle _appBundleForName(String aName) { return null; }

    public static synchronized NSArray frameworkBundles() { return null; }

    public static void _setMainBundle(NSBundle bundle) { return null; }

    public static NSBundle mainBundle() { return null; }

    private static boolean couldBeABundle(String aPath) { return null; }

    private static void transferPropertiesFromSourceToDest(Properties sourceProps, Properties destProps) { return null; }

    private static void LoadUserAndBundleProperties() { return null; }

    private static void InitMainBundle() { return null; }

    /**
     * @deprecated Method _setPrincipalClassWarningSuppressed is deprecated
     */

    public static void _setPrincipalClassWarningSuppressed(boolean flag1) { return null; }

    private static void InitPrincipalClasses() { return null; }

    private static void LoadBundlesFromJars(NSArray array) { return null; }

    private static void LoadBundlesFromClassPath(NSArray array) { return null; }

    private static String DefaultLocalePrefix() { return null; }

    private static synchronized NSBundle LookupBundleWithPath(String aPath) { return null; }

    public static NSArray _allBundlesReally() { return null; }

    private static synchronized NSBundle CreateBundleWithPath(String aPath, boolean newIsJar) { return null; }

    private static String NormalizeExistingBundlePath(String aPath) { return null; }

    private static String CleanNormalizedBundlePath(String standardizedPath) { return null; }

    private static OldResourceFilter OldResourceFilterForExtension(String anExtension) { return null; }

    private static ResourceDirectoryFilter ResourceDirectoryFilterForExtension(String anExtension) { return null; }

    private static ResourceFilter ResourceFilterForExtension(String anExtension) { return null; }

    static Class searchAllBundlesForClassWithName(String className) { return null; }

    private static Class searchForClassInBundles(String className, NSArray bundles, boolean registerPackageOnHit) { return null; }

    public NSArray bundleClassPackageNames() { return null; }

    /**
     * @deprecated Method bundlePath is deprecated
     */

    public String bundlePath() { return null; }

    public URL bundlePathURL() { return null; }

    public String _bundleURLPrefix() { return null; }

    public byte[] bytesForResourcePath(String aResourcePath) { return null; }

    public NSArray bundleClassNames() { return null; }

    /**
     * @deprecated Method infoDictionary is deprecated
     */

    public NSDictionary infoDictionary() { return null; }

    public NSDictionary _infoDictionary() { return null; }

    public URL pathURLForResourcePath(String aResourcePath) { return null; }

    public URL _pathURLForResourcePath(String aResourcePath, boolean returnDirectories) { return null; }

    public InputStream inputStreamForResourcePath(String aResourcePath) { return null; }

    public boolean isFramework() { return true; }

    public boolean _isCFBundle() { return true; }

    public boolean isJar() { return true; }

    public JarFile _jarFile() { return null; }

    public NSDictionary _jarFileLayout() { return null; }

    /**
     * @deprecated Method load is deprecated
     */

    public boolean load() { return true; }

    public String name() { return null; }

    public boolean _directoryExistsInJar(String path) { return true; }

    /**
     * @deprecated Method pathForResource is deprecated
     */

    public String pathForResource(String aName, String anExtension) { return null; }

    /**
     * @deprecated Method pathForResource is deprecated
     */

    public String pathForResource(String aName, String anExtension, String aSubDirPath) { return null; }

    /**
     * @deprecated Method pathsForResources is deprecated
     */

    public NSArray pathsForResources(String anExtension, String aSubDirPath) { return null; }

    public Class principalClass() { return null; }

    public Properties properties() { return null; }

    /**
     * @deprecated Method resourcePath is deprecated
     */

    public String resourcePath() { return null; }

    public URL _urlForRelativePath(String path) { return null; }

    public String resourcePathForLocalizedResourceNamed(String aName, String aSubDirPath) { return null; }

    public NSArray resourcePathsForDirectories(String extension, String aSubDirPath) { return null; }

    public NSArray resourcePathsForLocalizedResources(String extension, String aSubDirPath) { return null; }

    public NSArray resourcePathsForResources(String extension, String aSubDirPath) { return null; }

    public String toString() { return null; }

    private void addResourceBucket(String aBundleSubDirPath) {}

    public Class _classWithName(String className) { return null; }

    private NSArray classNamesFromDirectory(File aDirectory) { return null; }

    private boolean couldBeAFramework() { return true; }

    private void initIsJar(boolean newIsJar) {}

    private void initBundlePath(String newBundlePath) {}

    private void initBundleURLPrefix() {}

    private void initJarFileLayout() {}

    private void initBundleType() {}

    private void initClassNames() {}

    private void initInfoDictionary() {}

    private void initName() {}

    private void initPackages() {}

    private void initPrincipalClass() {}

    private static Properties initPropertiesFromInputStreamWithParent(InputStream is, Properties parent) throws IOException { return null; }

    private void initProperties() {}

    private void initResourceBuckets() {}

    private void initContentsPath() {}

    private void initResourcePath() {}

    private void postNotification() {}

    private boolean _prefixPathWithNonLocalizedPrefix(String aPath) { return true; }

    private boolean _prefixPathWithNonLocalizedPrefixJar(String aPath) { return true; }

    private String fixExtension(String anExtension) { return null; }

    public void _simplePathsInDirectoryInJar(String startPath, String dirExtension, NSMutableArray dirs, String fileExtension, NSMutableArray files) {}

    private NSArray resourcePathsForDirectoriesInDirectoryInJar(String startPath, String anExtension, boolean prependNonlocalizedLProj) { return null; }

    private NSArray resourcePathsForDirectoriesInDirectory(String aPath, FilenameFilter aFilter, boolean prependNonlocalizedLProj) { return null; }

    private NSArray resourcePathsForResourcesInDirectoryInJar(String aPath, String anExtension, boolean prependNonlocalizedLProj) { return null; }

    private NSArray resourcePathsForResourcesInDirectory(String aPath, FilenameFilter aFilter, boolean prependNonlocalizedLProj) { return null; }

    private void setClassNames(NSArray classes) {}

    static  {}

    public static final String CFBUNDLESHORTVERSIONSTRINGKEY = "CFBundleShortVersionString";
    public static final String MANIFESTIMPLEMENTATIONVERSIONKEY = "Implementation-Version";
    public static final Class _CLASS;
    public static final String BundleDidLoadNotification = "NSBundleDidLoadNotification";
    public static final String LoadedClassesNotification = "NSLoadedClassesNotification";
    private static final String userDirPath;
    private static final String JSUFFIX;
    private static final String LPROJSUFFIX = ".lproj";
    private static final String MAIN_BUNDLE_NAME = "MainBundle";
    private static final String NONLOCALIZED_LOCALE = "Nonlocalized.lproj";
    private static final String NONLOCALIZED_LOCALE_PREFIX;
    private static final String RESOURCES = "Resources";
    private static final String RSUFFIX;
    private static final String RJSUFFIX;
    private static final String CONTENTS = "Contents";
    private static final String CSUFFIX;
    private static final String CRSUFFIX;
    private static final int NSBUNDLE = 1;
    private static final int CFBUNDLE = 2;
    private static final NSMutableArray AllBundles;
    private static final NSMutableArray AllBundlesReally;
    private static final NSMutableArray AllFrameworks;
    private static final NSMutableDictionary BundlesClassesTable;
    private static final NSArray ClassPath;
    private static final NSMutableDictionary BundlesNamesTable;
    private static final NSMutableDictionary AppBundlesNamesTable;
    private static NSBundle MainBundle;
    private static final _NSThreadsafeMutableDictionary OldResourceFilters;
    private static boolean PrincipalClassLookupAllowed;
    private static final _NSThreadsafeMutableDictionary ResourceDirectoryFilters;
    private static final _NSThreadsafeMutableDictionary ResourceFilters;
    private static final DirectoryFilter TheDirectoryFilter;
    private static final FilesFilter TheFilesFilter;
    private static final InfoDictFilter TheInfoDictFilter;
    private static final _NSUtilities.JavaArchiveFilter TheJavaArchiveFilter;
    private static final _NSUtilities.JavaClassFilter TheJavaClassFilter;
    private static String ResourcesInfoPlist;
    private static String JarResourcesInfoPlist;
    private static String ResourcesProperties;
    private static NSMutableDictionary TheFileDict;
    private static boolean safeInvokeDeprecatedJarBundleAPI;
    private boolean isJar;
    private JarFile jarFile;
    private NSMutableArray jarFileEntries;
    private NSDictionary jarFileLayout;
    private String _bundleURLPrefix;
    private String bundlePath;
    private int bundleType;
    private boolean classesHaveBeenLoaded;
    private NSArray classNames;
    private NSDictionary infoDictionary;
    private boolean isFramework;
    private Properties properties;
    private String name;
    private NSArray packages;
    private Class principalClass;
    private NSMutableArray resourceBuckets;
    private String resourcePath;
    private String contentsPath;
    private String _resourceLocation;
    private static final String jarEndsWithString;


    // Unreferenced inner class com/webobjects/foundation/NSBundle$1

/* anonymous class */
    static class _cls1
        implements _NSUtilities._ResourceSearcher {

        _cls1() { return null; }

        public Class _searchForClassWithName(String className) { return null; }

        public URL _searchPathURLForResourceWithName(Class resourceClass, String resourceName, String extension) { return null; }
    }

}

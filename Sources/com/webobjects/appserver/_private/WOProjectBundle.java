
package com.webobjects.appserver._private;

import com.webobjects._ideservices.*;
import com.webobjects.appserver.WOApplication;
import com.webobjects.foundation.*;
import java.io.File;
import java.io.FilenameFilter;
import java.net.URL;
import java.util.Enumeration;


public class WOProjectBundle extends WODeployedBundle {
    static class PBWOProjectAndDirFilter
        implements FilenameFilter {

        PBWOProjectAndDirFilter() { return null; }

        public boolean accept(File aDir, String aName) { return true; }
    }



    public WOProjectBundle(String aProjectPath, WODeployedBundle aDeployedBundle) { return null; }

    public String toString() { return null; }

    public _WOProject _woProject() { return null; }

    protected String _initBundlePath(String aPath) { return null; }

    protected String _initProjectName(String aProjectName) { return null; }

    public String projectName() { return null; }

    public String projectPath() { return null; }

    public WOProjectBundle projectBundle() { return null; }

    public URL pathURLForResourceNamed(String aResourceName, String aLanguageString, boolean refreshProjectOnCacheMiss) { return null; }

    public URL pathURLForResourceNamed(String aResourceName, String aLanguageString) { return null; }

    public URL pathURLForResourceNamed(String aResourceName, NSArray aLanguagesList) { return null; }

    public String _absolutePathForResource(String aResourceName, NSArray aLanguagesList) { return null; }

    public String _absolutePathForResource(String aResourceName, String aLanguageString) { return null; }

    public String _absolutePathForResource(String aResourceName, String aLanguageString, boolean refreshWOProjectOnCacheMiss) { return null; }

    public String relativePathForResource(String aResourceName, String aLanguageString) { return null; }

    public String relativePathForResource(String aResourceName, NSArray aLanguagesList) { return null; }

    protected static boolean _isProjectBundlePath(String aProjectDirectoryPath) { return null; }

    public static synchronized WODeployedBundle bundleWithPath(String aPath) { return null; }

    protected static NSMutableArray _projectsInDirectory(String aDirectoryPath) { return null; }

    static synchronized NSMutableArray _WOAllProjects() { return null; }

    private static WOProjectBundle _locateBundleInArrayForProjectNamedIsFramework(NSMutableArray aProjectBundleArray, String aProjectName, boolean shouldBeFramework) { return null; }

    public static WOProjectBundle projectBundleForProject(String aProjectName, boolean shouldBeFramework) { return null; }

    public static boolean refreshProjectBundlesOnCacheMiss() { return null; }

    public static void setRefreshProjectBundlesOnCacheMiss(boolean refresh) { return null; }

    static  {}

    private volatile _WOProject _woProject;
    private final String _projectPath;
    private final int _projectPathLength;
    private final WODeployedBundle _associatedDeployedBundle;
    private static final NSMutableDictionary TheProjectBundles;
    private static volatile boolean _refreshProjectBundlesOnCacheMiss;
    private static PBWOProjectAndDirFilter theProjectsInDirectoryFilter;
    protected static NSMutableArray TheProjectsArrayArray;

}


package com.webobjects.eodistribution;

import com.webobjects.appserver.WOComponent;
import com.webobjects.appserver.WOContext;
import com.webobjects.foundation.*;


public class WOJavaClientJNLP extends WOComponent {


    public WOJavaClientJNLP(WOContext context) { return null; }

    public void setApplicationURL(String applicationURL) {}

    public String applicationURL() { return null; }

    public void setPage(String page) {}

    public String page() { return null; }

    public void setChannelClassName(String channelClassName) {}

    public String channelClassName() { return null; }

    public String j2seVersion() { return null; }

    public void setJ2seVersion(String j2seVersion) {}

    public void setApplicationName(String applicationName) {}

    public String applicationName() { return null; }

    public boolean hasApplicationName() { return true; }

    public void setVendor(String vendor) {}

    public String vendor() { return null; }

    public boolean hasVendor() { return true; }

    public void setHomepage(String homepage) {}

    public String homepage() { return null; }

    public boolean hasHomepage() { return true; }

    public void setApplicationDescription(String applicationDescription) {}

    public String applicationDescription() { return null; }

    public boolean hasApplicationDescription() { return true; }

    public void setApplicationIcon(String applicationIcon) {}

    public String applicationIcon() { return null; }

    public boolean hasApplicationIcon() { return true; }

    public void setNeedsAllPermissions(boolean flag) {}

    public boolean needsAllPermissions() { return true; }

    public void setCodebase(String codebase) {}

    public String codebase() { return null; }

    public String jnlpURL() { return null; }

    public void setJarFileNames(NSArray jarFileNames) {}

    public NSArray jarFileNames() { return null; }

    public void setJarFileName(String name) {}

    public String jarFileName() { return null; }

    public String jarFileMain() { return null; }

    public String jarFileDownload() { return null; }

    public String mainClass() { return null; }

    public void setAdditionalMainArguments(NSDictionary additionalMainArguments) {}

    public NSDictionary additionalMainArguments() { return null; }

    public NSArray mainArguments() { return null; }

    public void setMainArgument(String name) {}

    public String mainArgument() { return null; }

    private static final long serialVersionUID = 0x84a7af4aL;
    private String _applicationURL;
    private String _page;
    private NSArray _jarFileNames;
    private String _channelClassName;
    private String _codebase;
    private String _applicationName;
    private String _vendor;
    private String _homepage;
    private String _applicationDescription;
    private String _applicationIcon;
    private String _j2seVersion;
    private boolean _needsAllPermissions;
    private NSDictionary _additionalMainArguments;
    private String _jarFileName;
    private String _mainArgument;

}

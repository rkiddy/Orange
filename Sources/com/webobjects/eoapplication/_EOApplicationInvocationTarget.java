
package com.webobjects.eoapplication;

import com.webobjects.appserver.*;
import com.webobjects.appserver._private.WODeployedBundle;
import com.webobjects.appserver._private.WOProjectBundle;
import com.webobjects.eodistribution.EODistributionContext;
import com.webobjects.foundation.*;


public class _EOApplicationInvocationTarget {


    public _EOApplicationInvocationTarget(EODistributionContext distributionContext) { return null; }

    public NSDictionary clientSideRequestLoadDefaults() { return null; }

    public void clientSideRequestSaveDefaults(NSDictionary defaults) {}

    private NSArray _deployedBundles() { return null; }

    private NSArray _platformSensitiveResourceNamesFromDeployedBundle(WODeployedBundle deployedBundle, String extension, boolean onlyPlatformIndependentResourceNames) { return null; }

    private NSArray _availableIconNames() { return null; }

    public NSDictionary _iconURLs(NSArray localeIndicators, NSArray platformIndicators, WORequest request) { return null; }

    public NSArray _stringTableURLs(NSArray localeIndicators, NSArray platformIndicators, WORequest request) { return null; }

    public NSArray clientSideRequestStringTableAndIconURLs(NSArray localeIndicators, NSArray platformIndicators) { return null; }

    static  {}

    private static NSMutableArray _deployedBundles;
    private static NSArray _iconNames;
    private static _NSThreadsafeMutableDictionary _resourceURLsByApplicationURLAndLanguagesAndPlatforms;
    private EODistributionContext _distributionContext;

}

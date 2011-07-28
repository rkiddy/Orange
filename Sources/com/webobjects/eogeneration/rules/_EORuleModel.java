
package com.webobjects.eogeneration.rules;

import com.webobjects.appserver.WOSession;
import com.webobjects.directtoweb.*;
import com.webobjects.eocontrol.*;
import com.webobjects.foundation.*;
import java.io.File;
import java.net.URL;
import java.util.Vector;

public class _EORuleModel extends D2WFastModel {


    public static synchronized boolean canAssistantBeMadeAvailable() { return null; }

    private static _EORuleModel _defaultModel() { return null; }

    public static NSArray allAssistantRuleDescriptions(WOSession session) { return null; }

    public static void applyAssistantRulesWithDescriptions(NSArray ruleDescriptions) { return null; }

    public static void applyAndSaveAssistantRulesWithDescriptions(NSArray ruleDescriptions) { return null; }

    public static void revertAssistantRules() { return null; }

    public _EORuleModel() { return null; }

    private static Vector _filteredFiles(Vector files) { return null; }

    private static Vector _filteredFilesPathURLs(Vector pathURLs) { return null; }

    public Vector modelFilesInBundles() { return null; }

    public Vector modelFilesPathURLsInBundles() { return null; }

    public Vector clientConfigurationFilesInBundles() { return null; }

    public Vector clientConfigurationFilesPathURLsInBundles() { return null; }

    public void loadRules() {}

    private EOQualifier _qualifierFromSpecification(NSDictionary specification) { return null; }

    public NSDictionary _specificationFromQualifier(EOQualifier qualifier) { return null; }

    public NSArray allAssistantRuleDescriptions(D2WContext context) { return null; }

    public void applyAllAssistantRulesWithDescriptions(NSArray ruleDescriptions) {}

    static  {}

    public static final String AssistantEnabledUserDefaultsKey = "EOAssistantEnabled";
    private static Vector _modelFiles;
    private static Vector _modelFilesPathURLs;
    private static Vector _configurationFiles;
    private static Vector _configurationFilesPathURLs;
    private static boolean _assistantAvailabilityChecked;
    private static boolean _canAssistantBeMadeAvailable;

}

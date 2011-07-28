
package com.webobjects.webservices.generation;

import com.webobjects.directtoweb.D2WFastModel;
import com.webobjects.directtoweb.Rule;
import com.webobjects.foundation.NSArray;
import java.io.File;
import java.net.URL;
import java.util.Vector;

public class _WSRuleModel extends D2WFastModel {


    public _WSRuleModel() { return null; }

    private static Vector _filteredFiles(Vector files) { return null; }

    private static Vector _filteredFilesPathURLs(Vector pathURLs) { return null; }

    /**
     * @deprecated Method modelFilesInBundles is deprecated
     */

    public Vector modelFilesInBundles() { return null; }

    public Vector modelFilesPathURLsInBundles() { return null; }

    public void _removeAllWebAssistantRules() {}

    public void _revertWebAssistantRules() {}

    public NSArray _rules() { return null; }

    public void _addRule(Rule newRule) {}

    public void _removeRule(Rule oldRule) {}

    public void _setRules(NSArray newRules) {}

    public NSArray _webAssistantRulesForSave() { return null; }

    public void _sortRules() {}

    public void _saveWebAssistantRulesIntoUsedModelFile() {}

    public void loadRules() {}

    public static synchronized boolean canAssistantBeMadeAvailable() { return null; }

    static  {}

    public static final String AssistantEnabledUserDefaultsKey = "WSAssistantEnabled";
    private static boolean _canAssistantBeMadeAvailable;
    private static boolean _assistantAvailabilityChecked;
    public static final String TrueValue = "true";
    private Vector _modelFiles;
    private Vector _modelFilesPathURLs;

}

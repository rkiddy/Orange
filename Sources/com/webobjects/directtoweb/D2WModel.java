
package com.webobjects.directtoweb;

import com.apple.client.directtoweb.common.*;
import com.webobjects.appserver.WOApplication;
import com.webobjects.appserver.WOResourceManager;
import com.webobjects.directtoweb.generation.DTWTemplate;
import com.webobjects.eoaccess.EOModelGroup;
import com.webobjects.eocontrol.*;
import com.webobjects.foundation.*;
import java.io.*;
import java.net.URL;
import java.util.*;


public class D2WModel
    implements EOKeyValueArchiving {


    public static D2WModel defaultModel() { return null; }

    public static void setDefaultModel(D2WModel newModel) { return null; }

    private static NSDictionary _dictionaryFromFile(File f) { return null; }

    private static NSDictionary _dictionaryFromPathURL(URL url) { return null; }

    protected D2WModel(File f) { return null; }

    protected D2WModel(URL url) { return null; }

    protected D2WModel(EOKeyValueUnarchiver unarchiver) { return null; }

    protected D2WModel(NSArray rules) { return null; }

    protected void initializeClientConfiguration() {}

    public Hashtable clientConfiguration() { return null; }

    public Hashtable editors() { return null; }

    public Hashtable componentDefinitions() { return null; }

    public Hashtable inferrableKeys() { return null; }

    public Vector propertyRuleKeysFromClientConfiguration() { return null; }

    public Vector propertyRuleKeysForComponents(Vector componentsAvailable) { return null; }

    public Vector pageRuleKeysFromClientConfiguration() { return null; }

    public Vector pageRuleKeysForPage(String pageName) { return null; }

    public boolean checkPossibilityToSaveUserModel(boolean throwp) { return true; }

    private File _createNewModelFile() { return null; }

    /**
     * @deprecated Method userModelFile is deprecated
     */

    public File userModelFile() { return null; }

    public URL userModelFilePathURL() { return null; }

    /**
     * @deprecated Method userClientConfigurationFile is deprecated
     */

    public File userClientConfigurationFile() { return null; }

    public URL userClientConfigurationFilePathURL() { return null; }

    public static String nameFromFrameworkBundle(NSBundle bundle) { return null; }

    /**
     * @deprecated Method modelFilesInBundles is deprecated
     */

    public Vector modelFilesInBundles() { return null; }

    public Vector modelFilesPathURLsInBundles() { return null; }

    /**
     * @deprecated Method clientConfigurationFilesInBundles is deprecated
     */

    public Vector clientConfigurationFilesInBundles() { return null; }

    public Vector clientConfigurationFilesPathURLsInBundles() { return null; }

    public void checkRules() {}

    public void loadRules() {}

    protected Vector dataTypesInvolved() { return null; }

    public boolean dirty() { return true; }

    protected void setDirty(boolean newValue) {}

    /**
     * @deprecated Method mergeFile is deprecated
     */

    protected void mergeFile(File modelFile) {}

    protected void mergePathURL(URL modelPathURL) {}

    protected NSArray rules() { return null; }

    protected void setRules(NSArray newRules) {}

    protected void addRule(Rule newRule) {}

    protected void addRuleTrace(Rule newRule) {}

    protected void removeRule(Rule rule) {}

    protected void addRules(NSArray extraRules) {}

    protected void removeAllWebAssistantRules() {}

    protected NSArray webAssistantRulesForSave() { return null; }

    private static NSArray _ruleSortOrderingForMemory() { return null; }

    private static NSArray _ruleSortOrderingForSave() { return null; }

    protected void addRuleToItsBucket(Rule r) {}

    protected void invalidateCaches() {}

    protected void sortRules() {}

    protected NSDictionary encodeWebAssistantRulesWithKeyValueArchiver(EOKeyValueArchiver archiver) { return null; }

    public String toString() { return null; }

    protected void toFile(File f) throws IOException {}

    public void updateUserSettingsForNewPageAvailableRule(ServerSideSettings settings, String dtwComponentName) {}

    public boolean canSaveUserModel() { return true; }

    protected void saveWebAssistantRulesIntoUsedModelFile() {}

    protected void revertWebAssistantRules() {}

    protected Vector candidates(String keyPath, D2WContext context) { return null; }

    protected Object _fireRule(Rule rule, D2WContext context) { return null; }

    protected Object fireSystemRuleForKeyPathInContext(String keyPath, D2WContext context) { return null; }

    protected Object fireRuleForKeyPathInContext(String keyPath, D2WContext context) { return null; }

    protected Vector fireAllRulesForKeyPathInContext(String keyPath, D2WContext context) { return null; }

    protected Vector taskVector() { return null; }

    protected Enumeration tasks() { return null; }

    protected Vector dynamicPages() { return null; }

    protected void removeWebAssistantRulesWithSameContextAsSettings(Settings settings) {}

    protected void removeDynamicPage(ServerSideSettings settings) {}

    protected void newSettings(ServerSideSettings settings) {}

    protected void createWebAssistantRulesWithSettings(ServerSideSettings settings) {}

    public final String typeForRuleKey(String key) { return null; }

    public boolean isPageStatic(String pageName, D2WContext aContext) { return true; }

    public void encodeWithKeyValueArchiver(EOKeyValueArchiver archiver) {}

    static  {}

    public static final Integer Zero;
    public static final Integer One;
    public static final String AllMarker = "*all*";
    public static final String NoneMarker = "*none*";
    public static final String TaskKey = "task";
    public static final String EntityKey = "entity";
    public static final String IsGeneratingKey = "isGenerating";
    public static final String FrameKey = "frame";
    public static final String DynamicPageKey = "pageConfiguration";
    public static final String LookKey = "look";
    public static final String ComponentNameKey = "componentName";
    public static final String WebAssistantPageNameKey = "webAssistantPageName";
    public static final String ComponentAvailableKey = "componentAvailable";
    public static final String ComponentsToShowAtEndKey = "componentsToShowAtEndOfList";
    public static final String PageAvailableKey = "pageAvailable";
    public static final String PageNameKey = "pageName";
    public static final String VisibleEntityNamesKey = "visibleEntityNames";
    public static final String ReadOnlyEntityNamesKey = "readOnlyEntityNames";
    public static final String RequiresEntityKey = "requiresEntity";
    public static final String PropertyKeyKey = "propertyKey";
    public static final String PropertyKeyPortionInModelKey = "propertyKeyPortionInModel";
    public static final String PropertyKey = "property";
    public static final String SessionKey = "session";
    public static final String DummyTrueKey = "dummyTrue";
    public static final String AttributeKey = "attribute";
    public static final String RelationshipKey = "relationship";
    public static final String TargetKey = "target";
    public static final String DisplayPropertyKeysKey = "displayPropertyKeys";
    public static final String DisplayNameForPropertyKey = "displayNameForProperty";
    public static final String KeyWhenRelationshipKey = "keyWhenRelationship";
    public static final String FormatterKey = "formatter";
    public static final String AlternateRowColorKey = "alternateRowColor";
    public static final String LengthKey = "length";
    public static final String BoldKey = "bold";
    public static final String ItalicKey = "italic";
    public static final String ColorKey = "color";
    public static final String BackgroundColorForTableKey = "backgroundColorForTable";
    public static final String BackgroundColorForPageKey = "backgroundColorForPage";
    public static final String AllowCollapsingKey = "allowCollapsing";
    public static final String ActionsKey = "actions";
    public static final String FramesActiveKey = "framesActive";
    public static final String StartupTaskKey = "startupTask";
    public static final String StartupEntityNameKey = "startupEntityName";
    public static final String ShowBannerKey = "showBanner";
    public static final String PropertyIsKeyPathKey = "propertyIsKeyPath";
    public static final String PropertyTypeKey = "propertyType";
    public static final String RelationshipTypeKey = "r";
    public static final String AttributeTypeKey = "a";
    public static final String CustomTypeKey = "c";
    public static final String KeyPathTypeKey = "k";
    private static final String _RulesKey = "rules";
    private static final String _EditorsKey = "editors";
    private static final String _SupportsKey = "supports";
    private static final String _ComponentsKey = "components";
    public static final String _PageWrapperNameKey = "pageWrapperName";
    private static final String _CannotSaveErrorMessage = "***** Warning: The DirectToWeb WebAssistant will not be able to modify your DirectToWeb resources. You must have your application project opened in Project Builder to save changes using the WebAssistant.";
    private static final NSArray _ruleSortOrderingArrayForMemory;
    private static final NSArray _ruleSortOrderingArrayForSave;
    private static D2WModel _model;
    private boolean _dirty;
    private NSMutableArray _rules;
    private Hashtable _ruleBuckets;
    private Vector _dataTypesInvolved;
    private Hashtable _clientConfiguration;
    private Hashtable _editors;
    private Hashtable _componentDefinitions;
    private Hashtable _inferrableKeys;
    private long _lastDateRead;
    private boolean _isUserModelInProjectBundle;
    private Vector _propertyRuleKeysFromClientConfiguration;
    private Hashtable _propertyRuleKeysByComponent;
    private Vector _pageRuleKeysFromClientConfiguration;
    private boolean haveChecked;
    private File _userModelFile;
    private File _userClientConfigurationFile;
    private URL _userModelFilePathURL;
    private URL _userClientConfigurationFilePathURL;
    private Vector _modelFilesInBundles;
    private Vector _modelFilesPathURLsInBundles;
    private Vector _clientConfigurationFilesInBundles;
    private Vector _clientConfigurationFilesPathURLsInBundles;
    protected Vector _tasks;
    private Vector _dynamicPages;

}

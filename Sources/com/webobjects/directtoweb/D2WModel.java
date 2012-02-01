package com.webobjects.directtoweb;
/**
 * The D2WModel class manages a set of rules for a Direct to Web application. It provides support for file input/output, as well as for the Web Assistant.
 * The implementation is subject to change in future releases.
 * See Also:Rule
 */
public class D2WModel implements com.webobjects.eocontrol.EOKeyValueArchiving{
    /**
     * The actions key.
     * See Also:Constant Field Values
     */
    public static final java.lang.String ActionsKey="actions";

    /**
     * A constant that represents a wildcard, for example, "any task."
     * See Also:Rule.hasSameSettingsAs(Settings, boolean), Settings.AllMarker, Constant Field Values
     */
    public static final java.lang.String AllMarker="*all*";

    /**
     * The allow collapsing key; the literal "allowCollapsing".
     * See Also:Constant Field Values
     */
    public static final java.lang.String AllowCollapsingKey="allowCollapsing";

    /**
     * The alternate row color key; the literal "alternateRowColor".
     * See Also:Constant Field Values
     */
    public static final java.lang.String AlternateRowColorKey="alternateRowColor";

    /**
     * The attribute key.
     * See Also:Constant Field Values
     */
    public static final java.lang.String AttributeKey="attribute";

    /**
     * The attribute type key; the literal "a".
     * See Also:Constant Field Values
     */
    public static final java.lang.String AttributeTypeKey="a";

    /**
     * The background-color-for-page key; the literal "backgroundColorForPage".
     * See Also:Constant Field Values
     */
    public static final java.lang.String BackgroundColorForPageKey="backgroundColorForPage";

    /**
     * The background-color-for-table key; the literal "backgroundColorForTable".
     * See Also:Constant Field Values
     */
    public static final java.lang.String BackgroundColorForTableKey="backgroundColorForTable";

    /**
     * The bold key.
     * See Also:Constant Field Values
     */
    public static final java.lang.String BoldKey="bold";

    /**
     * The color key.
     * See Also:Constant Field Values
     */
    public static final java.lang.String ColorKey="color";

    /**
     * The component available key; the literal "componentAvailable".
     * See Also:Constant Field Values
     */
    public static final java.lang.String ComponentAvailableKey="componentAvailable";

    /**
     * The component name key; the literal "componentName".
     * See Also:Constant Field Values
     */
    public static final java.lang.String ComponentNameKey="componentName";

    /**
     * The components-to-show-at-end-of-list key; the literal "componentsToShowAtEndOfList".
     * See Also:Constant Field Values
     */
    public static final java.lang.String ComponentsToShowAtEndKey="componentsToShowAtEndOfList";

    /**
     * The custom type key; the literal "c".
     * See Also:Constant Field Values
     */
    public static final java.lang.String CustomTypeKey="c";

    /**
     * The display-name-for-property key; the literal "displayNameForProperty".
     * See Also:Constant Field Values
     */
    public static final java.lang.String DisplayNameForPropertyKey="displayNameForProperty";

    /**
     * The display-property-keys key; the literal "displayPropertyKeys".
     * See Also:Constant Field Values
     */
    public static final java.lang.String DisplayPropertyKeysKey="displayPropertyKeys";

    /**
     * The dummy-true key; the literal "dummyTrue"; for a rule without pre-conditions.
     * See Also:ServerSideSettings.dummyTrueQualifier, Constant Field Values
     */
    public static final java.lang.String DummyTrueKey="dummyTrue";

    /**
     * The dynamic page key; the literal "pageConfiguration".
     * See Also:Constant Field Values
     */
    public static final java.lang.String DynamicPageKey="pageConfiguration";

    /**
     * The entity key.
     * See Also:Constant Field Values
     */
    public static final java.lang.String EntityKey="entity";

    /**
     * The formatter key.
     * See Also:Constant Field Values
     */
    public static final java.lang.String FormatterKey="formatter";

    /**
     * The frame key.
     * See Also:Constant Field Values
     */
    public static final java.lang.String FrameKey="frame";

    /**
     * The frames active key; the literal "framesActive".
     * See Also:Constant Field Values
     */
    public static final java.lang.String FramesActiveKey="framesActive";

    /**
     * The is generating key; the literal "isGenerating".
     * See Also:Constant Field Values
     */
    public static final java.lang.String IsGeneratingKey="isGenerating";

    /**
     * The italic key.
     * See Also:Constant Field Values
     */
    public static final java.lang.String ItalicKey="italic";

    /**
     * The key path type key; the literal "k".
     * See Also:Constant Field Values
     */
    public static final java.lang.String KeyPathTypeKey="k";

    /**
     * The key-when-relationship key; the literal "keyWhenRelationship".
     * See Also:Constant Field Values
     */
    public static final java.lang.String KeyWhenRelationshipKey="keyWhenRelationship";

    /**
     * The length key.
     * See Also:Constant Field Values
     */
    public static final java.lang.String LengthKey="length";

    /**
     * The look key.
     * See Also:Constant Field Values
     */
    public static final java.lang.String LookKey="look";

    /**
     * A constant that represents the lack of a selection.
     * See Also:D2WModel.AllMarker, Settings.NoneMarker, Constant Field Values
     */
    public static final java.lang.String NoneMarker="*none*";

    /**
     * A constant that represents a logical true value.
     * See Also:D2WModel.Zero, BooleanAssignment
     */
    public static final java.lang.Integer One=null;

    /**
     * The page available key; the literal "pageAvailable".
     * See Also:Constant Field Values
     */
    public static final java.lang.String PageAvailableKey="pageAvailable";

    /**
     * The page name key; the literal "pageName".
     * See Also:Constant Field Values
     */
    public static final java.lang.String PageNameKey="pageName";

    /**
     * The property-is-key path key; the literal "propertyIsKeyPath".
     * See Also:Constant Field Values
     */
    public static final java.lang.String PropertyIsKeyPathKey="propertyIsKeyPath";

    /**
     * The property key.
     * See Also:Constant Field Values
     */
    public static final java.lang.String PropertyKey="property";

    /**
     * The property-key key; the literal "propertyKey".
     * See Also:Constant Field Values
     */
    public static final java.lang.String PropertyKeyKey="propertyKey";

    /**
     * The property-key-portion-in-model key; the literal "propertyKeyPortionInModel".
     * See Also:Constant Field Values
     */
    public static final java.lang.String PropertyKeyPortionInModelKey="propertyKeyPortionInModel";

    /**
     * The property type key; the literal "propertyType".
     * See Also:Constant Field Values
     */
    public static final java.lang.String PropertyTypeKey="propertyType";

    /**
     * The read-only entity names key; the literal "readOnlyEntityNames".
     * See Also:Constant Field Values
     */
    public static final java.lang.String ReadOnlyEntityNamesKey="readOnlyEntityNames";

    /**
     * The relationship key.
     * See Also:Constant Field Values
     */
    public static final java.lang.String RelationshipKey="relationship";

    /**
     * The relationship type key; the literal "r".
     * See Also:Constant Field Values
     */
    public static final java.lang.String RelationshipTypeKey="r";

    /**
     * The requires entity key; the literal "requiresEntity".
     * See Also:Constant Field Values
     */
    public static final java.lang.String RequiresEntityKey="requiresEntity";

    /**
     * The session key.
     * See Also:Constant Field Values
     */
    public static final java.lang.String SessionKey="session";

    /**
     * The show banner key; the literal "showBanner".
     * See Also:Constant Field Values
     */
    public static final java.lang.String ShowBannerKey="showBanner";

    /**
     * The startup entity name key; the literal "startupEntityName".
     * See Also:Constant Field Values
     */
    public static final java.lang.String StartupEntityNameKey="startupEntityName";

    /**
     * The startup task key; the literal "startupTask".
     * See Also:Constant Field Values
     */
    public static final java.lang.String StartupTaskKey="startupTask";

    /**
     * The target key.
     * See Also:Constant Field Values
     */
    public static final java.lang.String TargetKey="target";

    /**
     * The task key.
     * See Also:Constant Field Values
     */
    public static final java.lang.String TaskKey="task";

    /**
     * The visible entity names key; the literal "visibleEntityNames".
     * See Also:Constant Field Values
     */
    public static final java.lang.String VisibleEntityNamesKey="visibleEntityNames";

    /**
     * The Web Assistant page name key; the literal "webAssistantPageName".
     * See Also:Constant Field Values
     */
    public static final java.lang.String WebAssistantPageNameKey="webAssistantPageName";

    /**
     * A constant that represents a logical false value.
     * See Also:D2WModel.One, BooleanAssignment
     */
    public static final java.lang.Integer Zero=null;

    /**
     * Creates an instance of D2WModel with the specified unarchiver.
     * Parameters:unarchiver - instance of EOKeyValueUnarchiverSee Also:D2WModel.D2WModel(NSArray)
     */
    protected D2WModel(com.webobjects.eocontrol.EOKeyValueUnarchiver unarchiver){
         //TODO codavaj!!
    }

    /**
     * Creates an instance of D2WModel with the specified file.
     * Parameters:f - instance of java.io.FileSee Also:D2WModel.D2WModel(EOKeyValueUnarchiver)
     */
    protected D2WModel(java.io.File f){
         //TODO codavaj!!
    }

    /**
     * Creates an instance of D2WModel with the specified rules.
     * Parameters:rules - instance of NSArraySee Also:D2WModel.setRules(NSArray)
     */
    protected D2WModel(com.webobjects.foundation.NSArray rules){
         //TODO codavaj!!
    }

    /**
     * Creates an instance of D2WModel from the contents of the specified URL.
     * Parameters:url - instance of java.io.URLSince: 5.2.2 See Also:D2WModel.D2WModel(EOKeyValueUnarchiver)
     */
    protected D2WModel(java.net.URL url){
         //TODO codavaj!!
    }

    /**
     * Adds the specified rule; dirties the model.
     */
    protected void addRule(com.webobjects.directtoweb.Rule newRule){
        return; //TODO codavaj!!
    }

    /**
     * Invokes the addRule method on each of the specified rules.
     */
    protected void addRules(com.webobjects.foundation.NSArray extraRules){
        return; //TODO codavaj!!
    }

    /**
     * Adds the specified rule to the local rule caches.
     */
    protected void addRuleToItsBucket(com.webobjects.directtoweb.Rule r){
        return; //TODO codavaj!!
    }

    /**
     * Invokes the addRule method and logs a trace.
     */
    protected void addRuleTrace(com.webobjects.directtoweb.Rule newRule){
        return; //TODO codavaj!!
    }

    /**
     * Gets rules from the local rule caches for the specified key path.
     */
    protected java.util.Vector candidates(java.lang.String keyPath, com.webobjects.directtoweb.D2WContext context){
        return null; //TODO codavaj!!
    }

    /**
     * Indicates whether the user model can be saved, that is, whether the user model is the project bundle.
     */
    public boolean canSaveUserModel(){
        return false; //TODO codavaj!!
    }

    /**
     * Calculates whether it is possible to save the user model.
     */
    public boolean checkPossibilityToSaveUserModel(boolean throwp){
        return false; //TODO codavaj!!
    }

    /**
     * Checks the rules. The rules have to be reloaded if the following files have been modified since the time that the files were last read: model files in bundles client configuration files user model file
     * The reload will abort if there are rules modified by the Web Assistant that have yet to be saved.
     */
    public void checkRules(){
        return; //TODO codavaj!!
    }

    /**
     * Gets the client configuration.
     */
    public java.util.Hashtable clientConfiguration(){
        return null; //TODO codavaj!!
    }

    /**
     * Deprecated.
     * Gets the client configuration files in bundles.
     */
    public java.util.Vector clientConfigurationFilesInBundles(){
        return null; //TODO codavaj!!
    }

    /**
     * Gets the client configuration files in bundles.
     */
    public java.util.Vector clientConfigurationFilesPathURLsInBundles(){
        return null; //TODO codavaj!!
    }

    /**
     * Gets the component definitions.
     */
    public java.util.Hashtable componentDefinitions(){
        return null; //TODO codavaj!!
    }

    /**
     * Creates Web Assistant rules with the specified settings.
     */
    protected void createWebAssistantRulesWithSettings(com.webobjects.directtoweb.ServerSideSettings settings){
        return; //TODO codavaj!!
    }

    /**
     * Gets the data types involved for the rules.
     */
    protected java.util.Vector dataTypesInvolved(){
        return null; //TODO codavaj!!
    }

    /**
     * Gets the default model.
     */
    public static com.webobjects.directtoweb.D2WModel defaultModel(){
        return null; //TODO codavaj!!
    }

    /**
     * Indicates whether rules have been added to or removed from the model since the last merge or saving or reverting of the Web Assistant rules.
     */
    public boolean dirty(){
        return false; //TODO codavaj!!
    }

    /**
     * Gets a list of all the dynamic pages found in the model.
     * The current implementation caches the values.
     * The implementation is subject to change in future releases.
     */
    protected java.util.Vector dynamicPages(){
        return null; //TODO codavaj!!
    }

    /**
     * Gets the editors.
     */
    public java.util.Hashtable editors(){
        return null; //TODO codavaj!!
    }

    /**
     * Encodes the Web Assistant rules with the specified key-value archiver.
     */
    protected com.webobjects.foundation.NSDictionary encodeWebAssistantRulesWithKeyValueArchiver(com.webobjects.eocontrol.EOKeyValueArchiver archiver){
        return null; //TODO codavaj!!
    }

    /**
     * Description copied from interface:
     * Asks the receiver to archive its state into the EOKeyValueArchiver archiver.
     */
    public void encodeWithKeyValueArchiver(com.webobjects.eocontrol.EOKeyValueArchiver archiver){
        return; //TODO codavaj!!
    }

    /**
     * Fires all candidate rules for the specified key path that can fire in the specified context; aggregates the results of all firings.
     */
    protected java.util.Vector fireAllRulesForKeyPathInContext(java.lang.String keyPath, com.webobjects.directtoweb.D2WContext context){
        return null; //TODO codavaj!!
    }

    /**
     * Fires the first candidate rule for the specified key path that can fire in the specified context.
     */
    protected java.lang.Object fireRuleForKeyPathInContext(java.lang.String keyPath, com.webobjects.directtoweb.D2WContext context){
        return null; //TODO codavaj!!
    }

    /**
     * Fires the first candidate rule for the specified key path that can fire in the specified context but is not authored by the Web Assistant.
     */
    protected java.lang.Object fireSystemRuleForKeyPathInContext(java.lang.String keyPath, com.webobjects.directtoweb.D2WContext context){
        return null; //TODO codavaj!!
    }

    /**
     * Gets the inferrable keys.
     */
    public java.util.Hashtable inferrableKeys(){
        return null; //TODO codavaj!!
    }

    /**
     * Intializes the client configuration.
     */
    protected void initializeClientConfiguration(){
        return; //TODO codavaj!!
    }

    /**
     * Clears the local caches of dynamic pages and rules.
     */
    protected void invalidateCaches(){
        return; //TODO codavaj!!
    }

    /**
     * Indicates whether the page with the specified name is static in the specified context.
     * The current implementation checks the client configuration; an entry implies the page is dynamic. Then checks pageAvailable rules, which refer to non-static pages. Finally checks whether the page is in the application wrapper which implies the page is static.
     * The implementation is subject to change in future releases.
     */
    public boolean isPageStatic(java.lang.String pageName, com.webobjects.directtoweb.D2WContext aContext){
        return false; //TODO codavaj!!
    }

    /**
     * Loads the rules. Merges model files in the bundles, client configuration files, and the user model file.
     */
    public void loadRules(){
        return; //TODO codavaj!!
    }

    /**
     * Deprecated.
     * Adds the rules from the specified model file; dirties the model.
     */
    protected void mergeFile(java.io.File modelFile){
        return; //TODO codavaj!!
    }

    /**
     * Adds the rules from the specified model file path URL; dirties the model.
     */
    protected void mergePathURL(java.net.URL modelPathURL){
        return; //TODO codavaj!!
    }

    /**
     * Deprecated.
     * Gets the model files in the bundles
     */
    public java.util.Vector modelFilesInBundles(){
        return null; //TODO codavaj!!
    }

    /**
     * Gets the model files in the bundles
     */
    public java.util.Vector modelFilesPathURLsInBundles(){
        return null; //TODO codavaj!!
    }

    /**
     * Gets the name of the specified framework bundle.
     */
    public static java.lang.String nameFromFrameworkBundle(com.webobjects.foundation.NSBundle bundle){
        return null; //TODO codavaj!!
    }

    /**
     * Updates the model with the specified settings.
     * The current implementation sets the current rules and creates Web Assistant rules depending on the settings.
     * The implementation is subject to change in future releases.
     */
    protected void newSettings(com.webobjects.directtoweb.ServerSideSettings settings){
        return; //TODO codavaj!!
    }

    /**
     * Gets the page rule keys for the specified page.
     */
    public java.util.Vector pageRuleKeysForPage(java.lang.String pageName){
        return null; //TODO codavaj!!
    }

    /**
     * Gets the page rule keys from the client configuration.
     */
    public java.util.Vector pageRuleKeysFromClientConfiguration(){
        return null; //TODO codavaj!!
    }

    /**
     * Gets the property rule keys for the specified components.
     */
    public java.util.Vector propertyRuleKeysForComponents(java.util.Vector componentsAvailable){
        return null; //TODO codavaj!!
    }

    /**
     * Gets the property rule keys from the client configuration.
     * The current implementation caches the keys.
     * The implementation is subject to change in future releases.
     */
    public java.util.Vector propertyRuleKeysFromClientConfiguration(){
        return null; //TODO codavaj!!
    }

    /**
     * Removes all of the Web Assistant rules.
     */
    protected void removeAllWebAssistantRules(){
        return; //TODO codavaj!!
    }

    /**
     * Removes the Web Assistant rules with the same context as the specified settings if the specified settings are for a dynamic page.
     */
    protected void removeDynamicPage(com.webobjects.directtoweb.ServerSideSettings settings){
        return; //TODO codavaj!!
    }

    /**
     * Removes the specified rule; dirties the model.
     */
    protected void removeRule(com.webobjects.directtoweb.Rule rule){
        return; //TODO codavaj!!
    }

    /**
     * Removes the Web Assistant rules that have the same context as the specified settings. Dirties the model if a non-look rule is removed; un-dirties otherwise.
     */
    protected void removeWebAssistantRulesWithSameContextAsSettings(com.apple.client.directtoweb.common.Settings settings){
        return; //TODO codavaj!!
    }

    /**
     * Reverts the Web Assistant rules; un-dirties the model.
     * The current implementation removes all Web Assistant rules, merges the user model file, and sorts the rules.
     * The implementation is subject to change in future releases.
     */
    protected void revertWebAssistantRules(){
        return; //TODO codavaj!!
    }

    /**
     * Gets the rules.
     */
    protected com.webobjects.foundation.NSArray rules(){
        return null; //TODO codavaj!!
    }

    /**
     * Saves Web Assistant rules in the used model file.
     */
    protected void saveWebAssistantRulesIntoUsedModelFile(){
        return; //TODO codavaj!!
    }

    /**
     * Sets the default model to the specified value.
     */
    public static void setDefaultModel(com.webobjects.directtoweb.D2WModel newModel){
        return; //TODO codavaj!!
    }

    /**
     * Sets whether the model is dirty to the specified value.
     */
    protected void setDirty(boolean newValue){
        return; //TODO codavaj!!
    }

    /**
     * Sets the rules to the specified value; sorts the rules.
     */
    protected void setRules(com.webobjects.foundation.NSArray newRules){
        return; //TODO codavaj!!
    }

    /**
     * Invalidates caches.
     */
    protected void sortRules(){
        return; //TODO codavaj!!
    }

    /**
     * Get an enumeration of the tasks in the model.
     */
    protected java.util.Enumeration tasks(){
        return null; //TODO codavaj!!
    }

    /**
     * Gets a list of all tasks found in the model.
     */
    protected java.util.Vector taskVector(){
        return null; //TODO codavaj!!
    }

    /**
     * Writes the dictionary of the key-value archiver to the specified file.
     */
    protected void toFile(java.io.File f) throws java.io.IOException{
        return; //TODO codavaj!!
    }

    public java.lang.String toString(){
        return null; //TODO codavaj!!
    }

    /**
     * Gets the type for the specified rule key.
     */
    public final java.lang.String typeForRuleKey(java.lang.String key){
        return null; //TODO codavaj!!
    }

    /**
     * Updates user settings for a new page available rule.
     * The current implementation adds the page available rule to the model, updates the client configuration property list file, and updates the memory caches so that the settings take effect.
     * The implementation is subject to change in future releases.
     */
    public void updateUserSettingsForNewPageAvailableRule(com.webobjects.directtoweb.ServerSideSettings settings, java.lang.String dtwComponentName){
        return; //TODO codavaj!!
    }

    /**
     * Deprecated.
     * Gets the user client configuration file.
     */
    public java.io.File userClientConfigurationFile(){
        return null; //TODO codavaj!!
    }

    /**
     * Gets the user client configuration file.
     */
    public java.net.URL userClientConfigurationFilePathURL(){
        return null; //TODO codavaj!!
    }

    /**
     * Deprecated.
     * Gets the user model file.
     */
    public java.io.File userModelFile(){
        return null; //TODO codavaj!!
    }

    /**
     * Gets the user model file.
     */
    public java.net.URL userModelFilePathURL(){
        return null; //TODO codavaj!!
    }

    /**
     * Gets the Web Assistant rules for saving.
     */
    protected com.webobjects.foundation.NSArray webAssistantRulesForSave(){
        return null; //TODO codavaj!!
    }

}

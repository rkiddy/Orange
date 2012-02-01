package com.webobjects.directtoweb;
/**
 * The D2W class is responsible for creating Direct to Web pages. In each Direct to Web application, one instance of D2W creates all of the pages. This instance is called the Direct to Web factory and is accessed using the factory static method.
 * D2W defines several methods to create Direct to Web pages, for example, listPageForEntityNamed, errorPage, pageForConfigurationNamed, and pageForTaskAndEntityNamed. Invoke these methods on the Direct to Web factory. For example, to create a list page for Movies, use ListPageInterface lpi = D2W.factory().listPageForEntityNamed("Movie", session());
 * If you want to customize the Direct to Web factory, you need to subclass D2W, create an instance of your subclass, and register it with Direct to Web using the setFactory method. See the "Customizing a Direct to Web Application" chapter in Developing WebObjects Applications With Direct to Web for more information.
 * The D2W class provides the setWebAssistantEnabled and isWebAssistantEnabled methods to manage the Web Assistant. You can also change the keys with which Direct to Web caches rule firing results using newSignificantKey. See the "Direct to Web Architecture" chapter of Developing WebObjects Applications With Direct to Web for more information about rule firing caching.
 */
public class D2W{
    public D2W(){
         //TODO codavaj!!
    }

    /**
     * This method is intentionally undocumented. You should never have to invoke or customize it.
     */
    public void activateWebAssistantServer(){
        return; //TODO codavaj!!
    }

    /**
     * This method is intentionally undocumented. You should never have to invoke or customize it.
     */
    public void checkMultithreading(com.webobjects.foundation.NSNotification n){
        return; //TODO codavaj!!
    }

    /**
     * Returns a confirm page (a WOComponent object implementing the ConfirmPageInterface) for the entity identified by entityName. The session argument specifies the session in which the page should be created.
     */
    public com.webobjects.directtoweb.ConfirmPageInterface confirmPageForEntityNamed(java.lang.String entityName, com.webobjects.appserver.WOSession session){
        return null; //TODO codavaj!!
    }

    /**
     * Returns a default startup page as a WOComponent, which is a query-all page unless you override the rule for the startupTask key. The session argument specifies the session in which the page should be created.
     */
    public com.webobjects.appserver.WOComponent defaultPage(com.webobjects.appserver.WOSession session){
        return null; //TODO codavaj!!
    }

    /**
     * Returns an edit page (a WOComponent object implementing the EditPageInterface) for the entity identified by entityName. The session argument specifies the session in which the page should be created.
     */
    public com.webobjects.directtoweb.EditPageInterface editPageForEntityNamed(java.lang.String entityName, com.webobjects.appserver.WOSession session){
        return null; //TODO codavaj!!
    }

    /**
     * Creates a new object and returns an edit page as a WOComponent implementing the EditPageInterface. The class of the object and the configuration of the page are determined from the named configuration identified by configurationName. The session argument specifies the session in which the page should be created.
     */
    public com.webobjects.directtoweb.EditPageInterface editPageForNewObjectWithConfigurationNamed(java.lang.String configurationName, com.webobjects.appserver.WOSession session){
        return null; //TODO codavaj!!
    }

    /**
     * Creates a new object and returns an edit page as a WOComponent implementing the EditPageInterface. The class of the object is determined from the EOEntity identified by entityName. The session argument specifies the session in which the page should be created. The EOEntity class is defined in the EOAccess Framework.
     */
    public com.webobjects.directtoweb.EditPageInterface editPageForNewObjectWithEntityNamed(java.lang.String entityName, com.webobjects.appserver.WOSession session){
        return null; //TODO codavaj!!
    }

    /**
     * Returns an edit-relationship page as a WOComponent implementing the EditRelationshipPageInterface for the entity identified by entityName. The session argument specifies the session in which the page should be created.
     */
    public com.webobjects.directtoweb.EditRelationshipPageInterface editRelationshipPageForEntityNamed(java.lang.String entityName, com.webobjects.appserver.WOSession session){
        return null; //TODO codavaj!!
    }

    /**
     * Returns the name of the entity that the D2WPage manipulates.
     */
    public static java.lang.String entityNameFromPage(com.webobjects.appserver.WOComponent page){
        return null; //TODO codavaj!!
    }

    /**
     * Returns an error page as a WOComponent implementing the ErrorPageInterface. The context argument specifies the WOContext containing the session in which the page should be created.
     */
    public com.webobjects.directtoweb.ErrorPageInterface errorPage(com.webobjects.appserver.WOContext context){
        return null; //TODO codavaj!!
    }

    /**
     * Returns an error page as a WOComponent implementing the ErrorPageInterface. The session argument specifies the session in which the page should be created.
     */
    public com.webobjects.directtoweb.ErrorPageInterface errorPage(com.webobjects.appserver.WOSession session){
        return null; //TODO codavaj!!
    }

    /**
     * Gets the Direct to Web factory, an instance of D2W that creates all of the Direct to Web pages in the application.
     */
    public static com.webobjects.directtoweb.D2W factory(){
        return null; //TODO codavaj!!
    }

    /**
     * Returns the URL of the login page for the session contained in the specified context.
     */
    public java.lang.String homeHrefInContext(com.webobjects.appserver.WOContext context){
        return null; //TODO codavaj!!
    }

    /**
     * This method is intentionally undocumented. You should never have to invoke or customize it.
     */
    protected void init(){
        return; //TODO codavaj!!
    }

    /**
     * Returns an inspect page as a WOComponent implementing the InspectPageInterface for the entity identified by entityName. The session argument specifies the session in which the page should be created.
     */
    public com.webobjects.directtoweb.InspectPageInterface inspectPageForEntityNamed(java.lang.String entityName, com.webobjects.appserver.WOSession session){
        return null; //TODO codavaj!!
    }

    /**
     * Deprecated.
     * This is here for backwards compatibility. Use isWebAssistantEnabled instead.
     */
    public boolean isLiveAssistantEnabled(){
        return false; //TODO codavaj!!
    }

    /**
     * Determines whether or not the Web Assistant is enabled. By default it is enabled.
     */
    public boolean isWebAssistantEnabled(){
        return false; //TODO codavaj!!
    }

    /**
     * Returns a list page as a WOComponent implementing the ListPageInterface for the entity identified by entityName. The session argument specifies the session in which the page should be created.
     */
    public com.webobjects.directtoweb.ListPageInterface listPageForEntityNamed(java.lang.String entityName, com.webobjects.appserver.WOSession session){
        return null; //TODO codavaj!!
    }

    /**
     * Adds key to the list of keys that the rule engine uses to cache the results of rule firing. See the "Direct to Web Architecture" chapter of
     * for more information about rule firing caching.
     */
    public void newSignificantKey(java.lang.String newKey){
        return; //TODO codavaj!!
    }

    /**
     * This method is intentionally undocumented. You should never have to invoke or customize it.
     */
    protected com.apple.client.directtoweb.common.AssistantPacket packetForPropertyAndSettingsWithPage(com.apple.client.directtoweb.common.Property p, com.apple.client.directtoweb.common.Settings settings, com.webobjects.appserver.WOComponent lastPage){
        return null; //TODO codavaj!!
    }

    /**
     * This method is intentionally undocumented. You should never have to invoke or customize it.
     */
    protected com.apple.client.directtoweb.common.AssistantPacket packetForSettingsWithPage(com.apple.client.directtoweb.common.Settings settings, com.webobjects.appserver.WOComponent lastPage){
        return null; //TODO codavaj!!
    }

    /**
     * Returns a Direct to Web page as a WOComponent for a named configuration identified by the dynamicPageName argument. The session argument specifies the session in which the page should be created. See the "Direct to Web" chapter of
     * for more information about named configurations.
     */
    public com.webobjects.appserver.WOComponent pageForConfigurationNamed(java.lang.String dynamicPageName, com.webobjects.appserver.WOSession session){
        return null; //TODO codavaj!!
    }

    /**
     * Returns a Direct to Web page as a WOComponent for the task identified by task and the entity identified by entityName. The context argument specifies the context containing the session in which the page should be created.
     */
    protected com.webobjects.appserver.WOComponent pageForTaskAndEntityNamed(java.lang.String task, java.lang.String entityName, com.webobjects.appserver.WOContext context){
        return null; //TODO codavaj!!
    }

    /**
     * Returns a Direct to Web page as a WOComponent for the task identified by task and the entity identified by entityName. The session argument specifies the session in which the page should be created.
     */
    public com.webobjects.appserver.WOComponent pageForTaskAndEntityNamed(java.lang.String task, java.lang.String entityName, com.webobjects.appserver.WOSession session){
        return null; //TODO codavaj!!
    }

    /**
     * Returns a query-all page as a WOComponent implementing the QueryAllPageInterface. The session argument specifies the session in which the page should be created.
     */
    public com.webobjects.directtoweb.QueryAllPageInterface queryAllPage(com.webobjects.appserver.WOSession session){
        return null; //TODO codavaj!!
    }

    /**
     * Returns a query page as a WOComponent object implementing the QueryPageInterface for the entity identified by entityName. The session argument specifies the session in which the page should be created.
     */
    public com.webobjects.directtoweb.QueryPageInterface queryPageForEntityNamed(java.lang.String entityName, com.webobjects.appserver.WOSession session){
        return null; //TODO codavaj!!
    }

    /**
     * This method is intentionally undocumented. You should never have to invoke or customize it.
     */
    public void requestWasHandled(com.webobjects.appserver.WOContext c){
        return; //TODO codavaj!!
    }

    /**
     * Returns a select page as a WOComponent implementing the SelectPageInterface for the entity identified by entityName. The session argument specifies the session in which the page should be created.
     */
    public com.webobjects.directtoweb.SelectPageInterface selectPageForEntityNamed(java.lang.String entityName, com.webobjects.appserver.WOSession session){
        return null; //TODO codavaj!!
    }

    /**
     * Sets the Direct to Web factory, an instance of D2W that is used to create all of the Direct to Web pages of an application. Use this method when you create a custom subclass of D2W.
     */
    public static void setFactory(com.webobjects.directtoweb.D2W newValue){
        return; //TODO codavaj!!
    }

    /**
     * Deprecated.
     * This is here for backwards compatibility. Use setWebAssistantEnabled instead.
     */
    public void setLiveAssistantEnabled(boolean newValue){
        return; //TODO codavaj!!
    }

    /**
     * Sets whether the Web Assistant is enabled or not. Remember to disable the Web Assistant in a deployed application to prevent users from modifying the configuration of the application.
     */
    public void setWebAssistantEnabled(boolean newValue){
        return; //TODO codavaj!!
    }

    /**
     * Deprecated.
     */
    public static boolean traceRuleFiringEnabled(){
        return false; //TODO codavaj!!
    }

    /**
     * Deprecated.
     */
    public static boolean traceRuleModificationsEnabled(){
        return false; //TODO codavaj!!
    }

    /**
     * Deprecated.
     * This method is deprecated. Use visibleEntityNames(WOSession session) instead.
     */
    public com.webobjects.foundation.NSArray visibleEntityNames(){
        return null; //TODO codavaj!!
    }

    public com.webobjects.foundation.NSArray visibleEntityNames(com.webobjects.appserver.WOSession session){
        return null; //TODO codavaj!!
    }

    /**
     * Is invoked when the user clicks Customize in the menu bar. Activates the Web Assistant in the user's Web browser.
     */
    public com.webobjects.appserver.WOComponent webAssistantInContext(com.webobjects.appserver.WOContext context){
        return null; //TODO codavaj!!
    }

    /**
     * This method is intentionally undocumented. You should never have to invoke or customize it.
     */
    public void willCheckRules(com.webobjects.foundation.NSNotification n){
        return; //TODO codavaj!!
    }

}


package com.webobjects.directtoweb;

import com.apple.client.directtoweb.common.*;
import com.webobjects._eoproject._WBInterfaceContext;
import com.webobjects._eoproject._WBKeyDescriptor;
import com.webobjects.appserver.*;
import com.webobjects.appserver._private.WOProjectBundle;
import com.webobjects.directtoweb.generation.DTWTemplate;
import com.webobjects.eoaccess.EOEntity;
import com.webobjects.eoaccess.EOModelGroup;
import com.webobjects.eocontrol.*;
import com.webobjects.foundation.*;
import java.io.IOException;
import java.lang.reflect.Method;
import java.util.*;


public class D2W {
    private class _UrlFormValues {


        _UrlFormValues(String u, NSDictionary fv) { return null; }

        String url;
        NSDictionary formValues;
        final D2W this$0;

    }

    public class _Observer {


        public _Observer() { return null; }

        public void requestWasHandled(NSNotification n) {}

        final D2W this$0;

    }



    public D2W() { return null; }

    public static D2W factory() { return null; }

    public static void setFactory(D2W newValue) { return null; }

    _WBInterfaceContext parsedProject() { return null; }

    public boolean isWebAssistantEnabled() { return true; }

    /**
     * @deprecated Method isLiveAssistantEnabled is deprecated
     */

    public boolean isLiveAssistantEnabled() { return true; }

    /**
     * @deprecated Method traceRuleFiringEnabled is deprecated
     */

    public static boolean traceRuleFiringEnabled() { return null; }

    /**
     * @deprecated Method traceRuleModificationsEnabled is deprecated
     */

    public static boolean traceRuleModificationsEnabled() { return null; }

    boolean isWebAssistantTrackingEnabled() { return null; }

    void logWebAssistantMessage() { return null; }

    public void setWebAssistantEnabled(boolean newValue) {}

    /**
     * @deprecated Method setLiveAssistantEnabled is deprecated
     */

    public void setLiveAssistantEnabled(boolean newValue) {}

    private void _enableTracking() {}

    boolean isWebAssistantConnected() { return null; }

    public void _applicationWillFinishLaunching(NSNotification n) {}

    public void _init() {}

    public void _applicationDidFinishLaunching(NSNotification n) {}

    public void checkMultithreading(NSNotification n) {}

    protected void init() {}

    private void _checkRules() {}

    public void activateWebAssistantServer() {}

    public WOComponent webAssistantInContext(WOContext context) { return null; }

    boolean isWebAssistantActive() { return null; }

    int assistantPort() { return null; }

    private void _revertUserModel() {}

    private void _saveUserModel() {}

    private void _removeCustomSettings(ServerSideSettings s) {}

    private void _newSettings(ServerSideSettings s) {}

    private void _removeDynamicPage(ServerSideSettings settings) {}

    private boolean _isRealPage(WOComponent page) { return true; }

    private void _generatePageInContext(String componentName, WOComponent pageToGenerate, WOContext context) {}

    private void _generateDynamicTemplate(ServerSideSettings settings) {}

    private AssistantPacket _packetForRevertedSettings(Settings settings, WOComponent page) { return null; }

    private AssistantPacket _packetForClientConfiguration() { return null; }

    private AssistantPacket _packetForPropertyChildren(Property property, Settings settings) { return null; }

    private void _refresh() {}

    synchronized AssistantPacket responseTo(AssistantPacket packet, AssistantConnection sender, WOComponent lastPage) { return null; }

    static String taskFromPage(WOComponent page) { return null; }

    public static String entityNameFromPage(WOComponent page) { return null; }

    static EOEntity entityFromPage(WOComponent page) { return null; }

    protected AssistantPacket packetForSettingsWithPage(Settings settings, WOComponent lastPage) { return null; }

    protected AssistantPacket packetForPropertyAndSettingsWithPage(Property p, Settings settings, WOComponent lastPage) { return null; }

    private D2WContext _inferContextFromPage(WOComponent currentPage) { return null; }

    private void _configureD2WPageWithTaskEntity(D2WPage page, String task, EOEntity entity) {}

    private WOComponent _pageWithContextTaskEntity(D2WContext newContext, String task, String entityName, WOSession session) { return null; }

    private WOComponent _pageWithContextTaskEntity(D2WContext newContext, String task, String entityName, WOContext context) { return null; }

    public WOComponent pageForTaskAndEntityNamed(String task, String entityName, WOSession session) { return null; }

    protected WOComponent pageForTaskAndEntityNamed(String task, String entityName, WOContext context) { return null; }

    WOComponent frameForTaskAndEntityNamed(String task, String entityName, WOSession session) { return null; }

    public NSArray visibleEntityNames(WOSession session) { return null; }

    /**
     * @deprecated Method visibleEntityNames is deprecated
     */

    public NSArray visibleEntityNames() { return null; }

    public WOComponent pageForConfigurationNamed(String dynamicPageName, WOSession session) { return null; }

    private WOComponent _dynamicPageNamed(String dynamicPageName, WOContext context) { return null; }

    public QueryAllPageInterface queryAllPage(WOSession session) { return null; }

    public QueryPageInterface queryPageForEntityNamed(String entityName, WOSession session) { return null; }

    public ConfirmPageInterface confirmPageForEntityNamed(String entityName, WOSession session) { return null; }

    public ListPageInterface listPageForEntityNamed(String entityName, WOSession session) { return null; }

    public SelectPageInterface selectPageForEntityNamed(String entityName, WOSession session) { return null; }

    public EditPageInterface editPageForEntityNamed(String entityName, WOSession session) { return null; }

    private EOEnterpriseObject _newObjectWithEntityNamed(String entityName, WOSession session, EOEditingContext peerContext) { return null; }

    public EditPageInterface editPageForNewObjectWithEntityNamed(String entityName, WOSession session) { return null; }

    public EditPageInterface editPageForNewObjectWithConfigurationNamed(String configurationName, WOSession session) { return null; }

    public InspectPageInterface inspectPageForEntityNamed(String entityName, WOSession session) { return null; }

    public EditRelationshipPageInterface editRelationshipPageForEntityNamed(String entityName, WOSession session) { return null; }

    public ErrorPageInterface errorPage(WOSession session) { return null; }

    public ErrorPageInterface errorPage(WOContext context) { return null; }

    public WOComponent defaultPage(WOSession session) { return null; }

    void newConnection(AssistantConnection newConnection) { return null; }

    void removeConnection(AssistantConnection c) { return null; }

    private void _broadcastPacket(AssistantPacket p) throws IOException {}

    private void _broadcastSettingsForPage(WOComponent page) throws IOException {}

    private void _setCurrentContext(WOContext currentContext) {}

    String urlForPage(WOComponent page) { return null; }

    String lastUrl() { return null; }

    public void willCheckRules(NSNotification n) {}

    public void requestWasHandled(WOContext c) {}

    public void newSignificantKey(String newKey) {}

    public String homeHrefInContext(WOContext context) { return null; }

    static  {}

    private static final int _PageCacheSize = 10;
    private static final String _IsWebAssistantEnabledKey = "D2WWebAssistantEnabled";
    private static final String _IsWebAssistantTrackingEnabledKey = "D2WWebAssistantTrackingEnabled";
    private static final String _UnknownTaskMarker = "??";
    private static final Class _NotificationArray[];
    private static D2W _factory;
    private static boolean _isWebAssistantEnabled;
    private static boolean _isWebAssistantTrackingEnabled;
    private _WBInterfaceContext _parsedProject;
    private D2WModel _model;
    private D2WContext _localContext;
    private Vector _connections;
    private AssistantServer _server;
    private AssistantConnection _lastRefreshTarget;
    private AssistantPacket _refreshPacket;
    private AssistantPacket _showAssistantPacket;
    private AssistantPacket _okPacket;
    private volatile WOComponent _lastPage;
    private boolean _didInit;
    private Vector _recentPages;
    private Hashtable _recentPagesHashtable;
    private boolean _trackingEnabled;
    private boolean _haveToCheckRules;
    private boolean _webAssistantIsActive;
    protected _Observer trackingObserver;

}

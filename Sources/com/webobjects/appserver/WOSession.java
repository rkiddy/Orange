
package com.webobjects.appserver;

import com.webobjects.appserver._private.WOShared;
import com.webobjects.appserver._private.WOTransactionRecord;
import com.webobjects.appserver._private.WOUniqueIDGenerator;
import com.webobjects.appserver._private._PermanentCacheSingleton;
import com.webobjects.eocontrol.EOEditingContext;
import com.webobjects.eocontrol.EOEventCenter;
import com.webobjects.foundation.*;
import java.io.*;
import java.util.*;


public class WOSession
    implements Cloneable, Serializable, NSKeyValueCoding, com.webobjects.foundation.NSKeyValueCoding.ErrorHandling, NSKeyValueCodingAdditions {
    public static class PageFragmentCache extends LinkedHashMap {


        public PageFragmentCache() { return null; }

        protected boolean removeEldestEntry(java.util.Map.Entry eldest) { return true; }

        public WOComponent pageForContextID(String contextID) { return null; }

        public boolean cleanPageCache(String fragmentKey) { return true; }

        private static final long serialVersionUID = 0xed9acaedL;

    }



    private WOSession(String aSessionID, long time) { return null; }

    private void _finishInitializingSession(WOApplication anApplication, long time) {}

    public WOSession() { return null; }

    public WOSession(String aSessionID) { return null; }

    public Object clone() { return null; }

    public String toString() { return null; }

    public String sessionID() { return null; }

    public void _setSessionID(String id) {}

    public void setDistributionEnabled(boolean aFlag) {}

    public boolean isDistributionEnabled() { return true; }

    public void setStoresIDsInCookies(boolean aFlag) {}

    public boolean storesIDsInCookies() { return true; }

    /**
     * @deprecated Method expirationDateForIDCookies is deprecated
     */

    public NSTimestamp expirationDateForIDCookies() { return null; }

    /**
     * @deprecated Method timeOutForIDCookies is deprecated
     */

    public int timeOutForIDCookies() { return 0; }

    public void setStoresIDsInURLs(boolean aFlag) {}

    public boolean storesIDsInURLs() { return true; }

    private synchronized void _initRendezVousCookiePath() { return null; }

    public String domainForIDCookies() { return null; }

    private void readObject(ObjectInputStream in) throws IOException, ClassNotFoundException {}

    private void _setContextArrayStack(NSArray aContextArrayStack) {}

    private void _setContextRecords(NSDictionary aContextRecords) {}

    private void _setComponentState(NSDictionary aComponentState) {}

    private void _setBirthDate(NSTimestamp aBirthDate) {}

    private void _setStats(NSArray someStats) {}

    private void _setFormattedStats(String aFormattedStats) {}

    private void _setContextCounter(int aContextCounter) {}

    private void _setRequestCounter(int aRequestCounter) {}

    private void _setAllowedToViewStatistics(boolean aFlag) {}

    private void _setAllowedToViewEvents(boolean aFlag) {}

    public void _setHttpSession(Object o) {}

    public void _setHttpSessionWatcher(Object o) {}

    public void _terminateByTimeout() {}

    public void _terminateByJ2EE() {}

    public void terminate() {}

    public boolean isTerminating() { return true; }

    public void setTimeOut(double aTimeInterval) {}

    public double timeOut() { return null; }

    public long timeOutMillis() { return 0L; }

    public void savePageInPermanentCache(WOComponent aPageComponent) {}

    public WOComponent restorePageForContextID(String aContextID) { return null; }

    protected WOComponent getPageFromPageCacheForContextID(String aContextID) { return null; }

    protected WOComponent getPageFromPageFragmentCacheForContextID(String contextID) { return null; }

    public void _awakeInContext(WOContext aContext) {}

    public void _sleepInContext(WOContext aContext) {}

    public void _setContext(WOContext aContext) {}

    public int _contextCounter() { return 0; }

    protected void _contextDidIncrementContextID() {}

    public int _requestCounter() { return 0; }

    public void _saveCurrentPage() {}

    private boolean _shouldPutInPermanentCache(WOComponent aComponent) { return true; }

    public void savePage(WOComponent aPage) {}

    protected void savePageInPageCache(WOComponent aPage) {}

    private int[] _contextArrayForContextID(String contextID) { return null; }

    private void _rearrangeContextArrayStack(String contextID) {}

    public String _contextIDMatchingIDs(WOContext aContext) { return null; }

    protected void savePageInPageFragmentCache(WOComponent page) {}

    public void setLanguages(NSArray someLanguages) {}

    public NSArray languages() { return null; }

    public void setObjectForKey(Object anObject, String aKey) {}

    public Object objectForKey(String aKey) { return null; }

    public Set keySet() { return null; }

    public Enumeration keyEnumerator() { return null; }

    public void removeObjectForKey(String aKey) {}

    public WOContext context() { return null; }

    public void awake() {}

    public void takeValuesFromRequest(WORequest aRequest, WOContext aContext) {}

    public WOActionResults invokeAction(WORequest aRequest, WOContext aContext) { return null; }

    public void appendToResponse(WOResponse aResponse, WOContext aContext) {}

    public void sleep() {}

    public NSArray statistics() { return null; }

    protected NSTimestamp _birthDate() { return null; }

    protected long _lifeInMillis() { return 0L; }

    protected String _formattedStatistics() { return null; }

    protected void _allowToViewStatistics() {}

    public boolean allowedToViewStatistics() { return true; }

    public void validateStatisticsLogin(String password, String username) {}

    public void validationFailedWithException(Throwable t, Object value, String keyPath, WOComponent component) {}

    protected void _allowToViewEvents() {}

    public boolean allowedToViewEvents() { return true; }

    public void validateEventsLogin(String password, String username) {}

    public void _appendCookieToResponse(WOResponse aResponse) {}

    public void _clearCookieFromResponse(WOResponse aResponse) {}

    /**
     * @deprecated Method logString is deprecated
     */

    public static void logString(String string) { return null; }

    /**
     * @deprecated Method debugString is deprecated
     */

    public static void debugString(String string) { return null; }

    private NSMutableDictionary _permanentPageCache() { return null; }

    private WOComponent _permanentPageWithContextID(String aContextID) { return null; }

    public EOEditingContext defaultEditingContext() { return null; }

    public EOEditingContext newDefaultEditingContext() { return null; }

    public void setDefaultEditingContext(EOEditingContext editingContext) {}

    public boolean lockDefaultEditingContext() { return true; }

    public static boolean canAccessFieldsDirectly() { return null; }

    public Object valueForKey(String key) { return null; }

    public void takeValueForKey(Object value, String key) {}

    public Object handleQueryWithUnboundKey(String key) { return null; }

    public void handleTakeValueForUnboundKey(Object value, String key) {}

    public void unableToSetNullForKey(String key) {}

    public Object valueForKeyPath(String keyPath) { return null; }

    public void takeValueForKeyPath(Object value, String keyPath) {}

    static  {}

    static final long serialVersionUID = 0x6040adcaL;
    private String _sessionID;
    private long _timeOut;
    private NSMutableArray _contextArrayStack;
    private NSMutableDictionary _contextRecords;
    private NSArray _languages;
    protected NSMutableDictionary _componentState;
    private NSTimestamp _birthDate;
    private boolean _wasTimedOut;
    private boolean _wasJ2EETerminated;
    private NSMutableArray _stats;
    private StringBuffer _formattedStats;
    private transient WOContext _currentContext;
    private int _contextCounter;
    private int _requestCounter;
    private boolean _allowedToViewStatistics;
    private boolean _allowedToViewEvents;
    private boolean _terminating;
    private boolean _distributionEnabled;
    private boolean _cookieRVEnabled;
    private boolean _URLRVEnabled;
    private NSMutableDictionary _permanentPageCache;
    private NSMutableArray _permanentContextIDArray;
    private PageFragmentCache _pageFragmentCache;
    private EOEditingContext _editingContext;
    private boolean _hasSessionLockedEditingContext;
    public static final String SessionDidTimeOutNotification = "SessionDidTimeOutNotification";
    public static final String SessionDidRestoreNotification = "SessionDidRestoreNotification";
    public static final String SessionDidCreateNotification = "SessionDidCreateNotification";
    private static String TheRendezVousCookiePath;
    protected transient Object _httpSession;
    protected transient Object _httpSessionWatcher;
    private static final NSArray __EmptyStringArray;

}

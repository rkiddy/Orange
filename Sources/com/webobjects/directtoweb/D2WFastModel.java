
package com.webobjects.directtoweb;

import com.webobjects.appserver.WOApplication;
import com.webobjects.appserver.WOResourceManager;
import com.webobjects.eoaccess.EOEntity;
import com.webobjects.foundation.NSArray;
import com.webobjects.foundation.NSLog;
import java.util.Hashtable;
import java.util.Vector;


public class D2WFastModel extends D2WModel {
    static class FastLhsKey extends D2WMultiKey {

        public FastLhsKey(short keyCount) { return null; }

        public FastLhsKey(Object keys[]) { return null; }

        public String toString() { return null; }
    }



    public static D2WFastModel defaultFastModel() { return null; }

    public static String[] significantKeys() { return null; }

    public static void newSignificantKey(String newKey) { return null; }

    public static short significantKeyCount() { return null; }

    public static void _resetSignificantKeys(int maxKeyCount) { return null; }

    protected D2WFastModel(NSArray rules) { return null; }

    protected synchronized Object fireRuleForKeyPathInContext(String keyPath, D2WContext context) { return null; }

    protected synchronized Object fireSystemRuleForKeyPathInContext(String keyPath, D2WContext context) { return null; }

    protected synchronized Vector fireAllRulesForKeyPathInContext(String keyPath, D2WContext context) { return null; }

    protected void invalidateCaches() {}

    public static synchronized boolean _canAssistantBeMadeAvailable(String assistantEnabledKey) { return null; }

    static  {}

    public static final String _TrueValue = "true";
    public static final String _YesValue = "YES";
    private static final Object _NULL_VALUE;
    public static final String _DefaultSignificantKeys[];
    private static final int _MAX_SIGNIFICANT_KEY_COUNT = 32;
    private static String _significantKeys[];
    private static short _significantKeyCount;
    private static short _significantKeyAndKeyPathCount;
    private static boolean _significantKeysChanged;
    static D2WFastModel _defaultModel;
    private Hashtable _cache;
    private Hashtable _systemCache;
    private FastLhsKey _lhsKey;
    private Object _lhsKeys[];
    private int _recursing;

}

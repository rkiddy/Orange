
package com.webobjects.jndiadaptor;

import com.webobjects.eoaccess.EOAdaptor;
import com.webobjects.eoaccess.EOAdaptorContext;
import com.webobjects.eoaccess.EOModel;
import com.webobjects.eoaccess.EOSQLExpressionFactory;
import com.webobjects.eoaccess.EOUtilities;
import com.webobjects.eoaccess.synchronization.EOSchemaGeneration;
import com.webobjects.eocontrol.EOEditingContext;
import com.webobjects.eocontrol.EOObjectStoreCoordinator;
import com.webobjects.foundation.NSArray;
import com.webobjects.foundation.NSDictionary;
import com.webobjects.foundation.NSLog;
import com.webobjects.foundation.NSMutableDictionary;
import com.webobjects.foundation._NSUtilities;
import javax.naming.CommunicationException;


public class JNDIAdaptor extends EOAdaptor {
    class _ContextFactory extends _EOCachedObjectFactory {


        _ContextFactory() { return null; }

        private JNDIContext _cachedContext() { return null; }

        public JNDIContext createContext() { return null; }

        public JNDIContext createCachedContext() { return null; }

        public synchronized void clearCache() { return null; }

        protected Object doCreate() { return null; }

        final JNDIAdaptor this$0;

    }

    class _Environment {


        public _Environment() { return null; }

        public String authenticationMethod() { return null; }

        public int defaultScope() { return 0; }

        public String initialContextFactory() { return null; }

        public String password() { return null; }

        public String plugInClassName() { return null; }

        public String serverUrl() { return null; }

        public int timeout() { return 0; }

        public String username() { return null; }

        public String toString() { return null; }

        private String _stringForKey(String key) { return null; }

        final JNDIAdaptor this$0;

    }



    public JNDIAdaptor(String name) { return null; }

    synchronized _Environment _environment() { return null; }

    public synchronized JNDIPlugIn plugIn() { return null; }

    private JNDIPlugIn _createPlugIn() { return null; }

    public EOSQLExpressionFactory expressionFactory() { return null; }

    public EOSchemaGeneration schemaSynchronizationFactory() { return null; }

    /**
     * @deprecated Method synchronizationFactory is deprecated
     */

    public com.webobjects.eoaccess.EOSchemaGeneration synchronizationFactory() { return null; }

    public EOAdaptorContext createAdaptorContext() { return null; }

    protected JNDIContext _createCachedAdaptorContext() { return null; }

    JNDIContext _doCreateAdaptorContext() { return null; }

    public Class defaultExpressionClass() { return null; }

    public boolean isValidQualifierType(String typeName, EOModel model) { return true; }

    public void assertConnectionDictionaryIsValid() {}

    public synchronized void setConnectionDictionary(NSDictionary dictionary) { return null; }

    public boolean isDroppedConnectionException(Exception exception) { return true; }

    public NSArray externalTypesWithModel(EOModel model) { return null; }

    public void assignExternalInfoForEntireModel(EOModel eomodel) {}

    public static EOEditingContext createEditingContext(String modelName, String serverUrl, String username, String password) { return null; }

    public static final String AuthenticationMethodKey = "authenticationMethod";
    public static final String DefaultScopeKey = "defaultScope";
    public static final String InitialContextFactoryKey = "initialContextFactory";
    public static final String PasswordKey = "password";
    public static final String PlugInClassNameKey = "plugInClassName";
    public static final String ServerUrlKey = "serverUrl";
    public static final String TimeoutKey = "timeout";
    public static final String UsernameKey = "username";
    public static final String NoneKey = "none";
    public static final String ObjectKey = "Object";
    public static final String OneLevelKey = "One Level";
    public static final String SubtreeKey = "Subtree";
    private final _ContextFactory _contextFactory;
    private final _Environment _environment;
    private JNDIPlugIn _plugIn;

}

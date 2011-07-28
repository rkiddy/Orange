
package com.webobjects.jdbcadaptor;

import com.webobjects.eoaccess.*;
import com.webobjects.eoaccess.synchronization.EOSchemaSynchronizationFactory;
import com.webobjects.foundation.*;
import java.util.*;


public class JDBCAdaptor extends EOAdaptor {


    public JDBCAdaptor(String name) { return null; }

    public void setConnectionDictionary(NSDictionary dictionary) throws IllegalArgumentException {}

    protected NSDictionary jdbcInfo() { return null; }

    protected NSDictionary typeInfo() { return null; }

    public Properties connectionProperties() { return null; }

    public boolean canServiceModel(EOModel model) { return true; }

    protected int varcharMaxLength() { return 0; }

    public void assertConnectionDictionaryIsValid() {}

    private JDBCPlugIn _createPlugIn() { return null; }

    protected JDBCContext _cachedAdaptorContext() { return null; }

    public EOAdaptorContext createAdaptorContext() { return null; }

    public void handleDroppedConnection() {}

    public JDBCPlugIn plugIn() { return null; }

    public String plugInName() { return null; }

    public Class defaultExpressionClass() { return null; }

    public EOSQLExpressionFactory expressionFactory() { return null; }

    public EOSchemaSynchronizationFactory schemaSynchronizationFactory() { return null; }

    /**
     * @deprecated Method synchronizationFactory is deprecated
     */

    public EOSchemaGeneration synchronizationFactory() { return null; }

    public Object fetchedValueForValue(Object value, EOAttribute attribute) { return null; }

    public NSArray externalTypesWithModel(EOModel model) { return null; }

    public String externalTypeForJDBCType(int type) { return null; }

    public boolean isValidQualifierType(String typeName, EOModel model) { return true; }

    protected String connectionDictionaryURL() { return null; }

    public String connectionURL() { return null; }

    public String username() { return null; }

    public String password() { return null; }

    public String driverName() { return null; }

    private static String _objcClassNameForType(int columnType, int precision, int scale) { return null; }

    private static String _javaClassNameForType(int columnType, int precision, int scale) { return null; }

    private static String _valueType(int columnType, int precision, int scale) { return null; }

    protected static char _valueTypeCharForAttribute(EOAttribute attr) { return null; }

    public EOAttribute createAttribute(String name, String columnName, int columnType, String externalType, int precision, int scale, int isNullable) { return null; }

    protected static NSDictionary typeInfoForModel(EOModel model) { return null; }

    protected static NSDictionary getJDBCInfoWithConnectionDictionary(NSDictionary connectionDictionary) throws JDBCAdaptorException { return null; }

    public static String stringRepresentationForJDBCType(int columnType) { return null; }

    public boolean isDroppedConnectionException(Exception exception) { return true; }

    private String _externalTypeForJDBCType(int type) { return null; }

    private static int _intForKey(NSDictionary dict, String key) { return null; }

    private static int _prependPreferredSQLTypes(int sqlTypeArray[], EOAttribute attribute) { return null; }

    public void assignExternalTypeForAttribute(EOAttribute attribute) {}

    static  {}

    public static final String JDBCInfoKey = "jdbc2Info";
    public static final String DataSourceJndiNameKey = "DataSourceJndiName";
    public static final String TypeInfoKey = "typeInfo";
    public static final String UsernameKey = "username";
    public static final String PasswordKey = "password";
    public static final String DriverKey = "driver";
    public static final String PlugInKey = "plugin";
    public static final String URLKey = "URL";
    protected EOSQLExpressionFactory _expressionFactory;
    protected JDBCPlugIn _plugin;
    protected NSDictionary _jdbcInfo;
    protected JDBCContext _cachedContext;
    protected int _varcharMaxLength;
    private String _driverName;
    private static final String CN_JavaString = "java.lang.String";
    private static final String CN_JavaNumber = "java.lang.Number";
    private static final String CN_JavaBigDecimal = "java.math.BigDecimal";
    private static final String CN_JavaNSTimestamp = "com.webobjects.foundation.NSTimestamp";
    private static final String CN_JavaNSData = "com.webobjects.foundation.NSData";
    private static final String CN_NSString = "NSString";
    private static final String CN_NSNumber = "NSNumber";
    private static final String CN_NSDecimalNumber = "NSDecimalNumber";
    private static final String CN_NSCalendarDate = "NSCalendarDate";
    private static final String CN_NSData = "NSData";
    static final int OracleRefCursor = -10;
    static final String CN_JavaResultSet = "java.sql.ResultSet";
    static final String OracleRefCursorName = "REF CURSOR";
    private boolean hasWarnedNoJDBCInfo;
    private final Set warnedExternalTypes;
    private static final String _serviceKeys[];

}

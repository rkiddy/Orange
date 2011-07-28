
package com.webobjects.jdbcadaptor;

import com.webobjects.eoaccess.*;
import com.webobjects.foundation.*;
import java.io.PrintWriter;
import java.sql.*;
import java.util.Enumeration;
import javax.naming.*;
import javax.sql.DataSource;


public class JDBCContext extends EOAdaptorContext {


    private void _appendSQLExceptionToBuffer(StringBuffer buffer, SQLException exception) {}

    void _jdbcErrorWithChannel(JDBCChannel channel, SQLException exception, boolean flag, String message) { return null; }

    public JDBCContext(EOAdaptor adaptor) { return null; }

    protected void _setAutoCommit(boolean flag) {}

    public boolean connect() throws JDBCAdaptorException { return true; }

    public void setupJndiConfiguration() throws JDBCAdaptorException {}

    void _tryConnect() throws JDBCAdaptorException { return null; }

    public void disconnect() throws JDBCAdaptorException {}

    protected JDBCChannel _cachedAdaptorChannel() { return null; }

    public EOAdaptorChannel createAdaptorChannel() { return null; }

    public void beginTransaction() {}

    public void commitTransaction() {}

    public void rollbackTransaction() {}

    void _channelWillOpen() { return null; }

    void _channelDidClose() { return null; }

    void _channelWillBeginFetching() { return null; }

    void _channelDidEndFetching() { return null; }

    public Connection connection() { return null; }

    void _setJdbcConnection(Connection connection) { return null; }

    String _externalTypeInModel(int type) { return null; }

    NSDictionary _fetchJDBCInfo() throws JDBCAdaptorException { return null; }

    public void handleDroppedConnection() {}

    static  {}

    public static final String DBMSNameKey = "DBMS_NAME";
    public static final String DriverNameKey = "DRIVER_NAME";
    public static final String DriverVersionKey = "DRIVER_VER";
    public static final String StringFunctionsKey = "STRING_FUNCTIONS";
    public static final String IdentifierQuoteStringKey = "IDENTIFIER_QUOTE_STRING";
    public static final String NonNullableColumnsKey = "NON_NULLABLE_COLUMNS";
    public static final String ANSI92ConformanceKey = "ANSI92_CONFORMANCE";
    public static final String ANSIFullConformance = "ANSI92Full";
    public static final String ANSIIntermediateConformance = "ANSI92Intermediate";
    public static final String ANSIEntryConformance = "ANSI92EntryLevel";
    public static final String DefaultJDBCTypeKey = "defaultJDBCType";
    public static final String PrecisionKey = "precision";
    public static final String MinScaleKey = "minScale";
    public static final String MaxScaleKey = "maxScale";
    public static final String NullableKey = "isNullable";
    public static final String SearchableKey = "isSearchable";
    public static final String CreateParamsKey = "createParams";
    public static final String InternalTypeKey = "internalType";
    static final String _DBAccess = "ACCESS";
    static final String _DBMSSQLserver = "Microsoft SQL Server";
    static final String _DBJDBC_ODBC_Bridge = "JDBC-ODBC Bridge (odbcjt32.dll)";
    protected Connection _jdbcConnection;
    protected JDBCChannel _cachedChannel;
    private int _fetchesInProgress;
    private int _openChannelCount;
    private NSArray _statementsToExecute;
    protected boolean _connectionSupportTransaction;
    private String _dataSourceJndiName;

}

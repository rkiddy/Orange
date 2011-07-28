
package com.webobjects.jdbcadaptor;

import com.webobjects.eoaccess.EOAdaptorContext;
import com.webobjects.eoaccess.EOAttribute;
import com.webobjects.eoaccess.EOEntity;
import com.webobjects.eoaccess.EOStoredProcedure;
import com.webobjects.foundation.NSArray;
import com.webobjects.foundation.NSData;
import com.webobjects.foundation.NSDictionary;
import com.webobjects.foundation.NSKeyValueCoding;
import com.webobjects.foundation.NSMutableDictionary;
import com.webobjects.foundation.NSTimestamp;
import com.webobjects.foundation._NSStringUtilities;
import com.webobjects.foundation._NSUtilities;
import java.io.ByteArrayInputStream;
import java.io.StringReader;
import java.math.BigDecimal;
import java.sql.CallableStatement;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Timestamp;
import java.util.Date;


class JDBCColumn {


    public JDBCColumn(JDBCChannel channel) { return null; }

    public JDBCColumn(EOAttribute attribute, JDBCChannel channel) { return null; }

    public JDBCColumn(EOAttribute attribute, JDBCChannel channel, int index, ResultSet resultSet) { return null; }

    public void setStatement(PreparedStatement statement) {}

    private JDBCPlugIn _plugIn() { return null; }

    protected void setAttribute(EOAttribute attribute) {}

    private boolean _attributeIsBigDecimal(EOAttribute attr) { return true; }

    private static BigDecimal _setScaleUpForAttribute(BigDecimal value, EOAttribute attr) { return null; }

    private static BigDecimal _setScaleDownForAttribute(BigDecimal value, EOAttribute attr) { return null; }

    private char _valueTypeWhenNull() { return null; }

    private Object _getStoredProcedureValue(CallableStatement statement) throws SQLException { return null; }

    protected Object getStoredProcedureValue(EOAttribute attribute, int column, CallableStatement statement) { return null; }

    private Object _fetchText() throws SQLException { return null; }

    private Object _fetchCorrectObject(boolean materializeLOBs) throws SQLException { return null; }

    private Object _processValueIfNeeded(Object value) { return null; }

    public Object fetchValue() { return null; }

    Object _fetchValue(boolean materializeLobs) { return null; }

    public void connectToColumn(int index, ResultSet resultSet) {}

    private Integer _computeJdbcTypeForAttribute() { return null; }

    private Integer _jdbcTypeValue() { return null; }

    protected void registerAttributeForStoredProcedure() {}

    public void bindAttributeForColumn(int index, PreparedStatement statement) {}

    private int _varcharMaxLength() { return 0; }

    public void takeInputValue(Object value, int index, boolean storedProcedure) {}

    private Object _newValueForBytes(byte bytes[], int length) { return null; }

    private Object _newValueForBytesString(byte bytes[], int length) { return null; }

    private Object _newValueForImmutableBytes(byte bytes[]) { return null; }

    private Object _newValueForString(String str) { return null; }

    static  {}

    EOAttribute _attribute;
    int _column;
    ResultSet _rs;
    PreparedStatement _statement;
    JDBCChannel _channel;
    int _adaptorValueType;
    char _valueType;
    boolean _customType;
    int _width;
    protected static final NSDictionary _jdbcTypeDictionary;
    private static Integer OracleRefCursorInteger;

}

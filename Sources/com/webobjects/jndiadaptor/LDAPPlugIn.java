
package com.webobjects.jndiadaptor;

import com.webobjects.eoaccess.EOAttribute;
import com.webobjects.eoaccess.EOEntity;
import com.webobjects.eocontrol.*;
import com.webobjects.foundation.*;
import java.math.BigDecimal;


public class LDAPPlugIn extends JNDIPlugIn {
    private class _GeneralizedTimeType extends _TimestampType {


        public _GeneralizedTimeType(String objectIdentifier, String name) { return null; }

        final LDAPPlugIn this$0;

    }

    private class _UTCTimeType extends _TimestampType {


        public _UTCTimeType(String objectIdentifier, String name) { return null; }

        protected int offsetIndex(String s) { return 0; }

        private boolean _hasCentury(String s) { return true; }

        protected String dateTime(String s) { return null; }

        private String _century(String ymdHMS) { return null; }

        final LDAPPlugIn this$0;

    }

    private abstract class _TimestampType extends _JNDIType
        implements JNDIType {


        public _TimestampType(String objectIdentifier, String name) { return null; }

        public String javaValueClassName() { return null; }

        public String objCValueClassName() { return null; }

        public String filterExpression(Object internal) { return null; }

        protected Object convert(Object external, String valueType) { return null; }

        protected int offsetIndex(String s) { return 0; }

        protected String dateTime(String s) { return null; }

        protected NSTimeZone timeZone(String s) { return null; }

        protected Object revert(Object internal) { return null; }

        private final NSTimestampFormatter _formatter;
        final LDAPPlugIn this$0;

    }

    private class _StringType extends _JNDIType
        implements JNDIType {


        public _StringType(String objectIdentifier, String name) { return null; }

        public String javaValueClassName() { return null; }

        public String objCValueClassName() { return null; }

        protected Object convert(Object external, String valueType) { return null; }

        protected Object revert(Object internal) { return null; }

        final LDAPPlugIn this$0;

    }

    private class _BigDecimalType extends _NumberType {


        public _BigDecimalType(String objectIdentifier, String name) { return null; }

        public String javaValueClassName() { return null; }

        protected Object convert(Object external, String valueType) { return null; }

        protected Object revert(Object internal) { return null; }

        final LDAPPlugIn this$0;

    }

    private class _DoubleType extends _NumberType {


        public _DoubleType(String objectIdentifier, String name) { return null; }

        protected Object convert(Object external, String valueType) { return null; }

        final LDAPPlugIn this$0;

    }

    private class _FloatType extends _NumberType {


        public _FloatType(String objectIdentifier, String name) { return null; }

        protected Object convert(Object external, String valueType) { return null; }

        final LDAPPlugIn this$0;

    }

    private class _LongType extends _NumberType {


        public _LongType(String objectIdentifier, String name) { return null; }

        protected Object convert(Object external, String valueType) { return null; }

        final LDAPPlugIn this$0;

    }

    private class _IntegerType extends _NumberType {


        public _IntegerType(String objectIdentifier, String name) { return null; }

        protected Object convert(Object external, String valueType) { return null; }

        final LDAPPlugIn this$0;

    }

    private class _ShortType extends _NumberType {


        public _ShortType(String objectIdentifier, String name) { return null; }

        protected Object convert(Object external, String valueType) { return null; }

        final LDAPPlugIn this$0;

    }

    private class _BooleanType extends _NumberType {


        public _BooleanType(String objectIdentifier, String name) { return null; }

        protected Object convert(Object external, String valueType) { return null; }

        protected Object revert(Object internal) { return null; }

        final LDAPPlugIn this$0;

    }

    private class _NumberType extends _JNDIType
        implements JNDIType {


        public _NumberType(String objectIdentifier, String name) { return null; }

        public _NumberType(String objectIdentifier, String name, String valueType) { return null; }

        public String javaValueClassName() { return null; }

        public String objCValueClassName() { return null; }

        protected Object convert(Object external, String valueType) { return null; }

        protected Object revert(Object internal) { return null; }

        final LDAPPlugIn this$0;

    }

    private class _DataType extends _JNDIType
        implements JNDIType {


        public _DataType(String objectIdentifier, String name) { return null; }

        public String javaValueClassName() { return null; }

        public String objCValueClassName() { return null; }

        public String filterExpression(Object internal) { return null; }

        protected Object convert(Object external, String valueType) { return null; }

        protected Object revert(Object internal) { return null; }

        final LDAPPlugIn this$0;

    }

    class _KeyValueQualifierFormatter {


        _KeyValueQualifierFormatter() { return null; }

        public String parse(EOKeyValueQualifier qualifier, EOEntity entity) { return null; }

        protected EOAttribute attribute(EOEntity entity, String attributeName) { return null; }

        protected boolean requiresNegation(NSSelector selector, Object value) { return true; }

        protected boolean isInverted(NSSelector selector) { return true; }

        protected boolean isNull(Object value) { return true; }

        protected String operatorString(NSSelector selector) { return null; }

        protected boolean assertsPresence(NSSelector selector) { return true; }

        protected String valueString(EOAttribute attribute, NSSelector selector, Object value) { return null; }

        protected String convertSpecialCharactersForFilter(String valueString) { return null; }

        final LDAPPlugIn this$0;

    }

    private class _FilterVisitorImpl extends _VisitorImpl
        implements JNDIPlugIn._FilterVisitor {


        public _FilterVisitorImpl(EOEntity entity) { return null; }

        public String filter() { return null; }

        public void visitKeyValueQualifier(EOKeyValueQualifier qualifier) {}

        public void visitNotQualifier(EONotQualifier qualifier) {}

        public void visitAndQualifier(EOAndQualifier qualifier) {}

        public void visitOrQualifier(EOOrQualifier qualifier) {}

        private final StringBuffer _filter;
        final LDAPPlugIn this$0;

    }

    private class _BaseVisitorImpl extends _VisitorImpl
        implements JNDIPlugIn._BaseVisitor {


        public _BaseVisitorImpl(EOEntity entity) { return null; }

        public String base() { return null; }

        public void visitKeyValueQualifier(EOKeyValueQualifier qualifier) {}

        private String _string(Object value) { return null; }

        private volatile String _base;
        final LDAPPlugIn this$0;

    }

    private abstract class _VisitorImpl {


        public _VisitorImpl(EOEntity entity) { return null; }

        public EOEntity entity() { return null; }

        public void visitUnknownQualifier(EOQualifier qualifier) {}

        public void visitKeyComparisonQualifier(EOKeyComparisonQualifier qualifier) {}

        public void visitKeyValueQualifier(EOKeyValueQualifier qualifier) {}

        public void visitNotQualifier(EONotQualifier qualifier) {}

        public void visitAndQualifier(EOAndQualifier qualifier) {}

        public void visitOrQualifier(EOOrQualifier qualifier) {}

        private final EOEntity _entity;
        final LDAPPlugIn this$0;

    }



    public LDAPPlugIn() { return null; }

    public synchronized NSArray jndiTypes() { return null; }

    private NSArray _createJndiTypes() { return null; }

    NSDictionary _createSynonyms() { return null; }

    public synchronized JNDIType defaultType() { return null; }

    public String base(EOFetchSpecification fetchSpecification, EOEntity entity) { return null; }

    public String filter(EOFetchSpecification fetchSpecification, EOEntity entity) { return null; }

    private void _nextChar() {}

    private void _skipChar() {}

    public String convertSpecialCharactersForDistinguishedName(String name) { return null; }

    private String _formatDistinguishedName(String str, boolean mustReplace, EOAttribute rdnAtt, NSDictionary row) { return null; }

    public String relativeDistinguishedNameForNewRow(NSDictionary row, EOAttribute relativeDistinguishedNameAttribute, String currentRelativeDistinguishedNameAttributeValue) { return null; }

    static  {}

    static final NSTimeZone _GMT;
    private static final String _ID = "1.3.6.1.4.1.1466.115.121.1.";
    private NSArray _jndiTypes;
    private JNDIType _defaultType;
    private char _chars[];
    private char _ch;
    private int _maxPos;
    private int _parsePos;
    private StringBuffer _sb;
    private static boolean _specialChar[];
    private StringBuffer _sbuffer;

}

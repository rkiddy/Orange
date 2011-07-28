
package com.webobjects.jndiadaptor;

import com.webobjects.eoaccess.*;
import com.webobjects.eocontrol.EOFetchSpecification;
import com.webobjects.eocontrol.EOQualifier;
import com.webobjects.foundation.*;
import javax.naming.*;
import javax.naming.directory.*;


public class JNDIChannel extends EOAdaptorChannel {
    private class _ModelBuilderImpl
        implements _EOReverseEngineeringDirector._ModelBuilder {


        public _ModelBuilderImpl() { return null; }

        public synchronized EOModel model() { return null; }

        public synchronized EOEntity entity() { return null; }

        public synchronized EOAttribute attribute() { return null; }

        public synchronized void buildModel(EOAdaptor adaptor) { return null; }

        public synchronized void doBuildModel(EOAdaptor adaptor) { return null; }

        public synchronized void buildEntity(String entityExternalName) { return null; }

        private void _buildAttributeExternalNames(String entityExternalName) {}

        public synchronized void buildPrimaryKeyAttributes(boolean isClassProperty) { return null; }

        public synchronized void buildAttributes() { return null; }

        private void _buildAttributes(NSArray attributeExternalNames, boolean allowsNull) {}

        public synchronized void buildAttribute(String attributeExternalName, boolean allowsNull) { return null; }

        private String _canonicalName(String name) { return null; }

        private void _restrictObjectClassAttribute() {}

        private String _internalName(DirContext schema, String externalName) { return null; }

        private String _javaIdentifier(String name) { return null; }

        private JNDIType _type(String syntax) { return null; }

        private String _trimSyntax(String syntax) { return null; }

        private String _inheritedSyntax(String attributeExternalName) { return null; }

        private DirContext _schemaRoot;
        private _JNDITypeMap _typeMap;
        private NSDictionary _synonyms;
        private EOModel _model;
        private EOEntity _entity;
        private EOAttribute _attribute;
        private NSMutableArray _musts;
        private NSMutableArray _mays;
        final JNDIChannel this$0;


        // Unreferenced inner class com/webobjects/jndiadaptor/JNDIChannel$_ModelBuilderImpl$1

/* anonymous class */
        class _cls1
            implements JNDIPlugIn.ChannelOperation {


            _cls1() { return null; }

            public Object performOperation() { return null; }

            final EOAdaptor val$adaptor;
            final _ModelBuilderImpl this$1;

        }

    }

    private class _EntityExternalNamesBuilderImpl
        implements _EOReverseEngineeringDirector._EntityExternalNamesBuilder {


        public _EntityExternalNamesBuilderImpl() { return null; }

        public synchronized NSArray entityExternalNames() { return null; }

        public synchronized void buildEntityExternalNames() { return null; }

        protected void doBuildEntityExternalNames() {}

        private DirContext _schemaRoot;
        private NSMutableArray _entityExternalNames;
        final JNDIChannel this$0;


        // Unreferenced inner class com/webobjects/jndiadaptor/JNDIChannel$_EntityExternalNamesBuilderImpl$1

/* anonymous class */
        class _cls1
            implements JNDIPlugIn.ChannelOperation {


            _cls1() { return null; }

            public Object performOperation() { return null; }

            final _EntityExternalNamesBuilderImpl this$1;

        }

    }



    public JNDIChannel(JNDIContext context) { return null; }

    private JNDIContext _context() { return null; }

    JNDIAdaptor._Environment _environment() { return null; }

    JNDIPlugIn _plugIn() { return null; }

    InitialDirContext _initialDirContext() { return null; }

    private synchronized _EOReverseEngineeringDirector _director() { return null; }

    private synchronized _EntityExternalNamesBuilderImpl _entityExternalNamesBuilder() { return null; }

    private synchronized _ModelBuilderImpl _modelBuilder() { return null; }

    private synchronized _JNDIDeleter _deleter() { return null; }

    private synchronized _JNDIFetcher _fetcher() { return null; }

    private synchronized _JNDIInserter _inserter() { return null; }

    private synchronized _JNDIUpdater _updater() { return null; }

    public boolean isOpen() { return true; }

    public void openChannel() {}

    public void closeChannel() {}

    public void insertRow(NSDictionary row, EOEntity entity) {}

    public int updateValuesInRowsDescribedByQualifier(NSDictionary row, EOQualifier qualifier, EOEntity entity) { return 0; }

    public int deleteRowsDescribedByQualifier(EOQualifier qualifier, EOEntity entity) { return 0; }

    public void selectAttributes(NSArray attributes, EOFetchSpecification fetchSpecification, boolean isLocking, EOEntity entity) {}

    public void evaluateExpression(EOSQLExpression expression) {}

    public boolean isFetchInProgress() { return true; }

    public NSArray describeResults() { return null; }

    public NSMutableDictionary fetchRow() { return null; }

    public void setAttributesToFetch(NSArray attributes) {}

    public NSArray attributesToFetch() { return null; }

    public void cancelFetch() {}

    public NSArray describeTableNames() { return null; }

    public EOModel describeModelWithTableNames(NSArray tableNames) { return null; }

    public void executeStoredProcedure(EOStoredProcedure storedProcedure, NSDictionary values) {}

    public NSDictionary returnValuesForLastStoredProcedureInvocation() { return null; }

    private NSArray _attributes(EOEntity entity, NSDictionary row) { return null; }

    private EOFetchSpecification _createFetchSpecification(EOEntity entity, EOQualifier qualifier) { return null; }

    public NSArray primaryKeysForNewRowsWithEntity(int count, EOEntity entity) { return null; }

    static DirContext _schemaRoot(InitialDirContext initialDirContext) { return null; }

    static DirContext _lookup(DirContext schema, String name) { return null; }

    static Attribute _attribute(DirContext schema, String attId) { return null; }

    static Object _value(Attribute attribute) { return null; }

    static NSArray _values(Attribute attribute) { return null; }

    static final String _ObjectClassKey = "objectClass";
    static final String _RelativeDistinguishedNameKey = "relativeDistinguishedName";
    private boolean _isOpen;
    private _EOReverseEngineeringDirector _director;
    private _EntityExternalNamesBuilderImpl _entityExternalNamesBuilder;
    private _ModelBuilderImpl _modelBuilder;
    private _JNDIDeleter _deleter;
    private _JNDIFetcher _fetcher;
    private _JNDIInserter _inserter;
    private _JNDIUpdater _updater;

}

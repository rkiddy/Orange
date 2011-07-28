
package com.webobjects.jndiadaptor;

import com.webobjects.eoaccess.EOAttribute;
import com.webobjects.eoaccess.EOEntity;
import com.webobjects.eocontrol.*;
import com.webobjects.foundation.*;
import java.util.Hashtable;
import javax.naming.NamingException;
import javax.naming.directory.InitialDirContext;
import javax.naming.directory.SearchControls;


public abstract class JNDIPlugIn {
    static interface _FilterVisitor
        extends EOQualifierVisitor {

        public abstract String filter();
    }

    static interface _BaseVisitor
        extends EOQualifierVisitor {

        public abstract String base();
    }

    public static interface ChannelOperation {

        public abstract Object performOperation();
    }



    public JNDIPlugIn() { return null; }

    public abstract NSArray jndiTypes();

    public abstract JNDIType defaultType();

    synchronized _JNDITypeMap _typeMap() { return null; }

    private _JNDITypeMap _createTypeMap() { return null; }

    synchronized NSDictionary _synonyms() { return null; }

    NSDictionary _createSynonyms() { return null; }

    public InitialDirContext createInitialDirContext(JNDIAdaptor adaptor) { return null; }

    public abstract String base(EOFetchSpecification eofetchspecification, EOEntity eoentity);

    String _base(EOFetchSpecification fetchSpecification, EOEntity entity, _BaseVisitor visitor) { return null; }

    public abstract String filter(EOFetchSpecification eofetchspecification, EOEntity eoentity);

    String _filter(EOFetchSpecification fetchSpecification, EOEntity entity, _FilterVisitor visitor) { return null; }

    void _acceptFetchSpecificationAndEntity(EOQualifierVisitor visitor, EOFetchSpecification fetchSpecification, EOEntity entity) { return null; }

    void _acceptQualifier(EOQualifierVisitor visitor, EOQualifier qualifier) { return null; }

    public Object performChannelOperation(ChannelOperation operation) { return null; }

    public String relativeDistinguishedNameForNewRow(NSDictionary row, EOAttribute relativeDistinguishedNameAttribute, String currentRelativeDistinguishedNameAttributeValue) { return null; }

    SearchControls _createSearchControls(JNDIAdaptor._Environment environment, EOFetchSpecification fetchSpecification) { return null; }

    long _countLimit(EOFetchSpecification fetchSpecification) { return null; }

    EOAttribute _primaryKeyAttribute(EOEntity entity) { return null; }

    public static final String MagicPrimaryKey = "";
    private _JNDITypeMap _typeMap;
    private NSDictionary _synonyms;

}

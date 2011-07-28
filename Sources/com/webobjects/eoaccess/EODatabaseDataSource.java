
package com.webobjects.eoaccess;

import com.webobjects.eocontrol.*;
import com.webobjects.foundation.*;
import java.io.*;


public class EODatabaseDataSource extends EODataSource
    implements Serializable, EOKeyValueArchiving, com.webobjects.eocontrol.EOKeyValueArchiving.Awaking, NSCoding {


    protected void _partialInitWithEditingContextEntityNameFetchSpecificationName(EOEditingContext anEditingContext, String anEntityName, String fetchSpecificationName) {}

    private void _setFetchSpecification(EOFetchSpecification fetchSpec) {}

    public void _finishInitialization() {}

    public EODatabaseDataSource(EOEditingContext anEditingContext, String anEntityName, String fetchSpecificationName) { return null; }

    public EODatabaseDataSource(EOEditingContext anEditingContext, String anEntityName) { return null; }

    public Class classForCoder() { return null; }

    public void encodeWithCoder(NSCoder coder) {}

    private static Object _decodeObject(EOEditingContext editingContext, String entityName, EOFetchSpecification fetchSpecification, String fetchSpecificationName, EOQualifier auxiliaryQualifier) { return null; }

    public static Object decodeObject(NSCoder coder) { return null; }

    public void encodeWithKeyValueArchiver(EOKeyValueArchiver archiver) {}

    public static Object decodeWithKeyValueUnarchiver(EOKeyValueUnarchiver unarchiver) { return null; }

    public void awakeFromKeyValueUnarchiver(EOKeyValueUnarchiver unarchiver) {}

    public void awakeFromNib() {}

    public void setEditingContext(EOEditingContext editingContext) {}

    public EOEditingContext editingContext() { return null; }

    public Object createObject() { return null; }

    public EOEntity entity() { return null; }

    public EODatabaseContext databaseContext() { return null; }

    public EOFetchSpecification fetchSpecification() { return null; }

    public void setFetchSpecification(EOFetchSpecification fetchSpec) {}

    public void setFetchSpecificationByName(String fetchSpecificationName) {}

    public String fetchSpecificationName() { return null; }

    public void setAuxiliaryQualifier(EOQualifier newQualifier) {}

    public EOQualifier auxiliaryQualifier() { return null; }

    public NSArray qualifierBindingKeys() { return null; }

    public void setQualifierBindings(NSDictionary bindings) {}

    public NSDictionary qualifierBindings() { return null; }

    public void setFetchEnabled(boolean yn) {}

    public boolean isFetchEnabled() { return true; }

    public EOClassDescription classDescriptionForObjects() { return null; }

    public EOFetchSpecification fetchSpecificationForFetch() { return null; }

    public NSArray fetchObjects() { return null; }

    public void insertObject(Object obj) {}

    public void deleteObject(Object object) {}

    public EODataSource dataSourceQualifiedByKey(String key) { return null; }

    public void qualifyWithRelationshipKey(String key, Object sourceObject) {}

    public static EOQualifier _qualifierForRelationshipKey(String key, EOEnterpriseObject source) { return null; }

    public void setParentDataSourceRelationshipKey(EODataSource parent, String key) {}

    private void writeObject(ObjectOutputStream s) throws IOException {}

    private void readObject(ObjectInputStream s) throws IOException, ClassNotFoundException {}

    static  {}

    static final long serialVersionUID = 0xe0dbc517L;
    protected EOEditingContext _editingContext;
    protected String _fetchSpecificationName;
    protected EOFetchSpecification _fetchSpecification;
    protected EOQualifier _auxiliaryQualifier;
    protected NSDictionary _bindings;
    protected boolean _flags_fetchEnabled;
    private EOEntity _entityCache;
    static int EODatabaseDataSourceVersion;
    protected static final NSSelector _registeredDBContextSelector;
    private static final NSSelector _modelGroupSelector;
    private static final NSSelector _entitySelector;
    private static final String SerializationFetchSpecificationNameFieldKey = "fetchSpecificationName";
    private static final String SerializationFetchSpecificationFieldKey = "fetchSpecification";
    private static final String SerializationQualifierFieldKey = "qualifier";
    private static final String SerializationEditingContextFieldKey = "editingContext";
    private static final ObjectStreamField serialPersistentFields[];

}

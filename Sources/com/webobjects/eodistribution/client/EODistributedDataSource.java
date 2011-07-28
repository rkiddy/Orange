
package com.webobjects.eodistribution.client;

import com.webobjects.eocontrol.*;
import com.webobjects.foundation.NSArray;
import com.webobjects.foundation._NSUtilities;


public class EODistributedDataSource extends EODataSource {


    public EODistributedDataSource(String entityName) { return null; }

    public EODistributedDataSource(EOEditingContext editingContext, String entityName, String fetchSpecificationName) { return null; }

    public EODistributedDataSource(EOEditingContext editingContext, String entityName) { return null; }

    public EOClassDescription classDescriptionForObjects() { return null; }

    public void deleteObject(Object eo) {}

    public EOEditingContext editingContext() { return null; }

    public NSArray fetchObjects() { return null; }

    public EOFetchSpecification fetchSpecification() { return null; }

    EOFetchSpecification fetchSpecificationForFetch() { return null; }

    public boolean fetchEnabled() { return true; }

    protected void _init(EOEditingContext editingContext, String entityName) {}

    public void insertObject(Object obj) {}

    public void setEditingContext(EOEditingContext editingContext) {}

    public void setFetchEnabled(boolean fetchEnabled) {}

    public void setFetchSpecification(EOFetchSpecification fetchSpecification) {}

    public void setFetchSpecificationName(String name) {}

    public void setAuxiliaryQualifier(EOQualifier qualifier) {}

    public void qualifyWithRelationshipKey(String key, Object sourceObject) {}

    public EODataSource dataSourceQualifiedByKey(String key) { return null; }

    static  {}

    public static final Class _CLASS;
    private EOEditingContext _editingContext;
    private EOFetchSpecification _fetchSpecification;
    private EOQualifier _auxiliaryQualifier;
    private String _entityName;
    private String _fetchSpecificationName;
    private boolean _isFetchEnabled;

}

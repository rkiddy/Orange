
package com.webobjects.webservices.generation;

import com.webobjects.appserver.*;
import com.webobjects.directtoweb.D2WContext;
import com.webobjects.eoaccess.*;
import com.webobjects.eocontrol.*;
import com.webobjects.foundation.*;
import com.webobjects.webservices.support.xml.WOEnterpriseObjectSerializationStrategy;


public class WORuleSerializationStrategy extends WOEnterpriseObjectSerializationStrategy
    implements WOServiceUtilities.RuleSystemConstants {


    public WORuleSerializationStrategy() { return null; }

    public WORuleSerializationStrategy(D2WContext context) { return null; }

    public void setD2wContext(D2WContext context) {}

    public D2WContext d2wContext() { return null; }

    public NSArray keyPathsForSerialization(EOEnterpriseObject eo) { return null; }

    public String translatedKeyPath(Object eo, String keyPath) { return null; }

    public Object proxyForKeyPath(EOEnterpriseObject eo, String keyPath) { return null; }

    private Object _gidsForObjects(NSArray objects) { return null; }

    private Object _objectForKeyPath(EOEnterpriseObject eo, String keyPath) { return null; }

    public Class classForKeyPath(EOEnterpriseObject eo, String keyPath) { return null; }

    public EOEditingContext editingContextForDeserialization(String entityName, EOGlobalID gid) { return null; }

    public void setPropertyForKeyPath(Object eo, String keyPath, Object value) {}

    public boolean serializeAsCompleteEOEnterpriseObject() { return true; }

    private EOEntity _mainEntity() { return null; }

    protected D2WContext _context;
    protected NSArray _eokeyPathsForSerialization;

}

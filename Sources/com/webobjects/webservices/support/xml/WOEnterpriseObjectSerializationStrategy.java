
package com.webobjects.webservices.support.xml;

import com.webobjects.eoaccess.EOEntity;
import com.webobjects.eoaccess.EOUtilities;
import com.webobjects.eocontrol.*;
import com.webobjects.foundation.*;
import java.sql.Timestamp;
import java.util.*;
import org.apache.axis.*;
import org.apache.axis.description.OperationDesc;
import org.apache.axis.message.RPCElement;
import org.apache.axis.message.SOAPEnvelope;


public class WOEnterpriseObjectSerializationStrategy
    implements WOSoapConstants {


    public WOEnterpriseObjectSerializationStrategy() { return null; }

    public static synchronized void setStrategyForService(WOEnterpriseObjectSerializationStrategy rules, String serviceName, String operationName) { return null; }

    public static WOEnterpriseObjectSerializationStrategy strategyForMessageContext(MessageContext msgContext) { return null; }

    private static synchronized WOEnterpriseObjectSerializationStrategy _lookupRulesForService(String serviceName, String operationName) { return null; }

    private String _finalKeyInPath(String keyPath) { return null; }

    public NSArray keyPathsForSerialization(EOEnterpriseObject eo) { return null; }

    public String elementNameForKeyPath(EOEnterpriseObject eo, String keyPath) { return null; }

    public Object proxyForKeyPath(EOEnterpriseObject eo, String keyPath) { return null; }

    public Class classForKeyPath(EOEnterpriseObject eo, String keyPath) { return null; }

    public Object elementAttributesForKeyPath(EOEnterpriseObject eo, String keyPath) { return null; }

    public EOEditingContext editingContextForDeserialization(String entityName, EOGlobalID gid) { return null; }

    public void setPropertyForKeyPath(Object eo, String keyPath, Object value) {}

    public String translatedKeyPath(Object eo, String keyPath) { return null; }

    public Object instantiateSubject(String entityName, EOGlobalID gid, EOEditingContext ec) { return null; }

    public EOEnterpriseObject promoteGlobalIDToObject(String entityName, EOGlobalID gid, EOEditingContext ec, boolean shouldAttemptFetch) { return null; }

    public boolean serializeAsCompleteEOEnterpriseObject() { return true; }

    static  {}

    public static final String ContextPropertyName = "com.webobjects.webservices.soap.eoserialization.strategy";
    public static final String AnyServiceNameIdentifier = "*";
    private static HashMap _serviceRulesMapping;

}

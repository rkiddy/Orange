
package com.webobjects.directtoweb;

import com.apple.client.directtoweb.common.*;
import com.webobjects._eoproject.*;
import com.webobjects.eoaccess.*;
import com.webobjects.eocontrol.*;
import com.webobjects.foundation.*;
import java.util.Enumeration;
import java.util.Vector;


public class ServerSideSettings extends Settings {


    public ServerSideSettings() { return null; }

    public EOEntity dummyEntity() { return null; }

    ServerSideSettings(D2WContext context) { return null; }

    static Property buildLightPropertyForKeyDescriptorInContext(_WBKeyDescriptor keyDescriptor, D2WContext context, String keyPath, boolean visibility) { return null; }

    private Property buildPropertyForKeyInContext(String propertyKey, D2WContext context, boolean visible) { return null; }

    private void setVisibleEntities(NSArray visibleEntitiesNames) {}

    public NSArray visibleEntityNamesAsNSArray() { return null; }

    private void setReadOnlyEntities(NSArray readOnlyEntityNames) {}

    public NSArray readOnlyEntityNamesAsNSArray() { return null; }

    NSArray displayPropertyKeys() { return null; }

    EOQualifier lhsWithFrameSetting() { return null; }

    EOQualifier dynamicPageLhs() { return null; }

    EOQualifier lhs() { return null; }

    EOQualifier lhs(Property p) { return null; }

    EOQualifier attributeClassNameQualifier(String dataType) { return null; }

    EOQualifier taskQualifier() { return null; }

    EOQualifier lookQualifier() { return null; }

    EOQualifier entityQualifier() { return null; }

    EOQualifier taskLooklhs() { return null; }

    Assignment visibleEntitiesRhs() { return null; }

    Assignment readOnlyEntitiesRhs() { return null; }

    Assignment displayPropertyKeysRhs() { return null; }

    Assignment componentUsedRhs(ComponentConfiguration p) { return null; }

    Assignment pageUsedRhs(ComponentConfiguration p) { return null; }

    Assignment pageAvailableRhs(ComponentConfiguration p) { return null; }

    Assignment keyWhenRelationshipRhs(ComponentConfiguration p) { return null; }

    Assignment backgroundColorForTableRhs() { return null; }

    Assignment displayNameRhs(Property p) { return null; }

    Assignment rhsWithKeyAndComponentConfiguration(String key, ComponentConfiguration c) { return null; }

    Assignment actionsRhs() { return null; }

    Assignment startupTaskRhs() { return null; }

    Assignment taskRhs() { return null; }

    Assignment entityRhs() { return null; }

    Assignment startupEntityNameRhs() { return null; }

    static  {}

    public static final NSSelector equalSelector;
    public static final EOQualifier dummyTrueQualifier;
    public static final EOQualifier frameQualifier;
    public static final String entityNameKey = "entity.name";
    public static final String propertyNameKey = "propertyKey";
    public static final String attributeClassNameKey = "attribute.className";
    private EOEntity _entityForQuery;
    private EOAttribute _attributeForQuery;
    private static final String attributeForQueryName = "dummy";

}

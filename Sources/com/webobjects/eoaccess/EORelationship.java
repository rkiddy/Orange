
package com.webobjects.eoaccess;

import com.webobjects.eocontrol.*;
import com.webobjects.foundation.*;
import java.util.Enumeration;


public class EORelationship extends EOProperty
    implements EOPropertyListEncoding, EOSQLExpression.SQLValue {


    public void _joinsChanged() {}

    public String name() { return null; }

    public EOEntity entity() { return null; }

    public EOEntity destinationEntity() { return null; }

    public String definition() { return null; }

    public NSArray componentRelationships() { return null; }

    public boolean isFlattened() { return true; }

    public boolean isToMany() { return true; }

    boolean isParentRelationship() { return null; }

    public boolean isCompound() { return true; }

    public boolean _isToOneClassProperty() { return true; }

    public boolean _isToManyClassProperty() { return true; }

    public NSArray sourceAttributes() { return null; }

    public NSArray destinationAttributes() { return null; }

    public String valueForSQLExpression(EOSQLExpression context) { return null; }

    public NSDictionary userInfo() { return null; }

    public NSDictionary _internalInfo() { return null; }

    public boolean referencesProperty(Object property) { return true; }

    public String toString() { return null; }

    public String _toString(int indent) { return null; }

    public NSArray joins() { return null; }

    public int joinSemantic() { return 0; }

    boolean isReciprocalToRelationship(EORelationship otherRelationship) { return null; }

    public EORelationship inverseRelationship() { return null; }

    public EORelationship _makeFlattenedInverseRelationship() { return null; }

    public EORelationship _makeInverseRelationship() { return null; }

    private EORelationship hiddenInverseRelationship() { return null; }

    public EORelationship anyInverseRelationship() { return null; }

    public int numberOfToManyFaultsToBatchFetch() { return 0; }

    public boolean ownsDestination() { return true; }

    public int deleteRule() { return 0; }

    public boolean isMandatory() { return true; }

    public boolean propagatesPrimaryKey() { return true; }

    public EORelationship(NSDictionary plist, EOEntity owner) { return null; }

    public void encodeIntoPropertyList(NSMutableDictionary result) {}

    public void awakeWithPropertyList(NSDictionary plist) {}

    public EOQualifier qualifierWithSourceRow(NSDictionary sourceRow) { return null; }

    public NSDictionary _leftSideKeyMap() { return null; }

    public NSDictionary _rightSideKeyMap() { return null; }

    protected EORelationship _substitutionRelationshipForRow(NSDictionary row) { return null; }

    public int _deleteRuleFromString(String string) { return 0; }

    public String _stringFromDeleteRule(int deleteRule) { return null; }

    public _EOExpressionArray _definitionArray() { return null; }

    public void _flushCache() {}

    private EOJoin joinForAttribute(EOAttribute attribute) { return null; }

    public NSArray _sourceAttributeNames() { return null; }

    public com.webobjects.eocontrol._EOMutableKnownKeyDictionary.SubsetMapping _sourceRowToForeignKeyMapping() { return null; }

    public NSMutableDictionary _foreignKeyForSourceRow(NSDictionary row) { return null; }

    public String _nameForJoinSemantic(int semantic) { return null; }

    protected int _joinSemanticForName(String name) { return 0; }

    private void setAuxiliaryQualifier(EOQualifier qualifier) {}

    EOQualifier auxiliaryQualifier() { return null; }

    private EOQualifier qualifierOmittingAuxiliaryQualifierWithSourceRow(NSDictionary sourceRow) { return null; }

    boolean isPropagatesPrimaryKeyPossible() { return null; }

    public void setName(String name) {}

    public void setDefinition(String definition) {}

    public void setEntity(EOEntity entity) {}

    public void setToMany(boolean bool) {}

    public void setJoinSemantic(int semantic) {}

    public void addJoin(EOJoin join) {}

    public void removeJoin(EOJoin join) {}

    public void setUserInfo(NSDictionary aDictionary) {}

    private void setUserInfoFromPlist(NSDictionary aDictionary) {}

    protected void _setInternalInfo(NSDictionary aDictionary) {}

    private void setInternalInfoFromPlist(NSDictionary aDictionary) {}

    public void beautifyName() {}

    public void setNumberOfToManyFaultsToBatchFetch(int size) {}

    public void setDeleteRule(int deleteRule) {}

    public void setIsMandatory(boolean isMandatory) {}

    public void setOwnsDestination(boolean bool) {}

    public void setPropagatesPrimaryKey(boolean bool) {}

    NSDictionary primaryKeyForTargetRowFromSourceDBSnapshot(NSDictionary dbSnapshot) { return null; }

    EOQualifier qualifierForDBSnapshot(NSDictionary dbSnapshot) { return null; }

    public void _setSourceToDestinationKeyMap(NSDictionary mapping) {}

    protected NSDictionary _sourceToDestinationKeyMap() { return null; }

    boolean isMultiHop() { return null; }

    public String relationshipPath() { return null; }

    boolean foreignKeyInDestination() { return null; }

    boolean isToManyToOne() { return null; }

    boolean _calculateIsToManyToOne() { return null; }

    EOEntity intermediateEntity() { return null; }

    EORelationship firstRelationship() { return null; }

    EORelationship lastRelationship() { return null; }

    public NSArray _intermediateAttributes() { return null; }

    public Object validateValue(Object valueP) throws com.webobjects.foundation.NSValidation.ValidationException { return null; }

    protected Object _deferredFault() { return null; }

    public EORelationship() { return null; }

    static  {}

    protected String _name;
    protected EOEntity _entity;
    protected EOEntity _destination;
    protected EOQualifier _qualifier;
    protected _EOExpressionArray _definitionArray;
    protected NSMutableArray _joins;
    protected NSMutableDictionary _sourceNames;
    protected NSMutableDictionary _destinationNames;
    protected NSDictionary _userInfo;
    protected NSDictionary _internalInfo;
    protected _EOExpressionArray _expressionArray;
    protected NSDictionary _sourceToDestinationKeyMap;
    protected int _batchCount;
    protected int _joinSemantic;
    protected boolean _flags_isToMany;
    protected boolean _flags_useBatchFaulting;
    protected boolean _flags_isMandatory;
    protected boolean _flags_ownsDestination;
    protected boolean _flags_propagatesPrimaryKey;
    protected int _deleteRule;
    protected byte _toManyToOneCache;
    private volatile com.webobjects.eocontrol._EOMutableKnownKeyDictionary.SubsetMapping _sourceRowToForeignKeyMapping;
    private volatile EORelationship _inverseRelationship;
    private volatile EORelationship _hiddenInverseRelationship;
    protected Object _deferredFault;
    public static final int InnerJoin = 0;
    public static final String InnerJoinString = "EOInnerJoin";
    public static final int FullOuterJoin = 1;
    public static final String FullOuterJoinString = "EOFullOuterJoin";
    public static final int LeftOuterJoin = 2;
    public static final String LeftOuterJoinString = "EOLeftOuterJoin";
    public static final int RightOuterJoin = 3;
    public static final String RightOuterJoinString = "EORightOuterJoin";
    public static final String DeleteRuleNullifyString = "EODeleteRuleNullify";
    public static final String DeleteRuleCascadeString = "EODeleteRuleCascade";
    public static final String DeleteRuleDenyString = "EODeleteRuleDeny";
    public static final String DeleteRuleNoActionString = "EODeleteRuleNoAction";
    private static final String _InverseRelationshipPrefix = "_eofInv_";
    private static final NSDictionary __joinNameForValue;
    protected static final NSSelector _selSourceAttribute;
    protected static final NSSelector _selDesAttribute;

}

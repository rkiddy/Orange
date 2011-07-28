
package com.webobjects.eoaccess;

import com.webobjects.eocontrol.EOClassDescription;
import com.webobjects.eocontrol.EOQualifier;
import com.webobjects.foundation.*;


/**
 * @deprecated Class EOSQLQualifier is deprecated
 */

public class EOSQLQualifier extends EOQualifier
    implements EOQualifierSQLGeneration, EOSQLExpression.SQLValue {


    public _EOExpressionArray _contents() { return null; }

    public void _setContents(_EOExpressionArray contents) {}

    public EOSQLQualifier(EOEntity entity, String qualifierFormat, Object arguments[]) { return null; }

    public boolean isEmpty() { return true; }

    public boolean _isEmpty() { return true; }

    public String valueForSQLExpression(EOSQLExpression context) { return null; }

    public void encodeIntoPropertyList(NSMutableDictionary result) {}

    public String toString() { return null; }

    public Object clone() { return null; }

    public String sqlStringForSQLExpression(EOSQLExpression sqlExpression) { return null; }

    public EOQualifier schemaBasedQualifierWithRootEntity(EOEntity entity) { return null; }

    public EOQualifier qualifierMigratedFromEntityRelationshipPath(EOEntity entity, String relationshipPath) { return null; }

    public void validateKeysWithRootClassDescription(EOClassDescription eoclassdescription) {}

    public EOQualifier qualifierWithBindings(NSDictionary bindings, boolean requiresAll) { return null; }

    public void _joinWithQualifierOperator(EOSQLQualifier qualifier, String op) {}

    public void conjoinWithQualifier(EOSQLQualifier qualifier) {}

    public void disjoinWithQualifier(EOSQLQualifier qualifier) {}

    public void negate() {}

    public boolean usesDistinct() { return true; }

    public void setUsesDistinct(boolean bool) {}

    public void addQualifierKeysToSet(NSMutableSet nsmutableset) {}

    static final long serialVersionUID = 0x96db139eL;
    protected EOEntity _entity;
    protected _EOExpressionArray _contents;
    protected boolean _flags_usesDistinct;

}

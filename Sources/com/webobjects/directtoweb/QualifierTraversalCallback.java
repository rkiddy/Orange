
package com.webobjects.directtoweb;

import com.webobjects.eocontrol.*;


class QualifierTraversalCallback {

    QualifierTraversalCallback() { return null; }

    public boolean traverseNotQualifier(EONotQualifier q) { return true; }

    public boolean traverseBooleanQualifier(BooleanQualifier q) { return true; }

    public boolean traverseNonNullQualifier(NonNullQualifier q) { return true; }

    public boolean traverseOrQualifier(EOOrQualifier q) { return true; }

    public boolean traverseAndQualifier(EOAndQualifier q) { return true; }

    public boolean traverseKeyValueQualifier(EOKeyValueQualifier q) { return true; }

    public boolean traverseKeyComparisonQualifier(EOKeyComparisonQualifier q) { return true; }
}

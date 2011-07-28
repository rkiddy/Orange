
package com.webobjects.eocontrol;



public interface EOQualifierVisitor {

    public abstract void visitUnknownQualifier(EOQualifier eoqualifier);

    public abstract void visitKeyComparisonQualifier(EOKeyComparisonQualifier eokeycomparisonqualifier);

    public abstract void visitKeyValueQualifier(EOKeyValueQualifier eokeyvaluequalifier);

    public abstract void visitNotQualifier(EONotQualifier eonotqualifier);

    public abstract void visitAndQualifier(EOAndQualifier eoandqualifier);

    public abstract void visitOrQualifier(EOOrQualifier eoorqualifier);
}

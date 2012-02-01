package com.webobjects.eocontrol;
/**
 * The EOQualifierVisitor interface is intended for internal use only.
 */
public interface EOQualifierVisitor{
    abstract void visitAndQualifier(com.webobjects.eocontrol.EOAndQualifier q);

    abstract void visitKeyComparisonQualifier(com.webobjects.eocontrol.EOKeyComparisonQualifier q);

    abstract void visitKeyValueQualifier(com.webobjects.eocontrol.EOKeyValueQualifier q);

    abstract void visitNotQualifier(com.webobjects.eocontrol.EONotQualifier q);

    abstract void visitOrQualifier(com.webobjects.eocontrol.EOOrQualifier q);

    abstract void visitUnknownQualifier(com.webobjects.eocontrol.EOQualifier q);

}

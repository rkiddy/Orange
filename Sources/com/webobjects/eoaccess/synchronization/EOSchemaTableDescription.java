
package com.webobjects.eoaccess.synchronization;

import com.webobjects.foundation.NSArray;
import java.util.*;


public class EOSchemaTableDescription extends EOSchemaPropertyDescription {


    protected EOSchemaTableDescription() { return null; }

    public boolean isEmpty() { return true; }

    public EOSchemaColumnDescription newColumnDescription() { return null; }

    public NSArray columns() { return null; }

    public EOSchemaColumnDescription getColumnByName(String value) { return null; }

    protected void addToColumns(EOSchemaColumnDescription value) {}

    protected void removeFromColumns(EOSchemaColumnDescription value) {}

    public Iterator columnIterator() { return null; }

    public EOSchemaIndexDescription newIndexDescription() { return null; }

    public NSArray indexes() { return null; }

    public EOSchemaIndexDescription getIndexByName(String value) { return null; }

    protected void addToIndexes(EOSchemaIndexDescription value) {}

    protected void removeFromIndexes(EOSchemaIndexDescription value) {}

    public Iterator indexIterator() { return null; }

    public EOSchemaForeignKeyConstraintDescription newForeignKeyConstraintDescription() { return null; }

    public NSArray foreignKeyConstraints() { return null; }

    public EOSchemaForeignKeyConstraintDescription getForeignKeyConstraintByName(String value) { return null; }

    protected void addToForeignKeyConstraints(EOSchemaForeignKeyConstraintDescription value) {}

    protected void removeFromForeignKeyConstraints(EOSchemaForeignKeyConstraintDescription value) {}

    public Iterator foreignKeyConstraintIterator() { return null; }

    protected void fieldsToString(StringBuilder aLog) {}

    static  {}

    protected List _columns;
    protected List _indexes;
    protected List _foreignKeyConstraints;
    public static final EOSchemaTableDescription EmptyDescription;

}

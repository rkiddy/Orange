
package com.webobjects.eoaccess.synchronization;

import java.util.*;


public class EOSchemaSynchronizationTableChanges extends EOSchemaSynchronizationChanges {


    public EOSchemaSynchronizationTableChanges(String name) { return null; }

    public String name() { return null; }

    public boolean isEmpty() { return true; }

    public boolean isOnlyForeignKeyRelated() { return true; }

    public String oldName() { return null; }

    public void setOldName(String value) {}

    public boolean isRename() { return true; }

    public EOSchemaSynchronizationColumnChanges newChangesForColumn(String value) { return null; }

    public Set updatedColumnNames() { return null; }

    public void setUpdatedColumnNames(Map value) {}

    public void addToUpdatedColumnNames(String value, EOSchemaSynchronizationColumnChanges change) {}

    public void removeFromUpdatedColumnNames(String value) {}

    public EOSchemaSynchronizationColumnChanges changesForColumnNamed(String value) { return null; }

    Collection allChanges() { return null; }

    public Iterator updatedColumnNamesIterator() { return null; }

    public boolean isColumnNamedUpdated(String value) { return true; }

    public boolean hasColunmUpdated() { return true; }

    public Set deletedColumnNames() { return null; }

    public void setDeletedColumnNames(Collection value) {}

    public void addToDeletedColumnNames(String value) {}

    public void removeFromDeletedColumnNames(String value) {}

    public Iterator deletedColumnNamesIterator() { return null; }

    public boolean isColumnNamedDeleted(String value) { return true; }

    public boolean hasColunmDeleted() { return true; }

    public Set insertedColumnNames() { return null; }

    public void setInsertedColumnNames(Collection value) {}

    public void addToInsertedColumnNames(String value) {}

    public void removeFromInsertedColumnNames(String value) {}

    public Iterator insertedColumnNamesIterator() { return null; }

    public boolean isColumnNamedInserted(String value) { return true; }

    public boolean hasColunmInserted() { return true; }

    public Set deletedIndexNames() { return null; }

    public void setDeletedIndexNames(Collection value) {}

    public void addToDeletedIndexNames(String value) {}

    public void removeFromDeletedIndexNames(String value) {}

    public Iterator deletedIndexNamesIterator() { return null; }

    public boolean isIndexNamedDeleted(String value) { return true; }

    public boolean hasIndexesDeleted() { return true; }

    public Set insertedIndexNames() { return null; }

    public void setInsertedIndexNames(Collection value) {}

    public void addToInsertedIndexNames(String value) {}

    public void removeFromInsertedIndexNames(String value) {}

    public Iterator insertedIndexNamesIterator() { return null; }

    public boolean isIndexNamedInserted(String value) { return true; }

    public boolean hasIndexesInserted() { return true; }

    public Set deletedForeignKeyConstrainNames() { return null; }

    public void setDeletedForeignKeyConstrainNames(Collection value) {}

    public void addToDeletedForeignKeyConstrainNames(String value) {}

    public void removeFromDeletedForeignKeyConstrainNames(String value) {}

    public Iterator deletedForeignKeyConstrainNamesIterator() { return null; }

    public boolean isForeignKeyConstrainNamedDeleted(String value) { return true; }

    public boolean hasForeignKeyConstrainsDeleted() { return true; }

    public Set insertedForeignKeyConstrainNames() { return null; }

    public void setInsertedForeignKeyConstrainNames(Collection value) {}

    public void addToInsertedForeignKeyConstrainNames(String value) {}

    public void removeFromInsertedForeignKeyConstrainNames(String value) {}

    public Iterator insertedForeignKeyConstrainNamesIterator() { return null; }

    public boolean isForeignKeyConstrainNamedInserted(String value) { return true; }

    public boolean hasForeignKeyConstrainsInserted() { return true; }

    public void fieldsToString(StringBuilder aLog) {}

    protected String _name;
    protected String _oldName;
    protected Set _insertedColumns;
    protected Set _deletedColumns;
    protected Map _updatedColumns;
    protected Set _insertedIndexes;
    protected Set _deletedIndexes;
    protected Set _insertedForeignKeyConstrains;
    protected Set _deletedForeignKeyConstrains;

}

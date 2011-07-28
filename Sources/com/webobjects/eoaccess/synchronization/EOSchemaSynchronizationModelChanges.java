
package com.webobjects.eoaccess.synchronization;

import java.util.*;


public class EOSchemaSynchronizationModelChanges extends EOSchemaSynchronizationChanges {


    public EOSchemaSynchronizationModelChanges() { return null; }

    public boolean isEmpty() { return true; }

    public EOSchemaSynchronizationTableChanges newChangesForTable(String value) { return null; }

    public Set updatedTableNames() { return null; }

    public void setUpdatedTableNames(Map value) {}

    public void addToUpdatedTableNames(String value, EOSchemaSynchronizationTableChanges change) {}

    public void removeFromUpdatedTableNames(String value) {}

    public EOSchemaSynchronizationTableChanges changesForTableNamed(String value) { return null; }

    Collection allChanges() { return null; }

    public Iterator updatedTableNamesIterator() { return null; }

    public boolean isTableNamedUpdated(String value) { return true; }

    public Set deletedTableNames() { return null; }

    public void setDeletedTableNames(Collection value) {}

    public void addToDeletedTableNames(String value) {}

    public void removeFromDeletedTableNames(String value) {}

    public Iterator deletedTableNamesIterator() { return null; }

    public boolean isTableNamedDeleted(String value) { return true; }

    public Set insertedTableNames() { return null; }

    public void setInsertedTableNames(Collection value) {}

    public void addToInsertedTableNames(String value) {}

    public void removeFromInsertedTableNames(String value) {}

    public Iterator insertedTableNamesIterator() { return null; }

    public boolean isTableNamedInserted(String value) { return true; }

    public void fieldsToString(StringBuilder aLog) {}

    protected Set _insertedTables;
    protected Set _deletedTables;
    protected Map _updatedTables;

}

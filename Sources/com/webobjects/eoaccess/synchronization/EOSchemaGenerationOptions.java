
package com.webobjects.eoaccess.synchronization;


public class EOSchemaGenerationOptions {


    public EOSchemaGenerationOptions() { return null; }

    public boolean createDatabase() { return true; }

    public void setCreateDatabase(boolean value) {}

    public boolean createIndexes() { return true; }

    public void setCreateIndexes(boolean value) {}

    public boolean createPrimaryKeySupport() { return true; }

    public void setCreatePrimaryKeySupport(boolean value) {}

    public boolean createTables() { return true; }

    public void setCreateTables(boolean value) {}

    public boolean dropDatabase() { return true; }

    public void setDropDatabase(boolean value) {}

    public boolean dropIndexes() { return true; }

    public void setDropIndexes(boolean value) {}

    public boolean dropPrimaryKeySupport() { return true; }

    public void setDropPrimaryKeySupport(boolean value) {}

    public boolean dropTables() { return true; }

    public void setDropTables(boolean value) {}

    public boolean foreignKeyConstraints() { return true; }

    public void setForeignKeyConstraints(boolean value) {}

    public boolean primaryKeyConstraints() { return true; }

    public void setPrimaryKeyConstraints(boolean value) {}

    public boolean manageForeignKeyConstraints() { return true; }

    public void setManageForeignKeyConstraints(boolean value) {}

    public boolean managePrimaryKeyConstraints() { return true; }

    public void setManagePrimaryKeyConstraints(boolean value) {}

    public boolean managePrimaryKeySupport() { return true; }

    public void setManagePrimaryKeySupport(boolean value) {}

    public EOSchemaGenerationOptions clone() { return null; }

    public String toString() { return null; }

    public void fieldsToString(StringBuilder aLog) {}

    public volatile Object clone() throws CloneNotSupportedException { return null; }

    protected Boolean _createDatabase;
    protected Boolean _dropDatabase;
    protected Boolean _createTables;
    protected Boolean _dropTables;
    protected Boolean _createPrimaryKeySupport;
    protected Boolean _dropPrimaryKeySupport;
    protected Boolean _createIndexes;
    protected Boolean _dropIndexes;
    protected Boolean _primaryKeyConstraints;
    protected Boolean _foreignKeyConstraints;
    protected Boolean _managePrimaryKeySupport;
    protected Boolean _managePrimaryKeyConstraints;
    protected Boolean _manageForeignKeyConstraints;

}

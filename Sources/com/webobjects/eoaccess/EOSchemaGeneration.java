
package com.webobjects.eoaccess;

import com.webobjects.foundation.NSArray;
import com.webobjects.foundation.NSDictionary;

/**
 * @deprecated Interface EOSchemaGeneration is deprecated
 */

public interface EOSchemaGeneration
    extends com.webobjects.eoaccess.synchronization.EOSchemaGeneration {


    public abstract String schemaCreationScriptForEntities(NSArray nsarray, NSDictionary nsdictionary);

    public abstract NSArray schemaCreationStatementsForEntities(NSArray nsarray, NSDictionary nsdictionary);

    public static final String CreateTablesKey = "createTables";
    public static final String DropTablesKey = "dropTables";
    public static final String CreatePrimaryKeySupportKey = "createPrimaryKeySupport";
    public static final String DropPrimaryKeySupportKey = "dropPrimaryKeySupport";
    public static final String PrimaryKeyConstraintsKey = "primaryKeyConstraints";
    public static final String ForeignKeyConstraintsKey = "foreignKeyConstraints";
    public static final String CreateDatabaseKey = "createDatabase";
    public static final String DropDatabaseKey = "dropDatabase";
    public static final String CreateIndexesKey = "createIndexes";
    public static final String DropIndexesKey = "dropIndexes";

}

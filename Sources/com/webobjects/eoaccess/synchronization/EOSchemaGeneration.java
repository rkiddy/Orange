
package com.webobjects.eoaccess.synchronization;

import com.webobjects.eoaccess.*;
import com.webobjects.foundation.NSArray;
import com.webobjects.foundation.NSDictionary;


public interface EOSchemaGeneration {
    public static interface Delegate {

        public abstract NSArray indexDefinitionForEntity(EOEntity eoentity);
    }


    public abstract void setSchemaGenerationDelegate(Delegate delegate1);

    public abstract Delegate schemaGenerationDelegate();

    public abstract EOSchemaGenerationOptions newOptions();

    public abstract NSArray foreignKeyConstraintStatementsForRelationship(EORelationship eorelationship);

    public abstract NSArray createTableStatementsForEntityGroup(NSArray nsarray);

    public abstract NSArray dropTableStatementsForEntityGroup(NSArray nsarray);

    public abstract NSArray primaryKeyConstraintStatementsForEntityGroup(NSArray nsarray);

    public abstract NSArray primaryKeySupportStatementsForEntityGroup(NSArray nsarray);

    public abstract NSArray dropPrimaryKeySupportStatementsForEntityGroup(NSArray nsarray);

    public abstract NSArray createTableStatementsForEntityGroups(NSArray nsarray);

    public abstract NSArray dropTableStatementsForEntityGroups(NSArray nsarray);

    public abstract NSArray primaryKeyConstraintStatementsForEntityGroups(NSArray nsarray);

    public abstract NSArray primaryKeySupportStatementsForEntityGroups(NSArray nsarray);

    public abstract NSArray dropPrimaryKeySupportStatementsForEntityGroups(NSArray nsarray);

    public abstract String schemaCreationScriptForEntities(NSArray nsarray, EOSchemaGenerationOptions eoschemagenerationoptions);

    public abstract void appendExpressionToScript(EOSQLExpression eosqlexpression, StringBuffer stringbuffer);

    public abstract NSArray schemaCreationStatementsForEntities(NSArray nsarray, EOSchemaGenerationOptions eoschemagenerationoptions);

    public abstract NSArray createDatabaseStatementsForConnectionDictionary(NSDictionary nsdictionary, NSDictionary nsdictionary1);

    public abstract NSArray dropDatabaseStatementsForConnectionDictionary(NSDictionary nsdictionary, NSDictionary nsdictionary1);

    public abstract NSArray createIndexStatementsForEntityGroups(NSArray nsarray);

    public abstract NSArray createIndexStatementsForEntityGroup(NSArray nsarray);

    public abstract NSArray dropIndexStatementsForEntityGroups(NSArray nsarray);

    public abstract NSArray dropIndexStatementsForEntityGroup(NSArray nsarray);
}

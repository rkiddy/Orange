
package com.webobjects.eoaccess;

import com.webobjects.eocontrol.*;
import com.webobjects.foundation.*;


public class EOUtilities {
    public static class MoreThanOneException extends RuntimeException {


        public MoreThanOneException(String message) { return null; }

        private static final long serialVersionUID = 0xbbb42bb6L;

    }


    private EOUtilities() { return null; }

    public static NSArray objectsForEntityNamed(EOEditingContext ec, String name) { return null; }

    public static NSArray objectsOfClass(EOEditingContext ec, Class aClass) { return null; }

    public static NSArray objectsWithFetchSpecificationAndBindings(EOEditingContext ec, String entityName, String fetchSpecName, NSDictionary bindings) { return null; }

    public static NSArray objectsWithQualifierFormat(EOEditingContext ec, String entityName, String format, NSArray args) { return null; }

    public static NSArray objectsMatchingKeyAndValue(EOEditingContext ec, String entityName, String key, Object value) { return null; }

    public static NSArray objectsMatchingValues(EOEditingContext ec, String name, NSDictionary values) { return null; }

    public static EOEnterpriseObject objectWithFetchSpecificationAndBindings(EOEditingContext ec, String entityName, String fetchSpecName, NSDictionary bindings) { return null; }

    public static EOEnterpriseObject objectWithQualifierFormat(EOEditingContext ec, String name, String format, NSArray args) { return null; }

    public static EOEnterpriseObject objectMatchingKeyAndValue(EOEditingContext ec, String name, String key, Object value) { return null; }

    public static EOEnterpriseObject objectMatchingValues(EOEditingContext ec, String name, NSDictionary values) { return null; }

    private static NSDictionary _primaryKeyDictionary(EOEditingContext ec, String entityName, Object value) { return null; }

    public static EOEnterpriseObject faultWithPrimaryKeyValue(EOEditingContext ec, String entityName, Object value) { return null; }

    public static EOEnterpriseObject faultWithPrimaryKey(EOEditingContext ec, String entityName, NSDictionary pkDict) { return null; }

    public static EOEnterpriseObject objectWithPrimaryKeyValue(EOEditingContext ec, String entityName, Object value) { return null; }

    public static EOEnterpriseObject objectWithPrimaryKey(EOEditingContext ec, String entityName, NSDictionary pkDict) { return null; }

    public static NSArray rawRowsWithQualifierFormat(EOEditingContext ec, String name, String format, NSArray args) { return null; }

    public static NSArray rawRowsMatchingKeyAndValue(EOEditingContext ec, String name, String key, Object value) { return null; }

    public static NSArray rawRowsMatchingValues(EOEditingContext ec, String name, NSDictionary values) { return null; }

    /**
     * @deprecated Method rawRowsForSQL is deprecated
     */

    public static NSArray rawRowsForSQL(EOEditingContext ec, String modelName, String sqlString) { return null; }

    public static NSArray rawRowsForSQL(EOEditingContext ec, String modelName, String sqlString, NSArray keys) { return null; }

    private static NSArray _rawRowsForSQL(EODatabaseContext databaseContext, EOEditingContext ec, String sqlString, NSArray keys) { return null; }

    public static NSArray rawRowsForStoredProcedureNamed(EOEditingContext ec, String name, NSDictionary args) { return null; }

    private static NSArray _rawRowsForStoredProcedureNamed(EODatabaseContext databaseContext, EOEditingContext ec, EOStoredProcedure storedProcedure, NSDictionary args) { return null; }

    public static NSDictionary executeStoredProcedureNamed(EOEditingContext ec, String name, NSDictionary args) { return null; }

    private static NSDictionary _executeStoredProcedureNamed(EODatabaseContext databaseContext, EOEditingContext ec, EOStoredProcedure storedProcedure, NSDictionary args) { return null; }

    public static EOEnterpriseObject objectFromRawRow(EOEditingContext ec, String name, NSDictionary row) { return null; }

    public static EODatabaseContext databaseContextForModelNamed(EOEditingContext ec, String name) { return null; }

    public static void connectWithModelNamed(EOEditingContext ec, String name, NSDictionary overrides) { return null; }

    public static EOEnterpriseObject createAndInsertInstance(EOEditingContext ec, String entityName) { return null; }

    public static NSDictionary primaryKeyForObject(EOEditingContext ec, EOEnterpriseObject object) { return null; }

    public static EOQualifier qualifierForEnterpriseObject(EOEditingContext ec, EOEnterpriseObject object) { return null; }

    public static NSDictionary destinationKeyForSourceObject(EOEditingContext ec, EOEnterpriseObject object, String name) { return null; }

    public static EOEnterpriseObject localInstanceOfObject(EOEditingContext ec, EOEnterpriseObject object) { return null; }

    public static NSArray localInstancesOfObjects(EOEditingContext ec, NSArray objects) { return null; }

    public static EOModelGroup modelGroup(EOEditingContext ec) { return null; }

    public static EOEntity entityNamed(EOEditingContext ec, String name) { return null; }

    public static EOEntity entityForClass(EOEditingContext ec, Class theClass) { return null; }

    public static EOEntity entityForObject(EOEditingContext ec, EOEnterpriseObject obj) { return null; }

    static  {}
}

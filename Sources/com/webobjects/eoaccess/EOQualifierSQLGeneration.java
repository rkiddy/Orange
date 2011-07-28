
package com.webobjects.eoaccess;

import com.webobjects.eocontrol.*;
import com.webobjects.foundation.*;


public interface EOQualifierSQLGeneration {
    public static class _NotQualifierSupport extends Support {

        public _NotQualifierSupport() { return null; }

        public EOQualifier schemaBasedQualifierWithRootEntity(EOQualifier qualifier, EOEntity entity) { return null; }

        public String sqlStringForSQLExpression(EOQualifier qualifier, EOSQLExpression sqlExpression) { return null; }

        public EOQualifier qualifierMigratedFromEntityRelationshipPath(EOQualifier qualifier, EOEntity entity, String relationshipPath) { return null; }
    }

    public static class _OrQualifierSupport extends Support {

        public _OrQualifierSupport() { return null; }

        public EOQualifier schemaBasedQualifierWithRootEntity(EOQualifier qualifier, EOEntity entity) { return null; }

        public String sqlStringForSQLExpression(EOQualifier qualifier, EOSQLExpression sqlExpression) { return null; }

        public EOQualifier qualifierMigratedFromEntityRelationshipPath(EOQualifier qualifier, EOEntity entity, String relationshipPath) { return null; }
    }

    public static class _AndQualifierSupport extends Support {

        public _AndQualifierSupport() { return null; }

        public EOQualifier schemaBasedQualifierWithRootEntity(EOQualifier qualifier, EOEntity entity) { return null; }

        public String sqlStringForSQLExpression(EOQualifier qualifier, EOSQLExpression sqlExpression) { return null; }

        public EOQualifier qualifierMigratedFromEntityRelationshipPath(EOQualifier qualifier, EOEntity entity, String relationshipPath) { return null; }
    }

    public static class _KeyComparisonQualifierSupport extends Support {

        public _KeyComparisonQualifierSupport() { return null; }

        public EOQualifier schemaBasedQualifierWithRootEntity(EOQualifier qualifier, EOEntity entity) { return null; }

        public String sqlStringForSQLExpression(EOQualifier qualifier, EOSQLExpression sqlExpression) { return null; }

        public EOQualifier qualifierMigratedFromEntityRelationshipPath(EOQualifier qualifier, EOEntity entity, String relationshipPath) { return null; }
    }

    public static class _KeyValueQualifierSupport extends Support {

        public _KeyValueQualifierSupport() { return null; }

        public EOQualifier schemaBasedQualifierWithRootEntity(EOQualifier qualifier, EOEntity entity) { return null; }

        public String sqlStringForSQLExpression(EOQualifier qualifier, EOSQLExpression sqlExpression) { return null; }

        public EOQualifier qualifierMigratedFromEntityRelationshipPath(EOQualifier qualifier, EOEntity entity, String relationshipPath) { return null; }
    }

    public static abstract class Support {


        public Support() { return null; }

        public static Support supportForClass(Class aClass) { return null; }

        public static void setSupportForClass(Support support, Class aClass) { return null; }

        public abstract String sqlStringForSQLExpression(EOQualifier eoqualifier, EOSQLExpression eosqlexpression);

        public abstract EOQualifier schemaBasedQualifierWithRootEntity(EOQualifier eoqualifier, EOEntity eoentity);

        public abstract EOQualifier qualifierMigratedFromEntityRelationshipPath(EOQualifier eoqualifier, EOEntity eoentity, String s);

        public static String _sqlStringForSQLExpression(EOQualifier qualifier, EOSQLExpression sqlExpression) { return null; }

        public static EOQualifier _schemaBasedQualifierWithRootEntity(EOQualifier qualifier, EOEntity entity) { return null; }

        public static EOQualifier _qualifierMigratedFromEntityRelationshipPath(EOQualifier qualifier, EOEntity entity, String relationshipPath) { return null; }

        public static String _flattenRelationshipPath(String relationshipPath, EOEntity entity) { return null; }

        public static String _optimizeQualifierKeyPath(EOEntity entity, String relationshipPath, String key) { return null; }

        public static EOQualifier _qualifierMigratedToSubEntityFromParentEntity(EOQualifier qualifier, EOEntity subEntity, EOEntity parentEntity) { return null; }

        public static String _translateKeyAcrossRelationshipPath(String sourceKey, String relPath, EOEntity entity) { return null; }

        static  {}

        private static NSMutableDictionary _supportByClass;
        private static final NSSelector _relationshipPathSelector;
        private static final NSSelector _nameSelector;

    }


    public abstract String sqlStringForSQLExpression(EOSQLExpression eosqlexpression);

    public abstract EOQualifier schemaBasedQualifierWithRootEntity(EOEntity eoentity);

    public abstract EOQualifier qualifierMigratedFromEntityRelationshipPath(EOEntity eoentity, String s);
}

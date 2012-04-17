package com.webobjects.eoaccess;
/**
 * All qualifiers that can be used to generate SQL queries implement this interface.
 * See Also:EOFetchSpecification.setHints(NSDictionary hints), EOAdaptorChannel.evaluateExpression(EOSQLExpression expression), EOQualifier, EOSQLQualifier
 */
public interface EOQualifierSQLGeneration{
    /**
     * Creates a new EOQualifier by moving the qualifier from the source entity to the destination of the relationship path. All of the keys are 
     * migrated across the specified relationshipPath.
     */
    abstract com.webobjects.eocontrol.EOQualifier qualifierMigratedFromEntityRelationshipPath(com.webobjects.eoaccess.EOEntity entity, java.lang.String relationshipPath);

    /**
     * Returns an equivalent EOQualifier with object references replaced by foreign key references.
     */
    abstract com.webobjects.eocontrol.EOQualifier schemaBasedQualifierWithRootEntity(com.webobjects.eoaccess.EOEntity entity);

    /**
     * Returns the SQL text that is represented by the EOSQLExpression object.
     */
    abstract java.lang.String sqlStringForSQLExpression(com.webobjects.eoaccess.EOSQLExpression sqlExpression);

    /**
     * The abstract EOQualifierSQLGeneration.Support class provides basic functionality to subclasses that implement the EOQualifierSQLGeneration interface for specific qualifier types.
     * See Also:EOQualifierSQLGeneration, EOSQLQualifier
     */
    public static abstract class Support{
        public Support(){
             //TODO codavaj!!
        }

    public static class _KeyValueQualifierSupport { }

        /**
         * Creates a new version of qualifier, translates all the keys to work with the entity specified in relationshipPath. The receiver's keys are all specified in terms of entity. For example, assume that an Employee entity has a relationship named "department" to a Department entity. You could migrate a qualifier described in terms of the Employee entity (department.name = "Finance", for example) to a qualifier described in terms of the Department entity (name = "Finance"). To do so, send a qualifierMigratedFromEntityRelationshipPath message with the Employee entity as the entity and "department" as the relationship path.
         */
        public abstract com.webobjects.eocontrol.EOQualifier qualifierMigratedFromEntityRelationshipPath(com.webobjects.eocontrol.EOQualifier qualifier, com.webobjects.eoaccess.EOEntity entity, java.lang.String relationshipPath);

        /**
         * Returns an EOQualifier that is translated so that it is based on the foreign keys of the entity.
         */
        public abstract com.webobjects.eocontrol.EOQualifier schemaBasedQualifierWithRootEntity(com.webobjects.eocontrol.EOQualifier qualifier, com.webobjects.eoaccess.EOEntity entity);

        /**
         * Sets the Support class to be used internally for the specified qualifier class.
         */
        public static void setSupportForClass(com.webobjects.eoaccess.EOQualifierSQLGeneration.Support support, java.lang.Class aClass){
            return; //TODO codavaj!!
        }

        /**
         * Returns the SQL String for the qualifier within the context of sqlExpression.
         */
        public abstract java.lang.String sqlStringForSQLExpression(com.webobjects.eocontrol.EOQualifier qualifier, com.webobjects.eoaccess.EOSQLExpression sqlExpression);

        /**
         * Returns the Support class for the specified qualifier class.
         */
        public static com.webobjects.eoaccess.EOQualifierSQLGeneration.Support supportForClass(java.lang.Class aClass){
            return null; //TODO codavaj!!
        }

    }
}

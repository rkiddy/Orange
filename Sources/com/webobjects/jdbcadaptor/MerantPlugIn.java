package com.webobjects.jdbcadaptor;
public class MerantPlugIn extends com.webobjects.jdbcadaptor.MicrosoftPlugIn{
    public MerantPlugIn(com.webobjects.jdbcadaptor.JDBCAdaptor adaptor){
         //TODO codavaj!!
    }

    /**
     * Description copied from class:
     * Creates a new EOSynchronizationFactory using the plugin's response to adaptor(). The default EOSynchronizationFactory supports only basic SQL table generation. Subclasses need to override this method to support schema synchronization.
     */
    public com.webobjects.eoaccess.synchronization.EOSchemaSynchronizationFactory createSchemaSynchronizationFactory(){
        return null; //TODO codavaj!!
    }

    /**
     * Description copied from class:
     * Returns a string identifying the database. Subclasses should override.
     */
    public java.lang.String databaseProductName(){
        return null; //TODO codavaj!!
    }

    /**
     * Description copied from class:
     * Returns a fully qualified name of the JDBC driver class that this plugin prefers to use. The adaptor will attempt to load this class when making a connection. Subclasses should override.
     */
    public java.lang.String defaultDriverName(){
        return null; //TODO codavaj!!
    }

    /**
     * Description copied from class:
     * Returns the Java Class to use as the expression class. The default is JDBCExpression. Subclasses will typically override to use their own subclass of JDBCExpression.
     */
    public java.lang.Class defaultExpressionClass(){
        return null; //TODO codavaj!!
    }

    /**
     * Description copied from class:
     * Returns the plugin's name. Subclasses of JDBCPlugIn need to override this method.
     */
    public java.lang.String name(){
        return null; //TODO codavaj!!
    }

    public static class MerantExpression extends com.webobjects.jdbcadaptor.MicrosoftPlugIn.MicrosoftExpression{
        public MerantExpression(com.webobjects.eoaccess.EOEntity entity){
             //TODO codavaj!!
        }

    }
    public static class MerantSynchronizationFactory extends com.webobjects.jdbcadaptor.MicrosoftPlugIn.MicrosoftSynchronizationFactory{
        public MerantSynchronizationFactory(com.webobjects.eoaccess.EOAdaptor adaptor){
             //TODO codavaj!!
        }

    }
}

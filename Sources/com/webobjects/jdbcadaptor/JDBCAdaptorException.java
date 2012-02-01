package com.webobjects.jdbcadaptor;
/**
 * The JDBCAdaptor generally throws a JDBCAdaptorException when something goes wrong.
 * See Also:Serialized Form
 */
public class JDBCAdaptorException extends com.webobjects.eoaccess.EOGeneralAdaptorException{
    /**
     * Creates a JDBCAdaptorException, using the message from sqlException.
     * Parameters:sqlException - a SQLException that prompted this JDBCAdaptorException (null is not allowed for this variant of the constructor).
     */
    public JDBCAdaptorException(java.sql.SQLException sqlException){
         //TODO codavaj!!
    }

    /**
     * Creates a JDBCAdaptorException.
     * Parameters:message - a String explaining the reason for the exceptionsqlException - a SQLException that prompted this JDBCAdaptorException (may be null).
     */
    public JDBCAdaptorException(java.lang.String message, java.sql.SQLException sqlException){
         //TODO codavaj!!
    }

    /**
     * Returns the SQLException that prompted this JDBCAdaptorException.
     */
    public java.sql.SQLException sqlException(){
        return null; //TODO codavaj!!
    }

    public java.lang.String toString(){
        return null; //TODO codavaj!!
    }

}

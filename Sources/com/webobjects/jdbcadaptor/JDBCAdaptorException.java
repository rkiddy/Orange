
package com.webobjects.jdbcadaptor;

import com.webobjects.eoaccess.EOGeneralAdaptorException;
import java.sql.SQLException;

public class JDBCAdaptorException extends EOGeneralAdaptorException {


    public JDBCAdaptorException(String message, SQLException sqlException) { return null; }

    public JDBCAdaptorException(SQLException sqlException) { return null; }

    public SQLException sqlException() { return null; }

    public String toString() { return null; }

    private static final long serialVersionUID = 0xc9dbfde4L;
    protected SQLException _sqlException;

}

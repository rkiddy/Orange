
package com.webobjects.jdbcadaptor;

import com.webobjects.eoaccess.EOAdaptor;
import com.webobjects.eoaccess.EOEntity;
import com.webobjects.eoaccess.synchronization.EOSchemaSynchronizationFactory;


public class MerantPlugIn extends MicrosoftPlugIn {
    public static class MerantExpression extends MicrosoftPlugIn.MicrosoftExpression {

        public MerantExpression(EOEntity entity) { return null; }
    }

    public static class MerantSynchronizationFactory extends MicrosoftPlugIn.MicrosoftSynchronizationFactory {

        public MerantSynchronizationFactory(EOAdaptor adaptor) { return null; }
    }



    public MerantPlugIn(JDBCAdaptor adaptor) { return null; }

    public String name() { return null; }

    public String defaultDriverName() { return null; }

    public String databaseProductName() { return null; }

    public Class defaultExpressionClass() { return null; }

    public EOSchemaSynchronizationFactory createSchemaSynchronizationFactory() { return null; }

    private static final String DriverClassName = "com.merant.datadirect.jdbc.sqlserver.SQLServerDriver";
    private static final String DriverProductName = "Merant";

}

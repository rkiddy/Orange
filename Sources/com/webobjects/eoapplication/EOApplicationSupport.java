
package com.webobjects.eoapplication;

import com.webobjects.eoaccess.EODatabaseDataSource;
import com.webobjects.eocontrol.*;
import com.webobjects.foundation.*;
import java.io.File;


public class EOApplicationSupport extends EOApplication.ApplicationSupport {
    public class _DataSourceFactory extends EODataSourceFactory {


        public _DataSourceFactory() { return null; }

        public EODataSource newMasterDataSourceWithFetchSpecificationName(EOEditingContext editingContext, String entityName, String fetchSpecificationName) { return null; }

        public EODataSource newMasterDataSource(EOEditingContext editingContext, String entityName, EOFetchSpecification fetchSpecification) { return null; }

        public boolean isMasterDataSource(EODataSource dataSource) { return true; }

        public boolean isDetailDataSource(EODataSource dataSource) { return true; }

        public void setAuxilaryQualifierOnDataSource(EODataSource dataSource, EOQualifier qualifier) {}

        final EOApplicationSupport this$0;

    }


    public static void main(String argv[]) { return null; }

    public EOApplicationSupport() { return null; }

    public void prepareClasses(NSDictionary arguments) {}

    public void prepareGlobalObjects(NSDictionary arguments) {}

    public void prepareApplication(EOApplication application, NSDictionary arguments) {}
}

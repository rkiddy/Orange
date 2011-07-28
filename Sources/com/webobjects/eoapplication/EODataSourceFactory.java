
package com.webobjects.eoapplication;

import com.webobjects.eocontrol.*;
import com.webobjects.foundation._NSUtilities;

public abstract class EODataSourceFactory {


    public static void _useDefaultDataSourceFactoryIfNotSpecified(EODataSourceFactory dataSourceFactory) { return null; }

    public static void setDefaultDataSourceFactory(EODataSourceFactory dataSourceFactory) { return null; }

    public static EODataSourceFactory defaultDataSourceFactory() { return null; }

    public EODataSourceFactory() { return null; }

    public abstract EODataSource newMasterDataSourceWithFetchSpecificationName(EOEditingContext eoeditingcontext, String s, String s1);

    public abstract EODataSource newMasterDataSource(EOEditingContext eoeditingcontext, String s, EOFetchSpecification eofetchspecification);

    public abstract boolean isMasterDataSource(EODataSource eodatasource);

    public abstract boolean isDetailDataSource(EODataSource eodatasource);

    public abstract void setAuxilaryQualifierOnDataSource(EODataSource eodatasource, EOQualifier eoqualifier);

    static  {}

    public static final Class _CLASS;
    private static EODataSourceFactory _dataSourceFactory;

}

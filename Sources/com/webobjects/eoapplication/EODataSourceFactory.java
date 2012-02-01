package com.webobjects.eoapplication;
public abstract class EODataSourceFactory{
    public EODataSourceFactory(){
         //TODO codavaj!!
    }

    public static com.webobjects.eoapplication.EODataSourceFactory defaultDataSourceFactory(){
        return null; //TODO codavaj!!
    }

    public abstract boolean isDetailDataSource(com.webobjects.eocontrol.EODataSource dataSource);

    public abstract boolean isMasterDataSource(com.webobjects.eocontrol.EODataSource dataSource);

    public abstract com.webobjects.eocontrol.EODataSource newMasterDataSource(com.webobjects.eocontrol.EOEditingContext editingContext, java.lang.String entityName, com.webobjects.eocontrol.EOFetchSpecification fetchSpecification);

    public abstract com.webobjects.eocontrol.EODataSource newMasterDataSourceWithFetchSpecificationName(com.webobjects.eocontrol.EOEditingContext editingContext, java.lang.String entityName, java.lang.String fetchSpecificationName);

    public abstract void setAuxilaryQualifierOnDataSource(com.webobjects.eocontrol.EODataSource dataSource, com.webobjects.eocontrol.EOQualifier qualifier);

    public static void setDefaultDataSourceFactory(com.webobjects.eoapplication.EODataSourceFactory dataSourceFactory){
        return; //TODO codavaj!!
    }

}

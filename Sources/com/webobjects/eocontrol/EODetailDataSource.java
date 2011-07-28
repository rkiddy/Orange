
package com.webobjects.eocontrol;

import com.webobjects.foundation.*;
import java.io.*;


public class EODetailDataSource extends EODataSource
    implements Serializable, EOKeyValueArchiving {


    private void writeObject(ObjectOutputStream out) throws IOException {}

    private void readObject(ObjectInputStream in) throws IOException, ClassNotFoundException {}

    public EODetailDataSource(EOClassDescription masterClassDescription, String key) { return null; }

    public EODetailDataSource(EODataSource masterDataSource, String key) { return null; }

    public static Object decodeWithKeyValueUnarchiver(EOKeyValueUnarchiver unarchiver) { return null; }

    public void encodeWithKeyValueArchiver(EOKeyValueArchiver archiver) {}

    public void qualifyWithRelationshipKey(String key, Object sourceObject) {}

    public NSArray fetchObjects() { return null; }

    public void insertObject(Object eo) {}

    public void deleteObject(Object eo) {}

    public EOEditingContext editingContext() { return null; }

    public EOClassDescription classDescriptionForObjects() { return null; }

    private EOClassDescription _classDescriptionForKeyPath(EOClassDescription target, String keyPath) { return null; }

    void setMasterDataSource(EODataSource masterDataSource) { return null; }

    public EODataSource masterDataSource() { return null; }

    public void setMasterClassDescription(EOClassDescription master) {}

    public EOClassDescription masterClassDescription() { return null; }

    public String detailKey() { return null; }

    public void setDetailKey(String detailKeyPath) {}

    public Object masterObject() { return null; }

    public EODataSource dataSourceQualifiedByKey(String key) { return null; }

    static  {}

    public static final Class _CLASS;
    private EOClassDescription _masterClassDescription;
    private transient EODataSource _masterDataSource;
    private transient EOEnterpriseObject _masterObject;
    private String _detailKey;
    static final long serialVersionUID = 0x6ab3716eL;
    private static final String EntityNameFieldKey = "entityName";
    private static final String DetailKeyFieldKey = "detailKey";
    private static final ObjectStreamField serialPersistentFields[];

}

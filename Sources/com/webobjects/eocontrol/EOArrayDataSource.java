
package com.webobjects.eocontrol;

import com.webobjects.foundation.*;
import java.io.*;


public class EOArrayDataSource extends EODataSource
    implements Serializable {


    private void writeObject(ObjectOutputStream out) throws IOException {}

    private void readObject(ObjectInputStream in) throws IOException, ClassNotFoundException {}

    public EOArrayDataSource(EOClassDescription desc, EOEditingContext ec) { return null; }

    public void setArray(NSArray array) {}

    public Object createObject() { return null; }

    public void insertObject(Object eo) {}

    public void deleteObject(Object eo) {}

    public NSArray fetchObjects() { return null; }

    void setEditingContext(EOEditingContext editingContext) { return null; }

    public EOEditingContext editingContext() { return null; }

    public void qualifyWithRelationshipKey(String s, Object obj) {}

    public EODataSource dataSourceQualifiedByKey(String key) { return null; }

    public EOClassDescription classDescriptionForObjects() { return null; }

    static  {}

    public static final Class _CLASS;
    private NSMutableArray _objects;
    private EOEditingContext _context;
    private EOClassDescription _classDescription;
    static final long serialVersionUID = 0x20ac4565L;
    private static final String ObjectsFieldKey = "objects";
    private static final String ContextFieldKey = "editingContext";
    private static final String EntityNameFieldKey = "entityName";
    private static final ObjectStreamField serialPersistentFields[];

}

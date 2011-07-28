
package com.webobjects.eocontrol;

import com.webobjects.foundation.*;
import java.io.*;


public abstract class EOKeyGlobalID extends EOGlobalID
    implements NSCoding {


    protected EOKeyGlobalID(String entityName, int hashCode) { return null; }

    protected void _prepClone(EOKeyGlobalID target) {}

    public static EOKeyGlobalID globalIDWithEntityName(String entityName, Object values[]) { return null; }

    public static EOKeyGlobalID _defaultGlobalIDWithEntityName(String entityName, Object values[]) { return null; }

    public String entityName() { return null; }

    public String _literalEntityName() { return null; }

    public boolean _isFinal() { return true; }

    public void _setGuessedEntityName(String bestEntity) {}

    public String _guessedEntityName() { return null; }

    public void _setSubEntityName(String subEntity) {}

    public String _subEntityName() { return null; }

    public int hashCode() { return 0; }

    public abstract Object[] keyValues();

    public abstract Object[] _keyValuesNoCopy();

    public abstract int keyCount();

    public NSArray keyValuesArray() { return null; }

    public static Object decodeObject(NSCoder coder) { return null; }

    public static EOKeyGlobalID _adjustForInheritance(EOKeyGlobalID gid, String newSubEntity, String newBestEntity) { return null; }

    public void encodeWithCoder(NSCoder coder) {}

    public Class classForCoder() { return null; }

    private void writeObject(ObjectOutputStream s) throws IOException {}

    private void readObject(ObjectInputStream s) throws IOException, ClassNotFoundException {}

    protected Object readResolve() throws ObjectStreamException { return null; }

    static  {}

    public static final Class _CLASS;
    static final long serialVersionUID = 0xcf6a3f0cL;
    private static final String SerializationEntityNameFieldKey = "entityName";
    private static final String SerializationSubEntityNameFieldKey = "subEntityName";
    private static final String SerializationGuessedEntityNameFieldKey = "guessedName";
    private static final Class _StringClass;
    private String _entityName;
    private String _subEntityName;
    private String _bestEntityName;
    private transient int _hash;
    private static final ObjectStreamField serialPersistentFields[];

}


package com.webobjects.eocontrol;

import com.webobjects.foundation.*;
import java.io.*;


public class EOFetchSpecification
    implements Serializable, Cloneable, NSCoding, EOKeyValueArchiving {


    public EOFetchSpecification() { return null; }

    public EOFetchSpecification(String entityName, EOQualifier qualifier, NSArray sortOrderings, boolean usesDistinct, boolean isDeep, NSDictionary hints) { return null; }

    public EOFetchSpecification(String entityName, EOQualifier qualifier, NSArray sortOrderings) { return null; }

    public EOFetchSpecification fetchSpecificationWithQualifierBindings(NSDictionary bindings) { return null; }

    public static EOFetchSpecification fetchSpecificationNamed(String name, String entityName) { return null; }

    public String entityName() { return null; }

    public void setEntityName(String entityName) {}

    public NSArray sortOrderings() { return null; }

    public void setSortOrderings(NSArray sortOrderings) {}

    public EOQualifier qualifier() { return null; }

    public void setQualifier(EOQualifier qualifier) {}

    public boolean usesDistinct() { return true; }

    public void setUsesDistinct(boolean usesDistinct) {}

    public boolean isDeep() { return true; }

    public void setIsDeep(boolean isDeep) {}

    public boolean locksObjects() { return true; }

    public void setLocksObjects(boolean locksObjects) {}

    public boolean refreshesRefetchedObjects() { return true; }

    public void setRefreshesRefetchedObjects(boolean refreshes) {}

    public int fetchLimit() { return 0; }

    public void setFetchLimit(int fetchLimit) {}

    public boolean promptsAfterFetchLimit() { return true; }

    public void setPromptsAfterFetchLimit(boolean value) {}

    public boolean requiresAllQualifierBindingVariables() { return true; }

    public void setRequiresAllQualifierBindingVariables(boolean requires) {}

    public NSArray prefetchingRelationshipKeyPaths() { return null; }

    public void setPrefetchingRelationshipKeyPaths(NSArray keyPaths) {}

    public NSArray rawRowKeyPaths() { return null; }

    public void setRawRowKeyPaths(NSArray keyPaths) {}

    public boolean fetchesRawRows() { return true; }

    public void setFetchesRawRows(boolean fetchesRawRows) {}

    public NSDictionary hints() { return null; }

    public void setHints(NSDictionary hints) {}

    public String toString() { return null; }

    public Class classForCoder() { return null; }

    public static Object decodeObject(NSCoder coder) { return null; }

    public void encodeWithCoder(NSCoder coder) {}

    public Object clone() { return null; }

    private void writeObject(ObjectOutputStream out) throws IOException {}

    private void readObject(ObjectInputStream in) throws IOException, ClassNotFoundException {}

    public void encodeWithKeyValueArchiver(EOKeyValueArchiver archiver) {}

    public void _decodeWithKeyValueUnarchiver(EOKeyValueUnarchiver unarchiver) {}

    public static Object decodeWithKeyValueUnarchiver(EOKeyValueUnarchiver unarchiver) { return null; }

    static  {}

    public static final Class _CLASS;
    private EOQualifier _qualifier;
    private NSArray _sortOrderings;
    private String _entityName;
    private NSDictionary _hints;
    private int _fetchLimit;
    private NSArray _prefetchingRelationshipKeyPaths;
    private NSArray _rawRowKeyPaths;
    private boolean _usesDistinct;
    private boolean _isDeep;
    private boolean _locksObjects;
    private boolean _refreshesRefetchedObjects;
    private boolean _promptsAfterFetchLimit;
    private boolean _requiresAllQualifierBindingVariables;
    static final long serialVersionUID = 0x7e395140L;
    private static final String QualifierFieldKey = "qualifier";
    private static final String SortOrderingsFieldKey = "sortOrderings";
    private static final String EntityNameFieldKey = "entityName";
    private static final String HintsFieldKey = "hints";
    private static final String PrefetchingRelationshipKeyPathsFieldKey = "prefetchingRelationshipKeyPaths";
    private static final String RawRowKeyPathsFieldKey = "rawRowKeyPaths";
    private static final String FetchLimitFieldKey = "fetchLimit";
    private static final String UsesDistinctFieldKey = "usesDistinct";
    private static final String IsDeepFieldKey = "isDeep";
    private static final String locksObjectsFieldKey = "locksObjects";
    private static final String RefreshesRefetchedObjectsFieldKey = "refreshesRefetchedObjects";
    private static final String PromptsAfterFetchLimitFieldKey = "promptsAfterFetchLimit";
    private static final String RequiresAllQualifierBindingVariablesFieldKey = "requiresAllQualifierBindingVariables";
    private static final ObjectStreamField serialPersistentFields[];

}

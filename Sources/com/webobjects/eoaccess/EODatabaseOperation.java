
package com.webobjects.eoaccess;

import com.webobjects.eocontrol.EOGlobalID;
import com.webobjects.foundation.*;
import java.util.Enumeration;


public class EODatabaseOperation {


    public EODatabaseOperation(EOGlobalID globalID, Object object, EOEntity entity) { return null; }

    public NSDictionary dbSnapshot() { return null; }

    public void setDBSnapshot(NSDictionary dbSnapshot) {}

    public NSMutableDictionary newRow() { return null; }

    public void setNewRow(NSMutableDictionary newRow) {}

    public EOGlobalID globalID() { return null; }

    public Object object() { return null; }

    public EOEntity entity() { return null; }

    public int databaseOperator() { return 0; }

    public void setDatabaseOperator(int databaseOperator) {}

    public NSDictionary rowDiffs() { return null; }

    public NSDictionary rowDiffsForAttributes(NSArray atts) { return null; }

    public NSDictionary primaryKeyDiffs() { return null; }

    public NSArray adaptorOperations() { return null; }

    public void addAdaptorOperation(EOAdaptorOperation adaptorOp) {}

    public void removeAdaptorOperation(EOAdaptorOperation adaptorOp) {}

    public String toString() { return null; }

    public void recordToManySnapshot(NSArray gids, String name) {}

    public NSDictionary toManySnapshots() { return null; }

    protected int _databaseOperator;
    protected NSMutableDictionary _newRow;
    protected EOGlobalID _globalID;
    protected EOEntity _entity;
    protected NSMutableArray _adaptorOps;
    protected Object _object;
    protected NSDictionary _dbSnapshot;
    protected NSMutableDictionary _toManySnapshots;
    public static final int DatabaseNothingOperator = 0;
    public static final int DatabaseInsertOperator = 1;
    public static final int DatabaseUpdateOperator = 2;
    public static final int DatabaseDeleteOperator = 3;
    public static final int AdaptorLockOperator = 0;
    public static final int AdaptorInsertOperator = 1;
    public static final int AdaptorUpdateOperator = 2;
    public static final int AdaptorDeleteOperator = 3;
    public static final int AdaptorStoredProcedureOperator = 4;

}

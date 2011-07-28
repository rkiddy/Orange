
package com.webobjects.eoaccess;

import com.webobjects.eocontrol.*;
import com.webobjects.foundation.*;


public abstract class EOAdaptorChannel {
    public static interface Delegate {

        public abstract NSArray adaptorChannelWillPerformOperations(EOAdaptorChannel eoadaptorchannel, NSArray nsarray);

        public abstract Throwable adaptorChannelDidPerformOperations(EOAdaptorChannel eoadaptorchannel, NSArray nsarray, Throwable throwable);

        public abstract boolean adaptorChannelShouldSelectAttributes(EOAdaptorChannel eoadaptorchannel, NSArray nsarray, EOFetchSpecification eofetchspecification, boolean flag, EOEntity eoentity);

        public abstract void adaptorChannelDidSelectAttributes(EOAdaptorChannel eoadaptorchannel, NSArray nsarray, EOFetchSpecification eofetchspecification, boolean flag, EOEntity eoentity);

        public abstract void adaptorChannelWillFetchRow(EOAdaptorChannel eoadaptorchannel);

        public abstract void adaptorChannelDidFetchRow(EOAdaptorChannel eoadaptorchannel, NSMutableDictionary nsmutabledictionary);

        public abstract void adaptorChannelDidChangeResultSet(EOAdaptorChannel eoadaptorchannel);

        public abstract void adaptorChannelDidFinishFetching(EOAdaptorChannel eoadaptorchannel);

        public abstract boolean adaptorChannelShouldEvaluateExpression(EOAdaptorChannel eoadaptorchannel, EOSQLExpression eosqlexpression);

        public abstract void adaptorChannelDidEvaluateExpression(EOAdaptorChannel eoadaptorchannel, EOSQLExpression eosqlexpression);

        public abstract NSDictionary adaptorChannelShouldExecuteStoredProcedure(EOAdaptorChannel eoadaptorchannel, EOStoredProcedure eostoredprocedure, NSDictionary nsdictionary);

        public abstract void adaptorChannelDidExecuteStoredProcedure(EOAdaptorChannel eoadaptorchannel, EOStoredProcedure eostoredprocedure, NSDictionary nsdictionary);

        public abstract NSDictionary adaptorChannelShouldConstructStoredProcedureReturnValues(EOAdaptorChannel eoadaptorchannel);

        public abstract NSDictionary adaptorChannelShouldReturnValuesForStoredProcedure(EOAdaptorChannel eoadaptorchannel, NSDictionary nsdictionary);
    }



    protected void _raiseOptimisticLockingExceptionWithReason(String reason) {}

    public EOAdaptorChannel(EOAdaptorContext context) { return null; }

    public abstract boolean isOpen();

    public abstract void openChannel();

    public abstract void closeChannel();

    public EOAdaptorContext adaptorContext() { return null; }

    public abstract void insertRow(NSDictionary nsdictionary, EOEntity eoentity);

    public void updateValuesInRowDescribedByQualifier(NSDictionary row, EOQualifier qualifier, EOEntity entity) {}

    public abstract int updateValuesInRowsDescribedByQualifier(NSDictionary nsdictionary, EOQualifier eoqualifier, EOEntity eoentity);

    public void deleteRowDescribedByQualifier(EOQualifier qualifier, EOEntity entity) {}

    public abstract int deleteRowsDescribedByQualifier(EOQualifier eoqualifier, EOEntity eoentity);

    public abstract void selectAttributes(NSArray nsarray, EOFetchSpecification eofetchspecification, boolean flag, EOEntity eoentity);

    public void lockRowComparingAttributes(NSArray attributes, EOEntity entity, EOQualifier qualifier, NSDictionary snapshot) {}

    public abstract void evaluateExpression(EOSQLExpression eosqlexpression);

    public abstract boolean isFetchInProgress();

    public abstract NSArray describeResults();

    public abstract NSMutableDictionary fetchRow();

    public abstract void setAttributesToFetch(NSArray nsarray);

    public abstract NSArray attributesToFetch();

    public abstract void cancelFetch();

    /**
     * @deprecated Method primaryKeyForNewRowWithEntity is deprecated
     */

    public NSDictionary primaryKeyForNewRowWithEntity(EOEntity entity) { return null; }

    public NSArray primaryKeysForNewRowsWithEntity(int count, EOEntity entity) { return null; }

    public NSArray describeStoredProcedureNames() { return null; }

    public void addStoredProceduresNamed(NSArray nsarray, EOModel eomodel) {}

    public NSArray describeTableNames() { return null; }

    public EOModel describeModelWithTableNames(NSArray tableNames) { return null; }

    public Object _mthdelegate() { return null; }

    public void setDelegate(Object delegate) {}

    protected void _setRawDictionaryInitializerForAttributes(NSArray attributes) {}

    public NSMutableDictionary dictionaryWithObjectsForAttributes(Object objects[], NSArray attributes) { return null; }

    public abstract void executeStoredProcedure(EOStoredProcedure eostoredprocedure, NSDictionary nsdictionary);

    public abstract NSDictionary returnValuesForLastStoredProcedureInvocation();

    public void performAdaptorOperation(EOAdaptorOperation adaptorOp) {}

    public void performAdaptorOperations(NSArray adaptorOperations) {}

    public static final String AdaptorOperationsKey = "EOAdaptorOperationsKey";
    public static final String FailedAdaptorOperationKey = "EOFailedAdaptorOperationKey";
    public static final String AdaptorFailureKey = "EOAdaptorFailureKey";
    public static final String AdaptorOptimisticLockingFailure = "EOAdaptorOptimisticLockingFailure";
    protected boolean _debug;
    protected EOAdaptorContext _context;
    protected _NSDelegate _delegate;
    protected Object _rawAttributesCache;
    protected com.webobjects.eocontrol._EOMutableKnownKeyDictionary.Initializer _rawDictionaryInitializer;
    protected boolean _delegateRespondsTo_willPerformOperations;
    protected boolean _delegateRespondsTo_didPerformOperations;
    protected boolean _delegateRespondsTo_shouldSelectAttributes;
    protected boolean _delegateRespondsTo_didSelectAttributes;
    protected boolean _delegateRespondsTo_willFetchRow;
    protected boolean _delegateRespondsTo_didFetchRow;
    protected boolean _delegateRespondsTo_didChangeResultSet;
    protected boolean _delegateRespondsTo_didFinishFetching;
    protected boolean _delegateRespondsTo_shouldEvaluateExpression;
    protected boolean _delegateRespondsTo_didEvaluateExpression;
    protected boolean _delegateRespondsTo_shouldExecuteStoredProcedure;
    protected boolean _delegateRespondsTo_didExecuteStoredProcedure;
    protected boolean _delegateRespondsTo_shouldConstructStoredProcedureReturnValues;
    protected boolean _delegateRespondsTo_shouldReturnValuesForStoredProcedure;

}

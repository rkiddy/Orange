
package com.webobjects.eoaccess;

import com.webobjects.eocontrol.EOEnterpriseObject;
import com.webobjects.foundation.*;


public abstract class EOAdaptorContext {
    public static interface Delegate {

        public abstract boolean adaptorContextShouldConnect(EOAdaptorContext eoadaptorcontext);

        public abstract boolean adaptorContextShouldBegin(EOAdaptorContext eoadaptorcontext);

        public abstract void adaptorContextDidBegin(EOAdaptorContext eoadaptorcontext);

        public abstract boolean adaptorContextShouldCommit(EOAdaptorContext eoadaptorcontext);

        public abstract void adaptorContextDidCommit(EOAdaptorContext eoadaptorcontext);

        public abstract boolean adaptorContextShouldRollback(EOAdaptorContext eoadaptorcontext);

        public abstract void adaptorContextDidRollback(EOAdaptorContext eoadaptorcontext);
    }



    public static void setDefaultDelegate(Object delegate) { return null; }

    public static Object defaultDelegate() { return null; }

    public EOAdaptorContext(EOAdaptor adaptor) { return null; }

    public abstract void handleDroppedConnection();

    public abstract void beginTransaction();

    public abstract void commitTransaction();

    public abstract void rollbackTransaction();

    /**
     * @deprecated Method transactionNestingLevel is deprecated
     */

    public int transactionNestingLevel() { return 0; }

    public boolean hasOpenTransaction() { return true; }

    public void transactionDidBegin() {}

    public void transactionDidCommit() {}

    public void transactionDidRollback() {}

    public boolean hasBusyChannels() { return true; }

    public boolean hasOpenChannels() { return true; }

    public NSArray channels() { return null; }

    public EOAdaptor adaptor() { return null; }

    public abstract EOAdaptorChannel createAdaptorChannel();

    public Object _mthdelegate() { return null; }

    public void setDelegate(Object delegate) {}

    public void _registerAdaptorChannel(EOAdaptorChannel channel) {}

    public void _unregisterAdaptorChannel(EOAdaptorChannel channel) {}

    /**
     * @deprecated Method canNestTransactions is deprecated
     */

    public boolean canNestTransactions() { return true; }

    public NSDictionary _newPrimaryKey(EOEnterpriseObject object, EOEntity entity) { return null; }

    static  {}

    public static final String AdaptorContextBeginTransactionNotification = "EOAdaptorContextBeginTransactionNotification";
    public static final String AdaptorContextCommitTransactionNotification = "EOAdaptorContextCommitTransactionNotification";
    public static final String AdaptorContextRollbackTransactionNotification = "EOAdaptorContextRollbackTransactionNotification";
    private static final NSSelector _defaultDelegateSelector;
    protected EOAdaptor _adaptor;
    protected NSMutableArray _channels;
    protected _NSDelegate _delegate;
    protected boolean _hasOpenTransaction;
    protected boolean _delegateRespondsTo_shouldConnect;
    protected boolean _delegateRespondsTo_shouldBegin;
    protected boolean _delegateRespondsTo_didBegin;
    protected boolean _delegateRespondsTo_shouldCommit;
    protected boolean _delegateRespondsTo_didCommit;
    protected boolean _delegateRespondsTo_shouldRollback;
    protected boolean _delegateRespondsTo_didRollback;
    private static volatile Object _defaultAdaptorContextDelegate;

}

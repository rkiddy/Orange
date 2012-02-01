package com.webobjects.eoaccess;
/**
 * EOAdaptorContext is an abstract class that provides its concrete subclasses with a structure for handling database transactions. It is associated with EOAdaptor and EOAdaptorChannel, which, together with EOAdaptorContext, form the adaptor level of Enterprise Objects Framework's access layer.
 * Concrete subclasses of EOAdaptorContext provide database-specific method implementations and represent a single transaction scope (logical user) on the database server to which its EOAdaptor object is connected. You never interact with instances of the EOAdaptorContext class directly; rather, your applications use instances of concrete subclasses that are written to work with a specific database or other persistent storage system.
 * If a database server supports multiple concurrent transaction sessions, an adaptor context's EOAdaptor can have several contexts. When you use multiple EOAdaptorContexts for a single EOAdaptor, you can have several database server transactions in progress simultaneously. You should be aware of the issues involved in concurrent access if you do this.
 * EOAdaptorContext defines a simple set of methods for explicitly controlling transactions: beginTransaction, commitTransaction, and rollbackTransaction. Each of these methods confirms the requested action with the adaptor context's delegate, then performs the action if possible.
 * There is also a set of methods for notifying an adaptor context that a transaction has been started, committed, or rolled back without using the beginTransaction, commitTransaction, or rollbackTransaction methods. For example, if you invoke a stored procedure in the server that begins a transaction, you need to notify the adaptor context that a transaction has been started. Use the following methods to keep an adaptor context synchronized with the state of the database server:
 * These methods post notifications.
 * You can assign a delegate to an adaptor context. The delegate responds to certain methods on behalf of the context. An EOAdaptorContext invokes these methods on its delegate. The transaction-controlling methods beginTransaction, commitTransaction, and rollbackTransaction notify the adaptor context's delegate before and after a transaction operation is performed.
 * Some delegate methods, such as adaptorContextShouldBegin, let the delegate determine whether the context should perform an operation. Others, such as adaptorContextDidBegin, simply inform the delegate that an operation has occurred. The delegate has an opportunity to respond by implementing the delegate methods. If the delegate wants to intervene, it implements adaptorContextShouldBegin. If it simply wants notification when a transaction has begun, it implements adaptorContextDidBegin.
 * EOAdaptorContext also posts notifications to the application's default notification center. Any object may register to receive one or more of the notifications posted by an adaptor context by registering as an observer with the default notification center (an instance of the NSNotificationCenter class).
 * EOAdaptorContext provides many default method implementations that are sufficient for concrete subclasses. The following methods establish structure and conventions that other Enterprise Objects Framework classes depend on and should be overridden with caution:
 * If you override any of the above methods, your implementations should incorporate the superclass's implementation through an invocation of super.
 * Other methods require database-specific implementations that can be provided only by a concrete adaptor context subclass. A subclass must override the following methods in terms of the persistent storage system to which it interacts:
 * See Also:EOAdaptorContext.createAdaptorChannel(), EOAdaptorContext.beginTransaction(), EOAdaptorContext.commitTransaction(), EOAdaptorContext.rollbackTransaction(), EOAdaptor.createAdaptorContext(), EOAdaptor, NSNotificationCenter
 */
public abstract class EOAdaptorContext{
    public static final java.lang.String AdaptorContextBeginTransactionNotification="EOAdaptorContextBeginTransactionNotification";

    public static final java.lang.String AdaptorContextCommitTransactionNotification="EOAdaptorContextCommitTransactionNotification";

    public static final java.lang.String AdaptorContextRollbackTransactionNotification="EOAdaptorContextRollbackTransactionNotification";

    /**
     * Returns a new EOAdaptorContext. Never invoke this constructor directly. You must use the adaptor method createAdaptorContext to create a new adaptor context.
     * Parameters:adaptor - The adaptor for the new adaptor context.See Also:EOAdaptorContext.adaptor(), EOAdaptor.createAdaptorContext()
     */
    public EOAdaptorContext(com.webobjects.eoaccess.EOAdaptor adaptor){
         //TODO codavaj!!
    }

    /**
     * Returns the receiver's EOAdaptor.
     */
    public com.webobjects.eoaccess.EOAdaptor adaptor(){
        return null; //TODO codavaj!!
    }

    /**
     * An abstract method that should be implemented by subclasses to attempt to begin a new transaction. A successful invocation of beginTransaction must be paired with an invocation of either commitTransaction or rollbackTransaction to end the transaction.
     * The Enterprise Objects Framework automatically wraps database operations in transactions, so you don't have to begin and end transactions explicitly. In fact, letting the framework manage transactions is sometimes more efficient. You typically implement beginTransaction only to execute more than one database operation in the same transaction scope.
     * This method should invoke the delegate method adaptorContextShouldBegin before beginning the transaction. If the transaction is begun successfully, the method should invoke transactionDidBegin on the receiver and invoke the delegate method adaptorContextDidBegin. Should throw a runtime exception if the attempt is unsuccessful. Some possible reasons for failure are:
     * A connection to the database hasn't been established. A transaction is already in progress. A fetch is in progress. The delegate refuses. The database server fails to begin a transaction.
     */
    public abstract void beginTransaction();

    /**
     * Deprecated.
     */
    public boolean canNestTransactions(){
        return false; //TODO codavaj!!
    }

    /**
     * Returns an array of channels created by the receiver.
     */
    public com.webobjects.foundation.NSArray channels(){
        return null; //TODO codavaj!!
    }

    /**
     * An abstract method that should be implemented by subclasses to attempt to commit the last transaction begun. Should invoke the delegate method adaptorContextShouldCommit before committing the transaction. If the transaction is committed successfully, the method should invoke transactionDidCommit and invoke the delegate method adaptorContextDidCommit. Should throw a runtime exception if the attempt is unsuccessful. Some possible reasons for failure are: A transaction is not in progress. Fetches are in progress. The delegate refuses. The database server fails to commit.
     */
    public abstract void commitTransaction();

    /**
     * An abstract method that should be implemented by subclasses to create and return a new EOAdaptorChannel, or null if a new channel cannot be created. Should set the new channel's adaptorContext to this.
     * A newly created adaptor context has no channels. Specific adaptors have different limits on the maximum number of channels a context can have, and createAdaptorChannel should fail if a creating a new channel would exceed the limits.
     */
    public abstract com.webobjects.eoaccess.EOAdaptorChannel createAdaptorChannel();

    /**
     * Returns the default delegate, which is the object assigned as delegate to all newly created EOAdaptorContext instances and their EOAdaptorChannels. This method returns null until a valid delegate has been set using setDefaultDelegate.
     */
    public static java.lang.Object defaultDelegate(){
        return null; //TODO codavaj!!
    }

    /**
     * Returns the receiver's delegate, or null if the receiver doesn't have a delegate.
     */
    public java.lang.Object delegate(){
        return null; //TODO codavaj!!
    }

    /**
     * An abstract method that should be implemented by subclasses to clean up after the receiver's adaptor has lost its connection to its database server. Invoked from EOAdaptor's handleDroppedConnection, this method should clean up the state of the receiver and its adaptor channels so they can be safely disposed of without any errors. Subclasses must implement this method if the adaptor supports automatic database reconnection.
     * Never invoke this method yourself; it is invoked automatically by the Enterprise Objects Framework.
     */
    public abstract void handleDroppedConnection();

    /**
     * Returns true if any of the receiver's channels have outstanding operations (that is, have a fetch in progress), false otherwise.
     */
    public boolean hasBusyChannels(){
        return false; //TODO codavaj!!
    }

    /**
     * Returns true if any of the receiver's channels are open, false otherwise.
     */
    public boolean hasOpenChannels(){
        return false; //TODO codavaj!!
    }

    /**
     * Returns true if a transaction is currently open (has begun but not yet committed or rolled back), false otherwise.
     */
    public boolean hasOpenTransaction(){
        return false; //TODO codavaj!!
    }

    /**
     * An abstract method that should be implemented by subclasses to attempt to roll back the last transaction begun. Should invoke the delegate method adaptorContextShouldRollback before rolling back the transaction. If the transaction is begun successfully, the method should invoke transactionDidRollback and invoke the delegate method adaptorContextDidRollback. Should throw a runtime exception if the attempt is unsuccessful. Some possible reasons for failure are: A transaction is not in progress. Fetches are in progress. The delegate refuses. The database server fails to rollback.
     */
    public abstract void rollbackTransaction();

    /**
     * Sets the default delegate, which is the object assigned as delegate to all newly created EOAdaptorContext instances and their EOAdaptorChannels, to delegate. The default delegate is null until this method has been used to set a valid delegate.
     */
    public static void setDefaultDelegate(java.lang.Object delegate){
        return; //TODO codavaj!!
    }

    /**
     * Sets the receiver's delegate and the delegate of all the receiver's channels to delegate, or removes their delegates if delegate is null.
     */
    public void setDelegate(java.lang.Object delegate){
        return; //TODO codavaj!!
    }

    /**
     * Informs the adaptor context that a transaction has begun in the database server, so the receiver can update its state to reflect this fact, and posts an AdaptorContextBeginTransactionNotification. This method is invoked from beginTransaction after a transaction has successfully been started. It is also invoked when the Enterprise Objects Framework implicitly begins a transaction.
     * You don't need to invoke this method unless you are implementing a concrete adaptor. Your concrete adaptor should invoke this method from within your adaptor context's implementation of beginTransaction and anywhere else it begins a transaction either implicitly or explicitly. For example, an adaptor channel's implementation of evaluateExpression should check to see if a transaction is in progress. If no transaction is in progress, it can start one explicitly by invoking beginTransaction. Alternatively, it can start an implicit transaction by invoking transactionDidBegin.
     * A subclass of EOAdaptorContext doesn't need to override this method. A subclass that does override it must incorporate the superclass's version through an invocation of super.
     */
    public void transactionDidBegin(){
        return; //TODO codavaj!!
    }

    /**
     * Informs the adaptor context that a transaction has committed in the database server, so the receiver can update its state to reflect this fact, and posts an AdaptorContextCommitTransactionNotification. This method is invoked from commitTransaction after a transaction has successfully committed.
     * You don't need to invoke this method unless you are implementing a concrete adaptor. Your concrete adaptor should invoke this method from within your adaptor context's implementation of commitTransaction and anywhere else it commits a transaction either implicitly or explicitly.
     * A subclass of EOAdaptorContext doesn't need to override this method. A subclass that does override it must incorporate the superclass's version through an invocation of super.
     */
    public void transactionDidCommit(){
        return; //TODO codavaj!!
    }

    /**
     * Informs the receiver that a transaction has rolled back in the database server, so the adaptor context can update its state to reflect this fact, and posts an AdaptorContextRollbackTransactionNotification. This method is invoked from rollbackTransaction after a transaction has successfully been rolled back.
     * You don't need to invoke this method unless you are implementing a concrete adaptor. Your concrete adaptor should invoke this method from within your adaptor context's implementation of rollbackTransaction and anywhere else it rolls back a transaction either implicitly or explicitly.
     * A subclass of EOAdaptorContext doesn't need to override this method. A subclass that does override it must incorporate the superclass's version through an invocation of super.
     */
    public void transactionDidRollback(){
        return; //TODO codavaj!!
    }

    /**
     * Deprecated.
     */
    public int transactionNestingLevel(){
        return 0; //TODO codavaj!!
    }

    /**
     * EOAdaptorContext invokes its delegate any time a transaction is begun, committed, or rolled back. The delegate can use these methods to preempt these operations, modify their results, or simply track activity.
     */
    public static interface Delegate{
        /**
         * Invoked from beginTransaction or transactionDidBegin to tell the delegate that a transaction has begun. The delegate may take whatever action it needs based on this information.
         */
        abstract void adaptorContextDidBegin(com.webobjects.eoaccess.EOAdaptorContext adaptorContext);

        /**
         * Invoked from commitTransaction or transactionDidCommit to tell the delegate that a transaction has been committed. The delegate may take whatever action it needs based on this information.
         */
        abstract void adaptorContextDidCommit(com.webobjects.eoaccess.EOAdaptorContext adaptorContext);

        /**
         * Invoked from rollbackTransaction or transactionDidRollback to tell the delegate that a transaction has been rolled back. The delegate may take whatever action it needs based on this information.
         */
        abstract void adaptorContextDidRollback(com.webobjects.eoaccess.EOAdaptorContext adaptorContext);

        /**
         * Invoked from beginTransaction to ask the delegate whether the adaptor context object should begin a transaction. The delegate should return true to allow the adaptor context to begin a transaction, false to prevent the transaction. If the delegate returns false, it is the delegate's responsibility to handle the transaction state. It might start its own transaction or it might return false from adaptorContextShouldCommit in order to control the transaction in a private way.
         */
        abstract boolean adaptorContextShouldBegin(com.webobjects.eoaccess.EOAdaptorContext adaptorContext);

        /**
         * Invoked from commitTransaction to ask the delegate whether or not to commit a transaction. If this method returns false, the adaptor context does not commit the transaction; the delegate must perform the database COMMIT itself.
         */
        abstract boolean adaptorContextShouldCommit(com.webobjects.eoaccess.EOAdaptorContext adaptorContext);

        /**
         * Invoked before the adaptor attempts to connect. The delegate should return false if it wants to override the connect operation, true if it wants the adaptor to attempt to connect in the usual way. Should throw a runtime exception if it fails to connect.
         */
        abstract boolean adaptorContextShouldConnect(com.webobjects.eoaccess.EOAdaptorContext adaptorContext);

        /**
         * Invoked from rollbackTransaction to ask the delegate whether or not to roll back a transaction. Should return true to allow the adaptor context object to roll back the transaction, false to prevent the rollback.
         */
        abstract boolean adaptorContextShouldRollback(com.webobjects.eoaccess.EOAdaptorContext adaptorContext);

    }
}

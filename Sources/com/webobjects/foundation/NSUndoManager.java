package com.webobjects.foundation;
/**
 * NSUndoManager is a general-purpose recorder of operations for undo and redo. You register an undo operation by specifying the object that's changing (or the owner of that object), along with a method to invoke to revert its state, and the arguments for that method. NSUndoManager groups all operations within a single cycle of the run loop, so that performing an undo reverts all changes that occurred during the loop. Also, when performing undo an NSUndoManager saves the operations reverted so that you can redo the undos.
 * NSUndoManager is implemented as a class of the Foundation framework because executables other than applications might want to revert changes to their states. For example, you might have an interactive command-line tool with undo and redo commands. However, users typically see undo and redo as application features. WebObjects applications can use NSUndoManagers to undo and redo user operations. Typically a session's editing context has an undo manager that provides undo and redo operations on enterprise objects. For more information, see the class specification for EOEditingContext (eocontrol package).
 * An undo operation is a method for reverting a change to an object, along with the arguments needed to revert the change (for example, its state before the change). Undo operations are typically collected in undo groups, which represent whole revertible actions, and are stored on a stack. Redo operations and groups are simply undo operations stored on a separate stack (described below). When an NSUndoManager performs undo or redo, it's actually undoing or redoing an entire group of operations. For example, a user could change the first name and the last name of an employee. An application might package both operations as a group, so when the user chooses Undo, both the first and last names are reverted. To undo a single operation, the operation must be packaged alone in a group.
 * NSUndoManager normally creates undo groups automatically during the run loop. The first time it's asked to record an undo operation in the run loop, it creates a new group. Then, at the end of the loop, it closes the group. You can create additional, nested undo groups within these default groups using the NSUndoManager.beginUndoGrouping() and NSUndoManager.enableUndoRegistration() methods. You can also turn off the default grouping behavior using NSUndoManager.setGroupsByEvent(boolean).
 * Undo groups are stored on a stack, with the oldest groups at the bottom and the newest at the top. The undo stack is unlimited by default, but you can restrict it to a maximum number of groups using the NSUndoManager.setLevelsOfUndo(int) method. When the stack exceeds the maximum, the oldest undo groups are dropped from the bottom.
 * Initially, both stacks are empty. Recording undo operations adds to the undo stack, but the redo stack remains empty until an undo is performed. Performing an undo causes the reverting operations in the latest group to be applied to their objects. Since these operations cause changes to the objects' states, the objects presumably register new operations with the NSUndoManager, this time in the reverse direction from the original operations. Since the NSUndoManager is in the process of performing undo, it records these operations as redo operations on the redo stack. Consecutive undos add to the redo stack. Subsequent redo operations pull the operations off the redo stack, apply them to the objects, and push them back onto the undo stack.
 * The redo stack's contents last as long as undo and redo are performed successively. However, because applying a new change to an object invalidates the previous changes, as soon as a new undo operation is registered, the redo stack is cleared. This prevents redo from returning objects to an inappropriate prior state. You can check for the ability to undo and redo with the NSUndoManager.canUndo() and NSUndoManager.canRedo() methods.
 * To add an undo operation to the undo stack, you must register it with the object that will perform the undo operation. To register the undo operation you specify a selector with a single object argument. When an object changes, the object itself (or another object acting on its behalf) records its attributes prior to the change in the argument object. (This argument is frequently an NSDictionary object, but it can be any object.) Performing the undo then involves resetting the object with these attributes.
 * To record a simple undo operation, you need only invoke NSUndoManager.registerUndoWithTarget(java.lang.Object, com.webobjects.foundation.NSSelector, java.lang.Object), giving the object to be sent the undo operation selector, the selector to invoke, and an argument to pass with that message. The target object is usually not the actual object whose state is changing; instead, it's the client object, a document or container that holds many undoable objects. The argument is an object that captures the state of the object before the change is made. If you have multiple arguments, use NSUndoManager.registerUndoWithTargetAndArguments(java.lang.Object, com.webobjects.foundation.NSSelector, java.lang.Object[]).
 * In most applications a single instance of NSUndoManager belongs to an object that contains or manages other objects. This is particularly the case with document-based applications, where a single object is responsible for all undo and redo operations for a document. An object such as this is often called the NSUndoManager's client. Each client object has its own NSUndoManager. The client claims exclusive right to alter its undoable objects so that it can record undo operations for all changes. In the specific case of documents, this scheme keeps each pair of undo and redo stacks separate so that when an undo is performed, it applies to the focal document in the application (typically the one displayed in the key window). It also relieves the individual objects in a document from having to know the identity of their NSUndoManager or from having to track changes to themselves.
 * However, an object that is changed can have its own NSUndoManager and perform its own undo and redo operations. For example, you could have a custom view that displays images dragged into it; with each successful drag operation, it registers a new undo group. If the view is then selected (that is, made first responder) and the Undo command applied, the previously displayed image would be redisplayed.
 * Performing undo and redo is usually as simple as sending NSUndoManager.undo() and NSUndoManager.redo() messages to the NSUndoManager. undo closes the last open undo group and then applies all the undo operations in that group (recording any undo operations as redo operations instead). redo likewise applies all the redo operations on the top redo group.
 * undo is intended for undoing top-level groups, and shouldn't be used for nested undo groups. If any unclosed, nested undo groups are on the stack when undo is invoked, it throws an exception. To undo nested groups, you must explicitly close the group with an NSUndoManager.enableUndoRegistration() message, then use NSUndoManager.undoNestedGroup() to undo it. Note also that if you turn off automatic grouping by event with NSUndoManager.setGroupsByEvent(boolean), you must explicitly close the current undo group with NSUndoManager.enableUndoRegistration() before invoking either undo method.
 * An NSUndoManager regularly posts checkpoint notifications to synchronize the inclusion of undo operations in undo groups. Objects sometimes delay performing changes, for various reasons. This means they may also delay registering undo operations for those changes. Because NSUndoManager collects individual operations into groups, it must be sure to synchronize its client with the creation of these groups so that operations are entered into the proper undo groups. To this end, whenever an NSUndoManager opens or closes a new undo group (except when it opens a top-level group), it posts a NSUndoManager.CheckpointNotification so observers can apply their pending undo operations to the group in effect. The NSUndoManager's client should register itself as an observer for this notification and record undo operations for all pending changes upon receiving it.
 * NSUndoManager also posts a number of other notifications at specific intervals: when a group is created, when a group is closed, and just before and just after both undo and redo operations. For more on notifications, see Notifications.
 * See Also:NSUndoManager.CheckpointNotification, NSUndoManager.setGroupsByEvent(boolean), NSUndoManager.beginUndoGrouping(), NSUndoManager.enableUndoRegistration(), NSUndoManager.setLevelsOfUndo(int), NSUndoManager.canUndo(), NSUndoManager.canRedo(), NSUndoManager.registerUndoWithTarget(java.lang.Object, com.webobjects.foundation.NSSelector, java.lang.Object), NSUndoManager.registerUndoWithTargetAndArguments(java.lang.Object, com.webobjects.foundation.NSSelector, java.lang.Object[]), NSUndoManager.redo(), NSUndoManager.undo(), NSUndoManager.undoNestedGroup()
 */
public class NSUndoManager implements com.webobjects.foundation.NSDisposable{
    /**
     * Posted whenever an NSUndoManager opens or closes an undo group (except when it opens a top-level group), and when an NSUndoManager checks the redo stack in canRedo. The notification contains: notification object the NSUndoManager userinfo null
     * See Also:NSUndoManager.canRedo(), Constant Field Values
     */
    public static final java.lang.String CheckpointNotification="NSUndoManagerCheckpointNotification";

    /**
     * Posted whenever an NSUndoManager opens an undo group, which occurs in an invocation of beginUndoGrouping. The notification contains: notification object the NSUndoManager null
     * See Also:NSUndoManager.beginUndoGrouping(), Constant Field Values
     */
    public static final java.lang.String DidOpenUndoGroupNotification="NSUndoManagerDidOpenUndoGroupNotification";

    /**
     * Posted just after an NSUndoManager performs a redo operation. The notification contains:
     * notification object the NSUndoManager null
     * See Also:NSUndoManager.redo(), Constant Field Values
     */
    public static final java.lang.String DidRedoChangeNotification="NSUndoManagerDidRedoChangeNotification";

    /**
     * Posted just after an NSUndoManager performs an undo operation. If you invoke undo or undoNestedGroup, this notification is posted. The notification contains: notification object the NSUndoManager null
     * See Also:NSUndoManager.undoNestedGroup(), NSUndoManager.undo(), Constant Field Values
     */
    public static final java.lang.String DidUndoChangeNotification="NSUndoManagerDidUndoChangeNotification";

    /**
     * Specifies the priority for closing the current undo group compared to other operations in the delayed callback queue.
     * See Also:Constant Field Values
     */
    public static final int UndoCloseGroupingRunLoopOrdering=350000;

    /**
     * Posted whenever an NSUndoManager closes an undo group, which occurs in an invocation of endUndoGrouping. The notification contains: notification object the NSUndoManager null
     * See Also:NSUndoManager.endUndoGrouping(), Constant Field Values
     */
    public static final java.lang.String WillCloseUndoGroupNotification="NSUndoManagerWillCloseUndoGroupNotification";

    /**
     * Posted just before an NSUndoManager performs a redo operation. The notification contains: notification object the NSUndoManager null
     * See Also:NSUndoManager.redo(), Constant Field Values
     */
    public static final java.lang.String WillRedoChangeNotification="NSUndoManagerWillRedoChangeNotification";

    /**
     * Posted just before an NSUndoManager performs an undo operation. If you invoke undo or undoNestedGroup, this notification is posted. The notification contains: notification object the NSUndoManager null
     * See Also:NSUndoManager.undo(), NSUndoManager.undoNestedGroup(), Constant Field Values
     */
    public static final java.lang.String WillUndoChangeNotification="NSUndoManagerWillUndoChangeNotification";

    /**
     * Creates an NSUndoManager object.
     */
    public NSUndoManager(){
         //TODO codavaj!!
    }

    /**
     * Marks the beginning of an undo group. All individual undo operations before a subsequent endUndoGrouping invocation are grouped together and reversed by a later undo invocation. By default, undo groups are begun automatically at the start of the event loop, but you can begin undo groups with this method, and nest them within other groups.
     * This method posts a CheckpointNotification unless a top-level undo is in progress. It posts a DidOpenUndoGroupNotification if a new group was successfully created.
     */
    public void beginUndoGrouping(){
        return; //TODO codavaj!!
    }

    /**
     * Returns true if this NSUndoManager has any actions to redo. Because any undo operation registered clears the redo stack, this method posts a CheckpointNotification to allow clients to apply their pending operations before testing the redo stack.
     */
    public boolean canRedo(){
        return false; //TODO codavaj!!
    }

    /**
     * Returns true if this NSUndoManager has any actions to undo. To invoke undo or undoNestedGroup safely, undo groups may have to close open first.
     */
    public boolean canUndo(){
        return false; //TODO codavaj!!
    }

    /**
     * Disables the recording of undo operations, whether by registerUndoWithTarget or by invocation-based undo. This method can be invoked multiple times by multiple clients. enableUndoRegistration must be invoked an equal number of times to re-enable undo registration.
     */
    public void disableUndoRegistration(){
        return; //TODO codavaj!!
    }

    /**
     * Conformance to NSDisposable. See the method description of dispose in the interface specification for NSDisposable.
     */
    public void dispose(){
        return; //TODO codavaj!!
    }

    public void disposeIfNoSourceRegistered(){
        return; //TODO codavaj!!
    }

    /**
     * Enables the recording of undo operations. Because undo registration is enabled by default, it is often used to balance a prior disableUndoRegistration invocation. Undo registration isn't actually re-enabled until an enable... balances the last disable... in effect.
     */
    public void enableUndoRegistration(){
        return; //TODO codavaj!!
    }

    /**
     * Marks the end of an undo group. All individual undo operations back to the matching beginUndoGrouping invocation are grouped together and reversed by a later undo or undoNestedGroup. Undo groups can be nested, thus providing functionality similar to nested transactions.
     * This method posts a CheckpointNotification and a WillCloseUndoGroupNotification just before the group is closed.
     */
    public void endUndoGrouping(){
        return; //TODO codavaj!!
    }

    /**
     * Returns the number of nested undo groups in the current event loop.
     */
    public int groupingLevel(){
        return 0; //TODO codavaj!!
    }

    /**
     * Returns true if this NSUndoManager automatically creates undo groups around each pass of the run loop. The default is true.
     */
    public boolean groupsByEvent(){
        return false; //TODO codavaj!!
    }

    /**
     * Returns true if this NSUndoManager is in the process of performing an redo operation.
     */
    public boolean isRedoing(){
        return false; //TODO codavaj!!
    }

    /**
     * Returns true if this NSUndoManager is in the process of performing an undo operation.
     */
    public boolean isUndoing(){
        return false; //TODO codavaj!!
    }

    /**
     * Indicates whether the recording of undo operations is enabled. Undo registration is enabled by default.
     */
    public boolean isUndoRegistrationEnabled(){
        return false; //TODO codavaj!!
    }

    /**
     * Returns the maximum number of top-level undo groups this NSUndoManager will hold. If ending the current undo group will result in the number of groups exceeding this limit, the oldest groups are dropped from the stack. A limit of 0 indicates no limit, so old undo groups are never dropped. The default is 0.
     */
    public int levelsOfUndo(){
        return 0; //TODO codavaj!!
    }

    /**
     * Performs the operations in the last group on the redo stack, if there are any, recording them on the undo stack as a single group.
     * This method posts a CheckpointNotification and WillRedoChangeNotification before it performs the redo operation, and it posts DidRedoChangeNotification after it performs the redo operation.
     */
    public void redo(){
        return; //TODO codavaj!!
    }

    /**
     * Register the source callback for CheckpointNotifications.
     */
    public void registerActionSource(java.lang.Object source, com.webobjects.foundation.NSSelector callback){
        return; //TODO codavaj!!
    }

    /**
     * Records a single undo operation for target, so that when undo is performed it's sent selector with object as the sole argument. Also clears the redo stack.
     * To record a simple undo operation, you need only invoke registerUndoWithTarget, giving the object to be sent the undo operation selector, the selector to invoke, and an argument to pass with that message. The target object is usually not the actual object whose state is changing; instead, it's the client object, a document or container that holds many undoable objects. The argument is an object that captures the state of the object before the change is made. If you have multiple arguments, use registerUndoWithTargetAndArguments.
     * Undo groups are normally set by default, so it should rarely need to begin a top-level undo group explicitly.
     */
    public void registerUndoWithTarget(java.lang.Object target, com.webobjects.foundation.NSSelector selector, java.lang.Object object){
        return; //TODO codavaj!!
    }

    /**
     * For undo operations dealing with multiple arguments you need to use registerUndoWithTargetAndArguments method giving the object to be sent the undo operation selector, the selector to invoke, and arguments to pass with that message. The target object is usually not the actual object whose state is changing; instead, it's the client object, a document or container that holds many undoable objects. The argument is an object that captures the state of the object before the change is made.
     */
    public void registerUndoWithTargetAndArguments(java.lang.Object target, com.webobjects.foundation.NSSelector selector, java.lang.Object[] objects){
        return; //TODO codavaj!!
    }

    /**
     * Deregister the source callback for CheckpointNotification.
     */
    public void removeActionSource(java.lang.Object source){
        return; //TODO codavaj!!
    }

    /**
     * Clears the undo and redo stacks and re-enables this NSUndoManager
     */
    public void removeAllActions(){
        return; //TODO codavaj!!
    }

    /**
     * Clears the undo and redo stacks of all operations involving target as the recipient of the undo message. Doesn't re-enable this NSUndoManager if it's disabled. An object that shares an NSUndoManager with other clients should invoke this method in its implementation of finalize.
     */
    public void removeAllActionsWithTarget(java.lang.Object target){
        return; //TODO codavaj!!
    }

    /**
     * Sets whether this NSUndoManager automatically groups undo operations during the run loop. If groupsByEvent is true, this NSUndoManager creates undo groups around each pass through the run loop; if groupsByEvent is false it doesn't. The default is true.
     * If you turn automatic grouping off, you must close groups explicitly before invoking either undo or undoNestedGroup.
     */
    public void setGroupsByEvent(boolean groupsByEvent){
        return; //TODO codavaj!!
    }

    /**
     * Sets the maximum number of top-level undo groups this NSUndoManager will hold to levels. When ending an undo group results in the number of groups exceeding this limit, the oldest groups are dropped from the stack. A limit of 0 indicates no limit, so that old undo groups are never dropped. The default is 0.
     * If invoked with a limit below the prior limit, old undo groups are immediately dropped.
     */
    public void setLevelsOfUndo(int levels){
        return; //TODO codavaj!!
    }

    /**
     * Closes the top-level undo group if necessary and invokes undoNestedGroup. It also invokes endUndoGrouping if the nesting level is 1. This method posts a CheckpointNotification.
     */
    public void undo(){
        return; //TODO codavaj!!
    }

    /**
     * Performs the undo operations in the last undo group (whether top-level or nested), recording the operations on the redo stack as a single group.
     * This method posts a CheckpointNotification and WillUndoChangeNotification before it performs the undo operation, and it posts DidUndoChangeNotification after it performs the undo operation.
     */
    public void undoNestedGroup(){
        return; //TODO codavaj!!
    }

}

package com.webobjects.eodistribution;
/**
 * EODistributionContext objects perform the server-side related work behind Java Client applications and take care of encoding and decoding enterprise objects and other data. While WOJavaClientComponent objects embed Java Client into WebObjects and configure the client-side parameters, distribution contexts take care of actually generating the responses to client- side requests. EODistributionContext objects track the state of the server side object graph and communicate changes to the client, thus keeping the client and server object graphs in sync.
 * The delegate of a distribution context plays an important role in Java Client since it can validate remote method invocations originating from client objects and can implement various security mechanisms. See the EODistributionContext.Delegate interface description for more details on security.
 * If no delegate is implemented and set, the default security mechanisms are as follows: All clients can access all class descriptions (entities) and they can access all objects of those class descriptions, but only the properties explicitly marked as client-side class properties. But be careful: If the client-side class properties are not set explicitly, they default to the server-side class properties. Thus if you just use an EOModel which is not explicitly prepared for Java Client, the client has access to the complete database.
 * But without a delegate implementation, clients are not allowed to remotely invoke any methods outside the enterprise objects they fetch -- except methods that begin with the prefix "clientSideRequest". Remote methods that have a name starting with "clientSideRequest" and are invoked on the distribution context itsself, on a remote method receiver registered with the distribution context or the invocation target's session (the most common case) bypass the delegate security mechanisms and are considered safe to be invoked by any client. The standard remote method invocations to run Java Client applications do not allow the delegate to intersect, but they offer more specialized delegate methods to control security.
 * To support arbitrary remote method invocations, for example to communicate directly with the session object to handle special authentication needs, clients can invoke remote methods on a target relative to the so-called invocationTarget of the distribution context, which by default is the WOJavaClientComponent. These remote methods can use a key path which is evaluated relative to the invocationTarget (the WOJavaClientComponent). By using a key path "session" for example, you reach the session of the WOJavaClientComponent.
 * But sometimes methods invoked by the client are not implemented on the session, but on other objects. To support an easy configuration of those methods, clients can also pass null as the key path of a remote method invocation target, in which case the distribution context goes through the list of objects registered with the addRemoteMethodReceiver method and invokes the method on the first registered receiver responding to the method to be invoked. Usually these remote method receivers are registered with the help of the RemoteMethodReceiverNeededNotification notification. Typically you register the WOApplication or another global object to receiver this notification from all distribution contexts and then, when received, add a list of remote method receivers to the distribution context.
 * See Also:EODistributionContext.Delegate
 */
public class EODistributionContext implements com.webobjects.foundation.NSDisposable{
    /**
     * The name of the notification sent when a distribution context is instantiated. The new distribution context is the sender of the notification.
     * See Also:Constant Field Values
     */
    public static final java.lang.String DistributionContextInstantiatedNotification="EODistributionContextInstantiatedNotification";

    /**
     * The name of the notification sent when a distribution context needs the list of remote method receivers. When receiving this notification, you can register receivers with addRemoteMethodReceiver. The new distribution context is the sender of the notification.
     * See Also:Constant Field Values
     */
    public static final java.lang.String RemoteMethodReceiverNeededNotification="EORemoteMethodReceiverNeededNotification";

    /**
     * Creates a new distribution context for the session session, using the session's defaultEditingContext as the editing context which controls the server side representation of the enterprise object graph fetched by the client.
     * Parameters:session - the session to use with the distribution context
     */
    public EODistributionContext(com.webobjects.appserver.WOSession session){
         //TODO codavaj!!
    }

    /**
     * Creates a new distribution context for the session session, using editingContext as the editing context which controls the server-side representation of the enterprise object graph fetched by the client.
     * Parameters:session - the session to use with the distribution contexteditingContext - the editing context to use with the distribution context
     */
    public EODistributionContext(com.webobjects.appserver.WOSession session, com.webobjects.eocontrol.EOEditingContext editingContext){
         //TODO codavaj!!
    }

    /**
     * Adds an object to the array of remote method receivers. Remote method receivers are used as targets for remote method invocations which specify a null invocation target key path.
     */
    public void addRemoteMethodReceiver(java.lang.Object target){
        return; //TODO codavaj!!
    }

    /**
     * Returns the delegate of the distribution context. The delegate can control security of remote method invocations.
     */
    public java.lang.Object delegate(){
        return null; //TODO codavaj!!
    }

    /**
     * Prepares the receiver so it is disposed when Java performs garbage collection.
     */
    public void dispose(){
        return; //TODO codavaj!!
    }

    /**
     * Returns a array of distribution contexts for a session. Usually there is only one distribution context per session. However, if you use multiple WOJavaClientComponents in the same session (which is not recommended for the usual case and introduces several complications), there will be more than one.
     */
    public static com.webobjects.foundation.NSArray distributionContextsForSession(com.webobjects.appserver.WOSession session){
        return null; //TODO codavaj!!
    }

    /**
     * Returns the editing context used by the distribution context. This editing context controls the server-side representation of the enterprise object graph fetched by the client. Fetches and saves from the client side go through this editing context, so the enterprise objects in this editing context represent the server-side equivalent of the enterprise objects fetched to the client side.
     */
    public com.webobjects.eocontrol.EOEditingContext editingContext(){
        return null; //TODO codavaj!!
    }

    /**
     * Returns the invocation target for remote method invocations which use a key path. If specified, the key path for those remote method invocations is evaluated relative to this invocation target.
     */
    public java.lang.Object invocationTarget(){
        return null; //TODO codavaj!!
    }

    /**
     * Returns the array of remote method receivers.
     */
    public com.webobjects.foundation.NSArray remoteMethodReceivers(){
        return null; //TODO codavaj!!
    }

    /**
     * Invoked to generate a response to a remote method invocation of the client appliction. The data format of the client-server communication is in a private format and not documented.
     */
    public com.webobjects.foundation.NSData responseToClientMessage(com.webobjects.foundation.NSData message){
        return null; //TODO codavaj!!
    }

    /**
     * Returns the session for the distribution context.
     */
    public com.webobjects.appserver.WOSession session(){
        return null; //TODO codavaj!!
    }

    /**
     * Sets the delegate of the distribution context. The delegate can control security of remote method invocations.
     */
    public void setDelegate(java.lang.Object delegate){
        return; //TODO codavaj!!
    }

    /**
     * Sets the invocation target for remote method invocations which use a key path. If specified, the key path for those remote method invocations is evaluated relative to this invocation target.
     */
    public void setInvocationTarget(java.lang.Object invocationTarget){
        return; //TODO codavaj!!
    }

    /**
     * This interface defines the methods that can be implemented by the delegate of EODistributionContexts -- mostly to control security. The delegate does not have to actually implement the interface and all methods of it; it is sufficient to implement just the methods needed, but by implementing the interface the compiler helps to find problems with wrong method signatures.
     */
    public static interface Delegate{
        /**
         * Gives the delegate an opportunity to decrypt data sent from the client. Note that the client side has to encrypt the data with the help of the distribution channel delegate.
         */
        abstract com.webobjects.foundation.NSData distributionContextDidReceiveData(com.webobjects.eodistribution.EODistributionContext distributionContext, com.webobjects.foundation.NSData data);

        /**
         * Returns whether the client application of this distribution context should have access to a class description or not. This method allows you to completely prevent a client from accessing a class description, independent of the client-side class property settings for the corresponding entity.
         */
        abstract boolean distributionContextShouldAllowAccessToClassDescription(com.webobjects.eodistribution.EODistributionContext distributionContext, com.webobjects.eocontrol.EOClassDescription classDescription);

        /**
         * Returns whether a remote method invocation to object should be allowed for the client application of this distribution context or not. If the delegate returns false, an exception is raised and sent to the client, so the method invocation is forbidden.
         */
        abstract boolean distributionContextShouldAllowInvocation(com.webobjects.eodistribution.EODistributionContext distributionContext, java.lang.Object object, com.webobjects.foundation.NSSelector selector, java.lang.Object[] arguments);

        /**
         * Returns whether the client application of this distribution context should be permitted to execute a fetch with a fetch specification. This method allows you to control in great detail which objects can be fetched or not. Note that not all objects are fetched through fetch specifications, though. The client can create fault objects with the help of global IDs and simply fire these faults. To control which faults can be fired, use the distributionContextShouldFetchObjectWithGlobalID method (in addition to this method). If the delegate returns false, an exception is raised and sent to the client, so the fetch is forbidden.
         */
        abstract boolean distributionContextShouldFetchObjectsWithFetchSpecification(com.webobjects.eodistribution.EODistributionContext distributionContext, com.webobjects.eocontrol.EOFetchSpecification fetchSpecification);

        /**
         * Returns whether the client application of this distribution context should be permitted to fire a fault for a global ID. This method allows you to control in great detail which objects can be fetched or not. Note that not all objects are fetched through firing faults, though. The client can create fetch specifications and fetch objects through them. To control which fetch specifications can be executed, use the distributionContextShouldFetchObjectsWithFetchSpecification method (in addition to this method). If the delegate returns false, an exception is raised and sent to the client, so the fetch is forbidden.
         */
        abstract boolean distributionContextShouldFetchObjectWithGlobalID(com.webobjects.eodistribution.EODistributionContext distributionContext, com.webobjects.eocontrol.EOGlobalID globalID, com.webobjects.eocontrol.EOClassDescription classDescription);

        /**
         * Returns whether a remote method invocation to the object identified by keyPath (which is relative to the invocation target of the distribution context) should be allowed for the client application of this distribution context or not. If the delegate returns false, an exception is raised and sent to the client, so the method invocation is forbidden.
         */
        abstract boolean distributionContextShouldFollowKeyPath(com.webobjects.eodistribution.EODistributionContext distributionContext, java.lang.String keyPath);

        /**
         * Returns whether the client application of this distribution context should be permitted to save the state of the editing context editingContext (which is the editing context of the distribution context). This method allows you to control in great detail which changes a client can make. The delegate can examine the state of the object graph in the editing context and if it returns false, an exception is raised and sent to the client, so the save is forbidden.
         */
        abstract boolean distributionContextShouldSave(com.webobjects.eodistribution.EODistributionContext distributionContext, com.webobjects.eocontrol.EOEditingContext editingContext);

        /**
         * Gives the delegate an opportunity to encrypt data sent to the client. Note that the client side has to decrypt the data with the help of the distribution channel delegate.
         */
        abstract com.webobjects.foundation.NSData distributionContextWillSendData(com.webobjects.eodistribution.EODistributionContext distributionContext, com.webobjects.foundation.NSData data);

    }
}

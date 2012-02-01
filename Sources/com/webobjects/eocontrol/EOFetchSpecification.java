package com.webobjects.eocontrol;
/**
 * An EOFetchSpecification collects the criteria needed to select and order a group of records or enterprise objects, whether from an external repository such as a relational database or an internal store such as an EOEditingContext. An EOFetchSpecification contains these elements:
 * EOFetchSpecifications are most often used with the method objectsWithFetchSpecification, defined by EOObjectStore, EOEditingContext, and EODatabaseContext. EOAdaptorChannel and EODatabaseChannel also define methods that use EOFetchSpecifications.
 * See Also:Serialized Form
 */
public class EOFetchSpecification implements java.io.Serializable, java.lang.Cloneable, com.webobjects.foundation.NSCoding, com.webobjects.eocontrol.EOKeyValueArchiving{
    /**
     * Creates a new EOFetchSpecification. By default, fetch specifications fetch deeply and don't use distinct. Before using the fetch specification, you have to set more parameters, at minimum the entity name.
     * See Also:EOFetchSpecification.setEntityName(String)
     */
    public EOFetchSpecification(){
         //TODO codavaj!!
    }

    /**
     * Creates a new EOFetchSpecification with the arguments specified. Minimally, you must specify an entity name. The new EOFetchSpecification is deep, doesn't perform distinct selection, and has no hints. If qualifier is empty, such as an EOAndQualifier or EOOrQualifier whose array of elements contains zero qualifiers, this fetch specification will have its qualifier set to null
     * Parameters:entityName - the name of the entity to fetchqualifier - the qualifier to use for fetchingsortOrderings - the sort orderings to use for fetching
     */
    public EOFetchSpecification(java.lang.String entityName, com.webobjects.eocontrol.EOQualifier qualifier, com.webobjects.foundation.NSArray sortOrderings){
         //TODO codavaj!!
    }

    /**
     * Creates a new EOFetchSpecification with the arguments specified. Minimally, you must specify an entity name. If qualifier is empty, such as an EOAndQualifier or EOOrQualifier whose array of elements contains zero qualifiers, this fetch specification will have its qualifier set to null
     * Parameters:entityName - the name of the entity to fetchqualifier - the qualifier to use for fetchingsortOrderings - the sort orderings to use for fetchingusesDistinct - true if the fetch specification should be distinct; false otherwiseisDeep - true if the fetch specification should be deep; false otherwisehints - the hints to use for fetching
     */
    public EOFetchSpecification(java.lang.String entityName, com.webobjects.eocontrol.EOQualifier qualifier, com.webobjects.foundation.NSArray sortOrderings, boolean usesDistinct, boolean isDeep, com.webobjects.foundation.NSDictionary hints){
         //TODO codavaj!!
    }

    /**
     * Allows the receiver, before being encoded, to substitute a class other than its own in a coder.
     */
    public java.lang.Class classForCoder(){
        return null; //TODO codavaj!!
    }

    /**
     * Implementation of the java.lang.Cloneable interface.
     */
    public java.lang.Object clone(){
        return null; //TODO codavaj!!
    }

    /**
     * (Re)creates an object based on type information and data stored in coder.
     */
    public static java.lang.Object decodeObject(com.webobjects.foundation.NSCoder coder){
        return null; //TODO codavaj!!
    }

    /**
     * (Re)creates an object based on information in unarchiver.
     */
    public static java.lang.Object decodeWithKeyValueUnarchiver(com.webobjects.eocontrol.EOKeyValueUnarchiver unarchiver){
        return null; //TODO codavaj!!
    }

    /**
     * Archives the receiver's type information and data into coder. The receiver can then be recreated using decodeObject. Custom type information can be used by overriding classForCoder.
     */
    public void encodeWithCoder(com.webobjects.foundation.NSCoder coder){
        return; //TODO codavaj!!
    }

    /**
     * Archives the receiver's into archiver. The receiver can then be recreated using decodeWithKeyValueUnarchiver.
     */
    public void encodeWithKeyValueArchiver(com.webobjects.eocontrol.EOKeyValueArchiver archiver){
        return; //TODO codavaj!!
    }

    /**
     * Returns the name of the entity to be fetched.
     */
    public java.lang.String entityName(){
        return null; //TODO codavaj!!
    }

    /**
     * Returns whether the rawRowKeyPaths method returns non-null.
     */
    public boolean fetchesRawRows(){
        return false; //TODO codavaj!!
    }

    /**
     * Returns the fetch limit value which indicates the maximum number of objects to fetch. Depending on the value of promptsAfterFetchLimit, the EODatabaseContext will either stop fetching objects when this limit is reached or it will ask the editing context's message handler to prompt the user as to whether or not it should continue fetching. Use 0 (zero) to indicate no fetch limit. The default is 0.
     */
    public int fetchLimit(){
        return 0; //TODO codavaj!!
    }

    /**
     * Returns the fetch specification that the entity specified by entityName associates with the fetch specification name name.
     */
    public static com.webobjects.eocontrol.EOFetchSpecification fetchSpecificationNamed(java.lang.String name, java.lang.String entityName){
        return null; //TODO codavaj!!
    }

    /**
     * Applies bindings from bindings to the receiver's qualifier if there is one, and returns a new fetch specification that can be used in a fetch. The default behavior is to prune any nodes for which there are no bindings. You can invoke setRequiresAllQualifierBindingVariables with a true argument to force an exception to be raised if a binding is missing during variable substitution.
     */
    public com.webobjects.eocontrol.EOFetchSpecification fetchSpecificationWithQualifierBindings(com.webobjects.foundation.NSDictionary bindings){
        return null; //TODO codavaj!!
    }

    /**
     * Returns the receiver's hints, which other objects can use to alter or optimize fetch operations.
     */
    public com.webobjects.foundation.NSDictionary hints(){
        return null; //TODO codavaj!!
    }

    /**
     * Returns true if a fetch should include sub-entities of the receiver's entity, false if it shouldn't. EOFetchSpecifications are deep by default.
     * For example, if you have a Person entity with two sub-entities, Employee and Customer, fetching Persons deeply also fetches all Employees and Customers matching the qualifier. Fetching Persons shallowly fetches only Persons matching the qualifier.
     */
    public boolean isDeep(){
        return false; //TODO codavaj!!
    }

    /**
     * Returns true if a fetch should result in the selected objects being locked in the data repository, false if it shouldn't. The default is false. Note that unnecessary locking could severely degrade the performance of certain repository operations.
     */
    public boolean locksObjects(){
        return false; //TODO codavaj!!
    }

    /**
     * Returns an array of relationship key paths that should be prefetched along with the main fetch. For example, if fetching from a Movie entity, you might specify paths of the form: ("directors","roles.talent", "plotSummary").
     */
    public com.webobjects.foundation.NSArray prefetchingRelationshipKeyPaths(){
        return null; //TODO codavaj!!
    }

    /**
     * Returns whether to prompt the user after the fetch limit has been reached. The default is false.
     */
    public boolean promptsAfterFetchLimit(){
        return false; //TODO codavaj!!
    }

    /**
     * Returns the EOQualifier that indicates which records or objects the receiver is to fetch.
     */
    public com.webobjects.eocontrol.EOQualifier qualifier(){
        return null; //TODO codavaj!!
    }

    /**
     * Returns an array of attribute key paths that should be fetched as raw data and returned as an array of dictionaries (instead of the normal result of full objects). The raw fetch can increase speed, but forgoes most of the benefits of full Enterprise Objects. The default value is null, indicating that full objects will be returned from the fetch. An empty array may be used to indicate that the fetch should query the entity named by the fetch specification using the method attributesToFetch. As long as the primary key attributes are included in the raw attributes, the raw row may be used to generate a fault for the corresponding object using EOEditingContext's faultForRawRow method.
     */
    public com.webobjects.foundation.NSArray rawRowKeyPaths(){
        return null; //TODO codavaj!!
    }

    /**
     * Returns true if existing objects are overwritten with fetched values when they've been updated or changed. Returns false if existing objects aren't touched when their data is refetched (the fetched data is simply discarded). The default is false. Note that this setting does not affect relationships.
     */
    public boolean refreshesRefetchedObjects(){
        return false; //TODO codavaj!!
    }

    /**
     * Returns true to indicate that a missing binding will cause an exception to be raised during variable substitution. The default value is false, which says to prune any nodes for which there are no bindings.
     */
    public boolean requiresAllQualifierBindingVariables(){
        return false; //TODO codavaj!!
    }

    /**
     * Sets the name of the root entity to be fetched to entityName.
     */
    public void setEntityName(java.lang.String entityName){
        return; //TODO codavaj!!
    }

    /**
     * Sets the behavior for fetching raw rows. If set to true, the behavior is the same as if setRawRowKeyPaths were called with an empty array (which causes fetchesRawRows to return true). If set to false, the behavior is as if setRawRowKeyPaths were called with null as the argument (which causes fetchesRawRows to return false). Note that if rawRowKeyPaths has already had a value assigned to it, using this method will overwrite that value.
     */
    public void setFetchesRawRows(boolean fetchesRawRows){
        return; //TODO codavaj!!
    }

    /**
     * Sets the fetch limit value which indicates the maximum number of objects to fetch. Depending on the value of promptsAfterFetchLimit, the EODatabaseContext either stops fetching objects when this limit is reached or asks the editing context's message handler to prompt the user as to whether or not it should continue fetching. Use 0 (zero) to indicate no fetch limit. The default is 0.
     */
    public void setFetchLimit(int fetchLimit){
        return; //TODO codavaj!!
    }

    /**
     * Sets the receiver's hints to hints. Any object that uses an EOFetchSpecification can define its own hints that it uses to alter or optimize fetch operations. For example, EODatabaseContext uses a hint identified by the key CustomQueryExpressionHintKey. EODatabaseContext is the only class in the standard Enterprise Objects Framework that defines fetch specification hints.
     */
    public void setHints(com.webobjects.foundation.NSDictionary hints){
        return; //TODO codavaj!!
    }

    /**
     * Sets whether a fetch should include sub-entities of the receiver's entity. If flag is true, sub-entities are also fetched; if flag is false, they aren't. EOFetchSpecifications are deep by default.
     * For example, if you have a Person entity with two sub-entities and subclasses, Employee and Customer, fetching Persons deeply also fetches all Employees and Customers matching the qualifier. Fetching Persons shallowly fetches only Persons matching the qualifier.
     */
    public void setIsDeep(boolean isDeep){
        return; //TODO codavaj!!
    }

    /**
     * Sets whether a fetch should result in the selected objects being locked in the data repository. If flag is true it should, if flag is false it shouldn't. The default is false. Note that unnecessary locking could severely degrade the performance of certain repository operations.
     */
    public void setLocksObjects(boolean locksObjects){
        return; //TODO codavaj!!
    }

    /**
     * Sets an array of relationship key paths that should be prefetched along with the main fetch. For example, if fetching from a Movie entity, you might specify paths of the form: ("directors","roles.talent", "plotSummary").
     * Prefetching increases the initial fetch cost, but it can improve overall performance by reducing the number of round trips made to the database server. Assigning relationships to prefetch also has an effect on how a fetch specification refreshes.
     * Refreshing refers to existing objects being overwritten with fetched values. This allows the application to see changes to the database that have been made by someone else. Normally, when an EOFetchSpecification is set to refresh using setRefreshesRefetchedObjects, it only refreshes the objects you are fetching. For example, if you fetch employees, you do not also fetch the employees' departments. However, if you prefetch relationships, the refetch is propagated for all of the relationships specified.
     */
    public void setPrefetchingRelationshipKeyPaths(com.webobjects.foundation.NSArray keyPaths){
        return; //TODO codavaj!!
    }

    /**
     * Sets whether or not the application's message handler is notified when the fetch limit has been reached, enabling the message handler to prompt the user whether to continue to fetch more rows. If value is false, or if the application has no message handler, fetching stops after fetchLimit rows have been fetched. The default is false.
     * Note that only the EOInterface layer provides a built-in message handler implementation. Standard WebObjects applications must set the message handler directly and implement editingContextShouldContinueFetching to prompt the user in an appropriate form in order to make use of this feature.
     */
    public void setPromptsAfterFetchLimit(boolean value){
        return; //TODO codavaj!!
    }

    /**
     * Sets this fetch specification's qualifier to qualifier. If qualifier is empty, such as an EOAndQualifier or EOOrQualifier whose array of elements contains zero qualifiers, this fetch specification will have its qualifier set to null
     */
    public void setQualifier(com.webobjects.eocontrol.EOQualifier qualifier){
        return; //TODO codavaj!!
    }

    /**
     * Sets an array of attribute key paths that should be fetched as raw data and returned as an array of dictionaries (instead of the normal result of full objects). The raw fetch can increase speed, but forgoes most of the benefits of full Enterprise Objects. The default value is null, indicating that full objects will be returned from the fetch. An empty array may be used to indicate that the fetch should query the entity named by the fetch specification using the method attributesToFetch. As long as the primary key attributes are included in the raw attributes, the raw row may be used to generate a fault for the corresponding object using EOEditingContext's faultForRawRow method.
     */
    public void setRawRowKeyPaths(com.webobjects.foundation.NSArray keyPaths){
        return; //TODO codavaj!!
    }

    /**
     * Sets whether existing objects are overwritten with fetched values when they have been updated or changed. If refreshes is true, they are; if refreshes is false, they aren't (the fetched data is simply discarded). The default is false.
     * For example, suppose that an employee object is fetched and then refetched, without changing the employee between fetches. In this case you want to refresh the employee when you refetch it because another application might have updated the object since the first fetch. To keep the employee in sync with the employee data in the external repository you would need to replace the employee's outdated values with the new ones. On the other hand, if you have to fetch the employee, change it, and then refetch it, you would not want to refresh the employee. If you are to refresh it whether or not another application had changed the employee you would lose the changes that you have made to the object.
     * You can get finer grain control on an EODatabaseContext's refreshing behavior in the EOControl layer than you can with an EOFetchSpecification by using the delegate method databaseContextShouldUpdateCurrentSnapshot.
     */
    public void setRefreshesRefetchedObjects(boolean refreshes){
        return; //TODO codavaj!!
    }

    /**
     * Sets the behavior when a missing binding is encountered during variable substitution. If requires is true, then a missing binding will cause an exception to be raised during variable substitution. The default value is false, which says to prune any nodes for which there are no bindings.
     */
    public void setRequiresAllQualifierBindingVariables(boolean requires){
        return; //TODO codavaj!!
    }

    /**
     * Sets the receiver's array of EOSortOrderings to sortOrderings. When a fetch is performed with the receiver, the results are sorted by applying each EOSortOrdering in the array (serially in lowest-array-index-first order).
     */
    public void setSortOrderings(com.webobjects.foundation.NSArray sortOrderings){
        return; //TODO codavaj!!
    }

    /**
     * Sets whether duplicate objects or records are removed after fetching. If flag is true they are removed (that is, proper sets are returned). If flag is false they aren't (multisets are returned). EOFetchSpecifications by default don't use distinct.
     */
    public void setUsesDistinct(boolean usesDistinct){
        return; //TODO codavaj!!
    }

    /**
     * Returns the receiver's array of EOSortOrderings. When a fetch is performed with the receiver, the results are sorted by applying each EOSortOrdering in the array (serially in lowest-array-index-first order).
     */
    public com.webobjects.foundation.NSArray sortOrderings(){
        return null; //TODO codavaj!!
    }

    /**
     * Returns a String representation of the receiver.
     */
    public java.lang.String toString(){
        return null; //TODO codavaj!!
    }

    /**
     * Returns true if duplicate objects or records are removed after fetching, false if they aren't. EOFetchSpecifications by default don't use distinct (that is, they return multisets).
     */
    public boolean usesDistinct(){
        return false; //TODO codavaj!!
    }

}

package com.webobjects.eoaccess;
/**
 * An EOEntity describes a table in a database and associates a name internal to the Enterprise Objects Framework with an external name by which the table is known to the database. An EOEntity maintains a group of attributes and relationships, which are collectively called properties. These are represented by the EOAttribute and EORelationship classes, respectively.
 * You usually define entities in an EOModel using the EOModeler application. EOEntity objects are primarily used by the Enterprise Objects Framework for mapping tables in the database to Enterprise Objects in the application. You are not likely to interact with them directly unless you are specifically working with models.
 * An EOEntity is associated with a specific class whose instances are used to represent records (rows) from the database in applications using layers at or above the database layer of the Enterprise Objects Framework. If an EOEntity doesn't have a specific class associated with it, instances of EOGenericRecord are created.
 * An EOEntity may be marked as read-only, in which case any changes to rows or objects for that entity made by the database level objects are denied.
 * You can define an external query for an EOEntity to be used when a selection is attempted with an unrestricted qualifier (one that would select all rows in the entity's table). An external query is sent unaltered to the database server and so can use database-specific features such as stored procedures; external queries are thus useful for hiding records or invoking database-specific features. You can also assign stored procedures to be invoked upon particular database operations through the use of EOEntity's setStoredProcedure method.
 * Like the other major modeling classes, EOEntity provides a user dictionary for the application to store any application-specific information related to the entity.
 * Note that if an entity has no Enterprise Object class name, the database-level objects use EOGenericRecord.
 * See Also:EOEntity.setStoredProcedure(EOStoredProcedure storedProcedure, String operation), EOAttribute, EORelationship, EOGenericRecord
 */
public class EOEntity implements com.webobjects.eoaccess.EOPropertyListEncoding, com.webobjects.eoaccess.EOSQLExpression.SQLValue{
    /**
     * A stored procedure to delete a row.
     * See Also:Constant Field Values
     */
    public static final java.lang.String DeleteProcedureOperation="EODeleteProcedure";

    /**
     * A stored procedure to fetch all records.
     * See Also:Constant Field Values
     */
    public static final java.lang.String FetchAllProcedureOperation="EOFetchAllProcedure";

    /**
     * A stored procedure to fetch by primary key.
     * See Also:Constant Field Values
     */
    public static final java.lang.String FetchWithPrimaryKeyProcedureOperation="EOFetchWithPrimaryKeyProcedure";

    /**
     * A stored procedure to insert a row.
     * See Also:Constant Field Values
     */
    public static final java.lang.String InsertProcedureOperation="EOInsertProcedure";

    /**
     * A stored procedure to generate a new primary key.
     * See Also:Constant Field Values
     */
    public static final java.lang.String NextPrimaryKeyProcedureOperation="EONextPrimaryKeyProcedure";

    /**
     * Creates and returns a new EOEntity.
     */
    public EOEntity(){
         //TODO codavaj!!
    }

    /**
     * Creates and returns a new EOEntity initialized from the property list plist belonging to the EOModel owner. plist is dictionary containing only property list data types (that is, NSDictionary, NSArray, NSData, and String). This constructor is used by EOModeler when it reads in an EOModel from a file.
     * Parameters:plist - A dictionary of property list values from which to initialize the new EOEntity object.owner - The EOModel to which the newly created entity belongs.See Also:EOPropertyListEncoding.encodeIntoPropertyList(NSMutableDictionary propertyList), EOPropertyListEncoding.awakeWithPropertyList(NSDictionary propertyList)
     */
    public EOEntity(com.webobjects.foundation.NSDictionary plist, java.lang.Object owner){
         //TODO codavaj!!
    }

    /**
     * Adds attribute to the receiver and sets the receiver as the attribute's entity. Throws an exception if: attribute is null. attribute has an EOEntity set that is different than the receiver. attribute's name is already in use by another attribute or relationship belonging to the receiver. an error is encountered during processing.
     */
    public void addAttribute(com.webobjects.eoaccess.EOAttribute attribute){
        return; //TODO codavaj!!
    }

    /**
     * Adds the fetch specification fetchSpec to the receiver and associates name with it. Throws an exception if the entityName for fetchSpec is different than the receiver's name.
     */
    public void addFetchSpecification(com.webobjects.eocontrol.EOFetchSpecification fetchSpec, java.lang.String name){
        return; //TODO codavaj!!
    }

    /**
     * Adds index to the receiver and sets the receiver as the index's entity.\
     */
    public void addIndex(com.webobjects.eoaccess.EOEntityIndex index){
        return; //TODO codavaj!!
    }

    /**
     * Adds relationship to the receiver and sets the receiver as the relationship's entity. Throws an exception if: relationship is null. relationship has an EOEntity set that is different than the receiver. relationship's name is already in use by another attribute or relationship belonging to the receiver. an error is encountered during processing.
     */
    public void addRelationship(com.webobjects.eoaccess.EORelationship relationship){
        return; //TODO codavaj!!
    }

    /**
     * Adds the fetch specification identified by name to the set of fetch specifications used to load objects into a shared editing context.
     */
    public void addSharedObjectFetchSpecificationByName(java.lang.String name){
        return; //TODO codavaj!!
    }

    /**
     * Adds the EOEntity child as a sub-entity of the receiver. This is the first step in setting up an inheritance hierarchy between entities.
     * NOTE: addSubEntity and removeSubEntity are not thread-safe. In general, modifying an EOModel programmatically is not thread-safe.
     */
    public void addSubEntity(com.webobjects.eoaccess.EOEntity child){
        return; //TODO codavaj!!
    }

    /**
     * Returns the user-created attribute identified by name. If no such attribute exists, this method looks through the "hidden" attributes created by the Enterprise Objects Framework for one with the given name. Hidden attributes are used for such things as primary keys on target entities of flattened attributes. Returns null if no attribute with the given name is found.
     */
    public com.webobjects.eoaccess.EOAttribute anyAttributeNamed(java.lang.String name){
        return null; //TODO codavaj!!
    }

    /**
     * Returns the user-created relationship identified by relationshipName. If none exists, this method looks through the "hidden" relationships created by the Enterprise Objects Framework for one with the given name. If none is found, null is returned.
     */
    public com.webobjects.eoaccess.EORelationship anyRelationshipNamed(java.lang.String relationshipName){
        return null; //TODO codavaj!!
    }

    /**
     * Returns the attribute named attributeName, or null if no such attribute exists in the receiver.
     */
    public com.webobjects.eoaccess.EOAttribute attributeNamed(java.lang.String attributeName){
        return null; //TODO codavaj!!
    }

    /**
     * Returns an array containing all of the receiver's attributes, or an empty array if the receiver has no attributes. Throws a runtime exception if an error in encountered during evaluation; the error text indicates the nature of the exception.
     */
    public com.webobjects.foundation.NSArray attributes(){
        return null; //TODO codavaj!!
    }

    /**
     * Returns an array of the EOAttributes that need to be fetched so that they can be included in the row snapshot. The set of attributes includes: Attributes that are class properties, "used for locking," or primary keys. Source attributes of any to-many relationship (flattened or non-flattened) that is a class property. Source attributes of any non-flattened, to-one relationship that is a class property or that is used by a flattened attribute that is a class property. The foreign key attributes of any flattened, to-one relationship that is a class property or that is used by a class property.
     */
    public com.webobjects.foundation.NSArray attributesToFetch(){
        return null; //TODO codavaj!!
    }

    /**
     * Returns an array containing those attributes used for locking, that is, those properties whose values must match a snapshot any time a row is updated. Attributes used for locking are those whose values are compared when a database-level object performs an update. When the database-level classes fetch an Enterprise Object, they cache these attributes' values in a snapshot. Later, when the Enterprise Object is updated, the values of these attributes in the object are checked against those in the snapshot. If they differ, the update fails.
     */
    public com.webobjects.foundation.NSArray attributesUsedForLocking(){
        return null; //TODO codavaj!!
    }

    /**
     * EOEntity's implementation of this method does nothing.
     */
    public void awakeWithPropertyList(com.webobjects.foundation.NSDictionary pl){
        return; //TODO codavaj!!
    }

    /**
     * Makes the receiver's name conform to a standard convention. EOEntity names that conform to this style are all lower-case except for the initial letter of each word, which is upper-case. Thus, "MOVIE" becomes "Movie", and "MOVIE_ROLE" becomes "MovieRole".
     */
    public void beautifyName(){
        return; //TODO codavaj!!
    }

    /**
     * Returns true if all of the objects from the receiver are to be cached in memory and queries are to be evaluated in memory using this cache rather than in the database. This method should only be used for fairly small tables of read-only objects, since the first access to the entity will trigger fetching the entire table. You should generally restrict this method to read-only entities to avoid cached data becoming out of sync with database data. Also, you shouldn't use this method if the application will be making any queries against the entity that can't be evaluated in memory. To clear the cache, use the EODatabase method invalidateResultCachedForEntityNamed(String name).
     */
    public boolean cachesObjects(){
        return false; //TODO codavaj!!
    }

    /**
     * Returns the EOClassDescription associated with the receiver. The EOClassDescription class provides a mechanism for extending classes by giving them access to the metadata contained in an EOModel (or other external source of information). In an application, EOClassDescriptions are registered on demand for the EOEntity on which an Enterprise Object is based.
     */
    public com.webobjects.eocontrol.EOClassDescription classDescriptionForInstances(){
        return null; //TODO codavaj!!
    }

    /**
     * Returns the name of the Enterprise Object class associated with the receiver. When a row is fetched for the entity by a database-level object, it is returned as an instance of this class. This class might not be present in the runtime system, and in fact, the application may have to load it on demand. If the application doesn't load a class, EOGenericRecord is used. An Enterprise Object class other than EOGenericRecord can be mapped to only one entity.
     */
    public java.lang.String className(){
        return null; //TODO codavaj!!
    }

    /**
     * Return the name of the Enterprise Object class associated with the receiver without the package information.
     */
    public java.lang.String classNameWithoutPackage(){
        return null; //TODO codavaj!!
    }

    /**
     * Return the package of the Enterprise Object class associated with the receive.
     */
    public java.lang.String classPackageName(){
        return null; //TODO codavaj!!
    }

    /**
     * Returns an array containing the properties that are bound to the receiver's class (so that values corresponding to those properties are passed to instances of that class). This set of properties is a subset of the entity's attributes and relationships.
     */
    public com.webobjects.foundation.NSArray classProperties(){
        return null; //TODO codavaj!!
    }

    /**
     * Returns an array containing the names of those properties that are bound to the receiver's class (so that values corresponding to those properties are passed to instances of that class). This set of properties is a subset of the entity's attributes and relationships.
     */
    public com.webobjects.foundation.NSArray classPropertyNames(){
        return null; //TODO codavaj!!
    }

    /**
     * Returns the name of the client-side Enterprise Object class associated with the receiver. If no client-side class name has yet been registered for the receiver, this method returns the name of the receiving class (either EOEntity or a subclass of EOEntity).
     * Equivalent to the EOAccessAdditions method clientClassNameForEntity in the EOJavaClient Framework in WebObjects 4.5.x.
     */
    public java.lang.String clientClassName(){
        return null; //TODO codavaj!!
    }

    /**
     * Returns an array containing the properties that are bound to the client-side class corresponding to the receiver. If no information about the client-side class's properties is available, this method returns the receiver's class properties. The properties returned by this method are the attributes and relationships that are used by the client. Only these attributes and relationships will be passed to the client.
     * Equivalent to the EOAccessAdditions method clientClassPropertiesForEntity in the EOJavaClient Framework in WebObjects 4.5.x.
     */
    public com.webobjects.foundation.NSArray clientClassProperties(){
        return null; //TODO codavaj!!
    }

    /**
     * Returns an array containing the names of the properties that are bound to the client-side class corresponding to the entity. If no information about the client-side class's properties is available, this method returns the names of the entity's class properties. The property names returned by this method are the attributes and relationships that are used by the client. Only these attributes and relationships will be passed to the client.
     * Equivalent to the EOAccessAdditions method clientClassPropertyNamesForEntity in the EOJavaClient Framework in WebObjects 4.5.x.
     */
    public com.webobjects.foundation.NSArray clientClassPropertyNames(){
        return null; //TODO codavaj!!
    }

    /**
     * Encodes the receiver as a property list.
     */
    public void encodeIntoPropertyList(com.webobjects.foundation.NSMutableDictionary result){
        return; //TODO codavaj!!
    }

    /**
     * Examines each of the receiver's relationships and returns a list of all external models referenced by the receiver, or an empty arrray if no external models are referenced.
     */
    public com.webobjects.foundation.NSArray externalModelsReferenced(){
        return null; //TODO codavaj!!
    }

    /**
     * Returns the name of the receiver as understood by the database server, that is, the receiver's external name.
     */
    public java.lang.String externalName(){
        return null; //TODO codavaj!!
    }

    /**
     * Used by the Enterprise Objects Framework to convert an internal object name, internalName to a database schema name that conforms to a standard convention, separating name elements with separatorString and capitalizing or lowercasing the external name based on the Boolean parameter allCaps.
     * By default, the separator string is an underscore and full capitalization is turned on. Consequently "name" becomes "NAME" and "firstName" becomes "FIRST_NAME". If allCaps is false, this method converts "firstName" to "first_name". A different separator string may also be specified.
     */
    public static java.lang.String externalNameForInternalName(java.lang.String internalName, java.lang.String separatorString, boolean allCaps){
        return null; //TODO codavaj!!
    }

    /**
     * Returns a query statement that is used by an EOAdaptorChannel to select rows for the entity when a qualifier is empty, or null if the entity has no external query. An empty qualifier is one that specifies only the entity and would thus fetch all Enterprise Objects for that entity.
     * External queries are useful for hiding records or invoking database-specific features such as stored procedures when an application attempts to select all records for an entity. You can also use the EOStoredProcedure class to work with stored procedures.
     */
    public java.lang.String externalQuery(){
        return null; //TODO codavaj!!
    }

    /**
     * Returns the fetch specification identified by fetchSpecName.
     */
    public com.webobjects.eocontrol.EOFetchSpecification fetchSpecificationNamed(java.lang.String fetchSpecName){
        return null; //TODO codavaj!!
    }

    /**
     * Returns an alphabetically sorted array of the names of the receiver's fetch specifications. Throws a runtime exception if an error is encountered during sorting; the error text indicates the nature of the exception.
     */
    public com.webobjects.foundation.NSArray fetchSpecificationNames(){
        return null; //TODO codavaj!!
    }

    /**
     * Constructs a unique global identifier for the receiver from the keys and values in the dictionary row, which represents a database row.
     */
    public com.webobjects.eocontrol.EOGlobalID globalIDForRow(com.webobjects.foundation.NSDictionary row){
        return null; //TODO codavaj!!
    }

    /**
     * Checks if an entity is not abstract and has a valid external name.
     */
    public boolean hasExternalName(){
        return false; //TODO codavaj!!
    }

    /**
     * Checks to see if the enity has real attributes.
     */
    public boolean hasRealAttributes(){
        return false; //TODO codavaj!!
    }

    /**
     * Check if the entity use a simple primary key (Number)
     */
    public boolean hasSimplePrimaryKey(){
        return false; //TODO codavaj!!
    }

    /**
     * /** Returns an array containing all of the receiver's indexs, or an empty array if the receiver has no indexes. Throws a runtime exception if an error in encountered during evaluation; the error text indicates the nature of the exception.
     */
    public com.webobjects.foundation.NSArray indexes(){
        return null; //TODO codavaj!!
    }

    /**
     * Returns the index identified by indexName, or null if the receiver has no such index.
     */
    public com.webobjects.eoaccess.EOEntityIndex indexNamed(java.lang.String indexName){
        return null; //TODO codavaj!!
    }

    /**
     * Returns true if the receiver is an abstract entity, false otherwise. An abstract entity is one that has no corresponding Enterprise Objects in the application. Abstract entities are used to model inheritance relationships. For example, you might have a Person abstract entity that acts as the parent of Customer and Employee entities. Customer and Employee would inherit certain characteristics from Person (such as name and address attributes). However, though the application might have Customer and Employee objects, it would never have a Person object.
     */
    public boolean isAbstractEntity(){
        return false; //TODO codavaj!!
    }

    /**
     * Returns true if every key attribute is present in object and has a value that is not null. Returns false otherwise. This method uses the EOKeyValueCoding interface so the object parameter may be a dictionary instead of an Enterprise Object.
     */
    public boolean isPrimaryKeyValidInObject(com.webobjects.foundation.NSKeyValueCoding object){
        return false; //TODO codavaj!!
    }

    /**
     * Returns true if qualifier describes the primary key and nothing but the primary key, false otherwise. Throws a runtime exception if an error in encountered during evaluation; the error text indicates the nature of the exception.
     */
    public boolean isQualifierForPrimaryKey(com.webobjects.eocontrol.EOQualifier qualifier){
        return false; //TODO codavaj!!
    }

    /**
     * Returns true if the receiver can not be modified, false if it can. If an entity is read-only, then Enterprise Objects fetched for that entity are also read-only (that is, can not be inserted, deleted, or updated).
     */
    public boolean isReadOnly(){
        return false; //TODO codavaj!!
    }

    /**
     * Checks if the receiving entity is a subentity of entity.
     */
    public boolean isSubEntityOf(com.webobjects.eoaccess.EOEntity entity){
        return false; //TODO codavaj!!
    }

    /**
     * Returns true if anAttribute can be used for locking, false otherwise. In order for an attribute to be valid for locking, it must be an attribute belonging to the receiver and must not be a derived attribute. Used to test the validity of an attribute for locking before passing it to setAttributesUsedForLocking.
     */
    public boolean isValidAttributeUsedForLocking(com.webobjects.eoaccess.EOAttribute anAttribute){
        return false; //TODO codavaj!!
    }

    /**
     * Returns true if the property aProp is a valid class property of the receiver, false otherwise. To be a valid class property, a property must be an instance of EOAttribute or EORelationship.
     * Note that this method does not tell you whether aProp is a member of the array returned by the classProperties method. In other words, unlike classProperties, classPropertyNames, and setClassProperties, this method does not interact with the properties bound to the receiver's Enterprise Object class.
     */
    public boolean isValidClassProperty(java.lang.Object aProp){
        return false; //TODO codavaj!!
    }

    /**
     * Returns false if anAttribute isn't an EOAttribute, doesn't belong to the entity or is derived. Otherwise returns true.
     */
    public boolean isValidPrimaryKeyAttribute(com.webobjects.eoaccess.EOAttribute anAttribute){
        return false; //TODO codavaj!!
    }

    /**
     * Returns the maximum number of to-one faults from the receiver to fire at one time.
     */
    public int maxNumberOfInstancesToBatchFetch(){
        return 0; //TODO codavaj!!
    }

    /**
     * Returns the EOModel that contains the receiver.
     */
    public com.webobjects.eoaccess.EOModel model(){
        return null; //TODO codavaj!!
    }

    /**
     * Returns the receiver's name.
     */
    public java.lang.String name(){
        return null; //TODO codavaj!!
    }

    /**
     * Used by the Enterprise Objects Framework to convert a database schema name externalName to an internal object name that conforms to a standard convention, using the capitalization rule initialCaps and removing the character separatorString that separates name elements in the external name.
     * By default, the separator string is assumed to be an underscore, however a different character may be specified, as used by the database. The default capitalization rule for EOAttribute, EORelationship, or EOStored procedure object names is false, that is, all lower-case except for the initial letter of each embedded word other than the first, which is upper-case. Consequently, "NAME" becomes "name" and "FIRST_NAME" becomes "firstName".
     * The default capitalization rule for EOEntity object names is true, that is, is all lower-case except for the initial letter of each word. Consequently "CUSTOMER_ACCOUNT" becomes "CustomerAccount".
     */
    public static java.lang.String nameForExternalName(java.lang.String externalName, java.lang.String separatorString, boolean initialCaps){
        return null; //TODO codavaj!!
    }

    /**
     * Returns the parent entity for the receiver, that is, the entity from which the receiver inherits.
     */
    public com.webobjects.eoaccess.EOEntity parentEntity(){
        return null; //TODO codavaj!!
    }

    /**
     * Returns an array containing the names of the EOAttributes that make up the receiver's primary key.
     */
    public com.webobjects.foundation.NSArray primaryKeyAttributeNames(){
        return null; //TODO codavaj!!
    }

    /**
     * Returns an array of those EOAttributes that make up the receiver's primary key.
     */
    public com.webobjects.foundation.NSArray primaryKeyAttributes(){
        return null; //TODO codavaj!!
    }

    /**
     * Returns the primary key for the object identified by gid, or null if gid is not an instance of EOKeyGlobalID.
     */
    public com.webobjects.foundation.NSDictionary primaryKeyForGlobalID(com.webobjects.eocontrol.EOGlobalID gid){
        return null; //TODO codavaj!!
    }

    /**
     * Returns the primary key for row, or null if the primary key can't be computed. The primary key is a dictionary whose keys are attribute names and whose values are values for those attributes.
     */
    public com.webobjects.foundation.NSDictionary primaryKeyForRow(com.webobjects.foundation.NSDictionary row){
        return null; //TODO codavaj!!
    }

    /**
     * Returns the external name (that is, the name understood by the database) of the receiver's root (parent) entity. If the receiver has no parent entity, returns the receiver's external name, if one is set, or internal name, if no external name is set.
     */
    public java.lang.String primaryKeyRootName(){
        return null; //TODO codavaj!!
    }

    /**
     * Returns the property identified by propertyName, or null if the receiver has no such property.
     */
    public com.webobjects.eoaccess.EOProperty propertyNamed(java.lang.String propertyName){
        return null; //TODO codavaj!!
    }

    /**
     * Returns a qualifier for the receiver that can be used to fetch an instance of the receiver with the primary key extracted from row. Throws an exception if the value of the primary key obtained from row is either null or NSKeyValueCoding.NullValue.
     */
    public com.webobjects.eocontrol.EOQualifier qualifierForPrimaryKey(com.webobjects.foundation.NSDictionary row){
        return null; //TODO codavaj!!
    }

    /**
     * Returns true if any of the receiver's attributes or relationships reference property, false otherwise. A property can be referenced by a flattened attribute or by a relationship.
     * For example, suppose a model has an Employee entity with a toDepartment relationship. If you flatten the department's name attribute into the Employee entity, creating a departmentName attribute, that flattened attribute references the toDepartment relationship. If an entity has any outstanding references to a property, you shouldn't remove the property.
     */
    public boolean referencesProperty(java.lang.Object property){
        return false; //TODO codavaj!!
    }

    /**
     * Returns the relationship identified by relationshipName, or null if the receiver has no such relationship.
     */
    public com.webobjects.eoaccess.EORelationship relationshipNamed(java.lang.String relationshipName){
        return null; //TODO codavaj!!
    }

    /**
     * Returns an array containing all of the receiver's relationships or null if the receiver has none. Throws a runtime exception if an error is encountered during processing; the error text indicates the nature of the exception.
     */
    public com.webobjects.foundation.NSArray relationships(){
        return null; //TODO codavaj!!
    }

    /**
     * If attribute exists, removes it from the receiver. Always use referencesProperty to check that an attribute isn't referenced by another property before removing it.
     */
    public void removeAttribute(com.webobjects.eoaccess.EOAttribute attribute){
        return; //TODO codavaj!!
    }

    /**
     * Removes the fetch specification identifed by name from the receiver.
     */
    public void removeFetchSpecificationNamed(java.lang.String name){
        return; //TODO codavaj!!
    }

    /**
     * If index exists, removes it from the receiver.
     */
    public void removeIndex(com.webobjects.eoaccess.EOEntityIndex index){
        return; //TODO codavaj!!
    }

    /**
     * If relationship exists, removes it from the receiver. Always use referencesProperty to check that a relationship isn't referenced by another property before removing it.
     */
    public void removeRelationship(com.webobjects.eoaccess.EORelationship relationship){
        return; //TODO codavaj!!
    }

    /**
     * Removes the fetch specification identified by name from the set of fetch specifications used to load objects into a shared editing context.
     */
    public void removeSharedObjectFetchSpecificationByName(java.lang.String name){
        return; //TODO codavaj!!
    }

    /**
     * Removes the EOEntity child from the list of sub-entities that inherit from the receiver.
     * NOTE: addSubEntity and removeSubEntity are not thread-safe. In general, modifying an EOModel programmatically is not thread-safe.
     */
    public void removeSubEntity(com.webobjects.eoaccess.EOEntity child){
        return; //TODO codavaj!!
    }

    /**
     * Returns the qualifier used to restrict all queries made against the receiver. Restricting qualifiers are useful when there is not a one-to-one mapping between an entity and a particular database table, or when you always want to filter the data that's returned for a particular entity.
     * For example, if you are using the "single table" inheritance model in which parent and child data are contained in the same table, you would use a restricting qualifier to fetch objects of the appropriate type. To give a non-inheritance example, for an Employees table you might create a "Sales" entity that has a restricting qualifier that only fetches employees who are in the Sales department.
     */
    public com.webobjects.eocontrol.EOQualifier restrictingQualifier(){
        return null; //TODO codavaj!!
    }

    /**
     * Returns an SQL qualifier based on qualifier that is suitable for evaluation by a database (as opposed to in-memory evaluation). Invoked by an EODatabaseChannel object before it uses its EOAdaptorChannel to perform a database operation. Whereas in-memory qualifier evaluation uses object instance variables to resolve relationships, a database qualifier must use foreign keys.
     */
    public com.webobjects.eocontrol.EOQualifier schemaBasedQualifier(com.webobjects.eocontrol.EOQualifier qualifier){
        return null; //TODO codavaj!!
    }

    /**
     * If all of the the EOAttributes in attributes can be used by an EODatabaseChannel to lock Enterprise Objects for updates, sets attributes as the receiver's attributes used for locking and returns true. Otherwise returns false and leaves the receiver's currently-set attributes used for locking unchanged.
     */
    public boolean setAttributesUsedForLocking(com.webobjects.foundation.NSArray attributes){
        return false; //TODO codavaj!!
    }

    /**
     * Based on the Boolean value flag, sets whether the receiver's Enterprise Objects are cached the first time the associated database table is queried. To clear the cache, use the EODatabase method invalidateResultCacheForEntityNamed(String name).
     */
    public void setCachesObjects(boolean flag){
        return; //TODO codavaj!!
    }

    /**
     * Assigns name as the name of the Enterprise Object class associated with the receiver if name is not null. The specified class need not be present in the runtime system when this message is sent. When an EODatabaseChannel fetches objects for the receiver, they are created as instances of this class. The application may have to load the class on demand if it isn't present in the runtime system; if it doesn't load the class, EOGenericRecord will be used.
     * An Enterprise Object class other than EOGenericRecord can be mapped to only one entity.
     */
    public void setClassName(java.lang.String name){
        return; //TODO codavaj!!
    }

    /**
     * If all of the the EOAttributes in attributes are valid class properties of the receiver, sets attributes as the receiver's class properties and returns true. Otherwise returns false and leaves the currently-set class properties for the receiver unchanged.
     */
    public boolean setClassProperties(com.webobjects.foundation.NSArray attributes){
        return false; //TODO codavaj!!
    }

    /**
     * Sets the name of the receiver as understood by the database server (that is, the receiver's external name) to string. For example, though the application may know the receiver as "JobTitle", the database may require a form such as "JOB_TTL".
     * An adaptor uses the external name to communicate with the database; the application should never need to use the external name.
     */
    public void setExternalName(java.lang.String string){
        return; //TODO codavaj!!
    }

    /**
     * Assigns string as the query statement used for selecting rows from the entity when there is no qualifier. External queries are useful for hiding records or invoking database-specific features such as stored procedures when an application attempts to select all records for an entity. You can also use the EOStoredProcedure class to work with stored procedures.
     * An external query is sent unaltered to the database server, and so must contain the external (column) names instead of the entity's attribute names. However, to work properly with the adaptor, the external query must use the columns in alphabetical order by their corresponding EOAttributes' names.
     */
    public void setExternalQuery(java.lang.String string){
        return; //TODO codavaj!!
    }

    /**
     * Based on the Boolean flag, sets whether the receiver is an abstract entity, false otherwise. Abstract entities are used to model inheritance relationships.
     * For example, you might have a Person abstract entity that acts as the parent of Customer and Employee entities. Customer and Employee would inherit certain characteristics from Person (such as name and address attributes). However, though the application might have Customer and Employee objects, it would never have a Person object.
     */
    public void setIsAbstractEntity(boolean flag){
        return; //TODO codavaj!!
    }

    /**
     * Sets the maximum number of faults from the entity to trigger at one time to size. By default, only one object is fetched from the database when you trigger a fault.
     * Using this optional method to fetch a batch of faults when one fault is triggered helps to optimize performance by getting extra work done for each round trip to the database.
     */
    public void setMaxNumberOfInstancesToBatchFetch(int size){
        return; //TODO codavaj!!
    }

    /**
     * Sets the receiver's name to name.
     */
    public void setName(java.lang.String name){
        return; //TODO codavaj!!
    }

    /**
     * If all of the the EOAttributes in attributes are valid primary keys of the receiver, sets attributes as the receiver's primary keys and returns true. Otherwise returns false and leaves the currently-set primary keys for the receiver unchanged.
     * Primary key attributes should be chosen carefully. Floating-point numbers, for example, can not be reliably compared for equality, and thus are unsuitable for use in primary keys. Integer and string types are the safest choice for primary keys. BigDecimal objects can be used as primary keys, but entail more overhead than integers.
     */
    public boolean setPrimaryKeyAttributes(com.webobjects.foundation.NSArray attributes){
        return false; //TODO codavaj!!
    }

    /**
     * Sets whether the receiver is read-only based on the Boolean value flag. If an entity is read-only, the database rows for that entity can not be modified by the application.
     */
    public void setReadOnly(boolean flag){
        return; //TODO codavaj!!
    }

    /**
     * Assigns qualifier as the qualifier used to restrict all queries made against the receiver. The restricting qualifier can be used to map an entity to a subset of the rows in a table.
     */
    public void setRestrictingQualifier(com.webobjects.eocontrol.EOQualifier qualifier){
        return; //TODO codavaj!!
    }

    /**
     * Sets the names of the fetch specifications used to load objects into a shared editing context to names.
     */
    public void setSharedObjectFetchSpecificationsByName(com.webobjects.foundation.NSArray names){
        return; //TODO codavaj!!
    }

    /**
     * Sets storedProcedure as a stored procedure for the receiver and associates with it the name operation, which must be one of the following: FetchAllProcedureOperation FetchWithPrimaryKeyProcedureOperation InsertProcedureOperation DeleteProcedureOperation NextPrimaryKeyProcedureOperation This information is used when changes from the object graph have been transformed into EODatabaseOperations that are being used to construct EOAdaptorOperations. At this point, the Enterprise Objects Framework checks the entities associated with the changed objects to see if the entities have any stored procedures defined for the operation being performed.
     */
    public void setStoredProcedure(com.webobjects.eoaccess.EOStoredProcedure storedProcedure, java.lang.String operation){
        return; //TODO codavaj!!
    }

    /**
     * Sets the dictionary of auxiliary user data to dictionary. The userInfo dictionary contains arbitrary data that the application can use for whatever it needs. dictionary can only contain property list data types: String, NSDictionary, NSArray, and NSData.
     */
    public void setUserInfo(com.webobjects.foundation.NSDictionary dictionary){
        return; //TODO codavaj!!
    }

    /**
     * Returns an array of strings, which are the names of the fetch specifications used to load objects into a shared editing context. Returns an empty array if there are no shared object fetch specifications.
     */
    public com.webobjects.foundation.NSArray sharedObjectFetchSpecificationNames(){
        return null; //TODO codavaj!!
    }

    /**
     * Returns the stored procedure identified by the name operation, if one has been set. Otherwise, returns null. operation must be one of the following: FetchAllProcedureOperation FetchWithPrimaryKeyProcedureOperation InsertProcedureOperation DeleteProcedureOperation NextPrimaryKeyProcedureOperation
     */
    public com.webobjects.eoaccess.EOStoredProcedure storedProcedureForOperation(java.lang.String operation){
        return null; //TODO codavaj!!
    }

    /**
     * Returns a list of those entities that inherit from the receiver, or an empty array if no entities inherit from the receiver.
     */
    public com.webobjects.foundation.NSArray subEntities(){
        return null; //TODO codavaj!!
    }

    /**
     * Returns a string representation of all the receiver's properties.
     */
    public java.lang.String toString(){
        return null; //TODO codavaj!!
    }

    /**
     * Returns a dictionary of user data. The application can use this to store any auxiliary information it needs.
     */
    public com.webobjects.foundation.NSDictionary userInfo(){
        return null; //TODO codavaj!!
    }

    /**
     * Returns an SQL query string based on the receiver's external name and an EOSQLExpression object context. Returns the receiver's external name if context is null.
     * For conformance to the EOSQLExpression.SQLValue interface.
     */
    public java.lang.String valueForSQLExpression(com.webobjects.eoaccess.EOSQLExpression context){
        return null; //TODO codavaj!!
    }

}

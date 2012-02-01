package com.webobjects.eoaccess;
/**
 * An EORelationship describes an association between two entities, based on attributes of those two entities. By defining EORelationships in the application's EOModel, you can cause the relationships defined in the database to be automatically resolved as Enterprise Objects are fetched. For example, a Movie entity may contain its studioId as an attribute, but without an EORelationship studioId will appear in a Movie Enterprise Object only as a number. With an EORelationship explicitly connecting the Movie entity to a Studio entity, a Movie Enterprise Object will automatically be given its Studio Enterprise Object when an EODatabaseChannel fetches it from the database. The two entities that make up a relationship can be in the same model or two different models, as long as they are in the same model group.
 * You usually can define relationships in your EOModel with the EOModeler application. EORelationships are primarily for use by the Enterprise Objects Framework; unless you have special needs you shouldn't need to access them in your application's code.
 * See EORelationshipConcepts for more information.
 * See Also:EORelationship.setJoinSemantic(int joinSemantic), EORelationship.InnerJoin, EORelationship.FullOuterJoin, EORelationship.LeftOuterJoin, EORelationship.RightOuterJoin
 */
public class EORelationship extends com.webobjects.eoaccess.EOProperty implements com.webobjects.eoaccess.EOPropertyListEncoding, com.webobjects.eoaccess.EOSQLExpression.SQLValue{
    public static final java.lang.String DeleteRuleCascadeString="EODeleteRuleCascade";

    public static final java.lang.String DeleteRuleDenyString="EODeleteRuleDeny";

    public static final java.lang.String DeleteRuleNoActionString="EODeleteRuleNoAction";

    public static final java.lang.String DeleteRuleNullifyString="EODeleteRuleNullify";

    /**
     * Produces results for all source records, regardless of the values of the relationships.
     * See Also:Constant Field Values
     */
    public static final int FullOuterJoin=1;

    public static final java.lang.String FullOuterJoinString="EOFullOuterJoin";

    /**
     * Produces results only for destinations of the join relationship that have non-null values.
     * See Also:Constant Field Values
     */
    public static final int InnerJoin=0;

    public static final java.lang.String InnerJoinString="EOInnerJoin";

    /**
     * Preserves rows in the left (source) table, keeping them even if there's no corresponding row in the right table.
     * See Also:Constant Field Values
     */
    public static final int LeftOuterJoin=2;

    public static final java.lang.String LeftOuterJoinString="EOLeftOuterJoin";

    /**
     * Preserves rows in the right (destination) table, keeping them even if there's no corresponding row in the left table.
     * See Also:Constant Field Values
     */
    public static final int RightOuterJoin=3;

    public static final java.lang.String RightOuterJoinString="EORightOuterJoin";

    /**
     * Creates an empty EORelationship.
     */
    public EORelationship(){
         //TODO codavaj!!
    }

    /**
     * Creates and returns a new EORelationship initialized from plist-a dictionary containing only property list data types (that is, NSDictionaries, Strings, NSArrays, and NSData). This constructor is used by EOModeler when it reads in a Model from a file, for example. The owner argument should be the EORelationship's Entity. EORelationships created from a property list must receive an awakeWithPropertyList message immediately after creation before they are fully functional, but the awakeWithPropertyList message should be deferred until after all of the other objects in the model have also been created.
     * Parameters:plist - dictionary containing property listowner - specify entity as owner
     */
    public EORelationship(com.webobjects.foundation.NSDictionary plist, com.webobjects.eoaccess.EOEntity owner){
         //TODO codavaj!!
    }

    /**
     * Adds a source-destination attribute pair to the relationship. Throws an exception if the relationship is flattened, if either the source or destination attributes are flattened, or if either of join's attributes already belongs to another join of the relationship.
     */
    public void addJoin(com.webobjects.eoaccess.EOJoin join){
        return; //TODO codavaj!!
    }

    /**
     * Searches the relationship's destination entity for any back- referencing relationship joining on the same keys. It first looks for a relationship defined in the model. If none is found, it looks for a "hidden" inverse relationship that was manufactured by the Framework. If none is found, the Framework creates a "hidden" inverse relationship for internal use and returns that.
     */
    public com.webobjects.eoaccess.EORelationship anyInverseRelationship(){
        return null; //TODO codavaj!!
    }

    /**
     * Finishes initializing the receiver from plist.
     * The receiver must have been created with a constructor of the form:
     * public ClassName(NSDictionary propertyList, Object owner)
     * awakeWithPropertyList is responsible for restoring references to other objects. It should not be invoked until all other objects that the receiver might reference have been created from plist.
     */
    public void awakeWithPropertyList(com.webobjects.foundation.NSDictionary plist){
        return; //TODO codavaj!!
    }

    /**
     * Makes the relationship's name conform to a standard convention. Names that conform to this style are all lower-case except for the initial letter of each embedded word other than the first, which is upper case. Thus, "NAME" becomes "name", and "FIRST_NAME" becomes "firstName". This method is used in reverse-engineering a model.
     */
    public void beautifyName(){
        return; //TODO codavaj!!
    }

    /**
     * Returns an NSArray of base relationships making up a flattened relationship, or null if the relationship isn't flattened.
     */
    public com.webobjects.foundation.NSArray componentRelationships(){
        return null; //TODO codavaj!!
    }

    /**
     * Returns the data path of a flattened relationship; for example "department.facility". If the relationship isn't flattened, definition returns null.
     */
    public java.lang.String definition(){
        return null; //TODO codavaj!!
    }

    /**
     * Returns a rule that describes the action to take when an object is being deleted. The returned rule is one of the following integers (defined in the EOControl layer's EOClassDescription class):
     * Value Description EOClassDescription. DeleteRuleNullify Delete the department and remove any back reference the employee has to the department. EOClassDescription. DeleteRuleCascade Delete the department and all of the employees it contains. EOClassDescription. DeleteRuleDeny Refuse the deletion if the department contains employees. EOClassDescription. DeleteRuleNoAction Delete the department, but ignore the department's employees relationship. You should use this delete rule with caution since it can leave dangling references in your object graph.
     */
    public int deleteRule(){
        return 0; //TODO codavaj!!
    }

    /**
     * Returns an NSArray of destination attributes of the relationship. These correspond one-to-one with the attributes returned by sourceAttributes.
     */
    public com.webobjects.foundation.NSArray destinationAttributes(){
        return null; //TODO codavaj!!
    }

    /**
     * Returns the relationship's destination entity, which is determined by the destination entity of its joins for a simple relationship, and by whatever ends the data path for a flattened relationship. For example, if a flattened relationship's definition is "department.facility", the destination entity is the Facility entity.
     */
    public com.webobjects.eoaccess.EOEntity destinationEntity(){
        return null; //TODO codavaj!!
    }

    /**
     * Description copied from interface:
     * Encodes the receiver as a property list. Property lists are NSDictionary objects whose values are String, NSDictionary, NSArray, and NSData objects.
     */
    public void encodeIntoPropertyList(com.webobjects.foundation.NSMutableDictionary result){
        return; //TODO codavaj!!
    }

    /**
     * Returns the relationship's entity.
     */
    public com.webobjects.eoaccess.EOEntity entity(){
        return null; //TODO codavaj!!
    }

    /**
     * Searches the relationship's destination entity for a user-created, back- referencing relationship joining on the same keys. Returns the inverse relationship if one is found, null otherwise.
     */
    public com.webobjects.eoaccess.EORelationship inverseRelationship(){
        return null; //TODO codavaj!!
    }

    /**
     * Returns true if the relationship contains more than one join (that is, if it joins more than one pair of attributes), false if it has only one join.
     */
    public boolean isCompound(){
        return false; //TODO codavaj!!
    }

    /**
     * Returns true if the relationship has a definition that traverses another relationship, false otherwise. A flattened relationship gives the source entity access to the relationships in a destination entity.
     */
    public boolean isFlattened(){
        return false; //TODO codavaj!!
    }

    /**
     * Returns true if the target of the relationship is required, false if it can be null.
     */
    public boolean isMandatory(){
        return false; //TODO codavaj!!
    }

    /**
     * Returns true if the relationship is to-many, false if it's to-one.
     */
    public boolean isToMany(){
        return false; //TODO codavaj!!
    }

    /**
     * Returns all joins used by relationship.
     */
    public com.webobjects.foundation.NSArray joins(){
        return null; //TODO codavaj!!
    }

    /**
     * Returns the semantic used to create SQL expressions for this relationship. The returned join semantic is one of the following:
     * Constant Description InnerJoin Produces results only for destinations of the join relationship that have non-null values. FullOuterJoin Produces results for all source records, regardless of the values of the relationships. LeftOuterJoin Preserves rows in the left (source) table, keeping them even if there's no corresponding row in the right table. RightOuterJoin Preserves rows in the right (destination) table, keeping them even if there's no corresponding row in the left table.
     */
    public int joinSemantic(){
        return 0; //TODO codavaj!!
    }

    /**
     * Returns the relationship's name.
     */
    public java.lang.String name(){
        return null; //TODO codavaj!!
    }

    /**
     * Returns the number of to-many faults that are triggered at one time.
     */
    public int numberOfToManyFaultsToBatchFetch(){
        return 0; //TODO codavaj!!
    }

    /**
     * Returns true if the receiver's source object owns its destination objects, false otherwise.
     */
    public boolean ownsDestination(){
        return false; //TODO codavaj!!
    }

    /**
     * Returns true if objects should propagate their primary key to related objects through this relationship. Objects only propagate their primary key values if the corresponding values in the destination object aren't already set.
     */
    public boolean propagatesPrimaryKey(){
        return false; //TODO codavaj!!
    }

    /**
     * Returns a qualifier that can be used to fetch the destination of the receiving relationship given sourceRow.
     */
    public com.webobjects.eocontrol.EOQualifier qualifierWithSourceRow(com.webobjects.foundation.NSDictionary sourceRow){
        return null; //TODO codavaj!!
    }

    /**
     * Returns true if property is in the relationship's data path or is an attribute belonging to one of the relationship's joins; otherwise, it returns false.
     */
    public boolean referencesProperty(java.lang.Object property){
        return false; //TODO codavaj!!
    }

    /**
     * Returns the full relationship path for a flattened relationship. For a non-flattened relationship, the result is the same as name.
     */
    public java.lang.String relationshipPath(){
        return null; //TODO codavaj!!
    }

    /**
     * Deletes join from the relationship. Does nothing if the relationship is flattened.
     */
    public void removeJoin(com.webobjects.eoaccess.EOJoin join){
        return; //TODO codavaj!!
    }

    /**
     * Changes the relationship to a flattened relationship by releasing any joins and attributes (both source and destination) associated with the relationship and setting definition as its data path. For example, a relationship have the definitions "department.facility". If the relationship's entity hasn't been set, this method won't work correctly.
     */
    public void setDefinition(java.lang.String definition){
        return; //TODO codavaj!!
    }

    /**
     * Set a rule describing the action to take when object is being deleted. deleteRule can be one of the following (defined in the control layer's EOClassDescription): EOClassDescription.DeleteRuleNullify EOClassDescription.DeleteRuleCascade EOClassDescription.DeleteRuleDeny EOClassDescription.DeleteRuleNoAction
     */
    public void setDeleteRule(int deleteRule){
        return; //TODO codavaj!!
    }

    /**
     * Sets the entity of the relationship to entity. If the relationship is currently owned by a different entity, this method will remove the relationship from that entity. This method doesn't add the relationship to the new entity. EOEntity's addRelationship method invokes this method. You only need to use this method when creating a flattened relationship; use EOEntity's addRelationship to associate an existing relationship with an entity.
     */
    public void setEntity(com.webobjects.eoaccess.EOEntity entity){
        return; //TODO codavaj!!
    }

    /**
     * Specifies according to isMandatory whether the target of the relationship must be supplied or can be null.
     */
    public void setIsMandatory(boolean isMandatory){
        return; //TODO codavaj!!
    }

    /**
     * Sets the semantic used to create SQL expressions for this relationship. joinSemantic should be one of the following: InnerJoin FullOuterJoin LeftOuterJoin RightOuterJoin
     */
    public void setJoinSemantic(int semantic){
        return; //TODO codavaj!!
    }

    /**
     * Sets the relationship's name to name. Throws a verification exception if name is not a valid relationship name, and an invalid argument exception if name is already in use by an attribute or another relationship in the same entity. This method forces all objects in the model to be loaded into memory.
     */
    public void setName(java.lang.String name){
        return; //TODO codavaj!!
    }

    /**
     * Sets the number of
     * toMany
     * faults that are fired at one time to size.
     */
    public void setNumberOfToManyFaultsToBatchFetch(int size){
        return; //TODO codavaj!!
    }

    /**
     * Sets according to bool whether a receiver's source object owns its destination objects. The default is false. When a source object owns its destination objects, it means that the destination objects can't exist independently. For example, in a personnel database, dependents can't exist without having an associated employee. Removing a dependent from an employee's dependents array would have the effect of also deleting the dependent from the database, unless you transferred the dependent to a different employee.
     */
    public void setOwnsDestination(boolean bool){
        return; //TODO codavaj!!
    }

    /**
     * Specifies according to bool whether objects should propagate their primary key to related objects through this relationship. For example, an Employee object might propagate its primary key to an EmployeePhoto object. Objects only propagate their primary key values if the corresponding values in the destination object aren't already set.
     */
    public void setPropagatesPrimaryKey(boolean bool){
        return; //TODO codavaj!!
    }

    /**
     * Sets a simple relationship as to-many according to bool. Throws an exception if the receiver is flattened.
     */
    public void setToMany(boolean bool){
        return; //TODO codavaj!!
    }

    /**
     * Sets the dictionary of auxiliary data, which the application can use for whatever it needs. dictionary can only contain property list data types (that is, NSDictionary, String, NSArray, and NSData).
     */
    public void setUserInfo(com.webobjects.foundation.NSDictionary aDictionary){
        return; //TODO codavaj!!
    }

    /**
     * Returns the source attributes of a simple (non-flattened) relationship. These correspond one-to-one with the attributes returned by destinationAttributes. Returns null if the relationship is flattened.
     */
    public com.webobjects.foundation.NSArray sourceAttributes(){
        return null; //TODO codavaj!!
    }

    public java.lang.String toString(){
        return null; //TODO codavaj!!
    }

    /**
     * Returns a dictionary of user data. An application can use this data for whatever it needs.
     */
    public com.webobjects.foundation.NSDictionary userInfo(){
        return null; //TODO codavaj!!
    }

    /**
     * For relationships marked as mandatory, throws a ValidationException if the receiver is to-one and valueP is null, or if the receiver is to-many and valueP has a count of 0. A mandatory relationship is one in which the target of the relationship is required. Returns the validated value (usually valueP).
     */
    public java.lang.Object validateValue(java.lang.Object valueP) throws com.webobjects.foundation.NSValidation.ValidationException{
        return null; //TODO codavaj!!
    }

    /**
     * Returns the value to use in SQL expressions.
     */
    public java.lang.String valueForSQLExpression(com.webobjects.eoaccess.EOSQLExpression context){
        return null; //TODO codavaj!!
    }

}

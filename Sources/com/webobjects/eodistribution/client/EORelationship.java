package com.webobjects.eodistribution.client;
/**
 * An EORelationship describes an association between two entities. The two entities can be in the same model or two different models as long as they are in the same model group. The assocation can be to-one or to-many, and is directional: no inverse is implied, however an inverse relationship may exist.
 * A relationship belongs to the 'source' entity, and is in many ways like an attribute (of the source object), its value being the related EOEnterpriseObject (or null) in the case of a to-one relationship, and an NSArray of EOEnterpriseObjects (possibly empty) in the case of a to-many relationship.
 */
public class EORelationship implements com.webobjects.foundation.NSCoding{
    /**
     * The constructor for EORelationship.
     */
    public EORelationship(){
         //TODO codavaj!!
    }

    /**
     * Returns the class that will be used by NSCoders to later re-create this object.
     */
    public java.lang.Class classForCoder(){
        return null; //TODO codavaj!!
    }

    /**
     * Re-creates (decodes) an object of this class from the values stored in a NSCoder.
     */
    public static java.lang.Object decodeObject(com.webobjects.foundation.NSCoder coder){
        return null; //TODO codavaj!!
    }

    /**
     * Returns an integer constant specifiying the delete rule. The delete rule specifies what will happen when the related object(s) is (are) about to be deleted. The constants EOClassDescription (in com.webobjects.eocontrol) defines are DeleteRuleNullify, DeleteRuleCascade, DeleteRuleDeny and DeleteRuleNoAction.
     */
    public int deleteRule(){
        return 0; //TODO codavaj!!
    }

    /**
     * Returns the name of destination entity.
     */
    public java.lang.String destinationName(){
        return null; //TODO codavaj!!
    }

    /**
     * Encodes this object (its defining values) into the specified NSCoder.
     */
    public void encodeWithCoder(com.webobjects.foundation.NSCoder coder){
        return; //TODO codavaj!!
    }

    /**
     * Returns the name of the inverse relationship.
     */
    public java.lang.String inverseName(){
        return null; //TODO codavaj!!
    }

    /**
     * Returns whether this relationship is mandatory, meaning there has to be (at least) one destination object, it cannot be null.
     */
    public boolean isMandatory(){
        return false; //TODO codavaj!!
    }

    /**
     * Returns whether this relationship is to-many, meaning its value is a (possibly empty) array of enterprise objects. Otherwise it is a to-one relationship, and its value either a direct pointer to a single enterprise object, or null.
     */
    public boolean isToMany(){
        return false; //TODO codavaj!!
    }

    /**
     * Returns the name of this relationship.
     */
    public java.lang.String name(){
        return null; //TODO codavaj!!
    }

    /**
     * Returns whether the related object(s) is (are) owned by the source object of this relationship.
     */
    public boolean ownsDestination(){
        return false; //TODO codavaj!!
    }

    /**
     * Returns whether the primary key of the source object is propagated to the destination object(s) of this relationship, so that these will have the same primary key.
     */
    public boolean propagatesPrimaryKey(){
        return false; //TODO codavaj!!
    }

    /**
     * Returns a readable String representation off this relationship's definitions.
     */
    public java.lang.String toString(){
        return null; //TODO codavaj!!
    }

    /**
     * Validates value by performing several checks to see whether value would be an acceptable value for the relationship. However, it currently will only check the 'mandatory' requirement, if set, to verify that value contains one object (or an array with at least one e lement)
     */
    public java.lang.Object validateValue(java.lang.Object value) throws com.webobjects.foundation.NSValidation.ValidationException{
        return null; //TODO codavaj!!
    }

}

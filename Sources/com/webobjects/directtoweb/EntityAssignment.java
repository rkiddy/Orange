package com.webobjects.directtoweb;
/**
 * The EntityAssignment class performs assignment of a key to an object that represents an entity.
 * See Also:EOEntity, Serialized Form
 */
public class EntityAssignment extends com.webobjects.directtoweb.Assignment{
    /**
     * Creates an instance of EntityAssignment based on an EOKeyValueUnarchiver.
     * This is used to read the assignment information from a rule file.
     * Parameters:unarchiver - the unarchiverSee Also:EntityAssignment.EntityAssignment(String, Object), Assignment.Assignment(EOKeyValueUnarchiver)
     */
    public EntityAssignment(com.webobjects.eocontrol.EOKeyValueUnarchiver unarchiver){
         //TODO codavaj!!
    }

    /**
     * Creates an instance of EntityAssignment with the specified key path and value.
     * The current implementation uses a string to represent the name of an entity in the default model group.
     * The implementation is subject to change in future releases.
     * Parameters:keyPath - the key pathvalue - instance of StringSee Also:Assignment.Assignment(String, Object), EOEntity, EOModelGroup
     */
    public EntityAssignment(java.lang.String keyPath, java.lang.Object value){
         //TODO codavaj!!
    }

    public static java.lang.Object decodeWithKeyValueUnarchiver(com.webobjects.eocontrol.EOKeyValueUnarchiver unarchiver){
        return null; //TODO codavaj!!
    }

    /**
     * Gets the entity, in the default model group, specified by the value method.
     */
    public java.lang.Object fire(com.webobjects.directtoweb.D2WContext context){
        return null; //TODO codavaj!!
    }

}

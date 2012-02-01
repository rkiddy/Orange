package com.webobjects.directtoweb;
/**
 * The BooleanAssignment class performs assignment of a key to an object that represents a logical "true" or "false" value.
 * See Also:Serialized Form
 */
public class BooleanAssignment extends com.webobjects.directtoweb.Assignment{
    /**
     * Creates an instance of BooleanAssignment based on an EOKeyValueUnarchiver.
     * This is used to read the assignment information from a rule file.
     * Parameters:unarchiver - instance of EOKeyValueUnarchiverSee Also:BooleanAssignment.BooleanAssignment(String, Object), Assignment.Assignment(EOKeyValueUnarchiver)
     */
    public BooleanAssignment(com.webobjects.eocontrol.EOKeyValueUnarchiver unarchiver){
         //TODO codavaj!!
    }

    /**
     * Creates an instance of BooleanAssignment with the specified key path and value.
     * The current implementation uses D2WModel.Zero and D2WModel.One to represent "false" and "true" values, respectively. Any instance of Number that has a primitive integer value of 1 is mapped to One. The strings "true" and "1" are mapped to One, too. All other numbers and strings are mapped to Zero.
     * The implementation is subject to change in future releases.
     * Parameters:keyPath - the key pathvalue - instance of Number or StringSee Also:Assignment.Assignment(String, Object), D2WModel.Zero, D2WModel.One
     */
    public BooleanAssignment(java.lang.String keyPath, java.lang.Object value){
         //TODO codavaj!!
    }

    public static java.lang.Object decodeWithKeyValueUnarchiver(com.webobjects.eocontrol.EOKeyValueUnarchiver unarchiver){
        return null; //TODO codavaj!!
    }

    /**
     * Description copied from class:
     * This method is intentionally undocumented. You should never have to invoke or customize it.
     */
    public void encodeWithKeyValueArchiver(com.webobjects.eocontrol.EOKeyValueArchiver archiver){
        return; //TODO codavaj!!
    }

}

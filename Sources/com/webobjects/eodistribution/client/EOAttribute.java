package com.webobjects.eodistribution.client;
/**
 * EOAttribute is the client-side representation of an attribute, containing the information relevant within Java Client. The corresponding server-side definition is also called EOAttribute, but exists in the package com.webobjects.eoaccess.
 * An EOAttribute represents a column, field, or property in a database and associates an internal name with an external name or expression by which the property is known to the database. The property an EOAttribute represents may be a meaningful value, such as a salary or a name, or it may be an arbitrary value used for identification but with no real-world applicability (ID numbers and foreign keys for relationships fall into this category). An EOAttribute also maintains type information for binding values to the instance variables of objects.
 * You usually define attributes in the EOModel with the EOModeler application. Your code probably won't need to interact programmatically with EOAttribute unless you are working at the adaptor level.
 */
public class EOAttribute implements com.webobjects.foundation.NSCoding{
    /**
     * The constructor for EOAttribute.
     */
    public EOAttribute(){
         //TODO codavaj!!
    }

    /**
     * Returns whether this attribute allows null values.
     */
    public boolean allowsNull(){
        return false; //TODO codavaj!!
    }

    /**
     * Returns the class that will be used by NSCoders to later re-create this object.
     */
    public java.lang.Class classForCoder(){
        return null; //TODO codavaj!!
    }

    /**
     * Decodes (re-creates) an EOAttribute from the information in the given coder.
     */
    public static java.lang.Object decodeObject(com.webobjects.foundation.NSCoder coder){
        return null; //TODO codavaj!!
    }

    /**
     * Encodes the information defining this EOAttribute into the given coder.
     */
    public void encodeWithCoder(com.webobjects.foundation.NSCoder coder){
        return; //TODO codavaj!!
    }

    /**
     * Returns the name of the attribute (within the model, not necessarily the same as on the database).
     */
    public java.lang.String name(){
        return null; //TODO codavaj!!
    }

    /**
     * Returns a readable String representation of this attribute's definitions.
     */
    public java.lang.String toString(){
        return null; //TODO codavaj!!
    }

    /**
     * Validates value by attempting to convert it to the attribute's value type and testing other attribute validation constraints (such as allowsNull, width, and so on). Throws an exception if any errors occur during validation. On success, if no conversion was performed, returns null; if the validation process required coercion, the converted value is returned.
     */
    public java.lang.Object validateValue(java.lang.Object value) throws com.webobjects.foundation.NSValidation.ValidationException{
        return null; //TODO codavaj!!
    }

    /**
     * Returns the name of the class which values of this attribute have, or null if no class is specified.
     */
    public java.lang.String valueClassName(){
        return null; //TODO codavaj!!
    }

    /**
     * Returns the maximum length (in characters or bytes) for values that are mapped to this attribute. Returns zero for numeric and date types.
     */
    public int width(){
        return 0; //TODO codavaj!!
    }

}

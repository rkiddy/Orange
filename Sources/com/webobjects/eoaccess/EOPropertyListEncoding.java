package com.webobjects.eoaccess;
/**
 * The EOPropertyListEncoding interface declares methods that read and write objects to property lists, which are dictionaries containing String, NSDictionary, NSArray, and NSData objects. Classes that implement this interface must also provide a constructor that creates objects from a property list and an owner:
 * Objects created with a constructor of this type are initialized from the values in propertyList. The owner argument is optional. The newly created object isn't considered fully functional until it receives an awakeWithPropertyList message, which finishes initializing the object. The awakeWithPropertyList invocation should be deferred until after all of the objects identified in the property list have been created.
 * The method encodeIntoPropertyList is responsible for encoding an object into a property list for later restoration. This interface is used by the Enterprise Objects Framework to read and write modeling objects such as EOModel, EOEntity, and EOAttribute to a model file.
 */
public interface EOPropertyListEncoding{
    /**
     * Finishes initializing the receiver from the property list dic, restoring references to other objects. Consequently, it should not be invoked until all other objects from dic that the receiver might reference have been created. The receiver must have been created with a constructor of the form: public ClassName(NSDictionary propertyList, Object owner)
     */
    abstract void awakeWithPropertyList(com.webobjects.foundation.NSDictionary dic);

    /**
     * Encodes the receiver as a property list. Property lists are NSDictionary objects whose values are String, NSDictionary, NSArray, and NSData objects.
     */
    abstract void encodeIntoPropertyList(com.webobjects.foundation.NSMutableDictionary dic);

}

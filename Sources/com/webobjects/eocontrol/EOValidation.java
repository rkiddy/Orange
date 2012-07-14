package com.webobjects.eocontrol;
/**
 * <p>
 * The EOValidation interface in an extension of the NSValidation interface (which defines key-value based validation methods). EOValidation 
 * defines additional methods enterprise objects use to validate their values. The validation methods check for illegal value types, values 
 * outside of established limits, illegal relationships, and so on. EOCustomObject and EOGenericRecord provide default implementations of 
 * EOValidation, which are described in detail in this specification.
 * </p><p>
 * The Enterprise Objects Framework validates all of an object's properties before the object is saved to an external source -- either inserted 
 * or updated. Additionally, you can design your application so that changes to a property's value are validated immediately, as soon as a user 
 * attempts to leave an editable field in the user interface (Java Client applications only). Whenever an EODisplayGroup sets a value in an 
 * object, it sends the object a <code>validateValueForKey</code> message, allowing the object to coerce the value's type, perform any 
 * additional validation, and throw an exception if the value isn't valid. By default, the display group leaves validation errors to be handled 
 * when the object is saved, using <code>validateValueForKey</code> only for type coercion. However, you can use the EODisplayGroup method 
 * <code>setValidatesChangesImmediately</code> to tell the display group to immediately present an attention panel whenever a validation error 
 * is encountered.
 * </p>
 * <h4>Validating Before an Operation</h4>
 * <p>
 * The EOValidation methods -- <code>validateForInsert</code>, <code>validateForUpdate</code>, <code>validateForSave</code>, and 
 * <code>validateForDelete</code> -- validate an entire object to see if it's valid for a particular operation. These methods are invoked 
 * automatically by the Enterprise Objects Framework when the associated operation is initiated. EOCustomObject and EOGenericRecord provide 
 * default implementations, so you only have to implement them yourself when special validation logic is required. You can override these 
 * methods in your custom enterprise object classes to allow or refuse the operation based on property values. For example, a Fee object might 
 * refuse to be deleted if it hasn't been paid yet. Or you can override these methods to perform delayed validation of properties or to 
 * compare multiple properties against one another; for example, you might verify that a pair of dates is in the proper temporal order.
 * </p><p>
 * If you override any of these operation-specific validation methods, be sure to invoke the super implementation. This is important, as the 
 * default implementations of the validateFor... methods pass the check on to the object's EOClassDescription, which performs basic checking 
 * among properties, including invoking <code>validateValueForKey</code> for each property. The EOAccess layer's EOEntityClassDescription 
 * class verifies constraints based on an EOModel, such as delete rules. For example, the delete rule for a Department object might state 
 * that it can't be deleted if it still contains Employee objects.
 * </p><p>
 * The method <code>validateForSave</code> is the generic validation method for when an object is written to the external store. The default 
 * implementations of <code>validateForInsert</code>, <code>validateForUpdate</code> both invoke it. If an object performs validation that 
 * isn't specific to insertion or to updating, it should go in <code>validateForSave</code>.
 * </p>
 */
public interface EOValidation extends com.webobjects.foundation.NSValidation{
    /**
     * Invoked after an object is being updated from a client application (Java Client) to validate whether the object is in an consistent state 
     * from the server-side perspective. EOCustomObject's implementation does nothing, and should be overridden if necessary.
     */
    abstract void validateClientUpdate() throws com.webobjects.foundation.NSValidation.ValidationException;

    /**
     * <p>
     * Confirms that the receiver can be deleted in its current state, throwing an NSValidation.ValidationException if it can't. For example, 
     * an object can't be deleted if it has a relationship with a delete rule of <code>EOClassDescription.DeleteRuleDeny</code> and that relationship has a 
     * destination object.
     * </p><p>
     * EOCustomObject's implementation sends the receiver's EOClassDescription a message (which performs basic checking based on the presence or 
     * absence of values). Subclasses should invoke the <code>super</code> implementation before performing their own validation, and should combine any 
     * exception thrown by the <code>super</code> implementation with their own.
     */
    abstract void validateForDelete() throws com.webobjects.foundation.NSValidation.ValidationException;

    /**
     * <p>
     * Confirms that the receiver can be inserted in its current state, throwing an NSValidation.ValidationException if it can't. EOCustomObject's 
     * implementation simply invokes <code><validateForSave</code>.
     * </p><p>
     * The method <code>validateForSave</code> is the generic validation method for when an object is written to the external store. If an object 
     * performs validation that isn't specific to insertion, it should go in <code>validateForSave</code>.
     * </p>
     */
    abstract void validateForInsert() throws com.webobjects.foundation.NSValidation.ValidationException;

    /**
     * <p>
     * Confirms that the receiver can be saved in its current state, throwing an NSValidation.ValidationException if it can't. EOCustomObject's 
     * implementation sends the receiver's EOClassDescription a <code>validateObjectForSave</code> message, then iterates through all of the 
     * receiver's properties. If this results in more than one exception, the exception returned contains the additional ones in its 
     * <code>userInfo</code> dictionary under the <code>NSValidation.ValidationException.AdditionalExceptionsKey</code>. Subclasses should 
     * invoke the super implementation before performing their own validation, and should combine any exception thrown by the super implementation 
     * with their own.
     * </p><p>
     * Enterprise objects can implement this method to check that certain relations between properties hold. For example, that the end date of a 
     * vacation period follows the begin date. To validate an individual property, you can simply implement a method for it as described under 
     * NSValidation's <code>validateValueForKey</code>.
     * </p>
     */
    abstract void validateForSave() throws com.webobjects.foundation.NSValidation.ValidationException;

    /**
     * <p>
     * Confirms that the receiver can be updated in its current state, throwing an NSValidation.ValidationException if it can't. EOCustomObject's 
     * implementation simply invokes <code>validateForSave</code>.
     * </p><p>
     * The method <code>validateForSave</code> is the generic validation method for when an object is written to the external store. If an object 
     * performs validation that isn't specific to updating, it should go in <code>validateForSave</code>.
     * </p>
     */
    abstract void validateForUpdate() throws com.webobjects.foundation.NSValidation.ValidationException;
}

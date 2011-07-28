
package com.webobjects.eocontrol;

import com.webobjects.foundation.NSValidation;
import com.webobjects.foundation._NSUtilities;

public interface EOValidation
    extends NSValidation {


    public abstract void validateClientUpdate() throws com.webobjects.foundation.NSValidation.ValidationException;

    public abstract void validateForDelete() throws com.webobjects.foundation.NSValidation.ValidationException;

    public abstract void validateForInsert() throws com.webobjects.foundation.NSValidation.ValidationException;

    public abstract void validateForSave() throws com.webobjects.foundation.NSValidation.ValidationException;

    public abstract void validateForUpdate() throws com.webobjects.foundation.NSValidation.ValidationException;



    public static final Class _CLASS = null;

}

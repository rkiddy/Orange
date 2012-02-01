package com.webobjects.eocontrol;
/**
 * The EOQualifierEvaluation interface defines a method, evaluateWithObject, that performs in memory evaluation of qualifiers. All qualifier classes whose objects can be evaluated in memory must implement this interface.
 * See Also:EOQualifierEvaluation.evaluateWithObject(Object object)
 */
public interface EOQualifierEvaluation{
    /**
     * Returns true if the argument object satisfies the qualifier, false otherwise.
     */
    abstract boolean evaluateWithObject(java.lang.Object object);

}

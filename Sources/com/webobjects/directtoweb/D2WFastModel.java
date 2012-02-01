package com.webobjects.directtoweb;
/**
 * The D2WFastModel class is a D2WModel that is specialized with support for significant keys. Precomputing the significant keys of rules expedites the determination of the rules that can fire in a given context.
 * The current implementation caches the keys in an array of fixed size. Intially, the maximum number of significant keys is 32.
 * The implementation is subject to change in future releases.
 */
public class D2WFastModel extends com.webobjects.directtoweb.D2WModel{
    /**
     * Creates an instance of D2WFastModel with the specified rules.
     * Parameters:rules - instance of NSArraySee Also:D2WModel.D2WModel(NSArray)
     */
    protected D2WFastModel(com.webobjects.foundation.NSArray rules){
         //TODO codavaj!!
    }

    /**
     * Gets the default fast model.
     */
    public static com.webobjects.directtoweb.D2WFastModel defaultFastModel(){
        return null; //TODO codavaj!!
    }

    /**
     * Description copied from class:
     * Fires all candidate rules for the specified key path that can fire in the specified context; aggregates the results of all firings.
     */
    protected java.util.Vector fireAllRulesForKeyPathInContext(java.lang.String keyPath, com.webobjects.directtoweb.D2WContext context){
        return null; //TODO codavaj!!
    }

    /**
     * Description copied from class:
     * Fires the first candidate rule for the specified key path that can fire in the specified context.
     */
    protected java.lang.Object fireRuleForKeyPathInContext(java.lang.String keyPath, com.webobjects.directtoweb.D2WContext context){
        return null; //TODO codavaj!!
    }

    /**
     * Description copied from class:
     * Fires the first candidate rule for the specified key path that can fire in the specified context but is not authored by the Web Assistant.
     */
    protected java.lang.Object fireSystemRuleForKeyPathInContext(java.lang.String keyPath, com.webobjects.directtoweb.D2WContext context){
        return null; //TODO codavaj!!
    }

    /**
     * Clears the local caches of fast left-hand side keys.
     */
    protected void invalidateCaches(){
        return; //TODO codavaj!!
    }

    /**
     * Adds the specified key to the significant keys. Increments the significant key count.
     */
    public static void newSignificantKey(java.lang.String newKey){
        return; //TODO codavaj!!
    }

    /**
     * Gets the current number of significant keys.
     */
    public static short significantKeyCount(){
        return 0; //TODO codavaj!!
    }

    /**
     * Gets the significant keys.
     */
    public static java.lang.String[] significantKeys(){
        return null; //TODO codavaj!!
    }

}

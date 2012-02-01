package com.webobjects.directtoweb;
/**
 * The list of tab names and of tab contents is not a rule firing phenomenon. It is entirely determined by the tab names. But by making it the result of rule firing, we can take advantage of the caching mechanism which we otherwise would have to replicate in the TabInspectPage.
 * See Also:Serialized Form
 */
public class TabDictionaryComputer extends com.webobjects.directtoweb.Assignment{
    /**
     * Constructs a new TabDictionaryComputer based on an EOKeyValueUnarchiver. This is used to read the assignment information from a rule file.
     * Parameters:unarchiver - - the unarchiver.
     */
    public TabDictionaryComputer(com.webobjects.eocontrol.EOKeyValueUnarchiver unarchiver){
         //TODO codavaj!!
    }

    /**
     * Constructs a new TabDictionaryComputer with the specified key path and value.
     * Parameters:keyPath - - the key path.value - - the value.
     */
    public TabDictionaryComputer(java.lang.String keyPath, java.lang.Object value){
         //TODO codavaj!!
    }

    public static java.lang.Object decodeWithKeyValueUnarchiver(com.webobjects.eocontrol.EOKeyValueUnarchiver unarchiver){
        return null; //TODO codavaj!!
    }

    /**
     * Description copied from class:
     * This method is invoked when a rule fires. It returns the right-hand side value (an Object) for a right-hand side key in the Direct to Web context. You can override this method to provide your own assignments.
     */
    public java.lang.Object fire(com.webobjects.directtoweb.D2WContext context){
        return null; //TODO codavaj!!
    }

    /**
     * Tests whether the tab name is the header.
     */
    public boolean tabNameIsInHeader(java.lang.String tabName){
        return false; //TODO codavaj!!
    }

}

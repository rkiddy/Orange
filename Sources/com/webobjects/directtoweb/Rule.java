package com.webobjects.directtoweb;
/**
 * The Rule class represents a simple inference.
 * A rule consists of a left-hand side and right-hand side. The left-hand side is a set of pre-conditions, represented by a qualifier. The right-hand side is a post-condition, represented by an assignment.
 * One rule may take precendence over another, depending on authorship, context, and fit. In general, a more specific rule has higher priority.
 * The D2WModel class makes extensive use of rules.
 * The implementation is subject to change in future releases.
 * See Also:D2WModel, Assignment, EOQualifier, Serialized Form
 */
public class Rule implements java.io.Serializable, com.webobjects.eocontrol.EOKeyValueArchiving{
    /**
     * A key representing the author.
     * In the current implementation, the value is "author".
     * The implementation is subject to change in future releases.
     * See Also:Constant Field Values
     */
    public static final java.lang.String authorKey="author";

    /**
     * A constant denoting authorship by Direct to Web.
     * In the current implementation, the value is the int zero.
     * The implementation is subject to change in future releases.
     * See Also:Rule.author(), Constant Field Values
     */
    public static final int DIRECT_2_WEB=0;

    /**
     * A key representing the left-hand side.
     * In the current implementation, the value is "lhs".
     * The implementation is subject to change in future releases.
     * See Also:Constant Field Values
     */
    public static final java.lang.String lhsKey="lhs";

    /**
     * A key representing the right-hand side.
     * In the current implementation, the value is "rhs".
     * The implementation is subject to change in future releases.
     * See Also:Constant Field Values
     */
    public static final java.lang.String rhsKey="rhs";

    /**
     * A constant denoting authorship by the Web Assistant.
     * In the current implementation, the value is the int 100.
     * The implementation is subject to change in future releases.
     * See Also:Rule.DIRECT_2_WEB, Constant Field Values
     */
    public static final int WEB_ASSISTANT=100;

    /**
     * A constant denoting authorship by the Web Assistant when generating new pageAvailable rules in the user model.
     * In the current implementation, the value is the int 105.
     * The implementation is subject to change in future releases.
     * See Also:Rule.WEB_ASSISTANT, Constant Field Values
     */
    public static final int WEB_ASSISTANT_PAGE_AVAILABLE=105;

    /**
     * Creates an instance of Rule.
     * In the current implementation, the default author is DIRECT_2_WEB, and both the left-hand side and right-hand side remain unassigned. Note: A rule should not be used before the right-hand side is set.
     * The implementation is subject to change in future releases.
     * See Also:Rule.DIRECT_2_WEB, Rule.Rule(int, EOQualifier, Assignment)
     */
    public Rule(){
         //TODO codavaj!!
    }

    /**
     * Creates an instance of Rule with the specified author, left-hand side, and right-hand side.
     * The interface is subject to change in future releases.
     * Parameters:author - instance of Assignmentlhs - instance of EOQualifier Throws: IllegalArgumentException - if right-hand side is nullSee Also:Rule.Rule(), EOQualifier, Assignment
     */
    public Rule(int author, com.webobjects.eocontrol.EOQualifier lhs, com.webobjects.directtoweb.Assignment rhs){
         //TODO codavaj!!
    }

    /**
     * Gets the author.
     */
    public int author(){
        return 0; //TODO codavaj!!
    }

    /**
     * Indicates whether the rule can fire by evaluating the left-hand side with the specified context.
     */
    public boolean canFireInContext(com.webobjects.directtoweb.D2WContext context){
        return false; //TODO codavaj!!
    }

    /**
     * Compares two rules, based on priority.
     */
    public int compareRules(com.webobjects.directtoweb.Rule otherRule){
        return 0; //TODO codavaj!!
    }

    /**
     * Creates an assignment with the specified key path and value. Creates an instance of Assignment if the value starts and ends with a quotation mark; an instance of KeyValueAssignment otherwise.
     */
    public com.webobjects.directtoweb.Assignment createAssignment(java.lang.String keyPath, java.lang.String value){
        return null; //TODO codavaj!!
    }

    /**
     * Gets the set of names of data types involved.
     * The current implementation caches the names. Traverses the left-hand side, looking at EOKeyValueQualifiers that specify a class name.
     * The implementation is subject to change in future releases.
     */
    public java.util.Vector dataTypesInvolved(){
        return null; //TODO codavaj!!
    }

    public static java.lang.Object decodeWithKeyValueUnarchiver(com.webobjects.eocontrol.EOKeyValueUnarchiver unarchiver){
        return null; //TODO codavaj!!
    }

    /**
     * Gets the set of names of dynamic pages involved.
     * The current implementation caches the names. Traverses the left-hand side, looking at EOKeyValueQualifiers that specify a dynamic page.
     * The implementation is subject to change in future releases.
     */
    public java.util.Vector dynamicPagesInvolved(){
        return null; //TODO codavaj!!
    }

    /**
     * Description copied from interface:
     * Asks the receiver to archive its state into the EOKeyValueArchiver archiver.
     */
    public void encodeWithKeyValueArchiver(com.webobjects.eocontrol.EOKeyValueArchiver archiver){
        return; //TODO codavaj!!
    }

    /**
     * Fires the right-hand side with the specified context.
     */
    public java.lang.Object fire(com.webobjects.directtoweb.D2WContext context){
        return null; //TODO codavaj!!
    }

    /**
     * Gets the name of the first dynamic page involved.
     * The current implementation caches the name. Traverses the left-hand side, looking for the first EOKeyValueQualifier that specifies a dynamic page.
     * The implementation is subject to change in future releases.
     */
    public java.lang.String firstDynamicPageNameInvolved(){
        return null; //TODO codavaj!!
    }

    /**
     * Gets the name of the first entity involved.
     * The current implementation caches the name. Traverses the left-hand side, looking for the first EOKeyValueQualifier that specifies an entity.
     * The implementation is subject to change in future releases.
     */
    public java.lang.String firstEntityInvolved(){
        return null; //TODO codavaj!!
    }

    /**
     * Gets the name of the first property key involved.
     * The current implementation caches the name. Traverses the left-hand side, looking for the first EOKeyValueQualifier that specifies a property key.
     * The implementation is subject to change in future releases.
     */
    public java.lang.String firstPropertyKeyInvolved(){
        return null; //TODO codavaj!!
    }

    /**
     * Gets the name of the first task involved.
     * The current implementation caches the name. Traverses the left-hand side, looking for the first EOKeyValueQualifier that specifies a task.
     * The implementation is subject to change in future releases.
     */
    public java.lang.String firstTaskInvolved(){
        return null; //TODO codavaj!!
    }

    /**
     * Compares the rule with the specified settings. Looks only at the first dynamic page involved if the specified flag areSettingsForADynamicPage is true; looks at the first task involved and first entity involved otherwise.
     * If areSettingsForADynamicPage is true, it returns true if firstDynamicPageNameInvolved equals the dynamicPage of settings; false otherwise.
     * If areSettingsForADynamicPage is false, it returns true if firstTaskInvolved and firstEntityInvolved equal the task and entity (respectively) of settings.
     * The current implementation assumes that the rule is of the form (task="xx" and entity="yy"); no EOOrQualifiers.
     * The implementation is subject to change in future releases.
     */
    public boolean hasSameSettingsAs(com.apple.client.directtoweb.common.Settings settings, boolean areSettingsForADynamicPage){
        return false; //TODO codavaj!!
    }

    /**
     * Indicates that a rule involves the assignment of an entity permission.
     */
    public boolean isEntityPermissionRule(){
        return false; //TODO codavaj!!
    }

    /**
     * Indicates that a rule involves the assignment of an entity.
     */
    public boolean isEntityRule(){
        return false; //TODO codavaj!!
    }

    /**
     * Indicates that a rule involves the assignment of a look.
     */
    public boolean isLookRule(){
        return false; //TODO codavaj!!
    }

    /**
     * Indicates that a rule involves the assignment of a start-up task or start-up entity name.
     */
    public boolean isStartupRule(){
        return false; //TODO codavaj!!
    }

    /**
     * Indicates that a rule involves the assignment of a task.
     */
    public boolean isTaskRule(){
        return false; //TODO codavaj!!
    }

    /**
     * Gets the left-hand side.
     */
    public com.webobjects.eocontrol.EOQualifier lhs(){
        return null; //TODO codavaj!!
    }

    /**
     * Gets the priority of the rule. Priority is largely a function of authorship and how specific a rule is.
     * The current implementation caches the value of the priority. A "dummy true" rule has low priority. Dynamic page rules have priority over others. A complex EOAndQualifier is higher than a simple one.
     * The implementation is subject to change in future releases.
     */
    public int priority(){
        return 0; //TODO codavaj!!
    }

    /**
     * Gets the left-hand side.
     */
    public final com.webobjects.directtoweb.Assignment rhs(){
        return null; //TODO codavaj!!
    }

    /**
     * Gets the key path of the right-hand side.
     */
    public final java.lang.String rhsKeyPath(){
        return null; //TODO codavaj!!
    }

    /**
     * Gets the hashcode of the key path of the right-hand side.
     * The current implementation caches the value of the hashcode.
     * The implementation is subject to change in future releases.
     */
    public int rhsKeyPathHash(){
        return 0; //TODO codavaj!!
    }

    /**
     * Sets the left-hand side to the specified value.
     */
    public void setLhs(com.webobjects.eocontrol.EOQualifier newValue){
        return; //TODO codavaj!!
    }

    /**
     * Sets the right-hand side to the specified value.
     */
    public void setRhs(com.webobjects.directtoweb.Assignment newValue){
        return; //TODO codavaj!!
    }

    /**
     * Gets the set of names of tasks involved.
     * The current implementation caches the names. Traverses the left-hand side, looking at EOKeyValueQualifiers that specify a task, for example, task="Edit".
     * The implementation is subject to change in future releases.
     */
    public java.util.Vector tasksInvolved(){
        return null; //TODO codavaj!!
    }

    public java.lang.String toString(){
        return null; //TODO codavaj!!
    }

}

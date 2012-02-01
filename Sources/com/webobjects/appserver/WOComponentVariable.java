package com.webobjects.appserver;
public class WOComponentVariable{
    public WOComponentVariable(java.lang.String name){
         //TODO codavaj!!
    }

    public WOComponentVariable(java.lang.String name, java.lang.Class type){
         //TODO codavaj!!
    }

    public WOComponentVariable(java.lang.String name, java.lang.Class type, com.webobjects.appserver.WOAssociation initialValueAssociation){
         //TODO codavaj!!
    }

    public WOComponentVariable(java.lang.String name, java.lang.Class type, com.webobjects.appserver.WOComponentVariable.WOComponentVariableScope scope, com.webobjects.appserver.WOAssociation initialValue){
         //TODO codavaj!!
    }

    public com.webobjects.appserver.WOAssociation getInitialValueAssociation(){
        return null; //TODO codavaj!!
    }

    public java.lang.String getName(){
        return null; //TODO codavaj!!
    }

    public com.webobjects.appserver.WOComponentVariable.WOComponentVariableScope getScope(){
        return null; //TODO codavaj!!
    }

    public java.lang.Class getType(){
        return null; //TODO codavaj!!
    }

    public void setInitialValueAssociation(com.webobjects.appserver.WOAssociation initialValueAssociation){
        return; //TODO codavaj!!
    }

    public void setName(java.lang.String name){
        return; //TODO codavaj!!
    }

    public void setScope(com.webobjects.appserver.WOComponentVariable.WOComponentVariableScope scope){
        return; //TODO codavaj!!
    }

    public void setType(java.lang.Class type){
        return; //TODO codavaj!!
    }

    /**
     * See Also:Serialized Form
     */
    public static final class WOComponentVariableScope extends java.lang.Enum{
        public static final com.webobjects.appserver.WOComponentVariable.WOComponentVariableScope COMPONENT=null;

        public static final com.webobjects.appserver.WOComponentVariable.WOComponentVariableScope PAGE=null;

        public static final com.webobjects.appserver.WOComponentVariable.WOComponentVariableScope REQUEST=null;

        public static final com.webobjects.appserver.WOComponentVariable.WOComponentVariableScope SESSION=null;

        public static com.webobjects.appserver.WOComponentVariable.WOComponentVariableScope valueOf(java.lang.String name){
            return null; //TODO codavaj!!
        }

        public static final com.webobjects.appserver.WOComponentVariable.WOComponentVariableScope[] values(){
            return null; //TODO codavaj!!
        }

    }
}

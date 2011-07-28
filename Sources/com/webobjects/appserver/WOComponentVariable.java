
package com.webobjects.appserver;



public class WOComponentVariable {
    public static final class WOComponentVariableScope extends Enum {


        public static final WOComponentVariableScope[] values() { return null; }

        public static WOComponentVariableScope valueOf(String name) { return null; }

        private WOComponentVariableScope(String s, int i) { return null; }

        static  {}

        public static final WOComponentVariableScope SESSION;
        public static final WOComponentVariableScope REQUEST;
        public static final WOComponentVariableScope PAGE;
        public static final WOComponentVariableScope COMPONENT;
        private static final WOComponentVariableScope $VALUES[];

    }



    public WOComponentVariable(String name) { return null; }

    public WOComponentVariable(String name, Class type) { return null; }

    public WOComponentVariable(String name, Class type, WOAssociation initialValueAssociation) { return null; }

    public WOComponentVariable(String name, Class type, WOComponentVariableScope scope, WOAssociation initialValue) { return null; }

    public String getName() { return null; }

    public void setName(String name) {}

    public Class getType() { return null; }

    public void setType(Class type) {}

    public WOComponentVariableScope getScope() { return null; }

    public void setScope(WOComponentVariableScope scope) {}

    public WOAssociation getInitialValueAssociation() { return null; }

    public void setInitialValueAssociation(WOAssociation initialValueAssociation) {}

    private String name;
    private Class type;
    private WOComponentVariableScope scope;
    private WOAssociation initialValueAssociation;

}

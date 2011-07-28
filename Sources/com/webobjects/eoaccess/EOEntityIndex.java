
package com.webobjects.eoaccess;

import com.webobjects.foundation.*;
import java.util.Enumeration;
import java.util.Iterator;


public class EOEntityIndex
    implements EOPropertyListEncoding, EOSQLExpression.SQLValue {
    static final class Order extends Enum {


        public static final Order[] values() { return null; }

        public static Order valueOf(String name) { return null; }

        private Order(String s, int i, String name) { return null; }

        public String externalName() { return null; }

        public static Order orderForName(String name) { return null; }

        public String toString() { return null; }

        static  {}

        public static final Order Ascending;
        public static final Order Descending;
        String _externalName;
        private static final Order $VALUES[];

    }

    static final class Type extends Enum {


        public static final Type[] values() { return null; }

        public static Type valueOf(String name) { return null; }

        private Type(String s, int i, String name) { return null; }

        public String externalName() { return null; }

        public static Type typeForName(String name) { return null; }

        public String toString() { return null; }

        static  {}

        public static final Type Clustered;
        public static final Type Hashed;
        String _externalName;
        private static final Type $VALUES[];

    }

    static final class Constraint extends Enum {


        public static final Constraint[] values() { return null; }

        public static Constraint valueOf(String name) { return null; }

        private Constraint(String s, int i, String name) { return null; }

        public String externalName() { return null; }

        public static Constraint constraintForName(String name) { return null; }

        public String toString() { return null; }

        static  {}

        public static final Constraint Unique;
        public static final Constraint FullText;
        public static final Constraint Spatial;
        public static final Constraint Distinct;
        public static final Constraint None;
        String _externalName;
        private static final Constraint $VALUES[];

    }



    public EOEntityIndex() { return null; }

    public EOEntityIndex(NSDictionary plist, EOEntity owner) { return null; }

    public void awakeWithPropertyList(NSDictionary nsdictionary) {}

    public void encodeIntoPropertyList(NSMutableDictionary result) {}

    public String valueForSQLExpression(EOSQLExpression context) { return null; }

    public String name() { return null; }

    public void setName(String name) {}

    public NSArray attributes() { return null; }

    public void setAttributes(NSArray value) {}

    public void addAttribute(EOAttribute attribute) {}

    public void removeAttribute(EOAttribute attribute) {}

    public boolean isEmpty() { return true; }

    public Constraint constraint() { return null; }

    public void setConstraint(Constraint value) {}

    public void setConstraint(String value) {}

    public Type type() { return null; }

    public void setType(Type value) {}

    public void setType(String value) {}

    public Order order() { return null; }

    public void setOrder(Order value) {}

    public void setOrder(String value) {}

    Object parent() { return null; }

    void setParent(Object parent) { return null; }

    public EOEntity entity() { return null; }

    public void setEntity(EOEntity value) {}

    private void _parent_setIsEdited() {}

    private EOEntityIndex _parent_indexNamed(String name) { return null; }

    private void _parent_removeIndex(EOEntityIndex index) {}

    public NSDictionary userInfo() { return null; }

    public void setUserInfo(NSDictionary aDictionary) {}

    private void setUserInfoFromPlist(NSDictionary aDictionary) {}

    public String toString() { return null; }

    public String _toString(int indent) { return null; }

    protected String _name;
    protected EOEntity _parent;
    protected NSMutableArray _attributes;
    protected Constraint _constraint;
    protected Type _type;
    protected Order _order;
    protected NSDictionary _userInfo;

}


package com.webobjects.directtoweb;

import com.apple.client.directtoweb.common.Property;
import com.apple.client.directtoweb.common.Settings;
import com.webobjects.eocontrol.*;
import com.webobjects.foundation.NSArray;
import com.webobjects.foundation.NSLog;
import java.io.Serializable;
import java.util.Vector;


public class Rule
    implements Serializable, EOKeyValueArchiving {


    public Rule() { return null; }

    public Rule(int author, EOQualifier lhs, Assignment rhs) { return null; }

    public static Object decodeWithKeyValueUnarchiver(EOKeyValueUnarchiver unarchiver) { return null; }

    public void encodeWithKeyValueArchiver(EOKeyValueArchiver archiver) {}

    public int author() { return 0; }

    public EOQualifier lhs() { return null; }

    public String _lhsToString() { return null; }

    public void setLhs(EOQualifier newValue) {}

    public final Assignment rhs() { return null; }

    public void setRhs(Assignment newValue) {}

    public final String rhsKeyPath() { return null; }

    public int rhsKeyPathHash() { return 0; }

    public String toString() { return null; }

    public boolean canFireInContext(D2WContext context) { return true; }

    public Object fire(D2WContext context) { return null; }

    public Assignment createAssignment(String keyPath, String value) { return null; }

    public int priority() { return 0; }

    public int compareRules(Rule otherRule) { return 0; }

    public Vector tasksInvolved() { return null; }

    public Vector dynamicPagesInvolved() { return null; }

    public String firstTaskInvolved() { return null; }

    public String firstPropertyKeyInvolved() { return null; }

    public String firstDynamicPageNameInvolved() { return null; }

    public String firstEntityInvolved() { return null; }

    public Vector dataTypesInvolved() { return null; }

    public boolean hasSameSettingsAs(Settings settings, boolean areSettingsForADynamicPage) { return true; }

    public boolean isStartupRule() { return true; }

    public boolean isLookRule() { return true; }

    public boolean isTaskRule() { return true; }

    public boolean isEntityRule() { return true; }

    public boolean isEntityPermissionRule() { return true; }

    public static final String lhsKey = "lhs";
    public static final String rhsKey = "rhs";
    public static final String authorKey = "author";
    private EOQualifier _lhs;
    private Assignment _rhs;
    private int _priority;
    transient String _taskInvolved;
    transient Vector _tasksInvolved;
    transient Vector _dynamicPagesInvolved;
    transient String _firstDynamicPageNameInvolved;
    transient String _entityInvolved;
    transient Vector _dataTypesInvolved;
    transient String _propertyKeyInvolved;
    private int _author;
    private transient String NULL_VALUE;
    public static final int DIRECT_2_WEB = 0;
    public static final int WEB_ASSISTANT = 100;
    public static final int WEB_ASSISTANT_PAGE_AVAILABLE = 105;
    private int _rhsKeyPathHash;


    // Unreferenced inner class com/webobjects/directtoweb/Rule$1

/* anonymous class */
    class _cls1 extends QualifierTraversalCallback {


        _cls1() { return null; }

        public boolean traverseKeyValueQualifier(EOKeyValueQualifier kvq) { return true; }

        final Rule this$0;

    }


    // Unreferenced inner class com/webobjects/directtoweb/Rule$2

/* anonymous class */
    class _cls2 extends QualifierTraversalCallback {


        _cls2() { return null; }

        public boolean traverseKeyValueQualifier(EOKeyValueQualifier kvq) { return true; }

        final Rule this$0;

    }


    // Unreferenced inner class com/webobjects/directtoweb/Rule$3

/* anonymous class */
    class _cls3 extends QualifierTraversalCallback {


        _cls3() { return null; }

        public boolean traverseKeyValueQualifier(EOKeyValueQualifier kvq) { return true; }

        final Rule this$0;

    }


    // Unreferenced inner class com/webobjects/directtoweb/Rule$4

/* anonymous class */
    class _cls4 extends QualifierTraversalCallback {


        _cls4() { return null; }

        public boolean traverseKeyValueQualifier(EOKeyValueQualifier kvq) { return true; }

        final Rule this$0;

    }


    // Unreferenced inner class com/webobjects/directtoweb/Rule$5

/* anonymous class */
    class _cls5 extends QualifierTraversalCallback {


        _cls5() { return null; }

        public boolean traverseKeyValueQualifier(EOKeyValueQualifier kvq) { return true; }

        final Rule this$0;

    }


    // Unreferenced inner class com/webobjects/directtoweb/Rule$6

/* anonymous class */
    class _cls6 extends QualifierTraversalCallback {


        _cls6() { return null; }

        public boolean traverseKeyValueQualifier(EOKeyValueQualifier kvq) { return true; }

        final Rule this$0;

    }


    // Unreferenced inner class com/webobjects/directtoweb/Rule$7

/* anonymous class */
    class _cls7 extends QualifierTraversalCallback {


        _cls7() { return null; }

        public boolean traverseKeyValueQualifier(EOKeyValueQualifier kvq) { return true; }

        final Rule this$0;

    }

}

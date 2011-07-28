
package com.webobjects.foundation;

import java.lang.reflect.InvocationTargetException;


public abstract class NSComparator {
    protected static class _NSSelectorComparator extends NSComparator {


        public _NSSelectorComparator(NSSelector selector) { return null; }

        private void _computeObjectsClassFromObjects(Object object1, Object object2) {}

        public int compare(Object object1, Object object2) throws ComparisonException { return 0; }

        NSSelector _selector;
        Class _objectsClass;

    }

    private static class _TimestampComparator extends NSComparator {


        public _TimestampComparator() { return null; }

        public _TimestampComparator(boolean ascending) { return null; }

        public int compare(Object object1, Object object2) throws ComparisonException { return 0; }

        private boolean _ascending;

    }

    private static class _NumberComparator extends NSComparator {


        public _NumberComparator() { return null; }

        public _NumberComparator(boolean ascending) { return null; }

        public int compare(Object object1, Object object2) throws ComparisonException { return 0; }

        private boolean _ascending;

    }

    private static class _StringComparator extends NSComparator {


        public _StringComparator() { return null; }

        public _StringComparator(boolean ascending, boolean caseInsensitive) { return null; }

        public int compare(Object object1, Object object2) throws ComparisonException { return 0; }

        private boolean _ascending;
        private boolean _caseInsensitive;

    }

    public static class ComparisonException extends Exception {


        public ComparisonException(String message) { return null; }

        private static final long serialVersionUID = 0x6a76fd48L;

    }



    public NSComparator() { return null; }

    public abstract int compare(Object obj, Object obj1) throws ComparisonException;

    public static int _compareObjects(Comparable object1, Comparable object2) { return null; }

    static  {}

    public static final Class _CLASS;
    public static final NSComparator AscendingStringComparator;
    public static final NSComparator DescendingStringComparator;
    public static final NSComparator AscendingCaseInsensitiveStringComparator;
    public static final NSComparator DescendingCaseInsensitiveStringComparator;
    public static final NSComparator AscendingNumberComparator;
    public static final NSComparator DescendingNumberComparator;
    public static final NSComparator AscendingTimestampComparator;
    public static final NSComparator DescendingTimestampComparator;
    public static final int OrderedAscending = -1;
    public static final int OrderedSame = 0;
    public static final int OrderedDescending = 1;

}

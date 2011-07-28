
package com.webobjects.eoaccess;

import com.webobjects.foundation.NSKeyValueCoding;
import com.webobjects.foundation.NSMutableArray;


class _EOExpressionArray extends NSMutableArray
    implements EOSQLExpression.SQLValue {


    private void _setArray(NSMutableArray array) {}

    public _EOExpressionArray(Object object) { return null; }

    public _EOExpressionArray() { return null; }

    public _EOExpressionArray(String prefix, String infix, String suffix) { return null; }

    private void _initWithPrefixInfixSuffix(String prefix, String infix, String suffix) {}

    public String prefix() { return null; }

    public String infix() { return null; }

    public String suffix() { return null; }

    public void setPrefix(String prefix) {}

    public void setInfix(String infix) {}

    public void setSuffix(String suffix) {}

    public boolean referencesObject(Object object) { return true; }

    public int count() { return 0; }

    public Object objectAtIndex(int index) { return null; }

    public void addObject(Object anObject) {}

    public Object replaceObjectAtIndex(Object object, int index) { return null; }

    public Object lastObject() { return null; }

    public Object removeLastObject() { return null; }

    public void insertObjectAtIndex(Object object, int index) {}

    public Object removeObjectAtIndex(int index) { return null; }

    public Object clone() { return null; }

    public String toString() { return null; }

    public String valueForSQLExpression(EOSQLExpression context) { return null; }

    public String valueForSQLExpression(Object expression, EOSQLExpression context) { return null; }

    public boolean _isPropertyPath() { return true; }

    static final long serialVersionUID = 0x12e1f0a9L;
    private static final int _DefaultExpressionLength = 64;
    protected String _prefix;
    protected String _infix;
    protected String _suffix;
    protected NSMutableArray _array;

}

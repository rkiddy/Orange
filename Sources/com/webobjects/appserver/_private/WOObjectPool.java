
package com.webobjects.appserver._private;

import com.webobjects.foundation.NSArray;
import com.webobjects.foundation.NSDisposable;

public abstract class WOObjectPool {


    public WOObjectPool(int size) { return null; }

    public abstract NSDisposable newInstance();

    public abstract String highWaterMarkPropertyKey();

    public int highWaterMarkSize() { return 0; }

    public void resize() {}

    private void _initObjects(int offset, int length) {}

    public void dispose() {}

    public NSDisposable nextInstance() { return null; }

    private void _freeInstanceAtIndex(int i) {}

    public void freeInstance(Object elt) {}

    public void freeLastInstance() {}

    public void freeInstances(NSArray objects) {}

    public int instancesCount() { return 0; }

    public String toString() { return null; }

    private NSDisposable _objects[];
    private int _index;
    private int highWaterMarkSize;

}


package com.webobjects.eoaccess;

import com.webobjects.eocontrol.EOEditingContext;
import com.webobjects.eocontrol.EOFaultHandler;
import java.lang.ref.ReferenceQueue;
import java.lang.ref.WeakReference;


public abstract class EOAccessGenericFaultHandler extends EOFaultHandler {
    private class _EOHandlerWeakRef extends WeakReference {


        public _EOHandlerWeakRef(Object obj, ReferenceQueue queue, EOAccessGenericFaultHandler handler) { return null; }

        public EOAccessGenericFaultHandler _handler;
        final EOAccessGenericFaultHandler this$0;

    }



    public EOAccessGenericFaultHandler() { return null; }

    public static void processQueue(ReferenceQueue refQueue) { return null; }

    public synchronized void linkAfterHandler(EOAccessGenericFaultHandler faultHandler, int generation) { return null; }

    public EOAccessGenericFaultHandler next() { return null; }

    public EOAccessGenericFaultHandler previous() { return null; }

    public int generation() { return 0; }

    protected synchronized void _removeThisLink() { return null; }

    public void faultWillFire(Object object) {}

    public abstract void completeInitializationOfObject(Object obj);

    public EODatabaseContext databaseContext() { return null; }

    protected void setContext(EODatabaseContext dbcontext, EOEditingContext ec) {}

    public EOEditingContext editingContext() { return null; }

    protected int _generation;
    protected EODatabaseContext _databaseContext;
    private WeakReference _weakRefEC;
    private EOAccessGenericFaultHandler _next;
    private EOAccessGenericFaultHandler _prev;

}


package com.webobjects.jndiadaptor;

import com.webobjects.eoaccess.EOEntity;
import com.webobjects.eocontrol.EOFetchSpecification;
import com.webobjects.foundation.*;
import javax.naming.NamingEnumeration;
import javax.naming.NamingException;
import javax.naming.directory.InitialDirContext;
import javax.naming.directory.SearchResult;


abstract class _JNDIWorker {


    public _JNDIWorker(JNDIChannel channel) { return null; }

    protected void finalize() throws Throwable {}

    public final InitialDirContext initialDirContext() { return null; }

    public final JNDIPlugIn plugIn() { return null; }

    public final synchronized void setAttributes(NSArray eoattributes) { return null; }

    public final synchronized NSArray attributes() { return null; }

    public final synchronized void setEntity(EOEntity entity) { return null; }

    public final synchronized EOEntity entity() { return null; }

    public final synchronized void setRow(NSDictionary row) { return null; }

    public final synchronized NSDictionary row() { return null; }

    public final synchronized void setFetchSpecification(EOFetchSpecification fetchSpecification) { return null; }

    public final synchronized EOFetchSpecification fetchSpecification() { return null; }

    public final synchronized boolean isWorking() { return null; }

    public final synchronized boolean isDone() { return null; }

    public final synchronized void apply() { return null; }

    protected void doApply() {}

    public final synchronized Object[] next() { return null; }

    protected Object[] doNext() { return null; }

    protected abstract Object[] values(SearchResult searchresult);

    public final synchronized void cancel() { return null; }

    private final JNDIChannel _channel;
    private InitialDirContext _idc;
    private JNDIAdaptor._Environment _environment;
    private JNDIPlugIn _plugIn;
    private NSArray _eoattributes;
    private EOEntity _entity;
    private NSDictionary _row;
    private EOFetchSpecification _fetchSpecification;
    private volatile NamingEnumeration _results;
    private volatile String _base;


    // Unreferenced inner class com/webobjects/jndiadaptor/_JNDIWorker$1

/* anonymous class */
    class _cls1
        implements JNDIPlugIn.ChannelOperation {


        _cls1() { return null; }

        public Object performOperation() { return null; }

        final _JNDIWorker this$0;

    }


    // Unreferenced inner class com/webobjects/jndiadaptor/_JNDIWorker$2

/* anonymous class */
    class _cls2
        implements JNDIPlugIn.ChannelOperation {


        _cls2() { return null; }

        public Object performOperation() { return null; }

        final _JNDIWorker this$0;

    }

}

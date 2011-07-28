
package com.webobjects.jndiadaptor;

import com.webobjects.eoaccess.*;
import com.webobjects.eocontrol.EOEnterpriseObject;
import com.webobjects.foundation.*;
import javax.naming.NamingException;
import javax.naming.directory.InitialDirContext;


public class JNDIContext extends EOAdaptorContext {
    class _ChannelFactory extends _EOCachedObjectFactory {


        _ChannelFactory() { return null; }

        public JNDIChannel createChannel() { return null; }

        public JNDIChannel createCachedChannel() { return null; }

        protected Object doCreate() { return null; }

        final JNDIContext this$0;

    }



    public JNDIContext(EOAdaptor adaptor) { return null; }

    private JNDIAdaptor _adaptor() { return null; }

    JNDIAdaptor._Environment _environment() { return null; }

    JNDIPlugIn _plugIn() { return null; }

    public InitialDirContext initialDirContext() { return null; }

    boolean _isConnected() { return null; }

    protected void _channelWillOpen() {}

    protected void _channelDidClose() {}

    protected void _tryConnect() {}

    protected synchronized void _connect() { return null; }

    protected synchronized void _disconnect() { return null; }

    public void handleDroppedConnection() {}

    public NSDictionary _newPrimaryKey(EOEnterpriseObject enterpriseObject, EOEntity entity) { return null; }

    public void beginTransaction() {}

    public void commitTransaction() {}

    public void rollbackTransaction() {}

    public EOAdaptorChannel createAdaptorChannel() { return null; }

    protected JNDIChannel _createCachedAdaptorChannel() { return null; }

    JNDIChannel _doCreateAdaptorChannel() { return null; }

    private final _ChannelFactory _channelFactory;
    private InitialDirContext _idc;

}

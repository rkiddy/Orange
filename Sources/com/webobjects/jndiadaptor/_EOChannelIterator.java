
package com.webobjects.jndiadaptor;

import com.webobjects.eocontrol.EOFetchSpecification;


interface _EOChannelIterator
    extends _EOChannelWorker {

    public abstract void setFetchSpecification(EOFetchSpecification eofetchspecification);

    public abstract EOFetchSpecification fetchSpecification();

    public abstract boolean isWorking();

    public abstract boolean isDone();

    public abstract Object[] next();

    public abstract void cancel();
}

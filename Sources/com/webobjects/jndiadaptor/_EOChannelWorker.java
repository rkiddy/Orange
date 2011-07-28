
package com.webobjects.jndiadaptor;

import com.webobjects.eoaccess.EOEntity;
import com.webobjects.foundation.NSArray;

interface _EOChannelWorker {

    public abstract void setAttributes(NSArray nsarray);

    public abstract NSArray attributes();

    public abstract void setEntity(EOEntity eoentity);

    public abstract EOEntity entity();

    public abstract void apply();
}

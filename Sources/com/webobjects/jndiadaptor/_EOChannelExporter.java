
package com.webobjects.jndiadaptor;

import com.webobjects.foundation.NSDictionary;


interface _EOChannelExporter
    extends _EOChannelWorker {

    public abstract void setRow(NSDictionary nsdictionary);

    public abstract NSDictionary row();
}

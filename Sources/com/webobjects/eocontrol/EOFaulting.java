
package com.webobjects.eocontrol;

import com.webobjects.foundation._NSUtilities;


public interface EOFaulting {


    public abstract void willRead();

    public abstract boolean isFault();

    public abstract void clearFault();

    public abstract void turnIntoFault(EOFaultHandler eofaulthandler);

    public abstract EOFaultHandler faultHandler();



    public static final Class _CLASS = null;

}

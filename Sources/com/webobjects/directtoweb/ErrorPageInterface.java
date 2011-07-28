
package com.webobjects.directtoweb;

import com.webobjects.appserver.WOComponent;

public interface ErrorPageInterface {

    public abstract void setMessage(String s);

    public abstract void setNextPage(WOComponent wocomponent);
}

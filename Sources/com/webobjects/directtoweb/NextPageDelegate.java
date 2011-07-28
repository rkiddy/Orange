
package com.webobjects.directtoweb;

import com.webobjects.appserver.WOComponent;

public interface NextPageDelegate {

    public abstract WOComponent nextPage(WOComponent wocomponent);
}


package com.webobjects.directtoweb;



public interface ConfirmPageInterface {

    public abstract void setConfirmDelegate(NextPageDelegate nextpagedelegate);

    public abstract void setCancelDelegate(NextPageDelegate nextpagedelegate);

    public abstract void setMessage(String s);
}

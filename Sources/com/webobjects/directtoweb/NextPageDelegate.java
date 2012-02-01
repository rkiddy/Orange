package com.webobjects.directtoweb;
/**
 * This interface defines the nextPage method that a Direct to Web template can invoke in its next page delegate. See the "Customizing a Direct to Web Application" chapter of "Developing WebObjects Applications With Direct to Web" for more information about using the next page delegate.
 */
public interface NextPageDelegate{
    /**
     * This action method is invoked when the user leaves a Direct to Web page. It returns the next page (a WOComponent object) to display. If this method is not implemented, the sender is redisplayed.
     */
    abstract com.webobjects.appserver.WOComponent nextPage(com.webobjects.appserver.WOComponent sender);

}

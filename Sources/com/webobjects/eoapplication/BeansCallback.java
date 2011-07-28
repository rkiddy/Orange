
package com.webobjects.eoapplication;

import java.applet.Applet;
import java.awt.Component;
import java.util.Date;


class BeansCallback
    implements _EOTimer.Callback {


    BeansCallback(Object bean) { return null; }

    public void timerFired(_EOTimer timer, Date date, Date lastFireDate) {}

    Object targetBean;

}

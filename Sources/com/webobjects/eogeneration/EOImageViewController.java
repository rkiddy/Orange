
package com.webobjects.eogeneration;

import com.webobjects.eoapplication.*;
import com.webobjects.eointerface.*;
import com.webobjects.eointerface.swing.EOImageView;
import com.webobjects.foundation.NSMutableDictionary;
import com.webobjects.foundation._NSUtilities;
import javax.swing.JComponent;


public class EOImageViewController extends EOValueAndURLController {


    public EOImageViewController() { return null; }

    public EOImageViewController(EOXMLUnarchiver unarchiver) { return null; }

    public NSMutableDictionary _xmlParameters() { return null; }

    protected boolean _preferredCanResizeVertically() { return true; }

    public void setImageScaling(int imageScaling) {}

    public int imageScaling() { return 0; }

    public void setScalingHints(int scalingHints) {}

    public int scalingHints() { return 0; }

    protected JComponent newWidget() { return null; }

    protected EOAssociation newAssociation(JComponent widget, EODisplayGroup displayGroup, String enabledKey, EODisplayGroup enabledDisplayGroup) { return null; }

    static  {}

    public static final Class _CLASS;
    private int _imageScaling;
    private int _scalingHints;

}

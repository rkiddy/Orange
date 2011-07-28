
package com.webobjects.appserver._private;

import com.webobjects.foundation.NSMutableArray;


public class WOCircularRegion extends WOGeometricRegion {


    public WOCircularRegion(String aShape, NSMutableArray coordinates, String aString) { return null; }

    public boolean hitTest(int anXCoord, int aYCoord) { return true; }

    protected String _subclassDescription() { return null; }

    WOPoint _origin;
    WOPoint _edgePoint;

}

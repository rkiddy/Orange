
package com.webobjects.appserver._private;

import com.webobjects.foundation.NSMutableArray;


public class WORectangularRegion extends WOGeometricRegion {


    public WORectangularRegion(String aShape, NSMutableArray coordinates, String aString) { return null; }

    public boolean hitTest(int anXCoord, int aYCoord) { return true; }

    protected String _subclassDescription() { return null; }

    WOPoint _origin;
    WOSize _size;

}

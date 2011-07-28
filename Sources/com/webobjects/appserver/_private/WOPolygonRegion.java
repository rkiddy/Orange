
package com.webobjects.appserver._private;

import com.webobjects.foundation.NSMutableArray;


public class WOPolygonRegion extends WOGeometricRegion {


    public WOPolygonRegion(String aShape, NSMutableArray coordinates, String aString) { return null; }

    public boolean hitTest(int xClicked, int yClicked) { return true; }

    protected String _subclassDescription() { return null; }

    int _size;
    private int _maxIndex;
    double _slopes[];
    double _intercepts[];
    int _points[][];
    private WOPoint _topLeft;
    private WOPoint _bottomRight;
    private static final int MAXVERTS = 100;
    private static final int X = 0;
    private static final int Y = 1;

}

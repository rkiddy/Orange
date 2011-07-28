
package com.webobjects.eointerface.swing;

import com.webobjects.foundation.*;
import java.awt.Component;
import java.awt.Dimension;
import java.lang.reflect.*;
import javax.swing.JPanel;

public class EOQuickTimeView extends JPanel {


    public static boolean isQuickTimeAvailable() { return null; }

    public EOQuickTimeView() { return null; }

    public void setBounds(int x, int y, int width, int height) {}

    public Dimension getPreferredSize() { return null; }

    public void setCanvasResizing(int canvasResizing) {}

    public int canvasResizing() { return 0; }

    public void setMovieFromURL(String url) {}

    public void setMovie(Object movie) {}

    public Object movie() { return null; }

    private void _setPlayer(Object player) {}

    public void setPlayer(Object player) {}

    public Object player() { return null; }

    static  {}

    private static final long serialVersionUID = 0x78e15e45L;
    public static final Class _CLASS;
    private static final Float _oneHalfFloat;
    private static boolean _isQuickTimeAvailabilityTested;
    private static boolean _isQuickTimeAvailable;
    private static Class _sessionClass;
    private static Class _movieClass;
    private static Class _controllerClass;
    private static Class _canvasClass;
    private static Class _playerClass;
    private static Class _drawableClass;
    private static Class _dataRefClass;
    private static Class _QTConstantsClass;
    private static Class _QTExceptionClass;
    private static Method _sessionOpen;
    private static Method _sessionClose;
    private static Constructor _canvasConstructor;
    private static Method _canvasSetClient;
    private static Method _canvasSetResizeFlag;
    private static Method _canvasRemoveClient;
    private static Constructor _controllerConstructor;
    private static Method _controllerSetKeysEnabled;
    private static Constructor _playerContructor;
    private static Method _movieFromDataRef;
    private static Constructor _dataRefConstructor;
    private static int _kAspectResize;
    private static int _kFreeResize;
    private static int _kHorizontalResize;
    private static int _kInitialSize;
    private static int _kIntegralResize;
    private static int _kPerformanceResize;
    private static int _kVerticalResize;
    private static int _newMovieActive;
    private static Object _emptyObjectArray[];
    private static Class _emptyClassArray[];
    public static final int QuickTimeCanvasNoResizing = 0;
    public static final int QuickTimeCanvasAspectResizing = 1;
    public static final int QuickTimeCanvasFreeResizing = 2;
    public static final int QuickTimeCanvasIntegralResizing = 3;
    public static final int QuickTimeCanvasPerformanceResizing = 4;
    public static final int QuickTimeCanvasHorizontalResizing = 5;
    public static final int QuickTimeCanvasVerticalResizing = 6;
    private Component _canvas;
    private int _canvasResizing;
    private Object _player;
    private Object _movie;

}

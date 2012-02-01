package com.webobjects.eointerface.swing;
/**
 * The EOQuickTimeView class is used to display QuickTime movies (or other QuickTime playe types) in Swing user interfaces. Note that you have to make sure that the QuickTime for Java classes are available in your appliation (in the classpath). EOQuickTimeView is designed to make use of QuickTime for Java if available and to show an empty content otherwise.
 * See Also:Serialized Form
 */
public class EOQuickTimeView extends javax.swing.JPanel{
    /**
     * This constant is used to specify that the QuickTime canvas should resize to fill out EOQuickTimeView component size while preserving the aspect ratio of the canvas.
     * See Also:Constant Field Values
     */
    public static final int QuickTimeCanvasAspectResizing=1;

    /**
     * This constant is used to specify that the QuickTime canvas should resize freely with the EOQuickTimeView component size.
     * See Also:Constant Field Values
     */
    public static final int QuickTimeCanvasFreeResizing=2;

    /**
     * This constant is used to specify that the QuickTime canvas should resize horizontally with the EOQuickTimeView component size.
     * See Also:Constant Field Values
     */
    public static final int QuickTimeCanvasHorizontalResizing=5;

    /**
     * This constant is used to specify that the QuickTime canvas should resize to fill out EOQuickTimeView component size while preserving the aspect ratio of the canvas and only growing by integral increments (2x, 3x, 4x, etc.).
     * See Also:Constant Field Values
     */
    public static final int QuickTimeCanvasIntegralResizing=3;

    /**
     * This constant is used to specify that the QuickTime canvas should not resize with the EOQuickTimeView component size.
     * See Also:Constant Field Values
     */
    public static final int QuickTimeCanvasNoResizing=0;

    /**
     * This constant is used to specify that the QuickTime canvas should resize with the EOQuickTimeView component size to any size which is a factor of 2 of the initial canvas size.
     * See Also:Constant Field Values
     */
    public static final int QuickTimeCanvasPerformanceResizing=4;

    /**
     * This constant is used to specify that the QuickTime canvas should resize vertically with the EOQuickTimeView component size.
     * See Also:Constant Field Values
     */
    public static final int QuickTimeCanvasVerticalResizing=6;

    /**
     * Constructs a new EOQuickTimeView with EOQuickTimeView.QuickTimeCanvasNoResizing canvas resizing mode.
     * See Also:EOQuickTimeView.QuickTimeCanvasNoResizing
     */
    public EOQuickTimeView(){
         //TODO codavaj!!
    }

    /**
     * Returns the receiver's canvas resizing mode. Possible values are QuickTimeCanvasNoResizing, QuickTimeCanvasAspectResizing, QuickTimeCanvasFreeResizing, QuickTimeCanvasIntegralResizing, QuickTimeCanvasPerformanceResizing, QuickTimeCanvasHorizontalResizing, and QuickTimeCanvasVerticalResizing.
     */
    public int canvasResizing(){
        return 0; //TODO codavaj!!
    }

    /**
     * Returns the preferred size of the receiver.
     */
    public java.awt.Dimension getPreferredSize(){
        return null; //TODO codavaj!!
    }

    /**
     * Returns whether or not the QuickTime for Java classes are available in the application (in the class path and loaded). If the classes are in the class path but aren't loaded, this method attempts to load them.
     */
    public static boolean isQuickTimeAvailable(){
        return false; //TODO codavaj!!
    }

    /**
     * Returns the movie displayed in the EOQuickTimeView. The movie is an instance of the quicktime.std.movies.Movie class
     */
    public java.lang.Object movie(){
        return null; //TODO codavaj!!
    }

    /**
     * Returns the player displayed in the EOQuickTimeView. The player is an instance of the quicktime.app.players.QTPlayer class.
     */
    public java.lang.Object player(){
        return null; //TODO codavaj!!
    }

    /**
     * Sets the receiver's bounds.
     */
    public void setBounds(int x, int y, int width, int height){
        return; //TODO codavaj!!
    }

    /**
     * Sets the receiver's canvas resizing mode to canvasResizing. Possible values are QuickTimeCanvasNoResizing, QuickTimeCanvasAspectResizing, QuickTimeCanvasFreeResizing, QuickTimeCanvasIntegralResizing, QuickTimeCanvasPerformanceResizing, QuickTimeCanvasHorizontalResizing, and QuickTimeCanvasVerticalResizing.
     */
    public void setCanvasResizing(int canvasResizing){
        return; //TODO codavaj!!
    }

    /**
     * Displays the movie movie in the EOQuickTimeView. movie has to be an instance of the quicktime.std.movies.Movie class.
     */
    public void setMovie(java.lang.Object movie){
        return; //TODO codavaj!!
    }

    /**
     * Loads a movie from the URL url and displays it in the EOQuickTimeView.
     */
    public void setMovieFromURL(java.lang.String url){
        return; //TODO codavaj!!
    }

    /**
     * Displays the movie player in the EOQuickTimeView. player has to be an instance of the quicktime.app.players.QTPlayer class.
     */
    public void setPlayer(java.lang.Object player){
        return; //TODO codavaj!!
    }

}

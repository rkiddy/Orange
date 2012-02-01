package com.webobjects.eointerface.swing;
/**
 * The EOImageView class is used to display images (java.awt.Image objects) in Swing user interfaces.
 * See Also:Serialized Form
 */
public class EOImageView extends javax.swing.JComponent{
    /**
     * This constant is used to specify that images should not be scaled depending on the component size.
     * See Also:Constant Field Values
     */
    public static final int ScaleNone=0;

    /**
     * This constant is used to specify that images should be scaled proportionally to the component size.
     * See Also:Constant Field Values
     */
    public static final int ScaleProportionally=1;

    /**
     * This constant is used to specify that images should be scaled to proportionally so that the larger dimension fits the component size.
     * See Also:Constant Field Values
     */
    public static final int ScaleProportionallyIfTooLarge=3;

    /**
     * This constant is used to specify that images should be scaled to fit exactly the component size.
     * See Also:Constant Field Values
     */
    public static final int ScaleToFit=2;

    /**
     * Constructs a new EOImageView with ScaleProportionallyIfTooLarge scaling and java.awt.Image.SCALE_SMOOTH scaling hints.
     * See Also:EOImageView.ScaleProportionallyIfTooLarge, Image.SCALE_SMOOTH
     */
    public EOImageView(){
         //TODO codavaj!!
    }

    /**
     * Returns the receiver's image.
     */
    public java.awt.Image image(){
        return null; //TODO codavaj!!
    }

    /**
     * Returns the receiver's image scaling mode. Possible values are ScaleNone, ScaleProportionally, ScaleToFit, and ScaleProportionallyIfTooLarge.
     */
    public int imageScaling(){
        return 0; //TODO codavaj!!
    }

    /**
     * Repaints the receiver if the image has changes (for example when scaling).
     */
    public boolean imageUpdate(java.awt.Image image, int flags, int x, int y, int width, int height){
        return false; //TODO codavaj!!
    }

    /**
     * Paints the image view.
     */
    public void paint(java.awt.Graphics graphics){
        return; //TODO codavaj!!
    }

    /**
     * Returns the receiver's image scaling hints. See the java.awt.Image class for possible values of scaling hints like Image.SCALE_SMOOTH or Image.SCALE_FAST.
     */
    public int scalingHints(){
        return 0; //TODO codavaj!!
    }

    /**
     * Sets the receiver's border to border.
     */
    public void setBorder(javax.swing.border.Border border){
        return; //TODO codavaj!!
    }

    /**
     * Sets the receiver's bounds.
     */
    public void setBounds(int x, int y, int width, int height){
        return; //TODO codavaj!!
    }

    /**
     * Sets the receiver's image to image and repaints if necessary.
     */
    public void setImage(java.awt.Image image){
        return; //TODO codavaj!!
    }

    /**
     * Sets the receiver's image scaling mode to imageScaling. Possible values are ScaleNone, ScaleProportionally, ScaleToFit, and ScaleProportionallyIfTooLarge.
     */
    public void setImageScaling(int imageScaling){
        return; //TODO codavaj!!
    }

    /**
     * Sets the receiver's image scaling hints to scalingHints. See the java.awt.Image class for possible values of scaling hints like Image.SCALE_SMOOTH or Image.SCALE_FAST.
     */
    public void setScalingHints(int scalingHints){
        return; //TODO codavaj!!
    }

}

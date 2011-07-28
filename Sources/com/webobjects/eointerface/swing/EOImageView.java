
package com.webobjects.eointerface.swing;

import com.webobjects.foundation._NSUtilities;
import java.awt.*;
import javax.swing.BorderFactory;
import javax.swing.JComponent;
import javax.swing.border.Border;

public class EOImageView extends JComponent {


    public EOImageView() { return null; }

    private void _updateDrawingImage() {}

    public void paint(Graphics graphics) {}

    public void setImage(Image image) {}

    public Image image() { return null; }

    public boolean imageUpdate(Image image, int flags, int x, int y, int width, int height) { return true; }

    public void setBounds(int x, int y, int width, int height) {}

    public void setBorder(Border border) {}

    public void setImageScaling(int imageScaling) {}

    public int imageScaling() { return 0; }

    public void setScalingHints(int scalingHints) {}

    public int scalingHints() { return 0; }

    static  {}

    private static final long serialVersionUID = 0x4a3940e8L;
    public static final Class _CLASS;
    public static final int ScaleNone = 0;
    public static final int ScaleProportionally = 1;
    public static final int ScaleToFit = 2;
    public static final int ScaleProportionallyIfTooLarge = 3;
    private Image _image;
    private int _imageScaling;
    private int _scalingHints;
    private Image _drawingImage;
    private int _drawingImageX;
    private int _drawingImageY;

}


package com.webobjects.eoapplication;

import com.webobjects.eointerface.swing.EOSwingUtilities;
import com.webobjects.eointerface.swing.EOViewLayout;
import com.webobjects.foundation.NSMutableDictionary;
import com.webobjects.foundation._NSUtilities;
import java.awt.*;
import javax.swing.BorderFactory;
import javax.swing.JComponent;
import javax.swing.border.*;


public class EOBoxController extends EOComponentController {
    private static class _TitledBorder extends AbstractBorder {


        public _TitledBorder(Border border, String title, Font titleFont, Color titleColor, int titlePosition) { return null; }

        public int getTitleWidth(Component component) { return 0; }

        public void paintBorder(Component component, Graphics graphics, int x, int y, int width, int height) {}

        public Insets getBorderInsets(Component component) { return null; }

        public boolean isBorderOpaque() { return true; }

        private String _title;
        private Border _border;
        private Font _titleFont;
        private Color _titleColor;
        private int _titlePosition;

    }



    public EOBoxController() { return null; }

    public EOBoxController(EOXMLUnarchiver unarchiver) { return null; }

    public NSMutableDictionary _xmlParameters() { return null; }

    public void setBorderType(int type) {}

    public int borderType() { return 0; }

    public void setUsesTitledBorder(boolean flag) {}

    public boolean usesTitledBorder() { return true; }

    public void setHighlightsTitle(boolean flag) {}

    public boolean highlightsTitle() { return true; }

    public void setTitlePosition(int position) {}

    public int titlePosition() { return 0; }

    public void setTitleColor(Color color) {}

    public Color titleColor() { return null; }

    public void setTitleFont(Font font) {}

    public Font titleFont() { return null; }

    protected Insets _preferredInsets() { return null; }

    protected void generateComponent() {}

    static  {}

    public static final Class _CLASS;
    public static final int NoBorder = 0;
    public static final int EtchedBorder = 1;
    public static final int RaisedBezelBorder = 2;
    public static final int LoweredBezelBorder = 3;
    public static final int LineBorder = 4;
    private int _borderType;
    private boolean _usesTitledBorder;
    private boolean _highlightsTitle;
    private int _titlePosition;
    private Color _titleColor;
    private Font _titleFont;

}

import java.awt.*;
import javax.swing.JPanel;

public class TreePanel
{
    private final int PANEL_WIDTH = 400;
    private final int PANEL_HEIGHT = 400;

    private final double SQ = Math.sqrt(3.0) / 6;

    private final int TOPX = 200, TOPY = 20;
    private final int LEFTX = 60, LEFTY = 300;
    private final int RIGHTX = 340, RIGHTY = 300;

    private int current; //current order
    /**
     * Default constructor for objects of class TreePanel
     */
    public TreePanel()
    {
       current = currentOrder;
      setBackground (Color.black);
      setPreferredSize (new Dimension(PANEL_WIDTH, PANEL_HEIGHT));
    }

   
    public int drawFractal(int order, int x1, int y1, int x5, int y5,
                            Graphics page)
    {
        int deltaX, deltaY, xStart, yStart, xEnd, yEnd, xNew, yNew;
        
    }

}

import java.awt.*;
import javax.swing.*;

public class TreeViewer
{
    private final int WIDTH = 400;
    private final int HEIGHT = 500;
    
    private JLabel titleLabel, orderLabel;
    private TreePanel drawing;
    private JPanel panel, tools;
    private JFrame frame;

    public static void main(String[] args)
    {
        TreeViewer viewer = new TreeViewer();
    }

    public TreeViewer(int order, int x1, int y1, int x5, int y5,
                            Graphics page)
    {
        orderLabel = new JLabel ("Order: 1");
        orderLabel.setForeground (Color.black);

        drawing = new TreePanel (1);

        panel = new JPanel();
        panel.add (tools);
        panel.add (drawing);

        frame = new JFrame();
        frame.setTitle("Knoch Snowflake");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(WIDTH, HEIGHT);
        frame.add(panel);
        frame.setVisible(true);
    }

}

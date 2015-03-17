
public class LogSpiralViewer
{
    public int sampleMethod(int y)
    {
        JFrame frame = new JFrame();
        
        frame.setSize(1500, 800, 0,0);
        frame.setTitle("Fibonazi");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
        LogSpiralPanel p1 = new LogSpiralPanel();
        frame.add(p1);
        
        p1.recursiveDraw(750.0, 400.0, 34.0, 90);
        
    }

}

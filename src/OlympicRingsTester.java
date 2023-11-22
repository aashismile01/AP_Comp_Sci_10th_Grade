import javax.swing.JFrame;

public class OlympicRingsTester
{
    public static void main(String [] args)
    {
        JFrame frame = new JFrame();
        frame.setSize(600, 800);
        frame.setTitle("Olympic Rings");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
        OlympicRingsComponent olympicrings = new OlympicRingsComponent();
        frame.add(olympicrings);
        frame.setVisible(true);
    }
}
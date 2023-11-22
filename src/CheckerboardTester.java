import javax.swing.JFrame;

public class CheckerboardTester 
{
	public static void main(String[] args) 
	{
		JFrame frame = new JFrame();
		frame.setSize(600, 800);
		frame.setTitle("Checkerboard Component");
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		CheckerboardComponent checkerboard = new CheckerboardComponent();
		frame.add(checkerboard);
		frame.setVisible(true);
	}
}
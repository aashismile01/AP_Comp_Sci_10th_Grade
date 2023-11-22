import javax.swing.JFrame;
public class BullsEyeTester
{
	public static void main(String [] args)
	{
		JFrame frame = new JFrame();
		frame.setSize(800, 1000);
		frame.setTitle("Bulls Eye");
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		BullsEyeComponent bullseye = new BullsEyeComponent();
		frame.add(bullseye);
		frame.setVisible(true);
	}
}

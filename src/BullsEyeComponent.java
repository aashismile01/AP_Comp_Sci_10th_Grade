import java.awt.geom.Ellipse2D;
import java.awt.Graphics;
import java.awt.Graphics2D;
import javax.swing.JComponent;
import java.awt.Color;


public class BullsEyeComponent extends JComponent
{
	public void paintComponent(Graphics g) 
	{
		Graphics2D g2 = (Graphics2D) g;

		Ellipse2D ellipse = new Ellipse2D.Double(300.0, 400.0, 125.0, 125.0);
		g2.draw(ellipse);
		g2.setColor(Color.WHITE);
		g2.fill(ellipse);

		Ellipse2D ellipse2 = new Ellipse2D.Double(312.0, 412.0, 100.0, 100.0);
		g2.draw(ellipse2);
		g2.setColor(Color.BLACK);
		g2.fill(ellipse2);

		Ellipse2D ellipse3 = new Ellipse2D.Double(324.0, 424.0, 75.0, 75.0);
		g2.draw(ellipse3);
		g2.setColor(Color.CYAN);
		g2.fill(ellipse3);

		Ellipse2D ellipse4 = new Ellipse2D.Double(336.0, 436.0, 50.0, 50.0);
		g2.draw(ellipse4);
		g2.setColor(Color.RED);
		g2.fill(ellipse4);

		Ellipse2D ellipse5 = new Ellipse2D.Double(348.0, 448.0, 25.0, 25.0);
		g2.draw(ellipse5);
		g2.setColor(Color.YELLOW);
		g2.fill(ellipse5);
	}
}
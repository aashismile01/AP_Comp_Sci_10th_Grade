import java.awt.geom.Ellipse2D;
import java.awt.Graphics;
import java.awt.Graphics2D;
import javax.swing.JComponent;
import java.awt.Color;
import java.awt.BasicStroke;


public class OlympicRingsComponent extends JComponent
{
	public void paintComponent(Graphics g) 
	{
		Graphics2D g2 = (Graphics2D) g;

		Ellipse2D ellipse = new Ellipse2D.Double(245.0, 350.0, 45.0, 45.0);
		g2.setStroke(new BasicStroke(3));
		g2.setColor(Color.BLUE);
		g2.draw(ellipse);

		Ellipse2D ellipse2 = new Ellipse2D.Double(305.0, 350.0, 45.0, 45.0);
		g2.setStroke(new BasicStroke(3));
		g2.setColor(Color.BLACK);
		g2.draw(ellipse2);

		Ellipse2D ellipse3 = new Ellipse2D.Double(365.0, 350.0, 45.0, 45.0);
		g2.setStroke(new BasicStroke(3));
		g2.setColor(Color.RED);
		g2.draw(ellipse3);

		Ellipse2D ellipse4 = new Ellipse2D.Double(275.0, 370.0, 45.0, 45.0);
		g2.setStroke(new BasicStroke(3));
		g2.setColor(Color.YELLOW);
		g2.draw(ellipse4);

		Ellipse2D ellipse5 = new Ellipse2D.Double(335.0, 370.0, 45.0, 45.0);
		g2.setStroke(new BasicStroke(3));
		g2.setColor(Color.GREEN);
		g2.draw(ellipse5);
	}
}
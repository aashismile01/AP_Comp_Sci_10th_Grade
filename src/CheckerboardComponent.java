import javax.swing.JComponent;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Color;

public class CheckerboardComponent extends JComponent {
    public void paintComponent(Graphics g) {
        Graphics2D g2 = (Graphics2D) g;

        int numRows = 8;
        int numCols = 8;
        int squareSize = 20;
        Color[] squareColors = {Color.BLACK, Color.RED};

        for (int row = 0; row < numRows; row++) {
            for (int col = 0; col < numCols; col++) {
                int x = col * squareSize;
                int y = row * squareSize;
                Color squareColor = squareColors[(row + col) % 2];
                g2.setColor(squareColor);
                g2.fillRect(x, y, squareSize, squareSize);
            }
        }
    }
}

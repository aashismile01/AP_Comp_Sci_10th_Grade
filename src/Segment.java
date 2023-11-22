// Segment class
public class Segment extends SegmentTester{
    private int x1, y1, x2, y2;

    // Constructor
    public Segment(int x1, int y1, int x2, int y2) {
        this.x1 = x1;
        this.y1 = y1;
        this.x2 = x2;
        this.y2 = y2;
    }

    // Method to calculate and return the slope
    public double calculateSlope() {
        return (double)(y2 - y1) / (x2 - x1);
    }

    // Method to calculate and return the length
    public double calculateLength() {
        return Math.sqrt(Math.pow(x2 - x1, 2) + Math.pow(y2 - y1, 2));
    }

    // Method to calculate and return the midpoint as a string
    public String calculateMidpoint() {
        int midX = (x1 + x2) / 2;
        int midY = (y1 + y2) / 2;
        return "(" + midX + "," + midY + ")";
    }
}


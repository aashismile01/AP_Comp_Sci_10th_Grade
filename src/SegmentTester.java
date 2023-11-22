//Scanner class
import java.util.Scanner;

public class SegmentTester {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter x1: ");
        int x1 = scanner.nextInt();
        System.out.print("Enter y1: ");
        int y1 = scanner.nextInt();
        System.out.print("Enter x2: ");
        int x2 = scanner.nextInt();
        System.out.print("Enter y2: ");
        int y2 = scanner.nextInt();

        Segment segment = new Segment(x1, y1, x2, y2);

        double slope = segment.calculateSlope();
        double length = segment.calculateLength();
        String midpoint = segment.calculateMidpoint();

        System.out.println("Slope: " + slope);
        System.out.println("Length: " + length);
        System.out.println("Midpoint:" + midpoint);

        scanner.close();
    }
}

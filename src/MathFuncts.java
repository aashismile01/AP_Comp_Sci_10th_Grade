import java.awt.Point;

public class MathFuncts {

	// 1. This method returns the distance between integers a and b
	public static int distance(int a, int b) {
		return Math.abs(a - b);
	}

	// 2. This method returns the maximum value of integers a and b.
	public static int maximum(int a, int b) {
		return Math.max(a, b);
	}

	// 3. This method returns the maximum value of double values a, b, and c.
	public static double maximum(double a, double b, double c) {
		return Math.max(a, Math.max(b, c));
	}

	// 4. This method will return a random integer between 9 and 12 (inclusive)
	public static int getRandomClass() {
		return (int) (Math.random() * 4) + 9;
	}

	// 5. This method will return the surface area of a sphere with a given radius
	// SA = 4PIr^2
	public static double sphereSurfaceArea(int radius) {
		return 4 * Math.PI * radius * radius;
	}

	// 6. This method will return the volume of a sphere with a given radius
	// V = 4/3PIr^3
	public static double sphereVolume(int radius) {
		return (4.0 / 3.0) * Math.PI * Math.pow(radius, 3);
	}

	// 7. This method will return the length of the hypotenuse of a right
	// triangle
	// with legs leg1 and leg2
	public static double hypotenuse(double leg1, double leg2) {
		return Math.sqrt(leg1 * leg1 + leg2 * leg2);
	}

	// 8. This method will return the length of Segment AB
	// Refer to java's Point class    
	public static double segmentLength(Point a, Point b) {
		double dx = a.getX() - b.getX();
		double dy = a.getY() - b.getY();
		return Math.sqrt(dx * dx + dy * dy);
	}

	// 9. this method will find the smallest angle (in degrees) of a right
	// triangle with base and height leg1 and leg2
	public static double getSmallestAngleOfRightTri(double leg1, double leg2) {
		double radians = Math.atan(leg1 / leg2);
		return Math.toDegrees(radians);
	}

	public static void main(String[] args) {
		System.out.println("1. DISTANCE: " + distance(-5, 8));
		System.out.println("2. MAX: " + maximum(-5, 8));
		System.out.println("3. MAX: " + maximum(-5, -8, -2));
		System.out.println("4. Random HS Class: " + getRandomClass());
		System.out.println("5. Sphere Surface Area: " + sphereSurfaceArea(9) + " sq. units");
		System.out.println("6. Sphere Volume: " + sphereVolume(2) + " cubic units");
		System.out.println("7. Hypotenuse: " + hypotenuse(7, 9));
		System.out.println("8. Segment Length: " + segmentLength(new Point(1, 3), new Point(-2, 7)));
		System.out.println("9. Smallest Acute Angle: " + getSmallestAngleOfRightTri(5, 7));
	}
}
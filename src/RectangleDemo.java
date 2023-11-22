public class RectangleDemo {
	public static void main(String args[]) {
		Rectangle r1=new Rectangle();
		Rectangle r2=new Rectangle(7, 4.5);
		r1.setLength(12);
		r1.setWidth(70);
		System.out.println("The length of rectangle 2 is "+r2.getLength());
		System.out.println("The width of rectangle 2 is "+r2.getWidth());
		System.out.println("The length of rectangle 1 is "+r1.getLength());
		System.out.println("The width of rectangle 1 is "+r1.getWidth());
		System.out.println("The area of rectangle 1 is "+r1.Area());
		System.out.println("The perimeter of rectangle 1 is "+r1.Perimeter());
		System.out.println("The area of rectangle 2 is "+r2.Area());
		System.out.println("The perimeter of rectangle 2 is "+r2.Perimeter());  
	}
}

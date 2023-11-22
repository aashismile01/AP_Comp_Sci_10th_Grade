public class Temperature {
	private double myDegrees;
	private String myScale;
	public Temperature toFahrenheit() {
		myDegrees = (9/5*(myDegrees)+18);
		myScale = "F";
		//	Temperature t1 = new Temperature(myDegrees, myScale);
		return this;
	}
}
//t1 - 40 C
//t2 == t1 : 40 C
//t3 == t2  : 20 C; t1 == t2
// t4 = t1 = 70 F : t1 = t2 = t3 = 70
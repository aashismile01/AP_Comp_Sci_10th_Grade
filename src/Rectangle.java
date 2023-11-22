public class Rectangle
{
	//Step 1: define instance variables
	//Step 2: define constructor
	//Step 3: define getters and setters

	//#access specifier - public or private
	public double length, width;

	//#these are the attributes of the Rectangle class
	//Constructors must share the name of the class
	//A constructors job is to initialize the instance variables


	//A default constructor sets all the variables to their default value
	public Rectangle() {

	}

	public Rectangle(double x, double y) {
		length=x;
		width=y;
	}

	/*#mutator "set" method
    public - access specifier
    void - return type (void means it returns no data to the
    statement that is called
    setLength - method name
    (double len) - declaration of a "parameter variable" of the
    double type
    a parameter value holds the value of an arugment that is passed to the method
    length = len; assigns the value of len to the length field  
	 */
	public void setLength (double len) {
		length=len;
	}
	public void setWidth (double wid) {
		width=wid;
	}


	/*#
	 * accessor "get" method
	 * code for methods getLength & getWidth
	 *
	 * Note there is not void in the header
	 *      this means the method returns a double
	 * Note no parameters variables are named
	 *      this means the method does not accept arguments
	 *      
	 */
	public double getLength() {
		return length;
	}
	public double getWidth() {
		return width;
	}

	/*#
	 * The Area and Perimeter methods returns the value of the length
	 *      field times the width field and the sum of 2L and 2W respectively
	 */
	public double Area(){
		return (length*width);
	}
	public double Perimeter(){
		return ((2*length)+(2*width));
	}
}
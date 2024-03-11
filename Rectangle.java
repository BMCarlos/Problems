public class Rectangle
{
	private double width = 1;
	private double height = 1;

	    public Rectangle()
	    {

	    }

	    public Rectangle(double newWidth, double newHeight) {
	        width = newWidth;
	        height = newHeight;
	    }

	    public double getArea() {
	        return width * height;
	    }

	    public double getPerimeter() {
	        return 2 * (width + height);
	    }

	    public static void main(String[] args) {
	        Rectangle rectangle1 = new Rectangle(4, 40);
	        System.out.println("The area of a 4.0 x 40.0 Rectangle is " + rectangle1.getArea());
	        System.out.println("The perimeter of a 4.0 x 40.0 Rectangle is " + rectangle1.getPerimeter());
	        Rectangle rectangle2 = new Rectangle(3.5, 35.9);
	        System.out.println("The area of a 3.5 x 35.9 Rectangle is " + rectangle2.getArea());
	        System.out.println("The perimeter of a 3.5 x 35.9 Rectangle is " + rectangle2.getPerimeter());
    }

}
/*
Two double data fields named width and height that specify the width and height of the rectangle. The default values are 1 for both width and height.

A no-arg constructor that creates a default rectangle.

A constructor that creates a rectangle with the specified width and height.

A method named getArea() that returns the area of this rectangle.

A method named getPerimeter() that returns the perimeter.
*/
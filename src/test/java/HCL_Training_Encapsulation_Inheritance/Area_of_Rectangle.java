//Build the classes Shape and Rectangle. 
//Define length and breadth in Class shape and Extent Rectangle to Shape. 
//In Rectangle create local variable area and create a function calcualteArea() and define area = length*breadth.
//Length and Breadth values should be extended from Class shape.

package HCL_Training_Encapsulation_Inheritance;



class Shape {
    protected double length;
    protected double breadth;

 public Shape(double length, double breadth) {
        this.length = length;
        this.breadth = breadth;
    }
}

class Rectangle extends Shape {
    private double area;

    public Rectangle(double length, double breadth) {
        super(length, breadth);
        calculateArea();
    }

    public void calculateArea() {
        area = length * breadth;
    }

    public double getArea() {
        return area;
    }
}


public class Area_of_Rectangle {
	 public static void main(String[] args) {
	        Rectangle rectangle = new Rectangle(10, 20);
	        System.out.println("The Area of rectangle of length " + rectangle.length + " and breadth " +
	                rectangle.breadth + " is " + rectangle.getArea());
	    }
}

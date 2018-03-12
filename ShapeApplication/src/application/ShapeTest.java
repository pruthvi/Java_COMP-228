package application;

public class ShapeTest {

	public static void main(String[] args) {

		
		//Declarations and Initialization
		
		
		// Shape standardShape = new Shape("Standard Shape", "Blue");
		Circle standardShape = new Circle("Standard Shape", "Blue", 6);

		Circle defaultCircle = new Circle("Default Circle", "Magenta", 5.5);
		Cylinder smallCylinder = new Cylinder("Small Cylinder", "White", 1,1);
		
		
		//Declare an Array of Shapes
		Shape[] shapeList = new Shape[3];
		
		//Initialize the elements of the Array
		shapeList[0] = standardShape;
		shapeList[1] = defaultCircle;
		shapeList[2] = smallCylinder;

		int count = 0;

		
		//print the elements of the array
		for(Shape shape : shapeList)
		{
			
			System.out.println((++count )+ ": " + shape.toString());
		}
		

		

		//print values - shape
		System.out.println("Shape is : " + standardShape);		//standardShape.toString();


		//print values - circle
		System.out.println("Circle is : " + defaultCircle);
		System.out.printf("Area of Circle %.2f", defaultCircle.calcArea());
		
		
		
	}

}

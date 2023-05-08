public class SquareTest {
	
	public class Main SquareTest  {
		
		public static void main(String[] args) {
			Square c1 = new Square();
			double area = c1.getArea();
			double diameter = c1.getDiameter();
			double perimeter = c1.getPerimeter();
			
			System.out.println("My square c1 has an area of : " + area + " diameter of " + diameter + " and perimeter" + perimeter);
		}
	}

	class Square {

		double a;
		final static double PI = Math.PI;
		
		public Square() {
			a = 5;
		}
		
		public Square(double r) {
			a = r;
		}
		
		double getPerimeter() {
			return 4.0 * a;
		}
		
		double getArea() {
			return a * a;
		}
		
		double getDiameter() {
			return Math.sqrt(2) * a;
		}
	}

	
	
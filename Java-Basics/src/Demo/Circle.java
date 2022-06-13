package Demo;

public class Circle {
	
	double radius;
	static double pi = 3.14;
	
	public void area() {
		double area = pi*radius*radius;
		System.out.println("area of circle : " +area);
	}
	public void circumference() {
		double circumference = 2*pi*radius;
		System.out.println("circumference of circle : "+circumference);
	}

}

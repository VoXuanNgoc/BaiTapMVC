package oopEx_1;

public class Bai1_2 {
	private double radius;
	public Bai1_2() {
		radius = 1.0;
	}
	public Bai1_2(double radius) {
		this.radius=radius;
	}
	public double getRadius() {
		return radius;
	}
	public void setRadius(double radius) {
		this.radius = radius;
	}
	public double getArea() {
		return Math.PI*radius*radius;
	}
	public double getCircumference() {
		return 2*Math.PI*radius;
	}
	@Override
	public String toString() {
		return "Circle [radius=" + radius + "]";
	}
	public static void main(String[] args) {
		Bai1_2 c1 = new Bai1_2();
		System.out.println(c1);   // toString()
	    Bai1_2 c2 = new Bai1_2(); // default constructor
	    System.out.println(c2);

	    
	    c1.setRadius(2.2);
	    System.out.println(c1);      // toString()
	    System.out.println("radius is: " + c1.getRadius());

	      // Test getArea() and getCircumference()
	    System.out.printf("area is: %.2f%n", c1.getArea());
	    System.out.printf("circumference is: %.2f%n", c1.getCircumference());
	   }
	
}

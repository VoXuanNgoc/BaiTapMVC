package oopEx_1;

public class Bai1_1 {
	private double radius = 1.0;
	private String color = "red";
	public Bai1_1() {
		radius = 1.0;
		color = "red";
	}
	public Bai1_1(double r) {
		this.radius=r;
		color = "red";
	}
	public double getRadius() {
		return radius;
	}
	public double getArea()
	{
		return Math.PI*radius*radius;
	}
	public static void main(String[] args) {
		Bai1_1 c1 = new Bai1_1();
		System.out.println("The circle has radius of " 
		         + c1.getRadius() + " and area of " + c1.getArea());
		Bai1_1 c2 = new Bai1_1(2.0);
		 System.out.println("The circle has radius of " 
		         + c2.getRadius() + " and area of " + c2.getArea());
	}
	@Override
	public String toString() {
		return "Bai1_1 [radius=" + radius + ", color=" + color + "]";
	}
	public void setRadius(double radius) {
		this.radius = radius;
	}
	public void setColor(String color) {
		this.color = color;
	}
}

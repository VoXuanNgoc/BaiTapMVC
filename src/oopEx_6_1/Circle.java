package oopEx_6_1;

public class Circle extends Shape {

	protected double radius = 1.0;
	public Circle() {
		
	}
	public Circle(double radius) {
		this.radius = radius;
	}
	public Circle(double radius, String color, boolean filled) {
		this.color=color;
		this.filled=filled;
		this.radius=radius;
	}
	public double getRadius() {
		return radius;
	}
	public void setRadius(double radius) {
		this.radius = radius;
	}
//	public boolean isFilled() {
//		return 
//	}
	@Override
	public String toString() {
		return "Circle [Shape[" +"color=" + color + ", filled=" + filled + "],radius="+radius+"]";
	}
	@Override
	public double getArea() {
		// TODO Auto-generated method stub
		return Math.PI*radius*radius;
	}
	@Override
	public double getPerimeter() {
		// TODO Auto-generated method stub
		return Math.PI*2*radius;
	}
	
}

package oopEx_6_1;

abstract class  Shape {
	public abstract double getArea();
	public abstract double getPerimeter();
	public abstract double getRadius();
	protected String color = "red";
	protected Boolean filled = true;
	public Shape() {
		
	}
	public Shape(String color, boolean filled) {
		this.color=color;
		this.filled=filled;
	}
	public String getColor() {
		return color;
	}
	public void setColor(String color) {
		this.color = color;
	}
	public Boolean getFilled() {
		return filled;
	}
	public void setFilled(Boolean filled) {
		this.filled = filled;
	}
	@Override
	public String toString() {
		return "Shape [color=" + color + ", filled=" + filled + "]";
	}
	
	
}

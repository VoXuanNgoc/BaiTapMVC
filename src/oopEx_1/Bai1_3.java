package oopEx_1;

public class Bai1_3 {
	float length ;
	float width ;
	float area, perimeter;

public Bai1_3() // constructor mẹc định
{
	length = 1.0f;
	width = 1.0f;
	Area();
	Perimeter();
}
public Bai1_3(float l,float w) // tùy chỉnh 
{
	length = l;
	width = w;
	Area();
	Perimeter();
}
public void Area()
{
	area = length*width;
	// return area;
}
public void Perimeter()
{
	perimeter = 2*(length + width);
	// return perimeter;
}
public static void main(String[] args) {
	// constructer
// không thay đổi
		Bai1_3 r1 = new Bai1_3(); // tạo 1 đối tượng để keo gọi các giá trị 
	System.out.println(r1);
// thay đổi
		Bai1_3	r2 = new Bai1_3 (1.2f, 3.4f); 
    System.out.println(r2); 
    r1.setLength(3.0f);
    r1.setWidth(4.0f);
    System.out.println(r1); 
    System.out.println("length is: " + r1.getLength());
    System.out.println("width is: " + r1.getWidth());
    System.out.printf("area is: %.2f%n", r1.getArea());
    System.out.printf("perimeter is: %.2f%n", r1.getPerimeter());


}
@Override
// in ra theo định dạng
public String toString() {
	return "Rectangle [length=" + length + ", width=" + width + "]";
}
public float getLength() {
	return length;
}
public void setLength(float l) {
	length = l;
	// sau khi chỉnh sửa thì cập nhật diện tích và chu vi
	Area();
	Perimeter();
}
public float getWidth() {
	return width;
}
public void setWidth(float w) {
	width = w;
	// sau khi chỉnh sửa thì cập nhật diện tích và chu vi
	Area();
	Perimeter();
}
public float getArea() {
	return area;
}
public void setArea(float area) {
	this.area = area;
}
public float getPerimeter() {
	return perimeter;
}
public void setPerimeter(float perimeter) {
	this.perimeter = perimeter;
}
}

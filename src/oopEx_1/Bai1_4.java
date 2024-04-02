package oopEx_1;

public class Bai1_4 {
	int id;
	String firstName;
	String lastName;
	int salary;
public Bai1_4(int id, String firstName, String lastName, int salary)
{
	this.id = id;
	this.firstName = firstName;
	this.lastName = lastName;
	this.salary = salary;
}
public int getId() {
	return id;
}
public void setId(int id) {
	this.id = id;
}
public String getFirstName() {
	return firstName;
}
public void setFirstName(String firstName) {
	this.firstName = firstName;
}
public String getLastName() {
	return lastName;
}
public void setLastName(String lastName) {
	this.lastName = lastName;
}
public String getName()
{
	return firstName + lastName;
}
public int getSalary() {
	return salary;
}
public void setSalary(int salary) {
	this.salary = salary;
}
public int getAnnualSalary()
{
	return salary*12;
}
/// coi lại nhé
public int raiseSalary(int percent)
{
	double a = (double)percent/100;
	 double raise = this.salary*a;
	 return ((int)raise+this.salary);
}
@Override
public String toString() {
	return "Employee [id=" + id + ", name=" + firstName + lastName + ", salary=" + salary + "]";
}
public static void main(String[] args) {
	Bai1_4 e1 = new Bai1_4(8, "Peter ", "Tan", 2500);
	 
	  System.out.println(e1);  
	  
	  e1.setSalary(999);
      System.out.println(e1);  // toString();
      System.out.println("id is: " + e1.getId());
      System.out.println("firstname is: " + e1.getFirstName());
      System.out.println("lastname is: " + e1.getLastName());
      System.out.println("salary is: " + e1.getSalary());

      System.out.println("name is: " + e1.getName());
      System.out.println("annual salary is: " + e1.getAnnualSalary()); // Test method

      System.out.println(e1.raiseSalary(10));
      System.out.println(e1);
}
	
}

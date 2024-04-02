package bt1_;

public class Employee extends Person {
 

	public Employee(String name, int age, String adress, int salary, int rate) 
	{
		super(name, age, adress);
		this.rate=rate;
		this.salary = salary;
	}
	private int salary;
	private int rate;
	
	public int tongLuong()
	{
		return salary * rate;
	}

	public int getSalary() {
		return salary;
	}

	public void setSalary(int salary) {
		this.salary = salary;
	}

	public int getRate() {
		return rate;
	}

	public void setRate(int rate) {
		this.rate = rate;
	}
	@Override
	public String toString() {
		return "Name=" + name + ", age=" + age + ", adress=" + adress + ", Total = "+tongLuong();
	}
}

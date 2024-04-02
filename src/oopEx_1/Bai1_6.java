package oopEx_1;

public class Bai1_6 {

	String id;
	String name;
	int balance = 0;
	public Bai1_6(String id, String name)
	{
		this.id = id;
		this.name = name;
		
	}
	public Bai1_6(String id, String name, int balance)
	{
		this.id = id;
		this.name = name;
		this.balance = balance;
	}
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getBalance() {
		return balance;
	}
	public void setBalance(int balance) {
		this.balance = balance;
	}
	public int credit(int amount) {
		balance += amount;
		return balance;
		
	}
	public int debit(int amount) {
		if(amount<=balance) {
			balance -= amount;
			return balance;
		}else {
			System.out.println("Amount exceeded balance");
			return balance;
		}
	}
	public int transferTo(Bai1_6 another, int amount) {
		if(amount<=balance) {
			balance -= amount;
			another.credit(amount);
			return balance;
		}
		else {
			System.out.println("Amount exceeded balance");
			return balance;
		}
	}
	@Override
	public String toString() {
		return "Account [id=" + id + ", name=" + name + ", balance=" + balance + "]";
	}
	public static void main(String[] args) {
		Bai1_6 a1 = new Bai1_6("A101", "Tan Ah Teck", 88);
		System.out.println(a1);
		Bai1_6 a2 = new Bai1_6("A102", "Kumar");
		System.out.println(a2);
		
		System.out.println("ID: " + a1.getId());
	    System.out.println("Name: " + a1.getName());
	    System.out.println("Balance: " + a1.getBalance());
	    a1.credit(100);
	    System.out.println(a1);
	    a1.debit(50);
	    System.out.println(a1);
	    a1.debit(500);  // debit() error
	    System.out.println(a1);
	      // Test transfer()
	    a1.transferTo(a2, 100);  // toString()
	    System.out.println(a1);
	    System.out.println(a2);
	}
}

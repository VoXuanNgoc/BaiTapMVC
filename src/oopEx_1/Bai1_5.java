package oopEx_1;

import bt2.Quanlisv;

public class Bai1_5 {
	String id;
	String desc;
	int qty;
	double unitPrice;
	public Bai1_5(String id, String desc, int qty, double unitPrice)
	{
		this.desc = desc;
		this.id = id;
		this.qty = qty;
		this.unitPrice = unitPrice;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getDesc() {
		return desc;
	}

	public void setDesc(String desc) {
		this.desc = desc;
	}

	public int getQty() {
		return qty;
	}

	public void setQty(int qty) {
		this.qty = qty;
	}

	public double getUnitPrice() {
		return unitPrice;
	}

	public void setUnitPrice(double unitPrice) {
		this.unitPrice = unitPrice;
	}
	public double getTotal()
	{
		return unitPrice*qty;
	}
	@Override
	public String toString() {
		return "InvoiceItem [id=" + id + ", desc=" + desc + ", qty=" + qty + ", unitPrice=" + unitPrice + "]";
	}

	public static void main(String[] args) {
		Bai1_5 inv1 = new Bai1_5("A101", "Pen Red", 888, 0.08);
	    System.out.println(inv1); 
	    
	    inv1.setQty(999);
	    inv1.setUnitPrice(0.99);
	    System.out.println(inv1);  
	    System.out.println("id is: " + inv1.getId());
	    System.out.println("desc is: " + inv1.getDesc());
	    System.out.println("qty is: " + inv1.getQty());
	    System.out.println("unitPrice is: " + inv1.getUnitPrice());
	    
	    System.out.println("The total is: " + inv1.getTotal());

	}
}

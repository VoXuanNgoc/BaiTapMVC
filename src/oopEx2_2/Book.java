package oopEx2_2;

import java.util.Arrays;

public class Book {
	private String name;
	private Author[] authors;
	private double price;
	private int qty=0;
	public Book(String name,Author[] authors, double price) {
		this.name=name;
		this.authors=authors;
		this.price=price;
	}
	public Book(String name,Author[] authors, double price, int qty) {
		this.name=name;
		this.authors=authors;
		this.price=price;
		this.qty=qty;
	}
	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		this.price = price;
	}
	public int getQty() {
		return qty;
	}
	public void setQty(int qty) {
		this.qty = qty;
	}
	public Author[] getAuthors() {
		return authors;
	}
	@Override
	public String toString() {
		return "Book [name=" + name + ", authors={Author[name=" + Arrays.toString(authors) + ", price=" + price + ", qty=" + qty
				+ "]";
	}
	public static void main(String[] args) {
		// Declare and allocate an array of Authors
		Author[] authors = new Author[2];
		authors[0] = new Author("Tan Ah Teck", "AhTeck@somewhere.com", 'm');
		authors[1] = new Author("Paul Tan", "Paul@nowhere.com", 'm');

		// Declare and allocate a Book instance
		Book javaDummy = new Book("Java for Dummy", authors, 19.99, 99);
		System.out.println(javaDummy);  // toString()

	}
	
}
